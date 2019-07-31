
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavComponent } from './shared/nav/nav.component';
import { FooterComponent } from './shared/footer/footer.component';
import {MyMaterialModule} from './shared/Material/material.module';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { HttpModule } from '@angular/http';
import { FormsModule } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';
import { AboutusComponent } from './modules/aboutus/aboutus.component';
import { registerLocaleData } from '@angular/common';
import { RegisterService } from './core/services/register.service';
import { TestComponent } from './modules/test/test.component';
import { LoginComponent } from './modules/Login/Login.component';
import { HttpClientModule } from '@angular/common/http';
import { AdmindashboardComponent } from './modules/admindashboard/admindashboard.component';
import { StudentListComponent } from './modules/student-list/student-list.component';
import { MentorlistComponent } from './modules/mentorlist/mentorlist.component';
import { StudentdashboardComponent } from './modules/StudentDashboard/studentdashboard.component';
import { ContactusComponent } from './modules/contactus/contactus.component';
import { ProjectregisterComponent } from './modules/projectregister/projectregister.component';
import { StudentRegisterComponent } from './modules/student-register/student-register.component';
import { MentordashboardComponent } from './modules/mentordashboard/mentordashboard.component';
import { CommonService } from './core/services/common.service';
import { AddmentorComponent } from './modules/AddMentor/addmentor.component';
import { ProjectrepositoryComponent } from './modules/projectrepository/projectrepository.component';
import { StudentprojinfoComponent } from './modules/studentprojinfo/studentprojinfo.component';
import { MentorProjectListComponent } from './modules/mentorProjectlist/mentorProjectlist.component';
import { MentorStudentListComponent } from './modules/mentorStudentList/mentorStudentList.component';
import { VerifyDocumentsComponent } from './modules/verify-documents/verify-documents.component';
import { HomeComponent } from './modules/home/home.component';
import { LogoutComponent } from './shared/logout/logout.component';
import { HeaderComponent } from './shared/header/header.component';




@NgModule({
  declarations: [
    AppComponent,
    NavComponent,
    FooterComponent,
    AboutusComponent,
    LoginComponent,
    TestComponent,
    AdmindashboardComponent,
    StudentListComponent,
    MentorlistComponent,
    ProjectregisterComponent,
    StudentRegisterComponent,
    StudentdashboardComponent,
    MentordashboardComponent,
    ContactusComponent,
    AddmentorComponent,
    ProjectrepositoryComponent,
    StudentprojinfoComponent,
    MentorProjectListComponent,
    MentorStudentListComponent,
    VerifyDocumentsComponent,
    VerifyDocumentsComponent,
    HomeComponent,
    LogoutComponent,
    HeaderComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MyMaterialModule,
    BrowserAnimationsModule,
    HttpModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [
    RegisterService,
    CommonService,
    NavComponent,
    HeaderComponent
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
