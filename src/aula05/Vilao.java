package aula05;
import java.math.*;

public class Vilao {
	private int hp;
	private int def;
	private int atk;
	private String name;
	
	public int getHp(){
		return hp;
		
	}
	
	public void setStats(int level) {
		if(level == 1) {
			this.atk = 11;
			this.def = 10;
			this.hp = 30;
			this.name = "Cofee Devil";
		}
	}
	
	public void takeDamage(int ata, String name) {
		double i = 0;
		i = Math.round((ata -(def*0.3)));
		this.hp -= Math.round((ata -(def*0.3)));
		System.out.println("O personagem" + name + "infringiu " + i + "pontos de dano");
		
		
	}
	
	public void atacar(Personagem p) {
		p.takeDamage(this.atk, name);
	}
	
	public void getStats() {
		System.out.println("Vilão:" + name);
		System.out.println("Hp:" + hp);
	    System.out.println("Atk:" + atk);
	    System.out.println("Def:" + def);
	}
	
	public void lossDef() {
		double i = 0;
		i = Math.round(def * 0.3);
	}

}
