package X;

/* renamed from: X.89k  reason: invalid class name and case insensitive filesystem */
public final class C1694989k extends AnonymousClass95B {
    public final AnonymousClass88D A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1694989k) && AnonymousClass00C.A0J(this.A00, ((C1694989k) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C1694989k(AnonymousClass88D r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ThroughputHealth(data=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
