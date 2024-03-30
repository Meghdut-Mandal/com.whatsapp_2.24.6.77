package X;

/* renamed from: X.62Q  reason: invalid class name */
public final class AnonymousClass62Q {
    public boolean A00;
    public final String A01;
    public final C009003v A02;

    public static AnonymousClass62Q A00(String str, C009003v r2, boolean z) {
        AnonymousClass62Q r0 = new AnonymousClass62Q(str, r2);
        r0.A00 = z;
        return r0;
    }

    public AnonymousClass62Q(String str, C009003v r2) {
        this.A01 = str;
        this.A02 = r2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AccessibilityKey: ");
        return AnonymousClass000.A0q(this.A01, A0u);
    }
}
