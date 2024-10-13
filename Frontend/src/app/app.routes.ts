import { Routes } from '@angular/router';
import { BookComponent } from './Pages/book/book.component';
import { CreatebookComponent } from './Pages/book/createbook/createbook.component';

export const routes: Routes = [
    {path:"",component:BookComponent},
    {path:"viewbook",component:BookComponent},
    {path:"createbook",component:CreatebookComponent},
 
];
