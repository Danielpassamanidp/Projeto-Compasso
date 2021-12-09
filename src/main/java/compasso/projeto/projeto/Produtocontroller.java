package compasso.projeto.projeto;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import antlr.collections.List;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class Produtocontroller {
	
	@Autowired
	ProdutoRepository repository;
	
	@GetMapping("/products")
	public ArrayList<produto> getAllProdutos(){
		return (ArrayList<produto>)repository.findAll();
	}
	
	@GetMapping("/products/{id}")
	public produto getprodutoById(@PathVariable Long id) {
		return repository.findById(id).get();
	}
	
	@PostMapping("/products")
	public produto saveproduto(@RequestBody produto products) {		
		return repository.save(products);
	}
    
	@PutMapping("/products")
	public produto atualizaproduto(@RequestBody produto products) {
		return repository.save(products);
	}
	
	@DeleteMapping("/products/{id}")
	public void deleteproduto(@PathVariable Long id) { 
	}
	
	
}