import java.util.ArrayList;
import java.util.List;

public class PythagoreanTripletBuilder {
    private int total;
    private int sum;

    public PythagoreanTripletBuilder withFactorsLessThanOrEqualTo(int total) {
        this.total = total;
        return this;
    }

    public PythagoreanTripletBuilder thatSumTo(int sum) {
        this.sum = sum;
        return this;
    }

    public List<PythagoreanTriplet> build() {
        List<PythagoreanTriplet> triplets = new ArrayList<PythagoreanTriplet>();
        for(int a=1 ; a<= total/3 ; a++){
            for(int b = a+1 ; b<= total/2 ; b++){
                int c = sum-a-b;

                PythagoreanTriplet triplet = new PythagoreanTriplet(a,b,c);
                if(triplet.isPythagorean()){
                    triplets.add(triplet);
                }

            }
        }
        return triplets;

    }
}

