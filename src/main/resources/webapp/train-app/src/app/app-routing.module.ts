import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {UserComponent } from './user/user.component';
import { VbookComponent } from './vbook/vbook.component';
import { AddtrainComponent } from './addtrain/addtrain.component';
import { BookorderComponent } from './bookorder/bookorder.component';
import { GetbookingdetailsComponent } from './getbookingdetails/getbookingdetails.component';
import { GetsearchdetailComponent } from './getsearchdetail/getsearchdetail.component';
import { GettrainComponent } from './gettrain/gettrain.component';
import { LoginComponent } from './login/login.component';
import { SavepaymentComponent } from './savepayment/savepayment.component';
import { SavepaymentorderidComponent } from './savepaymentorderid/savepaymentorderid.component';
import { SignupComponent } from './signup/signup.component';
import { UpdatetrainComponent } from './updatetrain/updatetrain.component';
import { AdminComponent } from './admin/admin.component';
import { AdminoptionComponent } from './adminoption/adminoption.component';
import { UseroptionComponent } from './useroption/useroption.component';




const routes: Routes = [
  {path:"user",component:UserComponent},
  {path:"vbook",component:VbookComponent},
  {path:"addtrain",component:AddtrainComponent},
  {path:"bookorder",component:BookorderComponent},
  {path:"getbookingdetails",component:GetbookingdetailsComponent},
  {path:"getsearchdetail",component:GetsearchdetailComponent},
  {path:"gettrain",component:GettrainComponent},
  {path:"login",component:LoginComponent},
  {path:"savepayment",component:SavepaymentComponent},
  {path:"savepaymentorderid",component:SavepaymentorderidComponent},
  {path:"signup",component:SignupComponent},
  {path:"updatetrain",component:UpdatetrainComponent},
  {path:"admin",component:AdminComponent},
  {path:"adminoption",component:AdminoptionComponent},
  {path:"useroption",component:UseroptionComponent},
  {path:"",component:SignupComponent},
 
 
  
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
