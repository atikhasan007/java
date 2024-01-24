class ParameterConsructor{
int id;
String name;
public ParameterConsructor(int x, String y) {id=x;name=y;}
void show(){System.out.println(id+" "+name);}
public static void main(String [] args)
{
ParameterConsructor c1 = new ParameterConsructor(101,"Sanowar");
ParameterConsructor c2 = new ParameterConsructor(102,"Anayet");
c1.show();
c2.show();
}}
