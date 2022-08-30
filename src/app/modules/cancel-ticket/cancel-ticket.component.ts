import { Component, OnInit } from '@angular/core';
import { AirlinesService } from 'src/app/airlines.service';
import { Router } from '@angular/router';
import { TicketDetails } from '../book-tickets/ticket-details';

@Component({
  selector: 'app-cancel-ticket',
  templateUrl: './cancel-ticket.component.html',
  styleUrls: ['./cancel-ticket.component.css']
})
export class CancelTicketComponent implements OnInit {

  constructor(private regService: AirlinesService, private route: Router) { }

  id : number;
  list: any = [];

  cancelTicket(){
    this.list.ticketid=this.id;
    this.regService.cancelTicket(this.id, this.list).subscribe();
    this.route.navigate(['userhome']);
  }

  ngOnInit(): void {
  }

}
