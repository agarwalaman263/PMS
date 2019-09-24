import { Component, OnInit, Output, EventEmitter, Input } from '@angular/core';
import { HttpServicesService } from 'src/app/services/http-services.service';

@Component({
  selector: 'app-modal',
  templateUrl: './modal.component.html',
  styleUrls: ['./modal.component.css']
})
export class ModalComponent implements OnInit {

  constructor(private httpService: HttpServicesService) { }
  @Output() closeModal: EventEmitter<boolean> = new EventEmitter<boolean>();
  @Input() selectedProperty;
  @Input() passedValue;
  public result = null;
  public finalString = '';
  public clickOnX = () => {
    this.closeModal.emit(false);
  }
  public ManipulateString = () => {
    if (this.result.result === 'nogo') {
      this.finalString =
        'The value for the ' + this.selectedProperty + ' is ' + this.result.value + ' and it doesnot pass the Outset';
    } else {
      this.finalString = 'The value for the ' + this.selectedProperty + ' is ' + this.result.value + ' and it does pass the Outset';
    }
  }
  public errorHandling(err) {
    this.clickOnX();
    alert(err.error.message);
    console.log(err);
  }
  ngOnInit() {
    this.finalString = 'Processing';
    // if (this.selectedProperty === 'Code Complexity') {
    this.httpService.getData(this.passedValue, this.selectedProperty).subscribe(
      data => this.result = data,
      err => this.errorHandling(err),
      () => this.ManipulateString()
    );
    //   } else if (this.selectedProperty === 'Code Coverage') {
    //     this.httpService.getCodeCoverage(this.passedValue).subscribe(
    //       data => this.result = data,
    //       err => this.errorHandling(err),
    //       () => this.ManipulateString()
    //     );
    //   } else if (this.selectedProperty === 'Code Duplication') {
    //     this.httpService.getCodeDuplication(this.passedValue).subscribe(
    //       data => this.result = data,
    //       err => this.errorHandling(err),
    //       () => this.ManipulateString()
    //     );
    //   } else if (this.selectedProperty === 'Security') {
    //     this.httpService.getSecurity(this.passedValue).subscribe(
    //       data => this.result = data,
    //       err => this.errorHandling(err),
    //       () => this.ManipulateString()
    //     );
    //   } else if (this.selectedProperty === 'Compiler Warnings') {
    //     this.httpService.getWarnings(this.passedValue).subscribe(
    //       data => this.result = data,
    //       err => this.errorHandling(err),
    //       () => this.ManipulateString()
    //     );
    //   } else if (this.selectedProperty === 'Test Coverage') {
    //     this.httpService.getTest(this.passedValue).subscribe(
    //       data => this.result = data,
    //       err => this.errorHandling(err),
    //       () => this.ManipulateString()
    //     );
    //   }
  }

}
