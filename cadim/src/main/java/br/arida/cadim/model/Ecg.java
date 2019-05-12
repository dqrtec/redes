package br.arida.cadim.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "ecg")
public class Ecg implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ecg_id;

	private Integer pac_id;
	private String ecg_file;
	private Double imc;
	private char marcapasso;
	private Integer pressao_sistolica;
	private char cancer;
	private Integer pressao_diastolica;
	private char tabagismo;
	private char alcoolosmo;
	private char sincope;
	private char sedentarismo;
	private java.util.Date data_hora;
	private char fibrilacao_flutter;
	private char avc;
	public Integer getEcg_id() {
		return ecg_id;
	}
	public void setEcg_id(Integer ecg_id) {
		this.ecg_id = ecg_id;
	}
	public Integer getPac_id() {
		return pac_id;
	}
	public void setPac_id(Integer pac_id) {
		this.pac_id = pac_id;
	}
	public String getEcg_file() {
		return ecg_file;
	}
	public void setEcg_file(String ecg_file) {
		this.ecg_file = ecg_file;
	}
	public Double getImc() {
		return imc;
	}
	public void setImc(Double imc) {
		this.imc = imc;
	}
	public char getMarcapasso() {
		return marcapasso;
	}
	public void setMarcapasso(char marcapasso) {
		this.marcapasso = marcapasso;
	}
	public Integer getPressao_sistolica() {
		return pressao_sistolica;
	}
	public void setPressao_sistolica(Integer pressao_sistolica) {
		this.pressao_sistolica = pressao_sistolica;
	}
	public char getCancer() {
		return cancer;
	}
	public void setCancer(char cancer) {
		this.cancer = cancer;
	}
	public Integer getPressao_diastolica() {
		return pressao_diastolica;
	}
	public void setPressao_diastolica(Integer pressao_diastolica) {
		this.pressao_diastolica = pressao_diastolica;
	}
	public char getTabagismo() {
		return tabagismo;
	}
	public void setTabagismo(char tabagismo) {
		this.tabagismo = tabagismo;
	}
	public char getAlcoolosmo() {
		return alcoolosmo;
	}
	public void setAlcoolosmo(char alcoolosmo) {
		this.alcoolosmo = alcoolosmo;
	}
	public char getSincope() {
		return sincope;
	}
	public void setSincope(char sincope) {
		this.sincope = sincope;
	}
	public char getSedentarismo() {
		return sedentarismo;
	}
	public void setSedentarismo(char sedentarismo) {
		this.sedentarismo = sedentarismo;
	}
	public java.util.Date getData_hora() {
		return data_hora;
	}
	public void setData_hora(java.util.Date data_hora) {
		this.data_hora = data_hora;
	}
	public char getFibrilacao_flutter() {
		return fibrilacao_flutter;
	}
	public void setFibrilacao_flutter(char fibrilacao_flutter) {
		this.fibrilacao_flutter = fibrilacao_flutter;
	}
	public char getAvc() {
		return avc;
	}
	public void setAvc(char avc) {
		this.avc = avc;
	}
}
