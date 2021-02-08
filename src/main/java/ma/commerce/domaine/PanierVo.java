package ma.commerce.domaine;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@NoArgsConstructor
@AllArgsConstructor
public class PanierVo {

	private Long id;
	private String date;
//	private String usermail;	
	private List<ProduitVo> produits=new ArrayList<ProduitVo>();
	private double total;
	private String username ;
	
	public PanierVo(String date, List<ProduitVo> produits) {
		super();
		this.date = date;
		this.produits = produits;
		this.total = 0;
	}
	
	
}
