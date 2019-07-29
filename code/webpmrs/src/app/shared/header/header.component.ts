import { Component } from '@angular/core';
import { CommonService } from 'src/app/core/services/common.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent {
  loginMsg;
  loginLink;
  constructor(private commonService:CommonService){}
  ngOnInit(){
    this.loginMsg=(this.commonService.loginMsg==null)?"Login":this.commonService.loginMsg;
    this.loginLink=(this.commonService.loginLink==null)?"login":this.commonService.loginLink;
    console.log(this.loginMsg+" "+this.loginLink);

    if(this.commonService.loginMsg=="logout"){
      this.loginMsg="Logout";
      this.loginLink="/logout";
    }
  }
}
