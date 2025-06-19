package br.com.ifpe.oxefood.modelo.cliente;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;



@Table(name = "Cliente")
@org.hibernate.annotations.SQLRestriction("habilitado = true")

@Builder
@Getter
@Setter
@AllArgsConstructor 
@Entity
public class EnderecoCliente {
 @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  
    @JsonIgnore
   @ManyToOne
   private Cliente cliente;

   @Column
   private String rua;

   @Column
   private String numero;

   @Column
   private String bairro;

    @Column
   private String cep;

   @Column
   private String cidade;

   @Column
   private String estado;

   @Column
   private String complemento;

   public void setHabilitado(Boolean true1) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setHabilitado'");
   }
  

}
