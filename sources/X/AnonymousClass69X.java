package X;

/* renamed from: X.69X  reason: invalid class name */
public final class AnonymousClass69X {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass69X) {
                AnonymousClass69X r5 = (AnonymousClass69X) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90504aG.A0B(this.A01, C36421kH.A04(this.A00));
    }

    public AnonymousClass69X(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("NativeMLModelAssetDeltaCacheEntry(baseMd5=");
        A0u.append(this.A00);
        A0u.append(", deltaUrl=");
        return C36321k7.A0E(this.A01, A0u);
    }
}
