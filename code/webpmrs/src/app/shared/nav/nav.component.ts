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
  constructor(private commonService:CommonService){}
  ngOnInit() {
    this.dashboardLink=this.commonService.dashboardLink;
    this.dashboardName=this.commonService.dashboardName;
  }
}