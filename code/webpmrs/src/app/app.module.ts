import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavComponent } from './shared/nav/nav.component';
import { FooterComponent } from './shared/footer/footer.component';
import {MyMaterialModule} from './shared/Material/material.module';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { RegisterComponent } from './modules/register/register.component';
import { HttpModule } from '@angular/http';
import { FormsModule } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';
import { AboutusComponent } from './modules/aboutus/aboutus.component';
import { ProjectlistComponent } from './modules/Projectlist/projectlist.component';
import { registerLocaleData } from '@angular/common';
import { RegisterService } from './core/services/register.service';
import { TestComponent } from './modules/test/test.component';
import { HeaderComponent } from './shared/header/header.component';
import { LoginComponent } from './modules/Login/Login.component';
import { HttpClientModule } from '@angular/common/http';


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
    RegisterComponent,
    TestComponent
    
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
  providers: [RegisterService],
  bootstrap: [AppComponent]
})
export class AppModule { }
