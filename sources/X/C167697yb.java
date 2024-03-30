package X;

import android.content.Context;
import android.content.Intent;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.7yb  reason: invalid class name and case insensitive filesystem */
public class C167697yb extends AnonymousClass04R {
    public boolean A00;
    public boolean A01;
    public final C001700s A02;
    public final C001700s A03;
    public final C001700s A04;
    public final C001700s A05;
    public final C001700s A06;
    public final C001700s A07;
    public final C001700s A08;
    public final C001700s A09;
    public final C001700s A0A;
    public final C001700s A0B = C36431kI.A0S();
    public final C001700s A0C;
    public final C001700s A0D;
    public final C001700s A0E = C36431kI.A0S();
    public final AnonymousClass1X4 A0F;
    public final AnonymousClass164 A0G;
    public final AnonymousClass9UA A0H;
    public final C198329dH A0I;
    public final AnonymousClass9Y1 A0J;
    public final AnonymousClass9UB A0K;
    public final AnonymousClass185 A0L;
    public final AnonymousClass171 A0M;
    public final C19970wo A0N;
    public final UserJid A0O;
    public final AnonymousClass3L6 A0P;
    public final AnonymousClass9ZJ A0Q;
    public final C143076pw A0R;
    public final C20810yC A0S;
    public final AnonymousClass9R0 A0T;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0066, code lost:
        if (r7 != null) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.AnonymousClass01L r15, X.C168167zo r16, X.C167697yb r17, X.C196089Xp r18, java.lang.String r19, java.lang.String r20) {
        /*
            r10 = r17
            r13 = r20
            X.00s r0 = r10.A0C
            java.lang.Object r11 = r0.A04()
            X.9Jt r11 = (X.C193079Jt) r11
            r2 = r16
            java.util.List r3 = r2.A0C
            boolean r0 = r3.isEmpty()
            r6 = 0
            if (r0 != 0) goto L_0x00d4
            java.util.Iterator r4 = r3.iterator()     // Catch:{ Exception -> 0x00d4 }
        L_0x001b:
            boolean r0 = r4.hasNext()     // Catch:{ Exception -> 0x00d4 }
            if (r0 == 0) goto L_0x00d4
            java.lang.Object r1 = r4.next()     // Catch:{ Exception -> 0x00d4 }
            X.9EB r1 = (X.AnonymousClass9EB) r1     // Catch:{ Exception -> 0x00d4 }
            boolean r0 = r1 instanceof X.AnonymousClass8VL     // Catch:{ Exception -> 0x00d4 }
            if (r0 == 0) goto L_0x001b
            X.8VL r1 = (X.AnonymousClass8VL) r1     // Catch:{ Exception -> 0x00d4 }
            X.6B4 r0 = r1.A00     // Catch:{ Exception -> 0x00d4 }
            X.9up r5 = r0.A02     // Catch:{ Exception -> 0x00d4 }
            java.util.List r1 = r5.A07     // Catch:{ Exception -> 0x00d4 }
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x00d4 }
            r4 = 0
            if (r0 != 0) goto L_0x0049
            java.lang.Object r7 = r1.get(r4)     // Catch:{ Exception -> 0x00d4 }
            X.9tv r7 = (X.C206759tv) r7     // Catch:{ Exception -> 0x00d4 }
            java.lang.String r0 = r7.A00     // Catch:{ Exception -> 0x00d4 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x00d4 }
            if (r0 != 0) goto L_0x0049
            goto L_0x0068
        L_0x0049:
            X.9dH r0 = r2.A03     // Catch:{ Exception -> 0x00d4 }
            java.lang.String r1 = r5.A0F     // Catch:{ Exception -> 0x00d4 }
            X.AnonymousClass00C.A0D(r1, r4)     // Catch:{ Exception -> 0x00d4 }
            X.1Ws r0 = r0.A0H     // Catch:{ Exception -> 0x00d4 }
            X.9up r0 = r0.A06(r6, r1)     // Catch:{ Exception -> 0x00d4 }
            if (r0 == 0) goto L_0x00d4
            java.util.List r1 = r0.A07     // Catch:{ Exception -> 0x00d4 }
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x00d4 }
            if (r0 != 0) goto L_0x00d4
            java.lang.Object r7 = r1.get(r4)     // Catch:{ Exception -> 0x00d4 }
            X.9tv r7 = (X.C206759tv) r7     // Catch:{ Exception -> 0x00d4 }
            if (r7 == 0) goto L_0x00d4
        L_0x0068:
            if (r11 == 0) goto L_0x00d4
            java.lang.String r0 = r11.A02
            if (r0 == 0) goto L_0x00d4
            int r14 = r2.A0L()
            X.0yC r1 = r10.A0S
            r0 = 4893(0x131d, float:6.857E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0084
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x009f
            java.lang.String r13 = ""
        L_0x0084:
            X.9N6 r8 = new X.9N6
            r9 = r15
            r12 = r19
            r8.<init>(r9, r10, r11, r12, r13, r14)
            X.6pw r11 = r10.A0R
            r11.A00 = r8
            X.A98 r8 = X.A98.A00
            X.B9E r10 = new X.B9E
            r10.<init>(r11, r4)
            r12 = 3
            r5 = r18
            r9 = r6
            r5.A01(r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x009f:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.util.Iterator r3 = r3.iterator()
        L_0x00a7:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00c9
            java.lang.Object r1 = r3.next()
            X.9EB r1 = (X.AnonymousClass9EB) r1
            boolean r0 = r1 instanceof X.AnonymousClass8VL
            if (r0 == 0) goto L_0x00a7
            X.8VL r1 = (X.AnonymousClass8VL) r1
            X.6B4 r0 = r1.A00
            X.9up r0 = r0.A02
            java.lang.String r1 = r0.A05
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00a7
            X.C90474aD.A1L(r2, r1)
            goto L_0x00a7
        L_0x00c9:
            int r0 = r2.length()
            int r0 = r0 + -2
            java.lang.String r13 = r2.substring(r4, r0)
            goto L_0x0084
        L_0x00d4:
            X.00s r0 = r10.A0A
            X.C36331k8.A13(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C167697yb.A01(X.01L, X.7zo, X.7yb, X.9Xp, java.lang.String, java.lang.String):void");
    }

    public void A0S(BottomSheetDialogFragment bottomSheetDialogFragment, boolean z) {
        UserJid userJid = this.A0O;
        AnonymousClass9R0 r0 = this.A0T;
        Context A0a = bottomSheetDialogFragment.A0a();
        if (!z) {
            bottomSheetDialogFragment.A1b();
            return;
        }
        r0.A00();
        Intent A0m = AnonymousClass190.A0m(A0a, userJid, (Integer) null, 14);
        A0m.addFlags(603979776);
        A0a.startActivity(A0m);
    }

    public C167697yb(AnonymousClass1X4 r14, AnonymousClass164 r15, AnonymousClass9ZJ r16, AnonymousClass9UA r17, C198329dH r18, AnonymousClass9Y1 r19, C143076pw r20, AnonymousClass9UB r21, AnonymousClass185 r22, AnonymousClass171 r23, C19970wo r24, C20810yC r25, UserJid userJid, AnonymousClass3L6 r27, AnonymousClass9R0 r28) {
        C001700s A0S2 = C36431kI.A0S();
        this.A08 = A0S2;
        C001700s A0S3 = C36431kI.A0S();
        this.A0C = A0S3;
        C001700s A0S4 = C36431kI.A0S();
        this.A03 = A0S4;
        C001700s A0S5 = C36431kI.A0S();
        this.A02 = A0S5;
        C001700s A0S6 = C36431kI.A0S();
        this.A05 = A0S6;
        C001700s A0S7 = C36431kI.A0S();
        this.A0A = A0S7;
        C001700s A0S8 = C36431kI.A0S();
        this.A09 = A0S8;
        C001700s A0S9 = C36431kI.A0S();
        this.A06 = A0S9;
        C001700s A0S10 = C36431kI.A0S();
        this.A04 = A0S10;
        C001700s A0S11 = C36431kI.A0S();
        this.A07 = A0S11;
        C001700s A0S12 = C36431kI.A0S();
        this.A0D = A0S12;
        this.A01 = true;
        this.A0N = r24;
        this.A0S = r25;
        this.A0O = userJid;
        C198329dH r12 = r18;
        this.A0I = r12;
        this.A0F = r14;
        this.A0G = r15;
        this.A0P = r27;
        this.A0R = r20;
        this.A0M = r23;
        this.A0L = r22;
        this.A0J = r19;
        this.A0H = r17;
        this.A0T = r28;
        this.A0K = r21;
        this.A0Q = r16;
        r12.A06 = A0S2;
        r12.A01 = A0S4;
        r12.A00 = A0S5;
        r12.A09 = A0S3;
        r12.A08 = A0S7;
        r12.A03 = A0S6;
        r12.A07 = A0S8;
        r12.A04 = A0S9;
        r12.A0A = A0S12;
        r12.A02 = A0S10;
        r12.A05 = A0S11;
    }
}
