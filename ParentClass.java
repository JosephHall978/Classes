class ParentClass {
  private String hello;
  protected String world;
  public String punc;
  String cool = "yes";

  public ParentClass() {
    hello = "Hello";
    world = "world";
    punc = "!";
    Demo();
  }
  
  public void OutPublic() {
    System.out.println(hello + world + punc + cool);
    OutPrivate();//You will only be able to use this in the function
  }

  protected void OutProtected() {
    System.out.println("Protected" + hello + world + punc + cool);
  }

  private void OutPrivate() {
    System.out.println("Private" + hello + world + punc + cool);
  }
  
  public void Demo(){
    System.out.println("Parent class: ");
    OutPublic();
    OutProtected();
  }
}
/*
Public: anywhere you want to access
Private: only within the class itself
Protected: within the package
Default: within the package
A package is a group of classes so in this case the package is all the files in this repl
*/