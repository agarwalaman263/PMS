import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class HttpServicesService {

  constructor(private http: HttpClient) { }
  public sendURL = (data) => {
    return this.http.get('http://localhost:8080/start', {
      params: {
        v1: data.name,
        v2: data.URL
      }
    });
    return of('aman');
  }
}
