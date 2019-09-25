import { Component, OnInit, OnDestroy } from '@angular/core';
import { Subscription } from 'rxjs';
import { SpinnerService } from './spinner.service';
import { ILoaderState } from './Ispinner';
import './spinner.component.scss';

@Component({
  selector: 'app-spinner',
  styleUrls: ['./spinner.component.scss'],
  templateUrl: './spinner.component.html',
})
export class SpinnerComponent implements OnInit, OnDestroy {
  public show = false;
  private subscription: Subscription;

  constructor(private loaderService: SpinnerService) { }

  public ngOnInit() {
    this.subscription = this.loaderService.loaderState
      .subscribe((state: ILoaderState) => {
        this.show = state.show;
      });
  }

  public ngOnDestroy() {
    this.subscription.unsubscribe();
  }
}
