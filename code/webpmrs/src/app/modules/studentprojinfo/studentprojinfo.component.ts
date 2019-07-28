import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-studentprojinfo',
  templateUrl: './studentprojinfo.component.html',
  styleUrls: ['./studentprojinfo.component.css']
})
export class StudentprojinfoComponent implements OnInit {

  constructor(private router: Router) { }
  flagTable = true;
  flagstudentTable = false;
  public slist = [{ SNo: "1", projecttitle: "abcdef", projectstatus: "qweety" },
  { SNo: "1", projecttitle: "abcdef", projectstatus: "qweety" },
  { SNo: "1", projecttitle: "abcdef", projectstatus: "qweety" }];


  ngOnInit() {
  }

}
