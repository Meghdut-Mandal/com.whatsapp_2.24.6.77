package X;

import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: X.7yo  reason: invalid class name and case insensitive filesystem */
public class C167787yo extends AnonymousClass04R implements C22954Az6 {
    public final C001700s A00 = C36431kI.A0S();
    public final C001700s A01 = C36431kI.A0S();
    public final C001700s A02 = C36431kI.A0S();
    public final C24881Ed A03;
    public final C20810yC A04;
    public final C19770wU A05;
    public final HashMap A06 = AnonymousClass001.A0J();
    public final AEA A07;
    public final C202269lR A08;
    public final AnonymousClass8gL A09;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        if (r17 != null) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BfL(com.whatsapp.jid.UserJid r13, X.C135086c7 r14, X.C135086c7 r15, X.C135086c7 r16, X.C202059ky r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, boolean r21, boolean r22, boolean r23, boolean r24, boolean r25) {
        /*
            r12 = this;
            X.00s r1 = r12.A00
            r0 = 0
            X.C36341k9.A18(r1, r0)
            X.9d7 r2 = new X.9d7
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r18
            r8 = r19
            r9 = r20
            r11 = r22
            r10 = r25
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1 = r17
            if (r21 == 0) goto L_0x002b
            if (r17 != 0) goto L_0x002d
            if (r23 == 0) goto L_0x0023
            r0 = 1
        L_0x0023:
            r2.A07 = r0
            X.00s r1 = r12.A01
        L_0x0027:
            r1.A0D(r2)
            return
        L_0x002b:
            if (r17 == 0) goto L_0x0047
        L_0x002d:
            X.AEA r2 = r12.A07
            int r1 = r1.A00
            X.9lR r0 = r12.A08
            X.9YX r0 = r0.A04
            X.9fr r1 = r2.A03(r0, r1)
            int r0 = r1.A00
            if (r0 != 0) goto L_0x0041
            java.lang.String r0 = r1.A01
            if (r0 == 0) goto L_0x0047
        L_0x0041:
            X.00s r0 = r12.A02
            r0.A0D(r1)
            return
        L_0x0047:
            X.00s r1 = r12.A02
            r0 = 2131892408(0x7f1218b8, float:1.9419563E38)
            X.9fr r2 = new X.9fr
            r2.<init>(r0)
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C167787yo.BfL(com.whatsapp.jid.UserJid, X.6c7, X.6c7, X.6c7, X.9ky, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean):void");
    }

    public C167787yo(C24881Ed r2, C20810yC r3, AEA aea, C202269lR r5, AnonymousClass8gL r6, C19770wU r7) {
        this.A04 = r3;
        this.A05 = r7;
        this.A07 = aea;
        this.A08 = r5;
        this.A03 = r2;
        this.A09 = r6;
    }

    public void A0S(C135086c7 r5, C135086c7 r6) {
        String str = (String) C165577te.A0g(r5);
        if (!TextUtils.isEmpty(str) && C202349ld.A02(r6)) {
            C135086c7 A012 = C202349ld.A01(this.A06.get(C90514aH.A0y(str)), "accountHolderName");
            if (!C202349ld.A02(A012)) {
                this.A01.A0D(new C198229d7(r5, A012));
                return;
            }
        }
        C36341k9.A18(this.A00, true);
        this.A09.A01(r5, r6, this);
    }
}
