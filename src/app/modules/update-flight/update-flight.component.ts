import { Component, OnInit } from '@angular/core';
import { AirlinesService } from 'src/app/airlines.service';
import { Router } from '@angular/router';
import { FlightDetails } from '../flight-search/flight-details';

@Component({
  selector: 'app-update-flight',
  templateUrl: './update-flight.component.html',
  styleUrls: ['./update-flight.component.css']
})
export class UpdateFlightComponent implements OnInit {
  constructor(private airService:AirlinesService,private router:Router) { }

  listItem:any=[];

  flight:FlightDetails = new FlightDetails();

  addflight()
  {
    this.airService.updateFlight(this.flight).subscribe((response)=>{});
    this.router.navigate(['adminhome']);
  }

  listAllFlights(){
    this.airService.ListAllFlights().subscribe((response)=>{
      this.listItem=response;
    }); 
  }

  ngOnInit(): void {
    this.flight.available_seats=30;
    this.flight.retruning="Yes";
    this.flight.cost="20000";
  }
}
