/**
 * Beschreiben Sie hier die Klasse LisasAhnenbaum.
*/
public class LisasAhnenbaum{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String name;
    private BinaryTree<Ahne> lisasAhnenbaum;
    private Ahne b11;
    private Ahne b22;
    private Ahne b33;
    private Ahne b44;
    private Ahne b55;
    private Ahne b66;
    private Ahne lisa;
    /**
     * Konstruktor für Objekte der Klasse LisasAhnenbaum
     */
    public LisasAhnenbaum(){
        b11 = new Ahne("Jaccqueline", "Bouvier", 'w');
        b22 = new Ahne("Clancy", "Bouvier", 'm');
        b33 = new Ahne("Marge", "Simpson", 'w');
        b44 = new Ahne("Mona", "Simpson", 'w');
        b55 = new Ahne("Abraham J.", "Simpson", 'm');
        b66 = new Ahne("Homer", "Simpson", 'm');
        lisa = new Ahne("Lisa", "Simpson", 'w');
    }
    public void ahnenBaum(){
        BinaryTree<Ahne> b1 = new BinaryTree<Ahne>(b11); 
        BinaryTree<Ahne> b2 = new BinaryTree<Ahne>(b22);
        BinaryTree<Ahne> b3 = new BinaryTree<Ahne>(b33, b1, b2); 
        BinaryTree<Ahne> b4 = new BinaryTree<Ahne>(b44);
        BinaryTree<Ahne> b5 = new BinaryTree<Ahne>(b55);
        BinaryTree<Ahne> b6 = new BinaryTree<Ahne>(b66, b4, b5);
        lisasAhnenbaum = new BinaryTree<Ahne>(lisa, b3, b6);
    }
    public void preorderAusgabe()
    {
        ahnenBaum();
        preorder(lisasAhnenbaum);
    }
    private void preorder(BinaryTree<Ahne> b){
        if (!b.isEmpty()){
            System.out.print(b.getContent().getVorname());
            System.out.print(" ");
            System.out.println(b.getContent().getNachname());
            System.out.println(b.getContent().getGeschlecht());
            System.out.println("");
            if (b.getLeftTree().isEmpty() == false)
            {
                preorder(b.getLeftTree()); 
            }
            if (b.getRightTree().isEmpty() == false)
            {
                preorder(b.getRightTree());
            }
        }
    }
}
