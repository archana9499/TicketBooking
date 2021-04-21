import { Component, OnInit } from '@angular/core';
import {HttpClientService,Train} from '../service/http-client.service';
import { HttpClient,HttpParams } from '@angular/common/http';

@Component({
  selector: 'app-addtrain',
  templateUrl: './addtrain.component.html',
  styleUrls: ['./addtrain.component.css']
})
export class AddtrainComponent implements OnInit {

  addtrain: any ;
  traininfo ={
   
    name:'',
    trainId:'',
    sourceStation:'',
    destinationStation:'',
    type:'',
    fare:'',
    distance:'',
    seats:'',
    arrives:'',
    departs:'',
    days:''
}
 
traininfos ={
   
  name:'tha',
  trainId:'321',
  sourceStation:'cbe',
  destinationStation:'edkhi',
  type:'suoer',
  fare:10,
  distance:1520,
  seats:8542,
  arrives:'sun',
  departs:'sat',
  days:14
}
  
  constructor(private httpClientService: HttpClientService,
    private http:HttpClient) { }
  


  ngOnInit(): void {
    
    
    
  }  
  

  addtrains(){
    console.log(this.traininfo);
    console.log(this.traininfos);
   
    this.httpClientService.add(this.traininfo).subscribe(data =>{
      console.log(data);
    })
/*
const headers ={
  'content-type':'application/json'

}
const body = JSON.stringify(this.traininfo);
console.log(body);
this.http.post('http://localhost:8080/addtrain',body,{'headers':headers});
*/
}

}
