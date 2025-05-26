import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { Album } from '../../interface/album';
import { AlbumService } from '../../service/album.service';

@Component({
  selector: 'app-cad-album',
  imports: [CommonModule],
  templateUrl: './cad-album.component.html',
  styleUrl: './cad-album.component.css'
})
export class CadAlbumComponent {
  vetAlbum: Album[] = [];

  constructor(private albumService: AlbumService) {}

  buscaAlbuns(): void {
    /*this.vetAlbum = */this.albumService.findAll().subscribe(
      (pVetAlbum) => this.vetAlbum = pVetAlbum
    );
  }
}
