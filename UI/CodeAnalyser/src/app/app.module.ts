import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {RouterModule} from '@angular/router';
import { AppComponent } from './app.component';
import { AddressBarComponent } from './components/address-bar/address-bar.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { ModalComponent } from './components/modal/modal.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { SidebarComponent } from './components/sidebar/sidebar.component';
import { HomeComponent } from './components/home/home.component';
import { MenuComponent } from './components/menu/menu.component';
import {SpinnerModule} from './services/spinner/spinner.module';
@NgModule({
  declarations: [
    AppComponent,
    AddressBarComponent,
    DashboardComponent,
    ModalComponent,
    SidebarComponent,
    HomeComponent,
    MenuComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    SpinnerModule,
    RouterModule.forRoot([
      { path:  '', component:  HomeComponent},
      { path:  'dashboard', component:  DashboardComponent}


    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})

export class AppModule { }
