import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyClass myClass=new MyClass("Baktulan","Nazirbek uulu",23,new String[]{"English","SoftSkills","Java Session","Java Theory"},"Shashlik");
        System.out.println(myClass.name+"\n"+myClass.surname+
                "\n"+myClass.age+"\n"+ Arrays.toString(myClass.PeakSoftLessons)+"\n"+myClass.favoriteFood);


        System.out.println("--------------------------------");

        MyClass myClass1=new MyClass();
        myClass1.name="Asylbek";
        myClass1.surname="Abdurashitov";
        myClass1.age=26;
        myClass1.PeakSoftLessons=new String[]{"English","SoftSkilss","Java Session","Java Theory"};
        myClass1.favoriteFood="Manty";
        System.out.println(myClass1.name+"\n"+myClass1.surname+"\n"+myClass1.age+"\n"+Arrays.toString(myClass1.PeakSoftLessons)+"\n"+myClass1.favoriteFood);

    }
}