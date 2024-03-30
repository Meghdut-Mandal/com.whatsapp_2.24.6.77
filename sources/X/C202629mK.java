package X;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.9mK  reason: invalid class name and case insensitive filesystem */
public class C202629mK {
    public final AnonymousClass17Y A00;
    public final C19970wo A01;
    public final AnonymousClass1DQ A02;
    public final AnonymousClass1VZ A03;
    public final A8P A04;
    public final C29121Vk A05;
    public final AnonymousClass1EU A06;
    public final C237919w A07;
    public final C19770wU A08;
    public final AnonymousClass1A5 A09;
    public final AnonymousClass17X A0A;
    public final AnonymousClass1EZ A0B;
    public final AnonymousClass3EU A0C;
    public final AnonymousClass1EM A0D;

    public static void A01(TextView textView, C202319lY r7, C202629mK r8, boolean z) {
        int i;
        int i2;
        C202319lY r4 = r7;
        if (z) {
            textView.setText(R.string.f12nameremoved);
            textView.setEnabled(false);
            i = r7.A02;
            i2 = 19;
        } else {
            textView.setEnabled(true);
            textView.setText(R.string.f12nameremoved);
            i = r7.A02;
            i2 = 12;
        }
        if (i != i2) {
            r7.A02 = i2;
            AnonymousClass1EU r0 = r8.A06;
            AnonymousClass1EU.A00(r0);
            r0.A05.A0d(r4, C165617ti.A0R(r7.A0C, r7.A0L, r7.A0Q), i, 0, -1);
        }
    }

    public static synchronized boolean A02(C202319lY r4, C202629mK r5) {
        boolean z;
        synchronized (r5) {
            AnonymousClass11F r1 = r4.A0C;
            z = false;
            if (r1 != null) {
                AnonymousClass141 A012 = r5.A09.A01(r1);
                if (A012.A0G()) {
                    AnonymousClass17X r12 = r5.A0A;
                    Class<AnonymousClass147> cls = AnonymousClass147.class;
                    AnonymousClass147 r0 = (AnonymousClass147) A012.A06(cls);
                    C18740tg.A06(r0);
                    if (r12.A0C(r0)) {
                        AnonymousClass1EM r13 = r5.A0D;
                        AnonymousClass147 r02 = (AnonymousClass147) A012.A06(cls);
                        C18740tg.A06(r02);
                        if (r13.A04(A012, r02)) {
                            z = true;
                        }
                    }
                }
            }
        }
        return z;
    }

