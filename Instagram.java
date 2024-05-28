public class Instagram extends RedeSocial{

    //herdando
    public Instagram(String senha, int numAmigos){
        super(senha, numAmigos);
    }

    //sobrescrevendo metodo superclass
    @Override
    public void postarFoto(){
        System.out.println("Postou uma foto no Instagram");
    }

    @Override
    public void postarVideo(){
        System.out.println("Postou um vídeo no Instagram");
    }

    @Override
    public void postarComentario(){
        System.out.println("Postou um comentário no Instagram");
    }

    @Override
    public void curtirPublicacao(){
        System.out.println("Curtiu uma publicação no Instagram");
    }
}