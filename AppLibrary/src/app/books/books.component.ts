import { Component, OnInit } from '@angular/core';
import { BooksService } from '../services/books.service';
import { Book } from './books';

@Component({
    selector: 'app-books',
    templateUrl: './books.component.html'
})
export class BooksComponent implements OnInit {

    books: Book[];

    ngOnInit() {
        this.getAllBooks();
    }


    constructor(private booksService: BooksService) {

    }

    getAllBooks() {
        this.booksService.getAllBoks()
            .subscribe(books => this.books = books
            );
    }

    deleleBook(id){
        this.booksService.deleteBook(id).subscribe(
            data => {
                console.log("PATCH Request is successful ", data);

                this.getAllBooks();
            },
            error => {
                console.log("Error", error);
            }
        );    
    }
}