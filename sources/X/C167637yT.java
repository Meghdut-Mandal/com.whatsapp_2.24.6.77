package X;

import com.whatsapp.biz.catalog.view.PostcodeChangeBottomSheet;
import com.whatsapp.jid.UserJid;

/* renamed from: X.7yT  reason: invalid class name and case insensitive filesystem */
public final class C167637yT extends AnonymousClass04R {
    public C207109uZ A00;
    public final C001600r A01;
    public final C001600r A02;
    public final C001600r A03;
    public final C001600r A04;
    public final C001700s A05;
    public final C001700s A06;
    public final C001700s A07;
    public final C194299Oz A08;
    public final AnonymousClass1KP A09;
    public final C19420v0 A0A;
    public final UserJid A0B;
    public final C28201Rs A0C;
    public final AnonymousClass1KL A0D;
    public final C202279lS A0E;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
        if (r4.length() == 0) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0S(X.C207109uZ r6) {
        /*
            r5 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            r5.A00 = r6
            X.1KP r2 = r5.A09
            r1 = 1
            java.lang.String r0 = "postcode"
            boolean r0 = X.AnonymousClass1KP.A00(r2, r6, r0, r1)
            if (r0 == 0) goto L_0x0052
            X.0v0 r1 = r5.A0A
            com.whatsapp.jid.UserJid r0 = r5.A0B
            java.lang.String r0 = r0.getRawString()
            java.lang.String r4 = r1.A0l(r0)
            if (r4 == 0) goto L_0x0026
            int r1 = r4.length()
            r0 = 0
            if (r1 != 0) goto L_0x0027
        L_0x0026:
            r0 = 1
        L_0x0027:
            r3 = 0
            if (r0 == 0) goto L_0x0034
            X.9tg r0 = r6.A02
            if (r0 == 0) goto L_0x0032
            java.lang.String r4 = r0.A00
            if (r4 != 0) goto L_0x0034
        L_0x0032:
            java.lang.String r4 = ""
        L_0x0034:
            X.00s r1 = r5.A07
            X.9Oz r0 = r5.A08
            X.9tg r2 = r6.A02
            if (r2 == 0) goto L_0x003e
            java.lang.String r3 = r2.A02
        L_0x003e:
            java.lang.String r0 = r0.A00(r4, r3)
            r1.A0D(r0)
            X.00s r1 = r5.A05
            if (r2 == 0) goto L_0x004d
            java.lang.String r0 = r2.A02
            if (r0 != 0) goto L_0x004f
        L_0x004d:
            java.lang.String r0 = "pincode"
        L_0x004f:
            r1.A0D(r0)
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C167637yT.A0S(X.9uZ):void");
    }

    public static void A01(C167637yT r0, PostcodeChangeBottomSheet postcodeChangeBottomSheet, String str) {
        postcodeChangeBottomSheet.A0D = str;
        postcodeChangeBottomSheet.A0E = (String) r0.A01.A04();
        PostcodeChangeBottomSheet.A03(postcodeChangeBottomSheet);
    }

    public final void A0T(String str) {
        if (!AnonymousClass1KP.A00(this.A09, this.A00, "postcode", true)) {
            this.A0C.A0D("error");
            return;
        }
        C202279lS r5 = this.A0E;
        UserJid userJid = this.A0B;
        r5.A06.A00(new A9D(r5, new AnonymousClass9HH(this, str), userJid), userJid, str).A07(this.A00);
    }

    public C167637yT(AnonymousClass1KL r2, C202279lS r3, C194299Oz r4, AnonymousClass1KP r5, C19420v0 r6, UserJid userJid) {
        C36321k7.A0x(r6, r3);
        AnonymousClass00C.A0D(r2, 4);
        this.A0A = r6;
        this.A0E = r3;
        this.A09 = r5;
        this.A0D = r2;
        this.A08 = r4;
        this.A0B = userJid;
        C001700s A0S = C36431kI.A0S();
        this.A07 = A0S;
        this.A04 = A0S;
        C001700s A0S2 = C36431kI.A0S();
        this.A06 = A0S2;
        this.A03 = A0S2;
        C001700s A0S3 = C36431kI.A0S();
        this.A05 = A0S3;
        this.A01 = A0S3;
        C28201Rs A0t = C36441kJ.A0t();
        this.A0C = A0t;
        this.A02 = A0t;
    }
}
