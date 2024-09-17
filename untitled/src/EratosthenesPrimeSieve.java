public class EratosthenesPrimeSieve implements PrimeSieve{

    private int obergrenze;

    public EratosthenesPrimeSieve(int obergrenze) {
        this.obergrenze = obergrenze;
    }

    @Override
    public boolean isPrime(int p) {
        if(p < 2){
            return false;
        } else if (p == 2) {
            return true;
        }else if(p%2 == 0){
            return false;
        }else{
            for (int i = 3;i <= Math.sqrt(p);i += 2){
                if(p%i == 0){
                    return false;
                }
            }
        }

        return true;
    }

    @Override
    public void printPrimes() {
        for(int i = 0;i <= obergrenze;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }


}
