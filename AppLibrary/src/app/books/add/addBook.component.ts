import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { BooksService } from '../../services/books.service';


@Component({
    selector: 'app-addBook',
    templateUrl: './addBook.component.html'
})
export class AddBookComponent {

    book: any = {};
    id: any = null;

    constructor(private bookService: BooksService, private route: Router) {

    }

    saveBook() {
        this.bookService.saveBook(this.book).subscribe(
            res => {
                this.route.navigateByUrl('books');
            });
       
    }
}

