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
  // tslint:disable-next-line: variable-name

  constructor(private httpService: HttpServicesService, private fb: FormBuilder) { }
  public Calculate: FormGroup = this.fb.group({
    name: ['', Validators.required],
    URL: ['', Validators.required]
  });
  ngOnInit(): void {
    console.log(this.Calculate);
  }
  public createAlert = (str) => {
    alert(str);
  }
  public onCalculate = () => {
    this.presenceofURL.emit(true);
    let result = null;
    this.httpService.sendURL(this.Calculate.value).subscribe(
      data => { result = data; },
      err => console.log(err),
      () => console.log(result)
    );

  }
}
