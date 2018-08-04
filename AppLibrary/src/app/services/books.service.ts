import { Injectable } from "@angular/core";
import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Book } from "../books/books";
import { Observable } from "rxjs";

@Injectable({
    providedIn: 'root'
})
export class BooksService{

    APIURL:string = 'http://localhost:8200/books'

    constructor(private http: HttpClient){

    }

    httpOptions = {
        headers: new HttpHeaders ({
          'Content-Type':  'application/json'
        })
      };

    public saveBook(book: Book):Observable<Book> {
        
        book.id = 0;
        return this.http.post<Book>(this.APIURL + '/addBook', book, this.httpOptions);
    }

    public updateBook(book){
        return this.http.put<Book>(this.APIURL + '/updateBook/' + book.id, book, this.httpOptions);
    }

    public deleteBook(id){
        return this.http.delete(this.APIURL + '/deleteBook/' + id, this.httpOptions);
    }

    public getBook(id){
        return this.http.get<Book>(this.APIURL + '/' + id);
    }

    public getAllBoks(){
       return this.http.get<Book[]>(this.APIURL);
    }

}