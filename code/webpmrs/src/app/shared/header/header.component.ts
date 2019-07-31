import { Component } from '@angular/core';
import { CommonService } from 'src/app/core/services/common.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent{
  loginMsg;
  loginLink;
  constructor(private commonService:CommonService){}
  ngOnInit(){
    let loginDetails;
    //console.log(JSON.parse(sessionStorage.getItem("loginDetails")));
    if(JSON.parse(sessionStorage.getItem("loginDetails"))!=null){
      loginDetails=JSON.parse(sessionStorage.getItem("loginDetails"));
      this.loginLink="logout";
      this.loginMsg="Logout";
    }else{
      this.loginLink="login";
      this.loginMsg="Login";
    }
  }
}
