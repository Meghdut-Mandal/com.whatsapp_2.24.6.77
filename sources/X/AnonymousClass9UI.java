package X;

import java.util.Arrays;

/* renamed from: X.9UI  reason: invalid class name */
public class AnonymousClass9UI {
    public final int A00;
    public final byte[] A01;
    public final /* synthetic */ C21230ys A02;

    public AnonymousClass9UI(C21230ys r2, byte[] bArr) {
        this.A02 = r2;
        this.A01 = bArr;
        this.A00 = Arrays.hashCode(bArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass9UI)) {
            return false;
        }
        return Arrays.equals(this.A01, ((AnonymousClass9UI) obj).A01);
    }

    public int hashCode() {
        return this.A00;
    }
}
