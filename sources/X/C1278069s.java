package X;

/* renamed from: X.69s  reason: invalid class name and case insensitive filesystem */
public final class C1278069s {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1278069s) {
                C1278069s r5 = (C1278069s) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (C36341k9.A09(this.A00) * 31) + C36421kH.A05(this.A01);
    }

    public C1278069s(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PersonalizedAvatarDeleteEffectEntity(avatarId=");
        A0u.append(this.A00);
        A0u.append(", deletionDetail=");
        return C36321k7.A0E(this.A01, A0u);
    }
}
