import { Component, OnInit } from '@angular/core';
import { RegisterService } from 'src/app/core/services/register.service';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {

  studentArray=[{}];
  constructor(private pservice:RegisterService){};
  ngOnInit(){
      this.pservice.getAllStudents().subscribe((r)=>this.studentArray=r);
      //this.pservice.getResult().subscribe((r)=> this.str);
  }
}
