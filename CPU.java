package MaquinaVirtual;

public class CPU {

    private IO io;
    private RAM ram;
    private int pc;

    public CPU(IO io, RAM ram) {
        this.io = io;
        this.ram = ram;
        this.pc = 0;
    }

    public void execute(int address) {

        pc = address;

        while(ram.read(pc) != -1){

        int a = ram.read(pc);
        ++pc;
        int b = ram.read(pc);
        ++pc;

        int counter = 0;
        for (int i = a; i <= (b-1); ++i) {

            counter += 1;
            ram.write(i, counter);
            io.print(i + " -> " + counter + "\n");
            
        }
        
    }
                
            
        
        
    }
        
    }
    

