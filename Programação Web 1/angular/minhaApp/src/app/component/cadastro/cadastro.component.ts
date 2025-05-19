import { Component } from '@angular/core';
import { Pessoa } from '../../interface/pessoa';

@Component({
  selector: 'app-cadastro',
  imports: [],
  templateUrl: './cadastro.component.html',
  styleUrl: './cadastro.component.css'
})
export class CadastroComponent {
  pessoa: Pessoa = {
    nome: "Marcos",
    sobrenome: "Cardoso",
    cidade: "Blumenau"
  }

  vetPessoas: Pessoa[] = [
    {
      nome: "Marcos",
      sobrenome: "Cardoso",
      cidade: "Blumenau"
    },
    {
      nome: "Dalton",
      sobrenome: "Reis",
      cidade: "Blumenau"
    },
    {
      nome: "Alexander",
      sobrenome: "Valdemeri",
      cidade: "Indaial"
    }
  ]
}
