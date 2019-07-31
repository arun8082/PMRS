import { Component, OnInit } from '@angular/core';
import { HeaderComponent } from '../header/header.component';

@Component({
  selector: 'app-logout',
  templateUrl: './logout.component.html',
  styleUrls: ['./logout.component.css']
})
export class LogoutComponent implements OnInit {

  constructor( private header:HeaderComponent) { }

  ngOnInit() {
    sessionStorage.removeItem("loginDetails");
    this.header.ngOnInit();
  }
}
