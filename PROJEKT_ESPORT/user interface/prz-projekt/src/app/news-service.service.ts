import { Injectable } from '@angular/core';
import { News} from './news';
import { Observable, of } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class NewsServiceService {

  newsToken: string = '';

  constructor(private http: HttpClient) { }

  getMyNews(): Observable<News[]> {
    console.log('getNewses');
    return this.http.get<News[]>('http://localhost:2990/news/get/10');
  }

}

