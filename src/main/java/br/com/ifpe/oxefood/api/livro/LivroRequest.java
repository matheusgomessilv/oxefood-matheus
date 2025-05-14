package br.com.ifpe.oxefood.api.livro;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.ifpe.oxefood.modelo.livro.Livro;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LivroRequest {

   private String nome; 

@JsonFormat(pattern = "dd/MM/yyyy")
   private LocalDate dataDeLançamento;

   private String paginas;

   public Livro build() {

       return Livro.builder()
           .nome(nome)
           .dataDeLançamento(dataDeLançamento) 
           .paginas(paginas)
           .build();
   }

}
