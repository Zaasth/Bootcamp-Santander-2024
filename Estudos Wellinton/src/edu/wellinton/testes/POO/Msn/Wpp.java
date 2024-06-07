package edu.wellinton.testes.POO.Msn;

import java.time.LocalDateTime;
import java.util.Date;

public class Wpp extends MSNMessenger {
    private String nome;
    private String cel;
    private String region;
    private LocalDateTime dataMsg = LocalDateTime.now();

    public Wpp(String nome, String cel, String region, LocalDateTime dataMsg) {
        this.nome = nome;
        this.cel = cel;
        this.region = region;
        this.dataMsg = dataMsg;
    }

    public Wpp(){

    }

    @Override
    void enviarMensagem(String msg) {
        System.out.println("Mensagem enviada!");
        System.out.println("MSG: ".concat(msg));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public LocalDateTime getDataMsg() {
        return dataMsg;
    }

    public void setDataMsg(LocalDateTime dataMsg) {
        this.dataMsg = dataMsg;
    }
}
