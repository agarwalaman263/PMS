import { Component, Output, EventEmitter, OnInit, OnChanges, SimpleChanges } from '@angular/core';
import { HttpServicesService } from './../../services/http-services.service';
import { FormBuilder, Validators, FormGroup } from '@angular/forms';
import { SpinnerService } from 'src/app/services/spinner/spinner.service';
import { take, finalize } from 'rxjs/operators';

@Component({
  selector: 'app-address-bar',
  templateUrl: './address-bar.component.html',
  styleUrls: ['./address-bar.component.css']
})
export class AddressBarComponent implements OnInit {
  @Output() presenceofURL: EventEmitter<boolean> = new EventEmitter<boolean>();

  constructor(private httpService: HttpServicesService, private fb: FormBuilder, private spinner: SpinnerService) { }
  public Calculate: FormGroup = this.fb.group({
    name: ['', Validators.required],
    URL: [''],
    GIT: ['']
  });
  ngOnInit(): void {
  }
  public createAlert = (str) => {
    alert(str);
  }
  public emitter(bool) {
    this.presenceofURL.emit(bool);
  }
  public onCalculate = () => {

    let result = null;
    this.spinner.show();
    this.httpService.sendURL(this.Calculate.value).pipe(finalize(() => this.spinner.hide()),
    ).subscribe(
      data => result = data,
      err => {
        console.log(err);
        alert('Error Occured, Kindly Try again with correct URL');
      },
      () => {
        alert('Calibration Successful.');
        this.emitter(true);
      }
    );
  }
}