    public void A03(Context context, C202319lY r7) {
        B66 b66;
        int BFX;
        C198699e3 A032 = this.A06.A03(r7.A0G);
        if (A032 != null) {
            b66 = A032.A01(r7.A0I);
        } else {
            b66 = null;
        }
        if (b66 == null || (BFX = b66.BFX()) == 0) {
            ((C225014r) context).BO9(new Object[0], 0, R.string.f12nameremoved);
            return;
        }
        Object[] A0L = AnonymousClass001.A0L();
        A0L[0] = context.getString(BFX);
        ((C225014r) context).BO9(A0L, 0, R.string.f12nameremoved);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        if (r1.A05().BAH().A03(X.C165577te.A0S(r2)) == false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (X.C36351kA.A1X(r4.A00, r1) == false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(android.content.Context r12, X.C202319lY r13, X.B1G r14, boolean r15) {
        /*
            r11 = this;
            X.3EU r4 = r11.A0C
            com.whatsapp.jid.UserJid r1 = r13.A0D
            if (r1 == 0) goto L_0x000f
            X.1NG r0 = r4.A00
            boolean r0 = X.C36351kA.A1X(r0, r1)
            r3 = 1
            if (r0 != 0) goto L_0x0010
        L_0x000f:
            r3 = 0
        L_0x0010:
            X.8av r0 = r13.A0A
            if (r0 == 0) goto L_0x0046
            java.lang.String r2 = r0.A0F()
        L_0x0018:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x003d
            X.1EU r1 = r4.A02
            X.B66 r0 = r1.A05()
            X.9Xv r0 = r0.BAH()
            if (r0 == 0) goto L_0x003d
            X.B66 r0 = r1.A05()
            X.9Xv r1 = r0.BAH()
            X.6c7 r0 = X.C165577te.A0S(r2)
            boolean r1 = r1.A03(r0)
            r0 = 1
            if (r1 != 0) goto L_0x003e
        L_0x003d:
            r0 = 0
        L_0x003e:
            if (r3 != 0) goto L_0x0048
            if (r0 != 0) goto L_0x0048
            r14.onSuccess()
            return
        L_0x0046:
            r2 = 0
            goto L_0x0018
        L_0x0048:
            android.app.Activity r5 = X.C24801Dv.A00(r12)
            com.whatsapp.jid.UserJid r7 = r13.A0D
            X.6vT r3 = X.C146356vT.A00()
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            X.8av r0 = r13.A0A
            java.lang.String r1 = r0.A0F()
            java.lang.String r0 = "paymentHandle"
            X.6c7 r8 = X.C165617ti.A0P(r3, r2, r1, r0)
            r9 = 0
            X.B7p r6 = new X.B7p
            r6.<init>(r14, r9)
            r10 = r15
            r4.A00(r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202629mK.A04(android.content.Context, X.9lY, X.B1G, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007d, code lost:
        if (r1 != false) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(android.view.View r25, android.widget.Button r26, X.C202319lY r27, X.AnonymousClass9Tc r28, X.C22956Az8 r29, X.AnonymousClass3T1 r30, java.lang.String r31, boolean r32) {
        /*
            r24 = this;
            r7 = r28
            r0 = 2131433343(0x7f0b177f, float:1.848847E38)
            r6 = r25
            android.view.View r5 = X.C012005e.A02(r6, r0)
            r0 = 2131433359(0x7f0b178f, float:1.8488501E38)
            android.view.View r3 = X.C012005e.A02(r6, r0)
            android.content.Context r12 = r6.getContext()
            r14 = r24
            r1 = r30
            if (r30 != 0) goto L_0x01fe
            r4 = 0
        L_0x001d:
            r13 = r27
            boolean r0 = A02(r13, r14)
            r2 = 8
            if (r0 != 0) goto L_0x002f
            if (r4 == 0) goto L_0x003c
            boolean r0 = r4.A0G()
            if (r0 != 0) goto L_0x003c
        L_0x002f:
            if (r32 != 0) goto L_0x00b5
            r0 = 0
            r3.setEnabled(r0)
            r5.setEnabled(r0)
        L_0x0038:
            r6.setVisibility(r0)
        L_0x003b:
            return
        L_0x003c:
            int r9 = r13.A03
            r8 = 20
            r17 = r31
            if (r9 != r8) goto L_0x0081
            int r4 = r13.A02
            r0 = 12
            if (r4 != r0) goto L_0x0081
            r2 = 1
            r3.setEnabled(r2)
            r0 = 0
            X.9v4 r11 = new X.9v4
            r18 = 0
            r15 = r29
            r16 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r3.setOnClickListener(r11)
            r5.setEnabled(r2)
            X.9v4 r11 = new X.9v4
            r18 = 1
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r5.setOnClickListener(r11)
            r6.setVisibility(r0)
            if (r28 == 0) goto L_0x003b
            X.8av r0 = r13.A0A
            X.8bI r0 = (X.C175928bI) r0
            if (r0 == 0) goto L_0x007f
            java.lang.String r0 = r0.A0L
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r0 = 8
            if (r1 == 0) goto L_0x0038
        L_0x007f:
            r0 = 0
            goto L_0x0038
        L_0x0081:
            if (r28 == 0) goto L_0x00b5
            r0 = 40
            if (r9 != r0) goto L_0x00b5
            int r1 = r13.A02
            if (r1 == r8) goto L_0x0097
            r0 = 417(0x1a1, float:5.84E-43)
            if (r1 == r0) goto L_0x0097
            r0 = 418(0x1a2, float:5.86E-43)
            if (r1 == r0) goto L_0x0097
            r0 = 115(0x73, float:1.61E-43)
            if (r1 != r0) goto L_0x00b5
        L_0x0097:
            X.8fs r7 = (X.C178398fs) r7
            X.8av r9 = r13.A0A
            X.8bI r9 = (X.C175928bI) r9
            if (r9 == 0) goto L_0x003b
            X.9jw r0 = r9.A0G
            if (r0 == 0) goto L_0x003b
            r10 = 0
            r4 = r26
            if (r1 == r8) goto L_0x01b6
            r0 = 115(0x73, float:1.61E-43)
            if (r1 == r0) goto L_0x0185
            r0 = 417(0x1a1, float:5.84E-43)
            r8 = 418(0x1a2, float:5.86E-43)
            if (r1 == r0) goto L_0x00b9
            if (r1 == r8) goto L_0x00b9
        L_0x00b5:
            r6.setVisibility(r2)
            return
        L_0x00b9:
            r3.setVisibility(r2)
            r5.setVisibility(r2)
            if (r26 == 0) goto L_0x00b5
            X.9jw r1 = r9.A0G
            if (r1 == 0) goto L_0x00b5
            int r0 = r13.A02
            if (r0 == r8) goto L_0x00b5
            X.9je r3 = r1.A0C
            if (r3 == 0) goto L_0x00e2
            java.lang.String r1 = r3.A08
            java.lang.String r0 = "ACCEPT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00e2
            java.lang.String r1 = r3.A09
            java.lang.String r0 = "PENDING"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00e2
            goto L_0x00b5
        L_0x00e2:
            r5 = 0
            r6.setVisibility(r5)
            X.9jw r8 = r9.A0G
            boolean r0 = r8.A0N
            r1 = 1
            if (r0 == 0) goto L_0x0180
            java.lang.String r0 = r8.A0E
            boolean r0 = X.C202699mR.A03(r0)
            if (r0 == 0) goto L_0x00fc
            r3 = 2
            int r0 = r8.A00()
            if (r3 == r0) goto L_0x0180
        L_0x00fc:
            r4.setVisibility(r5)
            r4.setEnabled(r1)
            r0 = 2131896389(0x7f122845, float:1.9427638E38)
            r4.setText(r0)
            r15 = 7
            X.3YS r10 = new X.3YS
            r11 = r7
            r14 = r17
            r10.<init>(r11, r12, r13, r14, r15)
            r4.setOnClickListener(r10)
        L_0x0114:
            X.0yC r3 = r7.A02
            X.AE0 r0 = r7.A03
            java.lang.String r0 = r0.A0B()
            boolean r0 = X.C202699mR.A02(r3, r0)
            if (r0 == 0) goto L_0x015c
            X.8av r4 = r13.A0A
            r3 = r4
            X.8bI r3 = (X.C175928bI) r3
            if (r3 == 0) goto L_0x015c
            X.9jw r0 = r3.A0G
            if (r0 == 0) goto L_0x015c
            java.lang.String r0 = r0.A0E
            boolean r0 = X.C202699mR.A03(r0)
            if (r0 == 0) goto L_0x015c
            X.C18740tg.A06(r4)
            r0 = 2131432371(0x7f0b13b3, float:1.8486498E38)
            android.widget.TextView r4 = X.C36391kE.A0P(r6, r0)
            r4.setVisibility(r5)
            X.9jw r0 = r3.A0G
            X.C18740tg.A06(r0)
            int r3 = r0.A00()
            if (r3 == 0) goto L_0x016a
            r0 = 2
            if (r3 == r0) goto L_0x0162
            r0 = 3
            if (r3 == r0) goto L_0x016a
            r0 = 5
            if (r3 == r0) goto L_0x016a
            r0 = 6
            if (r3 == r0) goto L_0x0162
            r4.setVisibility(r2)
        L_0x015c:
            if (r1 != 0) goto L_0x003b
            if (r5 != 0) goto L_0x003b
            goto L_0x00b5
        L_0x0162:
            r0 = 2131892544(0x7f121940, float:1.941984E38)
            r4.setText(r0)
            r14 = 3
            goto L_0x0171
        L_0x016a:
            r0 = 2131892478(0x7f1218fe, float:1.9419705E38)
            r4.setText(r0)
            r14 = 2
        L_0x0171:
            X.3YS r9 = new X.3YS
            r10 = r7
            r11 = r12
            r12 = r13
            r13 = r17
            r9.<init>(r10, r11, r12, r13, r14)
            r4.setOnClickListener(r9)
            r5 = 1
            goto L_0x015c
        L_0x0180:
            r4.setVisibility(r2)
            r1 = 0
            goto L_0x0114
        L_0x0185:
            X.1FR r8 = r7.A07
            long r0 = r9.A04
            X.0wo r8 = r8.A03
            long r8 = X.C19970wo.A00(r8)
            long r0 = r0 - r8
            int r8 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r8 <= 0) goto L_0x003b
            android.widget.TextView r3 = (android.widget.TextView) r3
            r14 = 4
            X.3YS r9 = new X.3YS
            r10 = r7
            r11 = r12
            r12 = r13
            r13 = r17
            r9.<init>(r10, r11, r12, r13, r14)
            r0 = 1
            r3.setEnabled(r0)
            r0 = 2131887154(0x7f120432, float:1.9408907E38)
            r3.setText(r0)
            r3.setOnClickListener(r9)
            r0 = 0
            r6.setVisibility(r0)
            r5.setVisibility(r2)
            goto L_0x01f8
        L_0x01b6:
            X.1FR r8 = r7.A07
            long r0 = r9.A04
            X.0wo r8 = r8.A03
            long r8 = X.C19970wo.A00(r8)
            long r0 = r0 - r8
            int r8 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r8 <= 0) goto L_0x003b
            android.widget.TextView r3 = (android.widget.TextView) r3
            r15 = 5
            X.3YS r10 = new X.3YS
            r11 = r7
            r14 = r17
            r10.<init>(r11, r12, r13, r14, r15)
            r23 = 6
            X.3YS r8 = new X.3YS
            r18 = r8
            r19 = r7
            r20 = r12
            r21 = r13
            r22 = r14
            r18.<init>(r19, r20, r21, r22, r23)
            r1 = 1
            r3.setEnabled(r1)
            r3.setOnClickListener(r10)
            r0 = 2131895398(0x7f122466, float:1.9425628E38)
            r3.setText(r0)
            r5.setEnabled(r1)
            r5.setOnClickListener(r8)
            r0 = 0
            r6.setVisibility(r0)
        L_0x01f8:
            if (r26 == 0) goto L_0x003b
            r4.setVisibility(r2)
            return
        L_0x01fe:
            X.1EU r0 = r14.A06
            X.AnonymousClass1EU.A00(r0)
            X.1Ed r2 = r0.A05
            X.3Qa r0 = r1.A1J
            java.lang.String r0 = r0.A01
            X.9lY r4 = r2.A0J(r0)
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202629mK.A05(android.view.View, android.widget.Button, X.9lY, X.9Tc, X.Az8, X.3T1, java.lang.String, boolean):void");
    }

    public C202629mK(AnonymousClass17Y r1, C19970wo r2, AnonymousClass1A5 r3, AnonymousClass17X r4, AnonymousClass1DQ r5, AnonymousClass1VZ r6, AnonymousClass1EZ r7, A8P a8p, AnonymousClass3EU r9, C29121Vk r10, AnonymousClass1EU r11, C237919w r12, AnonymousClass1EM r13, C19770wU r14) {
        this.A01 = r2;
        this.A00 = r1;
        this.A08 = r14;
        this.A02 = r5;
        this.A0D = r13;
        this.A06 = r11;
        this.A07 = r12;
        this.A0B = r7;
        this.A03 = r6;
        this.A0C = r9;
        this.A05 = r10;
        this.A04 = a8p;
        this.A0A = r4;
        this.A09 = r3;
    }

    public static void A00(View view, Button button, C202319lY r6, C202629mK r7) {
        B66 A012;
        B34 BAG;
        View A022 = C012005e.A02(view, R.id.request_decline_button);
        View A023 = C012005e.A02(view, R.id.request_pay_button);
        A022.setVisibility(8);
        A023.setVisibility(8);
        C198699e3 A032 = r7.A06.A03(r6.A0G);
        if (A032 == null || (A012 = A032.A01(r6.A0I)) == null || ((BAG = A012.BAG()) == null ? r7.A0B.A0F() : !BAG.Bsv(r6.A0A))) {
            view.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        button.setVisibility(0);
        button.setOnClickListener(new AnonymousClass3YM(button, A012, r6, 6));
    }
}
