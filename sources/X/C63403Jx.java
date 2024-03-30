package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.3Jx  reason: invalid class name and case insensitive filesystem */
public final class C63403Jx {
    public final int A00;
    public final Drawable A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public C63403Jx(Drawable drawable, String str, String str2, String str3, int i) {
        AnonymousClass00C.A0D(str, 1);
        this.A04 = str;
        this.A02 = str2;
        this.A00 = i;
        this.A01 = drawable;
        this.A03 = str3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C63403Jx) {
                C63403Jx r5 = (C63403Jx) obj;
                if (!AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A02, r5.A02) || this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((C36421kH.A04(this.A04) + C36341k9.A09(this.A02)) * 31) + this.A00) * 31) + AnonymousClass000.A0H(this.A01)) * 31) + C36421kH.A05(this.A03);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SearchResultItem(text=");
        A0u.append(this.A04);
        A0u.append(", settingType=");
        A0u.append(this.A02);
        A0u.append(", viewType=");
        A0u.append(this.A00);
        A0u.append(", icon=");
        A0u.append(this.A01);
        A0u.append(", subtitle=");
        return C36321k7.A0E(this.A03, A0u);
    }
}
