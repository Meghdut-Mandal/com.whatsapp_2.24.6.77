package com.whatsapp.systemstatus;

import X.AnonymousClass155;
import X.AnonymousClass1CF;
import X.AnonymousClass3DY;
import X.C18800tq;
import X.C18830tt;
import X.C36321k7;
import X.C36331k8;
import X.C36361kB;
import X.C89374Wh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SystemStatusActivity extends AnonymousClass155 {
    public int A00;
    public AnonymousClass3DY A01;
    public AnonymousClass1CF A02;
    public String A03;
    public String A04;
    public ArrayList A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final List A0A;

    public void A2F() {
        if (!this.A08) {
            this.A08 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A01 = C36361kB.A0Q(A0B);
            this.A02 = C36361kB.A0b(A0B);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0336, code lost:
        r0 = getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0346, code lost:
        r0 = getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x034a, code lost:
        if (r0 == null) goto L_0x024b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x034c, code lost:
        r4 = X.C36331k8.A0k(r0, " ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0352, code lost:
        if (r12.A07 == false) goto L_0x0359;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0354, code lost:
        r0 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0359, code lost:
        r1 = r12.A0A.contains(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x007e, code lost:
        if (r1 == null) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01f7, code lost:
        r5 = getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01fb, code lost:
        if (r5 == null) goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01fd, code lost:
        r6.append("  • ");
        r6.append(r5);
        r6.append(10);
        r9 = r9 + 1;
        r2 = r7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0365  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0084  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r22) {
        /*
            r21 = this;
            r12 = r21
            r0 = r22
            super.onCreate(r0)
            r0 = 2131894880(0x7f122260, float:1.9424577E38)
            r2 = 2131894880(0x7f122260, float:1.9424577E38)
            r12.setTitle(r0)
            X.07B r0 = r12.getSupportActionBar()
            r10 = 1
            r0.A0U(r10)
            X.07B r0 = r12.getSupportActionBar()
            r0.A0V(r10)
            r0 = 2131626341(0x7f0e0965, float:1.8879915E38)
            android.content.Intent r1 = X.C36431kI.A0F(r12, r0)
            java.lang.String r0 = "com.whatsapp.SystemStatusActivity.from"
            java.lang.String r0 = r1.getStringExtra(r0)
            r12.A03 = r0
            java.lang.String r0 = "com.whatsapp.SystemStatusActivity.type"
            r4 = 0
            int r0 = r1.getIntExtra(r0, r4)
            r12.A00 = r0
            X.07B r0 = r12.getSupportActionBar()
            r0.A0I(r2)
            java.lang.String r0 = "com.whatsapp.SystemStatusActivity.email"
            boolean r0 = r1.getBooleanExtra(r0, r10)
            r12.A07 = r0
            java.lang.String r0 = "com.whatsapp.SystemStatusActivity.version"
            boolean r0 = r1.getBooleanExtra(r0, r10)
            r12.A09 = r0
            java.lang.String r0 = "com.whatsapp.SystemStatusActivity.statusonly"
            boolean r0 = r1.getBooleanExtra(r0, r4)
            r12.A06 = r0
            java.lang.String r0 = "com.whatsapp.SystemStatusActivity.serverfeaturesunavailable"
            java.util.ArrayList r0 = r1.getStringArrayListExtra(r0)
            r12.A05 = r0
            java.lang.String r5 = "registration"
            boolean r2 = r0.remove(r5)
            boolean r0 = r12.A09
            r1 = 0
            if (r0 != 0) goto L_0x0110
            r0 = 2131893435(0x7f121cbb, float:1.9421646E38)
            java.lang.String r2 = r12.getString(r0)
            boolean r1 = r12.A07
            r0 = 2131894881(0x7f122261, float:1.942458E38)
            if (r1 == 0) goto L_0x007a
            r0 = 2131894882(0x7f122262, float:1.9424581E38)
        L_0x007a:
            java.lang.String r1 = X.C36351kA.A0w(r12, r2, r10, r0)
        L_0x007e:
            if (r1 != 0) goto L_0x008b
        L_0x0080:
            boolean r0 = r12.A06
            if (r0 == 0) goto L_0x00df
            r0 = 2131894202(0x7f121fba, float:1.9423202E38)
            java.lang.String r1 = r12.getString(r0)
        L_0x008b:
            r0 = 2131434544(0x7f0b1c30, float:1.8490905E38)
            android.widget.TextView r0 = X.C36391kE.A0Q(r12, r0)
            r0.setText(r1)
            boolean r0 = r12.A06
            if (r0 != 0) goto L_0x0365
            boolean r0 = r12.A07
            if (r0 == 0) goto L_0x0365
            java.lang.String r0 = r12.A04
            if (r0 != 0) goto L_0x00c6
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "+"
            r2.append(r1)
            java.util.ArrayList r0 = r12.A05
            java.lang.String r0 = android.text.TextUtils.join(r1, r0)
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r2)
            r12.A04 = r1
            boolean r0 = r12.A09
            if (r0 != 0) goto L_0x00c6
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r1)
            java.lang.String r0 = "+version"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            r12.A04 = r0
        L_0x00c6:
            r0 = 2131434546(0x7f0b1c32, float:1.8490909E38)
            android.view.View r1 = r12.findViewById(r0)
            r0 = 35
            X.C67103Yn.A00(r1, r12, r0)
            r0 = 2131434545(0x7f0b1c31, float:1.8490907E38)
            android.view.View r1 = r12.findViewById(r0)
            r0 = 36
            X.C67103Yn.A00(r1, r12, r0)
            return
        L_0x00df:
            X.3DY r11 = r12.A01
            X.1CF r0 = r12.A02
            boolean r20 = r0.A00()
            java.lang.String r4 = r12.A03
            java.lang.String r3 = r12.A04
            int r0 = r12.A00
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
            r14 = 0
            android.content.Intent r2 = r12.getIntent()
            java.lang.String r0 = "com.whatsapp.SystemStatusActivity.describeProblemBundle"
            android.os.Bundle r13 = r2.getBundleExtra(r0)
            r19 = r14
            r16 = r4
            r17 = r3
            r18 = r14
            android.content.Intent r0 = r11.A01(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r12.startActivity(r0)
            r12.finish()
            goto L_0x008b
        L_0x0110:
            int r0 = r12.A00
            java.lang.String r3 = " "
            if (r0 == r10) goto L_0x0140
            if (r2 == 0) goto L_0x0080
            boolean r0 = r12.A07
            if (r0 != 0) goto L_0x0361
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()
            r0 = 2131894873(0x7f122259, float:1.9424563E38)
            X.C36351kA.A14(r12, r4, r0)
            r4.append(r3)
            java.util.List r0 = r12.A0A
            boolean r1 = r0.contains(r5)
        L_0x012f:
            r0 = 2131894847(0x7f12223f, float:1.942451E38)
            if (r1 == 0) goto L_0x0137
            r0 = 2131894849(0x7f122241, float:1.9424514E38)
        L_0x0137:
            X.C36351kA.A14(r12, r4, r0)
            java.lang.String r1 = r4.toString()
            goto L_0x007e
        L_0x0140:
            java.util.ArrayList r2 = r12.A05
            java.lang.String r0 = "chat"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x015a
            boolean r1 = r12.A07
            r0 = 2131894845(0x7f12223d, float:1.9424506E38)
            if (r1 == 0) goto L_0x0154
            r0 = 2131894846(0x7f12223e, float:1.9424508E38)
        L_0x0154:
            java.lang.String r1 = r12.getString(r0)
            goto L_0x007e
        L_0x015a:
            java.util.ArrayList r2 = r12.A05
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x0080
            r2.size()
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()
            java.util.Iterator r11 = r2.iterator()
            r2 = r1
            r9 = 0
        L_0x016f:
            boolean r0 = r11.hasNext()
            r8 = 10
            if (r0 == 0) goto L_0x020d
            java.lang.String r7 = X.AnonymousClass001.A0C(r11)
            int r0 = r7.hashCode()
            switch(r0) {
                case -1618876223: goto L_0x018c;
                case -1012222381: goto L_0x0198;
                case -892481550: goto L_0x01a4;
                case -309425751: goto L_0x01b0;
                case 3314326: goto L_0x01bc;
                case 3452698: goto L_0x01c8;
                case 3545755: goto L_0x01d4;
                case 98629247: goto L_0x01e0;
                case 1262089803: goto L_0x01ec;
                default: goto L_0x0182;
            }
        L_0x0182:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "sysstatus/create/m-down/string-not-found "
            X.C36321k7.A1P(r0, r7, r5)
            goto L_0x016f
        L_0x018c:
            java.lang.String r0 = "broadcast"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0182
            r0 = 2131894844(0x7f12223c, float:1.9424504E38)
            goto L_0x01f7
        L_0x0198:
            java.lang.String r0 = "online"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0182
            r0 = 2131894866(0x7f122252, float:1.9424549E38)
            goto L_0x01f7
        L_0x01a4:
            java.lang.String r0 = "status"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0182
            r0 = 2131894876(0x7f12225c, float:1.942457E38)
            goto L_0x01f7
        L_0x01b0:
            java.lang.String r0 = "profile"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0182
            r0 = 2131894869(0x7f122255, float:1.9424555E38)
            goto L_0x01f7
        L_0x01bc:
            java.lang.String r0 = "last"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0182
            r0 = 2131894856(0x7f122248, float:1.9424529E38)
            goto L_0x01f7
        L_0x01c8:
            java.lang.String r0 = "push"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0182
            r0 = 2131894872(0x7f122258, float:1.9424561E38)
            goto L_0x01f7
        L_0x01d4:
            java.lang.String r0 = "sync"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0182
            r0 = 2131894879(0x7f12225f, float:1.9424575E38)
            goto L_0x01f7
        L_0x01e0:
            java.lang.String r0 = "group"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0182
            r0 = 2131894853(0x7f122245, float:1.9424522E38)
            goto L_0x01f7
        L_0x01ec:
            java.lang.String r0 = "multimedia"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0182
            r0 = 2131894859(0x7f12224b, float:1.9424535E38)
        L_0x01f7:
            java.lang.String r5 = r12.getString(r0)
            if (r5 == 0) goto L_0x0182
            java.lang.String r0 = "  • "
            r6.append(r0)
            r6.append(r5)
            r6.append(r8)
            int r9 = r9 + 1
            r2 = r7
            goto L_0x016f
        L_0x020d:
            if (r9 <= r10) goto L_0x023e
            r6.append(r8)
            boolean r0 = r12.A07
            java.lang.String r1 = "\n\n"
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()
            if (r0 == 0) goto L_0x022d
            r0 = 2131894861(0x7f12224d, float:1.9424539E38)
            X.C36351kA.A14(r12, r4, r0)
            r4.append(r1)
            r4.append(r6)
            r0 = 2131894863(0x7f12224f, float:1.9424543E38)
            goto L_0x0137
        L_0x022d:
            r0 = 2131894860(0x7f12224c, float:1.9424537E38)
            X.C36351kA.A14(r12, r4, r0)
            r4.append(r1)
            r4.append(r6)
            r0 = 2131894862(0x7f12224e, float:1.942454E38)
            goto L_0x0137
        L_0x023e:
            if (r9 <= 0) goto L_0x0080
            boolean r5 = r12.A07
            int r0 = r2.hashCode()
            if (r5 == 0) goto L_0x02c7
            switch(r0) {
                case -1618876223: goto L_0x025f;
                case -1012222381: goto L_0x026c;
                case -892481550: goto L_0x0279;
                case -309425751: goto L_0x0286;
                case 3314326: goto L_0x0293;
                case 3452698: goto L_0x02a0;
                case 3545755: goto L_0x02ad;
                case 98629247: goto L_0x02ba;
                case 1262089803: goto L_0x033b;
                default: goto L_0x024b;
            }
        L_0x024b:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "sysstatus/create/down/string-not-found "
            r2.append(r0)
            java.util.ArrayList r0 = r12.A05
            java.lang.String r0 = X.C36421kH.A0e(r0, r4)
            X.C36321k7.A1Z(r2, r0)
            goto L_0x0080
        L_0x025f:
            java.lang.String r0 = "broadcast"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x024b
            r0 = 2131894843(0x7f12223b, float:1.9424502E38)
            goto L_0x0346
        L_0x026c:
            java.lang.String r0 = "online"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x024b
            r0 = 2131894865(0x7f122251, float:1.9424547E38)
            goto L_0x0346
        L_0x0279:
            java.lang.String r0 = "status"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x024b
            r0 = 2131894875(0x7f12225b, float:1.9424567E38)
            goto L_0x0346
        L_0x0286:
            java.lang.String r0 = "profile"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x024b
            r0 = 2131894868(0x7f122254, float:1.9424553E38)
            goto L_0x0346
        L_0x0293:
            java.lang.String r0 = "last"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x024b
            r0 = 2131894855(0x7f122247, float:1.9424527E38)
            goto L_0x0346
        L_0x02a0:
            java.lang.String r0 = "push"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x024b
            r0 = 2131894871(0x7f122257, float:1.942456E38)
            goto L_0x0346
        L_0x02ad:
            java.lang.String r0 = "sync"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x024b
            r0 = 2131894878(0x7f12225e, float:1.9424573E38)
            goto L_0x0346
        L_0x02ba:
            java.lang.String r0 = "group"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x024b
            r0 = 2131894852(0x7f122244, float:1.942452E38)
            goto L_0x0346
        L_0x02c7:
            switch(r0) {
                case -1618876223: goto L_0x02cb;
                case -1012222381: goto L_0x02d7;
                case -892481550: goto L_0x02e3;
                case -309425751: goto L_0x02ef;
                case 3314326: goto L_0x02fb;
                case 3452698: goto L_0x0307;
                case 3545755: goto L_0x0313;
                case 98629247: goto L_0x031f;
                case 1262089803: goto L_0x032b;
                default: goto L_0x02ca;
            }
        L_0x02ca:
            goto L_0x024b
        L_0x02cb:
            java.lang.String r0 = "broadcast"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x024b
            r0 = 2131894842(0x7f12223a, float:1.94245E38)
            goto L_0x0336
        L_0x02d7:
            java.lang.String r0 = "online"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x024b
            r0 = 2131894864(0x7f122250, float:1.9424545E38)
            goto L_0x0336
        L_0x02e3:
            java.lang.String r0 = "status"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x024b
            r0 = 2131894874(0x7f12225a, float:1.9424565E38)
            goto L_0x0336
        L_0x02ef:
            java.lang.String r0 = "profile"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x024b
            r0 = 2131894867(0x7f122253, float:1.942455E38)
            goto L_0x0336
        L_0x02fb:
            java.lang.String r0 = "last"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x024b
            r0 = 2131894854(0x7f122246, float:1.9424525E38)
            goto L_0x0336
        L_0x0307:
            java.lang.String r0 = "push"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x024b
            r0 = 2131894870(0x7f122256, float:1.9424557E38)
            goto L_0x0336
        L_0x0313:
            java.lang.String r0 = "sync"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x024b
            r0 = 2131894877(0x7f12225d, float:1.9424571E38)
            goto L_0x0336
        L_0x031f:
            java.lang.String r0 = "group"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x024b
            r0 = 2131894851(0x7f122243, float:1.9424518E38)
            goto L_0x0336
        L_0x032b:
            java.lang.String r0 = "multimedia"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x024b
            r0 = 2131894857(0x7f122249, float:1.942453E38)
        L_0x0336:
            java.lang.String r0 = r12.getString(r0)
            goto L_0x034a
        L_0x033b:
            java.lang.String r0 = "multimedia"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x024b
            r0 = 2131894858(0x7f12224a, float:1.9424533E38)
        L_0x0346:
            java.lang.String r0 = r12.getString(r0)
        L_0x034a:
            if (r0 == 0) goto L_0x024b
            java.lang.StringBuilder r4 = X.C36331k8.A0k(r0, r3)
            boolean r0 = r12.A07
            if (r0 == 0) goto L_0x0359
            r0 = 2131894848(0x7f122240, float:1.9424512E38)
            goto L_0x0137
        L_0x0359:
            java.util.List r0 = r12.A0A
            boolean r1 = r0.contains(r2)
            goto L_0x012f
        L_0x0361:
            r12.A04 = r5
            goto L_0x0080
        L_0x0365:
            r0 = 2131434543(0x7f0b1c2f, float:1.8490903E38)
            X.C36331k8.A11(r12, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.systemstatus.SystemStatusActivity.onCreate(android.os.Bundle):void");
    }

    public SystemStatusActivity(int i) {
        this.A08 = false;
        C89374Wh.A00(this, 11);
    }

    public SystemStatusActivity() {
        this(0);
        this.A0A = Arrays.asList(new String[]{"broadcast", "registration", "sync", "status"});
    }
}
