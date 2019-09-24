import { Component, OnInit, Input } from '@angular/core';
import { HttpServicesService } from 'src/app/services/http-services.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {
  @Input() presence: boolean;
  constructor(private HttpService: HttpServicesService) { }
  public showModal = false;
  public passedValue = null;
  public selectedProperty = '';
  public ListOfOperations = [{
    tag: 'Code Complexity',
    button: 'Calculate',
    value: ''
  }, {
    tag: 'Code Coverage',
    button: 'Calculate',
    value: ''
  }, {
    tag: 'Code Duplication',
    button: 'Calculate',
    value: ''
  }, {
    tag: 'Security',
    button: 'Calculate',
    value: ''
  }, {
    tag: 'Test Coverage',
    button: 'Calculate',
    value: ''
  }, {
    tag: 'Compiler Warnings',
    button: 'Calculate',
    value: ''
  }];
  public displayModal = (task) => {
    if (this.presence === true) {
      this.selectedProperty = task;
      this.showModal = !this.showModal;
      this.ListOfOperations.forEach(feature => {
        if (feature.tag === task) {
          this.passedValue = feature.value;
        }
      });
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
