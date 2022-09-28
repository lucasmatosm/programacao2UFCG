package lp2.lab07;

import java.util.ArrayList;

public class CD {
	private ArrayList<String> disco;
	private String artista, titulo, trilha_princ;
	private int m, Contador = 0;
public CD(String artista, String titulo, int m ){
	this.artista = artista;
	this.titulo = titulo;
	disco = new ArrayList<String>();
	this.m = m;
}
public CD(String artista, String titulo, String trilha_princ, int m){
	this.trilha_princ = trilha_princ;	
}
public ArrayList<String> getDisco() {
	return disco;
}
public String getArtista() {
	return artista;
}
public String getTitulo() {
	return titulo;
}
public String getTrilha_princ() {
	return trilha_princ;
}
public void setTrilha_princ(String trilha_princ) {
	this.trilha_princ = trilha_princ;
}

public String faixa(int j){
	for (int i = 0; i < disco.size(); i++){
		if (i != j)
			return null;
	}
	return disco.get(j);
}

public boolean Cadastro(String faixa){
	if (Contador <= m){
		disco.add(faixa);
		Contador++;
		return true;
	}	
	return false;
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	CD other = (CD) obj;
	if (artista == null) {
		if (other.artista != null)
			return false;
	} else if (!artista.equals(other.artista))
		return false;
	if (disco == null) {
		if (other.disco != null)
			return false;
	} else if (!disco.equals(other.disco))
		return false;
	if (titulo == null) {
		if (other.titulo != null)
			return false;
	} else if (!titulo.equals(other.titulo))
		return false;
	return true;
}
@Override
public String toString() {
	return "CD [disco=" + disco + ", artista=" + artista + ", titulo=" + titulo
			+ ", trilha_princ=" + trilha_princ + "]";
}


}