package X;

import java.util.List;

/* renamed from: X.3Ju  reason: invalid class name and case insensitive filesystem */
public final class C63373Ju {
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public C63373Ju(String str, String str2, String str3, List list, long j) {
        AnonymousClass00C.A0D(str, 1);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = j;
        this.A04 = list;
        this.A03 = str3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C63373Ju) {
                C63373Ju r8 = (C63373Ju) obj;
                if (!AnonymousClass00C.A0J(this.A02, r8.A02) || !AnonymousClass00C.A0J(this.A01, r8.A01) || this.A00 != r8.A00 || !AnonymousClass00C.A0J(this.A04, r8.A04) || !AnonymousClass00C.A0J(this.A03, r8.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36351kA.A05(this.A04, C36321k7.A00(this.A00, (C36421kH.A04(this.A02) + C36341k9.A09(this.A01)) * 31)) + C36421kH.A05(this.A03);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Post(id=");
        A0u.append(this.A02);
        A0u.append(", caption=");
        A0u.append(this.A01);
        A0u.append(", creationTime=");
        A0u.append(this.A00);
        A0u.append(", images=");
        A0u.append(this.A04);
        A0u.append(", postUrl=");
        return C36321k7.A0E(this.A03, A0u);
    }
}
