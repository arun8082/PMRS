import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CommonService } from 'src/app/core/services/common.service';
import { Http } from '@angular/http';

@Component({
  selector: 'app-studentprojinfo',
  templateUrl: './studentprojinfo.component.html',
  styleUrls: ['./studentprojinfo.component.css']
})
export class StudentprojinfoComponent implements OnInit {
  error: string;

  constructor(private router: Router,private commonService:CommonService,private http:Http) { }
  flagTable = true;
  flagstudentTable = false;
  public slist;
  index=1;

  baseurl=this.commonService.baseurl+"/admin/projectList";
  ngOnInit() {
    this.getProjectList();
  }

  getProjectList(){
    this.http.get(this.baseurl).subscribe(result => {
      if (result.text() != "") {
        this.slist = result.json();        
      } else {
        this.error = "There is no result...";
      }
    });
  }
}
