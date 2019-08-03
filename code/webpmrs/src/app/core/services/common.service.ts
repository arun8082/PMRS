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
    public baseurl = "http://localhost:7090/pmrs";
    public dashboardLink: string;
    public dashboardName: string;
    constructor(private http: Http) { }

    loginCourseAdmin(courseAdminData) {
        return this.http.post(this.baseurl, courseAdminData);
    }

    getStudentsList(id, type) {
        var headers = new Headers({
            "Content-Type": "application/json",
            "Accept": "application/json"
        });

        if (type == "mentor") {
            var data: any = { "mentorId": id };
            return this.http.post(this.baseurl + "/mentor/studentList", JSON.stringify(data), { headers: headers });
        } else if (type == "admin") {
            data = { "courseAdminId": id };
            return this.http.post(this.baseurl + "/admin/studentList", JSON.stringify(data), { headers: headers });
        }
    }

    getProjectList(id, type) {
        var headers = new Headers({
            "Content-Type": "application/json",
            "Accept": "application/json"
        });

        if (type == "mentor") {
            var data: any = { "mentorId": id };
            return this.http.post(this.baseurl + "/mentor/projectList", data, { headers: headers });
        } else if (type == "admin") {
            data = { "courseAdminId": id };
            return this.http.post(this.baseurl + "/admin/projectList", data, { headers: headers });
        }
    }

}