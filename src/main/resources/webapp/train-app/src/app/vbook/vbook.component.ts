import { Component, OnInit } from '@angular/core';
import {HttpClientService,Vbook} from '../service/http-client.service';

@Component({
  selector: 'app-vbook',
  templateUrl: './vbook.component.html',
  styleUrls: ['./vbook.component.css']
})
export class VbookComponent implements OnInit {


  bookingdetails: Vbook[];
  constructor(private httpClientService: HttpClientService) { }

  ngOnInit(): void {

    
  }
  

}
