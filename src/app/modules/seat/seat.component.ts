import { Component, OnInit } from '@angular/core';
import { AirlinesService } from 'src/app/airlines.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-seat',
  templateUrl: './seat.component.html',
  styleUrls: ['./seat.component.css']
})
export class SeatComponent implements OnInit {

  constructor(private seatService:AirlinesService,private router:Router) { }

  number:string;

  flightid:number;

  lastSelectedSeat: string = null;

  Dummyarray: any = []

  ngOnInit(): void {

      this.flightid=this.seatService.slectedFlight;
      this.seatService.availableFlightSeat(this.flightid).subscribe((response)=>{
        this.Dummyarray=response
      }); 
    
  }

  save(number:string){

      if(this.lastSelectedSeat){
        const btn = document.getElementById(this.lastSelectedSeat);
        btn.style.backgroundColor="white";
      }

      const btn = document.getElementById(number);
      btn.style.backgroundColor="red";
      btn.style.color="black";
      this.number=number;
      this.lastSelectedSeat=number;
  }

  bookSeat()
  {
    this.seatService.selectedSeat=this.number;
    this.flightid=this.seatService.slectedFlight;
    console.log();
    this.seatService.bookSeat(this.number,this.flightid).subscribe(data=>
    {this.router.navigate(['/userhome/booktickets/seat-select/passenger']);})
  }
}
