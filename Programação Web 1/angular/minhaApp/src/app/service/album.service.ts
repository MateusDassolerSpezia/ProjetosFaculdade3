import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Album } from '../interface/album';

@Injectable({
  providedIn: 'root'
})
export class AlbumService {

  constructor(private httpClient: HttpClient) { }

  findAll(): Observable<Album[]> {
    return this.httpClient.get<Album[]>('https://jsonplaceholder.typicode.com/albums');
  }
}
