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
public class Food {
        private String name;
	private float restoreValue;
	private int type;
        private float restoreHungry;
        
        public Food(int type){
		this.type = type;
		switch(type){
			case 0: this.name = "Fried Chicken";
				this.restoreValue = 10;
                                this.restoreHungry = 10;
				break;
			case 1: this.name = "Rainbow Cake";
				this.restoreValue = 20;
                                this.restoreHungry = 20;
				break;
			case 2: this.name = "Mystery Bread";
				this.restoreValue = 30;
                                this.restoreHungry = 30;
				break;
		}

	}

	public String getName(){
		return this.name;
	}

	public float getRestoreValue(){
		return this.restoreValue;
	}
        
        public float getHungry(){
            return this.restoreHungry;
        }
}
