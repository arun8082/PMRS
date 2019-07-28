import { Component, OnInit } from '@angular/core';
import { projectlist } from './projectlist';
import { Students } from '../student-list/Students';


@Component({
  selector: 'app-mentordashboard',
  templateUrl: './mentordashboard.component.html',
  styleUrls: ['./mentordashboard.component.css']
})
export class MentordashboardComponent implements OnInit {

  constructor() { }
  


  flagTable=true;
  flagstudentTable=false;
  
  public list:projectlist[]=[{SNo:"1", ProjectTitle:"abcdef",ProjectDescription:"abchdfdfs",ProjectTechnology:"qweety", SoftwareRequirements:"hover",HardwareRequirements:"antlantica"},
  {SNo:"1", ProjectTitle:"abcdef",ProjectDescription:"abchdfdfs",ProjectTechnology:"qweety", SoftwareRequirements:"hover",HardwareRequirements:"antlantica"},
  {SNo:"1", ProjectTitle:"abcdef",ProjectDescription:"abchdfdfs",ProjectTechnology:"qweety", SoftwareRequirements:"hover",HardwareRequirements:"antlantica"}];



  studentview:Students[]=[{ FirstName:"abcdef",LastName:"abchdfdfs",Email:"qweety", Contact:"hover",Course:"antlantica"},
  { FirstName:"abcdef",LastName:"abchdfdfs",Email:"qweety", Contact:"hover",Course:"antlantica"},
  { FirstName:"abcdef",LastName:"abchdfdfs",Email:"qweety", Contact:"hover",Course:"antlantica"},];




  ngOnInit() {
  }

  onUpdate(){

    this.flagTable=false;
     this.flagstudentTable=true;   
    
 
   }

  

}
