package br.com.ifpe.oxefood.api.categoriaProduto;

import br.com.ifpe.oxefood.modelo.categoriaProduto.CategoriaProduto;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoriaProdutoRequest {

   @NotNull(message = "O Nome é de preenchimento obrigatório")
   @NotEmpty(message = "O Nome é de preenchimento obrigatório")
   private String descricao; 

   public CategoriaProduto build() {

       return CategoriaProduto.builder()
           .descricao(descricao)
         .build();
   }

}

