import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { HotelComponent } from './Pages/viewhotel/hotel/hotel.component';



@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,HotelComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'BookFrontend';
}
