import { MentordashboardComponent } from './modules/mentordashboard/mentordashboard.component';
import { AdmindashboardComponent } from './modules/admindashboard/admindashboard.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { TestComponent } from './modules/test/test.component';
import { AboutusComponent } from './modules/aboutus/aboutus.component';
import { LoginComponent } from './modules/Login/Login.component';

import { ProjectlistComponent } from './modules/Projectlist/projectlist.component';
import { NavComponent } from './shared/nav/nav.component';
import { StudentListComponent } from './modules/student-list/student-list.component';
import { MentorlistComponent } from './modules/mentorlist/mentorlist.component';

const routes: Routes = [
  
  {path:"login",component:LoginComponent},
  {path:"test",component:TestComponent},
  {path:"aboutus",component:AboutusComponent},
  {path:"admin", component: AdmindashboardComponent},
  {path:"mentor", component: MentordashboardComponent},
  {path:"mentorlist",component:MentorlistComponent},
  {path:"projectlist", component: ProjectlistComponent},
  {path:"student-list",component:StudentListComponent},
  {path:"navigation", component: LoginComponent}
 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
