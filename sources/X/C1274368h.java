package X;

/* renamed from: X.68h  reason: invalid class name and case insensitive filesystem */
public final class C1274368h {
    public final C1264964g A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1274368h) && AnonymousClass00C.A0J(this.A00, ((C1274368h) obj).A00));
    }

    public int hashCode() {
        return ((C36391kE.A0A(this.A00) + 1000) * 31) + 1231;
    }

    public C1274368h(C1264964g r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MapViewAction(cameraUpdate=");
        A0u.append(this.A00);
        A0u.append(", animationTime=");
        A0u.append(1000);
        A0u.append(", isGPSLocation=");
        return C36321k7.A0H(A0u, true);
    }
}
