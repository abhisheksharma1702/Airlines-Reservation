import { Component, OnInit } from '@angular/core';
import { AirlinesService } from 'src/app/airlines.service';
import { Router } from '@angular/router';
import { Registation } from '../registation/registation';

@Component({
  selector: 'app-changepassword',
  templateUrl: './changepassword.component.html',
  styleUrls: ['./changepassword.component.css']
})
export class ChangepasswordComponent implements OnInit {

  constructor(private airSer:AirlinesService, private route:Router) { }

  user:any= [];

  email: string;

  password : string;
  
  getUser(){ 
    this.airSer.getUser(this.email).subscribe((response)=>{
      this.user=response;
      this.user.email=this.email;
      this.user.password=this.password;
      this.updatePassword();
    }); 
  }

  updatePassword(){ 
    console.log(this.user);
    this.airSer.updatePassword(this.user).subscribe((response)=>{
      this.route.navigate(['login']);
    }); 
  }

  ngOnInit(): void {}
}
