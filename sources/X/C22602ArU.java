package X;

/* renamed from: X.ArU  reason: case insensitive filesystem */
public class C22602ArU extends AnonymousClass120 {
    public C22586ArE A00;

    public C22602ArU(C22586ArE arE) {
        this.A00 = arE;
    }

    public AnonymousClass121 Bve() {
        return this.A00;
    }

    public String toString() {
        byte b;
        byte[] A0H = this.A00.A0H();
        int length = A0H.length;
        StringBuilder A0u = AnonymousClass000.A0u();
        if (length == 1) {
            A0u.append("KeyUsage: 0x");
            b = A0H[0] & 255;
        } else {
            A0u.append("KeyUsage: 0x");
            b = (A0H[0] & 255) | ((A0H[1] & 255) << 8);
        }
        C90504aG.A0z(b, A0u);
        return A0u.toString();
    }
}
