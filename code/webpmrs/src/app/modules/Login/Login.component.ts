import { Component, OnInit, EventEmitter } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { LoginFields } from './LoginInterface';
import { MatRadioChange, MatRadioButton } from '@angular/material';
import { Router } from '@angular/router';


@Component({
    selector:"logintab",
    templateUrl:"./Login.component.html",
    styleUrls: ['./Login.component.css']
    
    })
    export class LoginComponent 
    {
    public LoginForm: FormGroup;
    public role:string;
  
    public change: EventEmitter<MatRadioChange>;
    
constructor(private router: Router){
}

       ngOnInit()
       {
           this.LoginForm = new FormGroup(
               {
                username: new FormControl('',[Validators.required,Validators.maxLength(100)]),
                password: new FormControl('',[ Validators.required,Validators.minLength(6),Validators.pattern('^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]+$')])
               
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
         

        onChange(rolechanged:MatRadioChange){

          console.log(rolechanged.value);
          let rButton: MatRadioButton = rolechanged.source;
          this.role=rButton.value;
         
        }

        login()
        {
          if(this.role=="admin")
          {
           // console.log("hi");
            this.router.navigateByUrl('/admin');
          }
          if(this.role=="mentor")
          {
           // console.log("hello");
            this.router.navigateByUrl("/");
          }
          if(this.role=="student")
          {
           // console.log("hey");
            this.router.navigateByUrl("/");
          }
              
        }

    }
    