package facade;

import computador.*;

public class Facade {

    private CPU cpu;
    private Memoria memoria;
    private HD hd;
    private Perifericos perifericos;
    private SO so;

    public Facade(){
        this.cpu = new CPU();
        this.memoria = new Memoria();
        this.hd = new HD();
        this.perifericos = new Perifericos();
        this.so = new SO();
    }

    public void montarPC(){
        System.out.println("Montando um novo PC:\n");

        memoria.adcionarMemoria();
        hd.adicionarHd();
        cpu.adicionarProcessador();
        perifericos.adicionarMouse();
        perifericos.adicionarTeclado();
        perifericos.adicionarMonitor();
        so.instalarSO();

        System.out.println("\nPC montado com sucesso!");
    }

}
