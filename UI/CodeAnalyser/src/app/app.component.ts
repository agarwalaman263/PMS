import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'CodeAnalyser';
  public state = '';
  @Input() stateTobeCiphoned;
  public ciphonState = (data) => {
    this.stateTobeCiphoned = data;
  }
}
