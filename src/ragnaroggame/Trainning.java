/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ragnaroggame;

/**
 *
 * @author acer
 */
public class Trainning {
    private String name;
	private float restoreValue;
	private int type;
        private float plusAttack;

	public Trainning(int type){
		this.type = type;
		switch(type){
			case 0: this.name = "Walk";
				this.restoreValue = 10;
                                this.plusAttack = 5;
				break;
			case 1: this.name = "Run";
				this.restoreValue = 15;
                                this.plusAttack = 10;
				break;
			case 2: this.name = "Swim";
				this.restoreValue = 20;
                                this.plusAttack = 15;
				break;
		}

	}

	public String getName(){
		return this.name;
	}

	public float getRestoreValue(){
		return this.restoreValue;
	}
        
        public float getplusAttack(){
            return this.plusAttack;
        }
}
