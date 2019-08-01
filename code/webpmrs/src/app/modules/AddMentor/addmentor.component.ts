import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { Http } from '@angular/http';
import { Mentor } from '../mentorlist/Mentor';
import { MentorFields } from './mentorRegister';
import { CommonService } from 'src/app/core/services/common.service';

@Component({
  selector: 'app-addmentor',
  templateUrl: './addmentor.component.html',
  styleUrls: ['./addmentor.component.css']
})
export class AddmentorComponent implements OnInit {
  MentorForm: any;

  constructor(private commonService:CommonService,private http: Http){}

  baseUrlMentorRegister = this.commonService.baseurl+"/admin/registerMentor";
  public mentordata: Mentor;
  public error: string;
  public successMsg: string;

  ngOnInit() {

    this.MentorForm = new FormGroup(
      {
        firstName: new FormControl('', [Validators.required, Validators.maxLength(100)]),
        lastName: new FormControl('', [Validators.required, Validators.maxLength(100)]),
        email: new FormControl('', [Validators.required, Validators.pattern('^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+.[a-zA-Z0-9-.]+$')]),
        contact: new FormControl('', [Validators.required])

      });

  }
  public resetMentor = (mentorFormValue) => {
        this.MentorForm.reset();
   }

  public hasError = (controlName: string, errorName: string) => {
    return this.MentorForm.controls[controlName].hasError(errorName);
  }

  public createMentor = (mentorFormValue) => {
    this.executeFormCreation(mentorFormValue);
    if (this.MentorForm.valid) {
      this.http.post(this.baseUrlMentorRegister, mentorFormValue).subscribe(result => {
        if (result.text() != "") {
          this.mentordata = result.json();
          this.successMsg = "Mentor Added Successfully";
          this.MentorForm.reset();
      }
        else {
          this.error = "Resgistration failed";
        }
      });
    }
  }


  private executeFormCreation = (mentorFormValue) => {

    let field: MentorFields = {
      firstName: mentorFormValue.firstName,
      lastName: mentorFormValue.lastName,
      email: mentorFormValue.email,
      contact: mentorFormValue.contact


    }
  }
 
}
