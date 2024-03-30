package X;

import androidx.appcompat.widget.Toolbar;
import com.whatsapp.WaEditText;
import com.whatsapp.emoji.search.EmojiSearchProvider;

/* renamed from: X.227  reason: invalid class name */
public class AnonymousClass227 extends C36541kT {
    public int A00 = 0;
    public int A01;
    public Toolbar A02;
    public WaEditText A03;
    public boolean A04 = true;
    public boolean A05;
    public boolean A06;
    public AnonymousClass22t A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final C88314Sf A0B = new C89604Xe(this, 6);
    public final AnonymousClass17Y A0C;
    public final AnonymousClass4QS A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final C19700wN A0H;
    public final C21060yb A0I;
    public final C19420v0 A0J;
    public final AnonymousClass1N0 A0K;
    public final C1261362r A0L;
    public final AnonymousClass6O1 A0M;
    public final AnonymousClass1XN A0N;
    public final AnonymousClass1H2 A0O;
    public final EmojiSearchProvider A0P;
    public final C20810yC A0Q;
    public final C19890wg A0R;
    public final AnonymousClass1N2 A0S;
    public final String A0T;

    public void onBackPressed() {
        if (this.A07.isShowing()) {
            this.A07.dismiss();
        } else {
            super.onBackPressed();
        }
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [android.text.TextWatcher] */
    /* JADX WARNING: type inference failed for: r12v4, types: [X.2gA] */
    /* JADX WARNING: type inference failed for: r12v5, types: [X.2fz] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r34) {
        /*
            r33 = this;
            r11 = r33
            r0 = r34
            super.onCreate(r0)
            r0 = 2131429824(0x7f0b09c0, float:1.8481332E38)
            android.view.View r1 = X.AnonymousClass0PN.A00(r11, r0)
            androidx.appcompat.widget.Toolbar r1 = (androidx.appcompat.widget.Toolbar) r1
            r11.A02 = r1
            int r0 = r11.A0G
            r1.setTitle((int) r0)
            r11.setTitle(r0)
            r0 = 2131432196(0x7f0b1304, float:1.8486143E38)
            android.view.View r3 = r11.findViewById(r0)
            r0 = 30
            X.AnonymousClass3Y0.A01(r3, r11, r0)
            r0 = 2131428558(0x7f0b04ce, float:1.8478764E38)
            android.view.View r1 = r11.findViewById(r0)
            r0 = 31
            X.AnonymousClass3Y0.A01(r1, r11, r0)
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            r0 = 2131429285(0x7f0b07a5, float:1.8480238E38)
            android.view.View r7 = X.AnonymousClass0PN.A00(r11, r0)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 2131429781(0x7f0b0995, float:1.8481244E38)
            android.view.View r0 = X.AnonymousClass0PN.A00(r11, r0)
            com.whatsapp.WaEditText r0 = (com.whatsapp.WaEditText) r0
            r11.A03 = r0
            X.0ts r10 = r11.A02
            X.AnonymousClass1JZ.A09(r0, r10)
            int r6 = r11.A0A
            r9 = 0
            if (r6 == 0) goto L_0x0063
            int r0 = r11.A01
            if (r0 != 0) goto L_0x005b
            r7.setVisibility(r9)
        L_0x005b:
            X.3Xf r0 = new X.3Xf
            r0.<init>(r6)
            r2.add(r0)
        L_0x0063:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0076
            com.whatsapp.WaEditText r1 = r11.A03
            android.text.InputFilter[] r0 = new android.text.InputFilter[r9]
            java.lang.Object[] r0 = r2.toArray(r0)
            android.text.InputFilter[] r0 = (android.text.InputFilter[]) r0
            r1.setFilters(r0)
        L_0x0076:
            boolean r1 = r11.A05
            X.1H2 r8 = r11.A0O
            X.0yb r0 = r11.A0I
            r32 = r0
            X.0wg r0 = r11.A0R
            r19 = r0
            X.1N0 r5 = r11.A0K
            com.whatsapp.WaEditText r4 = r11.A03
            int r2 = r11.A01
            boolean r0 = r11.A06
            if (r1 == 0) goto L_0x01d8
            X.2fz r1 = new X.2fz
            r14 = r7
            r15 = r32
            r16 = r10
            r17 = r5
            r18 = r8
            r20 = r6
            r21 = r2
            r22 = r0
            r12 = r1
            r13 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
        L_0x00a2:
            com.whatsapp.WaEditText r0 = r11.A03
            r0.addTextChangedListener(r1)
            boolean r0 = r11.A04
            if (r0 != 0) goto L_0x00b6
            com.whatsapp.WaEditText r2 = r11.A03
            r1 = 2
            X.4WK r0 = new X.4WK
            r0.<init>(r11, r3, r1)
            r2.addTextChangedListener(r0)
        L_0x00b6:
            com.whatsapp.WaEditText r1 = r11.A03
            int r0 = r11.A0F
            r1.setInputType(r0)
            android.view.Window r0 = r11.getWindow()
            android.view.WindowManager$LayoutParams r1 = r0.getAttributes()
            r0 = -1
            r1.width = r0
            r0 = 48
            r1.gravity = r0
            android.view.Window r0 = r11.getWindow()
            r0.setAttributes(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x0109
            android.view.Window r2 = r11.getWindow()
            if (r2 == 0) goto L_0x0109
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.addFlags(r0)
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r2.clearFlags(r0)
            android.app.Activity r0 = r11.A00
            X.AnonymousClass00C.A0D(r0, r9)
            int r0 = X.C36391kE.A05(r0)
            r2.setStatusBarColor(r0)
            androidx.appcompat.widget.Toolbar r1 = r11.A02
            boolean r0 = r1 instanceof com.whatsapp.wds.components.topbar.WDSToolbar
            if (r0 == 0) goto L_0x01d5
            com.whatsapp.wds.components.topbar.WDSToolbar r1 = (com.whatsapp.wds.components.topbar.WDSToolbar) r1
            X.1Qh r0 = r1.A08
            X.1Qr r1 = r0.A00
        L_0x0101:
            X.1Qs r0 = X.C28011Qs.A00
            if (r1 != r0) goto L_0x0109
            r0 = 1
            X.AnonymousClass1RC.A09(r2, r0)
        L_0x0109:
            r0 = 2131429823(0x7f0b09bf, float:1.848133E38)
            android.view.View r13 = r11.findViewById(r0)
            com.whatsapp.KeyboardPopupLayout r13 = (com.whatsapp.KeyboardPopupLayout) r13
            r0 = 2131429813(0x7f0b09b5, float:1.848131E38)
            android.view.View r12 = r11.findViewById(r0)
            android.widget.ImageButton r12 = (android.widget.ImageButton) r12
            android.app.Activity r7 = r11.A00
            X.0yC r0 = r11.A0Q
            r16 = r0
            X.1N2 r15 = r11.A0S
            X.0wN r14 = r11.A0H
            X.1XN r6 = r11.A0N
            X.62r r5 = r11.A0L
            com.whatsapp.emoji.search.EmojiSearchProvider r4 = r11.A0P
            X.0v0 r3 = r11.A0J
            com.whatsapp.WaEditText r2 = r11.A03
            r0 = 28
            java.lang.Integer r30 = java.lang.Integer.valueOf(r0)
            r31 = 0
            X.6O1 r1 = r11.A0M
            X.22t r0 = new X.22t
            r24 = r6
            r25 = r8
            r26 = r4
            r27 = r16
            r28 = r19
            r29 = r15
            r21 = r10
            r22 = r5
            r23 = r1
            r18 = r2
            r19 = r32
            r20 = r3
            r15 = r12
            r16 = r14
            r17 = r13
            r13 = r0
            r14 = r7
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r11.A07 = r0
            r0 = 2131429849(0x7f0b09d9, float:1.8481382E38)
            android.view.View r1 = r11.findViewById(r0)
            com.whatsapp.emoji.search.EmojiSearchContainer r1 = (com.whatsapp.emoji.search.EmojiSearchContainer) r1
            X.22t r0 = r11.A07
            X.3J6 r3 = new X.3J6
            r3.<init>(r7, r0, r1)
            r0 = 4
            X.AnonymousClass3J6.A00(r3, r11, r0)
            X.22t r2 = r11.A07
            X.4Sf r0 = r11.A0B
            r2.A0H(r0)
            r1 = 33
            X.3wc r0 = new X.3wc
            r0.<init>(r11, r3, r1)
            r2.A0F = r0
            r1 = 11
            X.4XV r0 = new X.4XV
            r0.<init>(r11, r1)
            r11.setOnCancelListener(r0)
            r0 = 2131429548(0x7f0b08ac, float:1.8480772E38)
            android.view.View r1 = r11.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r0 = r11.A00
            if (r0 != 0) goto L_0x01cc
            r0 = 8
            r1.setVisibility(r0)
        L_0x019f:
            int r1 = r11.A0E
            if (r1 == 0) goto L_0x01a8
            com.whatsapp.WaEditText r0 = r11.A03
            r0.setHint(r1)
        L_0x01a8:
            com.whatsapp.WaEditText r2 = r11.A03
            java.lang.String r1 = r11.A0T
            java.lang.CharSequence r0 = X.AnonymousClass3UG.A05(r7, r8, r1)
            r2.setText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x01be
            com.whatsapp.WaEditText r0 = r11.A03
            r0.selectAll()
        L_0x01be:
            com.whatsapp.WaEditText r0 = r11.A03
            r0.A0C(r9)
            android.view.Window r1 = r11.getWindow()
            r0 = 5
            r1.setSoftInputMode(r0)
            return
        L_0x01cc:
            r1.setVisibility(r9)
            int r0 = r11.A00
            r1.setText(r0)
            goto L_0x019f
        L_0x01d5:
            r1 = 0
            goto L_0x0101
        L_0x01d8:
            X.2gA r1 = new X.2gA
            r23 = 0
            r24 = 0
            r14 = r7
            r15 = r32
            r16 = r10
            r17 = r5
            r18 = r8
            r20 = r6
            r21 = r2
            r22 = r0
            r12 = r1
            r13 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x00a2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass227.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass227(android.app.Activity r9, X.C19700wN r10, X.AnonymousClass17Y r11, X.C21060yb r12, X.C19970wo r13, X.C19420v0 r14, X.C18820ts r15, X.AnonymousClass4QS r16, X.AnonymousClass1N0 r17, X.C1261362r r18, X.AnonymousClass6O1 r19, X.AnonymousClass1XN r20, X.AnonymousClass1H2 r21, com.whatsapp.emoji.search.EmojiSearchProvider r22, X.C20810yC r23, X.C19890wg r24, X.AnonymousClass1N2 r25, java.lang.String r26, int r27, int r28, int r29, int r30, int r31, int r32) {
        /*
            r8 = this;
            r7 = 2131624872(0x7f0e03a8, float:1.8876936E38)
            r0 = 1
            r2 = r8
            r6 = r15
            r5 = r13
            r4 = r12
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            r8.A04 = r0
            r0 = 0
            r8.A00 = r0
            r1 = 6
            X.4Xe r0 = new X.4Xe
            r0.<init>(r8, r1)
            r8.A0B = r0
            r0 = r23
            r8.A0Q = r0
            r8.A0C = r11
            r0 = r25
            r8.A0S = r0
            r8.A0H = r10
            r0 = r21
            r8.A0O = r0
            r0 = r20
            r8.A0N = r0
            r0 = r18
            r8.A0L = r0
            r8.A0I = r12
            r0 = r22
            r8.A0P = r0
            r8.A0J = r14
            r0 = r24
            r8.A0R = r0
            r0 = r19
            r8.A0M = r0
            r0 = r17
            r8.A0K = r0
            r0 = r27
            r8.A08 = r0
            r0 = r32
            r8.A0F = r0
            r0 = r16
            r8.A0D = r0
            r0 = r28
            r8.A0G = r0
            r0 = r29
            r8.A0A = r0
            r0 = r30
            r8.A0E = r0
            r0 = r31
            r8.A09 = r0
            r0 = r26
            r8.A0T = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass227.<init>(android.app.Activity, X.0wN, X.17Y, X.0yb, X.0wo, X.0v0, X.0ts, X.4QS, X.1N0, X.62r, X.6O1, X.1XN, X.1H2, com.whatsapp.emoji.search.EmojiSearchProvider, X.0yC, X.0wg, X.1N2, java.lang.String, int, int, int, int, int, int):void");
    }
}
