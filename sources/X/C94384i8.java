package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.4i8  reason: invalid class name and case insensitive filesystem */
public final class C94384i8 extends C137856gq implements C161847nZ, C161807nV, C161827nX, C161837nY, C161737nO, C161747nP, C161817nW, C161777nS, C161767nR, AnonymousClass7e1, C161797nU, C17490rV {
    public C161637nE A00;
    public C94754ij A01;
    public C160787la A02;
    public HashSet A03 = C36441kJ.A16();

    public static final void A00(C94384i8 r4) {
        if (r4.A08) {
            C161637nE r2 = r4.A00;
            if ((32 & r4.A01) != 0 && (r2 instanceof C161607nB)) {
                AnonymousClass6NB r3 = ((AndroidComposeView) AnonymousClass6VZ.A03(r4)).A0V;
                C114375h9 r22 = C112405dq.A00;
                r3.A03.A0D(AnonymousClass6VZ.A02(r4));
                r3.A04.A0D(r22);
                r3.A01();
            }
            if ((r4.A01 & 8) != 0) {
                AnonymousClass6VZ.A03(r4).BgB();
                return;
            }
            return;
        }
        throw AnonymousClass001.A09("unInitializeModifier called on unattached node");
    }

    public static final void A01(C94384i8 r5, boolean z) {
        if (r5.A08) {
            C161637nE r3 = r5.A00;
            if ((32 & r5.A01) != 0 && (r3 instanceof C161607nB)) {
                C161607nB r4 = (C161607nB) r3;
                C94754ij r1 = r5.A01;
                if (r1 != null) {
                    C114375h9 r2 = C112405dq.A00;
                    if (r1.A01(r2)) {
                        r1.A00 = r4;
                        AnonymousClass6NB r12 = ((AndroidComposeView) AnonymousClass6VZ.A03(r5)).A0V;
                        r12.A01.A0D(r5);
                        r12.A02.A0D(r2);
                        r12.A01();
                    }
                }
                r5.A01 = new C94754ij(r4);
                if (C129776Ik.A00(r5)) {
                    AnonymousClass6NB r22 = ((AndroidComposeView) AnonymousClass6VZ.A03(r5)).A0V;
                    C114375h9 r13 = C112405dq.A00;
                    r22.A01.A0D(r5);
                    r22.A02.A0D(r13);
                    r22.A01();
                }
            }
            if ((4 & r5.A01) != 0 && !z) {
                C137856gq.A06(r5).A0P();
            }
            if ((2 & r5.A01) != 0) {
                if (C129776Ik.A00(r5)) {
                    C94894iy r14 = r5.A05;
                    AnonymousClass00C.A0B(r14);
                    ((C94934jV) r14).A00 = r5;
                    C160967ls r0 = r14.A07;
                    if (r0 != null) {
                        r0.invalidate();
                    }
                }
                if (!z) {
                    C137856gq.A06(r5).A0P();
                    AnonymousClass6VZ.A06(r5);
                }
            }
            if (r3 instanceof C161597nA) {
                C137846gp A022 = AnonymousClass6VZ.A02(r5);
                LazyListState lazyListState = ((C137786gj) ((C161597nA) r3)).A00;
                AnonymousClass7bL r02 = LazyListState.A0R;
                lazyListState.A06 = A022;
            }
            if ((128 & r5.A01) != 0 && (r3 instanceof C161587n9) && C129776Ik.A00(r5)) {
                AnonymousClass6VZ.A06(r5);
            }
            if ((256 & r5.A01) != 0 && (r3 instanceof C161577n8) && C129776Ik.A00(r5)) {
                AnonymousClass6VZ.A06(r5);
            }
            if ((8 & r5.A01) != 0) {
                AnonymousClass6VZ.A03(r5).BgB();
                return;
            }
            return;
        }
        throw AnonymousClass001.A09("initializeModifier called on unattached node");
    }

    public final void A0F() {
        if (this.A08) {
            this.A03.clear();
            ((AndroidComposeView) AnonymousClass6VZ.A03(this)).A0Z.A00(this, new AnonymousClass7J5(this), C129776Ik.A00);
        }
    }

    public void B1I(C158817iH r2) {
        throw AnonymousClass001.A09("applyFocusProperties called on wrong node");
    }

    public void B1K(AnonymousClass7e3 r8) {
        C161637nE r1 = this.A00;
        AnonymousClass00C.A0E(r1, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) ((C161617nC) r1);
        C1496172a r2 = new C1496172a();
        r2.A01 = appendedSemanticsElement.A01;
        appendedSemanticsElement.A00.invoke(r2);
        AnonymousClass00C.A0E(r8, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        C1496172a r82 = (C1496172a) r8;
        if (r2.A01) {
            r82.A01 = true;
        }
        if (r2.A00) {
            r82.A00 = true;
        }
        Iterator A0y = AnonymousClass000.A0y(r2.A02);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            Object key = A11.getKey();
            Object value = A11.getValue();
            Map map = r82.A02;
            if (!map.containsKey(key)) {
                map.put(key, value);
            } else if (value instanceof AnonymousClass69I) {
                Object obj = map.get(key);
                AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                AnonymousClass69I r12 = (AnonymousClass69I) obj;
                String str = r12.A00;
                if (str == null) {
                    str = ((AnonymousClass69I) value).A00;
                }
                AnonymousClass00P r13 = r12.A01;
                if (r13 == null) {
                    r13 = ((AnonymousClass69I) value).A01;
                }
                map.put(key, new AnonymousClass69I(str, r13));
            }
        }
    }

