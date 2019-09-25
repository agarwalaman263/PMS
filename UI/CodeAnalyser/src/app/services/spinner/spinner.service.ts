import { Injectable } from '@angular/core';
import { Subject } from 'rxjs';
import { ILoaderState } from './Ispinner';
@Injectable({
  providedIn: 'root'
})
export class SpinnerService {
  private loaderSubject = new Subject<ILoaderState>();
  public loaderState = this.loaderSubject.asObservable();
  public show() {
    this.loaderSubject.next({ show: true } as ILoaderState);
  }
  public hide() {
    this.loaderSubject.next({ show: false } as ILoaderState);
  }
}
