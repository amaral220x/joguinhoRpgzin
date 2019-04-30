package aula05;
import java.math.*;

public class Personagem {
	private String heroName;
	private String type;
	private int hp;
	private int def;
	private int atk;

	public void setStats() {
		if(type.equals("Ranged") || type.equals("ranged")) {
			this.hp = 20;
			this.def = 6;
			this.atk = 10;
		}
	}
	
	public int getHp(){
		return hp;
	}
	
	public int getDef() {
		return def;
	}
	
	public int getAtk() {
		return atk;
	}
	
	public String getName() {
		return heroName;
	}
	
	public void setName(String name) {
		this.heroName = name;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void getStats() {
		System.out.println("Nome do héroi:" + heroName);
		System.out.println("Classe do herói:" + type);
		System.out.println("Hp:" + hp);
	    System.out.println("Atk:" + atk);
	    System.out.println("Def:" + def);
	}
	
	public void atacar(Vilao v) {
		v.takeDamage(this.atk, this.heroName);
	}
	
	public void takeDamage(int ata, String name) {
		double i = 0;
		i = Math.round((ata -(def*0.3)));
		this.hp -= Math.round((ata -(def*0.3)));
		System.out.println("O personagem" + name + "infringiu " + i + "pontos de dano");
	}
	
	public void explorarDef(Vilao v) {
		v.lossDef();
	}
	

}
