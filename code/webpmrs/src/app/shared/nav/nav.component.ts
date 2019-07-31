import { Component } from '@angular/core';
import { MatSidenav } from '@angular/material';
import { CommonService } from 'src/app/core/services/common.service';

@Component({
  selector: 'app-nav',
  templateUrl: './nav.component.html',
  styleUrls: ['./nav.component.css']
})
export class NavComponent {
  title = 'webpmrs';
  opened = false;

  dashboardLink;
  dashboardName;
  constructor(private commonService: CommonService) { }
  ngOnInit() {
    let loginDetails;
    if (JSON.parse(sessionStorage.getItem("loginDetails")) != null) {
      loginDetails = JSON.parse(sessionStorage.getItem("loginDetails"));
      if (loginDetails.courseAdminId != null) {
        this.dashboardLink = "/admin";
        this.dashboardName = "Admin Dashboard";
      }else if (loginDetails.mentorId != null) {
        this.dashboardLink = "/mentor";
        this.dashboardName = "Mentor Dashboard";
      }else if (loginDetails.studentId != null) {
        this.dashboardLink = "/studentdash";
        this.dashboardName = "Student Dashboard";
      }
    } else {
      this.dashboardLink = null;
      this.dashboardName = null;
    }
  }
}