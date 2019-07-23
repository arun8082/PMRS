import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './header/Login/Login.component';
import { TestComponent } from './test/test.component';


const routes: Routes = [
  {path:"login",component:LoginComponent},
  {path:"test",component:TestComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
