package ma.commerce.domaine;

import java.util.List;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CategorieVo {
	private Long id;
	private String description;
//	private List<ProduitVo> produitVo =new ArrayList<ProduitVo>();
	
	public CategorieVo() {
	}

	public CategorieVo(String description, List<ProduitVo> produitVo) {
		super();
		this.description = description;
	//	this.produitVo = produitVo;
	}
	public CategorieVo(String description) {
		super();
		this.description = description;
	}

	public CategorieVo(Long id, String description, List<ProduitVo> produitVo) {
		super();
		this.id = id;
		this.description = description;
	//	this.produitVo = produitVo;
	}
	
//	public void addProduit (ProduitVo p) {
//		p.setCategorie(this);
//	//	produitVo.add(p);
//	}
	
}
