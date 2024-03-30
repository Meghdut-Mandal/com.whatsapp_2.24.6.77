package X;

import android.app.Application;
import com.whatsapp.R;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/* renamed from: X.4km  reason: invalid class name and case insensitive filesystem */
public class C95394km extends AnonymousClass08X implements C160727lU, C160627lJ, C159377jG, C159357jE, AnonymousClass4PO {
    public int A00;
    public int A01;
    public int A02;
    public C128836Du A03;
    public Jid A04;
    public Stack A05;
    public boolean A06;
    public boolean A07;
    public final C001600r A08;
    public final C001600r A09;
    public final AnonymousClass08S A0A;
    public final AnonymousClass08S A0B;
    public final AnonymousClass08M A0C;
    public final C142616pA A0D;
    public final C142646pD A0E;
    public final C145896uh A0F;
    public final C129006Eo A0G;
    public final C1260562j A0H;
    public final AnonymousClass6MI A0I;
    public final C143516qg A0J;
    public final AnonymousClass6QK A0K;
    public final C119295pa A0L;
    public final C122345uh A0M;
    public final C143466qb A0N;
    public final AnonymousClass1QW A0O;
    public final C33191es A0P;
    public final C28201Rs A0Q;
    public final C28201Rs A0R;
    public final C28201Rs A0S;
    public final C28201Rs A0T;
    public final C28201Rs A0U = C36441kJ.A0t();
    public final C28201Rs A0V = C36441kJ.A0t();
    public final Set A0W;
    public final C001600r A0X;
    public final AnonymousClass1KK A0Y;
    public final AnonymousClass5DR A0Z;

    public static void A08(C128836Du r13, C95394km r14) {
        r14.A02 = 1;
        r14.A0T.A0D(r14.A0S.A04());
        C143516qg r1 = r14.A0J;
        r1.A0D((String) null);
        List emptyList = Collections.emptyList();
        AnonymousClass00C.A0D(emptyList, 0);
        List list = r13.A06;
        List list2 = r13.A09;
        List list3 = r13.A08;
        String str = r13.A03;
        String str2 = r13.A05;
        r1.BST(new C128836Du(r13.A00, r13.A01, str, str2, r13.A04, r13.A02, emptyList, list, list2, list3));
        A0B(r14);
    }

    public static void A0E(C95394km r4, int i) {
        int i2;
        ArrayList arrayList;
        if (i == -1) {
            arrayList = C36441kJ.A15(r4.A04());
            i2 = 1;
        } else if (i == 1 || i == 2 || i == 3) {
            arrayList = C36441kJ.A15(r4.A04());
            i2 = 2;
        } else if (i == 4) {
            r4.A06();
            return;
        } else {
            return;
        }
        C105225Dv.A00(r4, arrayList, i2);
        A0F(r4, arrayList);
        r4.A0D.A04(C143466qb.A00(r4.A0N), 28, i2);
    }

    private void A0L(boolean z) {
        this.A02 = 4;
        this.A00 = 4;
        this.A0A.A0C("nearby_business");
        A0K(z);
        C145896uh r4 = this.A0F;
        AnonymousClass6QG r3 = this.A0N.A00.A01;
        String str = this.A0J.A0K;
        r4.A04(A01(this), this.A0K.A02(), r3, str);
    }

    public void BfX() {
        A0H(this, true);
        this.A0D.A04(C143466qb.A00(this.A0N), 30, 1);
    }

    public static C119215pS A01(C95394km r2) {
        C001600r r1 = r2.A08;
        if (r1.A04() != null) {
            return ((C125025zC) r1.A04()).A04;
        }
        return new C119215pS(150, (String) null);
    }

    public static Integer A02(C95394km r0) {
        return r0.A0G.A03();
    }

    private List A04() {
        C125025zC r1 = (C125025zC) this.A08.A04();
        if (AnonymousClass6MI.A00(this.A0N.A00.A01) && r1 != null) {
            List list = r1.A0J;
            if (!list.isEmpty()) {
                return list;
            }
        }
        return AnonymousClass001.A0I();
    }

    private void A05() {
        this.A0A.A0D("all_categories");
        A0F(this, C90484aE.A0r(new C105125Dl()));
        this.A02 = 0;
        C145896uh r2 = this.A0F;
        AnonymousClass6QG r1 = this.A0N.A00.A01;
        C18740tg.A07(r1, "Trying to fetch the categories, but the search location is null");
        r2.A05(r1);
    }

