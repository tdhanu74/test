class Parent {
  public Parent(int id,string name,string designation) {
    this.id = id;
		this.name = name;
		this.designation = designation;
  }
  
  public void setId(int id){
    this.id = id;
  }
  public void setName(string name){
    this.name = name;
  }
  public void setDesignation(string designation){
    this.designation = designation;
  }
  
  public int getId(){
    return this.id;
  }
  public string getName(){
    return this.name;
  }
  public string getDesignation(){
    return this.designation;
  }
}