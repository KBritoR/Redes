public class Usuario{

    private String nome;
    private String email;
    public RedeSocial[] redesSociais;

    //construtor superclass
    public Usuario(String nome, String email, RedeSocial[] redesSociais) {
        this.nome = nome;
        this.email = email;
        this.redesSociais = redesSociais;
    }

    public void mostraInfoRedeSocial() throws NoFoundSocialMediaException{
        for (int i = 0; i < redesSociais.length; i++){
            if(redesSociais[i] instanceof Twitter){
                ((Twitter) redesSociais[i]).postarFoto();
                ((Twitter) redesSociais[i]).postarVideo();
                ((Twitter) redesSociais[i]).postarComentario();
            }

            else if(redesSociais[i] instanceof GooglePlus){
                redesSociais[i].curtirPublicacao();
                ((GooglePlus) redesSociais[i]).fazStreaming();
                ((GooglePlus) redesSociais[i]).compartilhar();
            }

            else if(redesSociais[i] instanceof Facebook){
                ((Facebook) redesSociais[i]).postarFoto();
                ((Facebook) redesSociais[i]).postarVideo();
                ((Facebook) redesSociais[i]).postarComentario();
            }

            else if(redesSociais[i] instanceof Instagram){
                ((Instagram) redesSociais[i]).postarFoto();
                ((Instagram) redesSociais[i]).postarVideo();
                ((Instagram) redesSociais[i]).postarComentario();
            }

            else {
                throw new NoFoundSocialMediaException("Rede social invalida");
            }
        }
    }
}
