
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
import { HeaderComponent } from './shared/header/header.component';
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




@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
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
    AddmentorComponent
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
    CommonService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
