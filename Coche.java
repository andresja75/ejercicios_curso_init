package ejercicios_tema_3;

public class Coche {

    public Coche()
    {
        this.doors = 0;
    }
    public void add(int n_doors)
    {
        this.doors += n_doors;

    }
    public void show_doors()
    {
        System.out.println(this.doors);
    }
    int doors;
}
