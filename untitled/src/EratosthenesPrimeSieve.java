 public class EratosthenesPrimeSieve implements PrimeSieve{

    private int obergrenze;
    private Boolean[] gestrichen;

    public EratosthenesPrimeSieve(int obergrenze) {
        this.obergrenze = obergrenze;
        gestrichen = new Boolean[obergrenze+1];

        for (int i = 0; i <=obergrenze;i++){
            gestrichen[i] = true;
        }
        sieb();
    }

    public void sieb(){
        gestrichen[0] = false;
        gestrichen[1] = false;
        for(int i = 2;i <= Math.sqrt(obergrenze);i++){
            if(gestrichen[i]){
                for (int j = i*i;j <= obergrenze; j+= i){
                    gestrichen[j] = false;
                }
            }
        }
    }




     @Override
     public boolean isPrime(int p) {
         return gestrichen[p];
     }



     @Override
     public void printPrimes() {
        for (int i = 0;i <= obergrenze;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
     }
 }
