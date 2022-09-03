import { Component, OnInit } from '@angular/core';
import { AirlinesService } from 'src/app/airlines.service';
import { Router } from '@angular/router';
import { MailDetails } from './mail-details';

@Component({
  selector: 'app-forgotpassword',
  templateUrl: './forgotpassword.component.html',
  styleUrls: ['./forgotpassword.component.css']
})
export class ForgotpasswordComponent implements OnInit {

  constructor(private airSer:AirlinesService, private route:Router) { }

  mail: MailDetails = new MailDetails();
  userMail:string;

  email(){
      this.mail.recipient=this.userMail;
      alert("Check your email inbox!!");
      this.airSer.mail(this.mail.recipient).subscribe((response)=>{
      }); 
  }

  ngOnInit(): void {}

}
