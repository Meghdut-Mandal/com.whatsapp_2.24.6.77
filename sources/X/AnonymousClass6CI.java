package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.6CI  reason: invalid class name */
public final class AnonymousClass6CI {
    public final UserJid A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public AnonymousClass6CI(UserJid userJid, String str, String str2, boolean z) {
        AnonymousClass00C.A0D(userJid, 4);
        this.A02 = str;
        this.A01 = str2;
        this.A03 = z;
        this.A00 = userJid;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6CI) {
                AnonymousClass6CI r5 = (AnonymousClass6CI) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01) || this.A03 != r5.A03 || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A04 = C36421kH.A04(this.A02);
        return C36401kF.A02(this.A00, (C36381kD.A08(this.A01, A04) + C36341k9.A01(this.A03 ? 1 : 0)) * 31);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CatalogCategoryTabItem(tabName=");
        A0u.append(this.A02);
        A0u.append(", categoryId=");
        A0u.append(this.A01);
        A0u.append(", isLastLevel=");
        A0u.append(this.A03);
        A0u.append(", bizJid=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
