import { Component, OnInit } from '@angular/core';
import { PaymentDetails } from './payment-details';
import { AirlinesService } from 'src/app/airlines.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-payment',
  templateUrl: './payment.component.html',
  styleUrls: ['./payment.component.css']
})
export class PaymentComponent implements OnInit {

  constructor(private airService: AirlinesService, private route: Router) { }

  payment:PaymentDetails=new PaymentDetails();

  addPayment()
  {
    
    this.airService.confirmTicket(this.payment.ticketId).subscribe(data=>{});
    this.airService.savePayment(this.payment).subscribe(data=>
      {
        console.log(this.payment);
        this.payment = new PaymentDetails();
        this.route.navigate(['userhome']);
      });
  }

  ngOnInit(): void {
    
    this.payment.userId=this.airService.user.id;
    this.payment.ticketId=this.airService.ticketid;
    this.payment.amount=this.airService.paymentAmt;
  }

}
