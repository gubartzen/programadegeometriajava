import java.util.Scanner;
public class programa
{   
    int formaPlanaNum;
    
    int z;
    int y;
    int x;
    int a;
    
    int PouE;

    
    public void Plana() {
        Scanner ler = new Scanner(System.in);
        
        if (this.formaPlanaNum == 1) {
            
             System.out.println("Digite a altura do Quadrado. Em seguida, digite sua largura");
	         
        	   this.z = ler.nextInt();
        	   this.y = ler.nextInt();
        	 
        	 System.out.println("Altura: "+this.z+" Largura = "+this.y+".");
        	 System.out.println("Área do quadrado: "+ this.z*this.y +"");
        	 
        	 this.PlanoOuEspacial();
	   
        } else if (this.formaPlanaNum == 2) {
            
            System.out.println("Digite o diâmetro do círculo.");
	         
        	   this.z = ler.nextInt();
        	   
        	   System.out.println("Raio: "+this.z+" Diâmetro = "+this.z*2+"");
        	   System.out.println("Área do círculo = "+ this.z*this.z*3.14 +"");
        	   
        	   this.PlanoOuEspacial();
        
        } else if (this.formaPlanaNum == 3) {
                
                    System.out.println("Digite a altura do Triângulo. Em seguida, a medida da sua base.");
    	         
            	   this.z = ler.nextInt();
            	   this.y = ler.nextInt();
            	
            	 System.out.println("Altura: "+this.z+" Base = "+this.y+".");
            	 System.out.println("Perímetro do triângulo: "+ (this.y+this.z)*1.667+".");
            	 System.out.println("Área do triângulo: "+ (this.z*this.y)*0.5 +".");
            	 
            	 this.PlanoOuEspacial();
            }
        }
    
    public void PlanoOuEspacial() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite 1 para selecionar Geometria Plana ou 2 para Geometria Espacial. Digite 3 para sair.");
	    this.PouE = ler.nextInt();
        if (this.PouE == 1) {
            System.out.println("Digite 1 para Quadrado, 2 para Círculo, 3 para Triângulo, 4 para Triângulo Equilátero, 5 para Paralelograma, 6 para Losango e 7 para Trapézio.");
	   
	         this.formaPlanaNum = ler.nextInt();
	         this.Plana();
        } else if (this.PouE == 2) {
            
        } else {
            
        }
    }
    

	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    
	    programa forma = new programa();
	   
	    forma.PlanoOuEspacial();
	   
	}
}
