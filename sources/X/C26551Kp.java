package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.1Kp  reason: invalid class name and case insensitive filesystem */
public final class C26551Kp extends AnonymousClass1KS {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C26551Kp(X.C19970wo r14, X.C19630wG r15, X.AnonymousClass1KW r16, X.C19420v0 r17, X.C20810yC r18, X.C21010yW r19, X.AnonymousClass1KU r20, X.C21670zc r21, X.C21690ze r22, X.C21430zE r23, X.C19770wU r24) {
        /*
            r13 = this;
            r0 = 1
            r1 = r14
            X.AnonymousClass00C.A0D(r14, r0)
            r0 = 2
            r2 = r15
            X.AnonymousClass00C.A0D(r15, r0)
            r0 = 3
            r11 = r24
            X.AnonymousClass00C.A0D(r11, r0)
            r0 = 4
            r6 = r19
            X.AnonymousClass00C.A0D(r6, r0)
            r0 = 5
            r4 = r17
            X.AnonymousClass00C.A0D(r4, r0)
            r0 = 6
            r10 = r23
            X.AnonymousClass00C.A0D(r10, r0)
            r0 = 7
            r8 = r21
            X.AnonymousClass00C.A0D(r8, r0)
            r0 = 8
            r9 = r22
            X.AnonymousClass00C.A0D(r9, r0)
            r0 = 10
            r5 = r18
            X.AnonymousClass00C.A0D(r5, r0)
            r0 = 11
            r3 = r16
            X.AnonymousClass00C.A0D(r3, r0)
            r12 = 200740397(0xbf70e2d, float:9.516227E-32)
            r0 = r13
            r7 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26551Kp.<init>(X.0wo, X.0wG, X.1KW, X.0v0, X.0yC, X.0yW, X.1KU, X.0zc, X.0ze, X.0zE, X.0wU):void");
    }

    public final void A0C(AnonymousClass5TS r9, Jid jid, Boolean bool, String str, String str2, String str3, int i) {
        String str4 = str;
        int i2 = i;
        A01(i, str);
        if (bool != null) {
            A04(i, "psl_is_draft", bool.booleanValue());
        }
        A03(i, "fetch_context", r9.contextName);
        A06(jid, str2, str3, str4, i2);
    }

    public final void A0B(int i, String str, String str2) {
        if (!(str == null || str.length() == 0)) {
            A03(i, "error_code", str);
        }
        if (str2 != null && str2.length() != 0) {
            A03(i, "error_message", str2);
        }
    }
}
