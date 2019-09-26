import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { Router } from '@angular/router';


@Component({
  selector: 'app-sidebar',
  templateUrl: './sidebar.component.html',
  styleUrls: ['./sidebar.component.css']
})
export class SidebarComponent implements OnInit {
  //  sidebarState: boolean;
  @Input() SidebarState = true;
  @Output() closeSidebar: EventEmitter<boolean> = new EventEmitter<boolean>();

  constructor(public router: Router) { }
  ngOnInit() {
  }
  public navigate(link) {
    this.router.navigate(link);
    this.closeClicked();
  }
  public closeClicked() {
    this.closeSidebar.emit(false);
  }

}
