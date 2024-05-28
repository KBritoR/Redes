public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento{

    //herdando
    public Facebook(String senha, int numAmigos){
        super(senha, numAmigos);
    }

    //sobrescrevendo metodo superclass
    @Override
    public void postarFoto(){
        System.out.println("Postou uma foto no Facebook");
    }

    @Override
    public void postarVideo(){
        System.out.println("Postou um vídeo no Facebook");
    }

    @Override
    public void postarComentario(){
        System.out.println("Postou um comentário no Facebook");
    }

    @Override
    public void curtirPublicacao(){
        System.out.println("Curtiu uma publicação no Facebook");
    }

    //sobrescrevendo metodo interfaces
    @Override
    public void compartilhar(){
        System.out.println("Compartilhou no Facebook");
    }

    @Override
    public void fazStreaming(){
        System.out.println("Fez uma vídeo conferência no Facebook");
    }
}