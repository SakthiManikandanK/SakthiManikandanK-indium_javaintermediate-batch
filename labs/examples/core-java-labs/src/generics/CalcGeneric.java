package generics;

public class CalcGeneric {
    public <N extends Number>  Number add(N a, N b){
        return a.doubleValue() + b.doubleValue();
    }
    public <N extends Number>  Number sub(N a, N b){
        return a.doubleValue() - b.doubleValue();
    }
    public <N extends Number>  Number multiply(N a, N b){
        return a.doubleValue() * b.doubleValue();
    }
    public <N extends Number>  Number div(N a, N b){
        return a.doubleValue() / b.doubleValue();
    }


}
