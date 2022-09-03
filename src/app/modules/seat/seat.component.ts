import { Component, OnInit } from '@angular/core';
import { AirlinesService } from 'src/app/airlines.service';
import { Router } from '@angular/router';
import { Seat } from './seat';

@Component({
  selector: 'app-seat',
  templateUrl: './seat.component.html',
  styleUrls: ['./seat.component.css']
})
export class SeatComponent implements OnInit {

  constructor(private seatService:AirlinesService,private router:Router) { }

  number:string;

  flightid:number;

  Dummyarray: any = []

  list : any = [];

  id : string;

  ngOnInit(): void {
      this.flightid=this.seatService.slectedFlight;
      this.seatService.availableFlightSeat(this.flightid).subscribe((response)=>{
        this.Dummyarray =  response;
      }); 
  }

  save(number:string){

      if(this.list.includes(number)===false){
        
        if(this.list.length < this.seatService.totalPassenger)
        {
          this.list.push(number);
          const btn = document.getElementById(number);
          btn.style.backgroundColor="red";
          btn.style.color="black";
        }
        else{
          alert("Cannot select more seats");
        }
      }

  }

  bookSeat()
  {
    this.seatService.selectedSeat=this.list;
    this.flightid=this.seatService.slectedFlight;

    for(var l of this.list){
      this.seatService.bookSeat(l,this.flightid).subscribe(data=>
      {
      this.router.navigate(['/userhome/booktickets/seat-select/passenger']);
      })
    }
    
  }
}
