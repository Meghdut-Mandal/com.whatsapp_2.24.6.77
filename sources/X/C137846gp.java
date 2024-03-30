package X;

import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.Constraints;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.6gp  reason: invalid class name and case insensitive filesystem */
public final class C137846gp implements C161297mW, AnonymousClass7e0, C159837k0, AnonymousClass7e1, AnonymousClass7bZ {
    public static final Comparator A0V = C1503975c.A00;
    public static final AnonymousClass00S A0W = AnonymousClass7PR.A00;
    public static final C137626gS A0X = new C94864iv();
    public static final C159887k5 A0Y = new C137996h5();
    public int A00;
    public int A01;
    public C161107mC A02;
    public C1506776e A03;
    public C161267mT A04;
    public C136906fE A05;
    public C157697dx A06;
    public C137846gp A07;
    public C94894iy A08;
    public C161327mZ A09;
    public C159887k5 A0A;
    public C161937ni A0B;
    public AnonymousClass5RW A0C;
    public Integer A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public int A0K;
    public C137846gp A0L;
    public C1496172a A0M;
    public Integer A0N;
    public boolean A0O;
    public final C129056Et A0P;
    public final C118335ni A0Q;
    public final AnonymousClass6XQ A0R;
    public final boolean A0S;
    public final C1506776e A0T;
    public final C118325nh A0U;

    public static void A03(C137846gp r2) {
        r2.A0X(false, true);
    }

    public final void A0J() {
        this.A0M = null;
        C129586Hq.A00(this).BgB();
    }

    public final void A0Q(int i, int i2) {
        if (i2 >= 0) {
            int i3 = (i2 + i) - 1;
            if (i <= i3) {
                while (true) {
                    C118335ni r2 = this.A0Q;
                    Object A042 = r2.A00.A04(i3);
                    r2.A01.invoke();
                    A04((C137846gp) A042);
                    if (i3 != i) {
                        i3--;
                    } else {
                        return;
                    }
                }
            }
        } else {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("count (");
            A0u.append(i2);
            throw AnonymousClass000.A0c(") must be greater than 0", A0u);
        }
    }

