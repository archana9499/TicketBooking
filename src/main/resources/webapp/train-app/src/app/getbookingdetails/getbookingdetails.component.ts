import { Component, OnInit } from '@angular/core';
import {HttpClientService,Vbook} from '../service/http-client.service';

@Component({
  selector: 'app-getbookingdetails',
  templateUrl: './getbookingdetails.component.html',
  styleUrls: ['./getbookingdetails.component.css']
})
export class GetbookingdetailsComponent implements OnInit {


  bookingdetails: Vbook[];
  constructor(private httpClientService: HttpClientService) { }

  ngOnInit(): void {
    
  }
  

}
