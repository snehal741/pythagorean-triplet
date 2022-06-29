
class PythagoreanTriplet{
    int a, b, c;
    PythagoreanTriplet(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public boolean equals(Object obj) {
        PythagoreanTriplet triplet = (PythagoreanTriplet) obj;

        return a == triplet.a && b == triplet.b && c == triplet.c;
    }

    public static PythagoreanTripletBuilder makeTripletsList() {
        return new PythagoreanTripletBuilder();
    }

    public boolean isPythagorean() {
        return a * a + b * b == c * c;
    }
}
