package X;

import java.util.Iterator;
import java.util.Set;

/* renamed from: X.3SH  reason: invalid class name */
public abstract class AnonymousClass3SH {
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (X.C64933Qa.A04(r1) == false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A01(android.content.Context r7, X.AnonymousClass16D r8, X.AnonymousClass171 r9, X.AnonymousClass11F r10, java.util.Collection r11) {
        /*
            r4 = 0
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x0008
            return r4
        L_0x0008:
            if (r10 == 0) goto L_0x002b
            X.141 r3 = r8.A0D(r10)
        L_0x000e:
            java.util.Iterator r0 = r11.iterator()
            X.3T1 r1 = X.C36391kE.A0l(r0)
            r6 = 0
            r5 = 1
            if (r1 == 0) goto L_0x0021
            boolean r0 = X.C64933Qa.A04(r1)
            r2 = 1
            if (r0 != 0) goto L_0x0022
        L_0x0021:
            r2 = 0
        L_0x0022:
            int r0 = r11.size()
            if (r0 != r5) goto L_0x006d
            if (r1 != 0) goto L_0x002d
            return r4
        L_0x002b:
            r3 = r4
            goto L_0x000e
        L_0x002d:
            X.3Qa r0 = r1.A1J
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0060
            if (r3 == 0) goto L_0x0060
            boolean r0 = r3.A0G()
            if (r0 == 0) goto L_0x0052
            X.11F r0 = r1.A0J()
            if (r0 == 0) goto L_0x005d
            java.lang.String r1 = X.C36381kD.A0u(r8, r9, r0)
        L_0x0045:
            r0 = 2131888712(0x7f120a48, float:1.9412067E38)
            if (r2 == 0) goto L_0x004d
            r0 = 2131888713(0x7f120a49, float:1.941207E38)
        L_0x004d:
            java.lang.String r0 = X.C36351kA.A0w(r7, r1, r5, r0)
            return r0
        L_0x0052:
            java.lang.String r0 = r9.A0H(r3)
            if (r0 == 0) goto L_0x005d
            java.lang.String r1 = r9.A0H(r3)
            goto L_0x0045
        L_0x005d:
            java.lang.String r1 = ""
            goto L_0x0045
        L_0x0060:
            r0 = 2131888714(0x7f120a4a, float:1.9412071E38)
            if (r2 == 0) goto L_0x0068
            r0 = 2131888715(0x7f120a4b, float:1.9412073E38)
        L_0x0068:
            java.lang.String r0 = r7.getString(r0)
            return r0
        L_0x006d:
            r4 = 2131755067(0x7f10003b, float:1.9141003E38)
            if (r2 == 0) goto L_0x0075
            r4 = 2131755068(0x7f10003c, float:1.9141005E38)
        L_0x0075:
            android.content.res.Resources r3 = r7.getResources()
            int r2 = r11.size()
            java.lang.Object[] r1 = new java.lang.Object[r5]
            int r0 = r11.size()
            X.AnonymousClass000.A1L(r1, r0, r6)
            java.lang.String r0 = r3.getQuantityString(r4, r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3SH.A01(android.content.Context, X.16D, X.171, X.11F, java.util.Collection):java.lang.String");
    }

    public static void A02(AnonymousClass1DW r6, C21010yW r7, AnonymousClass17V r8, AnonymousClass1AW r9, AnonymousClass1EO r10, Set set, int i) {
        if (!set.isEmpty()) {
            Iterator it = set.iterator();
            AnonymousClass3T1 r2 = null;
            AnonymousClass3T1 r5 = null;
            int i2 = -1;
            while (true) {
                if (!it.hasNext()) {
                    r2 = r5;
                    break;
                }
                AnonymousClass3T1 A0l = C36391kE.A0l(it);
                if (i2 == -1) {
                    i2 = A0l.A1I;
                    r5 = A0l;
                }
                if (i2 != A0l.A1I) {
                    break;
                }
            }
            Iterator it2 = set.iterator();
            AnonymousClass11F r3 = null;
            while (it2.hasNext()) {
                AnonymousClass3T1 A0l2 = C36391kE.A0l(it2);
                if (r3 == null) {
                    r3 = A0l2.A1J.A00;
                } else if (!C64933Qa.A05(A0l2, r3)) {
                    return;
                }
            }
            if (r3 != null) {
                C45322Qx r1 = new C45322Qx();
                r1.A01 = Integer.valueOf(i);
                r1.A00 = Boolean.valueOf(AnonymousClass143.A0G(r3));
                r1.A03 = C36441kJ.A0y(set.size());
                r1.A04 = r8.A03(r3.getRawString());
                if (r2 != null) {
                    r1.A02 = Integer.valueOf(C55802vD.A00(r6, r2, r9, r10));
                }
                r7.Bly(r1);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00fc, code lost:
        if (r0.A0L() == false) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0113, code lost:
        if (((X.AnonymousClass1HX) r45.A02()).A07(r9) == false) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x016f, code lost:
        if (r0.longValue() < r15) goto L_0x0171;
     */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x026f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01ca A[EDGE_INSN: B:160:0x01ca->B:111:0x01ca ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass0FM A00(android.content.Context r44, X.C19460v5 r45, X.C88304Se r46, X.C87444Ov r47, X.C87454Ow r48, X.AnonymousClass17Y r49, X.AnonymousClass1X4 r50, X.AnonymousClass16D r51, X.AnonymousClass185 r52, X.AnonymousClass171 r53, X.C235618y r54, X.C19970wo r55, X.C19420v0 r56, X.C18820ts r57, X.C220412q r58, X.AnonymousClass17X r59, X.AnonymousClass1DW r60, X.AnonymousClass1H2 r61, X.C20810yC r62, X.C21010yW r63, X.AnonymousClass17V r64, X.AnonymousClass1EL r65, X.AnonymousClass1CF r66, X.AnonymousClass3O0 r67, X.AnonymousClass1AW r68, X.AnonymousClass1EO r69, X.C19770wU r70, java.lang.String r71, java.util.Set r72, boolean r73) {
        /*
            r40 = r72
            boolean r0 = r40.isEmpty()
            if (r0 == 0) goto L_0x000f
            java.lang.String r0 = "dialog/delete no messages"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 0
            return r0
        L_0x000f:
            java.util.Iterator r0 = r40.iterator()
            X.11F r0 = X.C64933Qa.A02(r0)
            boolean r0 = r0 instanceof X.C28981Uw
            boolean r24 = X.C36431kI.A1Q(r0)
            if (r73 == 0) goto L_0x0033
            java.util.Iterator r1 = r40.iterator()
        L_0x0023:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01ae
            X.3T1 r0 = X.C36391kE.A0l(r1)
            if (r0 == 0) goto L_0x0023
            X.9lY r0 = r0.A0M
            if (r0 == 0) goto L_0x0023
        L_0x0033:
            r23 = 0
        L_0x0035:
            r12 = r55
            long r21 = X.C19970wo.A00(r12)
            java.util.HashSet r10 = X.C36441kJ.A16()
            java.util.Iterator r20 = r40.iterator()
            r2 = r21
            r11 = 0
            r19 = 0
            r18 = 0
            r34 = 0
            r7 = 0
            r6 = 0
            r39 = 0
        L_0x0050:
            boolean r0 = r20.hasNext()
            r8 = r62
            if (r0 == 0) goto L_0x01ca
            X.3T1 r9 = X.C36391kE.A0l(r20)
            X.3Qa r1 = r9.A1J
            X.11F r5 = r1.A00
            if (r34 != 0) goto L_0x0064
            r34 = r5
        L_0x0064:
            r10.add(r5)
            if (r19 != 0) goto L_0x0088
            int r4 = r9.A1I
            boolean r0 = X.C66013Ui.A0K(r4)
            if (r0 != 0) goto L_0x0077
            boolean r0 = X.C66013Ui.A0J(r4)
            if (r0 == 0) goto L_0x0088
        L_0x0077:
            r0 = r9
            X.2bU r0 = (X.AnonymousClass2bU) r0
            java.io.File r0 = X.AnonymousClass2bU.A01(r0)
            if (r0 == 0) goto L_0x0088
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0088
            r19 = 1
        L_0x0088:
            if (r18 != 0) goto L_0x0099
            boolean r0 = r9 instanceof X.AnonymousClass2bU
            if (r0 == 0) goto L_0x0099
            r0 = r9
            X.2bU r0 = (X.AnonymousClass2bU) r0
            boolean r0 = X.C66013Ui.A0y(r0)
            if (r0 != 0) goto L_0x0099
            r18 = 1
        L_0x0099:
            if (r5 == 0) goto L_0x01ab
            r0 = r51
            X.141 r4 = r0.A0D(r5)
        L_0x00a1:
            boolean r13 = r1.A02
            if (r13 != 0) goto L_0x00a7
            int r11 = r11 + 1
        L_0x00a7:
            boolean r15 = X.AnonymousClass143.A0G(r5)
            r1 = r59
            if (r15 == 0) goto L_0x01a7
            X.147 r0 = X.C65533Sl.A02(r5)
            boolean r0 = r1.A0D(r0)
            if (r0 == 0) goto L_0x01a7
            r0 = 1
            if (r11 != r0) goto L_0x01a7
            r17 = 1
            r11 = 1
            com.whatsapp.jid.UserJid[] r14 = new com.whatsapp.jid.UserJid[r0]
            com.whatsapp.jid.UserJid r7 = r9.A0L()
            r0 = 0
            r14[r0] = r7
            java.util.ArrayList r7 = X.AnonymousClass6XV.newArrayList(r14)
            r0 = -1
            r14 = r53
            java.lang.String r39 = r14.A0X(r7, r0)
            r7 = 1
        L_0x00d4:
            if (r13 == 0) goto L_0x01a3
            if (r15 == 0) goto L_0x00e2
            X.147 r0 = X.C65533Sl.A02(r5)
            boolean r0 = r1.A0C(r0)
            if (r0 == 0) goto L_0x01a3
        L_0x00e2:
            r16 = 1
            int r6 = r6 + 1
        L_0x00e6:
            boolean r1 = r5 instanceof X.C28981Uw
            if (r16 != 0) goto L_0x0102
            if (r1 == 0) goto L_0x0102
            r0 = r58
            X.3Qp r0 = X.C36371kC.A0W(r0, r5)
            X.2La r0 = (X.C44072La) r0
            if (r0 == 0) goto L_0x00fe
            boolean r0 = r0.A0L()
            r16 = 1
            if (r0 != 0) goto L_0x0100
        L_0x00fe:
            r16 = 0
        L_0x0100:
            int r6 = r6 + 1
        L_0x0102:
            boolean r0 = r45.A05()
            if (r0 == 0) goto L_0x0115
            java.lang.Object r0 = r45.A02()
            X.1HX r0 = (X.AnonymousClass1HX) r0
            boolean r0 = r0.A07(r9)
            r15 = 1
            if (r0 != 0) goto L_0x0116
        L_0x0115:
            r15 = 0
        L_0x0116:
            if (r1 == 0) goto L_0x0195
            boolean r13 = X.C65903Tx.A05(r12, r9)
        L_0x011c:
            long r0 = r9.A0I
            long r2 = java.lang.Math.min(r0, r2)
            if (r23 == 0) goto L_0x0171
            if (r16 != 0) goto L_0x012a
            if (r17 != 0) goto L_0x012a
            if (r15 == 0) goto L_0x0171
        L_0x012a:
            boolean r0 = X.C66013Ui.A0n(r9)
            if (r0 != 0) goto L_0x0171
            if (r13 == 0) goto L_0x0171
            X.11F r0 = r9.A0J()
            boolean r0 = r0 instanceof X.C177618e5
            if (r0 != 0) goto L_0x0171
            if (r4 == 0) goto L_0x0144
            r0 = r65
            boolean r0 = r0.A01(r4)
            if (r0 != 0) goto L_0x0171
        L_0x0144:
            r0 = r66
            boolean r0 = r0.A02(r5)
            if (r0 != 0) goto L_0x0171
            com.whatsapp.jid.UserJid r4 = X.C36401kF.A0b(r5)
            r5 = r52
            boolean r0 = r5.A04(r4)
            if (r0 != 0) goto L_0x0171
            long r15 = X.C19970wo.A00(r12)
            int r0 = r9.A05
            boolean r0 = X.AnonymousClass000.A1R(r0)
            if (r0 == 0) goto L_0x0175
            java.lang.Long r0 = r9.A0g
            X.C18740tg.A06(r0)
            long r13 = r0.longValue()
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x0175
        L_0x0171:
            r23 = 0
            goto L_0x0050
        L_0x0175:
            X.3U1 r1 = new X.3U1
            r0 = r54
            r1.<init>((X.AnonymousClass185) r5, (X.C235618y) r0, (com.whatsapp.jid.UserJid) r4)
            r0 = 5968(0x1750, float:8.363E-42)
            boolean r0 = r8.A0E(r0)
            if (r0 == 0) goto L_0x0191
            boolean r0 = r1.A05()
            if (r0 != 0) goto L_0x0171
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0191
            goto L_0x0171
        L_0x0191:
            r23 = 1
            goto L_0x0050
        L_0x0195:
            long r0 = r9.A0I
            r13 = 216000000(0xcdfe600, double:1.067181795E-315)
            long r0 = r0 + r13
            int r13 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            boolean r13 = X.AnonymousClass000.A1R(r13)
            goto L_0x011c
        L_0x01a3:
            r16 = 0
            goto L_0x00e6
        L_0x01a7:
            r17 = 0
            goto L_0x00d4
        L_0x01ab:
            r4 = 0
            goto L_0x00a1
        L_0x01ae:
            java.util.Iterator r2 = r40.iterator()
        L_0x01b2:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01c6
            X.3T1 r0 = X.C36391kE.A0l(r2)
            if (r0 == 0) goto L_0x01b2
            int r1 = r0.A1I
            r0 = 90
            if (r1 != r0) goto L_0x01b2
            goto L_0x0033
        L_0x01c6:
            r23 = 1
            goto L_0x0035
        L_0x01ca:
            r38 = 0
            r30 = r56
            if (r23 == 0) goto L_0x01e7
            r4 = 1
            if (r7 < r4) goto L_0x02d0
            android.content.SharedPreferences r1 = X.C36341k9.A0E(r30)
            java.lang.String r0 = "pref_revoke_admin_nux"
            boolean r0 = r1.getBoolean(r0, r4)
            if (r6 < r4) goto L_0x02ca
            if (r0 == 0) goto L_0x01e7
            r0 = 24
        L_0x01e3:
            java.lang.Integer r38 = java.lang.Integer.valueOf(r0)
        L_0x01e7:
            r9 = r44
            X.1qm r3 = X.AnonymousClass3LW.A00(r9)
            if (r19 == 0) goto L_0x02c6
            if (r18 == 0) goto L_0x02c6
            android.content.SharedPreferences r1 = X.C36341k9.A0E(r30)
            java.lang.String r0 = "pref_delete_media"
            r11 = 1
            boolean r5 = r1.getBoolean(r0, r11)
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r9)
            r1 = 2131624787(0x7f0e0353, float:1.8876764E38)
            r0 = 0
            android.view.View r4 = X.C36361kB.A0E(r2, r0, r1)
            r0 = 2131429469(0x7f0b085d, float:1.8480612E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.CheckBox r0 = (android.widget.CheckBox) r0
            int r2 = r10.size()
            r1 = 2131888731(0x7f120a5b, float:1.9412106E38)
            if (r2 != r11) goto L_0x021d
            r1 = 2131888732(0x7f120a5c, float:1.9412108E38)
        L_0x021d:
            r0.setText(r1)
            r0.setChecked(r5)
            r3.setView(r4)
        L_0x0226:
            r1 = r71
            r2 = r61
            java.lang.CharSequence r1 = X.AnonymousClass3UG.A05(r9, r2, r1)
            r3.A0Z(r1)
            r1 = 1703(0x6a7, float:2.386E-42)
            boolean r62 = r8.A0E(r1)
            r43 = 0
            X.3VO r2 = new X.3VO
            r29 = r50
            r28 = r48
            r4 = r46
            r52 = r57
            r59 = r70
            r37 = r69
            r36 = r68
            r33 = r64
            r32 = r63
            r31 = r60
            r44 = r2
            r45 = r0
            r51 = r30
            r53 = r31
            r54 = r8
            r55 = r32
            r56 = r33
            r57 = r36
            r58 = r37
            r60 = r40
            r61 = r5
            r44.<init>(r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62)
            r8 = 1
            X.4XL r1 = X.AnonymousClass4XL.A00(r4, r8)
            if (r23 == 0) goto L_0x02bf
            if (r0 == 0) goto L_0x0279
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L_0x0279
            r43 = 1
        L_0x0279:
            X.3VP r10 = new X.3VP
            r35 = r67
            r25 = r10
            r26 = r9
            r27 = r4
            r41 = r7
            r42 = r6
            r44 = r5
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
            java.util.Iterator r0 = r40.iterator()
            X.11F r0 = X.C64933Qa.A02(r0)
            boolean r0 = X.C197029b1.A00(r0)
            if (r0 != 0) goto L_0x02a0
            r0 = 2131893735(0x7f121de7, float:1.9422255E38)
            r3.setPositiveButton(r0, r10)
        L_0x02a0:
            if (r24 == 0) goto L_0x02a8
            r0 = 2131893736(0x7f121de8, float:1.9422257E38)
            r3.setNegativeButton(r0, r2)
        L_0x02a8:
            r0 = 2131896389(0x7f122845, float:1.9427638E38)
            r3.A0g(r1, r0)
        L_0x02ae:
            r3.A0a(r8)
            r1 = 0
            X.4XV r0 = new X.4XV
            r0.<init>(r4, r1)
            r3.A0N(r0)
            X.0FM r0 = r3.create()
            return r0
        L_0x02bf:
            r0 = 2131893736(0x7f121de8, float:1.9422257E38)
            X.C36401kF.A11(r2, r1, r3, r0)
            goto L_0x02ae
        L_0x02c6:
            r0 = 0
            r5 = 0
            goto L_0x0226
        L_0x02ca:
            if (r0 == 0) goto L_0x01e7
            r0 = 23
            goto L_0x01e3
        L_0x02d0:
            long r11 = X.C19970wo.A00(r12)
            long r11 = r11 - r2
            r1 = 4096000(0x3e8000, double:2.023693E-317)
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x02ea
            android.content.SharedPreferences r1 = X.C36341k9.A0E(r30)
            java.lang.String r0 = "pref_revoke_sender_nux"
            boolean r0 = r1.getBoolean(r0, r4)
            if (r0 != 0) goto L_0x02ea
            goto L_0x01e7
        L_0x02ea:
            android.content.SharedPreferences r1 = X.C36341k9.A0E(r30)
            java.lang.String r0 = "pref_revoke_sender_nux_v2"
            boolean r0 = r1.getBoolean(r0, r4)
            if (r0 == 0) goto L_0x01e7
            r0 = 19
            if (r6 != r4) goto L_0x01e3
            r0 = 25
            goto L_0x01e3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3SH.A00(android.content.Context, X.0v5, X.4Se, X.4Ov, X.4Ow, X.17Y, X.1X4, X.16D, X.185, X.171, X.18y, X.0wo, X.0v0, X.0ts, X.12q, X.17X, X.1DW, X.1H2, X.0yC, X.0yW, X.17V, X.1EL, X.1CF, X.3O0, X.1AW, X.1EO, X.0wU, java.lang.String, java.util.Set, boolean):X.0FM");
    }
}