    public void B5y(C161667nH r3) {
        C161637nE r1 = this.A00;
        AnonymousClass00C.A0E(r1, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        ((C161627nD) r1).B5y(r3);
    }

    public Object BAY(C114375h9 r10) {
        this.A03.add(r10);
        C137856gq r1 = this.A03;
        if (r1.A08) {
            C137856gq r6 = r1.A04;
            C137846gp A022 = AnonymousClass6VZ.A02(this);
            if (A022 != null) {
                while (true) {
                    if ((A022.A0R.A02.A00 & 32) != 0) {
                        while (r6 != null) {
                            if ((r6.A01 & 32) != 0) {
                                C137856gq r7 = r6;
                                C1506776e r4 = null;
                                do {
                                    if (r7 instanceof C161807nV) {
                                        AnonymousClass65T BGK = ((C161807nV) r7).BGK();
                                        if (BGK.A01(r10)) {
                                            return BGK.A00(r10);
                                        }
                                    } else if ((r7.A01 & 32) != 0 && (r7 instanceof C94114hf)) {
                                        int i = 0;
                                        for (C137856gq r2 = ((C94114hf) r7).A00; r2 != null; r2 = r2.A02) {
                                            if ((r2.A01 & 32) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    r7 = r2;
                                                } else {
                                                    r4 = C90464aC.A0F(r4);
                                                    r7 = C90524aI.A0D(r4, r7);
                                                    r4.A0D(r2);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                            continue;
                                        }
                                    }
                                    r7 = AnonymousClass6VZ.A00(r4);
                                    continue;
                                } while (r7 != null);
                            }
                            r6 = r6.A04;
                        }
                    }
                    A022 = A022.A0A();
                    if (A022 == null) {
                        break;
                    }
                    AnonymousClass6XQ r0 = A022.A0R;
                    if (r0 != null) {
                        r6 = r0.A05;
                    } else {
                        r6 = null;
                    }
                }
            }
            return r10.A00.invoke();
        }
        throw AnonymousClass001.A09("visitAncestors called on an unattached node");
    }

    public AnonymousClass65T BGK() {
        C94754ij r0 = this.A01;
        if (r0 == null) {
            return C94774il.A00;
        }
        return r0;
    }

    public boolean BKp() {
        AnonymousClass00C.A0E(this.A00, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        throw AnonymousClass001.A0A("getPointerInputFilter");
    }

    public C160287kl BPi(C161687nJ r9, C161717nM r10, long j) {
        C161637nE r2 = this.A00;
        AnonymousClass00C.A0E(r2, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        C36321k7.A0w(r10, r9);
        AnonymousClass6Q4 BPj = r9.BPj(j);
        int i = BPj.A01;
        long j2 = ((C137616gR) ((C161567n7) r2)).A00;
        long j3 = C113625fq.A00;
        if (j2 != j3) {
            int max = Math.max(i, r10.Bor(C90464aC.A01(j2)));
            int i2 = BPj.A00;
            if (j2 != j3) {
                int max2 = Math.max(i2, r10.Bor(C90464aC.A00(j2)));
                return C90474aD.A0M(r10, new C154907Ua(BPj, max, max2), max, max2);
            }
            throw AnonymousClass001.A09("DpSize is unspecified");
        }
        throw AnonymousClass001.A09("DpSize is unspecified");
    }

    public Object BPv(C161937ni r3, Object obj) {
        AnonymousClass00C.A0E(this.A00, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        throw AnonymousClass001.A0A("modifyParentData");
    }

    public void BT3() {
        AnonymousClass00C.A0E(this.A00, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        throw AnonymousClass001.A0A("getPointerInputFilter");
    }

    public void BYG(C157647ds r2) {
        throw AnonymousClass001.A09("onFocusEvent called on wrong node");
    }

    public void BYg(C160787la r4) {
        C161637nE r2 = this.A00;
        AnonymousClass00C.A0E(r2, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        AwaitFirstLayoutModifier awaitFirstLayoutModifier = (AwaitFirstLayoutModifier) ((C161577n8) r2);
        if (!awaitFirstLayoutModifier.A01) {
            awaitFirstLayoutModifier.A01 = true;
            C023509x r1 = awaitFirstLayoutModifier.A00;
            if (r1 != null) {
                r1.resumeWith(AnonymousClass0AJ.A00);
            }
            awaitFirstLayoutModifier.A00 = null;
        }
    }

    public void Bcv(C120675rt r3, C107935Rl r4, long j) {
        AnonymousClass00C.A0E(this.A00, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        throw AnonymousClass001.A0A("getPointerInputFilter");
    }

    public void BeX(long j) {
        C161637nE r3 = this.A00;
        if (r3 instanceof C161587n9) {
            C95044jh r32 = (C95044jh) ((C161587n9) r3);
            if (r32.A00 != j) {
                r32.A01.invoke(new C131286Ol(j));
                r32.A00 = j;
            }
        }
    }

    public boolean Bst() {
        AnonymousClass00C.A0E(this.A00, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        throw AnonymousClass001.A0A("getPointerInputFilter");
    }

    public String toString() {
        return this.A00.toString();
    }

    public C94384i8(C161637nE r2) {
        this.A01 = AnonymousClass6X7.A00(r2);
        this.A00 = r2;
    }

    public /* synthetic */ boolean BHU() {
        return false;
    }

    public boolean BNc() {
        return this.A08;
    }

    public /* synthetic */ void BVP() {
        BT3();
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public void BaV() {
        C109225Wt.A00(this);
    }

    public /* synthetic */ void BkO() {
        BT3();
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public void Bcj(C160787la r1) {
        this.A02 = r1;
    }
}