    private void A06() {
        this.A0B.A0C(AnonymousClass001.A0I());
        C36341k9.A16(this.A0V, 3);
        this.A0D.A04(C143466qb.A00(this.A0N), 28, 6);
    }

    private void A07(C119215pS r13) {
        String str;
        boolean z;
        List list;
        C134986bw r8 = (C134986bw) this.A0T.A04();
        C95434kv r3 = this.A0N.A00;
        if (r3.A01 != null && r8 != null) {
            C119215pS r5 = r13;
            if (r13 == null || r13.A01 == null) {
                AnonymousClass6QK r1 = this.A0K;
                if (!r1.A01.isEmpty() || ((list = r1.A00) != null && !list.isEmpty())) {
                    z = false;
                } else {
                    z = true;
                }
                A0F(this, C90484aE.A0r(new C105245Dx(z, A0N())));
            }
            this.A02 = 1;
            String str2 = null;
            if (r13 == null || r13.A01 == null) {
                C125025zC r2 = this.A0J.A09;
                r2.A0I = false;
                r2.A0G = AnonymousClass001.A0I();
                r2.A02 = 0;
            }
            if (A0N()) {
                str2 = "map_view_serp";
            }
            C145896uh r4 = this.A0F;
            AnonymousClass6QG r7 = r3.A01;
            AnonymousClass6QK r12 = this.A0K;
            if (r12.A0B()) {
                str = "all_descendents";
            } else {
                str = "current";
            }
            r4.A02(r5, r12.A02(), r7, r8, str, this.A0J.A0K, str2);
        }
    }

    public static void A09(C125025zC r13, C95394km r14) {
        String str;
        long j;
        if (r13.A05 != null) {
            C142646pD r2 = r14.A0E;
            Integer A082 = r14.A0J.A08();
            int size = r13.A05.A06.size();
            String str2 = r13.A0F;
            int i = r14.A02;
            if (i == 4 || i == 1) {
                str = "businesses";
            } else {
                str = "recommendations";
            }
            AnonymousClass6QK r1 = r14.A0K;
            List list = r1.A00;
            if (list != null) {
                j = (long) list.size();
            } else {
                j = 0;
            }
            r2.A01(r1.A05(), Boolean.valueOf(r1.A03), Boolean.valueOf(r1.A04), A082, str2, str, r1.A06(), size, A02(r14).intValue(), j);
        }
    }

