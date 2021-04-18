import { Component, OnInit } from '@angular/core';
import {HttpClientService,Train} from '../service/http-client.service';
import { HttpClient,HttpParams } from '@angular/common/http';

@Component({
  selector: 'app-addtrain',
  templateUrl: './addtrain.component.html',
  styleUrls: ['./addtrain.component.css']
})
export class AddtrainComponent implements OnInit {

  addtrain: any;
  
  
  constructor(private httpClientService: HttpClientService) { }
  


  ngOnInit(): void {
    
    this.httpClientService.getsearchdetail().subscribe(
      response => this.handleSuccessfulResponse(response),
    );
  }
  handleSuccessfulResponse(response) {
    this.addtrain = response;
}


}
