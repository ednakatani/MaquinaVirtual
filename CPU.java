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
        io.print("Executing program at address " + pc+"\n");

        while(ram.read(pc) != -1){

        int a = ram.read(pc);
        ++pc;
        int b = ram.read(pc);
        ++pc;

        int counter = 0;
        for (int i = a; i <= (b); ++i) {
            
            counter += 1;
            //System.out.println("Pos "+ i +" Counter: " + counter);
            ram.write(i, counter);
            io.print(i + " -> " + counter + "\n");
            
        }
        
    }
                
            
        
        
    }
        
    }
    

