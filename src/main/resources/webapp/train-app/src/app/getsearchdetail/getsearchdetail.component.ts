import { Component, OnInit } from '@angular/core';
import {HttpClientService,Train} from '../service/http-client.service';
import { HttpClient,HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';




@Component({
  selector: 'app-getsearchdetail',
  templateUrl: './getsearchdetail.component.html',
  styleUrls: ['./getsearchdetail.component.css']
})
export class GetsearchdetailComponent implements OnInit {
 // train: Train = new Train("","","","","","","","","","","","");
  
 id:string;
 name:string;
 trainId:string;
 sourceStation:string;
 destinationStation:string;
 trainType:string;
 fare:string;
 distance:string;
 seats:string;
 arrives:string;
 departs:string;
 day:string;
 message:any

trains:any={
  message:'',
  list:[]
}

;

  searchdetail: any;
  constructor(private service:HttpClientService) { }

  ngOnInit(): void {
   
  }

  /*
  dogetsearchtrain(){
     let resp = this.service.getsearchtrain();
      /*,this.destinationStation,this.trainType,this.day);
      resp.subscribe(data=>this.trains=data);
    }
    */


    fn(){
      this.service.getsearchtrain(this.sourceStation,this.destinationStation,this.trainType,this.day).subscribe(data=>{
        console.log(data);
         this.trains=data;})
    }
    //below commented out earlier

  handleSuccessfulResponse(response) {
    this.trains = response;}
getValues(val){
console.warn(val);
}
  }