public class Twitter extends RedeSocial implements Compartilhamento{

    //herdando
    public Twitter(String senha, int numAmigos){
        super(senha, numAmigos);
    }

    //sobrescrevendo metodo superclass
    @Override
    public void postarFoto(){
        System.out.println("Postou uma foto no Twitter");
    }

    @Override
    public void postarVideo(){
        System.out.println("Postou um vídeo no Twitter");
    }

    @Override
    public void postarComentario(){
        System.out.println("Postou um comentário no Twitter");
    }

    @Override
    public void curtirPublicacao(){
        System.out.println("Curtiu uma publicação no Twitter");
    }

    //sobrescrevendo metodo interfaces
    @Override
    public void compartilhar(){
        System.out.println("Compartilhou no Twitter");
    }
}