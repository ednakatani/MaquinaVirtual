package MaquinaVirtual;

public class Cache extends RAM {

    private RAM ram;
    private int[] cache;
    private int startAddress;
    private boolean modified;

    public Cache(int memorySize, RAM ram) {
        super(memorySize);
        this.ram = ram;
        this.cache = new int[memorySize];
        this.modified = false;
        this.startAddress = 0;
        pullCache(startAddress);
    }

    @Override
    public int read(int address) {
        
        if(address <= (startAddress+cache.length-1) && address >= startAddress) {
            return cache[address-startAddress];
        }
        else{
            pullCache(address);
            return read(address);
        }

    }

    @Override
    public int write(int address, int value) {
        
        if(address <= (startAddress+cache.length-1) && address >= startAddress) {
            cache[address-startAddress] = value;
            modified = true;
        }
        else{
            pullCache(address);
            write(address, value);
        }
        return 1;
    }


    public void pushCache() {
        for(int i = 0; i < cache.length; i++) {
            System.out.println("Writing " + cache[i] + " to " + (startAddress+i));
            ram.write(startAddress+i, cache[i]);
        }
    }
    

    public void pullCache(int startAddress) {
        if(modified){
            pushCache();
        }
        //for last memory address
        
        this.startAddress = startAddress;
        if(startAddress+cache.length > ram.getMemorySize()){
            startAddress = ram.getMemorySize()-cache.length;
            this.startAddress = startAddress;
        }
        for(int i = 0; i < cache.length; i++) {
            System.out.println("Pulling cache from address " + (startAddress+i));
            cache[i] = ram.read(startAddress+i);
        }
    }

    





    


    
}
