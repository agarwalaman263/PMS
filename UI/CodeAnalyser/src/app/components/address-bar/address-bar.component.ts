import { Component, Output, EventEmitter, OnInit, OnChanges, SimpleChanges } from '@angular/core';
import { HttpServicesService } from './../../services/http-services.service';
import { FormBuilder, Validators, FormGroup } from '@angular/forms';
@Component({
  selector: 'app-address-bar',
  templateUrl: './address-bar.component.html',
  styleUrls: ['./address-bar.component.css']
})
export class AddressBarComponent implements OnInit {
  @Output() presenceofURL: EventEmitter<boolean> = new EventEmitter<boolean>();

  constructor(private httpService: HttpServicesService, private fb: FormBuilder) { }
  public Calculate: FormGroup = this.fb.group({
    name: ['', Validators.required],
    URL: ['', Validators.required]
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
    this.httpService.sendURL(this.Calculate.value).subscribe(
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
