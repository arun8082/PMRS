import { Component, Input } from '@angular/core';
import { NavComponent } from 'src/app/shared/nav/nav.component';

@Component({
  selector: 'app-admindashboard',
  templateUrl: './admindashboard.component.html',
  styleUrls: ['./admindashboard.component.css']
})

export class AdmindashboardComponent {
  title = 'admin';
}
