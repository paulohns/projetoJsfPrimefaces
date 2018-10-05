package br.com.exemplo.bean;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

//@ManagedBean é a anotation que mapeia a classe java como um bean(recebe os valores da tela para tratar 
// e depois salvar num banco de dados, arquivo ou enviar para um webservice)
//#{maskView.date} #{maskView.phone}
@ManagedBean(name = "maskView")
//@ViewScoped é o escopo em que a página ira funcionar
//poderia dizer que é de sessão então os dados ficariam salvos na sessão do usuário
// procura entender melhor cada tipo de escopo
@ViewScoped
public class MaskView {

	// atributos que farão binding com a tela (.xhtml)
	// é necessário ter os métodos get(getDate()) e set(setDate(String date)) de
	// cada atributo para funcionar
	private String date;
	private String phone;
	private String phoneExt;
	private String taxId;
	private String ssn;
	private String productKey;

	@PostConstruct
	public void init() {
		System.out.println("Este metodo inicia após a crontrução da classe e chamada na tela, "
				+ "aqui pode setar/passar alguma informação para inicio da tela");
	}
	
	//metodo chamado na ação do botão na tela
	public void salvarDados() {
		System.out.println(date);
		System.out.println(phone);
		System.out.println(phoneExt);
		System.out.println(taxId);
		System.out.println(ssn);
		System.out.println(productKey);
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhoneExt() {
		return phoneExt;
	}

	public void setPhoneExt(String phoneExt) {
		this.phoneExt = phoneExt;
	}

	public String getTaxId() {
		return taxId;
	}

	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getProductKey() {
		return productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
	}
}