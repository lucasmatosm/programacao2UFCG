package lp2.lab07;
// Lucas Matos de Medeiros
import java.util.ArrayList;

/**
Uma classe para guardar uma colecao de CDs
@version 1.00 16 de Dezembro de 2013
@author Lucas Matos de Medeiros
*/
public class MinhaCDteca {
private CD cd = new CD(null, null, null, 14);
private ArrayList<CD> coletania;
public MinhaCDteca(CD cd){
	this.cd = cd;
	coletania = new ArrayList<CD>();
	
}


/**
Adiciona um cd a colecao
*/

public void adicionaCD(){
	coletania.add(cd);
}
/**
adicona varios cds a colecao
*/
public void adicionaCDs(){
	
}
/**
Remove um cd da colecao
*/
public void removeCD(){
	coletania.remove(cd);
}
/**
Remove varios cds da colecao
*/
public void removeCDs(){
	
}
/**
Pesquisa um determinado cd da colecao
@param cd o cd a ser persquisado
@return se o cd esta na colecao ou nao
*/

public boolean pesquisaCD(CD cd){
	for (int i = 0; i < coletania.size(); i++) {
		if ((coletania.get(i)).equals(cd)){
			return true;
		}
	}
	return false;
}
/**
Informa a quantidade de cds
@return quantidade de cds
*/
public int numeroDeCDs(){
	return coletania.size();
}

@Override
public String toString() {
	return "MinhaCDteca [cd=" + cd + ", coletania=" + coletania + "]";
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	MinhaCDteca other = (MinhaCDteca) obj;
	if (cd == null) {
		if (other.cd != null)
			return false;
	} else if (!cd.equals(other.cd))
		return false;
	if (coletania == null) {
		if (other.coletania != null)
			return false;
	} else if (!coletania.equals(other.coletania))
		return false;
	return true;
}


}