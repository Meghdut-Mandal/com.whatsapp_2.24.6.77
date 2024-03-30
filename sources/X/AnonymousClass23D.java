package X;

import android.view.View;
import com.whatsapp.group.ExitGroupsDialogFragment;
import com.whatsapp.jid.UserJid;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.23D  reason: invalid class name */
public class AnonymousClass23D extends C64503Og implements Runnable, AnonymousClass4RS {
    public final int A00;
    public final C24381Cf A01;
    public final C20350xQ A02;
    public final AnonymousClass147 A03;
    public final String A04;
    public final List A05;
    public final boolean A06;

    public void A00(Integer num) {
        C62813Hq r2;
        AnonymousClass2PH A002;
        int i;
        View view;
        if (this instanceof AnonymousClass2VU) {
            C63433Ka r4 = ((AnonymousClass2VU) this).A00;
            if (!r4.A02.isFinishing() && (view = r4.A01) != null) {
                view.postDelayed(new C80253v6(r4, 2), 300);
            }
            C87844Qj r1 = r4.A00;
            if (r1 != null) {
                r1.BU4(AnonymousClass000.A1W(num));
            }
            r4.A00 = null;
        } else if (this instanceof AnonymousClass2VR) {
            AnonymousClass2VR r5 = (AnonymousClass2VR) this;
            AnonymousClass3KY r12 = r5.A00;
            r12.A00.A2t();
            C61703Dc r42 = r12.A01;
            if (r42 == null) {
                return;
            }
            if (num != null) {
                r42.A00(r5.A01, r5.A02, 2);
                return;
            }
            UserJid userJid = r5.A01;
            Integer num2 = r5.A02;
            AnonymousClass00C.A0D(userJid, 1);
            C61993Eh r22 = r42.A02;
            if (r22.A00.A0M(userJid) && num2 != null) {
                int intValue = num2.intValue();
                if (intValue == 3) {
                    r2 = (C62813Hq) r22.A05.getValue();
                    A002 = AnonymousClass2PH.A00(r2);
                    i = 1;
                } else if (intValue == 4) {
                    r2 = (C62813Hq) r22.A05.getValue();
                    A002 = AnonymousClass2PH.A00(r2);
                    i = 4;
                } else {
                    return;
                }
                AnonymousClass2PH.A01(r2, A002, i);
            }
        } else if (this instanceof AnonymousClass2VQ) {
            AnonymousClass2VQ r43 = (AnonymousClass2VQ) this;
            AnonymousClass3KY r13 = r43.A00;
            r13.A00.A2t();
            C61703Dc r3 = r13.A01;
            if (r3 == null) {
                return;
            }
            if (num != null) {
                r3.A00(r43.A01, r43.A02, 1);
            } else {
                AnonymousClass00C.A0D(r43.A01, 1);
            }
        } else if (this instanceof AnonymousClass2VO) {
            AnonymousClass2VO r14 = (AnonymousClass2VO) this;
            r14.A00.A2t();
            r14.A01.run();
        } else if (this instanceof AnonymousClass2VN) {
            ((AnonymousClass2VN) this).A00.A2t();
        } else if (this instanceof AnonymousClass2VP) {
            AnonymousClass2VP r15 = (AnonymousClass2VP) this;
            ExitGroupsDialogFragment exitGroupsDialogFragment = r15.A01;
            C24381Cf r0 = exitGroupsDialogFragment.A08;
            AnonymousClass147 r7 = r15.A02;
            r0.A04(r7, false);
            AnonymousClass17Y r23 = exitGroupsDialogFragment.A00;
            if (r15.A00 != 1) {
                r23.A02();
            }
            if (exitGroupsDialogFragment.A05.A0O("privacy_groupadd", 0) == 0 && exitGroupsDialogFragment.A05.A0V("privacy_tip_exit_group_timestamp") == -1 && exitGroupsDialogFragment.A02.A0E(3995)) {
                C19420v0 r02 = exitGroupsDialogFragment.A05;
                C36341k9.A0x(C19420v0.A00(r02), "privacy_tip_exit_group_jid", r7.user);
                exitGroupsDialogFragment.A05.A1Z("privacy_tip_exit_group_timestamp");
            }
        } else if (this instanceof AnonymousClass2V8) {
            AnonymousClass3OK r24 = ((AnonymousClass2V8) this).A00;
            r24.A06.Bp3(C80243v5.A00(r24, 39));
        } else if (this instanceof AnonymousClass2V9) {
            ((AnonymousClass2V9) this).A00.A0C(num);
        } else if (this instanceof AnonymousClass2VS) {
            AnonymousClass2VS r32 = (AnonymousClass2VS) this;
            if (r32.A03) {
                r32.A01.A00.A0P(C36331k8.A0G(r32.A02), true);
            }
            C87664Pr r25 = r32.A00;
            if (r25 != null) {
                r25.BYk(r32.A02, r32.A04);
            }
        } else if (this instanceof AnonymousClass2VT) {
            AnonymousClass2VT r33 = (AnonymousClass2VT) this;
            if (num != null) {
                C40051uf r26 = r33.A00;
                if (num.intValue() == 406) {
                    r26.A0i.A05(false);
                }
                r26.A0F.A0C(num);
            }
            C36341k9.A19(r33.A00.A0r, false);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00e5, code lost:
        if (r11 != 403) goto L_0x00e7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bou(int r11) {
        /*
            r10 = this;
            boolean r0 = r10 instanceof X.AnonymousClass2VU
            if (r0 == 0) goto L_0x001a
            r4 = r10
            X.2VU r4 = (X.AnonymousClass2VU) r4
            X.3Ka r3 = r4.A00
            X.17Y r2 = r3.A03
            r1 = 36
            X.3wl r0 = new X.3wl
            r0.<init>((java.lang.Object) r3, (int) r11, (int) r1)
            r2.A0H(r0)
            r0 = 0
            r4.A00(r0)
            return
        L_0x001a:
            boolean r0 = r10 instanceof X.AnonymousClass2VT
            if (r0 != 0) goto L_0x0073
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "groupmgr/request failed : "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = " | "
            r1.append(r0)
            X.147 r3 = r10.A03
            r1.append(r3)
            r1.append(r0)
            int r9 = r10.A00
            X.C36351kA.A1R(r1, r9)
            X.3yW r0 = r10.A01
            r0.cancel()
            r0 = 30
            r4 = 404(0x194, float:5.66E-43)
            r5 = 403(0x193, float:5.65E-43)
            r8 = 401(0x191, float:5.62E-43)
            r1 = 0
            if (r9 == r0) goto L_0x00fb
            r0 = 159(0x9f, float:2.23E-43)
            r7 = 3012(0xbc4, float:4.221E-42)
            r6 = 3011(0xbc3, float:4.22E-42)
            r2 = 3010(0xbc2, float:4.218E-42)
            if (r9 == r0) goto L_0x00e3
            r0 = 161(0xa1, float:2.26E-43)
            if (r9 == r0) goto L_0x00d6
            r0 = 213(0xd5, float:2.98E-43)
            if (r9 == r0) goto L_0x00e3
            r0 = 224(0xe0, float:3.14E-43)
            if (r9 == r0) goto L_0x00e3
            r0 = 91
            if (r9 == r0) goto L_0x00c3
            r0 = 92
            if (r9 == r0) goto L_0x00c3
            switch(r9) {
                case 15: goto L_0x007b;
                case 16: goto L_0x010e;
                case 17: goto L_0x00a2;
                default: goto L_0x006d;
            }
        L_0x006d:
            X.1Cf r1 = r10.A01
            r0 = 0
            r1.A04(r3, r0)
        L_0x0073:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r10.A00(r0)
            return
        L_0x007b:
            if (r11 == r8) goto L_0x009d
            r0 = 408(0x198, float:5.72E-43)
            if (r11 == r0) goto L_0x0098
            r0 = 429(0x1ad, float:6.01E-43)
            X.0xQ r2 = r10.A02
            if (r11 == r0) goto L_0x0095
            if (r11 == r5) goto L_0x0091
            r0 = 2013(0x7dd, float:2.821E-42)
            if (r11 == r4) goto L_0x0115
            r0 = 2010(0x7da, float:2.817E-42)
            goto L_0x0115
        L_0x0091:
            r0 = 2012(0x7dc, float:2.82E-42)
            goto L_0x0115
        L_0x0095:
            r0 = 3005(0xbbd, float:4.211E-42)
            goto L_0x0115
        L_0x0098:
            X.0xQ r2 = r10.A02
            r0 = 3007(0xbbf, float:4.214E-42)
            goto L_0x0115
        L_0x009d:
            X.0xQ r2 = r10.A02
            r0 = 2011(0x7db, float:2.818E-42)
            goto L_0x0115
        L_0x00a2:
            if (r11 == r8) goto L_0x00be
            r0 = 406(0x196, float:5.69E-43)
            X.0xQ r2 = r10.A02
            if (r11 == r0) goto L_0x00b6
            if (r11 == r5) goto L_0x00b3
            r0 = 2008(0x7d8, float:2.814E-42)
            if (r11 == r4) goto L_0x0115
            r0 = 2005(0x7d5, float:2.81E-42)
            goto L_0x0115
        L_0x00b3:
            r0 = 2007(0x7d7, float:2.812E-42)
            goto L_0x0115
        L_0x00b6:
            r1 = 2009(0x7d9, float:2.815E-42)
            java.lang.String r0 = r10.A04
            r2.A0T(r1, r0)
            goto L_0x006d
        L_0x00be:
            X.0xQ r2 = r10.A02
            r0 = 2006(0x7d6, float:2.811E-42)
            goto L_0x0115
        L_0x00c3:
            X.0xQ r2 = r10.A02
            if (r11 == r8) goto L_0x00d3
            if (r11 == r5) goto L_0x00d0
            r0 = 2021(0x7e5, float:2.832E-42)
            if (r11 == r4) goto L_0x0115
            r0 = 2018(0x7e2, float:2.828E-42)
            goto L_0x0115
        L_0x00d0:
            r0 = 2020(0x7e4, float:2.83E-42)
            goto L_0x0115
        L_0x00d3:
            r0 = 2019(0x7e3, float:2.829E-42)
            goto L_0x0115
        L_0x00d6:
            if (r11 == r8) goto L_0x00f4
            if (r11 == r5) goto L_0x00ed
            r0 = 405(0x195, float:5.68E-43)
            if (r11 != r0) goto L_0x00e7
            X.0xQ r2 = r10.A02
            r0 = 3014(0xbc6, float:4.224E-42)
            goto L_0x0115
        L_0x00e3:
            if (r11 == r8) goto L_0x00f4
            if (r11 == r5) goto L_0x00ed
        L_0x00e7:
            X.0xQ r0 = r10.A02
            r0.A0T(r7, r1)
            goto L_0x006d
        L_0x00ed:
            X.0xQ r0 = r10.A02
            r0.A0T(r6, r1)
            goto L_0x006d
        L_0x00f4:
            X.0xQ r0 = r10.A02
            r0.A0T(r2, r1)
            goto L_0x006d
        L_0x00fb:
            X.0xQ r2 = r10.A02
            if (r11 == r8) goto L_0x010b
            if (r11 == r5) goto L_0x0108
            r0 = 2017(0x7e1, float:2.826E-42)
            if (r11 == r4) goto L_0x0115
            r0 = 2014(0x7de, float:2.822E-42)
            goto L_0x0115
        L_0x0108:
            r0 = 2016(0x7e0, float:2.825E-42)
            goto L_0x0115
        L_0x010b:
            r0 = 2015(0x7df, float:2.824E-42)
            goto L_0x0115
        L_0x010e:
            X.0xQ r2 = r10.A02
            switch(r11) {
                case 403: goto L_0x0120;
                case 404: goto L_0x011d;
                case 405: goto L_0x011a;
                default: goto L_0x0113;
            }
        L_0x0113:
            r0 = 2022(0x7e6, float:2.833E-42)
        L_0x0115:
            r2.A0T(r0, r1)
            goto L_0x006d
        L_0x011a:
            r0 = 2028(0x7ec, float:2.842E-42)
            goto L_0x0115
        L_0x011d:
            r0 = 2024(0x7e8, float:2.836E-42)
            goto L_0x0115
        L_0x0120:
            r0 = 2023(0x7e7, float:2.835E-42)
            goto L_0x0115
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass23D.Bou(int):void");
    }

    public void run() {
        this.A01.cancel();
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("groupmgr/request success/");
        C36321k7.A1Y(A0u, this.A00);
        A00((Integer) null);
    }

    public AnonymousClass23D(C24381Cf r2, C20350xQ r3, AnonymousClass147 r4, String str, List list, int i, boolean z) {
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = str;
        this.A05 = list;
        this.A00 = i;
        this.A06 = z;
        if (list != null) {
            Arrays.deepToString(list.toArray());
        }
    }
}
