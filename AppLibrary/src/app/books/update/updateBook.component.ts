import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { BooksService } from '../../services/books.service';

@Component({
    selector: 'app-updateBook',
    templateUrl: './updateBook.component.html'
})
export class UpdateBookComponent {

    book: any = {};
    id: any = null;

    constructor(private bookService: BooksService, private activatedRoute: ActivatedRoute, private route : Router) {
        console.log(this.activatedRoute.snapshot.params['id']);
        this.id = this.activatedRoute.snapshot.params['id'];

      
            this.bookService.getBook(this.id)
                .subscribe((lugar) => {
                    this.book = lugar;
                });
        
    }

    updateBook() {

        this.book.id = this.id;

        this.bookService.updateBook(this.book).subscribe(
            res => {
                this.route.navigateByUrl('books');
                });
    }

}