import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AirlinesService } from 'src/app/airlines.service';

@Component({
  selector: 'app-adminlogin',
  templateUrl: './adminlogin.component.html',
  styleUrls: ['./adminlogin.component.css']
})
export class AdminloginComponent implements OnInit {

  constructor(private regService: AirlinesService, private route: Router) { }

  listItem: any =[];
  email: string;
  password: string;

  Alogin(){
    this.regService.adminLogin(this.email, this.password).subscribe((response)=>{
      this.listItem=response;
      if(this.listItem.length)
      {
        this.route.navigate(["/adminhome"]);
      }
      else{
        alert("Wrong Admin Details");
      }
    }); 
  }

  ngOnInit(): void {
  }

}
