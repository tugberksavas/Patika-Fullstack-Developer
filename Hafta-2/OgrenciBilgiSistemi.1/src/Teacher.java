public class Teacher {
    String name;
    String mpo;
    String branch;

    Teacher(String name,String branch,String mpo){
        this.name = name;
        this.mpo = mpo;
        this.branch = branch;

    }

    void print(){
        System.out.println("Adi: "+this.name);
        System.out.println("Telefonu: "+this.mpo );
        System.out.println("Bolumu: "+this.branch);
    }




}
