package X;

/* renamed from: X.9Vw  reason: invalid class name and case insensitive filesystem */
public final class C195769Vw {
    public final int A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195769Vw) {
                C195769Vw r5 = (C195769Vw) obj;
                if (!("com.facebook.katana".equals("com.facebook.katana") && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C195769Vw(boolean z, int i) {
        this.A01 = z;
        this.A00 = i;
    }

    public int hashCode() {
        return ((674642223 + C36341k9.A01(this.A01 ? 1 : 0)) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FacebookAppInfo(packageName=");
        A0u.append("com.facebook.katana");
        A0u.append(", isInstalled=");
        A0u.append(this.A01);
        A0u.append(", versionCode=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
