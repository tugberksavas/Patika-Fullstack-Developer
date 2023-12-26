public class Fighter {
    String name;
    int damage;
    int health;//sağlık durumu
    int weight;//ağırlığı
    double dodge;//saldırıyı bloke etme
    double f1Choose;//1.sporcunun seçimi
    double f2Choose;//2.sporcunun seçimi
    Fighter(String name,int damage,int health,int weight,int dodge){
        this.name=name;
        this.damage=damage;
        this.health=health;
        this.weight=weight;
        if(dodge>0&&dodge<100){
            this.dodge=dodge;
        }else {
            this.dodge=0;
        }
        this.f2Choose=f2Choose;
        this.f1Choose=f1Choose;

    }
    int hit(Fighter foe){

        System.out.println(this.name+" => "+foe.name+"'e "+this.damage+" hasar vurdu.");
        if(isDodge()){
            System.out.println(foe.name+" saldırıyı blokladı.");

            System.out.println("-----------------------");
            return foe.health;
        }

        if(foe.health-this.damage<=0){
            return 0;

        }
        return (foe.health-this.damage);

    }

    boolean isDodge(){
        double randomNumber=Math.random()*100;
        return randomNumber<=this.dodge;
    }
    public boolean isFighter(){
        double rondomFightNumber=Math.random();
        return rondomFightNumber<=0.5;
    }

}