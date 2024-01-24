class Room
{
 float length;
 float width;

float getArea(float x, float y)
{
float area=x*y;
return area;
//System.out.println("The area of Room is:"+area);
}
}
class Area
{
public static void main(String [] args)
{
Room room1=new Room();
 
System.out.println("The area of Room is:"+room1.getArea(15,10););
}

}
