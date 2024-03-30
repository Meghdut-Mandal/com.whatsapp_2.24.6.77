package X;

import android.text.TextUtils;

/* renamed from: X.3Dk  reason: invalid class name and case insensitive filesystem */
public final class C61783Dk {
    public final C19600wD A00;
    public final AnonymousClass17X A01;
    public final C61493Cc A02;

    public final C51942od A00(AnonymousClass141 r3, AnonymousClass147 r4, String str) {
        String str2;
        AnonymousClass00C.A0D(r4, 0);
        C36321k7.A0x(r3, str);
        AnonymousClass17X r1 = this.A01;
        if (!r1.A0C(r4)) {
            return C51942od.NOT_MEMBER;
        }
        if (!r1.A0D(r4) && r3.A13) {
            return C51942od.GROUP_RESTRICTED;
        }
        String A002 = new C10880fN("\n\\s*\n\\s*[\n\\s]+").A00(str, "\n\n");
        AnonymousClass3QL r0 = r3.A0K;
        if (r0 != null) {
            str2 = r0.A03;
        } else {
            str2 = null;
        }
        if (TextUtils.equals(str2, A002)) {
            return C51942od.DESCRIPTION_SAME;
        }
        if (!this.A00.A09()) {
            return C51942od.NO_NETWORK;
        }
        if (C63883Lu.A00(A002) > this.A02.A00()) {
            return C51942od.DESCRIPTION_TOO_LONG;
        }
        return C51942od.NONE;
    }

    public C61783Dk(C19600wD r1, AnonymousClass17X r2, C61493Cc r3) {
        C36321k7.A11(r3, r2, r1);
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }
}
