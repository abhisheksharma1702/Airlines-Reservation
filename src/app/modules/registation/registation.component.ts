import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import {  Registation } from './registation';
import { AirlinesService } from 'src/app/airlines.service';

@Component({
  selector: 'app-registation',
  templateUrl: './registation.component.html',
  styleUrls: ['./registation.component.css']
})

export class RegistationComponent implements OnInit {

  constructor(private regService:AirlinesService,private router:Router){}

  registerForm:FormGroup;
  reg:Registation= new Registation();

  addReg()
  {
    this.regService.saveReg(this.reg).subscribe(data=>
      {this.router.navigate(['login/userlogin']);})
  }
  onReset()
  {
    this.onReset;
  }
  confirmPassword()
  {
  
  }
  ngOnInit(): void {
  }

}
