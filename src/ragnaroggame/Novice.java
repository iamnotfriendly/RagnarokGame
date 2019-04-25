
package ragnaroggame;


public class Novice {
    public final double maxHealth;
	protected double health,exp,hungry;
	protected String name;
	protected double attackSkill;
        
        
	public Novice(String name, double maxHealth ,double exp){
		this.name = name;
                this.exp = 0; 
		this.health = maxHealth;
		this.maxHealth = maxHealth;
                this.attackSkill = 50.0;
                this.hungry = maxHealth;
	}
        
        public double getExp(){
		return this.exp;
	}
        
        public double getHungry(){
		return this.hungry;
	}
        
        public double getSkill(){
		return this.attackSkill;
	}
        
        public void setExp(double exp){
		this.exp = exp;
	}

	public double getHealth(){
		return this.health;
	}

	public String getName(){
		return this.name;
	}
	
	public void eat(Food food){
		this.health += food.getRestoreValue();
		this.hungry += food.getHungry();
                if(this.hungry > this.maxHealth)
                        this.hungry = this.maxHealth;
                if(this.health > this.maxHealth )
			this.health = this.maxHealth;
                
	}
        
        public void excercise(Trainning ex){
            if(this.health- (ex.getRestoreValue()/5.0) <=0){
                this.health = 1;
            }
            else{
                this.health -= ex.getRestoreValue()/5.0; 
                this.hungry -= ex.getRestoreValue()/5.0;
                this.exp += ex.getplusAttack()/5.0;
            }
            this.attackSkill += 5.0;    
	}
        
	
	public void injure(){
		this.reducedHealth(health);
	}

	public void reducedHealth(double value){
		this.health -= value;
                this.hungry -= 6;
		if(this.health < 0)
			this.health = 0;  
	}
	public void run(){
		this.reducedHealth(10);
	}

	public void walk(){
		this.reducedHealth(1);
	}
        
        public void swim(){
		this.reducedHealth(5);
	}
         
}
