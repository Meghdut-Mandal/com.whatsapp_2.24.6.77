package X;

/* renamed from: X.8ab  reason: invalid class name and case insensitive filesystem */
public class C175508ab extends AnonymousClass9TY {
    public final C62363Fw A00;
    public final AnonymousClass4O1 A01;

    public C175508ab(C62363Fw r2, AnonymousClass4O1 r3) {
        super(2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.A00.equals(((C175508ab) obj).A00);
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        AnonymousClass000.A1J(A0M, super.hashCode());
        return AnonymousClass000.A0L(this.A00, A0M);
    }
}
