import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Component } from '@angular/core';
import { AppComponent } from './app.component';
import { BooksService } from './services/books.service';
import { BooksComponent } from './books/books.component';
import { Routes, RouterModule } from "@angular/router";
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AddBookComponent } from './books/add/addBook.component';
import { UpdateBookComponent } from './books/update/updateBook.component';

const appRoutes: Routes =[

{path : '', component : BooksComponent},
{path : 'books', component : BooksComponent},
{path : 'addBook/:id', component : AddBookComponent},
{path : 'updateBook/:id', component : UpdateBookComponent}

];


@NgModule({
  declarations: [
    AppComponent,
    BooksComponent,
    AddBookComponent,
    UpdateBookComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot(appRoutes),
  ],
  providers: [BooksService],
  bootstrap: [AppComponent]
})
export class AppModule { }
