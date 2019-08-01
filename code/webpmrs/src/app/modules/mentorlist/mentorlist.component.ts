import { Component, OnInit } from '@angular/core';
import { Mentor } from './Mentor';
import { Http } from '@angular/http';
import 'rxjs/Rx';
import { CommonService } from 'src/app/core/services/common.service';

@Component({
  selector: 'app-mentorlist',
  templateUrl: './mentorlist.component.html',
  styleUrls: ['./mentorlist.component.css']
})
export class MentorlistComponent implements OnInit {
  error: string;

  constructor(private http:Http,private commonService:CommonService) { }
 
  flagTable=true;
  flagerror=false;
  public list:Mentor;
  index=1;

  ngOnInit() {
    this.getMentorList();
  }

  baseurl=this.commonService.baseurl+"/admin/mentorList";
  getMentorList(){
    this.http.get(this.baseurl).subscribe(result => {
      if (result.text() != "") {
        this.flagerror=false;
        this.list = result.json(); 
        console.log(this.list);  
      } else {
        this.flagerror=true;
        this.error = "There is no result...";
      }
    });
  }
}
