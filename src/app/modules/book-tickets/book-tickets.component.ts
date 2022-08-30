import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AirlinesService } from 'src/app/airlines.service';
import { TicketDetails } from './ticket-details';

@Component({
  selector: 'app-book-tickets',
  templateUrl: './book-tickets.component.html',
  styleUrls: ['./book-tickets.component.css']
})
export class BookTicketsComponent implements OnInit {

  constructor(private airService: AirlinesService, private route: Router) { }

  listItem:any=[];

  ticket: TicketDetails = new TicketDetails();


  addTicket()
  {
    this.airService.slectedFlight=this.ticket.flightId;
    this.ticket.no_of_pasanger=1;
    this.airService.saveTicket(this.ticket).subscribe((response)=>
      {
        this.airService.ticketid=Number(response);
        this.airService.paymentAmt=this.ticket.ticket_amount;
        this.ticket = new TicketDetails();
        this.route.navigate(['userhome/booktickets/seat-select']);
      });
  }

  listAllFlights(){
    this.airService.ListAllFlights().subscribe((response)=>{
      this.listItem=response;
    }); 
  }
  
  ngOnInit(): void {
    this.ticket.status="Pending";
    const now = new Date();
    this.ticket.date_of_booking=now.toLocaleDateString();
    this.ticket.no_of_pasanger=1;
    this.ticket.userid = this.airService.user.id;
  }

  calculateTicketAmt(){
    if(this.ticket.type_of_ticket==="Business")
    {
      this.ticket.ticket_amount = String(this.ticket.no_of_pasanger*1500);
    }
    else{
      this.ticket.ticket_amount = String(this.ticket.no_of_pasanger*1000);;
    }
  }
}
