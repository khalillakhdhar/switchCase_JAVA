package ifElse;

public class Division {
private int a;

public int getA() {
	return a;
}

public void setA(int a) {
	this.a = a;
}
public String parite()
{
if(this.a%2==0)
	return "paire";
else
	return "impaire";
}
public String divisible()
{
int c=this.a/100;
int d=(this.a%100)/10;
int u=this.a%10;
int somme=c+d+u;
if(somme%3==0)
	return "divisible par 3";
else
	return "non divisible par 3";




}

@Override
public String toString() {
	return "Division [a=" + a + ", parité=" + parite() + ", divisibilité =" + divisible() + "]";
}


}
