package testInhenritence;

public class SuperB {
    int x;
    void setIt(int n){
        x=n;
    }
    void increase(){
        x+=1;
    }
    void triple(){
        x*=3;
    }
    int returnIt(){
        return x;
    }
}

class SubC extends SuperB{
    void triple(){
        x+=3; //overriding existing method
    }
    void quadruple(){
        x*=4;//new method
    }
}
