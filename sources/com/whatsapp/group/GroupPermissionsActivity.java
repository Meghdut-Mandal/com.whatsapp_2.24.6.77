package com.whatsapp.group;

import X.AnonymousClass00C;
import X.AnonymousClass143;
import X.AnonymousClass147;
import X.AnonymousClass155;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass17X;
import X.AnonymousClass19A;
import X.AnonymousClass1EM;
import X.AnonymousClass1PF;
import X.AnonymousClass2xY;
import X.B3n;
import X.B7Y;
import X.C165567td;
import X.C18800tq;
import X.C18830tt;
import X.C20350xQ;
import X.C20510xg;
import X.C21010yW;
import X.C220412q;
import X.C22820AwV;
import X.C24381Cf;
import X.C27111My;
import X.C27541Op;
import X.C27561Or;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.grouphistory.xmpp.EnableGroupHistoryProtocolHelper;
import com.whatsapp.jid.UserJid;
import com.whatsapp.reporttoadmin.xmpp.RtaXmppClient;
import java.util.ArrayList;

public final class GroupPermissionsActivity extends AnonymousClass155 implements C22820AwV {
    public AnonymousClass2xY A00;
    public AnonymousClass16D A01;
    public AnonymousClass171 A02;
    public C220412q A03;
    public C24381Cf A04;
    public AnonymousClass1PF A05;
    public AnonymousClass17X A06;
    public C21010yW A07;
    public C20350xQ A08;
    public C27541Op A09;
    public GroupPermissionsLayout A0A;
    public B3n A0B;
    public C20510xg A0C;
    public EnableGroupHistoryProtocolHelper A0D;
    public AnonymousClass147 A0E;
    public AnonymousClass19A A0F;
    public C27561Or A0G;
    public RtaXmppClient A0H;
    public AnonymousClass1EM A0I;
    public boolean A0J;

    public static final void A01(Bundle bundle, GroupPermissionsActivity groupPermissionsActivity) {
        AnonymousClass00C.A0D(bundle, 2);
        boolean z = bundle.getBoolean("is_approve_all_pending_requests");
        B3n b3n = groupPermissionsActivity.A0B;
        if (z) {
            if (b3n == null) {
                throw C36331k8.A0d("viewModel");
            }
            b3n.BUC();
        } else if (b3n == null) {
            throw C36331k8.A0d("viewModel");
        } else {
            b3n.BeR();
        }
    }

    public static final void A07(Bundle bundle, GroupPermissionsActivity groupPermissionsActivity) {
        AnonymousClass00C.A0D(bundle, 2);
        boolean z = bundle.getBoolean("is_approve_all_pending_requests");
        B3n b3n = groupPermissionsActivity.A0B;
        if (z) {
            if (b3n == null) {
                throw C36331k8.A0d("viewModel");
            }
            b3n.BUF();
        } else if (b3n == null) {
            throw C36331k8.A0d("viewModel");
        } else {
            b3n.BeT();
        }
    }

    public static final void A0F(Bundle bundle, GroupPermissionsActivity groupPermissionsActivity) {
        AnonymousClass00C.A0D(bundle, 2);
        boolean z = bundle.getBoolean("clear_all_admin_reviews");
        B3n b3n = groupPermissionsActivity.A0B;
        if (b3n == null) {
            throw C36331k8.A0a();
        }
        b3n.Beq(z);
    }

    public void A2F() {
        if (!this.A0J) {
            this.A0J = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C165567td.A11(r2, this);
            C18830tt r3 = r2.A00;
            C165567td.A0v(r2, r3, this, C36321k7.A05(r2, r3, this));
            this.A03 = C36351kA.A0a(r2);
            this.A07 = C36351kA.A0g(r2);
            this.A0H = C27111My.A3D(A0L);
            this.A0F = C36361kB.A0c(r2);
            this.A01 = C36341k9.A0R(r2);
            this.A02 = C36341k9.A0S(r2);
            this.A0I = C36371kC.A0l(r2);
            this.A08 = (C20350xQ) r2.A3k.get();
            this.A0C = (C20510xg) r2.A3x.get();
            this.A0G = r2.AKA();
            this.A04 = (C24381Cf) r2.A2M.get();
            this.A09 = (C27541Op) r2.A3n.get();
            this.A06 = C36351kA.A0b(r2);
            this.A0D = C27111My.A2L(A0L);
            this.A05 = (AnonymousClass1PF) r2.A3s.get();
            this.A00 = (AnonymousClass2xY) A0L.A0j.get();
        }
    }

