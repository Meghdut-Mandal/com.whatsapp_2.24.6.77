package X;

/* renamed from: X.Asz  reason: case insensitive filesystem */
public class C22695Asz extends C195349Tx {
    public void A00(C192709Ig r4) {
        super.A00(new C192709Ig(256, r4.A01));
    }

    public byte[] A01() {
        byte[] A01 = super.A01();
        if (A01.length == 32) {
            A01[3] = (byte) (A01[3] & 15);
            A01[7] = (byte) (A01[7] & 15);
            A01[11] = (byte) (A01[11] & 15);
            A01[15] = (byte) (A01[15] & 15);
            A01[4] = (byte) (A01[4] & -4);
            A01[8] = (byte) (A01[8] & -4);
            A01[12] = (byte) (A01[12] & -4);
            return A01;
        }
        throw AnonymousClass001.A08("Poly1305 key must be 256 bits.");
    }
}
