package ma.commerce.domaine;

import java.util.ArrayList;
import java.util.List;

import ma.commerce.service.model.Panier;

public class PanierConverter {
	public static PanierVo toVo(Panier bo) {
		if (bo == null || bo.getId() ==null)
			return null;
		PanierVo vo = new PanierVo();
		vo.setId(bo.getId());
		vo.setDate(bo.getDate());
		vo.setTotal(bo.getTotal());
		vo.setProduits(ProduitConverter.toListVo(bo.getProduits()));
		vo.setUsername(bo.getUsername());
		//
	//	vo.setImage(DataBaseFileConverter.toVo(bo.getImage()));
		return vo;
	}
	public static Panier toBo(PanierVo vo) {
		Panier bo = new Panier();
		bo.setId(vo.getId());
		bo.setDate(vo.getDate());
		bo.setTotal(vo.getTotal());
		bo.setProduits(ProduitConverter.toListBo(vo.getProduits()));
		bo.setUsername(vo.getUsername());
		return bo;
	}
	public static List<PanierVo> toListVo(List<Panier> listBo) {
		List<PanierVo> listVo = new ArrayList<>();
		for (Panier panier : listBo) {
			listVo.add(toVo(panier));
		}
		return listVo;
	}
}
