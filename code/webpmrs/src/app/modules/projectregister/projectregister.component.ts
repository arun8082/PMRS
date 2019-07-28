import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-projectregister',
  templateUrl: './projectregister.component.html',
  styleUrls: ['./projectregister.component.css']
})
export class ProjectregisterComponent implements OnInit {

  constructor() { }
  public ProjectForm: FormGroup;

  ngOnInit() {
    this.ProjectForm = new FormGroup(
      {
        projectTitle: new FormControl('', [Validators.required, Validators.maxLength(100)]),
        projectdesc: new FormControl('', [Validators.required, Validators.maxLength(500)]),
        ptechnology: new FormControl('', [Validators.required,Validators.maxLength(200)]),
        hw: new FormControl(''),
        sw:new FormControl('')
       
     
  
      });
  }
  
  public hasError = (controlName: string, errorName: string) => {
    return this.ProjectForm.controls[controlName].hasError(errorName);
  }

  
  
 
    OnSubmit()
    {
      console.log("submit clicked");
    }
  

}
