public class EgitimKredi extends BaseKredi{
    @Override
    public double krediHesaplama(double miktar) {
        return miktar*krediRate;
    }
}
