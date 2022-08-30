import { Component, OnInit } from '@angular/core';
import { FlightDetails } from '../flight-search/flight-details';
import { Router } from '@angular/router';
import { AirlinesService } from 'src/app/airlines.service';
import { Seat } from '../seat/seat';

@Component({
  selector: 'app-add-flight',
  templateUrl: './add-flight.component.html',
  styleUrls: ['./add-flight.component.css']
})
export class AddFlightComponent implements OnInit {

  constructor(private airService:AirlinesService,private router:Router) { }

  flight: FlightDetails = new FlightDetails();
  seat : Seat=new Seat();
  flightid:number;
  arr: any = ['A1','A2','A3','B1','B2','B3','C1','C2','C3','D1','D2','D3','E1','E2','E3','F1','F2','F3','G1','G2','G3','H1','H2','H3','I1','I2','I3'];
  
  addflight()
  {
      this.airService.saveFlight(this.flight).subscribe((response)=>
      {
        this.flight = new FlightDetails();
        this.flightid=Number(response);
        console.log(this.flightid);
        this.addSeats();
      });

  }

  addSeats(){
    for(var i in this.arr){
      this.seat.status=0;
      this.seat.seatNo=this.arr[i];
      this.seat.flightId=this.flightid;
      this.airService.saveSeat(this.seat).subscribe((data)=>
      {
      });
      console.log(this.seat);
      this.seat=new Seat();
    }
  }

  ngOnInit(): void {

  }
}
