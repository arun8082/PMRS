
import { AdmindashboardComponent } from './modules/admindashboard/admindashboard.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { TestComponent } from './modules/test/test.component';
import { AboutusComponent } from './modules/aboutus/aboutus.component';
import { LoginComponent } from './modules/Login/Login.component';

import { NavComponent } from './shared/nav/nav.component';
import { StudentListComponent } from './modules/student-list/student-list.component';
import { MentorlistComponent } from './modules/mentorlist/mentorlist.component';
import { StudentdashboardComponent } from './modules/StudentDashboard/studentdashboard.component';
import { MentordashboardComponent } from './modules/mentordashboard/mentordashboard.component';
import { ContactusComponent } from './modules/contactus/contactus.component';


import { ProjectregisterComponent } from './modules/projectregister/projectregister.component';
import { StudentRegisterComponent } from './modules/student-register/student-register.component';

const routes: Routes = [
  
  {path:"login",component:LoginComponent},
  {path:"test",component:TestComponent},
  {path:"aboutus",component:AboutusComponent},
  {path:"admin", component: AdmindashboardComponent},
  {path:"mentor", component: MentordashboardComponent},
  {path:"mentorlist",component:MentorlistComponent},

  {path:"student-list",component:StudentListComponent},
  {path: 'admin', component: AdmindashboardComponent},
  {path: 'navigation', component: LoginComponent},
  {path:"mentorlist",component:MentorlistComponent},
  {path:"projectregister",component:ProjectregisterComponent},
  {path:"studentRegister",component:StudentRegisterComponent},

  {path:"student",component:StudentdashboardComponent},
  {path:"mentordash",component:MentordashboardComponent},
  {path:"contactus",component:ContactusComponent},

  {path:"projectregister",component:ProjectregisterComponent}
 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
