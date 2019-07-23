import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './header/Login/Login.component';
import { RegisterComponent } from './register/register.component';


const routes: Routes = [
  {path:"login",component:LoginComponent},
  {path: "register",component:RegisterComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
