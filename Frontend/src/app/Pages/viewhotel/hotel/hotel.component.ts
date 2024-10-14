import { Component } from '@angular/core';

import { HttpClient } from '@angular/common/http';


import { RouterOutlet } from '@angular/router';
import { HeaderComponent } from '../../../Component/header/header.component';
import { Hotel } from '../../../interface/HotelResponse';
import { HotelService } from '../../../Service/hotel.service';
import { FormControl, FormGroup, Validators } from '@angular/forms';


@Component({
  selector: 'app-hotel',
  standalone: true,
  imports: [HeaderComponent,RouterOutlet],
  templateUrl: './hotel.component.html',
  styleUrl: './hotel.component.css'
})
export class HotelComponent {

  hotels:Hotel[]=[]

 constructor(private hotelService:HotelService,private httpCleint:HttpClient){}

  city=new FormControl("",[Validators.required]);

  
  hotelForm= new FormGroup({
    city:this.city, 
  })


ngOnInit():void{

  this.hotelService.fetchAllHotel().subscribe((response)=>{
    console.log(response);
    this.hotels=response.data;
  })

}






}
