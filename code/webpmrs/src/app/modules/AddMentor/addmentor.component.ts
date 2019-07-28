import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-addmentor',
  templateUrl: './addmentor.component.html',
  styleUrls: ['./addmentor.component.css']
})
export class AddmentorComponent implements OnInit {
  MentorForm: any;

  constructor() { }

  ngOnInit() {

    this.MentorForm = new FormGroup(
      {
        firstname: new FormControl('', [Validators.required, Validators.maxLength(100)]),
        lastname: new FormControl('', [Validators.required, Validators.maxLength(100)]),
        email: new FormControl('', [Validators.required, Validators.pattern('^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+.[a-zA-Z0-9-.]+$')]),
        password: new FormControl('', [Validators.required, Validators.minLength(6), Validators.pattern('^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]+$')]),
        contact: new FormControl('', [Validators.required])
       
      });

  }

  public hasError = (controlName: string, errorName: string) => {
    return this.MentorForm.controls[controlName].hasError(errorName);
  }

}