    public GroupPermissionsActivity(int i) {
        this.A0J = false;
        B7Y.A00(this, 16);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 17 && intent != null && i2 == -1) {
            ArrayList A062 = AnonymousClass143.A06(UserJid.class, intent.getStringArrayListExtra("jids"));
            B3n b3n = this.A0B;
            if (b3n == null) {
                throw C36331k8.A0a();
            }
            b3n.B6K(this, A062);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onCreate(r7)
            r0 = 2131625118(0x7f0e049e, float:1.8877435E38)
            r6.setContentView((int) r0)
            X.C36321k7.A0O(r6)
            r0 = 2131430674(0x7f0b0d12, float:1.8483056E38)
            android.view.View r0 = X.C36361kB.A0D(r6, r0)
            com.whatsapp.group.GroupPermissionsLayout r0 = (com.whatsapp.group.GroupPermissionsLayout) r0
            r6.A0A = r0
            X.3Sl r2 = X.AnonymousClass147.A01
            android.content.Intent r1 = r6.getIntent()
            java.lang.String r0 = "gid"
            java.lang.String r0 = r1.getStringExtra(r0)
            X.147 r0 = r2.A06(r0)
            r6.A0E = r0
            X.0yC r1 = r6.A0D
            r0 = 6356(0x18d4, float:8.907E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0062
            android.content.Intent r2 = r6.getIntent()
            r1 = 6
            java.lang.String r0 = "entry_point"
            int r0 = r2.getIntExtra(r0, r1)
            X.2OX r2 = new X.2OX
            r2.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A00 = r0
            X.147 r1 = r6.A0E
            if (r1 == 0) goto L_0x005b
            java.lang.String r0 = r1.user
            boolean r0 = X.C65533Sl.A05(r0)
            if (r0 == 0) goto L_0x005b
            java.lang.String r0 = r1.getRawString()
            r2.A01 = r0
        L_0x005b:
            X.0yW r0 = r6.A07
            if (r0 == 0) goto L_0x02d1
            r0.Bly(r2)
        L_0x0062:
            X.147 r2 = r6.A0E
            r0 = 2131890289(0x7f121071, float:1.9415266E38)
            r6.setTitle(r0)
            X.0yC r1 = r6.A0D
            r0 = 7180(0x1c0c, float:1.0061E-41)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0099
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r1 = "group_subject"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L_0x00bb
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r1 = r0.getStringExtra(r1)
        L_0x0088:
            if (r1 == 0) goto L_0x0099
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0099
            androidx.appcompat.widget.Toolbar r0 = X.C36411kG.A0R(r6)
            if (r0 == 0) goto L_0x0099
            r0.setSubtitle((java.lang.CharSequence) r1)
        L_0x0099:
            if (r2 == 0) goto L_0x00c6
            r1 = 11
            X.4ZG r0 = new X.4ZG
            r0.<init>(r6, r2, r1)
            X.04H r1 = X.C165617ti.A0A(r0, r6)
            java.lang.Class<X.1uw> r0 = X.C40111uw.class
            X.04R r0 = r1.A00(r0)
            X.B3n r0 = (X.B3n) r0
            r6.A0B = r0
        L_0x00b0:
            X.B3n r0 = r6.A0B
            java.lang.String r5 = "viewModel"
            if (r0 != 0) goto L_0x00f4
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x00bb:
            if (r2 == 0) goto L_0x00c6
            X.12q r0 = r6.A03
            if (r0 == 0) goto L_0x02ca
            java.lang.String r1 = r0.A0D(r2)
            goto L_0x0088
        L_0x00c6:
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r3 = "setting_values"
            android.os.Bundle r2 = r0.getBundleExtra(r3)
            X.C18740tg.A06(r2)
            r1 = 3
            X.4ZE r0 = new X.4ZE
            r0.<init>(r2, r1)
            X.04H r1 = X.C165617ti.A0A(r0, r6)
            java.lang.Class<X.1uv> r0 = X.C40101uv.class
            X.04R r0 = r1.A00(r0)
            X.B3n r0 = (X.B3n) r0
            r6.A0B = r0
            r1 = -1
            android.content.Intent r0 = X.C36431kI.A0D()
            android.content.Intent r0 = r0.putExtra(r3, r2)
            r6.setResult(r1, r0)
            goto L_0x00b0
        L_0x00f4:
            X.00r r2 = r0.BGh()
            X.Am7 r1 = new X.Am7
            r1.<init>(r6)
            r0 = 14
            X.BA8.A01(r6, r2, r1, r0)
            X.B3n r0 = r6.A0B
            if (r0 != 0) goto L_0x010b
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x010b:
            X.00r r2 = r0.BHX()
            X.Am8 r1 = new X.Am8
            r1.<init>(r6)
            r0 = 19
            X.BA8.A01(r6, r2, r1, r0)
            X.B3n r0 = r6.A0B
            if (r0 != 0) goto L_0x0122
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x0122:
            X.00s r2 = r0.BCy()
            X.Am9 r1 = new X.Am9
            r1.<init>(r6)
            r0 = 22
            X.BA8.A01(r6, r2, r1, r0)
            X.B3n r0 = r6.A0B
            if (r0 != 0) goto L_0x0139
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x0139:
            X.00s r2 = r0.BCz()
            X.AmA r1 = new X.AmA
            r1.<init>(r6)
            r0 = 20
            X.BA8.A01(r6, r2, r1, r0)
            X.B3n r0 = r6.A0B
            if (r0 != 0) goto L_0x0150
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x0150:
            X.00s r2 = r0.BD3()
            X.AmB r1 = new X.AmB
            r1.<init>(r6)
            r0 = 6
            X.BA8.A01(r6, r2, r1, r0)
            X.B3n r0 = r6.A0B
            if (r0 != 0) goto L_0x0166
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x0166:
            X.00s r2 = r0.BCt()
            X.AmC r1 = new X.AmC
            r1.<init>(r6)
            r0 = 11
            X.BA8.A01(r6, r2, r1, r0)
            X.B3n r0 = r6.A0B
            if (r0 != 0) goto L_0x017d
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x017d:
            X.00r r2 = r0.BCs()
            X.AmD r1 = new X.AmD
            r1.<init>(r6)
            r0 = 21
            X.BA8.A01(r6, r2, r1, r0)
            X.B3n r0 = r6.A0B
            if (r0 != 0) goto L_0x0194
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x0194:
            X.00r r2 = r0.B8M()
            X.Alz r1 = new X.Alz
            r1.<init>(r6)
            r0 = 8
            X.BA8.A01(r6, r2, r1, r0)
            X.B3n r0 = r6.A0B
            if (r0 != 0) goto L_0x01ab
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x01ab:
            X.1Rs r2 = r0.BHW()
            X.Am0 r1 = new X.Am0
            r1.<init>(r6)
            r0 = 17
            X.BA8.A01(r6, r2, r1, r0)
            X.B3n r0 = r6.A0B
            if (r0 != 0) goto L_0x01c2
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x01c2:
            X.1Rs r2 = r0.BHY()
            X.Am1 r1 = new X.Am1
            r1.<init>(r6)
            r0 = 9
            X.BA8.A01(r6, r2, r1, r0)
            X.B3n r0 = r6.A0B
            if (r0 != 0) goto L_0x01d9
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x01d9:
            X.00r r2 = r0.BCu()
            X.Am2 r1 = new X.Am2
            r1.<init>(r6)
            r0 = 12
            X.BA8.A01(r6, r2, r1, r0)
            X.B3n r0 = r6.A0B
            if (r0 != 0) goto L_0x01f0
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x01f0:
            X.00r r2 = r0.BD4()
            X.Am3 r1 = new X.Am3
            r1.<init>(r6)
            r0 = 16
            X.BA8.A01(r6, r2, r1, r0)
            X.B3n r0 = r6.A0B
            if (r0 != 0) goto L_0x0207
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x0207:
            X.00r r2 = r0.BCx()
            X.Am4 r1 = new X.Am4
            r1.<init>(r6)
            r0 = 15
            X.BA8.A01(r6, r2, r1, r0)
            X.B3n r0 = r6.A0B
            if (r0 != 0) goto L_0x021e
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x021e:
            X.00r r2 = r0.BD2()
            X.Am5 r1 = new X.Am5
            r1.<init>(r6)
            r0 = 7
            X.BA8.A01(r6, r2, r1, r0)
            X.B3n r0 = r6.A0B
            if (r0 != 0) goto L_0x0234
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x0234:
            X.00r r2 = r0.BD1()
            X.Am6 r1 = new X.Am6
            r1.<init>(r6)
            r0 = 13
            X.BA8.A01(r6, r2, r1, r0)
            X.B3n r0 = r6.A0B
            if (r0 != 0) goto L_0x024b
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x024b:
            X.00r r2 = r0.BCw()
            com.whatsapp.group.GroupPermissionsLayout r1 = r6.A0A
            java.lang.String r4 = "groupPermissionsLayout"
            if (r1 != 0) goto L_0x025a
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r4)
            throw r0
        L_0x025a:
            r0 = 36
            X.97B r0 = X.AnonymousClass97B.A00(r1, r0)
            r3 = 10
            X.BA8.A01(r6, r2, r0, r3)
            X.B3n r0 = r6.A0B
            if (r0 != 0) goto L_0x026e
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x026e:
            X.00r r2 = r0.BCv()
            com.whatsapp.group.GroupPermissionsLayout r1 = r6.A0A
            if (r1 != 0) goto L_0x027b
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r4)
            throw r0
        L_0x027b:
            r0 = 37
            X.97B r1 = X.AnonymousClass97B.A00(r1, r0)
            r0 = 18
            X.BA8.A01(r6, r2, r1, r0)
            com.whatsapp.group.GroupPermissionsLayout r0 = r6.A0A
            if (r0 != 0) goto L_0x028f
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r4)
            throw r0
        L_0x028f:
            r0.setClickEventListener(r6)
            r0 = 2131431368(0x7f0b0fc8, float:1.8484463E38)
            android.view.View r0 = X.C03570Gk.A0B(r6, r0)
            X.C48752hz.A00(r0, r6, r3)
            X.01z r2 = r6.getSupportFragmentManager()
            r0 = 1
            X.BAh r1 = new X.BAh
            r1.<init>(r6, r0)
            java.lang.String r0 = "group_join_request_approve_all_pending_requests"
            r2.A0l(r1, r6, r0)
            X.01z r2 = r6.getSupportFragmentManager()
            r0 = 3
            X.BAh r1 = new X.BAh
            r1.<init>(r6, r0)
            java.lang.String r0 = "group_join_request_group_too_full"
            r2.A0l(r1, r6, r0)
            X.01z r2 = r6.getSupportFragmentManager()
            r0 = 2
            X.BAh r1 = new X.BAh
            r1.<init>(r6, r0)
            java.lang.String r0 = "confirm_clear_admin_reviews_dialog_result"
            r2.A0l(r1, r6, r0)
            return
        L_0x02ca:
            java.lang.String r0 = "chatsCache"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x02d1:
            java.lang.String r0 = "wamRuntime"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.GroupPermissionsActivity.onCreate(android.os.Bundle):void");
    }

    public GroupPermissionsActivity() {
        this(0);
    }
}
