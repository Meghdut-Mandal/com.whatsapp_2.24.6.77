package X;

import com.whatsapp.R;

/* renamed from: X.539  reason: invalid class name */
public final class AnonymousClass539 extends C123255wC {
    public final int A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass539) {
                AnonymousClass539 r5 = (AnonymousClass539) obj;
                if (this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public AnonymousClass539(int i, String str) {
        super(new C47842fr(str), R.color.f6nameremoved, i, false);
        this.A00 = i;
        this.A01 = str;
    }

    public int hashCode() {
        return (this.A00 * 31) + C36341k9.A09(this.A01);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("GroupName(numConnected=");
        A0u.append(this.A00);
        A0u.append(", groupName=");
        return C36321k7.A0E(this.A01, A0u);
    }
}
