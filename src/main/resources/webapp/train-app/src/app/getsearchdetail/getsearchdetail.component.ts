import { Component, OnInit } from '@angular/core';
import {HttpClientService,Train} from '../service/http-client.service';
import { HttpClient,HttpParams } from '@angular/common/http';


@Component({
  selector: 'app-getsearchdetail',
  templateUrl: './getsearchdetail.component.html',
  styleUrls: ['./getsearchdetail.component.css']
})
export class GetsearchdetailComponent implements OnInit {


  searchdetail: any;
  constructor(private httpClientService: HttpClientService) { }

  ngOnInit(): void {
    this.httpClientService.getsearchdetail().subscribe(
      response => this.handleSuccessfulResponse(response),
    );
  }
  handleSuccessfulResponse(response) {
    this.searchdetail = response;
}
getValues(val){
console.warn(val);
}
}
