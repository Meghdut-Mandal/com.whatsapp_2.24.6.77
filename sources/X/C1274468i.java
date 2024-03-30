package X;

/* renamed from: X.68i  reason: invalid class name and case insensitive filesystem */
public final class C1274468i {
    public final AnonymousClass6CC A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1274468i) && AnonymousClass00C.A0J(this.A00, ((C1274468i) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass000.A0H(this.A00);
    }

    public C1274468i(AnonymousClass6CC r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PersonalizedAvatarMetadata(arEffect=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
