import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { MatSelectModule } from '@angular/material/select';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FlightSearchComponent } from './modules/flight-search/flight-search.component';
// import { SeatSelectComponent } from './modules/seat-select/seat-select.component';
import { AddFlightComponent } from './modules/add-flight/add-flight.component';
import { BookTicketsComponent } from './modules/book-tickets/book-tickets.component';
import { LoginComponent } from './modules/login/login.component';
import { UserloginComponent } from './modules/userlogin/userlogin.component';
import { AdminHomeComponent } from './modules/admin-home/admin-home.component';
import { HomeComponent } from './modules/home/home.component';
import { UserHomeComponent } from './modules/user-home/user-home.component';
import { DeleteflightComponent } from './modules/deleteflight/deleteflight.component';
import { RegistationComponent } from './modules/registation/registation.component';
import { PassengerComponent } from './modules/passenger/passenger.component';
import { PaymentComponent } from './modules/payment/payment.component';
import { AdminloginComponent } from './modules/adminlogin/adminlogin.component';
import { CancelTicketComponent } from './modules/cancel-ticket/cancel-ticket.component';
import { SeatComponent } from './modules/seat/seat.component';
import { TicketComponent } from './modules/ticket/ticket.component';
import { UpdateFlightComponent } from './modules/update-flight/update-flight.component';
import { ChangepasswordComponent } from './modules/changepassword/changepassword.component';
import { ForgotpasswordComponent } from './modules/forgotpassword/forgotpassword.component';

@NgModule({
  declarations: [
    AppComponent,
    FlightSearchComponent,
    // SeatSelectComponent,
    AddFlightComponent,
    BookTicketsComponent,
    LoginComponent,
    UserloginComponent,
    HomeComponent,
    AdminHomeComponent,
    UserHomeComponent,
    DeleteflightComponent,
    RegistationComponent,
    PassengerComponent,
    PaymentComponent,
    AdminloginComponent,
    CancelTicketComponent,
    SeatComponent,
    TicketComponent,
    UpdateFlightComponent,
    ChangepasswordComponent,
    ForgotpasswordComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    MatSelectModule,
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
