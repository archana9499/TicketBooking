import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import{FormsModule} from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UserComponent } from './user/user.component';
import {HttpClientModule} from '@angular/common/http';
import { VbookComponent } from './vbook/vbook.component';
import { SignupComponent } from './signup/signup.component';
import { LoginComponent } from './login/login.component';
import { GettrainComponent } from './gettrain/gettrain.component';
import { GetsearchdetailComponent } from './getsearchdetail/getsearchdetail.component';
import { AddtrainComponent } from './addtrain/addtrain.component';
import { UpdatetrainComponent } from './updatetrain/updatetrain.component';
import { BookorderComponent } from './bookorder/bookorder.component';
import { GetbookingdetailsComponent } from './getbookingdetails/getbookingdetails.component';
import { SavepaymentComponent } from './savepayment/savepayment.component';
import { SavepaymentorderidComponent } from './savepaymentorderid/savepaymentorderid.component';
import { AdminComponent } from './admin/admin.component';
import { AdminoptionComponent } from './adminoption/adminoption.component';
import { UseroptionComponent } from './useroption/useroption.component'

@NgModule({
  declarations: [
    AppComponent,
    UserComponent,
    VbookComponent,
    SignupComponent,
    LoginComponent,
    GettrainComponent,
    GetsearchdetailComponent,
    AddtrainComponent,
    UpdatetrainComponent,
    BookorderComponent,
    GetbookingdetailsComponent,
    SavepaymentComponent,
    SavepaymentorderidComponent,
    AdminComponent,
    AdminoptionComponent,
    UseroptionComponent,
 
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
