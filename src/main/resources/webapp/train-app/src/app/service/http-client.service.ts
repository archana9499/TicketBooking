import { Injectable } from '@angular/core';

import { HttpClient, HttpParams } from '@angular/common/http';

export class Train {
  constructor(
    public  id: string,
    public  name: string,
    public  trainId: string,
    public  sourceStation: string,
    public  destinationStation: string,
    public  type: string,
    public  fare: string,
    public  distance: string,
    public  seats: string,
    public  arrives: string,
    public  departs: string,
    public  days: string,
  ) {
  }
}

// This is a service class
@Injectable({
  providedIn: 'root'
})

export class HttpClientService{

  constructor(
    private httpClient: HttpClient
  ) { }

 

getsearchdetail(){
  console.log('Test Call');
  return this.httpClient.get<any>('http://localhost:8080/getsearchdetails');
}

getProducts(){
  console.log('Test Call');
  return this.httpClient.get<Train[]>('http://localhost:8080/gettrains');
}

getAddtrain(){
  console.log('Test Call');
  return this.httpClient.post<any>('http://localhost:8080/gettrains');
}




}


export class User {
  constructor(
    public  id: string,
    public  emailId: string,
    public  name: string,
    public  password: string,
    public  mobileNo: string,
    public  dateOfBirth: string,
    
  ) {
  }
}

export class Vbook {
  constructor(
    public  id: string,
    public  name: string,
    public  trainId: string,
    public  sourceStation: string,
    public  destinationStation: string,
    public  fare: string,
  ) {
  }
}




