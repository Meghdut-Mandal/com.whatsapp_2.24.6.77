package X;

/* renamed from: X.69I  reason: invalid class name */
public final class AnonymousClass69I {
    public final String A00;
    public final AnonymousClass00P A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass69I) {
                AnonymousClass69I r5 = (AnonymousClass69I) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static void A00(AnonymousClass69I r1, C07650Ys r2, int i) {
        r2.A0A(new AnonymousClass0Yd(i, (CharSequence) r1.A00));
    }

    public static void A01(AnonymousClass62Q r1, AnonymousClass7e3 r2, String str, AnonymousClass00P r4) {
        r2.Bq1(r1, new AnonymousClass69I(str, r4));
    }

    public int hashCode() {
        int i;
        String str = this.A00;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        AnonymousClass00P r0 = this.A01;
        if (r0 != null) {
            i2 = r0.hashCode();
        }
        return i3 + i2;
    }

    public AnonymousClass69I(String str, AnonymousClass00P r2) {
        this.A00 = str;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AccessibilityAction(label=");
        A0u.append(this.A00);
        A0u.append(", action=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
