import { Component, OnInit } from '@angular/core';
import { Mentor } from './Mentor';
import { Http } from '@angular/http';
import 'rxjs/Rx';

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

  baseurl="http://localhost:7090/pmrs/admin/mentorList";
  getMentorList(){
    this.http.get(this.baseurl).subscribe(result => {
      if (result.text() != "") {
        this.list = result.json();        
      } else {
        this.error = "There is no result...";
      }
    });
  }
}
