class Student {
  public Student(int id,string name,int marks) {
    this.id = id;
		this.name = name;
		this.marks = marks;
  }
  
  public void setId(int id){
    this.id = id;
  }
  public void setName(string name){
    this.name = name;
  }
  public void setMarks(int marks){
    this.marks = marks;
  }
  
  public int getId(){
    return this.id;
  }
  public string getName(){
    return this.name;
  }
  public int getMarks(){
    return this.marks;
  }
}