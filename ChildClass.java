class ChildClass extends ParentClass {
  public ChildClass() {
    punc = ".";
    cool = "No";
    Demo();
  }
  
  @Override
  public void Demo(){
    System.out.println("Child class: ");
    OutPublic();
    OutProtected();
    //OutPrivate();//Error as private can't be access
  }
}