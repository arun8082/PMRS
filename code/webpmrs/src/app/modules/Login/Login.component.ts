import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { LoginFields } from './LoginInterface';



@Component({
    selector:"logintab",
    templateUrl:"./Login.component.html",
    styleUrls: ['./Login.component.css']
    
    })
    export class LoginComponent 
    {
    public LoginForm: FormGroup;

       ngOnInit()
       {
           this.LoginForm = new FormGroup(
               {
                username: new FormControl('',[Validators.required,Validators.maxLength(100)]),
                password: new FormControl('',[Validators.maxLength(6),
                    Validators.pattern('^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]+$')])
               
                });
       }

       public hasError = (controlName: string, errorName: string) =>{
        return this.LoginForm.controls[controlName].hasError(errorName);
      }

      public createLogin = (LoginFormValue) => {
        if (this.LoginForm.valid) {
          this.executeFormCreation(LoginFormValue);
        }
      }

      private executeFormCreation = (LoginFormValue) => {
        
        let field: LoginFields={
         username: LoginFormValue.username,
         password: LoginFormValue.password
          }
        }
         

    }
    