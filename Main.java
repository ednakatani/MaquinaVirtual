package MaquinaVirtual;

public class Main {

    public static void main(String[] args) {

        IO io  = new IO(System.in, System.out);
        RAM ram = new RAM(128);

        ram.write(1,119);
        ram.write(2,127);
        
        Cache cache = new Cache(8, ram);
        CPU cpu = new CPU(io, cache);

        cpu.execute(1);
    }

    
}
