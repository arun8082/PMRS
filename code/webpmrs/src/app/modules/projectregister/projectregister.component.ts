import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { Http } from '@angular/http';
import { Project } from 'src/app/core/models/Project';
import { ProjectFields } from './projectregister';
import { CommonService } from 'src/app/core/services/common.service';

@Component({
  selector: 'app-projectregister',
  templateUrl: './projectregister.component.html',
  styleUrls: ['./projectregister.component.css']
})
export class ProjectregisterComponent implements OnInit {

  constructor(private http:Http,private commonService:CommonService) { }
  public ProjectForm: FormGroup;
  public project:Project;
  public error:string;
  public baseurlProjectRegister=this.commonService.baseurl+"/student/addProject";
  public successMsg;

  ngOnInit() {
    this.ProjectForm = new FormGroup(
      {
        projectTitle: new FormControl('', [Validators.required, Validators.maxLength(100)]),
        projectDescription: new FormControl('', [Validators.required, Validators.maxLength(500)]),
        projectTechnology: new FormControl('', [Validators.required,Validators.maxLength(200)]),
        projectHWRequire: new FormControl('',[]),
        projectSWRequire:new FormControl('',[]),
        projectPlatform:new FormControl('',[])
        });
  }
  
  public hasError = (controlName: string, errorName: string) => {
    return this.ProjectForm.controls[controlName].hasError(errorName);
  }


  //adding project data in database.
  public createProject = (projectFormValue) => {

    if (this.ProjectForm.valid) {
      this.http.post(this.baseurlProjectRegister, projectFormValue).subscribe(result => {
        if(result.text()!="")
        {
        this.project=result.json();
        console.log(this.project);
        this.successMsg = "Project added successfully.";
        this.ProjectForm.reset();
        }
        else
        {
          this.error="Registration failed";
        }
      });

      console.log("in function");
      console.log(projectFormValue);
     
    }
  }

  public resetProject = (projectFormValue) => {
    this.ProjectForm.reset();
  }

  private executeFormCreation = (projectFormValue) => {

    let fields: ProjectFields = 
    {
      projectTitle: projectFormValue.firstName,
      projectDescription: projectFormValue.lastName,
      projectTechnology: projectFormValue.email,
      projectHWRequire: projectFormValue.contact,
      projectSWRequire: projectFormValue.course,
      projectPlatform: projectFormValue.course
    }
  }
}
