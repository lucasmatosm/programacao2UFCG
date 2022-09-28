package lp2.lab06;

import java.util.Arrays;

public class Robo {
	
	private static final String LIVRE = "livre", OCUPADO = "ocupado";
	private int passCount, energy;
	private Sala room;
	private int[] pos = new int[2];
	
	public Robo(int energia, Sala sala) throws Exception{
		
		if(energia <= 0){
			throw new Exception("Energia invalida");
		}
		if (sala == null){
			throw new Exception("Sala invalida");
		}
		
		energy = energia;
		room = sala;
		
		boolean checaSala = false;
		for (int i = 0; i < room.getNumPosicoesHorizontais(); i++){
			for (int j = 0; j < room.getNumPosicoesVerticais(); j++){
				if(room.isPosicaoLivre(i, j)){
					pos[0] = i;
					pos[1] = j;
					room.inserirObstaculo(pos[0], pos[1]);
					checaSala = true;
					break;
				}
				if(checaSala){
					break;
				}
			}
		}
		if (checaSala == false){
			throw new Exception("Sala cheia");
		}
	}
	
	public void moveCima() throws Exception{
		if(energy == 0){
			throw new Exception("Energia zerada");
		}
		try{
			if(room.isPosicaoLivre(pos[0]-1, pos[1])){
				room.setPosicao(pos[0],pos[1], LIVRE);
				pos[1]-=1;
				room.setPosicao(pos[0],pos[1], OCUPADO);
				energy -=1;
				passCount ++;
			
			}else{
				throw new Exception("Posicao ocupada");
			}
		
		}catch (Exception e){
			throw new Exception("Movimento invalido");
		}
		
	}
	
	public void moveBaixo() throws Exception{
		if(energy == 0){
			throw new Exception("Energia zerada");
		}
		try{
			if(room.isPosicaoLivre(pos[0]+1, pos[1])){
				room.setPosicao(pos[0],pos[1], LIVRE);
				pos[0]+=1;
				room.setPosicao(pos[0],pos[1], OCUPADO);
				energy -=1;
				passCount ++;
			
			}else{
				throw new Exception("Posicao ocupada");
			}

		}catch (Exception e){
			throw new Exception("Movimento invalido");
		}
	}
	
	public void moveFrente() throws Exception{
		if(energy == 0){
			throw new Exception("Energia zerada");
		}
		try{
			if(room.isPosicaoLivre(pos[0], pos[1]+1)){
				room.setPosicao(pos[0],pos[1], LIVRE);
				pos[1] += 1;
				room.setPosicao(pos[0],pos[1], OCUPADO);
				energy -= 1;
				passCount ++;
				
			}else{
				throw new Exception("Posicao ocupada");
			}		
		}catch (Exception e){
			throw new Exception("Movimento invalido");
		}
	}

	public void moveTras() throws Exception{
		if(energy == 0){
			throw new Exception("Energia zerada");
		}
		try {
			if(room.isPosicaoLivre(pos[0], pos[1]-1)){
				room.setPosicao(pos[0],pos[1], LIVRE);
				pos[1]-= 1;
				room.setPosicao(pos[0], pos[1], OCUPADO);
				energy -=1;
				passCount ++;
				
			}else{
				throw new Exception("Posicao ocupada");
			}
		} catch(Exception e) {
			throw new Exception("Movimento invalido");
		}		
	}		
	public int getNumPassos() {
		return passCount;
	}

	public int getEnergia() {
		return energy;
	}

	public String getPosicao() {
		return "[" + pos[0] + ", " + pos[1] + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Robo other = (Robo) obj;
		if (energy != other.energy)
			return false;
		if (passCount != other.passCount)
			return false;
		if (!Arrays.equals(pos, other.pos))
			return false;
		if (room == null) {
			if (other.room != null)
				return false;
		} else if (!room.equals(other.room))
			return false;
		return true;
	}
	
	

	
}
