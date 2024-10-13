import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class BookService {


  url="/api/v1/book"

  constructor(private httpClient:HttpClient) { }



  fetchAllBook():Observable<any>{

    return this.httpClient.get<any>(this.url);
  }


  createBook(book:any):Observable<any>{

   let headers=new HttpHeaders({
    "Content-Type":"application/json"
   });

    return this.httpClient.post<any>(this.url,book,{headers:headers});
  }





}
