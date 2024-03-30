package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.1vE  reason: invalid class name and case insensitive filesystem */
public final class C40271vE extends C06730Uv {
    public final List A00;
    public final List A01;

    public int A00() {
        return this.A00.size();
    }

    public int A01() {
        return this.A01.size();
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f2 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03(int r11, int r12) {
        /*
            r10 = this;
            java.util.List r0 = r10.A01
            java.lang.Object r3 = r0.get(r11)
            X.2uy r3 = (X.C55652uy) r3
            java.util.List r0 = r10.A00
            java.lang.Object r2 = r0.get(r12)
            X.2uy r2 = (X.C55652uy) r2
            boolean r0 = r3 instanceof X.C48162go
            r1 = 0
            if (r0 == 0) goto L_0x0104
            boolean r0 = r2 instanceof X.C48162go
            if (r0 == 0) goto L_0x0104
            X.2go r3 = (X.C48162go) r3
            X.2go r2 = (X.C48162go) r2
            long r6 = r3.A03
            long r4 = r2.A03
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x023a
            X.2La r9 = r3.A04
            X.2La r8 = r2.A04
            X.1Uw r1 = r9.A0J()
            X.1Uw r0 = r8.A0J()
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x023a
            X.2p1 r1 = r9.A0F
            X.2p1 r0 = r8.A0F
            if (r1 != r0) goto L_0x023a
            long r4 = r9.A05
            long r0 = r8.A05
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x023a
            java.lang.String r1 = r9.A0K
            java.lang.String r0 = r8.A0K
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x023a
            long r6 = r9.A06
            long r4 = r8.A06
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x023a
            boolean r1 = r9.A0N
            boolean r0 = r8.A0N
            if (r1 != r0) goto L_0x023a
            X.2pB r1 = r9.A0E
            X.2pB r0 = r8.A0E
            if (r1 != r0) goto L_0x023a
            X.3T1 r6 = r3.A05
            X.3T1 r5 = r2.A05
            r4 = 0
            if (r6 == 0) goto L_0x0101
            X.3Qa r1 = r6.A1J
        L_0x006c:
            if (r5 == 0) goto L_0x00fe
            X.3Qa r0 = r5.A1J
        L_0x0070:
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x023a
            if (r6 == 0) goto L_0x00fc
            int r0 = r6.A1I
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x007e:
            if (r5 == 0) goto L_0x00fa
            int r0 = r5.A1I
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0086:
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x023a
            if (r6 == 0) goto L_0x00f8
            X.37F r1 = r6.A0X()
        L_0x0092:
            if (r5 == 0) goto L_0x00f6
            X.37F r0 = r5.A0X()
        L_0x0098:
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x023a
            if (r6 == 0) goto L_0x00f4
            int r0 = r6.A0D
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x00a6:
            if (r5 == 0) goto L_0x00ae
            int r0 = r5.A0D
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L_0x00ae:
            boolean r0 = X.AnonymousClass00C.A0J(r1, r4)
            if (r0 == 0) goto L_0x023a
            int r1 = r3.A01
            int r0 = r2.A01
            if (r1 != r0) goto L_0x023a
            X.141 r1 = r3.A00
            X.141 r8 = r2.A00
            long r6 = r1.A0C
            long r4 = r8.A0C
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x023a
            java.lang.String r1 = r1.A0J()
            java.lang.String r0 = r8.A0J()
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x023a
            long r6 = r3.A02
            long r4 = r2.A02
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x023a
            java.lang.CharSequence r1 = r3.A06
            java.lang.CharSequence r0 = r2.A06
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x023a
            boolean r1 = r3.A07
            boolean r0 = r2.A07
            if (r1 != r0) goto L_0x023a
            boolean r1 = r3.A08
            boolean r0 = r2.A08
            if (r1 != r0) goto L_0x023a
        L_0x00f2:
            r1 = 1
        L_0x00f3:
            return r1
        L_0x00f4:
            r1 = r4
            goto L_0x00a6
        L_0x00f6:
            r0 = r4
            goto L_0x0098
        L_0x00f8:
            r1 = r4
            goto L_0x0092
        L_0x00fa:
            r0 = r4
            goto L_0x0086
        L_0x00fc:
            r1 = r4
            goto L_0x007e
        L_0x00fe:
            r0 = r4
            goto L_0x0070
        L_0x0101:
            r1 = r4
            goto L_0x006c
        L_0x0104:
            boolean r0 = r3 instanceof X.C48032ga
            if (r0 == 0) goto L_0x0117
            boolean r0 = r2 instanceof X.C48032ga
            if (r0 == 0) goto L_0x0117
            X.3Sm r0 = X.C65543Sm.A00
            X.2ga r3 = (X.C48032ga) r3
            X.2ga r2 = (X.C48032ga) r2
            boolean r1 = r0.A01(r3, r2)
            return r1
        L_0x0117:
            boolean r0 = r3 instanceof X.C47962gT
            if (r0 == 0) goto L_0x012a
            boolean r0 = r2 instanceof X.C47962gT
            if (r0 == 0) goto L_0x012a
            X.2gT r3 = (X.C47962gT) r3
            boolean r3 = r3.A00
            X.2gT r2 = (X.C47962gT) r2
            boolean r0 = r2.A00
        L_0x0127:
            if (r3 != r0) goto L_0x00f3
            goto L_0x00f2
        L_0x012a:
            boolean r0 = r3 instanceof X.C48102gi
            if (r0 == 0) goto L_0x013b
            boolean r0 = r2 instanceof X.C48102gi
            if (r0 == 0) goto L_0x013b
            X.2gi r3 = (X.C48102gi) r3
            boolean r3 = r3.A00
            X.2gi r2 = (X.C48102gi) r2
            boolean r0 = r2.A00
            goto L_0x0127
        L_0x013b:
            boolean r0 = r3 instanceof X.C48252gx
            if (r0 == 0) goto L_0x0144
            boolean r0 = r2 instanceof X.C48252gx
            if (r0 == 0) goto L_0x0144
            goto L_0x00f2
        L_0x0144:
            boolean r0 = r3 instanceof X.C48112gj
            if (r0 == 0) goto L_0x0159
            boolean r0 = r2 instanceof X.C48112gj
            if (r0 == 0) goto L_0x0159
            X.2gj r3 = (X.C48112gj) r3
            X.3KF r1 = r3.A00
            X.2gj r2 = (X.C48112gj) r2
            X.3KF r0 = r2.A00
            boolean r1 = X.C65543Sm.A00(r1, r0)
            return r1
        L_0x0159:
            boolean r0 = r3 instanceof X.AnonymousClass2ge
            if (r0 == 0) goto L_0x016a
            boolean r0 = r2 instanceof X.AnonymousClass2ge
            if (r0 == 0) goto L_0x016a
            X.2ge r3 = (X.AnonymousClass2ge) r3
            boolean r3 = r3.A00
            X.2ge r2 = (X.AnonymousClass2ge) r2
            boolean r0 = r2.A00
            goto L_0x0127
        L_0x016a:
            boolean r0 = r3 instanceof X.C48122gk
            if (r0 == 0) goto L_0x017b
            boolean r0 = r2 instanceof X.C48122gk
            if (r0 == 0) goto L_0x017b
            X.2gk r3 = (X.C48122gk) r3
            int r3 = r3.A00
            X.2gk r2 = (X.C48122gk) r2
            int r0 = r2.A00
            goto L_0x0127
        L_0x017b:
            boolean r0 = r3 instanceof X.C48152gn
            if (r0 == 0) goto L_0x01a0
            boolean r0 = r2 instanceof X.C48152gn
            if (r0 == 0) goto L_0x01a0
            X.2gn r3 = (X.C48152gn) r3
            boolean r4 = r3.A01
            X.2gn r2 = (X.C48152gn) r2
            boolean r0 = r2.A01
            if (r4 != r0) goto L_0x00f3
            java.util.List r0 = r3.A00
            int r4 = r0.size()
            java.util.List r0 = r2.A00
            int r0 = r0.size()
            if (r4 != r0) goto L_0x00f3
            boolean r3 = r3.A02
            boolean r0 = r2.A02
            goto L_0x0127
        L_0x01a0:
            boolean r0 = r3 instanceof X.C48072gf
            if (r0 == 0) goto L_0x01b5
            boolean r0 = r2 instanceof X.C48072gf
            if (r0 == 0) goto L_0x01b5
            X.2gf r3 = (X.C48072gf) r3
            X.3HM r1 = r3.A00
            X.2gf r2 = (X.C48072gf) r2
            X.3HM r0 = r2.A00
            boolean r1 = X.AnonymousClass00C.A0J(r1, r0)
            return r1
        L_0x01b5:
            boolean r0 = r3 instanceof X.C48052gc
            if (r0 == 0) goto L_0x01bf
            boolean r0 = r2 instanceof X.C48052gc
            if (r0 == 0) goto L_0x01bf
            goto L_0x00f2
        L_0x01bf:
            boolean r0 = r3 instanceof X.C47992gW
            if (r0 == 0) goto L_0x01d3
            boolean r0 = r2 instanceof X.C47992gW
            if (r0 == 0) goto L_0x01d3
            X.2gh r3 = (X.C48092gh) r3
            X.2gh r2 = (X.C48092gh) r2
            X.2oF r1 = r3.A00
            X.2oF r0 = r2.A00
            if (r1 != r0) goto L_0x023a
            goto L_0x00f2
        L_0x01d3:
            boolean r0 = r3 instanceof X.C48212gt
            if (r0 == 0) goto L_0x01da
            boolean r1 = r2 instanceof X.C48212gt
            return r1
        L_0x01da:
            boolean r0 = r3 instanceof X.C48232gv
            if (r0 == 0) goto L_0x01e1
            boolean r1 = r2 instanceof X.C48232gv
            return r1
        L_0x01e1:
            boolean r0 = r3 instanceof X.C48222gu
            if (r0 == 0) goto L_0x01e8
            boolean r1 = r2 instanceof X.C48222gu
            return r1
        L_0x01e8:
            boolean r0 = r3 instanceof X.C48192gr
            if (r0 == 0) goto L_0x01ef
            boolean r1 = r2 instanceof X.C48192gr
            return r1
        L_0x01ef:
            boolean r0 = r3 instanceof X.C48202gs
            if (r0 == 0) goto L_0x01f6
            boolean r1 = r2 instanceof X.C48202gs
            return r1
        L_0x01f6:
            boolean r0 = r3 instanceof X.C48182gq
            if (r0 == 0) goto L_0x01fd
            boolean r1 = r2 instanceof X.C48182gq
            return r1
        L_0x01fd:
            boolean r0 = r3 instanceof X.C48082gg
            if (r0 == 0) goto L_0x020f
            boolean r0 = r2 instanceof X.C48082gg
            if (r0 == 0) goto L_0x020f
            X.2gg r3 = (X.C48082gg) r3
            boolean r3 = r3.A00
            X.2gg r2 = (X.C48082gg) r2
            boolean r0 = r2.A00
            goto L_0x0127
        L_0x020f:
            boolean r0 = r3 instanceof X.C47952gS
            if (r0 == 0) goto L_0x0221
            boolean r0 = r2 instanceof X.C47952gS
            if (r0 == 0) goto L_0x0221
            X.2gS r3 = (X.C47952gS) r3
            boolean r3 = r3.A00
            X.2gS r2 = (X.C47952gS) r2
            boolean r0 = r2.A00
            goto L_0x0127
        L_0x0221:
            boolean r0 = r3 instanceof X.C48132gl
            if (r0 == 0) goto L_0x0233
            boolean r0 = r2 instanceof X.C48132gl
            if (r0 == 0) goto L_0x0233
            X.2gl r3 = (X.C48132gl) r3
            int r3 = r3.A00
            X.2gl r2 = (X.C48132gl) r2
            int r0 = r2.A00
            goto L_0x0127
        L_0x0233:
            boolean r0 = r3 instanceof X.C48262gy
            if (r0 == 0) goto L_0x00f3
            boolean r1 = r2 instanceof X.C48262gy
            return r1
        L_0x023a:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40271vE.A03(int, int):boolean");
    }

    public boolean A04(int i, int i2) {
        UserJid userJid;
        C55652uy r1 = (C55652uy) this.A01.get(i);
        C55652uy r2 = (C55652uy) this.A00.get(i2);
        if (r1 instanceof C48102gi) {
            return r2 instanceof C48102gi;
        }
        if (r1 instanceof C48252gx) {
            return r2 instanceof C48252gx;
        }
        if (r1 instanceof C48112gj) {
            return r2 instanceof C48112gj;
        }
        if (r1 instanceof C48032ga) {
            if (!(r2 instanceof C48032ga)) {
                return false;
            }
            C48032ga r12 = (C48032ga) r1;
            C48032ga r22 = (C48032ga) r2;
            C36351kA.A1J(r12, r22, 1);
            C65663Sz A002 = r12.A00();
            UserJid userJid2 = null;
            if (A002 != null) {
                userJid = A002.A09;
            } else {
                userJid = null;
            }
            C65663Sz A003 = r22.A00();
            if (A003 != null) {
                userJid2 = A003.A09;
            }
            return AnonymousClass00C.A0J(userJid, userJid2);
        } else if (r1 instanceof C48002gX) {
            return r2 instanceof C48002gX;
        } else {
            if (r1 instanceof C48162go) {
                if (!(r2 instanceof C48162go) || !AnonymousClass00C.A0J(((C48162go) r1).A04.A06(), ((C48162go) r2).A04.A06())) {
                    return false;
                }
                return true;
            } else if (r1 instanceof AnonymousClass2ge) {
                return r2 instanceof AnonymousClass2ge;
            } else {
                if (r1 instanceof C48122gk) {
                    return r2 instanceof C48122gk;
                }
                if (r1 instanceof C47962gT) {
                    return r2 instanceof C47962gT;
                }
                if (r1 instanceof C48072gf) {
                    return r2 instanceof C48072gf;
                }
                if (r1 instanceof C48152gn) {
                    return r2 instanceof C48152gn;
                }
                if (r1 instanceof C48052gc) {
                    return r2 instanceof C48052gc;
                }
                if (r1 instanceof C47972gU) {
                    return r2 instanceof C47972gU;
                }
                if (r1 instanceof C47992gW) {
                    return r2 instanceof C47992gW;
                }
                if (r1 instanceof C48242gw) {
                    return r2 instanceof C48242gw;
                }
                if (r1 instanceof C48142gm) {
                    return r2 instanceof C48142gm;
                }
                if (r1 instanceof C48172gp) {
                    return r2 instanceof C48172gp;
                }
                if (r1 instanceof C47982gV) {
                    return r2 instanceof C47982gV;
                }
                if (r1 instanceof C48092gh) {
                    if (!(r2 instanceof C48092gh) || ((C48092gh) r1).A00 != ((C48092gh) r2).A00) {
                        return false;
                    }
                    return true;
                } else if (r1 instanceof C48212gt) {
                    return r2 instanceof C48212gt;
                } else {
                    if (r1 instanceof C48232gv) {
                        return r2 instanceof C48232gv;
                    }
                    if (r1 instanceof C48222gu) {
                        return r2 instanceof C48222gu;
                    }
                    if (r1 instanceof C48192gr) {
                        return r2 instanceof C48192gr;
                    }
                    if (r1 instanceof C48202gs) {
                        return r2 instanceof C48202gs;
                    }
                    if (r1 instanceof C48182gq) {
                        return r2 instanceof C48182gq;
                    }
                    if (r1 instanceof C48082gg) {
                        return r2 instanceof C48082gg;
                    }
                    if (r1 instanceof C47952gS) {
                        return r2 instanceof C47952gS;
                    }
                    if (r1 instanceof C48132gl) {
                        return r2 instanceof C48132gl;
                    }
                    if (r1 instanceof C48262gy) {
                        return r2 instanceof C48262gy;
                    }
                    throw C36441kJ.A18();
                }
            }
        }
    }

    public C40271vE(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }
}
