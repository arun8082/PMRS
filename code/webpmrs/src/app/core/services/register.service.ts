import { Injectable } from '@angular/core';
//import { HttpClient } from '@angular/common/http';
import { Http, Response, Headers, RequestOptions } from '@angular/http';
import { Observable } from 'rxjs';
import 'rxjs/add/operator/map';
import { CourseAdmin } from '../models/CourseAdmin';
import { Register } from '../models/Register';

@Injectable()
export class RegisterService {
    
    //baseurl="../assets/student.json";
    baseurl="http://localhost:7090/pmrs/login";
    constructor(private http:Http){}

    getResult(){
        return this.http.get(this.baseurl);
    }


    getAllStudents():Observable<Register[]>{
        return this.http.get(this.baseurl)
        .map((response:Response)=><Register[]>response.json());
    }
    
    /*
    courseAdmin = {
        "courseAdminId": 1,
    };
    baseurl = "http://localhost:7090/pmrs/login";
    constructor(private http: Http) { }


    getAllStudents(): Observable<CourseAdmin[]> {
        return this.http.post(this.baseurl, this.courseAdmin)
            .map((response: Response) => <CourseAdmin[]>response.json());
    }
    */
}