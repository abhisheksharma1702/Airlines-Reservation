import { Component, OnInit } from '@angular/core';
import { AirlinesService } from 'src/app/airlines.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admin-home',
  templateUrl: './admin-home.component.html',
  styleUrls: ['./admin-home.component.css']
})
export class AdminHomeComponent implements OnInit {

  constructor(private regService: AirlinesService, private route: Router) { }

  listItem:any=[];

  source:string="";
  destination:string="";

  listData(){
    this.regService.List(this.source, this.destination).subscribe((response)=>{
      this.listItem=response
    }); 
  }
  
  ngOnInit(): void {
  }

}
