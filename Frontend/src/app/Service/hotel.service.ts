import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class HotelService {


  url="http://localhost:8080/api/v1/hotel"

  constructor(private httpClient:HttpClient) { }



  fetchAllHotel():Observable<any>{

    return this.httpClient.get<any>(this.url);
  }


  createHotel(hotel:any):Observable<any>{

   let headers=new HttpHeaders({
    "Content-Type":"application/json"
   });

    return this.httpClient.post<any>(this.url,hotel,{headers:headers});
  }





}
