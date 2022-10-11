public class BaseKredi {
   float krediRate = (float) 1.18;

    public void setKrediRate(float krediRate) {
        this.krediRate = krediRate;
    }

    public float getKrediRate() {
        return krediRate;
    }

    public double krediHesaplama(double miktar){
        System.out.println("Base Kredi");
        return miktar*krediRate;
    }

    /*
    aşağıdaki kod bloğu yukarıdakinden farklıdır çünkü final keyword kullanılmıştır ve bu şekilde overriding yapılamaz.!
    public final double krediHesaplama(double miktar){
        System.out.println("Base Kredi");
        return miktar*krediRate;
    }
     */
}
