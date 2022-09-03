import { Component, OnInit } from '@angular/core';
import { AirlinesService } from 'src/app/airlines.service';
import { Router } from '@angular/router';
import { MailDetails } from '../forgotpassword/mail-details';
import { PassengerDetails } from '../passenger/passenger-details';

@Component({
  selector: 'app-ticket',
  templateUrl: './ticket.component.html',
  styleUrls: ['./ticket.component.css']
})
export class TicketComponent implements OnInit {

  t: any = [];

  p: any = [];

  f: any =[];
  
  x: number = 1;

  constructor(private regService: AirlinesService, private route: Router) { }

  mail: MailDetails = new MailDetails();

  email(){
      for(let l of this.p){
        this.mail.msgBody= this.mail.msgBody + "\n \n Ticket Detail For Passenger " + this.x + "\n" + " FlightID - " + this.t.flightId + "\n Passenger Name - "+ l.name + "\n PNR Number - "+ l.seatNumber + this.t.ticketid + "\n Journey Date - " + this.f.journey_date + "\n" + " Departure Airport - " + this.f.source;
        this.x=this.x+1;
      }
      this.regService.mailTicket(this.mail).subscribe((response)=>{
        alert("Sent");
      });
  }
  
  listData(){
    this.regService.Ticket(this.regService.ticketid).subscribe((response)=>{
      this.t=response;
      this.FlightDetail();
    }); 
  }

  FlightDetail(){
    this.regService.FlightDetail(this.t.flightId).subscribe((response)=>{
      this.f=response;
      this.email();
    }); 
  }

  ngOnInit(): void {
    this.mail.msgBody=" ";
    this.mail.recipient=this.regService.user.email;
    this.mail.subject="Wing Airlines";
    this.listData();
    this.p=this.regService.passengerDetails;
    console.log(this.t.passengerList);
  }

}
