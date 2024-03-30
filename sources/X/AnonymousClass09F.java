package X;

import android.os.ConditionVariable;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.push.RegistrationIntentService;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.09F  reason: invalid class name */
public class AnonymousClass09F implements AnonymousClass191 {
    public boolean A00;
    public boolean A01;
    public final AnonymousClass1C4 A02;
    public final C19460v5 A03;
    public final C19460v5 A04;
    public final C26861Lu A05;
    public final AnonymousClass17Y A06;
    public final C19730wQ A07;
    public final AnonymousClass1DT A08;
    public final C24041Av A09;
    public final C24361Cd A0A;
    public final C29911Yl A0B;
    public final AnonymousClass196 A0C;
    public final AnonymousClass16D A0D;
    public final AnonymousClass16I A0E;
    public final C20430xY A0F;
    public final AnonymousClass1Y3 A0G;
    public final AnonymousClass1YX A0H;
    public final AnonymousClass1G5 A0I;
    public final AnonymousClass1MP A0J;
    public final C19630wG A0K;
    public final C19420v0 A0L;
    public final C30041Yz A0M;
    public final AnonymousClass1YG A0N;
    public final AnonymousClass1E3 A0O;
    public final AnonymousClass1C7 A0P;
    public final C29821Yc A0Q;
    public final AnonymousClass1A5 A0R;
    public final C20310xM A0S;
    public final AnonymousClass16J A0T;
    public final C28291Sb A0U;
    public final AnonymousClass1TV A0V;
    public final C230416y A0W;
    public final AnonymousClass12O A0X;
    public final AnonymousClass1DW A0Y;
    public final C20810yC A0Z;
    public final AnonymousClass17E A0a;
    public final AnonymousClass1P5 A0b;
    public final C24811Dw A0c;
    public final C29921Yn A0d;
    public final C29841Ye A0e;
    public final AnonymousClass1ST A0f;
    public final C29631Xj A0g;
    public final AnonymousClass1Y2 A0h;
    public final AnonymousClass1MT A0i;
    public final AnonymousClass1DL A0j;
    public final C20280xJ A0k;
    public final AnonymousClass1Z3 A0l;
    public final C28361Si A0m;
    public final AnonymousClass1J1 A0n;
    public final AnonymousClass1TF A0o;
    public final C30021Yx A0p;
    public final C29931Yo A0q;
    public final C29151Vn A0r;
    public final C29811Yb A0s;
    public final C27361Nx A0t;
    public final C24551Cw A0u;
    public final AnonymousClass1FO A0v;
    public final AnonymousClass1AW A0w;
    public final AnonymousClass1EO A0x;
    public final AnonymousClass1YU A0y;
    public final C29901Yk A0z;
    public final C23981Ap A10;
    public final AnonymousClass1A1 A11;
    public final C28081Rg A12;
    public final AnonymousClass1Q0 A13;
    public final C29831Yd A14;
    public final AnonymousClass1GX A15;
    public final C19770wU A16;
    public final AnonymousClass005 A17;
    public final AnonymousClass005 A18;
    public final AnonymousClass005 A19;
    public final AnonymousClass005 A1A;

