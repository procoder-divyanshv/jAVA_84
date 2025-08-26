public class Calculator { //this is called the polymorphism that the definition of the function is same but hte parameter are different
    double ar;
    public void Area(double len,double bd){
        ar= len*bd;
        System.out.println("Area of rectangle : "+ar);
    }

    public void Area(double r){
        ar= Math.PI*r*r;
        System.out.println("Area of circle : "+ar);
    }
    public void Area(double len,double bd,double hgt){
        ar= 2*(len*bd + bd*hgt+ hgt*len);
        System.out.println("Area of rectangle : "+ar);
    }
}
