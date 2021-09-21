package br.com.zup.AulaDeEncapsulamento.Exemplo3;

public class Televisao {
    private int volume;
    private int canal;

    //
    public Televisao(int volume, int canal) {
        this.volume = volume;
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public void aumentarVolume(){
        volume += 1;
        // volume ++
        // volume = volume + 1
    }

    public void diminuirVolume(){
        volume -= 1;
    }

    public void passarCanal(){
        canal += 1;
    }

    public void voltarCanal(){
        canal -= 1;
    }

    public void trocarCanal(int canal){
        this.canal = canal;
    }

    public void consultarDados(){
        System.out.println("Canal: " +canal);
        System.out.println("Volume: " +volume);
    }
}
