import { Component, Input } from '@angular/core';
import { SpinnerService } from './services/spinner/spinner.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'CodeAnalyser';
  constructor(private spinner: SpinnerService) {

  }
  public sidebarState = false;
  public visibleSidebar() {
    this.sidebarState = true;
  }
  public closeSidebar(state) {
    this.sidebarState = false;
  }
}
