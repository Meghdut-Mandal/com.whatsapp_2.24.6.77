package X;

/* renamed from: X.6PC  reason: invalid class name */
public final class AnonymousClass6PC {
    public final C131416Oy A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6PC) {
                AnonymousClass6PC r5 = (AnonymousClass6PC) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C36391kE.A0A(this.A00) + C36341k9.A09(this.A01)) * 31) + C36421kH.A05(this.A02);
    }

    public AnonymousClass6PC(C131416Oy r1, String str, String str2) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = str2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WaffleCacheQueryResponse(multiDestinationAutoCrosspostingSetting=");
        A0u.append(this.A00);
        A0u.append(", obfuscatedFBCrosspostingDestinationId=");
        A0u.append(this.A01);
        A0u.append(", obfuscatedIGCrosspostingDestinationId=");
        return C36321k7.A0E(this.A02, A0u);
    }

    public AnonymousClass6PC() {
        this(new C131416Oy(false, false), (String) null, (String) null);
    }
}
