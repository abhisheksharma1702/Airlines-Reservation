import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AirlinesService } from 'src/app/airlines.service';
import { User } from './user';

@Component({
  selector: 'app-userlogin',
  templateUrl: './userlogin.component.html',
  styleUrls: ['./userlogin.component.css']
})
export class UserloginComponent implements OnInit {

  constructor(private regService: AirlinesService, private route: Router) { }

  listItem:any = [];
  email:string;
  password:string;
  user :User = {"id": 0, "title":"", "firstName":"", "lastName":"", "email": "", "password":"", "dob": "", "phoneNumber":""};;

  login(){
    this.regService.login(this.email, this.password).subscribe((response)=>{
      this.listItem=response;
      if(this.listItem.length)
      {
        this.route.navigate(["/userhome"]);
        this.user = this.listItem[0];
        this.regService.setUser(this.user);
      }
    }); 
  }

  ngOnInit(): void {
  }

}


