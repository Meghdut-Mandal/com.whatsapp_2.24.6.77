package X;

/* renamed from: X.68n  reason: invalid class name and case insensitive filesystem */
public final class C1274968n {
    public final C1278169t A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1274968n) && AnonymousClass00C.A0J(this.A00, ((C1274968n) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C1274968n(C1278169t r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AREffectCategoryModel(arEffects=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
