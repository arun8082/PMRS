import { Injectable } from '@angular/core';
import { Http, Response, RequestOptions } from '@angular/http';
import { Observable } from 'rxjs';
import 'rxjs/add/operator/map';
import { Student } from '../models/Student';
import { CourseAdmin } from '../models/CourseAdmin';
import { HttpHeaders } from '@angular/common/http';

@Injectable()
export class LoginService {

    //baseurl="../../assets/data/student.json";
    baseurl = "http://localhost:7090/pmrs/admin/login";

    constructor(private http: Http) { }

    getAllStudents(): Observable<Student[]> {
        return this.http.get(this.baseurl)
            .map((response: Response) => <Student[]>response.json());
    }

    courseAdmin:any;

    loginCourseAdmin(courseAdminData) {
        return this.http.post(this.baseurl,courseAdminData).subscribe(result=>{this.courseAdmin=result.json()});
    }
}