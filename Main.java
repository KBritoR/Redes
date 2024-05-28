public class Main{
    public static void main(String[] args){

        final RedeSocial[] RS = new RedeSocial[2];
        final RedeSocial rede1 = new Facebook("FelipeSenhaFb", 0);
        final RedeSocial rede2 = new Instagram("FelipeSenhaIg", 141);

        RS[0] = rede1;
        RS[1] = rede2;

        final Usuario user1 = new Usuario("Felipe", "feliperibeiro@gmail.com", RS);

        try {
            user1.mostraInfoRedeSocial();
        }catch (NoFoundSocialMediaException e) { e.printStackTrace();
        }
    }
}
