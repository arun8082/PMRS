import { Component } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { RegisterFields } from './RegisterInterface';

@Component({
  selector: 'register-form',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent {
  title = 'webpmrs';

  public RegisterForm: FormGroup
  ngOnInit() {
    this.RegisterForm = new FormGroup(
      {
        firstname: new FormControl('', [Validators.required, Validators.maxLength(100)]),
        lastname: new FormControl('', [Validators.required, Validators.maxLength(100)]),
        email: new FormControl('', [Validators.required ,Validators.pattern('^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+.[a-zA-Z0-9-.]+$')]),
        contact: new FormControl('', [Validators.required]),
        password: new FormControl('',[ Validators.required,Validators.minLength(6),Validators.pattern('^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]+$')])
     

      });
  }

  public hasError = (controlName: string, errorName: string) => {
    return this.RegisterForm.controls[controlName].hasError(errorName);
  }

  public createRegister = (registerFormValue) => {
    if (this.RegisterForm.valid) {
      this.executeFormCreation(registerFormValue);
    }
  }

  private executeFormCreation = (registerFormValue) => {

    let fields: RegisterFields = {
      firstname: registerFormValue.firstname,
      lastname: registerFormValue.lastname,
      email: registerFormValue.email,
      phoneno: registerFormValue.phoneno,
      password: registerFormValue.password

    }
  }

}
