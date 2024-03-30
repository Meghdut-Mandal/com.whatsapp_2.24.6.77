package com.whatsapp.reporttoadmin.xmpp;

import X.AnonymousClass00C;
import X.AnonymousClass147;
import X.AnonymousClass19A;
import X.AnonymousClass2dK;
import X.AnonymousClass2dL;
import X.AnonymousClass4MM;
import X.C006302t;
import X.C177768eL;
import X.C177778eM;
import X.C177788eN;
import X.C185648uZ;
import X.C186018vH;
import X.C1900196o;
import X.C203399nx;
import X.C235919b;
import X.C36321k7;
import X.C36331k8;
import X.C36371kC;
import X.C36441kJ;
import X.C55322uR;
import X.C55332uS;
import X.C55342uT;
import X.C55352uU;
import X.C65463Se;
import X.C87244Oa;
import com.whatsapp.util.Log;

public final class RtaXmppClient {
    public final AnonymousClass19A A00;
    public final C55332uS A01;
    public final C55342uT A02;
    public final C55352uU A03;

    public RtaXmppClient(AnonymousClass19A r2, C55332uS r3, C55342uT r4, C55352uU r5) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
        this.A03 = r5;
        this.A01 = r3;
        this.A02 = r4;
    }

    public static final C55322uR A00(C1900196o r4, String str, C006302t r6) {
        StringBuilder A0k;
        AnonymousClass00C.A0D(r4, 0);
        if (r4 instanceof C177778eM) {
            try {
                Object invoke = r6.invoke(((C177778eM) r4).A00);
                C36321k7.A1a(C36331k8.A0k("Rta::", str), "/onSuccess");
                return new AnonymousClass2dL(invoke);
            } catch (C235919b unused) {
                C36321k7.A1a(C36331k8.A0k("Rta::", str), "/malformedResponse");
                return new AnonymousClass2dK();
            }
        } else {
            if (r4 instanceof C177768eL) {
                int A04 = C36371kC.A04(((C177768eL) r4).A00);
                A0k = C36331k8.A0k("Rta::", str);
                A0k.append("/onError: ");
                A0k.append(A04);
            } else if (r4 instanceof C177788eN) {
                A0k = C36331k8.A0k("Rta::", str);
                A0k.append("/onDeliveryFailure: Network Failure");
            } else {
                throw C36441kJ.A18();
            }
            Log.e(A0k.toString());
            return new AnonymousClass2dK();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.AnonymousClass147 r11, com.whatsapp.jid.UserJid r12, java.lang.String r13, X.C023509x r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof X.C82643z2
            if (r0 == 0) goto L_0x0057
            r5 = r14
            X.3z2 r5 = (X.C82643z2) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0057
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r2 = r5.result
            X.0AO r1 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r5.label
            r9 = 1
            if (r0 == 0) goto L_0x0032
            if (r0 != r9) goto L_0x005d
            java.lang.Object r0 = r5.L$0
            X.8vH r0 = (X.C186018vH) r0
            X.AnonymousClass0AN.A00(r2)
        L_0x0024:
            X.96o r2 = (X.C1900196o) r2
            X.4LF r1 = new X.4LF
            r1.<init>(r0)
            java.lang.String r0 = "reportMessageToAdmin"
            X.2uR r0 = A00(r2, r0, r1)
            return r0
        L_0x0032:
            X.AnonymousClass0AN.A00(r2)
            X.19A r2 = r10.A00
            java.lang.String r4 = r2.A09()
            X.C36321k7.A16(r11, r12, r13, r9)
            X.8vH r0 = new X.8vH
            r0.<init>((X.AnonymousClass147) r11, (com.whatsapp.jid.UserJid) r12, (java.lang.String) r4, (java.lang.String) r13)
            X.9nx r3 = r0.A00
            X.AnonymousClass00C.A08(r3)
            r5.L$0 = r0
            r5.label = r9
            r6 = 385(0x181, float:5.4E-43)
            r7 = 32000(0x7d00, double:1.581E-319)
            java.lang.Object r2 = r2.A08(r3, r4, r5, r6, r7, r9)
            if (r2 != r1) goto L_0x0024
            return r1
        L_0x0057:
            X.3z2 r5 = new X.3z2
            r5.<init>(r10, r14)
            goto L_0x0012
        L_0x005d:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.reporttoadmin.xmpp.RtaXmppClient.A01(X.147, com.whatsapp.jid.UserJid, java.lang.String, X.09x):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.AnonymousClass147 r11, X.C023509x r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof X.C82633z1
            if (r0 == 0) goto L_0x0057
            r5 = r12
            X.3z1 r5 = (X.C82633z1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0057
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r2 = r5.result
            X.0AO r1 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r5.label
            r9 = 1
            if (r0 == 0) goto L_0x0032
            if (r0 != r9) goto L_0x005d
            java.lang.Object r0 = r5.L$0
            X.8vH r0 = (X.C186018vH) r0
            X.AnonymousClass0AN.A00(r2)
        L_0x0024:
            X.96o r2 = (X.C1900196o) r2
            X.4LE r1 = new X.4LE
            r1.<init>(r0)
            java.lang.String r0 = "getReportedMessages"
            X.2uR r0 = A00(r2, r0, r1)
            return r0
        L_0x0032:
            X.AnonymousClass0AN.A00(r2)
            X.19A r2 = r10.A00
            java.lang.String r4 = r2.A09()
            X.AnonymousClass00C.A0D(r11, r9)
            X.8vH r0 = new X.8vH
            r0.<init>((X.AnonymousClass147) r11, (java.lang.String) r4)
            X.9nx r3 = r0.A00
            X.AnonymousClass00C.A08(r3)
            r5.L$0 = r0
            r5.label = r9
            r6 = 385(0x181, float:5.4E-43)
            r7 = 32000(0x7d00, double:1.581E-319)
            java.lang.Object r2 = r2.A08(r3, r4, r5, r6, r7, r9)
            if (r2 != r1) goto L_0x0024
            return r1
        L_0x0057:
            X.3z1 r5 = new X.3z1
            r5.<init>(r10, r12)
            goto L_0x0012
        L_0x005d:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.reporttoadmin.xmpp.RtaXmppClient.A02(X.147, X.09x):java.lang.Object");
    }

    public final void A03(AnonymousClass147 r16, C87244Oa r17, boolean z) {
        C186018vH r6;
        AnonymousClass147 r7 = r16;
        C87244Oa r5 = r17;
        C36321k7.A0x(r7, r5);
        AnonymousClass19A r3 = this.A00;
        String A09 = r3.A09();
        boolean z2 = z;
        if (z) {
            r6 = new C186018vH(r7, new C185648uZ(13), (C185648uZ) null, (C185648uZ) null, (C185648uZ) null, (C185648uZ) null, (C185648uZ) null, A09);
        } else {
            r6 = new C186018vH(r7, (C185648uZ) null, new C185648uZ(17), (C185648uZ) null, (C185648uZ) null, (C185648uZ) null, (C185648uZ) null, A09);
        }
        C65463Se r1 = new C65463Se(r5, new AnonymousClass4MM(r5, z2), 1);
        C203399nx r0 = r6.A00;
        AnonymousClass00C.A08(r0);
        r3.A0E(r1, r0, A09, 384, 32000);
    }
}
