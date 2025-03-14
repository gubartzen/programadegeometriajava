import java.util.Scanner;
public class programa
{   
    int formaPlanaNum;
    int FormaEspacialNum;
    
    int z;
    int y;
    int x;
    int a;
    int k;
    
    int PouE;

    public void Espacial() {
      Scanner ler = new Scanner(System.in);
      if (this.FormaEspacialNum == 1) {
            
        System.out.println("Digite a circunferência da esfera.");
      
        this.z = ler.nextInt();
      
      System.out.println("Circunferência: "+this.z+" Raio = "+this.z/(2*Math.PI)+".");
      System.out.println("Área superficial da esfera: "+4*Math.PI*this.z/(2*Math.PI)*this.z/(2*Math.PI)+"");
	System.out.println("Volume da esfera: " + Math.pow(this.z/(2*Math.PI),3) * 4/3 * Math.PI + "");
      
      this.PlanoOuEspacial();

   } else if (this.FormaEspacialNum == 2) {
            
    System.out.println("Digite o raio do cone, em seguida sua geratriz.");
  
    this.z = ler.nextInt();
    this.y = ler.nextInt();
  
  this.a = this.y*this.y-this.z*this.z;
  this.a = (int) Math.sqrt(this.a);
  System.out.println("Raio: "+this.z+" Geratriz = "+this.y+" Altura: "+this.a+".");
  System.out.println("Área lateral do cone: "+Math.PI*this.z*this.y+"");
  System.out.println("Área da base do cone: "+Math.PI*this.z*this.z+"");
  System.out.println("Volume do cone: "+(Math.PI*this.z*this.z*this.a)/3+"");
  
  this.PlanoOuEspacial();
  } else if (this.FormaEspacialNum == 3) {
            
    System.out.println("Digite o raio do cilindro, em seguida sua altura.");
  
    this.z = ler.nextInt();
    this.y = ler.nextInt();

  System.out.println("Raio: "+this.z+" Altura: "+this.y+".");
  System.out.println("Área lateral do cilindro: "+2*Math.PI*this.z*this.y+"");
  System.out.println("Área da base do cilindro: "+Math.PI*this.z*this.z+"");
  System.out.println("Volume do cilindro: "+(Math.PI*this.z*this.z*this.y)/3+"");
  
  this.PlanoOuEspacial();
  } else if (this.FormaEspacialNum == 4) {
            
    System.out.println("Digite o número de faces do prisma, em seguida a altura, base de sua face e base do prisma.");
  
    this.z = ler.nextInt();
    this.y = ler.nextInt();
    this.a = ler.nextInt();
    this.x = ler.nextInt();

  System.out.println("N. de faces: "+this.z+" Altura: "+this.y+" Base da face: "+this.a+" Base do prisma: "+this.x+".");
  System.out.println("Área lateral do prisma: "+this.z*this.y*this.a+"");
  System.out.println("Área total do prisma: "+((this.x*2)+this.z*this.y*this.a)+"");
  System.out.println("Volume do prisma: "+this.x*this.y+"");
  
  this.PlanoOuEspacial();
    } else if (this.FormaEspacialNum == 5) {
            
      System.out.println("Digite o número de faces da pirâmide, em seguida seu lado vertical, base da face, base da pirâmide e sua altura.");
    
      this.z = ler.nextInt();
      this.y = ler.nextInt();
      this.a = ler.nextInt();
      this.x = ler.nextInt();
      this.k = ler.nextInt();
  
    System.out.println("N. de faces: "+this.z+" Lado vertical: "+this.y+" Base da face: "+this.a+" Base da pirâmide: "+this.x+" Altura: "+this.k+".");
    System.out.println("Área lateral da pirâmide: "+this.z*(this.y*this.a/2)+"");
    System.out.println("Área total do prisma: "+this.x+this.z*(this.y*this.a/2)+"");
    System.out.println("Volume do cilindro: "+this.x*this.k/3+"");
    
    this.PlanoOuEspacial();
      } else if (this.FormaEspacialNum == 6) {
            
        System.out.println("Digite 1 para tronco de cone e 2 para tronco de pirâmide.");
        
        this.z = ler.nextInt();
        if (this.z == 1) {

        System.out.println("Digite o raio do topo do tronco, em seguida o raio da base, geratriz e altura.");

        this.z = ler.nextInt();
        this.y = ler.nextInt();
        this.a = ler.nextInt();
        this.x = ler.nextInt();
    
      System.out.println("Raio menor: "+this.z+" Raio maior: "+this.y+" Geratriz: "+this.a+" Altura: "+this.x+".");
      System.out.println("Volume do tronco de cone: "+(Math.PI*this.x*((this.z*this.z+this.z*this.y+this.y*this.y)))/3+"");
      this.PlanoOuEspacial();
        } else if (this.z == 2) {
        
          System.out.println("Digite a altura do tronco, em seguida a base menor e a base maior.");

          this.z = ler.nextInt();
          this.y = ler.nextInt();
          this.a = ler.nextInt();
      
        System.out.println("Altura: "+this.z+" Base menor: "+this.y+" Base maior: "+this.a+".");
        System.out.println("Volume do tronco de pirâmide: "+(this.z*(this.a+Math.sqrt(this.y*this.a)+this.y))/3+"");
      
      this.PlanoOuEspacial();
        } else {
          this.Espacial();
        }
      }
  }

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
        	   
