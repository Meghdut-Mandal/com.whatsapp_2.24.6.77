package X;

/* renamed from: X.21A  reason: invalid class name */
public final class AnonymousClass21A extends AnonymousClass3FS {
    public final AnonymousClass217 A00;
    public final boolean A01;

    public AnonymousClass21A(AnonymousClass217 r1, boolean z) {
        this.A01 = z;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Connected(isSelected=");
        A0u.append(this.A01);
        A0u.append(", statusIndicatorAttributes=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
