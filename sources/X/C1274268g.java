package X;

/* renamed from: X.68g  reason: invalid class name and case insensitive filesystem */
public final class C1274268g {
    public final C134876bk A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1274268g) && AnonymousClass00C.A0J(this.A00, ((C1274268g) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C1274268g(C134876bk r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("UserEntitySourceAccessTokenPair(sourceAndAccessTokenPair=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
