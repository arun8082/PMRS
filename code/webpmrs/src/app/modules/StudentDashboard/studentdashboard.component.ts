import { Component, OnInit } from '@angular/core';
import { studentdash } from './studentdash';

@Component({
  selector: 'app-studentdashboard',
  templateUrl: './studentdashboard.component.html',
  styleUrls: ['./studentdashboard.component.css']
})
export class StudentdashboardComponent implements OnInit {

  constructor() { }
  flagTable=true;
  flagstudentTable=false;
  public slist:studentdash[]=[{SNo:"1", projecttitle:"abcdef",projectstatus:"qweety"},
  {SNo:"1", projecttitle:"abcdef",projectstatus:"qweety"},
  {SNo:"1", projecttitle:"abcdef",projectstatus:"qweety"}];

  ngOnInit() {
  }

}
