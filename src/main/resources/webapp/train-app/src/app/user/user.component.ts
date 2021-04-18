import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import {HttpClientService,Train} from '../service/http-client.service';


@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {


  products: Train[];

  constructor(private httpClientService: HttpClientService) { }

  ngOnInit() : void{

    this.httpClientService.getProducts().subscribe(
      response => this.handleSuccessfulResponse(response),
    );
  }
  handleSuccessfulResponse(response) {
    this.products = response;
}
}










