import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppRoutingModule } from './app-routing.module';
import { HeaderComponent } from './header.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { MyMaterialModule } from './material.module';


@NgModule({
  declarations: [
    HeaderComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MyMaterialModule
  ],
  providers: [],
  bootstrap: [HeaderComponent]
})
export class HeaderModule { }
