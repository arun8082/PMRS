import { Injectable } from '@angular/core';
import { Http, Response, RequestOptions } from '@angular/http';
import { Observable } from 'rxjs';
import 'rxjs/add/operator/map';
import { Student } from '../models/Student';
import { CourseAdmin } from '../models/CourseAdmin';
import { Headers } from '@angular/http';

@Injectable()
export class CommonService {

    //baseurl="../../assets/data/student.json";
    baseurl = "http://localhost:7090/pmrs";

    constructor(private http: Http) { }

    getAllStudents(): Observable<Student[]> {
        return this.http.get(this.baseurl)
            .map((response: Response) => <Student[]>response.json());
    }

    courseAdmin: any;

    loginCourseAdmin(courseAdminData) {
        return this.http.post(this.baseurl, courseAdminData);
    }

    getStudentsList(id, type) {
        var headers = new Headers({
            "Content-Type": "application/json",
            "Accept": "application/json"
        });

        if (type == "mentor") {
            return this.http.post(this.baseurl + "/mentor/projectList", JSON.stringify(id), { headers: headers });
        } else if (type == "admin") {
            return this.http.post(this.baseurl + "/admin/projectList", JSON.stringify(id),{ headers: headers });
        }
    }
}