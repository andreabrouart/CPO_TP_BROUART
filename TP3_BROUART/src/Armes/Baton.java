/*BROUART Andréa TDB*/
package Armes;

/**
 *
 * @author Asus
 */
public class Baton extends Arme{
int age;    

    public Baton(String n, int atk, int a) {
        super(n, atk);
        if (age>99){
            age=99;
        }
        if (age<0){
            age=0;
        }
        age = a;
    }

    @Override
    public String toString() {
        return "Baton{" + "age= " + age + '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
