public class NoFoundSocialMediaException extends Exception {
    public NoFoundSocialMediaException(){
    }
    public NoFoundSocialMediaException(String message){
        super(message);
        System.out.println("nao encontrada");
    }
}