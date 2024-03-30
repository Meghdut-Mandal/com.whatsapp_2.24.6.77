package X;

/* renamed from: X.3uw  reason: invalid class name and case insensitive filesystem */
public final class C80153uw implements Comparable {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C80153uw) {
                C80153uw r5 = (C80153uw) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C80153uw r3 = (C80153uw) obj;
        AnonymousClass00C.A0D(r3, 0);
        return C05590Qh.A00(this.A01, r3.A01);
    }

    public int hashCode() {
        return C36381kD.A08(this.A00, C36421kH.A04(this.A01));
    }

    public C80153uw(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BotCommand(name=");
        A0u.append(this.A01);
        A0u.append(", description=");
        A0u.append(this.A00);
        A0u.append(", flowInfo=");
        return AnonymousClass000.A0m((Object) null, A0u);
    }
}
