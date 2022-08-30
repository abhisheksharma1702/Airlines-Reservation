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

  passanger:PassengerDetails=new PassengerDetails();

  addPassenger()
  {
    this.airService.savePassenger(this.passanger).subscribe(data=>
      {
        this.passanger = new PassengerDetails();
        this.route.navigate(['userhome/booktickets/seat-select/passenger/payment']);
      });
    
    
  }

  ngOnInit(): void {
    this.passanger.seatNumber=this.airService.selectedSeat;
    this.passanger.ticketid=this.airService.ticketid;
  }

}
