package ma.commerce.domaine;

import java.util.ArrayList;
import java.util.List;

import ma.commerce.service.model.Categorie;


public class CategorieConverter {
	
	public static CategorieVo toVo(Categorie bo) {
		CategorieVo vo = new CategorieVo();
		vo.setId(bo.getId());
		vo.setDescription(bo.getDescription());
	//	vo.setProduitVo(ProduitConverter.toListVo(bo.getProduits()));
		return vo;
	}
	
	public static List<CategorieVo> toListVo(List<Categorie> bos) {
		List<CategorieVo> result=new ArrayList<CategorieVo>();
		for (Categorie bo : bos) {
			result.add(toVo(bo));
		}
		return result;
	}
	
	public static Categorie toBo(CategorieVo vo) {
		Categorie bo = new Categorie();
		bo.setId(vo.getId());
		bo.setDescription(vo.getDescription());
		return bo;
	}
	
}