    public static void A0A(C95394km r14) {
        C134986bw r7 = (C134986bw) r14.A0S.A04();
        if (r7 != null) {
            C95434kv r1 = r14.A0N.A00;
            if (r1.A01 != null) {
                A0F(r14, C90484aE.A0r(new C105125Dl()));
                r14.A02 = 2;
                C145896uh r2 = r14.A0F;
                AnonymousClass6QG r6 = r1.A01;
                String str = r14.A0J.A0K;
                C119215pS r4 = null;
                if (AnonymousClass6MI.A00(r6)) {
                    r4 = new C119215pS(150, (String) null);
                }
                r2.A01();
                C145856ud r8 = new C145856ud(r6, r2);
                r2.A05 = r8;
                AnonymousClass517 B49 = r2.A0H.B49(r4, (C1260462i) null, r6, r7, r8, r2.A0M.A00, (C132406Tm) null, "current", "immediate_children", str, (String) null);
                B49.A0B();
                r2.A00 = B49;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r2 == 2) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0B(X.C95394km r4) {
        /*
            X.6pD r3 = r4.A0E
            int r2 = r4.A02
            if (r2 == 0) goto L_0x000a
            r0 = 2
            r1 = 2
            if (r2 != r0) goto L_0x000b
        L_0x000a:
            r1 = 3
        L_0x000b:
            java.lang.Integer r0 = A02(r4)
            r3.A04(r0, r1, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95394km.A0B(X.4km):void");
    }

    public static void A0C(C95394km r3) {
        int i = r3.A02;
        if (i == 1) {
            A0G(r3, false);
        } else if (i != 3) {
            if (i == 4) {
                r3.A0L(false);
            }
        } else if (A0P(r3)) {
            r3.A0M(false);
        }
    }

    public static void A0D(C95394km r2) {
        C28201Rs r1;
        int i;
        int i2 = r2.A01;
        if (i2 == 0) {
            r2.A0A.A0C("product_name");
            r1 = r2.A0V;
            i = 4;
        } else if (i2 == 1) {
            r1 = r2.A0V;
            i = 7;
        } else {
            return;
        }
        C36341k9.A16(r1, i);
    }

    public static void A0H(C95394km r2, boolean z) {
        int i = r2.A02;
        if (i == 0) {
            r2.A05();
        } else if (i == 1) {
            A0G(r2, z);
        } else if (i == 2) {
            A0A(r2);
        } else if (i == 3) {
            r2.A0M(z);
        } else if (i == 4) {
            r2.A0L(z);
        }
    }

    public static void A0I(C95394km r8, boolean z, boolean z2, boolean z3) {
        boolean z4 = r8.A07;
        Integer A0n = C36371kC.A0n();
        if (!z4) {
            C001600r r3 = r8.A0X;
            if (r3.A04() != null && !((C122335ug) r3.A04()).A03.isEmpty()) {
                if (z2) {
                    r8.A0J(A0n);
                }
                if (z3) {
                    r8.A0E.A04(A02(r8), 3, 3);
                }
                C119295pa r0 = r8.A0L;
                r0.A00.A0C(r0.A01);
                C142616pA r7 = r8.A0D;
                long size = (long) ((C122335ug) r3.A04()).A03.size();
                C143466qb r02 = r8.A0N;
                int A012 = r02.A01();
                int A0E2 = r02.A00.A0E();
                AnonymousClass593 r1 = new AnonymousClass593();
                r1.A0C = C36401kF.A0h();
                r1.A0J = Long.valueOf(size);
                r1.A09 = Integer.valueOf(A012);
                if (A0E2 == 0) {
                    A0E2 = 2;
                }
                r1.A0D = Integer.valueOf(A0E2);
                C142616pA.A01(r7, r1);
                r8.A0S.A0C((Object) null);
                r8.A0A.A0C("all_categories");
                AnonymousClass6QK r12 = r8.A0K;
                r12.A07();
                r12.A00 = null;
                r8.A02 = 0;
            }
        }
        if (r8.A0N.A00.A01 != null) {
            if (A0O(r8)) {
                r8.A05.pop();
            }
            if (z) {
                if (z2) {
                    r8.A0J(A0n);
                }
                if (z3) {
                    r8.A0E.A04(A02(r8), 3, 3);
                }
                r8.A05();
            } else {
                if (z2) {
                    r8.A0J(0);
                }
                A0D(r8);
                return;
            }
        }
        r8.A0S.A0C((Object) null);
        r8.A0A.A0C("all_categories");
        AnonymousClass6QK r122 = r8.A0K;
        r122.A07();
        r122.A00 = null;
        r8.A02 = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 == 2) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0J(java.lang.Integer r10) {
        /*
            r9 = this;
            X.6pD r2 = r9.A0E
            int r1 = r9.A02
            if (r1 == 0) goto L_0x000c
            r0 = 2
            r6 = 2
            r7 = 30
            if (r1 != r0) goto L_0x000f
        L_0x000c:
            r6 = 3
            r7 = 63
        L_0x000f:
            r8 = 1
            java.lang.Integer r3 = A02(r9)
            r5 = 0
            r4 = r10
            r2.A08(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95394km.A0J(java.lang.Integer):void");
    }

    private void A0K(boolean z) {
        if (!z || A01(this) == null || A01(this).A01 == null) {
            this.A0J.A0D((String) null);
            A0F(this, C90484aE.A0r(new C105245Dx(false, A0N())));
        } else if (AnonymousClass6MI.A00(this.A0N.A00.A01)) {
            C143516qg r4 = this.A0J;
            C125025zC r3 = r4.A09;
            List list = r3.A0J;
            if (!list.isEmpty()) {
                list.add(new AnonymousClass5EM(0));
                r3.A03 = 2;
                r4.A0B();
            }
        }
    }

    private void A0M(boolean z) {
        Jid jid;
        C119215pS r4;
        AnonymousClass1QW r2 = this.A0O;
        if (r2.A03.A0E(1616) && r2.A02() && (jid = this.A04) != null) {
            C95434kv r22 = this.A0N.A00;
            if (r22.A01 != null) {
                this.A02 = 3;
                this.A00 = 3;
                this.A0A.A0C("business_chaining");
                A0K(z);
                C1260462i A022 = this.A0K.A02();
                if (A022.A01 == null) {
                    this.A0Y.A0C(new C165247t7(this, A022, 1), C36401kF.A0b(jid));
                    return;
                }
                C145896uh r3 = this.A0F;
                AnonymousClass6QG r6 = r22.A01;
                String str = this.A0J.A0K;
                if (AnonymousClass6MI.A00(r6)) {
                    r4 = A01(this);
                } else {
                    r4 = null;
                }
                r3.A03(r4, A022, r6, jid, str);
            }
        }
    }

    private boolean A0N() {
        AnonymousClass6QG r2 = this.A0N.A00.A01;
        if (r2 == null || r2.A04()) {
            return false;
        }
        int i = r2.A00;
        if (i == -1) {
            Double d = r2.A05;
            if (d == null || d.doubleValue() > 9000.0d) {
                return false;
            }
        } else if (i < 12 || i > 14) {
            return false;
        }
        if (this.A02 != 1) {
            return false;
        }
        AnonymousClass1QW r1 = this.A0O;
        if (!r1.A02() || !r1.A03.A0E(4236)) {
            return false;
        }
        return true;
    }

    public static boolean A0O(C95394km r2) {
        Stack stack = r2.A05;
        if (stack.isEmpty() || AnonymousClass000.A0I(stack.peek()) != 2) {
            return false;
        }
        return true;
    }

    public static boolean A0P(C95394km r3) {
        AnonymousClass1QW r2 = r3.A0O;
        if (!r2.A03.A0E(2192) || !r2.A02() || r3.A04 == null || r3.A02 != 3) {
            return false;
        }
        return true;
    }

    public void A0R() {
        C143466qb r2 = this.A0N;
        C95434kv r0 = r2.A00;
        r0.A02.removeCallbacks(r0.A09);
        r2.A04.A00();
        r2.A01 = null;
        this.A0J.A09();
        C145896uh r02 = this.A0F;
        r02.A0C = null;
        r02.A0D = null;
        r02.A08 = null;
    }

    public C134986bw A0S() {
        C28201Rs r1 = this.A0S;
        if (r1.A04() == null) {
            return null;
        }
        C134986bw r3 = (C134986bw) r1.A04();
        C134986bw r2 = (C134986bw) this.A0T.A04();
        if (r2 != null) {
            Stack stack = this.A05;
            if (stack.isEmpty() || AnonymousClass000.A0I(stack.peek()) != 2) {
                return r3;
            }
            return r2;
        }
        return r3;
    }

    public void A0T() {
        int i = this.A02;
        if (i != 0) {
            if (i == 1) {
                C95434kv r4 = this.A0N.A00;
                int i2 = r4.A00;
                if (!(i2 == 4 || i2 == 3 || i2 == 6 || i2 == 5)) {
                    if (A0O(this)) {
                        this.A05.pop();
                        A0J(3);
                        this.A0E.A04(A02(this), 3, 3);
                        AnonymousClass6QK r0 = this.A0K;
                        r0.A07();
                        r0.A00 = null;
                        this.A02 = 2;
                        if (!this.A07 && this.A09.A04() != null) {
                            C122345uh r02 = this.A0M;
                            r02.A00.A0D(r02.A01);
                        } else if (r4.A01 != null) {
                            A0A(this);
                        }
                        this.A0T.A0C((Object) null);
                        C28201Rs r1 = this.A0S;
                        r1.A0C(r1.A04());
                        return;
                    }
                    A0I(this, this.A06, true, true);
                    return;
                }
            } else if (i == 2) {
                int i3 = this.A0N.A00.A00;
                if (!(i3 == 4 || i3 == 3 || i3 == 6 || i3 == 5)) {
                    A0I(this, this.A06, true, false);
                    return;
                }
            } else if (i != 3) {
                if (i != 4) {
                    return;
                }
            }
            A0J((Integer) null);
            C36341k9.A16(this.A0V, 2);
            return;
        }
        A0J(0);
        A0D(this);
    }

    public void A0U() {
        C143516qg r5 = this.A0J;
        C125025zC r3 = (C125025zC) r5.A06.A04();
        if (r5.A09.A03 != 9 && r3 != null && r3.A05 != null) {
            C95434kv r2 = this.A0N.A00;
            if (r2.A01 != null) {
                r5.A0A();
                AnonymousClass6QG r4 = r2.A01;
                if (AnonymousClass6MI.A00(r4) && !r3.A0H) {
                    int i = this.A02;
                    if (i == 1) {
                        A07(A01(this));
                    } else if (i != 3) {
                        if (i == 4) {
                            C145896uh r32 = this.A0F;
                            String str = r5.A0K;
                            r32.A04(A01(this), this.A0K.A02(), r4, str);
                        }
                    } else if (A0P(this)) {
                        C145896uh r33 = this.A0F;
                        Jid jid = this.A04;
                        AnonymousClass6QG r6 = r2.A01;
                        String str2 = r5.A0K;
                        r33.A03(A01(this), this.A0K.A02(), r6, jid, str2);
                    }
                }
            }
        }
    }

    public void A0V(int i) {
        String str;
        String str2;
        C128836Du r0 = this.A03;
        if (r0 != null) {
            C142616pA r8 = this.A0D;
            long size = (long) r0.A09.size();
            AnonymousClass6QK r1 = this.A0K;
            long A062 = (long) C36371kC.A06(r1.A00);
            C143466qb r02 = this.A0N;
            int A012 = r02.A01();
            int i2 = this.A00;
            int A0E2 = r02.A00.A0E();
            String str3 = this.A03.A04;
            Boolean A052 = r1.A05();
            if (r1.A03) {
                str = "has_catalog";
            } else {
                str = null;
            }
            if (r1.A04) {
                str2 = "open_now";
            } else {
                str2 = null;
            }
            String A063 = r1.A06();
            AnonymousClass593 A002 = AnonymousClass593.A00(i);
            A002.A0I = Long.valueOf(size);
            AnonymousClass593.A01(A002, A012, i2, A062);
            if (A0E2 == 0) {
                A0E2 = 2;
            }
            A002.A0D = Integer.valueOf(A0E2);
            A002.A0O = str3;
            A002.A00 = A052;
            A002.A0P = str;
            A002.A0Q = str2;
            A002.A0R = A063;
            A002.A0S = r8.A01;
            A002.A0A = Integer.valueOf(r8.A00);
            A002.A0H = C90474aD.A0Y();
            r8.A04.Bly(A002);
        }
    }

    public void BR4() {
        if (this.A0O.A05()) {
            C142616pA r2 = this.A0D;
            Integer A002 = C143466qb.A00(this.A0N);
            AnonymousClass593 A003 = AnonymousClass593.A00(3);
            A003.A09 = A002;
            C142616pA.A01(r2, A003);
            this.A0Z.A02(true);
        }
        C36341k9.A17(this.A0Q, 3);
    }

    public void BTD() {
        C119305pb A042 = this.A0K.A04();
        if (A042 != null) {
            this.A0R.A0C(A042);
        }
    }

    public void BTG() {
        C28201Rs r2;
        Integer num;
        int i;
        C143466qb r0 = this.A0N;
        r0.A03();
        C95434kv r4 = r0.A00;
        int i2 = r4.A00;
        if (i2 != 0) {
            int i3 = 7;
            i = 2;
            if (i2 == 2) {
                r2 = this.A0U;
                if (this.A02 == 0) {
                    i3 = 6;
                }
                num = Integer.valueOf(i3);
                r2.A0D(C36441kJ.A0Q(num, r4.A01));
            } else if (i2 == 4) {
                r2 = this.A0U;
                num = Integer.valueOf(i);
                r2.A0D(C36441kJ.A0Q(num, r4.A01));
            } else if (i2 != 7) {
                return;
            }
        }
        r2 = this.A0U;
        i = C90504aG.A1T(this.A02);
        num = Integer.valueOf(i);
        r2.A0D(C36441kJ.A0Q(num, r4.A01));
    }

    public void BTX(int i) {
        C143466qb r3;
        C28201Rs r2;
        int i2;
        if (i == 0 || i == 7 || i == 6) {
            C142616pA r22 = this.A0D;
            r3 = this.A0N;
            r22.A04(C143466qb.A00(r3), 29, 0);
            r2 = this.A0U;
            i2 = 8;
        } else if (i == 3) {
            C142616pA r1 = this.A0D;
            r3 = this.A0N;
            r1.A04(C143466qb.A00(r3), 29, 3);
            r2 = this.A0U;
            i2 = 5;
        } else {
            return;
        }
        r2.A0D(C36441kJ.A0Q(Integer.valueOf(i2), r3.A00.A01));
    }

    public void BTa() {
        this.A0K.A07();
        this.A0E.A02((Boolean) null, A02(this), (String) null, 24);
        A0C(this);
    }

    public void BTb() {
        AnonymousClass6QK r1 = this.A0K;
        r1.A07();
        r1.A00 = null;
        A0C(this);
        this.A0D.A04(C143466qb.A00(this.A0N), 32, 5);
    }

    public void BVy(boolean z) {
        this.A0K.A02 = z;
        this.A0E.A02(Boolean.valueOf(z), A02(this), (String) null, 21);
        A0C(this);
    }

    public void BYq(boolean z) {
        this.A0K.A03 = z;
        this.A0E.A02(Boolean.valueOf(z), A02(this), (String) null, 22);
        A0C(this);
    }

    public void BaE() {
        C36341k9.A16(this.A0V, 5);
    }

    public void BaJ() {
        C36341k9.A16(this.A0Q, 0);
        this.A0D.A04(C143466qb.A00(this.A0N), 34, 0);
    }

    public void Bbt(boolean z) {
        this.A0K.A04 = z;
        this.A0E.A02(Boolean.valueOf(z), A02(this), (String) null, 9);
        A0C(this);
    }

    public void BfW() {
        C143466qb r2 = this.A0N;
        r2.A02();
        r2.A00.A0F();
        C36341k9.A16(this.A0Q, 1);
        this.A0D.A04(C143466qb.A00(r2), 31, 0);
    }

    public void Bg2() {
        this.A0S.A0C((Object) null);
        this.A0A.A0C("product_name");
        C36341k9.A16(this.A0V, 4);
        this.A0D.A04(C143466qb.A00(this.A0N), 33, 5);
    }

    public static ArrayList A03(C95394km r6) {
        int i;
        C105235Dw A002;
        ArrayList A0I2 = AnonymousClass001.A0I();
        C95434kv r2 = r6.A0N.A00;
        Object A042 = r2.A04();
        r6.A08.A04();
        if (A042 != null) {
            A0I2.add(A042);
            Integer[] numArr = new Integer[2];
            List A0p = C90524aI.A0p(Integer.valueOf(C36361kB.A1b(numArr, 2) ? 1 : 0), numArr, 1);
            int i2 = r6.A02;
            if ((i2 == 1 || i2 == 4 || A0P(r6)) && A0p.contains(Integer.valueOf(r2.A00))) {
                AnonymousClass6QK r1 = r6.A0K;
                if (!(r1.A00 == null || (A002 = AnonymousClass6QK.A00(r1, r6, 76)) == null)) {
                    A0I2.add(A002);
                }
            }
        }
        if (r6.A02 == 0 && r2.A00 != 4) {
            Iterator it = r6.A0W.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass001.A0A("restartVisibilityState");
            }
        }
        int i3 = r2.A00;
        if (r6.A0O.A03.A0E(1806) && (((i = r6.A02) == 2 || i == 0) && i3 != 4)) {
            LinkedList A0l = C90524aI.A0l();
            A0l.add(new AnonymousClass6BG((Object) null, "-1", r6.A00.getString(R.string.f12nameremoved)));
            if (r6.A02 == 2) {
                C28201Rs r12 = r6.A0S;
                if (r12.A04() != null) {
                    C134986bw r3 = (C134986bw) r12.A04();
                    A0l.add(new AnonymousClass6BG(r3, r3.A00, r3.A01));
                }
            }
            A0I2.add(new C105215Du(new C143456qa(r6), A0l));
        }
        return A0I2;
    }

    public static void A0F(C95394km r2, List list) {
        ArrayList A032 = A03(r2);
        A032.addAll(list);
        r2.A0B.A0C(A032);
    }

    public static void A0G(C95394km r1, boolean z) {
        C119215pS r0;
        r1.A0K(z);
        if (AnonymousClass6MI.A00(r1.A0N.A00.A01)) {
            r0 = A01(r1);
        } else {
            r0 = null;
        }
        r1.A07(r0);
    }

    public void BbC() {
        BTG();
    }

    public void BZ5(C1261662u r2, int i) {
        A06();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95394km(Application application, AnonymousClass08M r30, C115865jZ r31, AnonymousClass1KK r32, C142616pA r33, C142646pD r34, C145896uh r35, AnonymousClass5DR r36, C129006Eo r37, C1260562j r38, AnonymousClass6MI r39, AnonymousClass7g3 r40, AnonymousClass7gA r41, C119295pa r42, AnonymousClass7gB r43, C134986bw r44, Jid jid, AnonymousClass1QW r46, C33191es r47, String str, Set set, boolean z, boolean z2) {
        super(application);
        int i;
        int i2 = z2;
        boolean z3 = z;
        AnonymousClass08S r7 = new AnonymousClass08S();
        this.A0A = r7;
        C28201Rs A0t = C36441kJ.A0t();
        this.A0S = A0t;
        C28201Rs A0t2 = C36441kJ.A0t();
        this.A0T = A0t2;
        this.A0Q = C36441kJ.A0t();
        AnonymousClass08S r4 = new AnonymousClass08S();
        this.A0B = r4;
        this.A0R = C36441kJ.A0t();
        this.A05 = new Stack();
        AnonymousClass08M r10 = r30;
        this.A0C = r10;
        this.A0O = r46;
        AnonymousClass6QK B3u = r41.B3u(new C164557s0(this, 1));
        this.A0K = B3u;
        this.A0D = r33;
        this.A0I = r39;
        this.A0W = set;
        C145896uh r9 = r35;
        this.A0F = r9;
        this.A0Y = r32;
        this.A0G = r37;
        this.A0Z = r36;
        this.A0H = r38;
        C119295pa r27 = r42;
        this.A0L = r27;
        this.A0P = r47;
        this.A0E = r34;
        C143466qb B4H = r43.B4H(this, this, this);
        this.A0N = B4H;
        C143516qg B4C = r40.B4C(new C164547rz(this, 1), new C164807sP(this, 2), new C163687qb(this, 1), new C164167rN(this, 1), B3u, B4H, this, this, 1);
        this.A0J = B4C;
        Map map = r10.A03;
        this.A01 = map.get("saved_consumer_home_type") != null ? C90474aD.A06("saved_consumer_home_type", map) : i2;
        this.A06 = map.get("saved_force_root_category") != null ? AnonymousClass000.A1X(map.get("saved_force_root_category")) : z3;
        C122345uh r1 = new C122345uh(new C116825lG(this), C36351kA.A0W(r31.A00.A02));
        this.A0M = r1;
        C001700s r15 = r27.A00;
        this.A0X = r15;
        C001700s r14 = B4C.A06;
        this.A08 = r14;
        C001700s r0 = r1.A00;
        this.A09 = r0;
        B3u.A09(r10);
        if (map.get("saved_parent_category") != null) {
            A0t.A0D(map.get("saved_parent_category"));
        }
        if (map.get("saved_second_level_category") != null) {
            A0t2.A0D(map.get("saved_second_level_category"));
        }
        if (map.get("saved_search_state_stack") != null) {
            Stack stack = new Stack();
            this.A05 = stack;
            stack.addAll((Collection) map.get("saved_search_state_stack"));
        }
        if (map.get("saved_search_state") != null) {
            i = C90474aD.A06("saved_search_state", map);
        } else {
            i = 0;
        }
        this.A02 = i;
        if (A0t2.A04() == null) {
            C134986bw r102 = r44;
            if (r44 != null) {
                this.A0S.A0D(r102);
                this.A00 = 2;
                if (C129406Gu.A01(r102.A00)) {
                    this.A02 = 2;
                } else {
                    this.A0T.A0D(r102);
                    this.A02 = 1;
                }
            }
        }
        Jid jid2 = jid;
        if (jid != null) {
            this.A04 = jid2;
            this.A02 = 3;
        }
        if ("nearby_business".equals(str)) {
            this.A02 = 4;
        }
        C165157sy.A01(r15, r4, this, 48);
        C165157sy.A01(r14, r4, this, 47);
        C165157sy.A01(r0, r4, this, 49);
        C165167sz.A01(A0t, r7, this, 0);
        C165167sz.A01(A0t2, r7, this, 0);
        r9.A0C = r27;
        r9.A0D = r1;
        r9.A08 = B4C;
        C165167sz.A01(B4H.A00, r4, this, 1);
    }
}
