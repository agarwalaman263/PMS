import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {
  @Input() presence: boolean;
  constructor() { }
  public showModal = false;
  public selectedProperty = '';
  public ListOfOperations = [{
    tag: 'Code Complexity',
    button: 'Calculate'
  }, {
    tag: 'Code Coverage',
    button: 'Calculate'
  }, {
    tag: 'Acyclometric Complexity',
    button: 'Calculate'
  }, {
    tag: 'Code Duplication',
    button: 'Calculate'
  }, {
    tag: 'Security',
    button: 'Calculate'
  }];
  public displayModal = (task) => {
    if (this.presence === true) {
      console.log(task);
      this.selectedProperty = task;
      this.showModal = !this.showModal;
    } else {
      alert('Please get the valid URL calibrated');
    }

  }
  public closeModal = (data) => {
    console.log(data);
    this.showModal = data;
  }
  ngOnInit() {
  }

}
