package X;

/* renamed from: X.0X8  reason: invalid class name */
public final class AnonymousClass0X8 {
    public static final C06340Tf A01 = new C06340Tf();
    public final Object A00;

    public boolean equals(Object obj) {
        Object obj2 = this.A00;
        if (!(obj instanceof AnonymousClass0X8) || !AnonymousClass00C.A0J(obj2, ((AnonymousClass0X8) obj).A00)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0H(this.A00);
    }

    public String toString() {
        Object obj = this.A00;
        if (obj instanceof AnonymousClass0n9) {
            return obj.toString();
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Value(");
        return AnonymousClass000.A0m(obj, A0u);
    }

    public /* synthetic */ AnonymousClass0X8(Object obj) {
        this.A00 = obj;
    }
}
