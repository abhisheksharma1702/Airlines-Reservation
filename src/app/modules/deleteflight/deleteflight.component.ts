import { Component, OnInit } from '@angular/core';
import { AirlinesService } from 'src/app/airlines.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-deleteflight',
  templateUrl: './deleteflight.component.html',
  styleUrls: ['./deleteflight.component.css']
})
export class DeleteflightComponent implements OnInit {

  constructor(private regService: AirlinesService, private route: Router) { }

  id : number;

  deleteFlight(){
    this.regService.deleteFlight(this.id).subscribe();
    this.route.navigate(['adminhome']);
  }

  ngOnInit(): void {
  }

}
