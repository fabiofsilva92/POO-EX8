public class Dinossauro {

    private int energia = 0; //de 0 a 100
    private Double velocidade = 0d;
    private Double temperatura = 30d;
    private String humor = "Feliz";

    public void pular(){
        if(this.energia <5){
            System.out.println("Não pode pular, energia baixa demais");
            System.out.println("-----");
            System.out.println("");
        }else{
            System.out.println("Pulando");
            System.out.println("-----");
            System.out.println("Energia antes do pulo: " + this.energia + "|  Energia gasta = 5 | " +
                    " Energia Atual (após pulo) : " +(this.energia-5));
            this.energia = this.energia - 5;
            this.humor = "Feliz";
            System.out.println("-----");
            System.out.println("Humor atual : "+this.humor);
            if(this.velocidade >=5){
                this.velocidade = this.velocidade - 5;
            } else{
                this.velocidade = 0d;
            }
            System.out.println("-----");
            System.out.println("Velocidade atual: " + this.velocidade);
            System.out.println("");
        }
    }

    public void correr(){
        if(this.energia < 5){
            System.out.println("Não pode correr, energia baixa demais");
            System.out.println("-----");
            System.out.println("");
        }else{
            System.out.println("Correndo");
            System.out.println("-----");
            System.out.println("Energia antes de correr: " + this.energia + "|  Energia gasta = 5 | " +
                    " Energia Atual (após correr) : " +(this.energia-5));
            System.out.println("-----");
            this.energia = this.energia - 5;
            System.out.println("Velocidade antes de correr: " + this.velocidade);
            System.out.println("-----");
            this.velocidade = this.velocidade + 10;
            System.out.println("Velocidade após correr: " + this.velocidade);
            System.out.println("-----");
            this.humor = "Feliz";
            System.out.println("Humor após correr: " +this.humor);
            System.out.println("");
        }

    }

    public void comer(){
        if(this.velocidade<5){
            this.velocidade = 0d;
        }else{
            this.velocidade = this.velocidade-5;
        }
        if(this.energia<90){
            this.energia = energia+10;
        }else{
            this.energia = 100;
        }
        System.out.println("Comendo");
        System.out.println("-----");
        System.out.println("Energia aumentada, atual: "+this.energia+" | antes de comer: "+(this.energia-10));
        System.out.println("-----");
        System.out.println("Velocidade reduzida, atual: "+this.velocidade);
        this.humor = "Feliz";
        System.out.println("-----");
        System.out.println("Humor: " +this.humor);
        System.out.println("");
    }

    public void cantar(){
        if(this.energia < 3){
            this.energia = 0;
        }else{
            this.energia = this.energia -3;
        }
        System.out.println("Cantando");
        System.out.println("-----");
        System.out.println("Energia atual: "+this.energia);
        System.out.println("-----");
        this.humor = "Feliz";
        System.out.println("-----");
        System.out.println("Humor: "+this.humor);
        System.out.println("");
    }

    public void tomarSol(){
        this.velocidade = this.velocidade +5;
        this.temperatura = this.temperatura + 5;
        this.humor = "Feliz";

        System.out.println("Tomando sol");
        System.out.println("-----");
        System.out.println("Velocidade aumentada: "+this.velocidade);
        System.out.println("-----");
        System.out.println("Temperatura aumentada: "+this.temperatura);
        System.out.println("-----");
        System.out.println("HUmor: "+this.humor);
        System.out.println("");
    }

    public void ficarNaSombra(){

        this.energia = this.energia+5;
        if(this.temperatura < 35){
            this.temperatura = 30d;
        }else{
            this.temperatura = this.temperatura -5;
        }
        this.humor = "Triste";
        System.out.println("Ficando na sombra");
        System.out.println("-----");
        System.out.println("Energia aumentada: "+this.energia);
        System.out.println("-----");
        System.out.println("Temperatura diminuida: "+this.temperatura);
        System.out.println("-----");
        System.out.println("Humor: "+this.humor);
        System.out.println("");

    }
}
