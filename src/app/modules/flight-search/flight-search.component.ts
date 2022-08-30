import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AirlinesService } from 'src/app/airlines.service';
import { FlightDetails } from './flight-details';

@Component({
  selector: 'app-flight-search',
  templateUrl: './flight-search.component.html',
  styleUrls: ['./flight-search.component.css']
})
export class FlightSearchComponent implements OnInit {

  constructor(private regService: AirlinesService, private route: Router) { }

  listItem:any=[];

  source:string="";
  destination:string="";

  fd: FlightDetails = new FlightDetails();

  listData(){
    this.regService.List(this.source, this.destination).subscribe((response)=>{
      this.listItem=response
    }); 
  }


  ngOnInit(): void {
  }

}

