import { Injectable } from '@angular/core';
import {Course} from "../model/course";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class CoursesService {

  constructor(private httpCLiente: HttpClient) { }

  list(): Course[]{
    return [
      {
        _id: '1',
        name: 'Angular',
        category: 'Front-end'
      },
      {
        _id: '2',
        name: 'Spring Boot',
        category: 'Back-end'
      },
    ]
  }
}