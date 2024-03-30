package X;

import com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity;
import java.io.IOException;

/* renamed from: X.7tb  reason: invalid class name and case insensitive filesystem */
public class C165547tb implements C160087kR {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public C165547tb(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.A05 = i;
        this.A03 = obj4;
        this.A00 = obj;
        this.A04 = obj3;
        this.A01 = obj5;
        this.A02 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00e6, code lost:
        if (r2 == X.C188598zq.A05) goto L_0x00e8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void B2J(X.C123815x8 r12) {
        /*
            r11 = this;
            int r1 = r11.A05
            r0 = 0
            if (r1 == 0) goto L_0x0087
            X.AnonymousClass00C.A0D(r12, r0)
            boolean r0 = X.C224714l.A02()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0080
            int r0 = r12.A00
            if (r0 == 0) goto L_0x003e
            java.lang.Object r6 = r11.A04
            X.6Ju r6 = (X.C130116Ju) r6
            X.6MQ r3 = r6.A00
            X.66O r2 = r12.A04
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.xfamily.utils.XFamilyGraphqlErrorProcessor"
            X.AnonymousClass00C.A0E(r2, r0)
            X.2V1 r2 = (X.AnonymousClass2V1) r2
            java.lang.Object r5 = r11.A03
            X.6Ee r5 = (X.C128936Ee) r5
            java.lang.Object r8 = r11.A01
            java.lang.Object r7 = r11.A02
            java.lang.Object r9 = r11.A00
            r10 = 19
            X.753 r4 = new X.753
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r1 = 0
            X.7s3 r0 = new X.7s3
            r0.<init>(r9, r1)
            r3.A00(r5, r0, r2, r4)
            return
        L_0x003e:
            X.60z r0 = r12.A03
            java.lang.Object r1 = r0.A00
            X.694 r1 = (X.AnonymousClass694) r1
            if (r1 != 0) goto L_0x0050
            java.lang.Object r2 = r11.A00
            X.638 r2 = (X.AnonymousClass638) r2
            r1 = 2
            r0 = 0
            r2.A00(r1, r0)
            return
        L_0x0050:
            java.lang.Object r4 = r11.A00
            X.638 r4 = (X.AnonymousClass638) r4
            X.5u5 r0 = r4.A00
            X.005 r0 = r0.A01
            java.lang.Object r3 = r0.get()
            X.1UM r3 = (X.AnonymousClass1UM) r3
            X.1US r2 = r4.A01
            X.6bk r1 = r1.A00
            X.695 r0 = new X.695
            r0.<init>(r1)
            r3.A03(r2, r0)
            X.5rf r1 = r4.A02
            X.3GB r0 = r1.A01
            r0.A00()
            com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity r3 = r1.A00
            X.17Y r2 = r3.A05
            r1 = 14
            X.74f r0 = new X.74f
            r0.<init>(r3, r1)
            r2.A0H(r0)
            return
        L_0x0080:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0087:
            X.AnonymousClass00C.A0D(r12, r0)
            X.60z r0 = r12.A03
            java.lang.Object r4 = r0.A00
            if (r4 != 0) goto L_0x00b0
            java.lang.Object r1 = r11.A03
            X.1UN r1 = (X.AnonymousClass1UN) r1
            java.lang.String r0 = "FETCH_PHONE_NUMBER_NULL"
            r1.A03(r0)
            java.lang.String r0 = "WfsNativeAuthManager/emptyNonceResultResponse"
            X.AnonymousClass3TI.A00(r0)
            java.lang.Object r3 = r11.A00
            X.5pO r3 = (X.C119195pO) r3
            java.lang.String r0 = "Please link and/or unpause accounts"
            java.lang.IllegalStateException r2 = X.AnonymousClass001.A09(r0)
            X.3OD r1 = r3.A01
            X.4Sq r0 = r3.A00
            X.AnonymousClass3OD.A00(r0, r1, r2)
            return
        L_0x00b0:
            java.lang.Object r0 = r11.A04
            X.62h r0 = (X.C1260362h) r0
            X.66E r3 = r0.A00
            X.0zE r2 = r3.A01
            r1 = 551497305(0x20df2e59, float:3.780834E-19)
            r0 = 467(0x1d3, float:6.54E-43)
            r2.markerEnd(r1, r0)
            r0 = 0
            r3.A00 = r0
            java.lang.Object r1 = r11.A03
            X.1UN r1 = (X.AnonymousClass1UN) r1
            java.lang.String r0 = "FETCH_PHONE_NUMBER_END"
            r1.A04(r0)
            X.6vT r2 = X.C146356vT.A00()
            java.lang.String r0 = "WaLinkedNonce"
            X.6c7 r1 = new X.6c7
            r1.<init>(r2, r4, r0)
            r0 = 3
            X.6bk r3 = new X.6bk
            r3.<init>(r1, r0)
            java.lang.Object r2 = r11.A01
            X.8zq r0 = X.C188598zq.A04
            if (r2 == r0) goto L_0x00e8
            X.8zq r0 = X.C188598zq.A05
            r1 = 1
            if (r2 != r0) goto L_0x00e9
        L_0x00e8:
            r1 = 2
        L_0x00e9:
            java.lang.Object r0 = r11.A02
            X.5pP r0 = (X.C119205pP) r0
            X.3Hk r4 = new X.3Hk
            r4.<init>(r3, r1)
            X.3OD r3 = r0.A01
            X.4Sq r2 = r0.A00
            r1 = 3
            X.4Hv r0 = new X.4Hv
            r0.<init>(r2, r3, r4)
            X.C131886Rd.A01(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C165547tb.B2J(X.5x8):void");
    }

    public void BVL(IOException iOException) {
        if (this.A05 != 0) {
            C120535rf r1 = ((AnonymousClass638) this.A00).A02;
            Integer A0U = C90494aF.A0U();
            r1.A01.A00();
            AccountLinkingNativeAuthActivity accountLinkingNativeAuthActivity = r1.A00;
            accountLinkingNativeAuthActivity.A05.A0H(new AnonymousClass737(accountLinkingNativeAuthActivity, A0U, (Object) null, 35));
            return;
        }
        AnonymousClass00C.A0D(iOException, 0);
        ((AnonymousClass1UN) this.A03).A03("FETCH_PHONE_NUMBER_ERROR");
        C119195pO r0 = (C119195pO) this.A00;
        AnonymousClass3OD.A00(r0.A00, r0.A01, iOException);
    }

    public void BWk(Exception exc) {
        int i;
        Integer num;
        if (this.A05 != 0) {
            AnonymousClass00C.A0D(exc, 0);
            boolean z = exc instanceof AnonymousClass5V0;
            AnonymousClass638 r2 = (AnonymousClass638) this.A00;
            if (z) {
                C132286Sy r0 = ((AnonymousClass5V0) exc).error;
                i = r0.A01;
                num = Integer.valueOf(r0.A02);
            } else {
                i = 2;
                num = null;
            }
            r2.A00(i, num);
            return;
        }
        AnonymousClass00C.A0D(exc, 0);
        ((AnonymousClass1UN) this.A03).A03("FETCH_PHONE_NUMBER_END");
        C119195pO r02 = (C119195pO) this.A00;
        AnonymousClass3OD.A00(r02.A00, r02.A01, exc);
    }
}
