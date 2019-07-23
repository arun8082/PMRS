import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { TestComponent } from './modules/test/test.component';
import { RegisterComponent } from './modules/register/register.component';
import { AboutusComponent } from './modules/aboutus/aboutus.component';
import { LoginComponent } from './modules/Login/Login.component';

const routes: Routes = [
  {path:"login",component:LoginComponent},
  {path:"test",component:TestComponent},
  {path: "register",component:RegisterComponent},
  {path:"aboutus",component:AboutusComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
