package br.com.ifpe.oxefood.modelo.livro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class LivroService {
    @Autowired
   private LivroRepository repository;

   @Transactional
   public Livro save(Livro livro) {

       livro.setHabilitado(Boolean.TRUE);
       return repository.save(livro);
   }
   
   public List<Livro> listarTodos() {
  
    return repository.findAll(); //SELECT * FROM Livro
}

public Livro obterPorID(Long id) {

    return repository.findById(id).get();
}

@Transactional
   public void update(Long id, Livro livroAlterado) {

      Livro livro = repository.findById(id).get();
      livro.setNome(livroAlterado.getNome());
      livro.setDataDeLançamento(livroAlterado.getDataDeLançamento());
      livro.setPaginas(livroAlterado.getPaginas());
        
      repository.save(livro);
  }

  @Transactional
  public void delete(Long id) {

      Livro livro = repository.findById(id).get();
      livro.setHabilitado(Boolean.FALSE);

      repository.save(livro);
  }


}
