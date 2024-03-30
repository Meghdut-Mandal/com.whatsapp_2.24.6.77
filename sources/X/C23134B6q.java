package X;

/* renamed from: X.B6q  reason: case insensitive filesystem */
public class C23134B6q extends C197469bl {
    public final int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23134B6q(float[] fArr, int i) {
        super(fArr);
        this.A00 = i;
    }

    public String toString() {
        switch (this.A00) {
            case 0:
                return "Bradford";
            case 1:
                return "Ciecat02";
            default:
                return "VonKries";
        }
    }
}
