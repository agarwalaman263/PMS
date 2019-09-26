import { Component, OnInit, Input } from '@angular/core';
import { HttpServicesService } from 'src/app/services/http-services.service';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {

  @Input() public presence: boolean;
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
    if (this.presence === true && this.negativeChecker(task)) {
      this.ListOfOperations.forEach(feature => {

        if (feature.tag === task) {
          if (parseInt(feature.value, 10) >= 0) {
            this.selectedProperty = task;
            this.showModal = !this.showModal;
            this.passedValue = feature.value;
          } else {
            alert('Negative value not allowed');
          }

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
  public negativeChecker(task) {
    if (task.value === '' || task.value === null) {
      return true;
    } else if (parseInt(task.value, 10) < 0) {
      return false;
    } else {
      return true;
    }

  }
  ngOnInit() {
  }

}
