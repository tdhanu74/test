class Teacher {
  public Teacher(int id,string name,int salary) {
    this.id = id;
		this.name = name;
		this.salary = salary;
  }
  
  public void setId(int id){
    this.id = id;
  }
  public void setName(string name){
    this.name = name;
  }
  public void setSalary(int salary){
    this.salary = salary;
  }
  
  public int getId(){
    return this.id;
  }
  public string getName(){
    return this.name;
  }
  public int getSalary(){
    return this.salary;
  }
}