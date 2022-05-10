public class Monde {
    Secteur[][] leMonde;


    public Monde()
    {
        this.leMonde=new Secteur[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                leMonde[i][j] = new PlanDeau(i,j);}}
    }

    public void afficherLeMonde()
    {
        for (int i = 0; i < leMonde.length; i++) {
            for (int j = 0; j < leMonde.length; j++) {

                if (leMonde[i][j] instanceof PlanDeau)
                    leMonde[i][j].affichage();
                else
                    leMonde[i][j].affichage();
            }

            System.out.println(" | ");
        }
    }




}
