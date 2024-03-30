package X;

import java.util.Collection;

/* renamed from: X.3JX  reason: invalid class name */
public final class AnonymousClass3JX {
    public final Integer A00;
    public final String A01;
    public final Collection A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3JX) {
                AnonymousClass3JX r5 = (AnonymousClass3JX) obj;
                if (this.A03 != r5.A03 || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36351kA.A05(this.A02, ((C36341k9.A01(this.A03 ? 1 : 0) * 31) + AnonymousClass000.A0H(this.A00)) * 31) + C36421kH.A05(this.A01);
    }

    public AnonymousClass3JX(Integer num, String str, Collection collection, boolean z) {
        this.A03 = z;
        this.A00 = num;
        this.A02 = collection;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("VoipContactPickerUiState(isVideo=");
        A0u.append(this.A03);
        A0u.append(", customMultiSelectLimit=");
        A0u.append(this.A00);
        A0u.append(", jidsToExclude=");
        A0u.append(this.A02);
        A0u.append(", callLinkToken=");
        return C36321k7.A0E(this.A01, A0u);
    }
}
