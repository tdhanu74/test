class Sailor {
  public Sailor(int id,string name,string ship) {
    this.id = id;
		this.name = name;
		this.ship = ship;
  }
  
  public void setId(int id){
    this.id = id;
  }
  public void setName(string name){
    this.name = name;
  }
  public void setShip(string ship){
    this.ship = ship;
  }
  
  public int getId(){
    return this.id;
  }
  public string getName(){
    return this.name;
  }
  public string getShip(){
    return this.ship;
  }
}