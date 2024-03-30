package X;

import com.whatsapp.R;

/* renamed from: X.6A0  reason: invalid class name */
public final class AnonymousClass6A0 {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6A0) {
                AnonymousClass6A0 r5 = (AnonymousClass6A0) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36381kD.A08(this.A00, C36421kH.A04(this.A01)) + R.string.f12nameremoved;
    }

    public AnonymousClass6A0(String str, String str2) {
        C36321k7.A0x(str, str2);
        this.A01 = str;
        this.A00 = str2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("UpcomingActivitySectionItemViewState(dayOfWeek=");
        A0u.append(this.A01);
        A0u.append(", date=");
        A0u.append(this.A00);
        A0u.append(", dateFormatStringId=");
        return C36321k7.A0G(A0u, R.string.f12nameremoved);
    }
}
