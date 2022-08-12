package MaquinaVirtual;

public class Main {

    public static void main(String[] args) {

        IO io  = new IO(System.in, System.out);
        RAM ram = new RAM(128);
        CPU cpu = new CPU(io, ram);

        ram.write(1,120);
        ram.write(2,128);

        cpu.execute(1);
    }

    
}
