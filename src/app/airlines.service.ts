import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from './modules/userlogin/user';
import { TicketDetails } from './modules/book-tickets/ticket-details';

@Injectable({
  providedIn: 'root'
})
export class AirlinesService {

  constructor(private http : HttpClient) { }

  url = "http://localhost:8089"

  userId = 0;
  user :User = {"id": 0, "title":"", "firstName":"", "lastName":"", "email": "", "password":"", "dob": "", "phoneNumber":""};;
  
  ticketid: number;

  selectedSeat: string = "0";

  slectedFlight:number = 0;

  paymentAmt: string="0";

  List(source:string, destination:string){
    return this.http.get(`${this.url+"/allFlights/"+source+"/"+destination}`); 
  }

  ListAllFlights(){
    return this.http.get(`${this.url+"/allFlights//"}`); 
  }

  saveReg(registation:Object):Observable<Object>
  {
     return this.http.post(`${this.url+"/registation"}`,registation);
  }

  login(email:string, password:string){
    return this.http.get(`${this.url+"/login/"+email+"/"+password}`);
  }

  adminLogin(name:string, password:string){
    return this.http.get(`${this.url+"/adminlogin/"+name+"/"+password}`);
  }

  setUser(user : User){
    console.log(user);
    this.user = user;
  }

  saveFlight(flight:Object):Observable<Object>
  {
     return this.http.post(`${this.url+"/addflight"}`,flight);
  }

  saveTicket(ticket:Object):Observable<Object>
  {
     return this.http.post(`${this.url+"/ticket"}`,ticket);
  }

  savePassenger(passanger:Object):Observable<Object>
  {
     return this.http.post(`${this.url+"/passanger"}`,passanger);
  }

  savePayment(payment:Object):Observable<Object>
  {
     return this.http.post(`${this.url+"/payment"}`,payment);
  }

  deleteFlight(id:number){
    return this.http.delete(`${this.url+"/deleteFlight/"+id}`);
  }

  cancelTicket(id:number, list:Object){
    return this.http.put(`${this.url+"/cancelticket/"+id}`,list);
  }

  confirmTicket(id:number){
    return this.http.put(`${this.url+"/confirmTicket/"+id}`,id);
  }

  TicketHistory(id:number){
    return this.http.get(`${this.url+"/findTicketsForUser/"+id}`); 
  }

  availableFlightSeat(id:number){
    return this.http.get(`${this.url+"/getAvailableSeatByFlight_id/"+id}`); 
  }

  saveSeat(seat:Object):Observable<Object>
  {
     return this.http.post(`${this.url+"/addSeat"}`,seat);
  }

  bookSeat(number:string,flightid:number)
  {
    return this.http.put(`${this.url+"/bookSeat/"+flightid+"/"+number}`,number);
  }
}
