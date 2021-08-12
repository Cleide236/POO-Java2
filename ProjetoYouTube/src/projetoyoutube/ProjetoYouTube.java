package projetoyoutube;
public class ProjetoYouTube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");
        
        Garfanhoto g[] = new Garfanhoto[2];
        g[0] = new Garfanhoto("Jubileu", 22, "M", "juba");
        g[1] = new Garfanhoto("Creuza", 12, "F", "Creuzita");
        
        System.out.println(v[0].toString());
        System.out.println(g[0].toString());
    }
    
}
