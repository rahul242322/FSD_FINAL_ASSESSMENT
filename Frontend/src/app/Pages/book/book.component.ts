import { Component } from '@angular/core';
import { BookService } from '../../Service/book.service';
import { HttpClient } from '@angular/common/http';
import { Book } from '../../interface/BookResponse';
import { HeaderComponent } from '../../Component/header/header.component';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-book',
  standalone: true,
  imports: [HeaderComponent,RouterOutlet],
  templateUrl: './book.component.html',
  styleUrl: './book.component.css'
})
export class BookComponent {

  books:Book[]=[]

constructor(private bookSerivce:BookService,private httpCleint:HttpClient){}


ngOnInit():void{

  this.bookSerivce.fetchAllBook().subscribe((response)=>{
    console.log(response);
    this.books=response.data;
  })

}






}
