package com.whatsapp.calling;

import X.AnonymousClass155;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass1NK;
import X.AnonymousClass4YF;
import X.C03570Gk;
import X.C18800tq;
import X.C18830tt;
import X.C20380xT;
import X.C27721Pm;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C89314Wb;
import android.content.res.Configuration;
import android.widget.LinearLayout;
import com.whatsapp.R;

public class VoipNotAllowedActivity extends AnonymousClass155 {
    public AnonymousClass16D A00;
    public AnonymousClass171 A01;
    public C20380xT A02;
    public C27721Pm A03;
    public boolean A04;
    public final AnonymousClass1NK A05;

    public void A2F() {
        if (!this.A04) {
            this.A04 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A03 = (C27721Pm) r1.A0t.get();
            this.A00 = C36341k9.A0R(A0B);
            this.A01 = C36341k9.A0S(A0B);
            this.A02 = C36331k8.A0I(A0B);
        }
    }

    public VoipNotAllowedActivity(int i) {
        this.A04 = false;
        C89314Wb.A00(this, 33);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LinearLayout linearLayout = (LinearLayout) C03570Gk.A0B(this, R.id.content);
        int i = 1;
        if (configuration.orientation != 1) {
            i = 0;
        }
        linearLayout.setOrientation(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0078, code lost:
        r0 = r7.A0L(new java.lang.Object[]{r10}, r3, (long) r6.size());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0085, code lost:
        r9.setText(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0088, code lost:
        r2 = X.C36401kF.A0H(r11, com.whatsapp.R.id.ok);
        r1 = X.C03570Gk.A0B(r11, com.whatsapp.R.id.more);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0096, code lost:
        if (r8 != null) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0098, code lost:
        r1.setVisibility(8);
        r0 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00a0, code lost:
        r2.setText(r0);
        X.C36361kB.A17(r2, r11, 31);
        r1 = (android.widget.LinearLayout) X.C03570Gk.A0B(r11, com.whatsapp.R.id.content);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00b5, code lost:
        if (X.C36341k9.A04(r11) != 1) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00b7, code lost:
        r1.setOrientation(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00ba, code lost:
        r11.A03.registerObserver(r11.A05);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00c1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00c2, code lost:
        r1.setOrientation(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00c6, code lost:
        r1.setVisibility(0);
        X.C36421kH.A14(r1, r11, r8, 7);
        r0 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ea, code lost:
        r8 = r11.A02.A05("28030008");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0146, code lost:
        r0 = X.C36351kA.A0w(r11, r10, 1, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            super.onCreate(r12)
            r0 = 2131626533(0x7f0e0a25, float:1.8880305E38)
            r11.setContentView((int) r0)
            android.view.Window r1 = r11.getWindow()
            r0 = 524288(0x80000, float:7.34684E-40)
            r1.addFlags(r0)
            r0 = 2131434724(0x7f0b1ce4, float:1.849127E38)
            android.widget.TextView r7 = X.C36401kF.A0H(r11, r0)
            X.C33511fU.A03(r7)
            java.lang.Class<com.whatsapp.jid.UserJid> r2 = com.whatsapp.jid.UserJid.class
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "jids"
            java.util.ArrayList r6 = X.C36401kF.A0u(r1, r2, r0)
            boolean r0 = r6.isEmpty()
            r5 = 1
            r1 = r0 ^ 1
            java.lang.String r0 = "Missing jids"
            X.C18740tg.A0D(r1, r0)
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "reason"
            r4 = 0
            int r3 = r1.getIntExtra(r0, r4)
            java.util.ArrayList r8 = X.C36401kF.A0v(r6)
            if (r3 == 0) goto L_0x014c
            r0 = 12
            if (r3 == r0) goto L_0x014c
            r0 = 14
            if (r3 == r0) goto L_0x014c
            int r0 = r6.size()
            boolean r1 = X.AnonymousClass000.A1S(r0, r5)
            java.lang.String r0 = "Incorrect number of arguments"
            X.C18740tg.A0D(r1, r0)
            X.16D r0 = r11.A00
            X.141 r1 = X.C36371kC.A0a(r0, r6, r4)
            X.171 r0 = r11.A01
            java.lang.String r10 = X.C36381kD.A0v(r0, r1)
        L_0x0066:
            r0 = 2131431720(0x7f0b1128, float:1.8485177E38)
            android.widget.TextView r9 = X.C36401kF.A0H(r11, r0)
            java.lang.String r2 = "28030008"
            r8 = 0
            switch(r3) {
                case 1: goto L_0x00d1;
                case 2: goto L_0x00d5;
                case 3: goto L_0x00d9;
                case 4: goto L_0x00e0;
                case 5: goto L_0x00f1;
                case 6: goto L_0x0102;
                case 7: goto L_0x010c;
                case 8: goto L_0x0114;
                case 9: goto L_0x0118;
                case 10: goto L_0x011c;
                case 11: goto L_0x011c;
                case 12: goto L_0x0120;
                case 13: goto L_0x0127;
                case 14: goto L_0x012b;
                case 15: goto L_0x013f;
                case 16: goto L_0x0143;
                default: goto L_0x0073;
            }
        L_0x0073:
            X.0ts r7 = r11.A00
            r3 = 2131755430(0x7f1001a6, float:1.914174E38)
        L_0x0078:
            int r0 = r6.size()
            long r0 = (long) r0
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r4] = r10
            java.lang.String r0 = r7.A0L(r2, r3, r0)
        L_0x0085:
            r9.setText(r0)
        L_0x0088:
            r0 = 2131432194(0x7f0b1302, float:1.8486139E38)
            android.widget.TextView r2 = X.C36401kF.A0H(r11, r0)
            r0 = 2131431781(0x7f0b1165, float:1.84853E38)
            android.view.View r1 = X.C03570Gk.A0B(r11, r0)
            if (r8 != 0) goto L_0x00c6
            r0 = 8
            r1.setVisibility(r0)
            r0 = 2131891806(0x7f12165e, float:1.9418342E38)
        L_0x00a0:
            r2.setText(r0)
            r0 = 31
            X.C36361kB.A17(r2, r11, r0)
            r0 = 2131429151(0x7f0b071f, float:1.8479967E38)
            android.view.View r1 = X.C03570Gk.A0B(r11, r0)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            int r0 = X.C36341k9.A04(r11)
            if (r0 != r5) goto L_0x00c2
            r1.setOrientation(r5)
        L_0x00ba:
            X.1Pm r1 = r11.A03
            X.1NK r0 = r11.A05
            r1.registerObserver(r0)
            return
        L_0x00c2:
            r1.setOrientation(r4)
            goto L_0x00ba
        L_0x00c6:
            r1.setVisibility(r4)
            r0 = 7
            X.C36421kH.A14(r1, r11, r8, r0)
            r0 = 2131891807(0x7f12165f, float:1.9418344E38)
            goto L_0x00a0
        L_0x00d1:
            r0 = 2131896012(0x7f1226cc, float:1.9426873E38)
            goto L_0x0146
        L_0x00d5:
            r0 = 2131896013(0x7f1226cd, float:1.9426875E38)
            goto L_0x0146
        L_0x00d9:
            r0 = 2131896011(0x7f1226cb, float:1.9426871E38)
            r9.setText(r0)
            goto L_0x00ea
        L_0x00e0:
            r1 = 2131896010(0x7f1226ca, float:1.942687E38)
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r4] = r10
            X.C36341k9.A0s(r11, r9, r0, r1)
        L_0x00ea:
            X.0xT r0 = r11.A02
            java.lang.String r8 = r0.A05(r2)
            goto L_0x0088
        L_0x00f1:
            r0 = 2131896018(0x7f1226d2, float:1.9426885E38)
            r7.setText(r0)
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "message"
            java.lang.String r0 = r1.getStringExtra(r0)
            goto L_0x0085
        L_0x0102:
            r0 = 2131896018(0x7f1226d2, float:1.9426885E38)
            r7.setText(r0)
            r0 = 2131896017(0x7f1226d1, float:1.9426883E38)
            goto L_0x0146
        L_0x010c:
            r0 = 2131896055(0x7f1226f7, float:1.942696E38)
            r9.setText(r0)
            goto L_0x0088
        L_0x0114:
            r0 = 2131896054(0x7f1226f6, float:1.9426958E38)
            goto L_0x0146
        L_0x0118:
            r0 = 2131896052(0x7f1226f4, float:1.9426954E38)
            goto L_0x0146
        L_0x011c:
            r0 = 2131896053(0x7f1226f5, float:1.9426956E38)
            goto L_0x0146
        L_0x0120:
            X.0ts r7 = r11.A00
            r3 = 2131755424(0x7f1001a0, float:1.9141727E38)
            goto L_0x0078
        L_0x0127:
            r0 = 2131895925(0x7f122675, float:1.9426697E38)
            goto L_0x0146
        L_0x012b:
            X.0ts r7 = r11.A00
            r6 = 2131755425(0x7f1001a1, float:1.9141729E38)
            r2 = 64
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r0 = 64
            X.AnonymousClass000.A1L(r1, r0, r4)
            java.lang.String r0 = r7.A0L(r1, r6, r2)
            goto L_0x0085
        L_0x013f:
            r0 = 2131895146(0x7f12236a, float:1.9425117E38)
            goto L_0x0146
        L_0x0143:
            r0 = 2131896032(0x7f1226e0, float:1.9426914E38)
        L_0x0146:
            java.lang.String r0 = X.C36351kA.A0w(r11, r10, r5, r0)
            goto L_0x0085
        L_0x014c:
            java.util.Iterator r2 = r6.iterator()
        L_0x0150:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x016a
            X.11F r1 = X.C36401kF.A0a(r2)
            X.16D r0 = r11.A00
            X.141 r1 = r0.A0D(r1)
            X.171 r0 = r11.A01
            java.lang.String r0 = X.C36381kD.A0v(r0, r1)
            r8.add(r0)
            goto L_0x0150
        L_0x016a:
            X.171 r0 = r11.A01
            X.0ts r0 = r0.A02
            java.lang.String r10 = X.C55782vB.A00(r0, r8, r5)
            goto L_0x0066
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.VoipNotAllowedActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        this.A03.unregisterObserver(this.A05);
    }

    public VoipNotAllowedActivity() {
        this(0);
        this.A05 = new AnonymousClass4YF(this, 0);
    }
}
