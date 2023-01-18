package patterns.ch6;

public class Main {
    public static void main(String[] args) {
        //Computer computer=new Computer("16GB", true, "1TB", "RTX2060", "17", "Dolby");
        Computer.Builder builder =new Computer.Builder("16GB");
        builder.setAudio("AudioDevice");
        builder.setAudio("AudioDevice").setBluetooth(true).setCPU("17").setGPU("RTX").setStorage("1TB");

        Computer computer = builder.build();


        System.out.println("Computer :" + computer);


    }


}
