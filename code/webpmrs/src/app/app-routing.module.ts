import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './header/Login/Login.component';
import { TestComponent } from './test/test.component';
import { RegisterComponent } from './register/register.component';
import { AboutusComponent } from './aboutus/aboutus.component';


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
