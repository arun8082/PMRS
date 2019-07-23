import { Component, ViewChild } from '@angular/core';
import { MatSidenav } from '@angular/material';

@Component({
  selector: 'app-nav',
  templateUrl: './nav.component.html',
  styleUrls: ['./nav.component.css']
})


export class NavComponent {
  title = 'webpmrs';
  opened = false;
}