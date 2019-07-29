import { Component, OnInit } from '@angular/core';
import { CommonService } from 'src/app/core/services/common.service';
import { Http } from '@angular/http';
import { Project } from 'src/app/core/models/Project';

@Component({
  selector: 'app-projectrepository',
  templateUrl: './projectrepository.component.html',
  styleUrls: ['./projectrepository.component.css']
})
export class ProjectrepositoryComponent implements OnInit {

  listrepository:Project;
  index=1; 
  error:string;
  projectList: any;
  contentTitle;

  constructor(private http:Http ,private commonService: CommonService) { }

  ngOnInit() {

    this.getProjectList();
  }

    baseurl="http://localhost:7090/pmrs/admin/projectList";
     getProjectList() {
      this.http.get(this.baseurl).subscribe(result => {
        if (result.text() != "") {
          this.contentTitle="Project List";
          this.projectList = result.json();        
        } else {
          this.error = "There is no result...";
        }
      });

    }
}
