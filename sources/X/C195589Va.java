package X;

/* renamed from: X.9Va  reason: invalid class name and case insensitive filesystem */
public class C195589Va {
    public final AnonymousClass9W7 A00;
    public final C201539jo A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C195589Va)) {
            return false;
        }
        C195589Va r4 = (C195589Va) obj;
        return this.A01.equals(r4.A01) && this.A00.equals(r4.A00);
    }

    public C195589Va(AnonymousClass9W7 r1, C201539jo r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = this.A01;
        return AnonymousClass000.A0L(this.A00, A0M);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SyncdKey{keyId=");
        A0u.append(this.A01);
        A0u.append(", syncdKeyData=");
        return C90464aC.A0X(this.A00, A0u);
    }
}
