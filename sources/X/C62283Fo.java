package X;

/* renamed from: X.3Fo  reason: invalid class name and case insensitive filesystem */
public class C62283Fo {
    public boolean A00;
    public final C134986bw A01;

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C62283Fo)) {
            C62283Fo r4 = (C62283Fo) obj;
            if (this.A00 == r4.A00) {
                return this.A01.equals(r4.A01);
            }
        }
        return false;
    }

    public C62283Fo(C134986bw r1, boolean z) {
        this.A01 = r1;
        this.A00 = z;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = this.A01;
        return AnonymousClass000.A0L(Boolean.valueOf(this.A00), A0M);
    }
}
