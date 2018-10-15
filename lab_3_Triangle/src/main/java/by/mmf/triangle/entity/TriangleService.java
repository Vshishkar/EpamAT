package by.mmf.triangle.entity;

public class TriangleService {

    public boolean isTriangle(float a,float b,float c){

        if(a < 0 || b < 0 || c < 0 ){
            return false;
        }

        if(b > a && b > c){
            float tmp = b;
            b = a;
            a = tmp;
        } else if(c > b && c > a){
            float tmp = c;
            c = a;
            a = tmp;
        }

        return a < b + c;
    }

}
