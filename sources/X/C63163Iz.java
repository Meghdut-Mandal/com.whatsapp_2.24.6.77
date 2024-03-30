package X;

import android.net.Uri;

/* renamed from: X.3Iz  reason: invalid class name and case insensitive filesystem */
public final class C63163Iz {
    public final Uri A00;
    public final CharSequence A01;
    public final CharSequence A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C63163Iz) {
                C63163Iz r5 = (C63163Iz) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((AnonymousClass000.A0H(this.A02) * 31) + AnonymousClass000.A0H(this.A01)) * 31) + C36411kG.A09(this.A00);
    }

    public C63163Iz(Uri uri, CharSequence charSequence, CharSequence charSequence2) {
        this.A02 = charSequence;
        this.A01 = charSequence2;
        this.A00 = uri;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SystemInfoModel(title=");
        A0u.append(this.A02);
        A0u.append(", description=");
        A0u.append(this.A01);
        A0u.append(", learnMoreUri=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
