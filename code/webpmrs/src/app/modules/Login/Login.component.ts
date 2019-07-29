import { Component, OnInit, EventEmitter } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { LoginFields } from './LoginInterface';
import { MatRadioChange, MatRadioButton } from '@angular/material';
import { Router } from '@angular/router';
import { Http,Response } from '@angular/http';
import { CourseAdmin } from 'src/app/core/models/CourseAdmin';
import { Student } from 'src/app/core/models/Student';
import { Mentor } from 'src/app/core/models/Mentor';
import { CommonService } from 'src/app/core/services/common.service';
import { NavComponent } from 'src/app/shared/nav/nav.component';


@Component({
  selector: "logintab",
  templateUrl: "./Login.component.html",
  styleUrls: ['./Login.component.css']

})
export class LoginComponent {
  public LoginForm: FormGroup;
  public role: string;

  public change: EventEmitter<MatRadioChange>;
  baseurlAdmin = "http://localhost:7090/pmrs/admin/login";
  baseurlMentor = "http://localhost:7090/pmrs/mentor/login";
  baseurlStudent = "http://localhost:7090/pmrs/student/login";

  courseAdmin: CourseAdmin;
  student: Student;
  mentor: Mentor;
  error: String;

  constructor(private router: Router, private commonService: CommonService, private http: Http,private nav:NavComponent) { }

  ngOnInit() {
    this.LoginForm = new FormGroup(
      {
        email: new FormControl('', [Validators.required, Validators.maxLength(100)]),
        password: new FormControl('', [Validators.required, Validators.minLength(6), Validators.pattern('^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]+$')]),
        role: new FormControl('')

      });
  }

  public createLogin = (LoginFormValue) => {
   
    if (this.LoginForm.valid) {
      /** Course admin login start */
      if (this.role == "courseAdmin") {
        this.executeFormCreation(LoginFormValue);
        this.http.post(this.baseurlAdmin, LoginFormValue).subscribe(result => {
          if (result.text() != "") {
            this.courseAdmin = result.json();
            if (this.courseAdmin.status == "ACTIVE") {
              this.commonService.dashboardLink="admin";
              this.commonService.dashboardName="DashBoard";
              this.nav.ngOnInit();
              this.router.navigateByUrl('admin');
            } else if (this.courseAdmin.status == "INACTIVE") {
              this.error = "This account is Inactive. Please contact to Admin";
            }
          } else {
            this.error = "Invalid username/password. Try again..";
          }
        });
      }
      /** Course admin login end */
      /** Mentor login start */
      else if (this.role == "mentor") {
        this.executeFormCreation(LoginFormValue);
        this.http.post(this.baseurlMentor, LoginFormValue).subscribe(result => {
          if (result.text() != "") {
            this.mentor = result.json();
            if (this.mentor.status == "ACTIVE") {
              this.router.navigateByUrl('mentordash');
            } else if (this.mentor.status == "INACTIVE") {
              this.error = "This account is Inactive. Please contact to Admin";
            }
          } else {
            this.error = "Invalid username/password. Try again..";
          }
        });
      }/** Mentor login end */
      /** Student login start */
      else if (this.role == "student") {
        this.executeFormCreation(LoginFormValue);
        this.http.post(this.baseurlStudent, LoginFormValue).subscribe(result => {
          if (result.text() != "") {
            this.student = result.json();
            if (this.student.status == "ACTIVE") {
              this.router.navigateByUrl('studentdash');
            } else if (this.student.status == "INACTIVE") {
              this.error = "This account is Inactive. Please contact to Admin";
            }
          } else {
            this.error = "Invalid username/password. Try again..";
          }
        });/** Student login end */
      }
    }
  }


  public hasError = (controlName: string, errorName: string) => {
    return this.LoginForm.controls[controlName].hasError(errorName);
  }

  private executeFormCreation = (LoginFormValue) => {

    let field: LoginFields = {
      email: LoginFormValue.email,
      password: LoginFormValue.password,
      role: LoginFormValue.role
    }
  }

  onChange(rolechanged: MatRadioChange) {
    let rButton: MatRadioButton = rolechanged.source;
    this.role = rButton.value;
  }

  login() {

    if (this.role == null) {
      this.role = "courseAdmin";
    }
  }

}
