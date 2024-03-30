package X;

import android.content.Context;
import com.whatsapp.util.Log;

/* renamed from: X.8g6  reason: invalid class name */
public class AnonymousClass8g6 extends AnonymousClass9XQ {
    public final AnonymousClass16T A00;
    public final AnonymousClass6VM A01;
    public final C194699Qu A02;
    public final String A03;
    public final String A04;
    public final Context A05;
    public final AnonymousClass19A A06;
    public final String A07;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass8g6(android.content.Context r13, X.AnonymousClass17Y r14, X.C19730wQ r15, X.C19970wo r16, X.AnonymousClass16T r17, X.AnonymousClass16S r18, X.AnonymousClass19A r19, X.AnonymousClass6VM r20, X.C29221Vu r21, X.C29121Vk r22, X.AnonymousClass1EU r23, X.C200049gU r24, X.C195219Sy r25, X.C194699Qu r26, java.lang.String r27, java.lang.String r28, java.lang.String r29) {
        /*
            r12 = this;
            r10 = r24
            r9 = r23
            r8 = r22
            r7 = r21
            r5 = r16
            r4 = r15
            r3 = r14
            r2 = r13
            r11 = r25
            r1 = r12
            r6 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.A05 = r13
            r0 = r19
            r12.A06 = r0
            r0 = r17
            r12.A00 = r0
            r0 = r20
            r12.A01 = r0
            r0 = r27
            r12.A03 = r0
            r0 = r28
            r12.A07 = r0
            r0 = r29
            r12.A04 = r0
            r0 = r26
            r12.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8g6.<init>(android.content.Context, X.17Y, X.0wQ, X.0wo, X.16T, X.16S, X.19A, X.6VM, X.1Vu, X.1Vk, X.1EU, X.9gU, X.9Sy, X.9Qu, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static void A00(AnonymousClass8g6 r9, String str) {
        Log.i("PAY: BrazilVerifyCardSendAuthCodeAction sendAuthCode");
        AnonymousClass19A r3 = r9.A06;
        String A09 = r3.A09();
        String str2 = r9.A04;
        String str3 = r9.A07;
        AnonymousClass6QB A0T = C36421kH.A0T();
        C165567td.A1D(A0T);
        C203539oF.A0E(A0T, A09);
        AnonymousClass6QB A0a = C165587tf.A0a();
        C36331k8.A1D(A0a, "action", "br-verify-send-auth-code");
        C203539oF.A0D(A0a, str2);
        C203539oF.A0F(A0a, str3);
        if (C203539oF.A0V(str, 1, false)) {
            C36331k8.A1D(A0a, "auth-code", str);
        }
        C165577te.A1A(r3, new B7H(r9.A05, r9.A05, r9.A01, r9, 9), C165567td.A0I(A0a, A0T), A09);
    }
}
