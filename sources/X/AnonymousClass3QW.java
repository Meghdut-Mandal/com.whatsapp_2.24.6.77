package X;

import android.view.View;
import com.whatsapp.ephemeral.EphemeralDmKicBottomSheetDialog;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;

/* renamed from: X.3QW  reason: invalid class name */
public final class AnonymousClass3QW {
    public final C19730wQ A00;
    public final AnonymousClass1NG A01;
    public final C19600wD A02;
    public final C19970wo A03;
    public final AnonymousClass17X A04;
    public final AnonymousClass12O A05;
    public final C28071Rf A06;
    public final C20810yC A07;
    public final AnonymousClass17Y A08;
    public final AnonymousClass16D A09;
    public final C19420v0 A0A;
    public final C62383Fy A0B;
    public final C25361Fz A0C;
    public final C20350xQ A0D;
    public final AnonymousClass1EM A0E;
    public final C19770wU A0F;

    public void A01(View view, C225314u r16, AnonymousClass1X4 r17, AnonymousClass4Q0 r18, AnonymousClass3T1 r19, int i, boolean z) {
        C225314u r7 = r16;
        AnonymousClass1X4 r8 = r17;
        C36331k8.A1G(r7, 2, r8);
        C19420v0 r1 = this.A0A;
        AnonymousClass01z supportFragmentManager = r7.getSupportFragmentManager();
        AnonymousClass00C.A08(supportFragmentManager);
        View view2 = view;
        AnonymousClass4Q0 r9 = r18;
        AnonymousClass3T1 r11 = r19;
        int i2 = i;
        boolean z2 = z;
        if (AnonymousClass3OP.A00(supportFragmentManager, r1)) {
            C62383Fy r4 = this.A0B;
            AnonymousClass01z supportFragmentManager2 = r7.getSupportFragmentManager();
            AnonymousClass00C.A08(supportFragmentManager2);
            AnonymousClass11F r2 = r11.A1J.A00;
            C74273lL r5 = new C74273lL(view2, r7, r8, r9, this, r11, i2, z2);
            int i3 = 7;
            if (z) {
                i3 = 6;
            }
            if (AnonymousClass3OP.A00(supportFragmentManager2, r4.A00)) {
                C36371kC.A1C(r2, supportFragmentManager2, i3);
                EphemeralDmKicBottomSheetDialog.A0N = r5;
                return;
            }
            return;
        }
        A00(r7, view, r8, r9, this, r11, i2, z2);
    }

