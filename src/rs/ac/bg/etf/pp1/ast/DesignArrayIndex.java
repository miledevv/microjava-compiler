// generated with ast extension for cup
// version 0.8
// 24/0/2022 23:43:45


package rs.ac.bg.etf.pp1.ast;

public class DesignArrayIndex extends Designator {

    private String arrName;
    private Expr Expr;

    public DesignArrayIndex (String arrName, Expr Expr) {
        this.arrName=arrName;
        this.Expr=Expr;
        if(Expr!=null) Expr.setParent(this);
    }

    public String getArrName() {
        return arrName;
    }

    public void setArrName(String arrName) {
        this.arrName=arrName;
    }

    public Expr getExpr() {
        return Expr;
    }

    public void setExpr(Expr Expr) {
        this.Expr=Expr;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Expr!=null) Expr.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Expr!=null) Expr.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Expr!=null) Expr.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesignArrayIndex(\n");

        buffer.append(" "+tab+arrName);
        buffer.append("\n");

        if(Expr!=null)
            buffer.append(Expr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesignArrayIndex]");
        return buffer.toString();
    }
}
