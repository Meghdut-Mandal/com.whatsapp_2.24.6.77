package X;

/* renamed from: X.8aa  reason: invalid class name and case insensitive filesystem */
public class C175498aa extends AnonymousClass9TY {
    public final String A00;

    public C175498aa(String str) {
        super(1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.A00.equals(((C175498aa) obj).A00);
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        AnonymousClass000.A1J(A0M, super.hashCode());
        return AnonymousClass000.A0L(this.A00, A0M);
    }
}
