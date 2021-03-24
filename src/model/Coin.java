package model;

public class Coin {
    byte[] case1;
    byte[] case2;
    byte size;

    public Coin(byte num){
        this.size = num;

        this.case1 = new byte[this.size];
        this.case2 = new byte[this.size];

        for (byte i = 0; i < this.size; i++){
            this.case1[i] = (byte)(i % 2);
            this.case2[i] = (byte)((i+1) % 2);
        }
    }

    public void printCases(){
        System.out.println("Case 1:");
        for (byte i : this.case1)
            System.out.println(i);

        System.out.println("Case 2:");
        for (byte i : this.case2)
            System.out.println(i);
    }

    public byte getMinNumberOfFlips(byte[]case0){
        byte flips1 = 0, flips2 = 0;
        for(byte i = 0; i < this.size; i++){
            if(this.case1[i] != case0[i]) flips1++;
            if (this.case2[i] != case0[i]) flips2++;
        }

        if(flips1 < flips2) return flips1;
        else return flips2;
    }
}
