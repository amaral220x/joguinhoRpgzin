package aula05;
import java.util.*;

public class Jogo {

	public void inicio (Personagem p, Vilao v){
		Scanner s = new Scanner(System.in);
		//criando personagem
		System.out.println("Olá, entre com o seu nome de personagem");
		p.setName(s.nextLine());
		System.out.println("Agora entre com o seu tipo ");
		System.out.println("Tipos disponíveis: Ranged");
		p.setType(s.nextLine());
		p.setStats();
		p.getStats();
		//criando vilao
		v.setStats(1);
		v.getStats();
		
	}

	public void rodada(Personagem p, Vilao v){
		while((p.getHp() > 0) && (v.getHp() > 0)) {
			for(int i = 0; i < 50; i++) {
				System.out.println();
			}
		}	
		p.getStats();
		v.getStats();
	}
}
