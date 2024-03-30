package X;

import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.6qg  reason: invalid class name and case insensitive filesystem */
public class C143516qg implements C159297j8, C159307j9 {
    public AnonymousClass6DV A00;
    public AnonymousClass6DV A01;
    public List A02;
    public AnonymousClass00S A03 = new C165077sq(this, 1);
    public boolean A04;
    public final int A05;
    public final C001700s A06 = C36431kI.A0S();
    public final AnonymousClass5pR A07;
    public final C130846Mq A08;
    public final C125025zC A09;
    public final AnonymousClass7g4 A0A;
    public final AnonymousClass7g5 A0B;
    public final AnonymousClass7g7 A0C;
    public final AnonymousClass6L1 A0D;
    public final C122325uf A0E;
    public final C121395t4 A0F;
    public final C116785lC A0G;
    public final AnonymousClass6QK A0H;
    public final C160627lJ A0I;
    public final AnonymousClass1QW A0J;
    public final String A0K;
    public final C121365t1 A0L;
    public final C159297j8 A0M;
    public final AnonymousClass7g6 A0N;
    public final C143466qb A0O;
    public final C159377jG A0P;
    public final AnonymousClass00S A0Q;
    public final boolean A0R;

    public void BSN(int i, List list) {
        A07(this, 2);
        A06(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002d, code lost:
        if (r9.A02() == false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.AnonymousClass5EL A00(X.AnonymousClass6QG r26, java.util.List r27, int r28) {
        /*
            r25 = this;
            r4 = r27
            r3 = r28
            java.lang.Object r9 = r4.get(r3)
            X.6s9 r9 = (X.C144416s9) r9
            boolean r0 = r26.A04()
            if (r0 != 0) goto L_0x0065
            com.google.android.gms.maps.model.LatLng r5 = X.AnonymousClass6QG.A00(r26)
        L_0x0014:
            int r18 = r28 + 1
            r15 = r25
            X.5zC r0 = r15.A09
            java.lang.String r2 = r0.A0D
            java.lang.String r1 = r0.A0E
            int r11 = r26.A02()
            boolean r0 = r26.A06()
            if (r0 == 0) goto L_0x002f
            boolean r0 = r9.A02()
            r12 = 1
            if (r0 != 0) goto L_0x0030
        L_0x002f:
            r12 = 0
        L_0x0030:
            boolean r13 = r15.A0R
            X.6qv r6 = new X.6qv
            r14 = r6
            r16 = r9
            r19 = r3
            r17 = r4
            r14.<init>(r15, r16, r17, r18, r19)
            r0 = 0
            X.6YJ r7 = new X.6YJ
            r7.<init>(r15, r0)
            X.6qz r8 = new X.6qz
            r19 = r8
            r20 = r15
            r21 = r9
            r22 = r2
            r23 = r1
            r24 = r18
            r19.<init>(r20, r21, r22, r23, r24)
            r10 = 11
            X.5EL r4 = new X.5EL
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.7g6 r0 = r15.A0N
            java.lang.String r0 = r0.BHC()
            r4.A02 = r0
            return r4
        L_0x0065:
            r5 = 0
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C143516qg.A00(X.6QG, java.util.List, int):X.5EL");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A02() {
        /*
            r10 = this;
            X.5uf r3 = r10.A0E
            java.util.concurrent.atomic.AtomicInteger r6 = r3.A02
            int r5 = r6.get()
            r4 = 14
            X.5zC r2 = r10.A09
            X.6Du r0 = r2.A05
            if (r0 == 0) goto L_0x0054
            java.util.List r1 = r0.A09
            int r0 = r1.size()
            if (r5 >= r0) goto L_0x0054
            int r4 = r4 + r5
            int r0 = r1.size()
            int r0 = java.lang.Math.min(r4, r0)
            java.util.List r1 = r1.subList(r5, r0)
        L_0x0025:
            java.lang.String r7 = r2.A0F
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            boolean r0 = X.C36401kF.A1a(r1)
            if (r0 == 0) goto L_0x0081
            int r0 = r1.size()
            r6.addAndGet(r0)
            X.6uh r2 = r3.A00
            java.util.ArrayList r8 = X.C36321k7.A0J(r1)
            java.util.Iterator r1 = r1.iterator()
        L_0x0042:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0059
            java.lang.Object r0 = r1.next()
            X.6s9 r0 = (X.C144416s9) r0
            java.lang.String r0 = r0.A0E
            r8.add(r0)
            goto L_0x0042
        L_0x0054:
            java.util.List r1 = java.util.Collections.emptyList()
            goto L_0x0025
        L_0x0059:
            java.util.List r0 = r3.A01
            java.util.ArrayList r9 = X.C36361kB.A0q(r0)
            java.lang.String r1 = "full_details"
            X.50y r0 = new X.50y
            r0.<init>(r1)
            r9.add(r0)
            X.7fx r3 = r2.A0J
            X.5m0 r0 = r2.A0M
            X.64l r5 = r0.A00
            X.6uc r4 = new X.6uc
            r4.<init>(r2, r8)
            r6 = 0
            X.515 r1 = r3.B4A(r4, r5, r6, r7, r8, r9)
            r1.A0B()
            java.util.Set r0 = r2.A0O
            r0.add(r1)
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C143516qg.A02():void");
    }

    public static void A04(C128836Du r14, C143516qg r15) {
        String str;
        String str2;
        AnonymousClass514 r2;
        int i = r15.A05;
        if (i == 1) {
            C20810yC r1 = r15.A0J.A03;
            if (C90494aF.A1X(r1) && r1.A0E(4844)) {
                r15.A02();
                return;
            }
        }
        C20810yC r12 = r15.A0J.A03;
        if (C90494aF.A1X(r12) && r12.A0E(1920) && (str = r14.A05) != null && !str.isEmpty() && !r14.A09.isEmpty()) {
            if (i == 0) {
                str2 = r15.A09.A0F;
            } else {
                str2 = null;
            }
            C122325uf r13 = r15.A0E;
            C145896uh r0 = r13.A00;
            List list = r13.A01;
            C145906ui r9 = new C145906ui(r0, str);
            r0.A01 = r9;
            C158147fs r3 = r0.A0G;
            C1265464l r10 = r0.A0M.A00;
            C164417rm r32 = (C164417rm) r3;
            int i2 = r32.A01;
            Object obj = r32.A00;
            if (i2 != 0) {
                C18800tq r22 = ((AnonymousClass1U2) obj).A00;
                C20810yC A0V = C36341k9.A0V(r22);
                C19700wN A0V2 = C36391kE.A0V(r22);
                C19770wU A0Z = C36341k9.A0Z(r22);
                C18820ts A0T = C36341k9.A0T(r22);
                C18830tt r16 = r22.A00;
                r2 = new AnonymousClass514(A0V2, C18830tt.A13(r16), C90494aF.A0J(r16), C36411kG.A0c(r22), A0T, A0V, r9, r10, C90494aF.A0O(r16), A0Z, str, str2, list);
            } else {
                C18800tq r23 = ((C27121Mz) obj).A01;
                C20810yC A0V3 = C36341k9.A0V(r23);
                C19700wN A0V4 = C36391kE.A0V(r23);
                C19770wU A0Z2 = C36341k9.A0Z(r23);
                C18820ts A0T2 = C36341k9.A0T(r23);
                C18830tt r17 = r23.A00;
                r2 = new AnonymousClass514(A0V4, C18830tt.A13(r17), C90494aF.A0J(r17), C36411kG.A0c(r23), A0T2, A0V3, r9, r10, C90494aF.A0O(r17), A0Z2, str, str2, list);
            }
            r0.A0O.add(r2);
            r2.A0B();
        }
    }

    public static void A06(C143516qg r12) {
        C128836Du r1;
        Object r6;
        C125025zC r3 = r12.A09;
        List list = r3.A0J;
        list.clear();
        AnonymousClass7g5 r4 = r12.A0B;
        AnonymousClass6QG BH2 = r4.BH2();
        if (BH2 != null && (r1 = r3.A05) != null) {
            if (r12.A05 == 0) {
                C105235Dw A032 = r12.A0H.A03(r12.A0I, r1.A08);
                if (A032 != null) {
                    list.add(A032);
                }
                List list2 = r3.A05.A06;
                r12.A03(BH2, list2, Math.min(2, list2.size()));
                if (list2.size() >= 2) {
                    list.add(new C105085Dh());
                    list.add(new C105165Dp(new C135436ch(r12, 43)));
                }
                if (!r3.A05.A09.isEmpty()) {
                    list.add(new AnonymousClass5EI(BH2, r12.A0Q, R.string.f12nameremoved));
                }
            }
            int i = r3.A02;
            if (r3.A0I) {
                if (i != 3) {
                    r6 = new AnonymousClass5E7();
                } else if (!(r3.A05 == null || r4.BH2() == null)) {
                    r6 = new AnonymousClass5E6(r3.A05.A00.A00, r4.BH2(), r3.A0G, r12.A03, new C1510077q(r12));
                }
                list.add(r6);
            }
            C128836Du r7 = r3.A05;
            int i2 = r3.A02;
            boolean z = true;
            if (i2 == 1 || i2 == 3) {
                List list3 = r7.A09;
                for (int i3 = 0; i3 < list3.size(); i3++) {
                    list.add(r12.A00(BH2, list3, i3));
                    list.add(new C105085Dh());
                }
                if (!list.isEmpty()) {
                    list.remove(C36421kH.A06(list, 1));
                }
            } else {
                if (i2 == 2) {
                    z = false;
                }
                list.add(new C105245Dx(false, z));
            }
            if (r3.A0H) {
                list.addAll(r12.A01());
            } else {
                list.add(new AnonymousClass5EM(0));
            }
            r3.A03 = 2;
            r12.A0B();
        }
    }

    public static void A07(C143516qg r1, int i) {
        C125025zC r12 = r1.A09;
        int i2 = r12.A02;
        if (!(i2 == 0 || i2 == i)) {
            i = 3;
        }
        r12.A02 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r4.A05 == 0) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Integer A08() {
        /*
            r4 = this;
            X.5zC r3 = r4.A09
            X.6Du r0 = r3.A05
            if (r0 != 0) goto L_0x0008
            r0 = 0
            return r0
        L_0x0008:
            X.7g4 r0 = r4.A0A
            boolean r0 = r0.BMb()
            if (r0 == 0) goto L_0x0026
            boolean r0 = r3.A0H
            if (r0 == 0) goto L_0x0021
            X.6Du r0 = r3.A05
            java.util.List r0 = r0.A09
            int r0 = r0.size()
        L_0x001c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x0021:
            int r0 = r4.A05
            r2 = 5
            if (r0 != 0) goto L_0x0028
        L_0x0026:
            r2 = 14
        L_0x0028:
            int r0 = r3.A00
            int r1 = r0 + 1
            int r1 = r1 * r2
            X.6Du r0 = r3.A05
            java.util.List r0 = r0.A09
            int r0 = r0.size()
            int r0 = java.lang.Math.min(r1, r0)
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C143516qg.A08():java.lang.Integer");
    }

    public void A09() {
        C145896uh r0 = this.A0E.A00;
        r0.A00();
        r0.A09 = null;
        r0.A07 = null;
        this.A0F.A00.A07 = null;
    }

    public void A0A() {
        if (this.A0A.BMb()) {
            C125025zC r1 = this.A09;
            if (!r1.A0H) {
                r1.A03 = 9;
                A0B();
            }
        }
        C125025zC r12 = this.A09;
        r12.A03 = 7;
        r12.A00++;
        if (this.A05 == 1) {
            C20810yC r13 = this.A0J.A03;
            if (C90494aF.A1X(r13) && r13.A0E(4844)) {
                A02();
            }
        }
        A0B();
    }

    public void A0B() {
        C143466qb r0 = this.A0O;
        if (r0 == null || r0.A09()) {
            this.A06.A0D(this.A09);
        }
    }

    public void A0C() {
        C125025zC r3 = this.A09;
        List list = r3.A0J;
        if (!list.isEmpty()) {
            int A072 = C36431kI.A07(list);
            if (list.get(A072) instanceof AnonymousClass5EM) {
                list.remove(A072);
                r3.A03 = 2;
                A0B();
            }
        }
    }

    public void A0D(String str) {
        C125025zC r5 = this.A09;
        r5.A05 = null;
        r5.A0H = false;
        r5.A00 = 0;
        r5.A0F = str;
        r5.A04 = new C119215pS(150, (String) null);
        r5.A03 = 0;
        r5.A0J.clear();
        AnonymousClass6L1 r2 = this.A0D;
        AnonymousClass6DV r1 = r2.A00;
        if (r1 != null) {
            r1.A00 = true;
            r2.A00 = null;
        }
        r2.A03.clear();
        r2.A01.clear();
        this.A02 = null;
        r5.A08 = null;
        AnonymousClass6DV r12 = this.A00;
        if (r12 != null) {
            r12.A00 = true;
            this.A00 = null;
        }
        AnonymousClass6DV r13 = this.A01;
        if (r13 != null) {
            r13.A00 = true;
            this.A01 = null;
        }
        this.A0E.A02.set(0);
        A0B();
    }

    public void A0E(Map map) {
        if (this.A0A.BMb()) {
            C125025zC r3 = this.A09;
            if (r3.A05 != null) {
                AnonymousClass6L1 r2 = this.A0D;
                List list = r2.A03;
                ArrayList A002 = AnonymousClass6L1.A00(list, map);
                list.clear();
                list.addAll(A002);
                r2.A01 = AnonymousClass6L1.A00(r2.A01, map);
                List list2 = r3.A05.A09;
                list2.clear();
                list2.addAll(A002);
                A06(this);
                return;
            }
            return;
        }
        C125025zC r7 = this.A09;
        C128836Du r0 = r7.A05;
        if (r0 != null) {
            List<C144416s9> list3 = r0.A09;
            AnonymousClass00C.A0D(map, 1);
            ArrayList A0J2 = C36321k7.A0J(list3);
            for (C144416s9 r32 : list3) {
                if (r32.A01 != 1) {
                    AnonymousClass6CB r02 = (AnonymousClass6CB) map.get(r32.A0F);
                    if (r02 != null) {
                        List list4 = r02.A02;
                        List list5 = r02.A03;
                        String str = r02.A01;
                        r32 = C144416s9.A00(r32);
                        r32.A06 = list4;
                        r32.A05 = list5;
                        r32.A04 = str;
                        r32.A01 = 1;
                    }
                    AnonymousClass00C.A0B(r32);
                }
                A0J2.add(r32);
            }
            List list6 = r7.A05.A09;
            list6.clear();
            list6.addAll(A0J2);
            r7.A0J.clear();
            A05(this);
        }
    }

    public void BSO(Map map) {
        C125025zC r9 = this.A09;
        ArrayList A15 = C36441kJ.A15(r9.A0G);
        Map map2 = map;
        AnonymousClass00C.A0D(map2, 1);
        ArrayList A0J2 = C36321k7.A0J(A15);
        Iterator it = A15.iterator();
        while (it.hasNext()) {
            C144426sA r7 = (C144426sA) it.next();
            C144406s8 r6 = r7.A0B;
            if (r6.A03 == null) {
                String str = r6.A0A;
                C144416s9 r5 = (C144416s9) map2.get(str);
                if (r5 != null) {
                    double d = r6.A06;
                    double d2 = r6.A07;
                    boolean z = r6.A0B;
                    double d3 = r6.A08;
                    AnonymousClass544 r18 = r6.A09;
                    double d4 = r6.A00;
                    boolean z2 = z;
                    C144416s9 r17 = r5;
                    String str2 = str;
                    double d5 = d;
                    C144406s8 r16 = new C144406s8(r17, r18, r6.A05, r6.A04, str2, d5, d2, d3, d4, r6.A01, r6.A02, z2);
                    r16.A00 = r6.A00;
                    r16.A01 = r6.A01;
                    r16.A02 = r6.A02;
                    r16.A05 = r6.A05;
                    r16.A04 = r6.A04;
                    C144426sA r1 = new C144426sA(r16, r7.A06, r7.A05, r7.A09);
                    r1.A07 = r7.A07;
                    r1.A08 = r7.A08;
                    r1.A02 = r7.A02;
                    r1.A01 = r7.A01;
                    r1.A00 = r7.A00;
                    r1.A0A = r7.A0A;
                    r1.A04 = r7.A04;
                    r1.A03 = r7.A03;
                    r7 = r1;
                }
            }
            A0J2.add(r7);
        }
        r9.A0G = C36361kB.A0q(C163907qx.A00(A0J2, 7));
        A07(this, 2);
        A06(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0119, code lost:
        if (r0.A09.isEmpty() != false) goto L_0x011b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BST(X.C128836Du r21) {
        /*
            r20 = this;
            r1 = r20
            X.5zC r2 = r1.A09
            X.6Du r0 = r2.A05
            if (r0 != 0) goto L_0x000f
            X.5uf r0 = r1.A0E
            X.6uh r0 = r0.A00
            r0.A00()
        L_0x000f:
            X.6Du r3 = r2.A05
            r0 = r21
            if (r3 == 0) goto L_0x0022
            java.lang.String r4 = r3.A03
            if (r4 == 0) goto L_0x0022
            java.lang.String r3 = r0.A03
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0022
            return
        L_0x0022:
            boolean r3 = r1.A04
            if (r3 == 0) goto L_0x003c
            X.7g5 r3 = r1.A0B
            X.6QG r4 = r3.BH2()
            java.util.List r3 = r0.A06
            int r0 = r3.size()
            r1.A03(r4, r3, r0)
            r0 = 2
        L_0x0036:
            r2.A03 = r0
            r1.A0B()
            return
        L_0x003c:
            int r7 = r1.A05
            r3 = 1
            if (r7 == r3) goto L_0x0044
            r3 = 2
            if (r7 != r3) goto L_0x0092
        L_0x0044:
            X.6Oz r4 = r0.A00
            X.6bz r3 = r4.A00
            if (r3 == 0) goto L_0x0092
            java.util.ArrayList r13 = X.AnonymousClass001.A0I()
            java.util.List r3 = r4.A01
            r13.add(r3)
            r5 = 0
            java.lang.Object r3 = r13.get(r5)
            java.util.List r3 = (java.util.List) r3
            boolean r3 = X.C36401kF.A1a(r3)
            r2.A0I = r3
            X.5x0 r4 = new X.5x0
            r4.<init>()
            r2.A06 = r4
            java.lang.Object r3 = r13.get(r5)
            java.util.List r3 = (java.util.List) r3
            int r3 = r3.size()
            r4.A01 = r3
            X.7g5 r3 = r1.A0B
            X.6QG r9 = r3.BH2()
            X.C18740tg.A06(r9)
            java.lang.String r12 = r0.A02
            r14 = 2
            java.lang.Double r11 = r0.A01
            X.7tK r10 = new X.7tK
            r10.<init>(r0, r1, r5)
            X.6DV r8 = new X.6DV
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r1.A01 = r8
            X.6Mq r3 = r1.A08
            r3.A00(r8)
        L_0x0092:
            X.7g5 r8 = r1.A0B
            X.6QG r3 = r8.BH2()
            if (r3 == 0) goto L_0x00f9
            X.6QG r3 = r8.BH2()
            boolean r3 = r3.A07()
            if (r3 == 0) goto L_0x00f9
            java.util.List r3 = r0.A09
            X.6QG r11 = r8.BH2()
            java.util.ListIterator r10 = r3.listIterator()
        L_0x00ae:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x00f9
            java.lang.Object r5 = r10.next()
            X.6s9 r5 = (X.C144416s9) r5
            java.util.List r4 = r5.A0K
            if (r4 == 0) goto L_0x00ae
            boolean r3 = r4.isEmpty()
            if (r3 != 0) goto L_0x00ae
            java.lang.String r3 = r5.A0D
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x00ae
            java.lang.Object r9 = X.C36391kE.A0t(r4)
            X.6bY r9 = (X.C134756bY) r9
            double r5 = r9.A00
            double r3 = r9.A01
            com.google.android.gms.maps.model.LatLng r4 = X.C90524aI.A0F(r5, r3)
            com.google.android.gms.maps.model.LatLng r5 = X.AnonymousClass6QG.A00(r11)
            java.lang.String r3 = "origin"
            android.location.Location r4 = X.C90474aD.A0J(r4, r3)
            java.lang.String r3 = "destination"
            android.location.Location r3 = X.C90474aD.A0J(r5, r3)
            float r4 = r4.distanceTo(r3)
            int r3 = r9.A02
            float r3 = (float) r3
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x00ae
            r10.remove()
            goto L_0x00ae
        L_0x00f9:
            X.7g4 r3 = r1.A0A
            boolean r3 = r3.BMb()
            if (r3 == 0) goto L_0x01ef
            java.lang.String r12 = r0.A03
            r4 = 150(0x96, float:2.1E-43)
            X.5pS r3 = new X.5pS
            r3.<init>(r4, r12)
            r2.A04 = r3
            boolean r3 = android.text.TextUtils.isEmpty(r12)
            if (r3 != 0) goto L_0x011b
            java.util.List r3 = r0.A09
            boolean r4 = r3.isEmpty()
            r3 = 0
            if (r4 == 0) goto L_0x011c
        L_0x011b:
            r3 = 1
        L_0x011c:
            r2.A0H = r3
            X.6Du r3 = r2.A05
            if (r3 != 0) goto L_0x015f
            r9 = r0
        L_0x0123:
            r2.A05 = r9
            X.6QK r3 = r1.A0H
            boolean r3 = r3.A02
            if (r3 == 0) goto L_0x019b
            java.util.List r11 = r1.A02
            if (r11 != 0) goto L_0x0135
            java.util.ArrayList r11 = X.AnonymousClass001.A0I()
            r1.A02 = r11
        L_0x0135:
            X.5lC r10 = r1.A0G
            java.util.List r0 = r0.A09
            java.util.ArrayList r12 = X.AnonymousClass001.A0I()
            java.util.Iterator r13 = r0.iterator()
        L_0x0141:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x017f
            java.lang.Object r9 = r13.next()
            X.6s9 r9 = (X.C144416s9) r9
            double r3 = r9.A00
            double r5 = r10.A00
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0141
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0141
            r12.add(r9)
            goto L_0x0141
        L_0x015f:
            java.util.List r6 = r3.A06
            X.6Oz r10 = r3.A00
            java.util.List r5 = r0.A07
            java.util.List r4 = r0.A09
            java.util.List r3 = r0.A08
            java.lang.String r13 = r0.A05
            java.lang.Double r11 = r0.A01
            java.lang.String r14 = r0.A04
            java.lang.String r15 = r0.A02
            X.6Du r9 = new X.6Du
            r17 = r6
            r18 = r4
            r19 = r3
            r16 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0123
        L_0x017f:
            r11.addAll(r12)
            java.util.List r0 = r1.A02
            int r3 = r0.size()
            X.6L1 r0 = r1.A0D
            java.util.List r0 = r0.A01
            int r3 = X.C90524aI.A04(r0, r3)
            r0 = 5
            if (r3 >= r0) goto L_0x019e
            boolean r0 = r2.A0H
            if (r0 != 0) goto L_0x019e
            r0 = 10
            goto L_0x0036
        L_0x019b:
            java.util.List r4 = r0.A09
            goto L_0x01a0
        L_0x019e:
            java.util.List r4 = r1.A02
        L_0x01a0:
            X.6Du r0 = r2.A05
            X.6L1 r13 = r1.A0D
            X.6QG r5 = r8.BH2()
            X.C18740tg.A06(r5)
            java.lang.String r8 = r0.A02
            boolean r3 = r2.A0H
            r10 = 2
            if (r7 != 0) goto L_0x01b3
            r10 = 1
        L_0x01b3:
            X.5pV r12 = new X.5pV
            r12.<init>(r0, r1)
            java.lang.Double r7 = r0.A01
            java.util.List r0 = r13.A01
            java.util.ArrayList r14 = X.C36441kJ.A15(r0)
            r14.addAll(r4)
            java.util.List r0 = r13.A01
            r0.addAll(r4)
            X.6DV r2 = r13.A00
            if (r2 == 0) goto L_0x01d2
            r0 = 1
            r2.A00 = r0
            r0 = 0
            r13.A00 = r0
        L_0x01d2:
            java.util.ArrayList r9 = X.C90484aE.A0r(r14)
            X.6qe r6 = new X.6qe
            r11 = r6
            r15 = r10
            r16 = r3
            r11.<init>(r12, r13, r14, r15, r16)
            X.6DV r4 = new X.6DV
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r13.A00 = r4
            X.6Mq r0 = r13.A02
            r0.A00(r4)
            r0 = 0
            r1.A02 = r0
            return
        L_0x01ef:
            java.util.List r2 = r0.A09
            java.util.ArrayList r2 = X.C36441kJ.A15(r2)
            java.util.ArrayList r9 = X.C90484aE.A0r(r2)
            X.6QG r5 = r8.BH2()
            X.C18740tg.A06(r5)
            java.lang.String r8 = r0.A02
            r10 = 2
            if (r7 != 0) goto L_0x0206
            r10 = 1
        L_0x0206:
            java.lang.Double r7 = r0.A01
            X.6qc r6 = new X.6qc
            r6.<init>(r0, r1, r2)
            X.6DV r4 = new X.6DV
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r1.A00 = r4
            X.6Mq r0 = r1.A08
            r0.A00(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C143516qg.BST(X.6Du):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00b7, code lost:
        if (r1.A0E(1920) == false) goto L_0x00b9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C143516qg(X.AnonymousClass5pR r13, X.C121365t1 r14, X.C130846Mq r15, X.AnonymousClass7g4 r16, X.AnonymousClass7g5 r17, X.AnonymousClass7g6 r18, X.AnonymousClass7g7 r19, X.AnonymousClass6L1 r20, X.C122325uf r21, X.C121395t4 r22, X.C116785lC r23, X.AnonymousClass6QK r24, X.C143466qb r25, X.C160627lJ r26, X.C159377jG r27, X.AnonymousClass1QW r28, int r29) {
        /*
            r12 = this;
            r12.<init>()
            X.00s r0 = X.C36431kI.A0S()
            r12.A06 = r0
            r1 = 1
            X.7sq r0 = new X.7sq
            r0.<init>(r12, r1)
            r12.A03 = r0
            X.6qf r1 = new X.6qf
            r1.<init>(r12)
            r12.A0M = r1
            r0 = r29
            r12.A05 = r0
            r3 = r28
            r12.A0J = r3
            r0 = r24
            r12.A0H = r0
            r0 = r25
            r12.A0O = r0
            r0 = r17
            r12.A0B = r0
            r12.A0L = r14
            r0 = r23
            r12.A0G = r0
            r0 = r18
            r12.A0N = r0
            r0 = r16
            r12.A0A = r0
            r2 = r22
            r12.A0F = r2
            r0 = r19
            r12.A0C = r0
            r0 = r20
            r12.A0D = r0
            r6 = r21
            r12.A0E = r6
            r0 = r26
            r12.A0I = r0
            r4 = r27
            r12.A0P = r4
            r12.A07 = r13
            X.6uh r0 = r2.A00
            r0.A07 = r12
            r5 = 0
            X.5zC r0 = new X.5zC
            r0.<init>()
            r12.A09 = r0
            X.6uh r0 = r6.A00
            r0.A09 = r12
            r0.A07 = r1
            r12.A08 = r15
            X.8eT r10 = r14.A01
            android.content.SharedPreferences r0 = r10.A00()
            java.lang.String r11 = "pref_saved_search_session_id"
            java.lang.String r6 = X.C36371kC.A0t(r0, r11)
            if (r6 == 0) goto L_0x00c4
            int r0 = r6.length()
            if (r0 == 0) goto L_0x00c4
            android.content.SharedPreferences r2 = r10.A00()
            java.lang.String r9 = "pref_saved_search_session_ts"
            r0 = 0
            long r7 = r2.getLong(r9, r0)
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x00c4
            long r7 = X.C36441kJ.A0A(r7)
            r1 = 1800000(0x1b7740, double:8.89318E-318)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c4
            android.content.SharedPreferences$Editor r2 = X.C90474aD.A0H(r10)
            long r0 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences$Editor r0 = r2.putLong(r9, r0)
        L_0x00a3:
            r0.apply()
            r12.A0K = r6
            X.0yC r1 = r3.A03
            boolean r0 = X.C90494aF.A1X(r1)
            if (r0 == 0) goto L_0x00b9
            r0 = 1920(0x780, float:2.69E-42)
            boolean r1 = r1.A0E(r0)
            r0 = 1
            if (r1 != 0) goto L_0x00ba
        L_0x00b9:
            r0 = 0
        L_0x00ba:
            r12.A0R = r0
            X.7sq r0 = new X.7sq
            r0.<init>(r4, r5)
            r12.A0Q = r0
            return
        L_0x00c4:
            java.lang.String r6 = X.C90464aC.A0V()
            android.content.SharedPreferences$Editor r0 = X.C90474aD.A0H(r10)
            X.C36341k9.A0x(r0, r11, r6)
            android.content.SharedPreferences$Editor r7 = X.C90474aD.A0H(r10)
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = "pref_saved_search_session_ts"
            X.C36341k9.A0w(r7, r2, r0)
            android.content.SharedPreferences$Editor r1 = X.C90474aD.A0H(r10)
            java.lang.String r0 = "pref_saved_search_session_action_order"
            android.content.SharedPreferences$Editor r0 = r1.putInt(r0, r5)
            goto L_0x00a3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C143516qg.<init>(X.5pR, X.5t1, X.6Mq, X.7g4, X.7g5, X.7g6, X.7g7, X.6L1, X.5uf, X.5t4, X.5lC, X.6QK, X.6qb, X.7lJ, X.7jG, X.1QW, int):void");
    }

    private ArrayList A01() {
        Object r1;
        ArrayList A0I2 = AnonymousClass001.A0I();
        if (this.A05 != 0) {
            AnonymousClass7g5 r12 = this.A0B;
            if (r12.BH2() != null && r12.BH2().A04() && !this.A0J.A05()) {
                r1 = new AnonymousClass5EF(this.A0P, this.A0N.BHC());
                A0I2.add(r1);
                return A0I2;
            }
        }
        r1 = new AnonymousClass5EO((String) null);
        A0I2.add(r1);
        return A0I2;
    }

    private void A03(AnonymousClass6QG r4, List list, int i) {
        if (!list.isEmpty()) {
            List list2 = this.A09.A0J;
            list2.add(new AnonymousClass5EP(2));
            for (int i2 = 0; i2 < i; i2++) {
                list2.add(A00(r4, list, i2));
            }
        }
    }

    public static void A05(C143516qg r9) {
        ArrayList A0I2 = AnonymousClass001.A0I();
        AnonymousClass6QG BH2 = r9.A0B.BH2();
        if (BH2 != null) {
            C125025zC r3 = r9.A09;
            C128836Du r1 = r3.A05;
            C18740tg.A07(r1, "BusinessListItemDelegate/addNextBusinessProfilesPage Current search results cannot be null");
            List list = r1.A09;
            int size = list.size();
            int i = r9.A05;
            boolean A042 = BH2.A04();
            if (i == 0) {
                if (A042 && r9.A0J.A05()) {
                    r3.A0J.add(new AnonymousClass5EF(r9.A0P, r9.A0N.BHC()));
                }
                C105235Dw A032 = r9.A0H.A03(r9.A0I, r3.A05.A08);
                if (A032 != null) {
                    r3.A0J.add(A032);
                }
                List list2 = r3.A05.A06;
                r9.A03(BH2, list2, Math.min(2, list2.size()));
                if (!r3.A05.A09.isEmpty()) {
                    r3.A0J.add(new AnonymousClass5EI(BH2, r9.A0Q, R.string.f12nameremoved));
                }
            } else if (A042 && r9.A0J.A05()) {
                A0I2.add(new AnonymousClass5EI(BH2, r9.A0Q, R.string.f12nameremoved));
            }
            for (int i2 = 0; i2 < size; i2++) {
                A0I2.add(r9.A00(BH2, list, i2));
                A0I2.add(new C105085Dh());
            }
            A0I2.remove(A0I2.size() - 1);
            List list3 = r3.A0J;
            list3.addAll(A0I2);
            list3.addAll(r9.A01());
            r3.A0H = true;
            r3.A03 = 2;
            r9.A0B();
        }
    }

    public void BSS(C1261662u r3, int i) {
        A0C();
        C125025zC r1 = this.A09;
        r1.A01 = i;
        r1.A03 = 8;
        A0B();
    }
}