    private final void A01() {
        C137846gp r0;
        if (this.A0K > 0) {
            this.A0J = true;
        }
        if (this.A0S && (r0 = this.A0L) != null) {
            r0.A01();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A02() {
        /*
            r6 = this;
            X.6XQ r2 = r6.A0R
            X.6gq r1 = r2.A05
            r5 = r1
        L_0x0005:
            if (r1 == 0) goto L_0x0011
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x000e
            r1.A0B()
        L_0x000e:
            X.6gq r1 = r1.A04
            goto L_0x0005
        L_0x0011:
            X.76e r0 = r2.A01
            if (r0 == 0) goto L_0x0031
            int r4 = r0.A00
            if (r4 <= 0) goto L_0x0031
            r3 = 0
            java.lang.Object[] r2 = r0.A01
        L_0x001c:
            r1 = r2[r3]
            X.7nE r1 = (X.C161637nE) r1
            boolean r0 = r1 instanceof androidx.compose.ui.input.pointer.SuspendPointerInputElement
            if (r0 == 0) goto L_0x002d
            X.6fs r1 = (X.C137276fs) r1
            androidx.compose.ui.node.ForceUpdateElement r0 = new androidx.compose.ui.node.ForceUpdateElement
            r0.<init>(r1)
            r2[r3] = r0
        L_0x002d:
            int r3 = r3 + 1
            if (r3 < r4) goto L_0x001c
        L_0x0031:
            r1 = r5
        L_0x0032:
            if (r1 == 0) goto L_0x003e
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x003b
            r1.A0D()
        L_0x003b:
            X.6gq r1 = r1.A04
            goto L_0x0032
        L_0x003e:
            if (r5 == 0) goto L_0x004a
            boolean r0 = r5.A08
            if (r0 == 0) goto L_0x0047
            r5.A09()
        L_0x0047:
            X.6gq r5 = r5.A04
            goto L_0x003e
        L_0x004a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C137846gp.A02():void");
    }

    private final void A04(C137846gp r6) {
        if (r6.A0P.A00 > 0) {
            C129056Et r1 = this.A0P;
            r1.A02(r1.A00 - 1);
        }
        if (this.A09 != null) {
            r6.A0F();
        }
        r6.A0L = null;
        r6.A0R.A04.A06 = null;
        if (r6.A0S) {
            this.A0K--;
            C1506776e r0 = r6.A0Q.A00;
            int i = r0.A00;
            if (i > 0) {
                int i2 = 0;
                Object[] objArr = r0.A01;
                do {
                    ((C137846gp) objArr[i2]).A0R.A04.A06 = null;
                    i2++;
                } while (i2 < i);
            }
        }
        A01();
        A0L();
    }

    private final void A05(C137846gp r5) {
        if (!AnonymousClass00C.A0J(r5, this.A07)) {
            this.A07 = r5;
            if (r5 != null) {
                C129056Et r1 = this.A0P;
                if (r1.A04 == null) {
                    r1.A04 = new C94724ig(r1);
                }
                AnonymousClass6XQ r0 = this.A0R;
                C94894iy r3 = r0.A04;
                C94894iy r2 = r0.A06.A05;
                while (!AnonymousClass00C.A0J(r3, r2) && r3 != null) {
                    if (r3 instanceof C94934jV) {
                        C94934jV r12 = (C94934jV) r3;
                        if (r12.A01 == null) {
                            r12.A01 = new C94904iz(r12);
                        }
                    } else {
                        C94944jW r13 = (C94944jW) r3;
                        if (r13.A00 == null) {
                            r13.A00 = new C94914j0(r13);
                        }
                    }
                    r3 = r3.A05;
                }
            }
            A0I();
        }
    }

    public static final void A06(C137846gp r5) {
        r5.A0N = r5.A0D;
        r5.A0D = C023109s.A0C;
        C1506776e A092 = r5.A09();
        int i = A092.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A092.A01;
            do {
                C137846gp r2 = (C137846gp) objArr[i2];
                if (r2.A0D == C023109s.A01) {
                    A06(r2);
                }
                i2++;
            } while (i2 < i);
        }
    }

    public static final void A07(C137846gp r5) {
        C129056Et r4 = r5.A0P;
        Integer num = r4.A05;
        if (num.intValue() != 4) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Unexpected state ");
            throw AnonymousClass000.A0g(C109255Ww.A00(num), A0u);
        } else if (r4.A0D) {
            r5.A0W(true, true);
        } else {
            if (r4.A0B) {
                r5.A0U(true);
            }
            if (r4.A0E) {
                r5.A0X(true, true);
            } else if (r4.A09) {
                r5.A0V(true);
            }
        }
    }

    public final C1506776e A08() {
        if (this.A0O) {
            C1506776e r2 = this.A0T;
            r2.A06();
            r2.A0A(A09(), r2.A00);
            r2.A0B(A0V);
            this.A0O = false;
        }
        return this.A0T;
    }

    public final C137846gp A0A() {
        C137846gp r2 = this.A0L;
        while (r2 != null && r2.A0S) {
            r2 = r2.A0L;
        }
        return r2;
    }

    public final C1496172a A0B() {
        if (!AnonymousClass000.A1P(8 & this.A0R.A02.A00) || this.A0M != null) {
            return this.A0M;
        }
        C10810fG r3 = new C10810fG();
        r3.element = new C1496172a();
        C1264864f r2 = ((AndroidComposeView) C129586Hq.A00(this)).A0Z;
        r2.A00(this, new AnonymousClass7NU(this, r3), r2.A07);
        C1496172a r0 = (C1496172a) r3.element;
        this.A0M = r0;
        return r0;
    }

    public final Boolean A0C() {
        C94724ig r0 = this.A0P.A04;
        if (r0 != null) {
            return Boolean.valueOf(r0.A07);
        }
        return null;
    }

    public final void A0E() {
        this.A0N = this.A0D;
        Integer num = C023109s.A0C;
        this.A0D = num;
        C1506776e A092 = A09();
        int i = A092.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A092.A01;
            do {
                C137846gp r1 = (C137846gp) objArr[i2];
                if (r1.A0D != num) {
                    r1.A0E();
                }
                i2++;
            } while (i2 < i);
        }
    }

    public final void A0F() {
        AnonymousClass6Q5 r1;
        C161327mZ r8 = this.A09;
        String str = null;
        if (r8 == null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Cannot detach node that is already detached!  Tree: ");
            C137846gp A0A2 = A0A();
            if (A0A2 != null) {
                str = A0A2.A00(0);
            }
            throw AnonymousClass000.A0g(str, A0u);
        }
        AnonymousClass6XQ r2 = this.A0R;
        if ((r2.A02.A00 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
            for (C137856gq r10 = r2.A05; r10 != null; r10 = r10.A04) {
                if ((r10.A01 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
                    C137856gq r9 = r10;
                    C1506776e r5 = null;
                    do {
                        if (r9 instanceof C94214hq) {
                            C94214hq r92 = (C94214hq) r9;
                            if (r92.A0G().BLs()) {
                                ((AndroidComposeView) C129586Hq.A00(this)).A0R.B2p(true, false);
                                r92.A0I();
                            }
                        } else if ((r9.A01 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0 && (r9 instanceof C94114hf)) {
                            int i = 0;
                            for (C137856gq r3 = ((C94114hf) r9).A00; r3 != null; r3 = r3.A02) {
                                if ((r3.A01 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
                                    i++;
                                    if (i == 1) {
                                        r9 = r3;
                                    } else {
                                        r5 = C90464aC.A0F(r5);
                                        r9 = C90524aI.A0D(r5, r9);
                                        r5.A0D(r3);
                                    }
                                }
                            }
                            if (i == 1) {
                                continue;
                            }
                        }
                        r9 = AnonymousClass6VZ.A00(r5);
                        continue;
                    } while (r9 != null);
                }
            }
        }
        C137846gp A0A3 = A0A();
        if (A0A3 != null) {
            A0A3.A0G();
            A0A3.A0I();
            C129056Et r32 = this.A0P;
            C94734ih r0 = r32.A0G;
            Integer num = C023109s.A0C;
            r0.A07 = num;
            C94724ig r02 = r32.A04;
            if (r02 != null) {
                r02.A04 = num;
            }
        }
        C129056Et r52 = this.A0P;
        C94734ih r4 = r52.A0G;
        AnonymousClass6Q5 r12 = r4.A0K;
        r12.A01 = true;
        r12.A03 = false;
        r12.A02 = false;
        r12.A00 = null;
        C94724ig r03 = r52.A04;
        if (!(r03 == null || (r1 = r03.A0G) == null)) {
            r1.A01 = true;
            r1.A03 = false;
            r1.A02 = false;
            r1.A00 = null;
        }
        if (AnonymousClass000.A1P(8 & r2.A02.A00)) {
            A0J();
        }
        C137856gq r13 = r2.A05;
        while (r13 != null) {
            if (r13.A08) {
                r13.A0D();
            }
            r13 = r13.A04;
        }
        this.A0F = true;
        C1506776e r04 = this.A0Q.A00;
        int i2 = r04.A00;
        if (i2 > 0) {
            Object[] objArr = r04.A01;
            int i3 = 0;
            do {
                ((C137846gp) objArr[i3]).A0F();
                i3++;
            } while (i3 < i2);
        }
        this.A0F = false;
        for (C137856gq r93 = r13; r93 != null; r93 = r93.A04) {
            if (r93.A08) {
                r93.A09();
            }
        }
        AndroidComposeView androidComposeView = (AndroidComposeView) r8;
        androidComposeView.A0Y.A02.A00(this);
        androidComposeView.A07 = true;
        this.A09 = null;
        A05((C137846gp) null);
        this.A00 = 0;
        r4.A03 = Integer.MAX_VALUE;
        r4.A04 = Integer.MAX_VALUE;
        r4.A0C = false;
        C94724ig r05 = r52.A04;
        if (r05 != null) {
            r05.A00 = Integer.MAX_VALUE;
            r05.A01 = Integer.MAX_VALUE;
            r05.A07 = false;
        }
    }

    public final void A0G() {
        if (this.A0G) {
            AnonymousClass6XQ r0 = this.A0R;
            C94894iy r3 = r0.A06;
            C94894iy r2 = r0.A04.A06;
            this.A08 = null;
            while (true) {
                if (AnonymousClass00C.A0J(r3, r2)) {
                    break;
                } else if (r3 == null) {
                    r3 = null;
                } else if (r3.A07 != null) {
                    this.A08 = r3;
                    break;
                } else {
                    r3 = r3.A06;
                }
            }
        }
        C94894iy r1 = this.A08;
        if (r1 == null) {
            C137846gp A0A2 = A0A();
            if (A0A2 != null) {
                A0A2.A0G();
            }
        } else if (r1.A07 != null) {
            r1.A0P();
        } else {
            throw AnonymousClass001.A09("layer was not set");
        }
    }

    public final void A0H() {
        AnonymousClass6XQ r0 = this.A0R;
        C94944jW r1 = r0.A06;
        for (C94894iy r2 = r0.A04; r2 != r1; r2 = r2.A05) {
            AnonymousClass00C.A0E(r2, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            C160967ls r02 = r2.A07;
            if (r02 != null) {
                r02.invalidate();
            }
        }
        C160967ls r03 = r1.A07;
        if (r03 != null) {
            r03.invalidate();
        }
    }

    public final void A0I() {
        if (this.A07 != null) {
            A0W(false, true);
        } else {
            A03(this);
        }
    }

    /* JADX INFO: finally extract failed */
    public final void A0K() {
        C137846gp A0A2;
        if (this.A0D == C023109s.A0C) {
            A06(this);
        }
        C94724ig A002 = C129056Et.A00(this);
        try {
            A002.A0C = true;
            if (A002.A0B) {
                A002.A09 = false;
                boolean z = A002.A07;
                A002.A0E((C006302t) null, 0.0f, A002.A02);
                if (z && !A002.A09 && (A0A2 = A002.A0H.A0F.A0A()) != null) {
                    A0A2.A0U(false);
                }
                A002.A0C = false;
                return;
            }
            throw AnonymousClass001.A09("replace() called on item that was not placed");
        } catch (Throwable th) {
            A002.A0C = false;
            throw th;
        }
    }

    public final void A0L() {
        if (this.A0S) {
            C137846gp A0A2 = A0A();
            if (A0A2 != null) {
                A0A2.A0L();
                return;
            }
            return;
        }
        this.A0O = true;
    }

    public final void A0M() {
        C118335ni r3 = this.A0Q;
        C1506776e r2 = r3.A00;
        int i = r2.A00;
        while (true) {
            i--;
            if (-1 < i) {
                A04((C137846gp) r2.A01[i]);
            } else {
                r2.A06();
                r3.A01.invoke();
                return;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void A0N() {
        C137846gp A0A2;
        if (this.A0D == C023109s.A0C) {
            A06(this);
        }
        C94734ih r6 = this.A0P.A0G;
        try {
            r6.A0J = true;
            if (r6.A0I) {
                boolean z = r6.A0C;
                long j = r6.A05;
                C94734ih.A02(r6, r6.A09, r6.A00, j);
                if (z && !r6.A0G && (A0A2 = r6.A0O.A0F.A0A()) != null) {
                    A0A2.A0V(false);
                }
                r6.A0J = false;
                return;
            }
            throw AnonymousClass001.A09("replace called on unplaced item");
        } catch (Throwable th) {
            r6.A0J = false;
            throw th;
        }
    }

    public final void A0P() {
        if (this.A0K > 0 && this.A0J) {
            int i = 0;
            this.A0J = false;
            C1506776e r4 = this.A03;
            if (r4 == null) {
                r4 = C1506776e.A02(new C137846gp[16]);
                this.A03 = r4;
            }
            r4.A06();
            C1506776e r0 = this.A0Q.A00;
            int i2 = r0.A00;
            if (i2 > 0) {
                Object[] objArr = r0.A01;
                do {
                    C137846gp r1 = (C137846gp) objArr[i];
                    if (r1.A0S) {
                        r4.A0A(r1.A09(), r4.A00);
                    } else {
                        r4.A0D(r1);
                    }
                    i++;
                } while (i < i2);
            }
            C129056Et r2 = this.A0P;
            r2.A0G.A0B = true;
            C94724ig r02 = r2.A04;
            if (r02 != null) {
                r02.A06 = true;
            }
        }
    }

    public final void A0R(int i, int i2, int i3) {
        if (i != i2) {
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = i;
                if (i > i2) {
                    i5 = i + i4;
                }
                int i6 = i2 + i4;
                if (i <= i2) {
                    i6 = (i2 + i3) - 2;
                }
                C118335ni r0 = this.A0Q;
                C1506776e r2 = r0.A00;
                Object A042 = r2.A04(i5);
                AnonymousClass00S r02 = r0.A01;
                r02.invoke();
                r2.A09(i6, A042);
                r02.invoke();
            }
            A0L();
            A01();
            A0I();
        }
    }

    public final void A0S(C137846gp r6, int i) {
        String str = null;
        if (!AnonymousClass000.A1W(r6.A0L)) {
            StringBuilder A0v = AnonymousClass000.A0v("Cannot insert ");
            A0v.append(r6);
            A0v.append(" because it already has a parent. This tree: ");
            A0v.append(A00(0));
            A0v.append(" Other tree: ");
            C137846gp r1 = r6.A0L;
            if (r1 != null) {
                str = r1.A00(0);
            }
            throw AnonymousClass000.A0g(str, A0v);
        } else if (r6.A09 == null) {
            r6.A0L = this;
            C118335ni r12 = this.A0Q;
            r12.A00.A09(i, r6);
            r12.A01.invoke();
            A0L();
            if (r6.A0S) {
                this.A0K++;
            }
            A01();
            C161327mZ r0 = this.A09;
            if (r0 != null) {
                r6.A0T(r0);
            }
            if (r6.A0P.A00 > 0) {
                C129056Et r13 = this.A0P;
                r13.A02(r13.A00 + 1);
            }
        } else {
            StringBuilder A0v2 = AnonymousClass000.A0v("Cannot insert ");
            A0v2.append(r6);
            A0v2.append(" because it already has an owner. This tree: ");
            A0v2.append(A00(0));
            A0v2.append(" Other tree: ");
            throw AnonymousClass000.A0g(r6.A00(0), A0v2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.4iy] */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0T(X.C161327mZ r7) {
        /*
            r6 = this;
            X.7mZ r0 = r6.A09
            r2 = 0
            if (r0 != 0) goto L_0x0120
            r3 = 0
            X.6gp r0 = r6.A0L
            if (r0 == 0) goto L_0x004e
            X.7mZ r0 = r0.A09
            boolean r0 = X.AnonymousClass00C.A0J(r0, r7)
            if (r0 != 0) goto L_0x004e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Attaching to a different owner("
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ") than the parent's owner("
            r1.append(r0)
            X.6gp r0 = r6.A0A()
            if (r0 == 0) goto L_0x004c
            X.7mZ r0 = r0.A09
        L_0x002b:
            r1.append(r0)
            java.lang.String r0 = "). This tree: "
            r1.append(r0)
            java.lang.String r0 = r6.A00(r2)
            r1.append(r0)
            java.lang.String r0 = " Parent tree: "
            r1.append(r0)
            X.6gp r0 = r6.A0L
            if (r0 == 0) goto L_0x0047
            java.lang.String r3 = r0.A00(r2)
        L_0x0047:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0g(r3, r1)
            throw r0
        L_0x004c:
            r0 = r3
            goto L_0x002b
        L_0x004e:
            X.6gp r5 = r6.A0A()
            if (r5 != 0) goto L_0x0061
            X.6Et r4 = r6.A0P
            X.4ih r0 = r4.A0G
            r1 = 1
            r0.A0C = r1
            X.4ig r0 = r4.A04
            if (r0 == 0) goto L_0x0061
            r0.A07 = r1
        L_0x0061:
            X.6XQ r4 = r6.A0R
            X.4iy r1 = r4.A04
            if (r5 == 0) goto L_0x006b
            X.6XQ r0 = r5.A0R
            X.4jW r3 = r0.A06
        L_0x006b:
            r1.A06 = r3
            r6.A09 = r7
            if (r5 == 0) goto L_0x00a2
            int r0 = r5.A00
        L_0x0073:
            int r0 = r0 + 1
            r6.A00 = r0
            r1 = 8
            X.6gq r0 = r4.A02
            int r0 = r0.A00
            r1 = r1 & r0
            boolean r0 = X.AnonymousClass000.A1P(r1)
            if (r0 == 0) goto L_0x0087
            r6.A0J()
        L_0x0087:
            X.6gp r0 = r6.A0L
            if (r0 == 0) goto L_0x008f
            X.6gp r0 = r0.A07
            if (r0 != 0) goto L_0x0091
        L_0x008f:
            X.6gp r0 = r6.A07
        L_0x0091:
            r6.A05(r0)
            boolean r0 = r6.A0H
            if (r0 != 0) goto L_0x00a4
            X.6gq r0 = r4.A02
        L_0x009a:
            if (r0 == 0) goto L_0x00a4
            r0.A08()
            X.6gq r0 = r0.A02
            goto L_0x009a
        L_0x00a2:
            r0 = -1
            goto L_0x0073
        L_0x00a4:
            X.5ni r0 = r6.A0Q
            X.76e r0 = r0.A00
            int r3 = r0.A00
            if (r3 <= 0) goto L_0x00b9
            java.lang.Object[] r1 = r0.A01
        L_0x00ae:
            r0 = r1[r2]
            X.6gp r0 = (X.C137846gp) r0
            r0.A0T(r7)
            int r2 = r2 + 1
            if (r2 < r3) goto L_0x00ae
        L_0x00b9:
            boolean r0 = r6.A0H
            if (r0 != 0) goto L_0x00c0
            r4.A07()
        L_0x00c0:
            r6.A0I()
            if (r5 == 0) goto L_0x00c8
            r5.A0I()
        L_0x00c8:
            X.4iy r3 = r4.A04
            X.4jW r0 = r4.A06
            X.4iy r2 = r0.A05
        L_0x00ce:
            boolean r0 = X.AnonymousClass00C.A0J(r3, r2)
            if (r0 != 0) goto L_0x00e6
            if (r3 == 0) goto L_0x00e6
            X.02t r1 = r3.A09
            r0 = 1
            r3.A0a(r1, r0)
            X.7ls r0 = r3.A07
            if (r0 == 0) goto L_0x00e3
            r0.invalidate()
        L_0x00e3:
            X.4iy r3 = r3.A05
            goto L_0x00ce
        L_0x00e6:
            X.6Et r0 = r6.A0P
            r0.A01()
            boolean r0 = r6.A0H
            if (r0 != 0) goto L_0x011f
            r1 = 7168(0x1c00, float:1.0045E-41)
            X.6gq r4 = r4.A02
            int r0 = r4.A00
            r1 = r1 & r0
            if (r1 == 0) goto L_0x011f
        L_0x00f8:
            r1 = 1024(0x400, float:1.435E-42)
            int r0 = r4.A01
            r1 = r1 & r0
            r3 = 1
            boolean r2 = X.AnonymousClass000.A1P(r1)
            r1 = 2048(0x800, float:2.87E-42)
            int r0 = r4.A01
            r1 = r1 & r0
            boolean r0 = X.AnonymousClass000.A1P(r1)
            r2 = r2 | r0
            r1 = 4096(0x1000, float:5.74E-42)
            int r0 = r4.A01
            r1 = r1 & r0
            if (r1 != 0) goto L_0x0114
            r3 = 0
        L_0x0114:
            r2 = r2 | r3
            if (r2 == 0) goto L_0x011a
            X.AnonymousClass6X7.A03(r4)
        L_0x011a:
            X.6gq r4 = r4.A02
            if (r4 == 0) goto L_0x011f
            goto L_0x00f8
        L_0x011f:
            return
        L_0x0120:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Cannot attach "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " as it already is attached.  Tree: "
            r1.append(r0)
            java.lang.String r0 = r6.A00(r2)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0g(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C137846gp.A0T(X.7mZ):void");
    }

    public final void A0U(boolean z) {
        C161327mZ r2;
        if (!this.A0S && (r2 = this.A09) != null) {
            AndroidComposeView androidComposeView = (AndroidComposeView) r2;
            if (androidComposeView.A0Y.A0A(this, z)) {
                AndroidComposeView.A09((C137846gp) null, androidComposeView);
            }
        }
    }

    public final void A0V(boolean z) {
        C161327mZ r2;
        if (!this.A0S && (r2 = this.A09) != null) {
            AndroidComposeView androidComposeView = (AndroidComposeView) r2;
            if (androidComposeView.A0Y.A0C(this, z)) {
                AndroidComposeView.A09((C137846gp) null, androidComposeView);
            }
        }
    }

    public final void A0W(boolean z, boolean z2) {
        C137846gp A0A2;
        if (this.A07 != null) {
            C161327mZ r1 = this.A09;
            if (r1 != null && !this.A0F && !this.A0S) {
                AndroidComposeView androidComposeView = (AndroidComposeView) r1;
                if (androidComposeView.A0Y.A0B(this, z) && z2) {
                    AndroidComposeView.A09(this, androidComposeView);
                }
                C137846gp r0 = C129056Et.A00(this).A0H.A0F;
                C137846gp A0A3 = r0.A0A();
                Integer num = r0.A0D;
                if (A0A3 != null && num != C023109s.A0C) {
                    while (A0A3.A0D == num && (A0A2 = A0A3.A0A()) != null) {
                        A0A3 = A0A2;
                    }
                    int intValue = num.intValue();
                    if (intValue != 0) {
                        if (intValue != 1) {
                            throw AnonymousClass001.A09("Intrinsics isn't used by the parent");
                        } else if (A0A3.A07 != null) {
                            A0A3.A0U(z);
                        } else {
                            A0A3.A0V(z);
                        }
                    } else if (A0A3.A07 != null) {
                        A0A3.A0W(z, true);
                    } else {
                        A0A3.A0X(z, true);
                    }
                }
            }
        } else {
            throw AnonymousClass001.A09("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
        }
    }

    public final void A0X(boolean z, boolean z2) {
        C161327mZ r1;
        C137846gp A0A2;
        if (!this.A0F && !this.A0S && (r1 = this.A09) != null) {
            AndroidComposeView androidComposeView = (AndroidComposeView) r1;
            if (androidComposeView.A0Y.A0D(this, z) && z2) {
                AndroidComposeView.A09(this, androidComposeView);
            }
            C137846gp r0 = this.A0P.A0G.A0O.A0F;
            C137846gp A0A3 = r0.A0A();
            Integer num = r0.A0D;
            if (A0A3 != null && num != C023109s.A0C) {
                while (A0A3.A0D == num && (A0A2 = A0A3.A0A()) != null) {
                    A0A3 = A0A2;
                }
                int intValue = num.intValue();
                if (intValue == 0) {
                    A0A3.A0X(z, true);
                } else if (intValue == 1) {
                    A0A3.A0V(z);
                } else {
                    throw AnonymousClass001.A09("Intrinsics isn't used by the parent");
                }
            }
        }
    }

    public final boolean A0Y(Constraints constraints) {
        if (constraints == null) {
            return false;
        }
        if (this.A0D == C023109s.A0C) {
            A0E();
        }
        return this.A0P.A0G.A0I(constraints.A00);
    }

    public void B7Y() {
        if (this.A07 != null) {
            A0W(false, false);
        } else {
            A0X(false, false);
        }
        C94734ih r1 = this.A0P.A0G;
        if (r1.A0F) {
            Constraints constraints = new Constraints(r1.A04);
            C161327mZ r2 = this.A09;
            if (r2 != null) {
                r2.BPl(this, constraints.A00);
                return;
            }
            return;
        }
        C161327mZ r12 = this.A09;
        if (r12 != null) {
            r12.BPk(true);
        }
    }

    public boolean BNc() {
        return AnonymousClass000.A1V(this.A09);
    }

    public void BVE() {
        C136906fE r1 = this.A05;
        if (r1 != null) {
            C136906fE.A02(r1, true);
        }
        this.A0H = true;
        A02();
        if (this.A09 != null) {
            A0J();
        }
    }

    public void BeU() {
        C136906fE r0 = this.A05;
        if (r0 != null) {
            r0.BeU();
        }
        AnonymousClass6XQ r02 = this.A0R;
        C94894iy r3 = r02.A04;
        C94894iy r2 = r02.A06.A05;
        while (!AnonymousClass00C.A0J(r3, r2) && r3 != null) {
            r3.A0C = true;
            r3.A0H.invoke();
            if (r3.A07 != null) {
                r3.A0a((C006302t) null, false);
            }
            r3 = r3.A05;
        }
    }

    public void BfY() {
        if (this.A09 != null) {
            C136906fE r1 = this.A05;
            if (r1 != null) {
                C136906fE.A02(r1, false);
            }
            if (this.A0H) {
                this.A0H = false;
                A0J();
            } else {
                A02();
            }
            this.A01 = C112475dx.A00.addAndGet(1);
            AnonymousClass6XQ r12 = this.A0R;
            for (C137856gq r0 = r12.A02; r0 != null; r0 = r0.A02) {
                r0.A08();
            }
            r12.A07();
            A07(this);
            return;
        }
        throw AnonymousClass001.A08("onReuse is only expected on attached node");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BqY(X.C161107mC r9) {
        /*
            r8 = this;
            r8.A02 = r9
            X.4gm r0 = X.C131996Rr.A00
            X.4hC r9 = (X.C93824hC) r9
            java.lang.Object r0 = X.AnonymousClass6G0.A02(r0, r9)
            X.7ni r0 = (X.C161937ni) r0
            r8.Bqk(r0)
            X.4gm r0 = X.C131996Rr.A03
            java.lang.Object r1 = X.AnonymousClass6G0.A02(r0, r9)
            X.5RW r1 = (X.AnonymousClass5RW) r1
            X.5RW r0 = r8.A0C
            if (r0 == r1) goto L_0x002c
            r8.A0C = r1
            r8.A0I()
            X.6gp r0 = r8.A0A()
            if (r0 == 0) goto L_0x0029
            r0.A0G()
        L_0x0029:
            r8.A0H()
        L_0x002c:
            X.4gm r0 = X.C131996Rr.A04
            java.lang.Object r0 = X.AnonymousClass6G0.A02(r0, r9)
            X.7k5 r0 = (X.C159887k5) r0
            r8.Bsj(r0)
            X.6XQ r0 = r8.A0R
            r7 = 32768(0x8000, float:4.5918E-41)
            X.6gq r6 = r0.A02
            int r0 = r6.A00
            r0 = r0 & r7
            if (r0 == 0) goto L_0x0099
        L_0x0043:
            int r0 = r6.A01
            r0 = r0 & r7
            if (r0 == 0) goto L_0x008f
            r5 = 0
            r4 = r6
        L_0x004a:
            boolean r0 = r4 instanceof X.C17500rW
            r3 = 1
            if (r0 == 0) goto L_0x0062
            X.6gq r1 = r4.A03
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x005f
            X.AnonymousClass6X7.A04(r1)
        L_0x0058:
            X.6gq r4 = X.AnonymousClass6VZ.A00(r5)
        L_0x005c:
            if (r4 == 0) goto L_0x008f
            goto L_0x004a
        L_0x005f:
            r1.A09 = r3
            goto L_0x0058
        L_0x0062:
            int r0 = r4.A01
            r0 = r0 & r7
            if (r0 == 0) goto L_0x0058
            boolean r0 = r4 instanceof X.C94114hf
            if (r0 == 0) goto L_0x0058
            r0 = r4
            X.4hf r0 = (X.C94114hf) r0
            X.6gq r2 = r0.A00
            r1 = 0
        L_0x0071:
            if (r2 == 0) goto L_0x008c
            int r0 = r2.A01
            r0 = r0 & r7
            if (r0 == 0) goto L_0x007d
            int r1 = r1 + 1
            if (r1 != r3) goto L_0x0080
            r4 = r2
        L_0x007d:
            X.6gq r2 = r2.A02
            goto L_0x0071
        L_0x0080:
            X.76e r5 = X.C90464aC.A0F(r5)
            X.6gq r4 = X.C90524aI.A0D(r5, r4)
            r5.A0D(r2)
            goto L_0x007d
        L_0x008c:
            if (r1 != r3) goto L_0x0058
            goto L_0x005c
        L_0x008f:
            int r0 = r6.A00
            r0 = r0 & r7
            if (r0 == 0) goto L_0x0099
            X.6gq r6 = r6.A02
            if (r6 == 0) goto L_0x0099
            goto L_0x0043
        L_0x0099:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C137846gp.BqY(X.7mC):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bqk(X.C161937ni r8) {
        /*
            r7 = this;
            X.7ni r0 = r7.A0B
            boolean r0 = X.AnonymousClass00C.A0J(r0, r8)
            if (r0 != 0) goto L_0x0076
            r7.A0B = r8
            r7.A0I()
            X.6gp r0 = r7.A0A()
            if (r0 == 0) goto L_0x0016
            r0.A0G()
        L_0x0016:
            r7.A0H()
            X.6XQ r0 = r7.A0R
            X.6gq r6 = r0.A02
            int r0 = r6.A00
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0076
        L_0x0023:
            int r0 = r6.A01
            r0 = r0 & 16
            if (r0 == 0) goto L_0x006b
            r5 = 0
            r4 = r6
        L_0x002b:
            boolean r0 = r4 instanceof X.C161847nZ
            if (r0 == 0) goto L_0x003b
            X.7nZ r4 = (X.C161847nZ) r4
            r4.BVP()
        L_0x0034:
            X.6gq r4 = X.AnonymousClass6VZ.A00(r5)
        L_0x0038:
            if (r4 == 0) goto L_0x006b
            goto L_0x002b
        L_0x003b:
            int r0 = r4.A01
            r0 = r0 & 16
            r3 = 1
            if (r0 == 0) goto L_0x0034
            boolean r0 = r4 instanceof X.C94114hf
            if (r0 == 0) goto L_0x0034
            r0 = r4
            X.4hf r0 = (X.C94114hf) r0
            X.6gq r2 = r0.A00
            r1 = 0
        L_0x004c:
            if (r2 == 0) goto L_0x0068
            int r0 = r2.A01
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0059
            int r1 = r1 + 1
            if (r1 != r3) goto L_0x005c
            r4 = r2
        L_0x0059:
            X.6gq r2 = r2.A02
            goto L_0x004c
        L_0x005c:
            X.76e r5 = X.C90464aC.A0G(r5)
            X.6gq r4 = X.C90524aI.A0D(r5, r4)
            r5.A0D(r2)
            goto L_0x0059
        L_0x0068:
            if (r1 != r3) goto L_0x0034
            goto L_0x0038
        L_0x006b:
            int r0 = r6.A00
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0076
            X.6gq r6 = r6.A02
            if (r6 == 0) goto L_0x0076
            goto L_0x0023
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C137846gp.Bqk(X.7ni):void");
    }

    public void BrB(C157697dx r2) {
        if (!AnonymousClass00C.A0J(this.A06, r2)) {
            this.A06 = r2;
            this.A0U.A00.setValue(r2);
            A0I();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r15v0 */
    /* JADX WARNING: type inference failed for: r15v1 */
    /* JADX WARNING: type inference failed for: r15v2 */
    /* JADX WARNING: type inference failed for: r15v3, types: [int] */
    /* JADX WARNING: type inference failed for: r15v6 */
    /* JADX WARNING: type inference failed for: r15v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x014c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BrI(X.C161267mT r23) {
        /*
            r22 = this;
            r2 = r22
            boolean r0 = r2.A0S
            if (r0 == 0) goto L_0x0013
            X.7mT r1 = r2.A04
            X.6fu r0 = X.C161267mT.A00
            if (r1 == r0) goto L_0x0013
            java.lang.String r0 = "Modifiers are not supported on virtual LayoutNodes"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x0013:
            boolean r0 = r2.A0H
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0197
            r1 = r23
            r2.A04 = r1
            X.6XQ r13 = r2.A0R
            X.6gq r0 = r13.A02
            X.4hc r4 = X.C129596Hr.A00
            if (r0 == r4) goto L_0x0190
            r0.A04 = r4
            r4.A02 = r0
            X.76e r10 = r13.A01
            r15 = 0
            if (r10 == 0) goto L_0x007c
            int r5 = r10.A00
        L_0x0030:
            X.76e r11 = r13.A00
            r9 = 16
            if (r11 != 0) goto L_0x003c
            X.7nE[] r0 = new X.C161637nE[r9]
            X.76e r11 = X.C1506776e.A02(r0)
        L_0x003c:
            int r0 = r11.A00
            if (r0 >= r9) goto L_0x0042
            r0 = 16
        L_0x0042:
            X.7mT[] r0 = new X.C161267mT[r0]
            X.76e r6 = X.C1506776e.A02(r0)
            r6.A0D(r1)
            r3 = 0
        L_0x004c:
            int r0 = r6.A00
            if (r0 == 0) goto L_0x007e
            int r0 = r0 + -1
            java.lang.Object r1 = r6.A04(r0)
            X.7mT r1 = (X.C161267mT) r1
            boolean r0 = r1 instanceof X.C137286ft
            if (r0 == 0) goto L_0x0069
            X.6ft r1 = (X.C137286ft) r1
            X.7mT r0 = r1.A00
            r6.A0D(r0)
            X.7mT r0 = r1.A01
            r6.A0D(r0)
            goto L_0x004c
        L_0x0069:
            boolean r0 = r1 instanceof X.C161637nE
            if (r0 == 0) goto L_0x0071
            r11.A0D(r1)
            goto L_0x004c
        L_0x0071:
            if (r3 != 0) goto L_0x0078
            X.7RU r3 = new X.7RU
            r3.<init>(r11)
        L_0x0078:
            r1.B0v(r3)
            goto L_0x004c
        L_0x007c:
            r5 = 0
            goto L_0x0030
        L_0x007e:
            int r1 = r11.A00
            r3 = 0
            java.lang.String r8 = "expected prior modifier list to be non-empty"
            r7 = 1
            if (r1 != r5) goto L_0x00cf
            X.6gq r12 = r4.A02
            r14 = 0
        L_0x0089:
            if (r12 == 0) goto L_0x00b2
            if (r14 >= r5) goto L_0x00b2
            if (r10 == 0) goto L_0x00ab
            java.lang.Object[] r0 = r10.A01
            r6 = r0[r14]
            X.7nE r6 = (X.C161637nE) r6
            java.lang.Object[] r0 = r11.A01
            r1 = r0[r14]
            X.7nE r1 = (X.C161637nE) r1
            int r0 = X.C129596Hr.A00(r6, r1)
            if (r0 == 0) goto L_0x00b0
            if (r0 != r7) goto L_0x00a6
            X.AnonymousClass6XQ.A05(r6, r1, r12)
        L_0x00a6:
            X.6gq r12 = r12.A02
            int r14 = r14 + 1
            goto L_0x0089
        L_0x00ab:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r8)
            throw r0
        L_0x00b0:
            X.6gq r12 = r12.A04
        L_0x00b2:
            if (r14 >= r5) goto L_0x0140
            if (r10 == 0) goto L_0x00ca
            if (r12 == 0) goto L_0x00c3
            X.6gp r0 = r13.A07
            X.7mZ r0 = r0.A09
            if (r0 == 0) goto L_0x00bf
            r15 = 1
        L_0x00bf:
            X.AnonymousClass6XQ.A04(r10, r11, r12, r13, r14, r15)
            goto L_0x012e
        L_0x00c3:
            java.lang.String r0 = "structuralUpdate requires a non-null tail"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x00ca:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r8)
            throw r0
        L_0x00cf:
            X.6gp r6 = r13.A07
            X.7mZ r0 = r6.A09
            r21 = 1
            if (r0 != 0) goto L_0x00fe
            r21 = 0
            if (r5 != 0) goto L_0x00fe
            r1 = r4
        L_0x00dc:
            int r0 = r11.A00
            if (r15 >= r0) goto L_0x00ed
            java.lang.Object[] r0 = r11.A01
            r0 = r0[r15]
            X.7nE r0 = (X.C161637nE) r0
            X.6gq r1 = X.AnonymousClass6XQ.A01(r0, r1)
            int r15 = r15 + 1
            goto L_0x00dc
        L_0x00ed:
            X.6gq r0 = r13.A05
            X.6gq r5 = r0.A04
            r1 = 0
        L_0x00f2:
            if (r5 == 0) goto L_0x012e
            if (r5 == r4) goto L_0x012e
            int r0 = r5.A01
            r1 = r1 | r0
            r5.A00 = r1
            X.6gq r5 = r5.A04
            goto L_0x00f2
        L_0x00fe:
            if (r1 != 0) goto L_0x0119
            if (r10 == 0) goto L_0x0114
            X.6gq r5 = r4.A02
            r1 = 0
        L_0x0105:
            if (r5 == 0) goto L_0x0130
            int r0 = r10.A00
            if (r1 >= r0) goto L_0x0130
            X.6gq r0 = X.AnonymousClass6XQ.A02(r5)
            X.6gq r5 = r0.A02
            int r1 = r1 + 1
            goto L_0x0105
        L_0x0114:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r8)
            throw r0
        L_0x0119:
            if (r10 != 0) goto L_0x0121
            X.7nE[] r0 = new X.C161637nE[r9]
            X.76e r10 = X.C1506776e.A02(r0)
        L_0x0121:
            r16 = r10
            r17 = r11
            r18 = r4
            r19 = r13
            r20 = r15
            X.AnonymousClass6XQ.A04(r16, r17, r18, r19, r20, r21)
        L_0x012e:
            r15 = 1
            goto L_0x0140
        L_0x0130:
            X.4jW r1 = r13.A06
            X.6gp r0 = r6.A0A()
            if (r0 == 0) goto L_0x0180
            X.6XQ r0 = r0.A0R
            X.4jW r0 = r0.A06
        L_0x013c:
            r1.A06 = r0
            r13.A04 = r1
        L_0x0140:
            r13.A01 = r11
            if (r10 == 0) goto L_0x0148
            r10.A06()
            r3 = r10
        L_0x0148:
            r13.A00 = r3
            if (r4 != r4) goto L_0x0189
            X.6gq r3 = r4.A02
            if (r3 != 0) goto L_0x0152
            X.6gq r3 = r13.A05
        L_0x0152:
            r1 = 0
            r3.A04 = r1
            r4.A02 = r1
            r0 = -1
            r4.A00 = r0
            r4.A0E(r1)
            if (r3 == r4) goto L_0x0182
            r13.A02 = r3
            if (r15 == 0) goto L_0x0166
            r13.A08()
        L_0x0166:
            X.6Et r0 = r2.A0P
            r0.A01()
            r1 = 512(0x200, float:7.175E-43)
            X.6gq r0 = r13.A02
            int r0 = r0.A00
            r1 = r1 & r0
            boolean r0 = X.AnonymousClass000.A1P(r1)
            if (r0 == 0) goto L_0x017f
            X.6gp r0 = r2.A07
            if (r0 != 0) goto L_0x017f
            r2.A05(r2)
        L_0x017f:
            return
        L_0x0180:
            r0 = r3
            goto L_0x013c
        L_0x0182:
            java.lang.String r0 = "trimChain did not update the head"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0189:
            java.lang.String r0 = "trimChain called on already trimmed chain"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0190:
            java.lang.String r0 = "padChain called on already padded chain"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0197:
            java.lang.String r0 = "modifier is updated when deactivated"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C137846gp.BrI(X.7mT):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bsj(X.C159887k5 r8) {
        /*
            r7 = this;
            X.7k5 r0 = r7.A0A
            boolean r0 = X.AnonymousClass00C.A0J(r0, r8)
            if (r0 != 0) goto L_0x0067
            r7.A0A = r8
            X.6XQ r0 = r7.A0R
            X.6gq r6 = r0.A02
            int r0 = r6.A00
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0067
        L_0x0014:
            int r0 = r6.A01
            r0 = r0 & 16
            if (r0 == 0) goto L_0x005c
            r5 = 0
            r4 = r6
        L_0x001c:
            boolean r0 = r4 instanceof X.C161847nZ
            if (r0 == 0) goto L_0x002c
            X.7nZ r4 = (X.C161847nZ) r4
            r4.BkO()
        L_0x0025:
            X.6gq r4 = X.AnonymousClass6VZ.A00(r5)
        L_0x0029:
            if (r4 == 0) goto L_0x005c
            goto L_0x001c
        L_0x002c:
            int r0 = r4.A01
            r0 = r0 & 16
            r3 = 1
            if (r0 == 0) goto L_0x0025
            boolean r0 = r4 instanceof X.C94114hf
            if (r0 == 0) goto L_0x0025
            r0 = r4
            X.4hf r0 = (X.C94114hf) r0
            X.6gq r2 = r0.A00
            r1 = 0
        L_0x003d:
            if (r2 == 0) goto L_0x0059
            int r0 = r2.A01
            r0 = r0 & 16
            if (r0 == 0) goto L_0x004a
            int r1 = r1 + 1
            if (r1 != r3) goto L_0x004d
            r4 = r2
        L_0x004a:
            X.6gq r2 = r2.A02
            goto L_0x003d
        L_0x004d:
            X.76e r5 = X.C90464aC.A0G(r5)
            X.6gq r4 = X.C90524aI.A0D(r5, r4)
            r5.A0D(r2)
            goto L_0x004a
        L_0x0059:
            if (r1 != r3) goto L_0x0025
            goto L_0x0029
        L_0x005c:
            int r0 = r6.A00
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0067
            X.6gq r6 = r6.A02
            if (r6 == 0) goto L_0x0067
            goto L_0x0014
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C137846gp.Bsj(X.7k5):void");
    }

    public C137846gp(boolean z, int i) {
        this.A0S = z;
        this.A01 = i;
        this.A0Q = new C118335ni(C1506776e.A02(new C137846gp[16]), new AnonymousClass7J6(this));
        this.A0T = C1506776e.A02(new C137846gp[16]);
        this.A0O = true;
        this.A06 = A0X;
        this.A0U = new C118325nh(this);
        this.A0B = C129586Hq.A00;
        this.A0C = AnonymousClass5RW.Ltr;
        this.A0A = A0Y;
        this.A02 = C129746Ih.A00;
        Integer num = C023109s.A0C;
        this.A0D = num;
        this.A0N = num;
        this.A0R = new AnonymousClass6XQ(this);
        this.A0P = new C129056Et(this);
        this.A0G = true;
        this.A04 = C161267mT.A00;
    }

    private final String A00(int i) {
        StringBuilder A0u = AnonymousClass000.A0u();
        for (int i2 = 0; i2 < i; i2++) {
            A0u.append("  ");
        }
        A0u.append("|-");
        C36351kA.A1K(this, A0u);
        A0u.append(10);
        C1506776e A092 = A09();
        int i3 = A092.A00;
        if (i3 > 0) {
            Object[] objArr = A092.A01;
            int i4 = 0;
            do {
                A0u.append(((C137846gp) objArr[i4]).A00(i + 1));
                i4++;
            } while (i4 < i3);
        }
        String obj = A0u.toString();
        if (i == 0) {
            return C36431kI.A16(0, obj.length() - 1, obj);
        }
        return obj;
    }

    public final C1506776e A09() {
        A0P();
        if (this.A0K == 0) {
            return this.A0Q.A00;
        }
        C1506776e r0 = this.A03;
        AnonymousClass00C.A0B(r0);
        return r0;
    }

    public final List A0D() {
        C94724ig A002 = C129056Et.A00(this);
        C137846gp r9 = A002.A0H.A0F;
        r9.A09().A05();
        if (!A002.A06) {
            return A002.A0F.A05();
        }
        C1506776e r7 = A002.A0F;
        C1506776e A092 = r9.A09();
        int i = A092.A00;
        if (i > 0) {
            Object[] objArr = A092.A01;
            int i2 = 0;
            do {
                int i3 = r7.A00;
                C94724ig r1 = ((C137846gp) objArr[i2]).A0P.A04;
                if (i3 <= i2) {
                    AnonymousClass00C.A0B(r1);
                    r7.A0D(r1);
                } else {
                    AnonymousClass00C.A0B(r1);
                    r7.A01[i2] = r1;
                }
                i2++;
            } while (i2 < i);
        }
        r7.A08(C1506776e.A00(r9.A09()), r7.A00);
        A002.A06 = false;
        return r7.A05();
    }

    public final void A0O() {
        C1506776e A092 = A09();
        int i = A092.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A092.A01;
            do {
                C137846gp r2 = (C137846gp) objArr[i2];
                Integer num = r2.A0N;
                r2.A0D = num;
                if (num != C023109s.A0C) {
                    r2.A0O();
                }
                i2++;
            } while (i2 < i);
        }
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(AnonymousClass5X8.A00(this));
        A0u.append(" children: ");
        A0u.append(C1506776e.A00(A09()));
        A0u.append(" measurePolicy: ");
        return AnonymousClass000.A0o(this.A06, A0u);
    }

    public C137846gp() {
        this(false, C112475dx.A00.addAndGet(1));
    }
}
