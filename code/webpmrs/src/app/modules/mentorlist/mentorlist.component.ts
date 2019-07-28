import { Component, OnInit } from '@angular/core';
import { Mentor } from './Mentor';
import { Http } from '@angular/http';

@Component({
  selector: 'app-mentorlist',
  templateUrl: './mentorlist.component.html',
  styleUrls: ['./mentorlist.component.css']
})
export class MentorlistComponent implements OnInit {
  error: string;

  constructor(private http:Http) { }
 
  flagTable=true;
  public list:Mentor;

  ngOnInit() {
    this.getMentorList();
  }

  baseurl="http://localhost:7090/pmrs/admin/projectList";
  getMentorList(){
    this.http.get(this.baseurl).subscribe(result => {
      if (result._body != "") {
        this.list = result.json();        
      } else {
        this.error = "There is no result...";
      }
    });
  }
}
