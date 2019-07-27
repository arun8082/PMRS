import { Component, OnInit } from '@angular/core';
import { Mentor } from './Mentor';

@Component({
  selector: 'app-mentorlist',
  templateUrl: './mentorlist.component.html',
  styleUrls: ['./mentorlist.component.css']
})
export class MentorlistComponent implements OnInit {

  constructor() { }

 
  flagTable=true;
  public list:Mentor[]=[{FirstName:"mnhs",LastName:"Rajan",Email:"abc@gfs",Contact:"111111",Status:"Active"},
 {FirstName:"djsd",LastName:"Rajan",Email:"abc@gfs",Contact:"111111",Status:"active"},
 {FirstName:"dnskn",LastName:"Rajan",Email:"abc@gfs",Contact:"111111",Status:"Inactive"}];

  ngOnInit() {
  }

}
