import { Component } from '@angular/core';
import { BookService } from '../../../Service/book.service';
import { HttpClient } from '@angular/common/http';
import { FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { Observable } from 'rxjs';
import { HeaderComponent } from "../../../Component/header/header.component";

@Component({
  selector: 'app-createbook',
  standalone: true,
  imports: [ReactiveFormsModule,HeaderComponent],
  templateUrl: './createbook.component.html',
  styleUrl: './createbook.component.css'
})
export class CreatebookComponent {



  constructor(private bookserivce:BookService,private httpClient:HttpClient){}

  name=new FormControl("",[Validators.required]);

  author=new FormControl("",[Validators.required]);

  price=new FormControl("",[Validators.required]);


  bookForm= new FormGroup({

    name:this.name,
    author:this.author,
    price:this.price

  })



  createBook(){

    if(this.bookForm.valid){
     
      this.bookserivce.createBook(this.bookForm.value).subscribe((response)=>{
        console.log(response);
        this.bookForm.reset();
      })

    }
  }

  get f(){

    return this.bookForm.controls;
  }



    

  }






