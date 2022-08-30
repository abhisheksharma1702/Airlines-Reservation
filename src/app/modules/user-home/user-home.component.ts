import { Component, OnInit } from '@angular/core';
import { AirlinesService } from 'src/app/airlines.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-user-home',
  templateUrl: './user-home.component.html',
  styleUrls: ['./user-home.component.css']
})
export class UserHomeComponent implements OnInit {

  constructor(private regService: AirlinesService, private route: Router) { }

  userid : number;
  
  listItem:any=[];

  listData(){
    this.regService.TicketHistory(this.userid).subscribe((response)=>{
      this.listItem=response
    }); 
  }

  ngOnInit(): void {
    this.userid=this.regService.user.id;
  }

}