    public boolean A02(AnonymousClass3T1 r7) {
        GroupJid A0l;
        AnonymousClass00C.A0D(r7, 0);
        if (this.A0C.A00(r7) && !C65453Sc.A03(r7)) {
            AnonymousClass11F r1 = r7.A1J.A00;
            if (AnonymousClass143.A0G(r1) && (A0l = C36441kJ.A0l(r1)) != null) {
                AnonymousClass141 A082 = this.A09.A08(A0l);
                AnonymousClass147 A012 = C65533Sl.A01(A0l);
                if (!(A082 == null || A012 == null)) {
                    if (!this.A0E.A04(A082, A0l) || this.A04.A0D(A0l)) {
                        C20350xQ r2 = this.A0D;
                        if (r2.A0M.A06(A012) == 3) {
                            if (this.A07.A0E(2844)) {
                                Log.i("KeepInChatManager/shouldEnableKeepOption CAG supports keep in chat");
                            }
                        }
                        return r2.A0n(A082, A012);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean A03(AnonymousClass3T1 r10) {
        GroupJid A0l;
        AnonymousClass00C.A0D(r10, 0);
        boolean A002 = this.A0C.A00(r10);
        boolean A032 = C65453Sc.A03(r10);
        if (!A002) {
            return A032;
        }
        if (A032) {
            C64933Qa r8 = r10.A1J;
            AnonymousClass11F r1 = r8.A00;
            if (AnonymousClass143.A0G(r1) && (A0l = C36441kJ.A0l(r1)) != null) {
                AnonymousClass141 A082 = this.A09.A08(A0l);
                AnonymousClass147 A012 = C65533Sl.A01(A0l);
                if (!(A082 == null || A012 == null)) {
                    C20350xQ r2 = this.A0D;
                    if (r2.A0M.A06(A012) != 3 || this.A07.A0E(2844)) {
                        AnonymousClass17X r12 = this.A04;
                        if (!r12.A0D(A0l)) {
                            if (r12.A0C(A0l) && 1 == r10.A0E() && r8.A02) {
                                return true;
                            }
                            if (this.A0E.A04(A082, A0l)) {
                                return false;
                            }
                        }
                        return r2.A0n(A082, A012);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public AnonymousClass3QW(AnonymousClass17Y r7, C19730wQ r8, AnonymousClass1NG r9, C19600wD r10, AnonymousClass16D r11, C19970wo r12, C19420v0 r13, AnonymousClass17X r14, AnonymousClass12O r15, C28071Rf r16, C62383Fy r17, C20810yC r18, C25361Fz r19, C20350xQ r20, AnonymousClass1EM r21, C19770wU r22) {
        C19770wU r0 = r22;
        C20810yC r4 = r18;
        C36321k7.A1B(r12, r4, r7, r8, r0);
        AnonymousClass1EM r1 = r21;
        C20350xQ r2 = r20;
        C36321k7.A1C(r11, r1, r15, r9, r2);
        C25361Fz r3 = r19;
        C62383Fy r5 = r17;
        C36321k7.A1D(r13, r5, r14, r10, r3);
        this.A03 = r12;
        this.A07 = r4;
        this.A08 = r7;
        this.A00 = r8;
        this.A0F = r0;
        this.A09 = r11;
        this.A0E = r1;
        this.A05 = r15;
        this.A01 = r9;
        this.A0D = r2;
        this.A06 = r16;
        this.A0A = r13;
        this.A0B = r5;
        this.A04 = r14;
        this.A02 = r10;
        this.A0C = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b1, code lost:
        if (r0 == false) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c4, code lost:
        if (r0 != false) goto L_0x00c6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0234  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.app.Activity r18, android.view.View r19, X.AnonymousClass1X4 r20, X.AnonymousClass4Q0 r21, X.AnonymousClass3QW r22, X.AnonymousClass3T1 r23, int r24, boolean r25) {
        /*
            r10 = 8
            r6 = 5
            r8 = 4
            r1 = 3
            r7 = 1
            r3 = r18
            r18 = r20
            r2 = r21
            r11 = r22
            r4 = r23
            r9 = r24
            if (r25 == 0) goto L_0x00c9
            java.lang.Long r5 = r4.A0g
            X.6SZ r0 = com.whatsapp.jid.GroupJid.Companion
            X.3Qa r0 = r4.A1J
            X.11F r0 = r0.A00
            r16 = r0
            com.whatsapp.jid.GroupJid r15 = X.AnonymousClass6SZ.A00(r16)
            com.whatsapp.jid.UserJid r12 = X.C36401kF.A0b(r16)
            X.0wQ r13 = r11.A00
            com.whatsapp.jid.UserJid r14 = X.C66013Ui.A07(r13, r4)
            X.0wD r0 = r11.A02
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x006e
            r12 = 1
        L_0x0035:
            X.0wU r5 = r11.A0F
            X.757 r0 = new X.757
            r0.<init>((X.AnonymousClass3QW) r11, (X.AnonymousClass3T1) r4, (int) r12)
            r5.Boy(r0)
            if (r12 == 0) goto L_0x0065
            if (r12 == r7) goto L_0x0287
            if (r12 == r1) goto L_0x0156
            if (r12 == r8) goto L_0x005c
            if (r12 == r6) goto L_0x0153
            if (r12 != r10) goto L_0x005b
            r1 = 607(0x25f, float:8.5E-43)
        L_0x004d:
            java.lang.Class<X.14u> r0 = X.C225314u.class
            android.app.Activity r0 = X.C18860tw.A01(r3, r0)
            if (r0 == 0) goto L_0x0058
            X.AnonymousClass3SJ.A01(r0, r1)
        L_0x0058:
            r2.B2t()
        L_0x005b:
            return
        L_0x005c:
            r1 = 2131890645(0x7f1211d5, float:1.9415988E38)
            r0 = r19
            X.C65453Sc.A01(r3, r0, r1)
            goto L_0x0058
        L_0x0065:
            X.757 r1 = new X.757
            r0 = r18
            r1.<init>((X.AnonymousClass1X4) r0, (X.AnonymousClass3T1) r4, (int) r9)
            goto L_0x014e
        L_0x006e:
            if (r15 == 0) goto L_0x0080
            boolean r0 = X.AnonymousClass143.A0G(r16)
            if (r0 == 0) goto L_0x0080
            X.17X r0 = r11.A04
            boolean r0 = r0.A0E(r15, r14)
            if (r0 != 0) goto L_0x0080
            r12 = 3
            goto L_0x0035
        L_0x0080:
            X.1NG r0 = r11.A01
            boolean r0 = r0.A0O(r12)
            if (r0 == 0) goto L_0x008b
            r12 = 8
            goto L_0x0035
        L_0x008b:
            if (r5 == 0) goto L_0x009b
            long r16 = r5.longValue()
            long r14 = java.lang.System.currentTimeMillis()
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x009b
            r12 = 4
            goto L_0x0035
        L_0x009b:
            X.12O r5 = r11.A05
            r14 = 0
            X.2bc r0 = r4.A1U
            if (r0 == 0) goto L_0x00c6
            com.whatsapp.jid.UserJid r12 = X.C66013Ui.A07(r13, r0)
            com.whatsapp.jid.UserJid r0 = X.C66013Ui.A07(r13, r4)
            if (r12 == 0) goto L_0x00b3
            boolean r0 = r5.A0I(r0, r12)
            r5 = 1
            if (r0 != 0) goto L_0x00b4
        L_0x00b3:
            r5 = 0
        L_0x00b4:
            int r0 = r4.A0E()
            if (r0 != 0) goto L_0x00bb
            r14 = 1
        L_0x00bb:
            boolean r0 = r13.A0M(r12)
            if (r5 == 0) goto L_0x00c6
            if (r14 == 0) goto L_0x00c6
            r12 = 5
            if (r0 == 0) goto L_0x0035
        L_0x00c6:
            r12 = 0
            goto L_0x0035
        L_0x00c9:
            java.lang.Long r13 = r4.A0g
            X.6SZ r0 = com.whatsapp.jid.GroupJid.Companion
            X.3Qa r5 = r4.A1J
            X.11F r0 = r5.A00
            r16 = r0
            com.whatsapp.jid.GroupJid r15 = X.AnonymousClass6SZ.A00(r16)
            com.whatsapp.jid.UserJid r12 = X.C36401kF.A0b(r16)
            X.0wQ r0 = r11.A00
            com.whatsapp.jid.UserJid r14 = X.C66013Ui.A07(r0, r4)
            X.0wD r0 = r11.A02
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x0107
            r12 = 1
        L_0x00ea:
            X.0wU r5 = r11.A0F
            X.3wq r0 = new X.3wq
            r0.<init>((X.AnonymousClass3QW) r11, (X.AnonymousClass3T1) r4, (int) r12)
            r5.Boy(r0)
            if (r12 == 0) goto L_0x0147
            if (r12 == r7) goto L_0x0287
            if (r12 == r1) goto L_0x027e
            if (r12 == r8) goto L_0x015f
            if (r12 == r6) goto L_0x015b
            r0 = 6
            if (r12 == r0) goto L_0x01b9
            if (r12 != r10) goto L_0x005b
            r1 = 608(0x260, float:8.52E-43)
            goto L_0x004d
        L_0x0107:
            if (r15 == 0) goto L_0x0119
            boolean r0 = X.AnonymousClass143.A0G(r16)
            if (r0 == 0) goto L_0x0119
            X.17X r0 = r11.A04
            boolean r0 = r0.A0E(r15, r14)
            if (r0 != 0) goto L_0x0119
            r12 = 3
            goto L_0x00ea
        L_0x0119:
            X.1NG r0 = r11.A01
            boolean r0 = r0.A0O(r12)
            if (r0 == 0) goto L_0x0124
            r12 = 8
            goto L_0x00ea
        L_0x0124:
            X.0yC r12 = r11.A07
            X.0wo r0 = r11.A03
            boolean r0 = X.C65453Sc.A02(r0, r12, r4)
            if (r0 == 0) goto L_0x0130
            r12 = 6
            goto L_0x00ea
        L_0x0130:
            if (r13 == 0) goto L_0x0140
            long r14 = r13.longValue()
            long r12 = java.lang.System.currentTimeMillis()
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x0140
            r12 = 4
            goto L_0x00ea
        L_0x0140:
            boolean r0 = r5.A02
            r12 = 0
            if (r0 == 0) goto L_0x00ea
            r12 = 5
            goto L_0x00ea
        L_0x0147:
            X.3wq r1 = new X.3wq
            r0 = r18
            r1.<init>((X.AnonymousClass1X4) r0, (X.AnonymousClass3T1) r4, (int) r9)
        L_0x014e:
            r5.Boy(r1)
            goto L_0x0058
        L_0x0153:
            X.17Y r9 = r11.A08
            goto L_0x01bc
        L_0x0156:
            r1 = 2131890668(0x7f1211ec, float:1.9416034E38)
            goto L_0x0281
        L_0x015b:
            X.17Y r9 = r11.A08
            r8 = 3
            goto L_0x01bc
        L_0x015f:
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r3)
            r0 = 2131625538(0x7f0e0642, float:1.8878287E38)
            android.view.View r8 = X.C36381kD.A0K(r1, r0)
            X.1qm r1 = X.AnonymousClass3LW.A00(r3)
            r0 = 2131896159(0x7f12275f, float:1.9427171E38)
            r1.A0d(r0)
            r0 = 2131896157(0x7f12275d, float:1.9427167E38)
            r1.A0c(r0)
            r1.A0j(r8)
            X.0FM r7 = X.C36371kC.A0O(r1)
            r0 = 2131428378(0x7f0b041a, float:1.8478399E38)
            android.widget.TextView r6 = X.C36341k9.A0M(r8, r0)
            r0 = 2131428379(0x7f0b041b, float:1.84784E38)
            android.widget.TextView r1 = X.C36341k9.A0M(r8, r0)
            r0 = 2131896158(0x7f12275e, float:1.942717E38)
            r6.setText(r0)
            r0 = 2131102302(0x7f060a5e, float:1.7817038E38)
            X.C36331k8.A0r(r3, r6, r0)
            r15 = 3
            X.3Ya r0 = new X.3Ya
            r13 = r18
            r14 = r4
            r8 = r0
            r9 = r5
            r10 = r3
            r11 = r19
            r12 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r6.setOnClickListener(r0)
            r0 = 2131896389(0x7f122845, float:1.9427638E38)
            r1.setText(r0)
            r0 = 13
            X.AnonymousClass3YG.A00(r1, r2, r7, r0)
            goto L_0x0230
        L_0x01b9:
            X.17Y r9 = r11.A08
            r8 = 2
        L_0x01bc:
            X.3Fy r6 = r11.A0B
            r0 = 2
            if (r8 == r0) goto L_0x0234
            if (r8 == r1) goto L_0x0256
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r3)
            r0 = 2131625323(0x7f0e056b, float:1.887785E38)
            android.view.View r8 = X.C36381kD.A0K(r1, r0)
            r0 = 2131433887(0x7f0b199f, float:1.8489572E38)
            android.widget.TextView r5 = X.C36341k9.A0M(r8, r0)
            r0 = 2131433886(0x7f0b199e, float:1.848957E38)
            android.widget.TextView r4 = X.C36341k9.A0M(r8, r0)
            r0 = 2131431094(0x7f0b0eb6, float:1.8483907E38)
            android.widget.ImageView r1 = X.C36341k9.A0L(r8, r0)
            r0 = 2131890671(0x7f1211ef, float:1.941604E38)
            r5.setText(r0)
            r0 = 2131890670(0x7f1211ee, float:1.9416038E38)
            r4.setText(r0)
            r0 = 2131233062(0x7f080926, float:1.808225E38)
            r1.setImageResource(r0)
            r0 = 2131432196(0x7f0b1304, float:1.8486143E38)
            android.view.View r5 = X.C36361kB.A0G(r8, r0)
            r0 = 2131431149(0x7f0b0eed, float:1.848402E38)
            android.view.View r4 = X.C36361kB.A0G(r8, r0)
            X.1qm r0 = X.AnonymousClass3LW.A00(r3)
            r0.A0j(r8)
            r0.A0r(r7)
            X.0FM r7 = X.C36371kC.A0O(r0)
            r1 = 1
            X.4Yj r0 = new X.4Yj
            r0.<init>(r2, r1)
            r7.setOnDismissListener(r0)
            android.view.Window r1 = r7.getWindow()
            if (r1 == 0) goto L_0x0226
            r0 = 2131102402(0x7f060ac2, float:1.781724E38)
            X.C36341k9.A0r(r3, r1, r0)
        L_0x0226:
            r0 = 39
            X.AnonymousClass3Y0.A01(r5, r7, r0)
            r0 = 43
            X.C67113Yo.A00(r4, r3, r6, r7, r0)
        L_0x0230:
            r7.show()
            return
        L_0x0234:
            X.3VE r1 = new X.3VE
            r6 = r1
            r7 = r3
            r8 = r9
            r9 = r18
            r10 = r4
            r11 = r5
            r6.<init>(r7, r8, r9, r10, r11)
            X.1qm r3 = X.AnonymousClass3LW.A00(r3)
            r0 = 2131888857(0x7f120ad9, float:1.9412361E38)
            r3.A0c(r0)
            r0 = 2131893736(0x7f121de8, float:1.9422257E38)
            r3.A0h(r1, r0)
            r1 = 2131891806(0x7f12165e, float:1.9418342E38)
            r0 = 12
            goto L_0x0277
        L_0x0256:
            X.1qm r3 = X.AnonymousClass3LW.A00(r3)
            r0 = 2131890673(0x7f1211f1, float:1.9416044E38)
            r3.A0c(r0)
            r1 = 2131891806(0x7f12165e, float:1.9418342E38)
            r11 = 4
            X.4XC r0 = new X.4XC
            r6 = r0
            r7 = r2
            r8 = r18
            r9 = r5
            r10 = r4
            r6.<init>(r7, r8, r9, r10, r11)
            r3.A0h(r0, r1)
            r1 = 2131896389(0x7f122845, float:1.9427638E38)
            r0 = 13
        L_0x0277:
            X.C39001qm.A0G(r3, r2, r0, r1)
            X.C36341k9.A11(r3)
            return
        L_0x027e:
            r1 = 2131890669(0x7f1211ed, float:1.9416036E38)
        L_0x0281:
            r0 = r19
            X.C65453Sc.A01(r3, r0, r1)
            return
        L_0x0287:
            X.17Y r1 = r11.A08
            r0 = 2131890646(0x7f1211d6, float:1.941599E38)
            r1.A06(r0, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3QW.A00(android.app.Activity, android.view.View, X.1X4, X.4Q0, X.3QW, X.3T1, int, boolean):void");
    }
}
