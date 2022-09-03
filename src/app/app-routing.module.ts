import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FlightSearchComponent } from './modules/flight-search/flight-search.component';
import { AddFlightComponent } from './modules/add-flight/add-flight.component';
import { LoginComponent } from './modules/login/login.component';
import { UserloginComponent } from './modules/userlogin/userlogin.component';
import { AdminloginComponent } from './modules/adminlogin/adminlogin.component';
import { AdminHomeComponent } from './modules/admin-home/admin-home.component';
import { HomeComponent } from './modules/home/home.component';
import { UserHomeComponent } from './modules/user-home/user-home.component';
import { DeleteflightComponent } from './modules/deleteflight/deleteflight.component';
import { ForgotpasswordComponent } from './modules/forgotpassword/forgotpassword.component';
import { RegistationComponent } from './modules/registation/registation.component';
import { BookTicketsComponent } from './modules/book-tickets/book-tickets.component';
import { PassengerComponent } from './modules/passenger/passenger.component';
import { PaymentComponent } from './modules/payment/payment.component';
import { CancelTicketComponent } from './modules/cancel-ticket/cancel-ticket.component';
import { SeatComponent } from './modules/seat/seat.component';
import { TicketComponent } from './modules/ticket/ticket.component';
import { UpdateFlightComponent } from './modules/update-flight/update-flight.component';
import { ChangepasswordComponent } from './modules/changepassword/changepassword.component';

const routes: Routes = [
  {path: 'userhome/flight-search', component:  FlightSearchComponent},
  {path: 'userhome/booktickets/seat-select', component: SeatComponent},
  {path: 'adminhome/add-flight', component: AddFlightComponent},
  {path: 'adminhome/update-flight', component: UpdateFlightComponent},
  {path:'login', component: LoginComponent},
  {path: 'login/userlogin', component: UserloginComponent},
  {path:'login/adminlogin', component:AdminloginComponent},
  {path:'adminhome', component:AdminHomeComponent},
  {path:'userhome', component:UserHomeComponent},
  {path:'', component:HomeComponent},
  {path:'adminhome/deleteflight',component:DeleteflightComponent},
  {path:'forgotpassword', component:ForgotpasswordComponent},
  {path: 'registation', component: RegistationComponent},
  {path: 'userhome/booktickets', component: BookTicketsComponent},
  {path: 'userhome/booktickets/seat-select/passenger', component:PassengerComponent},
  {path: 'userhome/booktickets/seat-select/passenger/payment', component:PaymentComponent},
  {path: 'userhome/cancelticket', component:CancelTicketComponent},
  {path: 'userhome/booktickets/seat-select/passenger/payment/ticket', component:TicketComponent},
  {path: 'forget_password', component:ChangepasswordComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
