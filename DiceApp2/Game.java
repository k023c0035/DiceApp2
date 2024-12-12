public class Game 
{
    Dice d;
    int[] resltP;

    Game() 
    {
        this.d = new Dice();
        resltP = new int[2];
    }

    void start()
    {
        for(int i =0; i <2 ; i++)
        {
            this.resltP[i] = d.roll();
            print(Integer.toString(resltP[i]));
        }
        judge();
    }

    void judge()
    {
        if(this.resltP[0] == this.resltP[1]){
           print("同じ");
        }
        else if (resltP[0] > resltP[1]) {
            print("1Pの方が大きい");
        }
        else
        {
            print("2Pの方が大きい");
        }
    }

    void print(String str ){
        System.out.println(str);
    }
}