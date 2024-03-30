package X;

/* renamed from: X.9Tt  reason: invalid class name */
public class AnonymousClass9Tt {
    public C135086c7 A00;
    public final /* synthetic */ C196129Xv A01;

    public AnonymousClass9Tt(C135086c7 r1, C196129Xv r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass9Tt)) {
            return false;
        }
        AnonymousClass9Tt r3 = (AnonymousClass9Tt) obj;
        C135086c7 r1 = this.A00;
        if (C202349ld.A03(r1)) {
            return C202349ld.A03(r3.A00);
        }
        return ((String) C165577te.A0g(r1)).equals(C165577te.A0g(r3.A00));
    }

    public int hashCode() {
        return AnonymousClass000.A0K(this.A00.A00, AnonymousClass001.A0L());
    }
}
