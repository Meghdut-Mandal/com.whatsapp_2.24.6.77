package X;

/* renamed from: X.61R  reason: invalid class name */
public final class AnonymousClass61R {
    public final AnonymousClass00S A00;
    public final AnonymousClass0AP A01;

    public String toString() {
        AnonymousClass0AP r3 = this.A01;
        r3.getContext().get(C13680kG.A00);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Request@");
        int hashCode = hashCode();
        C06780Vb.A00(16);
        String num = Integer.toString(hashCode, 16);
        AnonymousClass00C.A08(num);
        A0u.append(num);
        A0u.append("(");
        A0u.append("currentBounds()=");
        A0u.append(this.A00.invoke());
        A0u.append(", continuation=");
        return AnonymousClass000.A0m(r3, A0u);
    }

    public AnonymousClass61R(AnonymousClass00S r1, AnonymousClass0AP r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
