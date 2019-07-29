import { Component, OnInit } from '@angular/core';
import { CommonService } from 'src/app/core/services/common.service';

@Component({
  selector: 'app-verify-documents',
  templateUrl: './verify-documents.component.html',
  styleUrls: ['./verify-documents.component.css']
})
export class VerifyDocumentsComponent implements OnInit {
  index=1;
  id;
  projectList;
  error: string;
  errorFlag: boolean=false;
  constructor(private commanService:CommonService) { }

  ngOnInit() {
    this.commanService.getProjectList(1,"mentor").subscribe(result=>{
      if(result.text()!=""){
        this.errorFlag=false;
        this.projectList=result.json();
      }else{
        this.errorFlag=true;
        this.error="There is no data.....";
      }
    });
  }
  download(){

  }  

}
