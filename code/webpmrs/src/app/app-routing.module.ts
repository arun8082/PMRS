
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
import { AddmentorComponent } from './modules/AddMentor/addmentor.component';
import { ProjectrepositoryComponent } from './modules/projectrepository/projectrepository.component';
import { StudentprojinfoComponent } from './modules/studentprojinfo/studentprojinfo.component';
import { MentorProjectListComponent } from './modules/mentorProjectlist/mentorProjectlist.component';
import { MentorStudentListComponent } from './modules/mentorStudentList/mentorStudentList.component';
import { VerifyDocumentsComponent } from './modules/verify-documents/verify-documents.component';
import { HomeComponent } from './modules/home/home.component';
import { LogoutComponent } from './shared/logout/logout.component';

const routes: Routes = [
  {path:"",component:HomeComponent},
  {path:"login",component:LoginComponent},
  {path:"test",component:TestComponent},
  {path:"aboutus",component:AboutusComponent},
  {path:"admin", component: AdmindashboardComponent},
  {path:"mentor", component: MentordashboardComponent},
  {path:"mentorlist",component:MentorlistComponent},
  {path:"projectRepository",component:ProjectrepositoryComponent},
  {path:"student-list",component:StudentListComponent},
  {path: 'admin', component: AdmindashboardComponent},
  {path: 'navigation', component: LoginComponent},
  {path:"projectregister",component:ProjectregisterComponent},
  {path:"studentRegister",component:StudentRegisterComponent},
  {path:"studentdash",component:StudentdashboardComponent},
  {path:"mentordash",component:MentordashboardComponent},
  {path:"contactus",component:ContactusComponent},
  {path:"mentor-register",component:AddmentorComponent},
  {path:"studentprojInfo",component:StudentprojinfoComponent},
  {path:"mentorprojlist",component:MentorProjectListComponent},
  {path:"mentorStudentList",component:MentorStudentListComponent},
  {path:"verifyDocuments",component:VerifyDocumentsComponent},
  {path:"logout",component:LogoutComponent},
  
  ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
