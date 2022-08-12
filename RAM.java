package MaquinaVirtual;

public class RAM {

    private int memory_size;
    private int[] memory;

    public RAM(int memory_size) {
        this.memory_size = memory_size;
        this.memory = new int[memory_size];
    }

    public void write(int position, int value) {

        this.memory[position] = value;
        
    }
    

    public int read(int position) {

        if(position < 0 || position >= this.memory_size || this.memory[position] == 0) {
            // Invalid position
            return -1;
        }


        return this.memory[position];
    }


    
}
