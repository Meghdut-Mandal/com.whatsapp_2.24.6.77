package X;

/* renamed from: X.9f5  reason: invalid class name and case insensitive filesystem */
public class C199299f5 {
    public final C21665AUh A00;

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C199299f5)) {
            return false;
        }
        return this.A00.equals(((C199299f5) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C199299f5(byte[] bArr) {
        this.A00 = C200529hY.A01(bArr);
    }

    public C199299f5(C21665AUh aUh) {
        this.A00 = aUh;
    }
}
