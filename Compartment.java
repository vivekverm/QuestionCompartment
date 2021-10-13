import java.util.Random;
import java.util.concurrent.Callable;

public abstract class Compartment
{
    abstract public String notice();
}

class FirstClass extends Compartment
{
    public String notice()
    {
        return"Firstclass";
    }
}

class Ladies extends Compartment
{
    public String notice()
    {
        return"Ladies";
    }
}

class General extends Compartment
{
    public String notice()
    {
        return"General";
    }
}

class Luggage extends Compartment
{
    public String notice()
    {
        return"Luggage";
    }
}

class TestCompartment
{
    public static void main(String[] args)
    {
        int number;
        Compartment arr[]=new Compartment[10];
        Random obj=new Random();
        for (var i=0;i<arr.length;i++)
        {
            number=1+obj.nextInt(4);
            switch (number)
            {
                case 1:
                    arr[i]=new FirstClass();
                    System.out.println(arr[i].notice());
                    break;
                case 2:
                    arr[i]=new Ladies();
                    System.out.println(arr[i].notice());
                    break;
                case 3:
                    arr[i]=new General();
                    System.out.println(arr[i].notice());
                    break;
                case 4:
                    arr[i]=new Luggage();
                    System.out.println(arr[i].notice());
                    break;
            }
        }

    }
}
