package X;

/* renamed from: X.3S5  reason: invalid class name */
public final class AnonymousClass3S5 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass3S5(String str, int i, String str2) {
        this(str, str2, i, false, false);
        AnonymousClass00C.A0D(str2, 3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3S5) {
                AnonymousClass3S5 r5 = (AnonymousClass3S5) obj;
                if (!(AnonymousClass00C.A0J(this.A01, r5.A01) && this.A00 == r5.A00 && this.A04 == r5.A04 && this.A03 == r5.A03 && AnonymousClass00C.A0J(this.A02, r5.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C53202qw.A00(C53202qw.A00(((C36341k9.A09(this.A01) * 31) + this.A00) * 31, this.A04), this.A03) + C36421kH.A05(this.A02);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("GroupInfoContextData(context=");
        A0u.append(this.A01);
        A0u.append(", deviceSyncType=");
        A0u.append(this.A00);
        A0u.append(", messageRevoked=");
        A0u.append(this.A04);
        A0u.append(", isLid=");
        A0u.append(this.A03);
        A0u.append(", phash=");
        return C36321k7.A0E(this.A02, A0u);
    }

    public AnonymousClass3S5(String str, String str2, int i, boolean z, boolean z2) {
        this.A01 = str;
        this.A00 = i;
        this.A04 = z;
        this.A03 = z2;
        this.A02 = str2;
    }

    public AnonymousClass3S5(String str, int i) {
        this(str, (String) null, i, false, false);
    }
}