        	   System.out.println("Raio: "+this.z/2+" Diâmetro = "+this.z+"");
        	   System.out.println("Área do círculo = "+ this.z*this.z*3.14 +"");
        	   
        	   this.PlanoOuEspacial();
        
        } else if (this.formaPlanaNum == 3) {
                
                System.out.println("Digite a altura do Triângulo. Em seguida, a medida da sua base.");
    	         
            	   this.z = ler.nextInt();
            	   this.y = ler.nextInt();
            	
            	 System.out.println("Altura: "+this.z+" Base = "+this.y+".");
            	 System.out.println("Perímetro do triângulo: "+ (Math.sqrt(this.y*this.y+this.z*this.z)+this.y+this.z) +"");
            	 System.out.println("Área do triângulo: "+ (this.z*this.y)*0.5 +"");
            	 
            	 this.PlanoOuEspacial();
            } else if (this.formaPlanaNum == 4) {
                
            System.out.println("Digite o lado do Triângulo Equilátero.");
             
               this.z = ler.nextInt();
            
             System.out.println("Altura: "+this.z+" Base = "+this.y+".");
             System.out.println("Perímetro do triângulo: "+this.z*3+"");
             System.out.println("Área do triângulo: "+ this.z*this.z*Math.sqrt(3)/4+"");
             
             this.PlanoOuEspacial();

        } else if (this.formaPlanaNum == 5) {
        System.out.println("Digite a base do Paralelograma. Em seguida, a medida de seu lado e sua altura.");
                 
                   this.z = ler.nextInt();
                   this.y = ler.nextInt();
                   this.x = ler.nextInt();
                
                 System.out.println("Base: "+this.z+". Lado: "+this.y+". Altura: "+this.x+".");
                 System.out.println("Perímetro do paralelograma: "+this.z*2+this.y*2+".");
                 System.out.println("Área do paralelograma: "+this.z*this.x+".");
                 this.PlanoOuEspacial();
        } else if (this.formaPlanaNum == 6) {
            System.out.println("Digite o lado do Losango. Em seguida, sua largura e sua altura.");
                     
                       this.z = ler.nextInt();
                       this.y = ler.nextInt();
                       this.x = ler.nextInt();
                    
                     System.out.println("Lado: "+this.z+". Largura: "+this.y+". Altura: +"+this.x+".");
                     System.out.println("Perímetro do losango: "+this.z*4+".");
                     System.out.println("Área do losango: "+this.y*this.x/2+".");
                     this.PlanoOuEspacial();
            } else if (this.formaPlanaNum == 7) {
                System.out.println("Digite a base maior do Trapézio. Em seguida, seu lado, sua altura e sua base menor.");
                         
                           this.z = ler.nextInt();
                           this.y = ler.nextInt();
                           this.x = ler.nextInt();
                           this.a = ler.nextInt();
                        
                         System.out.println("Base: "+this.z+". Lado: "+this.y+" Altura: "+this.x+". Base menor: "+this.a+".");
                         System.out.println("Perímetro do trapézio: "+(this.y+this.y+this.z+this.a)+".");
                         System.out.println("Área do trapézio: "+(this.z+this.a)+this.x/2+".");
                         this.PlanoOuEspacial();
                } else if (this.formaPlanaNum == 8) {
                  System.out.println("Digite a base do Retângulo. Em seguida, seu lado.");
                           
                             this.z = ler.nextInt();
                             this.y = ler.nextInt();
                          
                           System.out.println("Base: "+this.z+". Lado: "+this.y+".");
                           System.out.println("Perímetro do retângulo: "+(this.y*2+this.z*2)+".");
                           System.out.println("Área do trapézio: "+this.z*this.y+".");
                           this.PlanoOuEspacial();
                  }
        }
    
    public void PlanoOuEspacial() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite 1 para selecionar Geometria Plana ou 2 para Geometria Espacial. Digite 3 para sair.");
	    this.PouE = ler.nextInt();
        if (this.PouE == 1) {
            System.out.println("Digite 1 para Quadrado, 2 para Círculo, 3 para Triângulo, 4 para Triângulo Equilátero, 5 para Paralelograma, 6 para Losango, 7 para Trapézio e 8 para Retângulo.");
	   
	         this.formaPlanaNum = ler.nextInt();
	         this.Plana();
        } else if (this.PouE == 2) {
          System.out.println("Digite 1 para Esfera, 2 para Cone, 3 para Cilindro, 4 para Prismas, 5 para Pirâmides e 6 para Troncos.");
	   
          this.FormaEspacialNum = ler.nextInt();
          this.Espacial();
        } else {
            
        }
    }
    

	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    
	    programa forma = new programa();
	   
	    forma.PlanoOuEspacial();
	   
	}
}
