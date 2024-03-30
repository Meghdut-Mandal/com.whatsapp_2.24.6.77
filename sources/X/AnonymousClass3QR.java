package X;

/* renamed from: X.3QR  reason: invalid class name */
public final class AnonymousClass3QR {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3QR) {
                AnonymousClass3QR r5 = (AnonymousClass3QR) obj;
                if (!(AnonymousClass00C.A0J(this.A02, r5.A02) && AnonymousClass00C.A0J(this.A05, r5.A05) && this.A00 == r5.A00 && this.A01 == r5.A01 && this.A06 == r5.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((C36341k9.A09(this.A02) * 31) + C36421kH.A05(this.A05)) * 31) + this.A00) * 31) + this.A01) * 31) + C36341k9.A01(this.A06 ? 1 : 0);
    }

    public AnonymousClass3QR(String str, String str2, int i, int i2, boolean z) {
        this.A02 = str;
        this.A05 = str2;
        this.A00 = i;
        this.A01 = i2;
        this.A06 = z;
        if (str == null) {
            if (str2 == null) {
                str = "";
            } else {
                str = str2;
            }
        }
        this.A03 = str;
        StringBuilder A0v = AnonymousClass000.A0v(str);
        A0v.append(':');
        this.A04 = C36381kD.A10(A0v, i);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ProxySetting(domain=");
        A0u.append(this.A02);
        A0u.append(", ip=");
        A0u.append(this.A05);
        A0u.append(", chatPort=");
        A0u.append(this.A00);
        A0u.append(", mediaPort=");
        A0u.append(this.A01);
        A0u.append(", useChatTls=");
        return C36321k7.A0H(A0u, this.A06);
    }

    public AnonymousClass3QR() {
        this((String) null, (String) null, 443, 587, true);
    }
}