    public /* synthetic */ void BZj(AnonymousClass11F r1) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008c, code lost:
        r6 = (X.AnonymousClass2bU) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0142, code lost:
        if (r1 != 13) goto L_0x015e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bau(X.AnonymousClass3T1 r6, int r7) {
        /*
            r5 = this;
            r0 = -1
            r4 = 13
            r1 = 5
            if (r7 == r0) goto L_0x0116
            r2 = 1
            if (r7 == r2) goto L_0x00dd
            r0 = 21
            if (r7 == r0) goto L_0x0037
            r0 = 43
            if (r7 == r0) goto L_0x0037
            r0 = 3
            r3 = 0
            if (r7 == r0) goto L_0x0088
            r0 = 4
            if (r7 == r0) goto L_0x00dd
            if (r7 == r1) goto L_0x003b
            r0 = 6
            if (r7 == r0) goto L_0x0037
            switch(r7) {
                case 8: goto L_0x0037;
                case 9: goto L_0x0037;
                case 10: goto L_0x0037;
                case 11: goto L_0x0037;
                case 12: goto L_0x0037;
                case 13: goto L_0x0037;
                case 14: goto L_0x0196;
                case 15: goto L_0x0196;
                case 16: goto L_0x0037;
                case 17: goto L_0x0038;
                case 18: goto L_0x0037;
                case 19: goto L_0x0037;
                default: goto L_0x0020;
            }
        L_0x0020:
            switch(r7) {
                case 23: goto L_0x0037;
                case 24: goto L_0x0116;
                case 25: goto L_0x017a;
                case 26: goto L_0x018d;
                case 27: goto L_0x0037;
                default: goto L_0x0023;
            }
        L_0x0023:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "app/messagechanged unknown type "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0037:
            return
        L_0x0038:
            boolean r0 = r6 instanceof X.C106265Iz
            goto L_0x0077
        L_0x003b:
            X.1C7 r4 = r5.A0P
            X.0gk r1 = new X.0gk
            r1.<init>(r5, r6)
            r0 = 7
            r4.A01(r1, r0)
            X.1Si r0 = r5.A0m
            r0.A0E(r6)
            r0.A0F(r6, r3, r2)
            boolean r0 = r6 instanceof X.C106265Iz
            if (r0 == 0) goto L_0x0060
            X.1Cd r1 = r5.A0A
            X.3Qa r0 = r6.A1J
            X.11F r0 = r0.A06()
            X.C18740tg.A06(r0)
            r1.A00(r0)
        L_0x0060:
            boolean r0 = r6 instanceof X.C46902br
            if (r0 == 0) goto L_0x006a
            r0 = r6
            X.2br r0 = (X.C46902br) r0
            r5.A0O(r0)
        L_0x006a:
            X.3T1 r0 = r6.A0S()
            boolean r0 = r0 instanceof X.C46962bx
            if (r0 == 0) goto L_0x0075
            r5.A0B(r6)
        L_0x0075:
            boolean r0 = r6 instanceof X.AnonymousClass2bH
        L_0x0077:
            if (r0 == 0) goto L_0x0037
            X.1Cd r1 = r5.A0A
            X.3Qa r0 = r6.A1J
            X.11F r0 = r0.A06()
            X.C18740tg.A06(r0)
            r1.A00(r0)
            return
        L_0x0088:
            boolean r0 = r6 instanceof X.AnonymousClass2bU
            if (r0 == 0) goto L_0x0037
            X.2bU r6 = (X.AnonymousClass2bU) r6
            X.3Qj r1 = r6.A1X()
            if (r1 == 0) goto L_0x0037
            boolean r0 = r1.A0V
            if (r0 == 0) goto L_0x0037
            X.3Qa r0 = r6.A1J
            X.11F r4 = r0.A06()
            boolean r0 = A0U(r4)
            if (r0 != 0) goto L_0x0037
            java.io.File r1 = r1.A01()
            if (r1 == 0) goto L_0x00af
            X.1GX r0 = r5.A15
            r0.A0k(r1)
        L_0x00af:
            X.1G5 r0 = r5.A0I
            X.1G6 r0 = r0.A00()
            boolean r0 = r0.A01(r4)
            if (r0 != 0) goto L_0x0037
            int r1 = r6.A1I
            r0 = 2
            if (r1 != r0) goto L_0x019a
            int r0 = r6.A09
            if (r0 != r2) goto L_0x019a
            X.1Si r1 = r5.A0m
            boolean r0 = r6.A1N()
            if (r0 == 0) goto L_0x00d1
            boolean r0 = r5.A00
            if (r0 == 0) goto L_0x00d1
            r3 = 1
        L_0x00d1:
            r1.A0F(r6, r3, r2)
            boolean r0 = r6.A1N()
            if (r0 == 0) goto L_0x0037
            r5.A00 = r2
            return
        L_0x00dd:
            int r1 = r6.A1I
            boolean r0 = X.C66013Ui.A0J(r1)
            if (r0 != 0) goto L_0x00ff
            boolean r0 = X.C66013Ui.A0K(r1)
            if (r0 != 0) goto L_0x00ff
            r0 = 82
            if (r1 == r0) goto L_0x00ff
            r0 = 44
            if (r1 == r0) goto L_0x00ff
            boolean r1 = r6.A1M()
            X.0xJ r0 = r5.A0k
            if (r1 == 0) goto L_0x01a0
            r0.A02(r6)
            return
        L_0x00ff:
            X.1Y2 r0 = r5.A0h
            r0.A03(r6)
            boolean r0 = r6 instanceof X.C46962bx
            if (r0 == 0) goto L_0x0037
            X.2bx r6 = (X.C46962bx) r6
            X.1Yk r1 = r5.A0z
            X.1Ap r0 = r5.A10
            X.6c4 r0 = r0.A00(r6)
            r1.A01(r0)
            return
        L_0x0116:
            int r0 = r6.A0G()
            if (r0 != r1) goto L_0x012e
            r0 = 4096(0x1000, float:5.74E-42)
            boolean r0 = r6.A1T(r0)
            if (r0 == 0) goto L_0x012e
            X.0wU r1 = r5.A16
            X.0hB r0 = new X.0hB
            r0.<init>(r5, r6, r7)
            r1.Boy(r0)
        L_0x012e:
            X.3Qa r2 = r6.A1J
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x0037
            r0 = 24
            if (r7 == r0) goto L_0x0144
            int r1 = r6.A0G()
            boolean r0 = X.AnonymousClass3TJ.A01(r1)
            if (r0 != 0) goto L_0x0144
            if (r1 != r4) goto L_0x015e
        L_0x0144:
            X.11F r1 = r2.A06()
            boolean r0 = X.AnonymousClass143.A0G(r1)
            if (r0 != 0) goto L_0x015e
            boolean r0 = A0R(r1)
            if (r0 != 0) goto L_0x015e
            X.0wU r1 = r5.A16
            X.0hC r0 = new X.0hC
            r0.<init>(r5, r6, r7)
            r1.Boy(r0)
        L_0x015e:
            int r0 = r6.A0G()
            boolean r0 = X.AnonymousClass3TJ.A01(r0)
            if (r0 == 0) goto L_0x0037
            X.9TX r0 = r6.A0K
            if (r0 == 0) goto L_0x0037
            X.005 r0 = r5.A18
            java.lang.Object r1 = r0.get()
            X.1I0 r1 = (X.AnonymousClass1I0) r1
            X.9TX r0 = r6.A0K
            r1.A02(r0)
            return
        L_0x017a:
            boolean r4 = X.AnonymousClass1CM.A02(r6)
            X.1Sb r3 = r5.A0U
            X.3Qa r2 = r6.A1J
            r1 = 9
            X.0Sj r0 = new X.0Sj
            r0.<init>(r5, r4)
            r3.A01(r0, r2, r1)
            return
        L_0x018d:
            X.1Sb r2 = r5.A0U
            X.3Qa r1 = r6.A1J
            r0 = 0
            r2.A01(r0, r1, r4)
            return
        L_0x0196:
            r5.A0J(r6)
            return
        L_0x019a:
            X.1Si r0 = r5.A0m
            r0.A0A()
            return
        L_0x01a0:
            r0.A01(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09F.Bau(X.3T1, int):void");
    }

    public /* synthetic */ void Baw(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void Bay(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void Bb4(Collection collection, int i) {
        C54122sR.A00(this, collection, i);
    }

    public /* synthetic */ void Bb7(AnonymousClass11F r1, Collection collection, boolean z) {
    }

    public void Bb8(AnonymousClass11F r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void Bb9(Collection collection) {
    }

    public /* synthetic */ void Bbc(C28981Uw r1) {
    }

    public /* synthetic */ void Bbe(C28981Uw r1, boolean z) {
    }

    public /* synthetic */ void Bbf(C28981Uw r1) {
    }

    public /* synthetic */ void Bci(AnonymousClass3T1 r1, AnonymousClass3T1 r2) {
    }

    private C10730f8 A01(AnonymousClass3T1 r2, AnonymousClass2bU r3) {
        return new C10730f8(this, r2, r3);
    }

    private AnonymousClass3T1 A06(AnonymousClass3T1 r5) {
        AnonymousClass11F A062 = r5.A1J.A06();
        C63483Kf A0M2 = r5.A0M();
        C18740tg.A06(A0M2);
        return A07(new C64933Qa(A062, A0M2.A00(), true));
    }

    @Deprecated
    private AnonymousClass3T1 A07(C64933Qa r2) {
        return this.A11.A03(r2);
    }

    public static C207209uj A08(AnonymousClass2bI r4) {
        AnonymousClass9YT r3 = new AnonymousClass9YT();
        C64933Qa r2 = r4.A1J;
        r3.A07(r2.A01);
        r3.A05(r4.A1Q);
        r3.A06(r2.A06());
        r3.A03();
        r3.A04();
        r3.A02();
        return r3.A01();
    }

    private void A09(long j) {
        AnonymousClass1YU r3 = this.A0y;
        if (!r3.A01() && j > 900000 && this.A0i.A02()) {
            RegistrationIntentService.A03(this.A0K.A00());
            this.A0J.A01();
            r3.A00();
        }
    }

    private void A0A(C223313w r3, String str) {
        this.A05.A01(new C11920hD(this, r3, str));
    }

    private void A0C(AnonymousClass3T1 r3) {
        C202319lY r0;
        C135106c9 A052;
        C20810yC r1 = this.A0Z;
        if ((r1.A0E(605) || r1.A0E(629)) && (r0 = r3.A0M) != null && (A052 = r0.A05()) != null) {
            this.A0q.A05(A052);
        }
    }

    private void A0E(AnonymousClass3T1 r5) {
        StringBuilder sb = new StringBuilder();
        sb.append("app/message/received/duplicate ");
        C64933Qa r2 = r5.A1J;
        sb.append(r2.A01);
        sb.append(" ");
        sb.append(this.A07.A0A());
        sb.append(" ");
        sb.append(r2.A06());
        sb.append(" ");
        sb.append(r5.A0J());
        Log.i(sb.toString());
    }

    private void A0F(AnonymousClass3T1 r7) {
        int i;
        if (r7 == null) {
            return;
        }
        if ((C197029b1.A00(r7.A1J.A06()) || C197029b1.A00(r7.A0J())) && r7.A0M() != null) {
            AnonymousClass3T1 A062 = A06(r7);
            if (!(A062 == null || A062.A0G != 0 || A062.A0K() != null || (i = A062.A1I) == 87 || i == 88)) {
                this.A08.A0O(A062, r7, 1);
            }
            if (r7.A0N() != null) {
                this.A0d.A01(r7.A0N(), r7);
            }
        }
    }

    private void A0G(AnonymousClass3T1 r4) {
        C63673Ky A0O2;
        if (this.A0Z.A0E(4652) && (A0O2 = r4.A0O()) != null) {
            this.A16.Box(new AnonymousClass0NU(this, A0O2, r4), new Void[0]);
        }
    }

    private void A0H(AnonymousClass3T1 r3) {
        if (r3 instanceof AnonymousClass2bU) {
            A0P((AnonymousClass2bU) r3);
        } else if (!(r3 instanceof AnonymousClass2bV) || r3.A0Y() == null) {
            if (C203369nr.A09(r3)) {
                for (AnonymousClass3T1 A0H2 : ((AnonymousClass2bZ) r3).A1X()) {
                    A0H(A0H2);
                }
            }
        } else if (!r3.A1M() || ((AnonymousClass1GQ) this.A1A.get()).A03()) {
            this.A0g.A02(r3);
        }
        A0J(r3);
        A0F(r3);
        A0I(r3);
    }

    private void A0J(AnonymousClass3T1 r3) {
        this.A16.Boy(new C11650gm(this, r3));
    }

    private void A0K(AnonymousClass3T1 r5) {
        if (!r5.A1J.A02) {
            String str = r5.A0n;
            UserJid A0L2 = r5.A0L();
            if (str != null && (A0L2 instanceof C223213v)) {
                this.A05.A01(new C11870h8(this, A0L2, str));
            }
        }
    }

    private void A0L(AnonymousClass3T1 r5) {
        String str;
        C64933Qa r0 = r5.A1J;
        AnonymousClass11F A062 = r0.A06();
        String str2 = r5.A0v;
        UserJid A0L2 = r5.A0L();
        if (r0.A02) {
            if (A0S(A062) && (str = r5.A0u) != null) {
                A0A((C223313w) A062, str);
            }
        } else if (AnonymousClass143.A0I(A0L2) && r5.A0L == C52152oy.USERNAME) {
            C223313w r2 = (C223313w) A0L2;
            if (str2 == null) {
                str2 = "";
            }
            A0A(r2, str2);
        }
    }

    private void A0M(AnonymousClass3T1 r5, AnonymousClass2bU r6) {
        this.A0e.A01(new C18450tB(this, r5, 0), r6, 1, false);
    }

    private void A0O(C46902br r7) {
        this.A16.Boy(new C11890hA(this, r7, r7.A0I + (((long) r7.A1Z()) * 1000)));
    }

    private void A0P(AnonymousClass2bU r3) {
        this.A16.Boy(new C11660gn(this, r3));
    }

    public static boolean A0V(AnonymousClass3T1 r3) {
        if (r3 instanceof C181208n6) {
            C181208n6 r32 = (C181208n6) r3;
            int A1X = r32.A1X();
            if (A1X == 65 || A1X == 66 || !r32.A1Z()) {
                return true;
            }
            return false;
        } else if (!(r3 instanceof AnonymousClass2bI) || ((AnonymousClass2bI) r3).A1X() != 42) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean A0W(AnonymousClass3T1 r3) {
        C207219uk BA8;
        C207199ui r0;
        if (!(r3 instanceof C23043B1o) || (BA8 = ((C23043B1o) r3).BA8()) == null || !BA8.A04() || !BA8.A04() || (r0 = BA8.A01) == null || r0.A06 == null) {
            return false;
        }
        return true;
    }

    public /* synthetic */ void A0X(AnonymousClass141 r2) {
        this.A0D.A0R(r2);
    }

    public /* synthetic */ void A0Y(C223313w r2, String str) {
        if (this.A0W.A04(r2, str)) {
            this.A0D.A0X(r2);
        }
    }

    public /* synthetic */ void A0Z(UserJid userJid, String str) {
        C223213v r2 = (C223213v) userJid;
        if (this.A0W.A03(r2, str)) {
            this.A0D.A0X(r2);
        }
    }

    public /* synthetic */ void A0b(C133136Wx r4, C129166Fp r5, AnonymousClass2bU r6) {
        C65013Qj A1X;
        C46962bx r62 = (C46962bx) r6;
        if (r4.A03() && (A1X = r62.A1X()) != null) {
            A1X.A02(r5.A03());
            this.A0z.A00(r62, new C18380t4(this, r62, 0));
        }
    }

    public /* synthetic */ void A0e(AnonymousClass3T1 r2) {
        ((AnonymousClass16R) this.A17.get()).A04(r2);
    }

    public /* synthetic */ void A0f(AnonymousClass3T1 r2) {
        this.A0l.A02((C181758nz) r2);
    }

    public /* synthetic */ void A0g(AnonymousClass3T1 r2) {
        this.A0l.A01((C181758nz) r2);
    }

    public /* synthetic */ void A0h(AnonymousClass3T1 r3) {
        ((AnonymousClass16R) this.A17.get()).A04(r3);
        this.A0Z.A0E(508);
    }

    public /* synthetic */ void A0i(AnonymousClass3T1 r2) {
        this.A0V.A02(r2);
    }

    public /* synthetic */ void A0j(AnonymousClass3T1 r2) {
        this.A0s.A00((AnonymousClass2bZ) r2);
    }

    public /* synthetic */ void A0k(AnonymousClass3T1 r2) {
        this.A0r.A02(r2);
    }

    public /* synthetic */ void A0l(AnonymousClass3T1 r2, int i) {
        if (C54082sN.A00(this.A0Z)) {
            this.A0M.A00(r2, i);
        }
    }

    public /* synthetic */ void A0m(C46902br r2, long j) {
        this.A0b.A0b(r2, j);
    }

    public /* synthetic */ void A0n(AnonymousClass2bU r5) {
        this.A0c.A03(this.A0O.A00(r5), AnonymousClass1DT.A00(this.A0Y, r5, this.A0w, this.A0x), C203229nZ.A02(r5));
        this.A0g.A02(r5);
        if (r5.A1K() && (r5 instanceof C46962bx)) {
            this.A0e.A01(new C18450tB(this, r5, 1), r5, 1, true);
        } else if (!r5.A1M() || ((AnonymousClass1GQ) this.A1A.get()).A07()) {
            this.A0e.A02(r5);
        }
    }

    public void BWH(AnonymousClass3T1 r3) {
        AnonymousClass1C4 r0;
        if (r3 != null && !r3.A1J()) {
            A0E(r3);
            if (!r3.A1J.A02 || r3.A1K()) {
                this.A0j.A08(r3);
            } else if (r3 instanceof C181758nz) {
                C181758nz r32 = (C181758nz) r3;
                C207209uj A1Z = r32.A1Z();
                if (A1Z != null) {
                    r0 = this.A02;
                } else if (r32.A1X() == 6) {
                    r0 = this.A02;
                    A1Z = A08(r32);
                } else {
                    return;
                }
                r0.A01(A1Z);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01f1, code lost:
        if (r12.A00 == false) goto L_0x01f3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bas(X.AnonymousClass3T1 r13, int r14) {
        /*
            r12 = this;
            r0 = 29
            if (r14 == r0) goto L_0x01be
            r7 = 0
            if (r13 == 0) goto L_0x02ea
            X.3Qa r0 = r13.A1J
            X.11F r5 = r0.A06()
        L_0x000d:
            r4 = 1
            if (r13 == 0) goto L_0x02c7
            int r8 = r13.A1I
            r0 = 8
            if (r8 == r0) goto L_0x02c7
            r2 = 10
            if (r8 == r2) goto L_0x02c7
            r0 = 90
            if (r8 == r0) goto L_0x02c7
            boolean r0 = X.C66013Ui.A0n(r13)
            if (r0 != 0) goto L_0x02c7
            boolean r0 = A0T(r5)
            if (r0 == 0) goto L_0x003b
            X.1G5 r0 = r12.A0I
            X.1G6 r0 = r0.A00()
            boolean r0 = r0.A01(r5)
            if (r0 == 0) goto L_0x003b
            X.1Y3 r0 = r12.A0G
            r0.A00(r5)
        L_0x003b:
            r12.A0D(r13)
            X.1J1 r0 = r12.A0n
            r0.A03(r13)
            X.1C7 r1 = r12.A0P
            X.0h9 r0 = new X.0h9
            r0.<init>(r12, r5, r13)
            r1.A01(r0, r2)
            r12.A0G(r13)
            X.3Qa r9 = r13.A1J
            boolean r0 = r9.A02
            r6 = 0
            if (r0 != 0) goto L_0x0211
            X.0wQ r0 = r12.A07
            boolean r0 = X.C66013Ui.A0T(r0, r13)
            if (r0 != 0) goto L_0x0211
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r13.A0I
            long r2 = r2 - r0
            X.1A5 r0 = r12.A0R
            X.141 r11 = r0.A01(r5)
            X.11F r0 = r13.A0J()
            com.whatsapp.jid.UserJid r10 = com.whatsapp.jid.UserJid.of(r0)
            X.1Nx r1 = r12.A0t
            int r0 = r1.A02(r5, r10)
            if (r0 < 0) goto L_0x0084
            r1.A08(r5, r10)
            X.1Cd r0 = r12.A0A
            r0.A00(r5)
        L_0x0084:
            boolean r0 = r11.A0G()
            if (r0 != 0) goto L_0x0207
            boolean r0 = A0U(r5)
            if (r0 != 0) goto L_0x0207
            r7 = r11
        L_0x0091:
            java.lang.String r0 = r13.A0r
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00b5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "msgadded/from_name is empty  jid:"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " message:"
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x00b5:
            if (r7 == 0) goto L_0x00d5
            java.lang.String r0 = r13.A0r
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00d5
            java.lang.String r1 = r13.A0r
            java.lang.String r0 = r7.A0a
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00d5
            r7.A0a = r1
            X.1Lu r1 = r12.A05
            X.0go r0 = new X.0go
            r0.<init>(r12, r7)
            r1.A01(r0)
        L_0x00d5:
            r12.A0K(r13)
            r12.A0L(r13)
            X.1Yc r0 = r12.A0Q
            r0.A00(r13)
            r12.A0H(r13)
            r12.A0C(r13)
            X.3T1 r0 = r13.A0S()
            if (r0 == 0) goto L_0x00ef
            r12.A0C(r0)
        L_0x00ef:
            boolean r0 = r13 instanceof X.AnonymousClass2bR
            if (r0 == 0) goto L_0x010f
            boolean r0 = r11.A0G()
            if (r0 != 0) goto L_0x00fd
            com.whatsapp.jid.UserJid r10 = com.whatsapp.jid.UserJid.of(r5)
        L_0x00fd:
            if (r10 == 0) goto L_0x010f
            r0 = r13
            X.2bR r0 = (X.AnonymousClass2bR) r0
            int r9 = r0.A1X()
            long r0 = r0.A1Y()
            X.1Yx r7 = r12.A0p
            r7.A01(r10, r9, r0)
        L_0x010f:
            X.3T1 r0 = r13.A0S()
            boolean r0 = r0 instanceof X.C46962bx
            if (r0 == 0) goto L_0x011a
            r12.A0B(r13)
        L_0x011a:
            boolean r0 = r13 instanceof X.C46902br
            if (r0 == 0) goto L_0x0124
            r0 = r13
            X.2br r0 = (X.C46902br) r0
            r12.A0O(r0)
        L_0x0124:
            boolean r0 = r13 instanceof X.C181208n6
            if (r0 == 0) goto L_0x0204
            boolean r1 = A0V(r13)
        L_0x012c:
            boolean r0 = r13.A11
            if (r0 == 0) goto L_0x01bf
            boolean r0 = r13.A1N()
            if (r0 == 0) goto L_0x013e
            r12.A09(r2)
            boolean r0 = r12.A00
            if (r0 == 0) goto L_0x013e
            r6 = 1
        L_0x013e:
            r12.A00 = r4
            if (r6 != 0) goto L_0x016c
            X.1Si r0 = r12.A0m
            r0.A0B(r5)
            X.0v0 r0 = r12.A0L
            boolean r0 = r0.A2A()
            if (r0 == 0) goto L_0x016c
            X.1Q0 r2 = r12.A13
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = X.C19430v1.A04
            r1.append(r0)
            r0 = 2132017168(0x7f140010, float:1.9672607E38)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r2.A02(r0)
        L_0x016c:
            boolean r0 = X.C183348qe.A04(r13)
            if (r0 == 0) goto L_0x017d
            X.1DL r1 = r12.A0j
            X.17E r0 = r12.A0a
            X.3T1 r0 = X.C183348qe.A00(r0, r13)
            r1.A08(r0)
        L_0x017d:
            X.1TF r1 = r12.A0o
            boolean r0 = r1.A06(r13)
            if (r0 == 0) goto L_0x018e
            X.0wG r0 = r12.A0K
            android.content.Context r0 = r0.A00()
            r1.A03(r0, r13)
        L_0x018e:
            X.1DL r0 = r12.A0j
            r0.A08(r13)
        L_0x0193:
            boolean r0 = r13 instanceof X.AnonymousClass2cV
            if (r0 == 0) goto L_0x019d
            r0 = r13
            X.2cV r0 = (X.AnonymousClass2cV) r0
            r12.A0Q(r0)
        L_0x019d:
            boolean r0 = X.C203359nq.A0C(r13)
            if (r0 == 0) goto L_0x01a8
            X.1Rg r0 = r12.A12
            r0.A01(r13, r4)
        L_0x01a8:
            boolean r0 = r13 instanceof X.AnonymousClass2bH
            if (r0 != 0) goto L_0x01b0
            boolean r0 = r13 instanceof X.AnonymousClass2cF
            if (r0 == 0) goto L_0x01b5
        L_0x01b0:
            X.1Cd r0 = r12.A0A
            r0.A00(r5)
        L_0x01b5:
            boolean r0 = r13 instanceof X.AnonymousClass2cU
            if (r0 == 0) goto L_0x01be
            X.2cU r13 = (X.AnonymousClass2cU) r13
            r12.A0N(r13)
        L_0x01be:
            return
        L_0x01bf:
            if (r1 == 0) goto L_0x01d6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "msgadded/bloks_notification is true jid: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x016c
        L_0x01d6:
            X.1Si r7 = r12.A0m
            r7.A0C(r5, r13)
            boolean r0 = X.C203359nq.A0C(r13)
            if (r0 != 0) goto L_0x016c
            r0 = 2
            if (r8 != r0) goto L_0x01e8
            int r0 = r13.A09
            if (r0 == r4) goto L_0x016c
        L_0x01e8:
            boolean r0 = r13.A1N()
            if (r0 == 0) goto L_0x01f3
            boolean r1 = r12.A00
            r0 = 1
            if (r1 != 0) goto L_0x01f4
        L_0x01f3:
            r0 = 0
        L_0x01f4:
            r7.A0F(r13, r0, r6)
            boolean r0 = r13.A1N()
            if (r0 == 0) goto L_0x016c
            r12.A00 = r4
            r12.A09(r2)
            goto L_0x016c
        L_0x0204:
            r1 = 0
            goto L_0x012c
        L_0x0207:
            if (r10 == 0) goto L_0x0091
            X.16D r0 = r12.A0D
            X.141 r7 = r0.A0C(r10)
            goto L_0x0091
        L_0x0211:
            boolean r0 = r13.A1K()
            if (r0 == 0) goto L_0x021f
            r12.A0H(r13)
            r12.A0L(r13)
            goto L_0x018e
        L_0x021f:
            r0 = -1
            r3 = 6
            if (r14 == r0) goto L_0x0226
            r0 = 7
            if (r14 != r0) goto L_0x0231
        L_0x0226:
            int r0 = r13.A0G()
            if (r0 == r3) goto L_0x0231
            X.0xJ r0 = r12.A0k
            r0.A01(r13)
        L_0x0231:
            X.1Cw r0 = r12.A0u
            boolean r0 = r0.A00(r13)
            if (r0 == 0) goto L_0x0243
            boolean r0 = r13.A11
            if (r0 != 0) goto L_0x0243
            boolean r0 = X.C66013Ui.A0o(r13)
            if (r0 == 0) goto L_0x0251
        L_0x0243:
            r0 = 16
            if (r14 != r0) goto L_0x0259
            boolean r0 = r13 instanceof X.AnonymousClass2bI
            if (r0 == 0) goto L_0x0259
            boolean r0 = A0V(r13)
            if (r0 != 0) goto L_0x0259
        L_0x0251:
            X.1Si r0 = r12.A0m
            r0.A0C(r5, r13)
            r0.A0F(r13, r6, r4)
        L_0x0259:
            X.1Yd r2 = r12.A14
            boolean r0 = r2.A02(r13)
            if (r0 != 0) goto L_0x0267
            boolean r0 = r2.A01(r13)
            if (r0 == 0) goto L_0x027b
        L_0x0267:
            X.0yC r1 = r12.A0Z
            r0 = 982(0x3d6, float:1.376E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x027b
            X.0wU r1 = r12.A16
            X.0gi r0 = new X.0gi
            r0.<init>(r12, r13)
            r1.Boy(r0)
        L_0x027b:
            boolean r0 = r2.A03(r13)
            if (r0 == 0) goto L_0x0295
            X.0yC r1 = r12.A0Z
            r0 = 4184(0x1058, float:5.863E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0295
            X.0wU r1 = r12.A16
            X.0gj r0 = new X.0gj
            r0.<init>(r12, r13)
            r1.Boy(r0)
        L_0x0295:
            boolean r0 = r13 instanceof X.C181758nz
            if (r0 == 0) goto L_0x02a7
            r2 = r13
            X.8nz r2 = (X.C181758nz) r2
            X.9uj r1 = r2.A1Z()
            if (r1 == 0) goto L_0x02ba
            X.1C4 r0 = r12.A02
        L_0x02a4:
            r0.A01(r1)
        L_0x02a7:
            boolean r0 = r13 instanceof X.C46962bx
            if (r0 == 0) goto L_0x0193
            r2 = r13
            X.2bx r2 = (X.C46962bx) r2
            X.1Yk r1 = r12.A0z
            X.0t4 r0 = new X.0t4
            r0.<init>(r12, r2, r4)
            r1.A00(r2, r0)
            goto L_0x0193
        L_0x02ba:
            int r0 = r2.A1X()
            if (r0 != r3) goto L_0x02a7
            X.1C4 r0 = r12.A02
            X.9uj r1 = A08(r2)
            goto L_0x02a4
        L_0x02c7:
            boolean r0 = r13 instanceof X.AnonymousClass5J5
            if (r0 != 0) goto L_0x0193
            boolean r0 = X.C66013Ui.A0n(r13)
            if (r0 == 0) goto L_0x0193
            X.0wQ r0 = r12.A07
            boolean r0 = X.C66013Ui.A0P(r0, r13)
            if (r0 == 0) goto L_0x02e3
            X.1Si r0 = r12.A0m
            r0.A0C(r5, r13)
            r0.A0F(r13, r4, r4)
            goto L_0x0193
        L_0x02e3:
            X.0xJ r0 = r12.A0k
            r0.A01(r13)
            goto L_0x0193
        L_0x02ea:
            r5 = r7
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09F.Bas(X.3T1, int):void");
    }

    public void Bb5(AnonymousClass11F r2) {
        this.A0H.A00(r2);
    }

    public void Bb6(Collection collection, Map map) {
        if (map == null) {
            this.A0n.A05(collection);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass1YX r1 = this.A0H;
            AnonymousClass11F A062 = ((AnonymousClass3T1) it.next()).A1J.A06();
            C18740tg.A06(A062);
            r1.A00(A062);
        }
    }

    public void Bbr() {
        ((C20720y3) this.A19.get()).A09();
    }

    public void Bck(AnonymousClass3T1 r3, AnonymousClass3T1 r4) {
        this.A12.A01(r4, 3);
        if (r3 != null) {
            AnonymousClass1TF r1 = this.A0o;
            if (r1.A06(r3)) {
                r1.A03(this.A0K.A00(), r3);
            }
        }
        A0F(r3);
    }

    private void A0B(AnonymousClass3T1 r8) {
        AnonymousClass3T1 A0S2 = r8.A0S();
        if (A0S2 instanceof AnonymousClass2bU) {
            AnonymousClass2bU r5 = (AnonymousClass2bU) A0S2;
            C65013Qj A1X = r5.A1X();
            boolean z = r8 instanceof AnonymousClass2cV;
            AnonymousClass3T1 A072 = A07(A0S2.A1J);
            if (z && C203369nr.A09(A072)) {
                A072 = C203369nr.A02(A072, ((AnonymousClass2cV) r8).A1e().intValue());
            }
            if (A072 != null) {
                if (A072 instanceof AnonymousClass2bU) {
                    AnonymousClass2bU r1 = (AnonymousClass2bU) A072;
                    C65013Qj A1X2 = r1.A1X();
                    C101334xN A0A2 = this.A0f.A0A(r1);
                    if (A0A2 != null) {
                        A0A2.B0M(A01(r8, r5));
                        return;
                    } else if (!z) {
                        return;
                    } else {
                        if (!(A1X2 == null || A1X == null || A1X2.A01() == null)) {
                            this.A0v.A00(r8, A072);
                            this.A0S.A0l(r8);
                            return;
                        }
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("MainMessageObserver/downloadMediaForQuotedMessage originalMessage not mediaMessage: ");
                    sb.append(A072.getClass().getName());
                    Log.e(sb.toString());
                    return;
                }
            }
            A0M(r8, r5);
        }
    }

    private void A0D(AnonymousClass3T1 r4) {
        UserJid A0L2 = r4.A0L();
        if (r4.A1W) {
            this.A0N.A04(A0L2);
            return;
        }
        boolean A1T = r4.A1T(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
        AnonymousClass1YG r0 = this.A0N;
        if (A1T) {
            r0.A02(A0L2);
        } else {
            r0.A03(A0L2);
        }
    }

    private void A0I(AnonymousClass3T1 r3) {
        if (A0W(r3)) {
            this.A16.Boy(new C11640gl(this, r3));
        }
    }

    private void A0N(AnonymousClass2cU r6) {
        AnonymousClass3T1 A072;
        AnonymousClass3T1 A0S2 = r6.A0S();
        if (A0S2 != null && A0S2.A1R(8) && (A072 = A07(A0S2.A1J)) != null && A072.A0T().A01() != null) {
            Iterator it = A072.A0T().A01().A02.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnonymousClass3EY r2 = (AnonymousClass3EY) it.next();
                if (r2.A04.equals(r6.A1d())) {
                    r2.A00 = true;
                    break;
                }
            }
            this.A0S.A0k(A072);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0Q(X.AnonymousClass2cV r6) {
        /*
            r5 = this;
            X.3T1 r0 = r6.A0S()
            if (r0 == 0) goto L_0x0070
            X.3Qa r0 = r0.A1J
            X.3T1 r2 = r5.A07(r0)
            boolean r0 = r2 instanceof X.C88854Uh
            if (r0 == 0) goto L_0x0037
            r0 = r2
            X.4Uh r0 = (X.C88854Uh) r0
            X.3F4 r0 = r0.BIE()
            java.util.List r0 = r0.A06
            if (r0 == 0) goto L_0x0062
            java.util.Iterator r4 = r0.iterator()
        L_0x001f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0062
            java.lang.Object r3 = r4.next()
            X.3P8 r3 = (X.AnonymousClass3P8) r3
            int r1 = r3.A05
            int r0 = r6.A1d()
            if (r1 != r0) goto L_0x001f
            r3.A00()
            goto L_0x001f
        L_0x0037:
            boolean r0 = X.C203369nr.A09(r2)
            if (r0 == 0) goto L_0x0067
            java.lang.Integer r0 = r6.A1e()
            int r0 = r0.intValue()
            X.3T1 r0 = X.C203369nr.A02(r2, r0)
            if (r0 == 0) goto L_0x0067
            X.B1o r0 = (X.C23043B1o) r0
            X.9uk r0 = r0.BA8()
            X.9uX r0 = r0.A04
            java.util.List r1 = r0.A03
            int r0 = r6.A1d()
            java.lang.Object r1 = r1.get(r0)
            X.9tc r1 = (X.C206569tc) r1
            r0 = 1
            r1.A00 = r0
        L_0x0062:
            X.0xM r0 = r5.A0S
            r0.A0k(r2)
        L_0x0067:
            boolean r0 = r6.A1K()
            if (r0 == 0) goto L_0x0070
            r5.A0B(r6)
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09F.A0Q(X.2cV):void");
    }

    public /* synthetic */ void A0a(C133136Wx r3, C129166Fp r4, AnonymousClass3T1 r5, AnonymousClass2bU r6) {
        if (r3.A03()) {
            this.A16.Boy(new C12000hL(this, r4, r5, r6));
        }
    }

    public /* synthetic */ void A0c(C133136Wx r2, AnonymousClass3T1 r3) {
        if (r2.A03()) {
            this.A0S.A0l(r3);
        }
    }

    public /* synthetic */ void A0d(C129166Fp r4, AnonymousClass3T1 r5, AnonymousClass2bU r6) {
        String str;
        C65013Qj A1X = r6.A1X();
        File A032 = r4.A03();
        if (A1X == null) {
            str = "MainMessageObserver/getQuotedMediaDownloadListener null mediaDataV2";
        } else if (A032 != null) {
            A1X.A02(A032);
            this.A0S.A0l(r5);
            this.A09.A06(A032, 1, true);
            return;
        } else {
            str = "MainMessageObserver/getQuotedMediaDownloadListener null download onComplete";
        }
        Log.e(str);
    }

    public /* synthetic */ void A0o(C46962bx r2, String str) {
        if (!r2.A1k()) {
            this.A0C.A0L(str);
        }
    }

    public /* synthetic */ void A0p(C46962bx r2, String str) {
        if (!r2.A1k()) {
            this.A0C.A0L(str);
        }
    }

    public void BSA(AnonymousClass3T1 r6, int i) {
        int i2;
        if (r6.A1N() && !this.A01 && (i2 = r6.A1I) != 8 && i2 != 10 && System.currentTimeMillis() - r6.A0I > 900000) {
            this.A01 = true;
            AnonymousClass1MT r2 = this.A0i;
            if (r2.A02()) {
                C19420v0 r1 = this.A0L;
                r1.A1C(r1.A0H() + 1);
                r1.A0H();
                if (!r2.A02()) {
                    ((C20720y3) this.A19.get()).A0A();
                }
            }
        }
    }

    public static boolean A0R(Jid jid) {
        return jid instanceof C177618e5;
    }

    public static boolean A0S(Jid jid) {
        return jid instanceof C223313w;
    }

    public static boolean A0T(Jid jid) {
        return jid instanceof C28981Uw;
    }

    public static boolean A0U(Jid jid) {
        return jid instanceof C177528dw;
    }

    public void Bbd(AnonymousClass3T1 r1) {
        A0H(r1);
    }

    public void Bax(AnonymousClass3T1 r1, AnonymousClass3T1 r2) {
        A0F(r2);
    }

    public AnonymousClass09F(C19460v5 r2, C19460v5 r3, C26861Lu r4, AnonymousClass17Y r5, C19730wQ r6, AnonymousClass1DT r7, C24041Av r8, C24361Cd r9, C29911Yl r10, AnonymousClass196 r11, AnonymousClass16D r12, AnonymousClass16I r13, C20430xY r14, AnonymousClass1Y3 r15, AnonymousClass1YX r16, AnonymousClass1G5 r17, AnonymousClass1MP r18, C19630wG r19, C19420v0 r20, C30041Yz r21, AnonymousClass1YG r22, AnonymousClass1E3 r23, AnonymousClass1C7 r24, C29821Yc r25, AnonymousClass1A5 r26, C20310xM r27, AnonymousClass16J r28, C28291Sb r29, AnonymousClass1TV r30, C230416y r31, AnonymousClass12O r32, AnonymousClass1DW r33, C20810yC r34, AnonymousClass17E r35, AnonymousClass1P5 r36, C24811Dw r37, C29921Yn r38, C29841Ye r39, AnonymousClass1ST r40, C29631Xj r41, AnonymousClass1Y2 r42, AnonymousClass1MT r43, AnonymousClass1DL r44, C20280xJ r45, AnonymousClass1C4 r46, AnonymousClass1Z3 r47, C28361Si r48, AnonymousClass1J1 r49, AnonymousClass1TF r50, C30021Yx r51, C29931Yo r52, C29151Vn r53, C29811Yb r54, C27361Nx r55, C24551Cw r56, AnonymousClass1FO r57, AnonymousClass1AW r58, AnonymousClass1EO r59, AnonymousClass1YU r60, C29901Yk r61, C23981Ap r62, AnonymousClass1A1 r63, C28081Rg r64, AnonymousClass1Q0 r65, C29831Yd r66, AnonymousClass1GX r67, C19770wU r68, AnonymousClass005 r69, AnonymousClass005 r70, AnonymousClass005 r71, AnonymousClass005 r72) {
        ConditionVariable conditionVariable = C18740tg.A00;
        this.A0K = r19;
        this.A0Z = r34;
        this.A06 = r5;
        this.A07 = r6;
        this.A16 = r68;
        this.A02 = r46;
        this.A0C = r11;
        this.A0j = r44;
        this.A0s = r54;
        this.A0D = r12;
        this.A0Y = r33;
        this.A15 = r67;
        this.A08 = r7;
        this.A0n = r49;
        this.A10 = r62;
        this.A05 = r4;
        this.A0y = r60;
        this.A1A = r69;
        this.A0t = r55;
        this.A13 = r65;
        this.A0E = r13;
        this.A0S = r27;
        this.A11 = r63;
        this.A0X = r32;
        this.A0T = r28;
        this.A12 = r64;
        this.A0Q = r25;
        this.A14 = r66;
        this.A0e = r39;
        this.A0o = r50;
        this.A0J = r18;
        this.A0P = r24;
        this.A0A = r9;
        this.A0F = r14;
        this.A0U = r29;
        this.A0k = r45;
        this.A0u = r56;
        this.A0c = r37;
        this.A0i = r43;
        this.A0m = r48;
        this.A0L = r20;
        this.A0f = r40;
        this.A19 = r70;
        this.A0z = r61;
        this.A0v = r57;
        this.A0h = r42;
        this.A0g = r41;
        this.A0O = r23;
        this.A0b = r36;
        this.A0B = r10;
        this.A0G = r15;
        this.A0d = r38;
        this.A0a = r35;
        this.A03 = r2;
        this.A0r = r53;
        this.A0V = r30;
        this.A0R = r26;
        this.A0q = r52;
        this.A09 = r8;
        this.A17 = r71;
        this.A0W = r31;
        this.A0p = r51;
        this.A0N = r22;
        this.A0H = r16;
        this.A18 = r72;
        this.A0I = r17;
        this.A0M = r21;
        this.A0w = r58;
        this.A0x = r59;
        this.A0l = r47;
        this.A04 = r3;
    }
}
