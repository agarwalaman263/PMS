import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { environment } from './../../environments/environment'
@Injectable({
  providedIn: 'root'
})
export class HttpServicesService {

  constructor(private http: HttpClient) { }
  public sendURL = (data) => {
    return this.http.get(environment.start, {
      params: {
        v1: data.name,
        v2: data.URL
      }
    });
  }

  public getData = (data, task) => {
    if (data === null || data === '') {
      data = 1000;
    }
    return this.http.get(environment[task].link, {
      params: {
        item: data
      }
    });
  }
  // public getComplexity = (data) => {
  //   if (data === null || data === '') {
  //     data = 1000;
  //   }
  //   return this.http.get('http://localhost:8080/complexity', {
  //     params: {
  //       item3: data
  //     }
  //   });
  // }
  // public getCodeCoverage = (data) => {
  //   if (data === null || data === '') {
  //     data = 1000;
  //   }
  //   return this.http.get('http://localhost:8080/coverage', {
  //     params: {
  //       item0: data
  //     }
  //   });
  // }
  // public getCodeDuplication = (data) => {
  //   if (data === null || data === '') {
  //     data = 1000;
  //   }
  //   return this.http.get('http://localhost:8080/duplicate', {
  //     params: {
  //       item5: data
  //     }
  //   });
  // }
  // public getSecurity = (data) => {
  //   if (data === null || data === '') {
  //     data = 1000;
  //   }
  //   return this.http.get('http://localhost:8080/security', {
  //     params: {
  //       item4: data
  //     }
  //   });
  // }
  // public getTest = (data) => {
  //   if (data === null || data === '') {
  //     data = 1000;
  //   }
  //   return this.http.get('http://localhost:8080/test', {
  //     params: {
  //       item2: data
  //     }
  //   });
  // }
  // public getWarnings = (data) => {
  //   if (data === null || data === '') {
  //     data = 1000;
  //   }
  //   return this.http.get('http://localhost:8080/warnings', {
  //     params: {
  //       item1: data
  //     }
  //   });
  // }
}
