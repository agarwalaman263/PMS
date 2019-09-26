import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { environment } from './../../environments/environment';
import { SpinnerService } from './spinner/spinner.service';
@Injectable({
  providedIn: 'root'
})
export class HttpServicesService {

  constructor(private http: HttpClient, private spinner: SpinnerService) { }
  public sendURL = (data) => {
    return this.http.get(environment.start, {
      params: {
        v1: data.name,
        v2: data.URL,
        v3: data.GIT
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
}
