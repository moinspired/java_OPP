class Dragon extends Mammal{
    public Dragon() {
		this.energyLevel = 300;		
    }
    public void fly(){
        System.out.println("Dddddddzzzzzzz");
        this.energyLevel-=50;
    }
    public void eatHumans(){
         energyLevel += 25;
    }
    public void attackTown(){
        System.out.println("Fire......");
        this.energyLevel -= 100;
    }
}