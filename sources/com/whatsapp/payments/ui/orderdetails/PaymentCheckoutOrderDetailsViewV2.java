package com.whatsapp.payments.ui.orderdetails;

import X.AEJ;
import X.AnonymousClass11F;
import X.AnonymousClass1EV;
import X.AnonymousClass1FR;
import X.AnonymousClass1LB;
import X.AnonymousClass1QZ;
import X.AnonymousClass1SV;
import X.AnonymousClass1Z2;
import X.AnonymousClass3YM;
import X.AnonymousClass6VE;
import X.AnonymousClass9SC;
import X.AnonymousClass9Y1;
import X.AnonymousClass9ZJ;
import X.C012005e;
import X.C165577te;
import X.C165607th;
import X.C167487y7;
import X.C18700tb;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C191489Dd;
import X.C194219Oo;
import X.C195399Ud;
import X.C19600wD;
import X.C196089Xp;
import X.C19630wG;
import X.C19770wU;
import X.C206349tD;
import X.C207119ua;
import X.C20810yC;
import X.C21060yb;
import X.C22909AyL;
import X.C23043B1o;
import X.C27111My;
import X.C27731Pn;
import X.C27851Qb;
import X.C27861Qc;
import X.C32681e1;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C36391kE;
import X.C36401kF;
import X.C36431kI;
import X.C36441kJ;
import X.C61223Ba;
import X.C88874Uj;
import X.C90514aH;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaButtonWithLoader;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.HashMap;

public class PaymentCheckoutOrderDetailsViewV2 extends LinearLayout implements C18700tb {
    public View A00;
    public LinearLayout A01;
    public RelativeLayout A02;
    public RelativeLayout A03;
    public RelativeLayout A04;
    public RelativeLayout A05;
    public RecyclerView A06;
    public C191489Dd A07;
    public TextEmojiLabel A08;
    public TextEmojiLabel A09;
    public WaButtonWithLoader A0A;
    public WaButtonWithLoader A0B;
    public WaTextView A0C;
    public WaTextView A0D;
    public WaTextView A0E;
    public WaTextView A0F;
    public C22909AyL A0G;
    public AnonymousClass1LB A0H;
    public AnonymousClass6VE A0I;
    public AnonymousClass9ZJ A0J;
    public AnonymousClass9Y1 A0K;
    public C195399Ud A0L;
    public C196089Xp A0M;
    public C19600wD A0N;
    public C27731Pn A0O;
    public C21060yb A0P;
    public C19630wG A0Q;
    public C18820ts A0R;
    public C20810yC A0S;
    public C61223Ba A0T;
    public AnonymousClass1Z2 A0U;
    public AnonymousClass1EV A0V;
    public AnonymousClass1FR A0W;
    public C32681e1 A0X;
    public AnonymousClass1SV A0Y;
    public C19770wU A0Z;
    public WDSButton A0a;
    public AnonymousClass1QZ A0b;
    public boolean A0c;
    public C167487y7 A0d;

    public PaymentCheckoutOrderDetailsViewV2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void A01(Context context, AnonymousClass9SC r17, C194219Oo r18, String str) {
        String str2 = str;
        AnonymousClass9SC r4 = r17;
        C194219Oo r13 = r18;
        if (!this.A0U.A02(new AEJ(context, this, r4, r13, str2))) {
            C88874Uj r0 = r13.A0A;
            C23043B1o b1o = r13.A0B;
            AnonymousClass11F r2 = r13.A08;
            C207119ua r1 = r13.A06;
            String str3 = r13.A0L;
            C206349tD r3 = r13.A09;
            String str4 = r13.A0D;
            HashMap hashMap = r13.A0M;
            if (str == null) {
                str2 = "order_details";
            }
            r0.BTU(r1, r2, r3, r4, b1o, str3, str4, str2, hashMap);
        }
    }

