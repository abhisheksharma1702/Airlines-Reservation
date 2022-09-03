import { Component, OnInit } from '@angular/core';
import { PassengerDetails } from './passenger-details';
import { AirlinesService } from 'src/app/airlines.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-passenger',
  templateUrl: './passenger.component.html',
  styleUrls: ['./passenger.component.css']
})
export class PassengerComponent implements OnInit {

  constructor(private airService: AirlinesService, private route: Router) { }
  
  n : number;

  passanger: PassengerDetails[] = [];

  p : PassengerDetails;

  addPassenger()
  {
    this.airService.savePassenger(this.passanger).subscribe(data=>
      {
        this.airService.passengerDetails=this.passanger;
        this.route.navigate(['userhome/booktickets/seat-select/passenger/payment']);
      });
  }

  ngOnInit() {
    for(var i=0;i<this.airService.totalPassenger;i++){
      this.p = new PassengerDetails();
      this.p.ticketid = this.airService.ticketid;
      this.p.seatNumber = this.airService.selectedSeat.pop();
      this.passanger.push(this.p);
    }
  }

}
