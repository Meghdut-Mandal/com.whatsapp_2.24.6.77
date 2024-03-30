package com.whatsapp.group;

import X.AnonymousClass001;
import X.AnonymousClass143;
import X.AnonymousClass147;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass17X;
import X.AnonymousClass17Y;
import X.AnonymousClass1CR;
import X.AnonymousClass1H2;
import X.C19420v0;
import X.C19600wD;
import X.C19770wU;
import X.C20350xQ;
import X.C20510xg;
import X.C220412q;
import X.C220712t;
import X.C233017y;
import X.C24381Cf;
import X.C36371kC;
import X.C63633Ku;
import android.os.Bundle;
import com.whatsapp.jid.Jid;
import java.util.Set;

public class ExitGroupsDialogFragment extends Hilt_ExitGroupsDialogFragment {
    public AnonymousClass17Y A00;
    public C19600wD A01;
    public AnonymousClass16D A02;
    public AnonymousClass171 A03;
    public C63633Ku A04;
    public C19420v0 A05;
    public C220712t A06;
    public C220412q A07;
    public C24381Cf A08;
    public AnonymousClass17X A09;
    public C233017y A0A;
    public AnonymousClass1H2 A0B;
    public C20350xQ A0C;
    public C20510xg A0D;
    public AnonymousClass1CR A0E;
    public C19770wU A0F;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r2 = X.AnonymousClass147.A01.A06(r5.getRawString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A06(X.AnonymousClass11F r5) {
        /*
            r4 = this;
            r3 = 0
            if (r5 == 0) goto L_0x0021
            java.lang.String r1 = r5.getRawString()
            X.3Sl r0 = X.AnonymousClass147.A01
            X.147 r2 = r0.A06(r1)
            if (r2 == 0) goto L_0x0021
            X.12q r0 = r4.A07
            int r1 = r0.A05(r2)
            r0 = 3
            if (r1 != r0) goto L_0x0021
            X.17X r0 = r4.A09
            boolean r0 = r0.A0D(r2)
            if (r0 == 0) goto L_0x0021
            r3 = 1
        L_0x0021:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.ExitGroupsDialogFragment.A06(X.11F):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = X.AnonymousClass147.A01.A06(r4.getRawString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A07(X.AnonymousClass11F r4) {
        /*
            r3 = this;
            r2 = 0
            if (r4 == 0) goto L_0x0020
            java.lang.String r1 = r4.getRawString()
            X.3Sl r0 = X.AnonymousClass147.A01
            X.147 r1 = r0.A06(r1)
            if (r1 == 0) goto L_0x0020
            X.17X r0 = r3.A09
            boolean r0 = r0.A0I(r1)
            if (r0 == 0) goto L_0x0020
            X.12q r0 = r3.A07
            boolean r0 = r0.A0S(r1)
            if (r0 == 0) goto L_0x0020
            r2 = 1
        L_0x0020:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.ExitGroupsDialogFragment.A07(X.11F):boolean");
    }

    public static ExitGroupsDialogFragment A03(AnonymousClass147 r4, String str, Set set, int i, int i2, boolean z, boolean z2) {
        ExitGroupsDialogFragment exitGroupsDialogFragment = new ExitGroupsDialogFragment();
        Bundle A072 = AnonymousClass001.A07();
        if (set.size() == 1) {
            C36371kC.A1B(A072, (Jid) set.toArray()[0]);
        } else {
            A072.putStringArrayList("selection_jids", AnonymousClass143.A07(set));
        }
        if (r4 != null) {
            A072.putString("parent_of_last_subgroup_jid", r4.getRawString());
        }
        A072.putInt("unsent_count", i);
        A072.putBoolean("report_upsell", z);
        A072.putString("block_spam_flow", str);
        A072.putInt("leave_group_action", i2);
        A072.putBoolean("show_neutral_button", z2);
        exitGroupsDialogFragment.A17(A072);
        return exitGroupsDialogFragment;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008f, code lost:
        if (r7 == null) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0065, code lost:
        if (r7 == null) goto L_0x0067;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A1a(android.os.Bundle r20) {
        /*
            r19 = this;
            r14 = r19
            android.os.Bundle r1 = r14.A0b()
            java.lang.String r0 = "unsent_count"
            r2 = 0
            int r5 = r1.getInt(r0, r2)
            java.lang.String r0 = "jid"
            java.lang.String r7 = r1.getString(r0)
            java.lang.String r0 = "report_upsell"
            boolean r12 = r1.getBoolean(r0, r2)
            java.lang.String r0 = "block_spam_flow"
            java.lang.String r16 = r1.getString(r0)
            java.lang.String r0 = "show_neutral_button"
            r6 = 1
            boolean r11 = r1.getBoolean(r0, r6)
            java.lang.String r0 = "leave_group_action"
            int r17 = r1.getInt(r0, r6)
            java.lang.String r0 = "parent_of_last_subgroup_jid"
            java.lang.String r0 = r1.getString(r0)
            X.3Sl r3 = X.AnonymousClass147.A01
            X.147 r2 = r3.A06(r0)
            if (r7 == 0) goto L_0x018d
            java.util.List r1 = java.util.Collections.singletonList(r7)
        L_0x003e:
            java.lang.Class<X.147> r0 = X.AnonymousClass147.class
            java.util.ArrayList r15 = X.AnonymousClass143.A06(r0, r1)
            X.147 r4 = r3.A06(r7)
            X.11F r7 = X.C36421kH.A0N(r7)
            int r8 = r15.size()
            boolean r9 = r14.A06(r7)
            boolean r3 = r14.A07(r7)
            X.17y r0 = r14.A0A
            X.0yC r1 = r0.A02
            r0 = 1597(0x63d, float:2.238E-42)
            boolean r1 = r1.A0E(r0)
            if (r2 == 0) goto L_0x0067
            r0 = 1
            if (r7 != 0) goto L_0x0068
        L_0x0067:
            r0 = 0
        L_0x0068:
            if (r9 != 0) goto L_0x018a
            if (r3 != 0) goto L_0x018a
            if (r12 != 0) goto L_0x0072
            if (r1 != 0) goto L_0x0072
            if (r0 == 0) goto L_0x018a
        L_0x0072:
            java.lang.String r8 = r14.A05(r7, r2, r5, r8)
        L_0x0076:
            int r3 = r15.size()
            boolean r10 = r14.A06(r7)
            boolean r9 = r14.A07(r7)
            X.17y r0 = r14.A0A
            X.0yC r1 = r0.A02
            r0 = 1597(0x63d, float:2.238E-42)
            boolean r0 = r1.A0E(r0)
            if (r2 == 0) goto L_0x0091
            r1 = 1
            if (r7 != 0) goto L_0x0092
        L_0x0091:
            r1 = 0
        L_0x0092:
            if (r10 != 0) goto L_0x0184
            if (r9 != 0) goto L_0x0184
            if (r12 != 0) goto L_0x009c
            if (r0 != 0) goto L_0x009c
            if (r1 == 0) goto L_0x0184
        L_0x009c:
            X.12q r0 = r14.A07
            boolean r0 = r0.A0O(r7)
            if (r0 == 0) goto L_0x014a
            r0 = 2131888129(0x7f120801, float:1.9410885E38)
        L_0x00a7:
            java.lang.String r2 = r14.A0n(r0)
        L_0x00ab:
            X.1qm r3 = X.AnonymousClass3LW.A05(r14)
            if (r8 == 0) goto L_0x00be
            android.content.Context r1 = r14.A0a()
            X.1H2 r0 = r14.A0B
            java.lang.CharSequence r0 = X.AnonymousClass3UG.A05(r1, r0, r8)
            r3.setTitle(r0)
        L_0x00be:
            android.content.Context r1 = r14.A0a()
            X.1H2 r0 = r14.A0B
            java.lang.CharSequence r5 = X.AnonymousClass3UG.A05(r1, r0, r2)
            r13 = 0
            if (r12 == 0) goto L_0x0146
            X.12q r0 = r14.A07
            boolean r0 = r0.A0O(r7)
            if (r0 != 0) goto L_0x0146
            boolean r0 = r14.A06(r7)
            if (r0 != 0) goto L_0x0146
            android.content.Context r0 = r14.A1D()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131625099(0x7f0e048b, float:1.8877396E38)
            android.view.View r2 = r1.inflate(r0, r13)
            r3.setView(r2)
            r0 = 2131429549(0x7f0b08ad, float:1.8480774E38)
            android.widget.TextView r0 = X.C36391kE.A0O(r2, r0)
            r0.setText(r5)
            r0 = 2131428813(0x7f0b05cd, float:1.8479281E38)
            android.view.View r13 = X.C012005e.A02(r2, r0)
            r0 = 2131428817(0x7f0b05d1, float:1.847929E38)
            android.widget.TextView r1 = X.C36391kE.A0O(r2, r0)
            r0 = 2131893597(0x7f121d5d, float:1.9421975E38)
            r1.setText(r0)
            r0 = 2131428818(0x7f0b05d2, float:1.8479291E38)
            android.widget.TextView r1 = X.C36391kE.A0O(r2, r0)
            r0 = 2131893647(0x7f121d8f, float:1.9422076E38)
            r1.setText(r0)
            r0 = 2131428814(0x7f0b05ce, float:1.8479283E38)
            android.view.View r1 = X.C012005e.A02(r2, r0)
            r0 = 24
            X.AnonymousClass3Y2.A00(r1, r13, r0)
        L_0x0122:
            r3.A0a(r6)
            if (r11 == 0) goto L_0x020e
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.util.Iterator r2 = r15.iterator()
        L_0x012f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0195
            X.11F r1 = X.C36401kF.A0a(r2)
            X.1CR r0 = r14.A0E
            boolean r0 = r0.A0j(r1)
            r6 = r6 & r0
            if (r0 != 0) goto L_0x012f
            r5.add(r1)
            goto L_0x012f
        L_0x0146:
            r3.A0Z(r5)
            goto L_0x0122
        L_0x014a:
            if (r12 == 0) goto L_0x0151
            r0 = 2131889457(0x7f120d31, float:1.9413578E38)
            goto L_0x00a7
        L_0x0151:
            if (r1 == 0) goto L_0x017a
            X.16D r0 = r14.A02
            X.141 r1 = r0.A0D(r7)
            X.16D r0 = r14.A02
            X.141 r5 = r0.A0D(r2)
            r3 = 2131889453(0x7f120d2d, float:1.941357E38)
            java.lang.Object[] r2 = X.AnonymousClass001.A0M()
            X.171 r0 = r14.A03
            java.lang.String r1 = r0.A0H(r1)
            r0 = 0
            r2[r0] = r1
            X.171 r0 = r14.A03
            X.C36361kB.A1F(r0, r5, r2, r6)
            java.lang.String r2 = r14.A0o(r3, r2)
            goto L_0x00ab
        L_0x017a:
            r0 = 2131889459(0x7f120d33, float:1.9413582E38)
            if (r3 != r6) goto L_0x00a7
            r0 = 2131889458(0x7f120d32, float:1.941358E38)
            goto L_0x00a7
        L_0x0184:
            java.lang.String r2 = r14.A05(r7, r2, r5, r3)
            goto L_0x00ab
        L_0x018a:
            r8 = 0
            goto L_0x0076
        L_0x018d:
            java.lang.String r0 = "selection_jids"
            java.util.ArrayList r1 = r1.getStringArrayList(r0)
            goto L_0x003e
        L_0x0195:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            android.util.Pair r1 = X.C36441kJ.A0Q(r0, r5)
            java.lang.Object r0 = r1.first
            boolean r2 = X.AnonymousClass000.A1X(r0)
            java.lang.Object r5 = r1.second
            X.0v0 r1 = r14.A05
            boolean r0 = r1.A2F()
            if (r0 == 0) goto L_0x01d3
            boolean r0 = r1.A2G()
            if (r0 != 0) goto L_0x01d3
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            java.util.Iterator r5 = r15.iterator()
            r2 = 1
        L_0x01bc:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x01db
            X.11F r1 = X.C36401kF.A0a(r5)
            X.12q r0 = r14.A07
            boolean r0 = r0.A0N(r1)
            r2 = r2 & r0
            if (r0 != 0) goto L_0x01bc
            r6.add(r1)
            goto L_0x01bc
        L_0x01d3:
            if (r2 != 0) goto L_0x020e
            r2 = 2131891196(0x7f1213fc, float:1.9417105E38)
            r1 = 17
            goto L_0x0206
        L_0x01db:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            android.util.Pair r1 = X.C36441kJ.A0Q(r0, r6)
            java.lang.Object r0 = r1.first
            boolean r0 = X.AnonymousClass000.A1X(r0)
            java.lang.Object r5 = r1.second
            if (r0 != 0) goto L_0x020e
            boolean r0 = r14.A06(r4)
            if (r0 != 0) goto L_0x0255
            boolean r0 = r14.A07(r4)
            if (r0 != 0) goto L_0x0255
            X.12q r0 = r14.A07
            boolean r0 = r0.A0O(r4)
            if (r0 != 0) goto L_0x0255
            r2 = 2131886510(0x7f1201ae, float:1.94076E38)
            r1 = 16
        L_0x0206:
            X.4Xp r0 = new X.4Xp
            r0.<init>(r5, r14, r1)
            r3.A0g(r0, r2)
        L_0x020e:
            boolean r0 = r14.A06(r4)
            if (r0 != 0) goto L_0x024f
            boolean r0 = r14.A07(r4)
            if (r0 != 0) goto L_0x024f
            X.12q r0 = r14.A07
            boolean r0 = r0.A0O(r4)
            if (r0 == 0) goto L_0x0234
            r2 = 2131891806(0x7f12165e, float:1.9418342E38)
            r1 = 16
        L_0x0227:
            X.4XN r0 = new X.4XN
            r0.<init>(r14, r1)
            r3.setPositiveButton(r2, r0)
        L_0x022f:
            X.0FM r0 = r3.create()
            return r0
        L_0x0234:
            r2 = 2131896389(0x7f122845, float:1.9427638E38)
            r1 = 17
            X.4XN r0 = new X.4XN
            r0.<init>(r14, r1)
            r3.setNegativeButton(r2, r0)
            r0 = 2131889440(0x7f120d20, float:1.9413544E38)
            r18 = 1
            X.4X8 r12 = new X.4X8
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r3.setPositiveButton(r0, r12)
            goto L_0x022f
        L_0x024f:
            r2 = 2131896389(0x7f122845, float:1.9427638E38)
            r1 = 15
            goto L_0x0227
        L_0x0255:
            r2 = 2131886510(0x7f1201ae, float:1.94076E38)
            r1 = 16
            X.4Xp r0 = new X.4Xp
            r0.<init>(r5, r14, r1)
            r3.setNegativeButton(r2, r0)
            goto L_0x020e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.ExitGroupsDialogFragment.A1a(android.os.Bundle):android.app.Dialog");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (r8 == null) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String A05(X.AnonymousClass11F r8, X.AnonymousClass147 r9, int r10, int r11) {
        /*
            r7 = this;
            boolean r0 = r7.A06(r8)
            if (r0 == 0) goto L_0x000e
            r0 = 2131888129(0x7f120801, float:1.9410885E38)
        L_0x0009:
            java.lang.String r0 = r7.A0n(r0)
        L_0x000d:
            return r0
        L_0x000e:
            boolean r0 = r7.A07(r8)
            if (r0 == 0) goto L_0x0018
            r0 = 2131888051(0x7f1207b3, float:1.9410726E38)
            goto L_0x0009
        L_0x0018:
            if (r9 == 0) goto L_0x001d
            r0 = 1
            if (r8 != 0) goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            r4 = 0
            r6 = 1
            if (r0 == 0) goto L_0x0034
            X.12q r0 = r7.A07
            boolean r0 = r0.A0O(r8)
            if (r0 != 0) goto L_0x0034
            if (r10 != 0) goto L_0x0073
            r0 = 2131889454(0x7f120d2e, float:1.9413572E38)
            java.lang.String r0 = r7.A0n(r0)
            return r0
        L_0x0034:
            if (r8 == 0) goto L_0x004d
            X.16D r0 = r7.A02
            X.141 r5 = r0.A0D(r8)
            if (r10 != 0) goto L_0x007f
            r2 = 2131889460(0x7f120d34, float:1.9413584E38)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            X.171 r0 = r7.A03
            X.C36361kB.A1F(r0, r5, r1, r4)
            java.lang.String r0 = r7.A0o(r2, r1)
            return r0
        L_0x004d:
            android.content.res.Resources r1 = X.C36341k9.A0G(r7)
            r0 = 2131755026(0x7f100012, float:1.914092E38)
            java.lang.String r0 = X.C36321k7.A0B(r1, r11, r4, r0)
            if (r10 <= 0) goto L_0x000d
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0v(r0)
            java.lang.String r0 = "\n"
            r2.append(r0)
            android.content.res.Resources r1 = X.C36341k9.A0G(r7)
            r0 = 2131755397(0x7f100185, float:1.9141672E38)
            java.lang.String r0 = X.C36321k7.A0B(r1, r10, r4, r0)
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r2)
            return r0
        L_0x0073:
            android.content.res.Resources r1 = X.C36341k9.A0G(r7)
            r0 = 2131755114(0x7f10006a, float:1.9141098E38)
            java.lang.String r0 = X.C36321k7.A0B(r1, r10, r4, r0)
            return r0
        L_0x007f:
            android.content.res.Resources r3 = X.C36341k9.A0G(r7)
            r2 = 2131755115(0x7f10006b, float:1.91411E38)
            java.lang.Object[] r1 = X.AnonymousClass001.A0M()
            X.171 r0 = r7.A03
            X.C36361kB.A1F(r0, r5, r1, r4)
            X.AnonymousClass000.A1L(r1, r10, r6)
            java.lang.String r0 = r3.getQuantityString(r2, r10, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.ExitGroupsDialogFragment.A05(X.11F, X.147, int, int):java.lang.String");
    }
}
