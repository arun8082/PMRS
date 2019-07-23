import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {HeaderComponent} from './header/header.component';
import { NavComponent } from './nav/nav.component';
import { FooterComponent } from './footer/footer.component';
import {MyMaterialModule} from './Material/material.module';
import { LoginComponent } from './header/Login/Login.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { RegisterComponent } from './register/register.component';
import { TestComponent } from './test/test.component';
import { HttpModule } from '@angular/http';
import { RegisterService } from './services/register.service';
import { FormsModule } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';
import { AboutusComponent } from './aboutus/aboutus.component';
import { ProjectlistComponent } from './projectlist/projectlist.component';
import { registerLocaleData } from '@angular/common';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    NavComponent,
    FooterComponent,
    AboutusComponent,
    ProjectlistComponent,
    LoginComponent,
    RegisterComponent,
    TestComponent,
    RegisterComponent
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MyMaterialModule,
    BrowserAnimationsModule,
    HttpModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [RegisterService],
  bootstrap: [AppComponent]
})
export class AppModule { }
