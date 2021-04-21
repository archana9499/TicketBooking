import { Injectable } from '@angular/core';

/*import { HttpClient, HttpParams } from '@angular/common/http';*/
import{HttpClient, HttpHeaders} from '@angular/common/http';

export class Train {
  constructor(
    public  id: string,
    public  name: string,
    public  trainId: string,
    public  sourceStation: string,
    public  destinationStation: string,
    public  trainType: string,
    public  fare: string,
    public  distance: string,
    public  seats: string,
    public  arrives: string,
    public  departs: string,
    public  day: string,
  ) {
  }
}

// This is a service class
@Injectable({
  providedIn: 'root'
})

export class HttpClientService{

  constructor(
    private http: HttpClient
  ) { }

 

public getsearchtrain(sourceStation:any,destinationStation:any,trainType:any,day:any){
  let url="'http://localhost:8080/getsearchdetails?sourceStation='+sourceStation+'&destinationStation='+destinationStation+'&trainType='+trainType+'&day='+day'";
 console.log(url);
  return this.http.get('http://localhost:8080/getsearchdetails?sourceStation='+sourceStation+'&destinationStation='+destinationStation+'&trainType='+trainType+'&day='+day);
}

getsearchdetail(){
 console.log('Test Call');
  return this.http.get<any>('http://localhost:8080/getsearchdetails');
}

getProducts(){
  console.log('Test Call');
  return this.http.get<Train[]>('http://localhost:8080/gettrains');
}

add(traininfo:any){
  const headers ={
    'content-type':'application/json'
  
  }
  const body = JSON.stringify(traininfo);
  console.log(body);
  return this.http.post('http://localhost:8080/addtrain',body,{'headers':headers});
  
  }

  book(traininfo:any){
    const headers ={
      'content-type':'application/json'
    
    }
    const body = JSON.stringify(traininfo);
    console.log(body);
    return this.http.post('http://localhost:8080/book',body,{'headers':headers});
    
    }

    savepay(traininfo:any){
      const headers ={
        'content-type':'application/json'
      
      }
      const body = JSON.stringify(traininfo);
      console.log(body);
      return this.http.post('http://localhost:8081/savePayment',body,{'headers':headers});
      
      }

  checkLogin(traininfo:any){
    const headers ={
      'content-type':'application/json'
    
    }
    const body = JSON.stringify(traininfo);
    console.log(body);
    return this.http.post('http://localhost:8080/Login',body,{'headers':headers});
    
    }

    signUp(traininfo:any){
      const headers ={
        'content-type':'application/json'
      
      }
      const body = JSON.stringify(traininfo);
    console.log(body);
    return this.http.post('http://localhost:8080/register',body,{'headers':headers});
    
    }

  public getbooktrain(sourceStation:any,destinationStation:any,name:any,trainId:any,fare:any){
    let url="'http://localhost:8080/getbookingdetails?sourceStation='+sourceStation+'&destinationStation='+destinationStation+'&name='+name+'&trainId='+trainId+'&fare='+fare'";
   console.log(url);
    return this.http.get('http://localhost:8080/getbookingdetails?sourceStation='+sourceStation+'&destinationStation='+destinationStation+'&name='+name+'&trainId='+trainId+'&fare='+fare);
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




