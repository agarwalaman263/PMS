import { Component, OnInit, Input } from '@angular/core';
@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent {
  public state = '';
  @Input() stateTobeCiphoned;
  public ciphonState = (data) => {
    this.stateTobeCiphoned = data;
  }
}
