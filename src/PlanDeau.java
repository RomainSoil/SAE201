public class PlanDeau extends Secteur{
    public PlanDeau(int x, int y) {
        super(x, y);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                secteur[i][j] = "x";
            }
        }
    }

    public void affichage()
    {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(" | "+ secteur[i][j]);
            }

        }

    }
}