    public boolean A03(AnonymousClass9SC r4, C194219Oo r5, int i) {
        if (r5.A0T && i != 4) {
            if (r4 == null) {
                C165577te.A1M("PaymentCheckoutOrderDetailsViewV2", "renderUi, this payment method is not supported");
            } else {
                this.A0B.A00 = new AnonymousClass3YM(this, r4, r5, 16);
                return true;
            }
        }
        return false;
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A0b;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A0b = r0;
        }
        return r0.generatedComponent();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0073 A[EDGE_INSN: B:55:0x0073->B:20:0x0073 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass9SC A00(X.C188008yt r12, X.C194219Oo r13, java.lang.String r14, java.util.List r15, int r16) {
        /*
            r11 = this;
            android.content.Context r2 = r11.getContext()
            X.0yC r1 = r11.A0S
            r5 = 0
            boolean r10 = X.C36341k9.A1a(r2, r1)
            r0 = 1767(0x6e7, float:2.476E-42)
            java.lang.String r0 = r1.A09(r0)
            r6 = 0
            java.util.LinkedHashMap r0 = X.AnonymousClass9Za.A01(r2, r0, r15)
            X.AnonymousClass00C.A0D(r14, r5)
            java.lang.Object r0 = r0.get(r14)
            X.9tH r0 = (X.C206369tH) r0
            r1 = r16
            if (r1 != r10) goto L_0x003a
            if (r0 == 0) goto L_0x003a
            X.1LB r2 = r11.A0H
            X.AnonymousClass00C.A0D(r2, r5)
            java.lang.String r1 = r0.A05
            java.lang.String r0 = r0.A04
            java.lang.String r8 = X.C165587tf.A0h(r2, r1, r0)
            r9 = r6
            X.9SC r5 = new X.9SC
            r7 = r6
            r5.<init>(r6, r7, r8, r9, r10)
        L_0x0039:
            return r5
        L_0x003a:
            X.8yt r0 = X.C188008yt.NONE
            if (r12 != r0) goto L_0x00a3
            java.util.HashMap r0 = r13.A0M
            java.lang.Object r5 = X.C90484aE.A0j(r0, r1)
        L_0x0044:
            X.9SC r5 = (X.AnonymousClass9SC) r5
            if (r5 == 0) goto L_0x0039
        L_0x0048:
            X.8yt r0 = X.C188008yt.INACTIVE
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0073
            boolean r0 = r13.A0O
            if (r0 == 0) goto L_0x0073
            java.lang.String r4 = "WhatsappPay"
            r3 = 0
        L_0x0057:
            java.util.List r2 = r13.A0N
            int r0 = r2.size()
            r1 = -1
            if (r3 >= r0) goto L_0x0073
            java.lang.Object r0 = r2.get(r3)
            X.9tH r0 = (X.C206369tH) r0
            java.lang.String r0 = r0.A0A
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00a0
            if (r3 <= r1) goto L_0x0073
            r2.remove(r3)
        L_0x0073:
            int r3 = r5.A01
            r2 = -1
            if (r3 == r2) goto L_0x009c
            if (r3 == 0) goto L_0x009c
            android.widget.LinearLayout r1 = r11.A01
            r0 = 8
        L_0x007e:
            r1.setVisibility(r0)
            if (r3 != r2) goto L_0x0039
            X.1EV r0 = r11.A0V
            boolean r2 = r0.A0F()
            android.content.res.Resources r1 = r11.getResources()
            r0 = 2131896886(0x7f122a36, float:1.9428646E38)
            if (r2 == 0) goto L_0x0095
            r0 = 2131891836(0x7f12167c, float:1.9418403E38)
        L_0x0095:
            java.lang.String r0 = r1.getString(r0)
            r5.A00 = r0
            return r5
        L_0x009c:
            android.widget.LinearLayout r1 = r11.A01
            r0 = 0
            goto L_0x007e
        L_0x00a0:
            int r3 = r3 + 1
            goto L_0x0057
        L_0x00a3:
            X.8yt r0 = X.C188008yt.ACTIVE
            r4 = 3
            if (r12 != r0) goto L_0x00ca
            r3 = 0
            r5 = 1
        L_0x00aa:
            java.util.HashMap r2 = r13.A0M
            java.util.Iterator r1 = X.C36371kC.A10(r2)
        L_0x00b0:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00d0
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r1)
            int r0 = X.C165577te.A08(r0)
            if (r0 == r3) goto L_0x00b0
            if (r0 == r4) goto L_0x00b0
            if (r0 == 0) goto L_0x00b0
            if (r3 != r4) goto L_0x00c7
            r3 = r0
        L_0x00c7:
            int r5 = r5 + 1
            goto L_0x00b0
        L_0x00ca:
            X.8yt r0 = X.C188008yt.INACTIVE
            if (r12 != r0) goto L_0x00e5
            r3 = 3
            goto L_0x00aa
        L_0x00d0:
            if (r5 <= r10) goto L_0x00df
            r10 = -1
            java.util.List r9 = r13.A0N
            java.lang.String r8 = ""
            X.9SC r5 = new X.9SC
            r7 = r6
            r5.<init>(r6, r7, r8, r9, r10)
            goto L_0x0048
        L_0x00df:
            java.lang.Object r5 = X.C90484aE.A0j(r2, r3)
            goto L_0x0044
        L_0x00e5:
            java.lang.String r0 = "Unknown merchant status"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2.A00(X.8yt, X.9Oo, java.lang.String, java.util.List, int):X.9SC");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01e2  */
    public void A02(X.AnonymousClass01L r39, X.C19730wQ r40, X.C188008yt r41, X.C194219Oo r42, java.lang.String r43, java.util.List r44, int r45, int r46) {
        /*
            r38 = this;
            r7 = r38
            X.0wG r8 = r7.A0Q
            X.0yC r9 = r7.A0S
            X.1e1 r5 = r7.A0X
            X.1Pn r4 = r7.A0O
            X.1FR r3 = r7.A0W
            X.0yb r0 = r7.A0P
            r37 = r0
            X.9Xp r2 = r7.A0M
            X.1EV r0 = r7.A0V
            r36 = r0
            X.0ts r0 = r7.A0R
            r35 = r0
            X.1SV r1 = r7.A0Y
            X.1LB r11 = r7.A0H
            X.0wU r0 = r7.A0Z
            X.7zf r6 = new X.7zf
            r13 = r40
            r16 = r4
            r17 = r37
            r18 = r8
            r19 = r35
            r20 = r9
            r21 = r36
            r22 = r3
            r23 = r5
            r24 = r1
            r25 = r0
            r12 = r6
            r14 = r11
            r15 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r10 = r42
            X.9lY r8 = r10.A07
            if (r8 == 0) goto L_0x040b
            X.8av r0 = r8.A0A
            if (r0 == 0) goto L_0x040b
            X.9uW r18 = r0.A0B()
        L_0x004c:
            r1 = r41
            r29 = r43
            r12 = r44
            r5 = r45
            r0 = r7
            r2 = r10
            r3 = r29
            r4 = r12
            X.9SC r3 = r0.A00(r1, r2, r3, r4, r5)
            boolean r2 = r10.A0S
            r1 = 8
            r4 = 0
            r17 = r46
            if (r2 == 0) goto L_0x0397
            android.widget.RelativeLayout r0 = r7.A03
            r0.setVisibility(r4)
            android.widget.RelativeLayout r0 = r7.A04
            r0.setVisibility(r1)
            android.view.View r0 = r7.A00
            r0.setVisibility(r4)
            android.widget.RelativeLayout r0 = r7.A05
            r0.setVisibility(r4)
            com.whatsapp.WaButtonWithLoader r4 = r7.A0A
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131888206(0x7f12084e, float:1.941104E38)
            java.lang.String r0 = r1.getString(r0)
            r4.setButtonText((java.lang.String) r0)
            X.B1o r0 = r10.A0B
            X.9ui r0 = X.C207219uk.A00(r0)
            java.lang.String r1 = r0.A04
            if (r1 == 0) goto L_0x0394
            java.lang.String r0 = "pix"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0380
            r11 = 6
        L_0x009d:
            com.whatsapp.wds.components.button.WDSButton r5 = r7.A0a
            r1 = 18
            X.3Yr r0 = new X.3Yr
            r0.<init>(r10, r11, r1)
            r5.setOnClickListener(r0)
            r1 = 19
            X.3Yr r0 = new X.3Yr
            r0.<init>(r10, r11, r1)
            r4.A00 = r0
        L_0x00b2:
            android.content.Context r12 = r7.getContext()
            X.B1o r0 = r10.A0B
            r34 = r0
            X.9uk r1 = r34.BA8()
            X.C18740tg.A06(r1)
            X.9ui r0 = r1.A01
            X.C18740tg.A06(r0)
            X.9uP r0 = r0.A09
            java.util.List r0 = r0.A09
            X.C18740tg.A06(r0)
            java.util.List r5 = r6.A0D
            r5.clear()
            X.9ui r11 = r1.A01
            X.9uk r4 = r34.BA8()
            X.C18740tg.A06(r4)
            X.9ui r0 = r4.A01
            X.C18740tg.A06(r0)
            X.9uP r0 = r0.A09
            java.util.List r0 = r0.A09
            X.C18740tg.A06(r0)
            r5.clear()
            int r1 = r5.size()
            X.9ui r0 = r4.A01
            X.C18740tg.A06(r0)
            X.1FR r0 = r6.A09
            r33 = r0
            X.1EV r13 = r0.A08
            java.lang.String r0 = r11.A0E
            r16 = r0
            java.util.List r0 = r11.A0L
            r32 = r0
            r14 = r0
            r0 = r16
            boolean r0 = r13.A0J(r0, r14)
            if (r0 == 0) goto L_0x0113
            if (r8 == 0) goto L_0x0113
            boolean r13 = r8.A0L()
            r0 = 1
            if (r13 != 0) goto L_0x0114
        L_0x0113:
            r0 = 0
        L_0x0114:
            r13 = 1
            r14 = 0
            if (r0 == 0) goto L_0x02b3
            X.9uP r0 = r11.A09
            java.lang.String r0 = r0.A01
            int r0 = X.C207199ui.A00(r0)
            if (r0 != r13) goto L_0x02b3
            r2 = 2131232634(0x7f08077a, float:1.8081383E38)
            r0 = 2131895060(0x7f122314, float:1.9424942E38)
            java.lang.String r3 = r12.getString(r0)
            r0 = 2131892029(0x7f12173d, float:1.9418795E38)
        L_0x012f:
            java.lang.String r0 = r12.getString(r0)
            X.8k7 r1 = new X.8k7
            r1.<init>(r14, r3, r0, r2)
        L_0x0138:
            r5.add(r1)
        L_0x013b:
            r1 = 2131167765(0x7f070a15, float:1.7949813E38)
            r2 = 0
            X.8k5 r0 = new X.8k5
            r0.<init>(r2, r1, r2)
            r5.add(r0)
            X.141 r4 = r10.A04
            boolean r3 = r10.A0P
            java.lang.String r0 = r10.A0E
            r31 = r0
            java.lang.String r14 = r10.A0J
            X.8k6 r1 = new X.8k6
            r1.<init>(r4, r0, r14, r3)
            r5.add(r1)
            X.1EV r0 = r6.A08
            r1 = r16
            boolean r23 = r0.A0I(r1)
            boolean r1 = r10.A0R
            java.lang.String r15 = r10.A0I
            X.9ua r3 = r10.A06
            X.16U r14 = r3.A01
            if (r23 == 0) goto L_0x0173
            r4 = r17
            if (r4 != r13) goto L_0x0173
            r25 = 0
            if (r1 != 0) goto L_0x0175
        L_0x0173:
            r25 = 1
        L_0x0175:
            X.8k8 r4 = new X.8k8
            r19 = r4
            r20 = r14
            r21 = r15
            r22 = r17
            r24 = r1
            r19.<init>(r20, r21, r22, r23, r24, r25)
            r5.add(r4)
            X.9uP r4 = r11.A09
            java.lang.String r13 = r4.A08
            java.lang.String r1 = "PAYMENT_REQUEST"
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x022f
            X.0yC r13 = r0.A02
            r1 = 5574(0x15c6, float:7.811E-42)
            boolean r1 = r13.A0E(r1)
            if (r1 != 0) goto L_0x01a5
            r1 = 5575(0x15c7, float:7.812E-42)
            boolean r1 = r13.A0E(r1)
            if (r1 == 0) goto L_0x022f
        L_0x01a5:
            java.lang.String r1 = r10.A0D
            X.8k2 r4 = new X.8k2
            r4.<init>(r1)
        L_0x01ac:
            r5.add(r4)
        L_0x01af:
            r3 = 2130971030(0x7f040996, float:1.7550787E38)
            r1 = 2131102401(0x7f060ac1, float:1.7817239E38)
            int r13 = X.C224514j.A00(r12, r3, r1)
            r4 = 2131165333(0x7f070095, float:1.794488E38)
            X.16U r3 = r11.A08
            X.C18740tg.A06(r3)
            r1 = r33
            X.1lL r16 = r1.A0J(r12, r3, r13, r4)
            r4 = 180(0xb4, float:2.52E-43)
            r3 = 2131167766(0x7f070a16, float:1.7949815E38)
            X.8k5 r1 = new X.8k5
            r1.<init>(r4, r2, r3)
            r5.add(r1)
            if (r23 == 0) goto L_0x01ea
            boolean r1 = r10.A0T
            if (r1 == 0) goto L_0x01ea
            java.lang.String r2 = r10.A0G
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x01ea
            X.8k1 r1 = new X.8k1
            r1.<init>(r2)
            r5.add(r1)
        L_0x01ea:
            boolean r13 = r10.A0Q
            boolean r14 = r10.A0U
            X.4Uj r12 = r10.A0A
            X.11F r4 = r10.A08
            java.lang.String r11 = r10.A0L
            long r1 = r10.A01
            X.9Hi r3 = r10.A05
            X.8kA r15 = new X.8kA
            r18 = r8
            r19 = r4
            r20 = r12
            r21 = r34
            r22 = r11
            r23 = r31
            r24 = r1
            r26 = r13
            r27 = r14
            r17 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r27)
            r5.add(r15)
            r1 = r32
            boolean r0 = r0.A0K(r1)
            if (r0 == 0) goto L_0x0228
            boolean r0 = r10.A0T
            if (r0 != 0) goto L_0x0228
            X.8jz r0 = new X.8jz
            r0.<init>()
            r5.add(r0)
        L_0x0228:
            if (r13 != 0) goto L_0x042e
            if (r8 == 0) goto L_0x042e
            monitor-enter(r8)
            goto L_0x040f
        L_0x022f:
            java.util.List r1 = r4.A09
            X.C18740tg.A06(r1)
            java.util.Iterator r14 = r1.iterator()
        L_0x0238:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x024f
            java.lang.Object r13 = r14.next()
            X.9uJ r13 = (X.C206959uJ) r13
            X.8k4 r4 = new X.8k4
            r1 = r34
            r4.<init>(r13, r1)
            r5.add(r4)
            goto L_0x0238
        L_0x024f:
            boolean r1 = r10.A0V
            if (r1 == 0) goto L_0x026d
            java.lang.String r14 = r10.A0L
            X.4Uj r13 = r10.A0A
            java.util.List r4 = r10.A0N
            X.2Zv r1 = new X.2Zv
            r24 = r1
            r25 = r3
            r26 = r13
            r27 = r34
            r28 = r14
            r30 = r4
            r24.<init>(r25, r26, r27, r28, r29, r30)
            r5.add(r1)
        L_0x026d:
            X.0ts r14 = r6.A06
            boolean r13 = r10.A0W
            java.lang.String r4 = r10.A0F
            java.lang.String r3 = r10.A0H
            X.8k9 r1 = new X.8k9
            r19 = r11
            r20 = r4
            r21 = r3
            r22 = r13
            r15 = r1
            r16 = r12
            r17 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            r5.add(r1)
            java.lang.String r3 = r10.A0K
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L_0x01af
            X.0wQ r1 = r6.A00
            X.11F r4 = r10.A08
            boolean r1 = r1.A0M(r4)
            if (r1 != 0) goto L_0x01af
            X.0yC r13 = r6.A07
            r1 = 6012(0x177c, float:8.425E-42)
            boolean r1 = r13.A0E(r1)
            if (r1 != 0) goto L_0x01af
            r1 = r33
            boolean r1 = r1.A0i(r4)
            X.8k3 r4 = new X.8k3
            r4.<init>(r3, r1)
            goto L_0x01ac
        L_0x02b3:
            X.9ui r0 = r4.A01
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x02d5
            boolean r0 = r10.A0T
            if (r0 == 0) goto L_0x02d5
            r3 = 2131232409(0x7f080699, float:1.8080926E38)
            r0 = 2131892022(0x7f121736, float:1.941878E38)
            java.lang.String r2 = r12.getString(r0)
            r4 = 15
            X.3YL r0 = new X.3YL
            r0.<init>(r6, r1, r4, r5)
            X.8k7 r1 = new X.8k7
            r1.<init>(r0, r14, r2, r3)
            goto L_0x0138
        L_0x02d5:
            r4 = 0
            if (r2 == 0) goto L_0x02ed
            r2 = 2131232409(0x7f080699, float:1.8080926E38)
            r3 = 2131891917(0x7f1216cd, float:1.9418568E38)
            java.lang.Object[] r1 = new java.lang.Object[r13]
            java.lang.String r0 = r10.A0E
            java.lang.String r0 = X.C36391kE.A0v(r12, r0, r1, r4, r3)
            X.8k7 r1 = new X.8k7
            r1.<init>(r14, r14, r0, r2)
            goto L_0x0138
        L_0x02ed:
            X.1EV r0 = r6.A08
            X.0yC r1 = r0.A02
            r0 = 4252(0x109c, float:5.958E-42)
            org.json.JSONObject r2 = r1.A0A(r0)
            java.lang.String r1 = "buyer_ed_nudge_enabled"
            boolean r0 = r2.has(r1)
            if (r0 == 0) goto L_0x013b
            int r0 = r2.getInt(r1)     // Catch:{ JSONException -> 0x0378 }
            if (r0 != r13) goto L_0x013b
            boolean r0 = r10.A0T
            if (r0 == 0) goto L_0x013b
            if (r3 == 0) goto L_0x013b
            int r1 = r3.A01
            r0 = -1
            if (r1 != r0) goto L_0x032e
            r2 = 2131232409(0x7f080699, float:1.8080926E38)
            X.0yC r0 = r6.A07
            int r0 = X.C165587tf.A05(r0)
            boolean r1 = X.AnonymousClass000.A1P(r0)
            r0 = 2131891915(0x7f1216cb, float:1.9418564E38)
            if (r1 == 0) goto L_0x0325
            r0 = 2131891916(0x7f1216cc, float:1.9418566E38)
        L_0x0325:
            java.lang.String r3 = r12.getString(r0)
            r0 = 2131891914(0x7f1216ca, float:1.9418561E38)
            goto L_0x012f
        L_0x032e:
            r0 = 2
            if (r1 != r0) goto L_0x0340
            r2 = 2131232409(0x7f080699, float:1.8080926E38)
            r0 = 2131891913(0x7f1216c9, float:1.941856E38)
            java.lang.String r3 = r12.getString(r0)
            r0 = 2131891912(0x7f1216c8, float:1.9418557E38)
            goto L_0x012f
        L_0x0340:
            r0 = 3
            if (r1 != r0) goto L_0x013b
            r15 = 2131232409(0x7f080699, float:1.8080926E38)
            X.0yC r1 = r6.A07
            int r0 = X.C165587tf.A05(r1)
            boolean r2 = X.AnonymousClass000.A1P(r0)
            r0 = 2131891910(0x7f1216c6, float:1.9418553E38)
            if (r2 == 0) goto L_0x0358
            r0 = 2131891911(0x7f1216c7, float:1.9418555E38)
        L_0x0358:
            java.lang.String r3 = r12.getString(r0)
            int r1 = X.C165587tf.A05(r1)
            r0 = 3
            r2 = 2131891908(0x7f1216c4, float:1.941855E38)
            if (r1 != r0) goto L_0x0369
            r2 = 2131891909(0x7f1216c5, float:1.9418551E38)
        L_0x0369:
            java.lang.Object[] r1 = new java.lang.Object[r13]
            java.lang.String r0 = r10.A0E
            java.lang.String r0 = X.C36391kE.A0v(r12, r0, r1, r4, r2)
            X.8k7 r1 = new X.8k7
            r1.<init>(r14, r3, r0, r15)
            goto L_0x0138
        L_0x0378:
            r1 = move-exception
            java.lang.String r0 = "failed to parse config for ab prop BR_BUYER_ED_CAPABILITIES_CODE#buyer_ed_nudge_enabled"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x013b
        L_0x0380:
            java.lang.String r0 = "confirm"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x038b
            r11 = 3
            goto L_0x009d
        L_0x038b:
            java.lang.String r0 = "payment_instruction"
            boolean r0 = r0.equals(r1)
            r11 = 2
            if (r0 != 0) goto L_0x009d
        L_0x0394:
            r11 = -1
            goto L_0x009d
        L_0x0397:
            r0 = r17
            boolean r0 = r7.A03(r3, r10, r0)
            if (r0 == 0) goto L_0x03fb
            android.widget.RelativeLayout r0 = r7.A03
            r0.setVisibility(r4)
            android.widget.RelativeLayout r0 = r7.A04
            r0.setVisibility(r4)
            android.view.View r0 = r7.A00
            r0.setVisibility(r4)
            android.content.Context r5 = r7.getContext()
            X.C36331k8.A1I(r5, r9)
            r0 = 1767(0x6e7, float:2.476E-42)
            java.lang.String r0 = r9.A09(r0)
            java.util.LinkedHashMap r5 = X.AnonymousClass9Za.A01(r5, r0, r12)
            r0 = r29
            X.AnonymousClass00C.A0D(r0, r4)
            java.lang.Object r0 = r5.get(r0)
            X.9tH r0 = (X.C206369tH) r0
            if (r0 != 0) goto L_0x03ed
            if (r3 == 0) goto L_0x03e4
            java.lang.String r0 = r3.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x03e4
            com.whatsapp.WaButtonWithLoader r5 = r7.A0B
            java.lang.String r0 = r3.A00
        L_0x03da:
            r5.setButtonText((java.lang.String) r0)
        L_0x03dd:
            android.widget.RelativeLayout r0 = r7.A05
            r0.setVisibility(r1)
            goto L_0x00b2
        L_0x03e4:
            com.whatsapp.WaButtonWithLoader r4 = r7.A0B
            r0 = 2131896886(0x7f122a36, float:1.9428646E38)
            r4.setButtonText((int) r0)
            goto L_0x03dd
        L_0x03ed:
            com.whatsapp.WaButtonWithLoader r5 = r7.A0B
            X.AnonymousClass00C.A0D(r11, r4)
            java.lang.String r4 = r0.A05
            java.lang.String r0 = r0.A04
            java.lang.String r0 = X.C165587tf.A0h(r11, r4, r0)
            goto L_0x03da
        L_0x03fb:
            android.view.View r0 = r7.A00
            r0.setVisibility(r1)
            android.widget.RelativeLayout r0 = r7.A03
            r0.setVisibility(r1)
            android.widget.RelativeLayout r0 = r7.A04
            r0.setVisibility(r1)
            goto L_0x03dd
        L_0x040b:
            r18 = 0
            goto L_0x004c
        L_0x040f:
            X.8av r1 = r8.A0A     // Catch:{ all -> 0x041c }
            if (r1 == 0) goto L_0x0422
            boolean r0 = r1 instanceof X.C175928bI     // Catch:{ all -> 0x041c }
            if (r0 == 0) goto L_0x0422
            X.8bI r1 = (X.C175928bI) r1     // Catch:{ all -> 0x041c }
            boolean r1 = r1.A0X     // Catch:{ all -> 0x041c }
            goto L_0x041f
        L_0x041c:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x041f:
            r0 = 1
            if (r1 != 0) goto L_0x0423
        L_0x0422:
            r0 = 0
        L_0x0423:
            monitor-exit(r8)
            if (r0 == 0) goto L_0x042e
            X.8k0 r0 = new X.8k0
            r0.<init>(r4)
            r5.add(r0)
        L_0x042e:
            androidx.recyclerview.widget.RecyclerView r0 = r7.A06
            r0.setAdapter(r6)
            com.whatsapp.WaTextView r11 = r7.A0F
            java.lang.String r0 = r10.A0D
            r11.setText(r0)
            com.whatsapp.WaTextView r8 = r7.A0D
            r5 = 8
            r8.setVisibility(r5)
            com.whatsapp.TextEmojiLabel r3 = r7.A08
            r3.setVisibility(r5)
            boolean r0 = r10.A0W
            r2 = 0
            com.whatsapp.WaTextView r1 = r7.A0E
            if (r0 == 0) goto L_0x04e6
            r1.setVisibility(r5)
            r11.setVisibility(r5)
        L_0x0453:
            X.9ui r12 = X.C207219uk.A00(r34)
            java.lang.String r13 = r12.A0E
            r0 = r36
            boolean r14 = r0.A0I(r13)
            java.lang.String r13 = r10.A0G
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 != 0) goto L_0x04e0
            if (r14 != 0) goto L_0x04e0
            com.whatsapp.WaTextView r0 = r7.A0C
            r0.setText(r13)
            r0.setVisibility(r2)
        L_0x0471:
            android.widget.LinearLayout r0 = r7.A01
            r0.setVisibility(r5)
            java.lang.CharSequence r13 = r10.A0C
            boolean r10 = android.text.TextUtils.isEmpty(r13)
            com.whatsapp.TextEmojiLabel r0 = r7.A09
            if (r10 == 0) goto L_0x04d6
            r0.setVisibility(r5)
        L_0x0483:
            android.widget.RelativeLayout r9 = r7.A02
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x04a3
            int r0 = r1.getVisibility()
            if (r0 == 0) goto L_0x04a3
            int r0 = r11.getVisibility()
            if (r0 == 0) goto L_0x04a3
            int r0 = r8.getVisibility()
            if (r0 == 0) goto L_0x04a3
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L_0x04a4
        L_0x04a3:
            r5 = 0
        L_0x04a4:
            r9.setVisibility(r5)
            boolean r0 = r4 instanceof com.whatsapp.jid.UserJid
            X.C18740tg.A0B(r0)
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            X.9uP r0 = r12.A09
            java.util.List r9 = r0.A09
            X.C18740tg.A06(r9)
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()
            java.util.Iterator r3 = r9.iterator()
        L_0x04bd:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x054b
            java.lang.Object r0 = r3.next()
            X.9uJ r0 = (X.C206959uJ) r0
            java.lang.String r1 = r0.A00()
            X.9tW r0 = new X.9tW
            r0.<init>(r1)
            r8.add(r0)
            goto L_0x04bd
        L_0x04d6:
            X.C36331k8.A1A(r9, r0)
            r0.setVisibility(r2)
            r0.setText(r13)
            goto L_0x0483
        L_0x04e0:
            com.whatsapp.WaTextView r0 = r7.A0C
            r0.setVisibility(r5)
            goto L_0x0471
        L_0x04e6:
            r1.setVisibility(r2)
            r11.setVisibility(r2)
            X.9tD r12 = r10.A09
            android.text.SpannableString r0 = r10.A02
            r17 = r0
            if (r12 == 0) goto L_0x0453
            boolean r0 = r12.A02
            if (r0 == 0) goto L_0x0453
            r0 = 4443(0x115b, float:6.226E-42)
            boolean r0 = r9.A0E(r0)
            if (r0 == 0) goto L_0x0453
            X.9ti r0 = r12.A00()
            if (r0 == 0) goto L_0x0453
            int r12 = r0.A00
            X.9ua r0 = r0.A01
            if (r0 == 0) goto L_0x0453
            android.content.res.Resources r16 = r7.getResources()
            java.lang.Object[] r14 = X.AnonymousClass001.A0M()
            X.C36431kI.A1O(r14, r12, r2)
            r13 = 1
            X.16U r15 = X.AnonymousClass16W.A04
            X.16X r0 = r0.A02
            java.math.BigDecimal r12 = r0.A00
            r0 = r35
            java.lang.String r15 = r15.B7e(r0, r12)
            r12 = 2131892228(0x7f121804, float:1.9419198E38)
            r0 = r16
            java.lang.String r0 = X.C36411kG.A0w(r0, r15, r14, r13, r12)
            r8.setText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r17)
            if (r0 != 0) goto L_0x0546
            r3.setVisibility(r2)
            r0 = r37
            X.C36331k8.A16(r3, r0)
            X.C36331k8.A1A(r9, r3)
            r0 = r17
            r3.setText(r0)
        L_0x0546:
            r8.setVisibility(r2)
            goto L_0x0453
        L_0x054b:
            r0 = 0
            X.9td r5 = new X.9td
            r5.<init>(r0, r8)
            java.lang.Object r0 = r9.get(r2)
            X.9uJ r0 = (X.C206959uJ) r0
            java.lang.String r1 = r0.A00()
            byte[] r0 = r12.A0N
            X.9tm r3 = new X.9tm
            r3.<init>(r0, r1, r2)
            java.util.List r0 = java.util.Collections.singletonList(r5)
            X.9u1 r1 = new X.9u1
            r1.<init>(r4, r3, r0)
            X.7y7 r0 = r7.A0d
            r3 = r39
            if (r0 != 0) goto L_0x0591
            X.AyL r0 = r7.A0G
            X.9Uf r10 = r0.B3r(r4)
            X.3Ba r0 = r7.A0T
            X.9Dd r9 = r7.A07
            X.9xJ r8 = new X.9xJ
            r11 = r4
            r12 = r0
            r13 = r1
            r8.<init>(r9, r10, r11, r12, r13)
            X.04H r1 = X.C165617ti.A0A(r8, r3)
            java.lang.Class<X.7y7> r0 = X.C167487y7.class
            X.04R r0 = r1.A00(r0)
            X.7y7 r0 = (X.C167487y7) r0
            r7.A0d = r0
        L_0x0591:
            X.00r r2 = r0.A00
            r1 = 8
            X.BAD r0 = new X.BAD
            r0.<init>(r6, r7, r1)
            r2.A08(r3, r0)
            X.7y7 r0 = r7.A0d
            r0.A0S()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2.A02(X.01L, X.0wQ, X.8yt, X.9Oo, java.lang.String, java.util.List, int, int):void");
    }

    public PaymentCheckoutOrderDetailsViewV2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (!this.A0c) {
            this.A0c = true;
            C27861Qc r1 = (C27861Qc) ((C27851Qb) generatedComponent());
            C18800tq r2 = r1.A0M;
            this.A0S = C36341k9.A0V(r2);
            C18830tt r3 = r2.A00;
            this.A0X = C36351kA.A0p(r3);
            this.A0Q = C36351kA.A0W(r2);
            this.A0Z = C36341k9.A0Z(r2);
            this.A0I = (AnonymousClass6VE) r2.A1Q.get();
            this.A0W = C36431kI.A0p(r2);
            this.A0O = C165577te.A0Q(r2);
            this.A0P = C36351kA.A0U(r2);
            this.A0R = C36341k9.A0T(r2);
            this.A0T = C165607th.A0V(r3);
            this.A0Y = (AnonymousClass1SV) r2.A5I.get();
            C27111My r12 = r1.A0L;
            this.A0M = (C196089Xp) r12.A0L.get();
            this.A0L = (C195399Ud) r2.A6o.get();
            this.A0V = C36371kC.A0h(r2);
            this.A0K = C165607th.A0P(r2);
            this.A0N = C36391kE.A0c(r2);
            this.A0U = (AnonymousClass1Z2) r2.AVu.get();
            this.A0H = (AnonymousClass1LB) r2.ADr.get();
            this.A0J = new AnonymousClass9ZJ();
            this.A07 = (C191489Dd) r12.A24.get();
            this.A0G = (C22909AyL) r12.A1Z.get();
        }
        LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this, true);
        this.A06 = (RecyclerView) C012005e.A02(this, R.id.order_detail_recycler_view);
        this.A0E = C36401kF.A0Q(this, R.id.total_key);
        this.A0F = C36401kF.A0Q(this, R.id.total_amount);
        this.A0D = C36401kF.A0Q(this, R.id.installment_info);
        this.A08 = C36401kF.A0O(this, R.id.learn_more_text);
        this.A0B = (WaButtonWithLoader) C012005e.A02(this, R.id.proceed_to_pay_btn);
        this.A0A = (WaButtonWithLoader) C012005e.A02(this, R.id.confirm_pay_btn);
        this.A0a = C36431kI.A0y(this, R.id.not_yet_btn);
        this.A0C = C36401kF.A0Q(this, R.id.expiry_footer);
        this.A01 = C90514aH.A0U(this, R.id.secure_footer);
        this.A09 = C36401kF.A0O(this, R.id.terms_of_services_footer);
        this.A00 = C012005e.A02(this, R.id.shadow_top);
        this.A03 = (RelativeLayout) C012005e.A02(this, R.id.buttons);
        this.A04 = (RelativeLayout) C012005e.A02(this, R.id.payment_button_wrapper);
        this.A02 = (RelativeLayout) C012005e.A02(this, R.id.button_additional_info);
        this.A05 = (RelativeLayout) C012005e.A02(this, R.id.pending_payment_button_wrapper);
    }

    public PaymentCheckoutOrderDetailsViewV2(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PaymentCheckoutOrderDetailsViewV2(Context context) {
        this(context, (AttributeSet) null);
    }
}
