package MaquinaVirtual;

public class RAM {

    private int memory_size;
    private int[] memory;

    public RAM(int memory_size) {
        this.memory_size = memory_size;
        this.memory = new int[memory_size];
    }

    public int write(int position, int value) {

        try{
            this.memory[position] = value;
            return 1;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Position " + position + " for value"+value+" is out of bounds");
            System.out.println("Error: Address out of bounds");
            System.exit(1);
            return -1;
            
        }

        
    }
    

    public int read(int position) {

        if(position < 0 || position >= this.memory_size-1 || this.memory[position] == 0) {
            // Invalid position
            return -1;
        }


        return this.memory[position];
    }

    public int getMemorySize() {
        return this.memory_size;
    }


    
}
