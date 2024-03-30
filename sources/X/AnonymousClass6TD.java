package X;

/* renamed from: X.6TD  reason: invalid class name */
public class AnonymousClass6TD {
    public final int A00;
    public final int A01;
    public final long A02;
    public final byte[] A03;

    public AnonymousClass6TD(byte[] bArr, int i, long j) {
        this.A01 = i;
        this.A02 = bArr != null ? j + 16 + 16 : j;
        this.A00 = 0;
        this.A03 = bArr;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FpmMessage{type=");
        A0u.append(this.A01);
        A0u.append(", length=");
        A0u.append(this.A02);
        A0u.append(", errorCode=");
        A0u.append(this.A00);
        return AnonymousClass000.A0s(A0u);
    }

    public AnonymousClass6TD(int i, long j, int i2) {
        this.A01 = i;
        this.A02 = j;
        this.A00 = i2;
        this.A03 = null;
    }

    public AnonymousClass6TD(int i) {
        this.A01 = i;
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = null;
    }
}
