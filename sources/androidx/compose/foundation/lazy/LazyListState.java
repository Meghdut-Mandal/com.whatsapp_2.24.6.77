package androidx.compose.foundation.lazy;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass040;
import X.AnonymousClass0AJ;
import X.AnonymousClass64S;
import X.AnonymousClass6SC;
import X.AnonymousClass6VV;
import X.AnonymousClass75F;
import X.AnonymousClass76V;
import X.AnonymousClass7WB;
import X.AnonymousClass7ZE;
import X.AnonymousClass7bF;
import X.AnonymousClass7bL;
import X.AnonymousClass7e0;
import X.C007103b;
import X.C023509x;
import X.C07710Yz;
import X.C114135gh;
import X.C114245gu;
import X.C114255gv;
import X.C114265gw;
import X.C1269066c;
import X.C129076Ev;
import X.C129726If;
import X.C136386eJ;
import X.C136616eh;
import X.C136726et;
import X.C136766ex;
import X.C136836f4;
import X.C136846f5;
import X.C137056fW;
import X.C137076fY;
import X.C137126fd;
import X.C137206fl;
import X.C137746ge;
import X.C137786gj;
import X.C138226hV;
import X.C154037Qq;
import X.C155887Xv;
import X.C156857b4;
import X.C156917bA;
import X.C156927bB;
import X.C157527dg;
import X.C160557lC;
import X.C161437mu;
import X.C161547n5;
import X.C161597nA;
import X.C161937ni;
import X.C36321k7;
import X.C36331k8;
import X.C36401kF;
import X.C90474aD;
import X.C90484aE;
import X.C93304gL;
import X.C93994hT;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.unit.Constraints;
import java.util.List;

public final class LazyListState implements C160557lC {
    public static final AnonymousClass7bL A0R;
    public float A00;
    public int A01;
    public long A02;
    public C137126fd A03;
    public C137746ge A04;
    public C157527dg A05;
    public AnonymousClass7e0 A06;
    public C161937ni A07;
    public AnonymousClass040 A08;
    public boolean A09;
    public boolean A0A;
    public int A0B;
    public boolean A0C;
    public final C160557lC A0D;
    public final C161437mu A0E;
    public final AnonymousClass64S A0F;
    public final AnonymousClass6SC A0G;
    public final AwaitFirstLayoutModifier A0H;
    public final C114255gv A0I;
    public final AnonymousClass76V A0J;
    public final C114265gw A0K;
    public final C161547n5 A0L;
    public final C161547n5 A0M;
    public final C161547n5 A0N;
    public final C161547n5 A0O;
    public final C161597nA A0P;
    public final C114245gu A0Q;

    static {
        AnonymousClass7ZE r0 = AnonymousClass7ZE.A00;
        AnonymousClass7WB r2 = AnonymousClass7WB.A00;
        C155887Xv r1 = new C155887Xv(r0);
        AnonymousClass00C.A0E(r2, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, Original of androidx.compose.runtime.saveable.ListSaverKt.listSaver?>");
        C07710Yz.A03(r2, 1);
        A0R = new C137206fl(r2, r1);
    }

    public static final void A00(C156927bB r4, LazyListState lazyListState, float f) {
        boolean z;
        int i;
        C157527dg r1;
        C157527dg r12;
        if (lazyListState.A0C) {
            C137746ge r42 = (C137746ge) r4;
            List list = r42.A08;
            if (!list.isEmpty()) {
                if (f < 0.0f) {
                    z = true;
                    i = ((C136766ex) ((C156917bA) C007103b.A0N(list))).A03 + 1;
                } else {
                    z = false;
                    i = ((C136766ex) ((C156917bA) C007103b.A0L(list))).A03 - 1;
                }
                if (i != lazyListState.A01 && i >= 0 && i < r42.A04) {
                    if (!(lazyListState.A0A == z || (r12 = lazyListState.A05) == null)) {
                        r12.cancel();
                    }
                    lazyListState.A0A = z;
                    lazyListState.A01 = i;
                    C114265gw r13 = lazyListState.A0K;
                    long j = lazyListState.A02;
                    AnonymousClass7bF r2 = r13.A00;
                    if (r2 != null) {
                        AnonymousClass75F r22 = (AnonymousClass75F) r2;
                        r1 = new C136836f4(i, j);
                        r22.A05.A0D(r1);
                        if (!r22.A00) {
                            r22.A00 = true;
                            r22.A04.post(r22);
                        }
                    } else {
                        r1 = C136846f5.A00;
                    }
                    lazyListState.A05 = r1;
                }
            }
        }
    }

    public final void A01(C137746ge r24, boolean z, boolean z2) {
        Object obj;
        int i;
        Snapshot A062;
        C137746ge r4 = r24;
        if (z) {
            this.A09 = true;
        } else if (this.A09) {
            this.A04 = r4;
            return;
        }
        AnonymousClass6SC r7 = this.A0G;
        if (z2) {
            int i2 = r4.A01;
            if (((float) i2) >= 0.0f) {
                r7.A04.Br4(i2);
            } else {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("scrollOffset should be non-negative (");
                throw AnonymousClass001.A09(C36321k7.A0G(A0u, i2));
            }
        } else {
            C136766ex r6 = r4.A07;
            if (r6 != null) {
                obj = r6.A07;
            } else {
                obj = null;
            }
            r7.A00 = obj;
            if (r7.A01 || r4.A04 > 0) {
                r7.A01 = true;
                int i3 = r4.A01;
                int i4 = 0;
                if (((float) i3) >= 0.0f) {
                    if (r6 != null) {
                        i4 = r6.A03;
                    }
                    AnonymousClass6SC.A00(r7, i4, i3);
                } else {
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("scrollOffset should be non-negative (");
                    throw AnonymousClass001.A09(C36321k7.A0G(A0u2, i3));
                }
            }
            if (this.A01 != -1) {
                List list = r4.A08;
                if (C36401kF.A1a(list)) {
                    if (this.A0A) {
                        i = ((C136766ex) ((C156917bA) C007103b.A0N(list))).A03 + 1;
                    } else {
                        i = ((C136766ex) ((C156917bA) C007103b.A0L(list))).A03 - 1;
                    }
                    if (this.A01 != i) {
                        this.A01 = -1;
                        C157527dg r1 = this.A05;
                        if (r1 != null) {
                            r1.cancel();
                        }
                        this.A05 = null;
                    }
                }
            }
        }
        C136766ex r12 = r4.A07;
        boolean z3 = false;
        if (!((r12 == null || r12.A03 == 0) && r4.A01 == 0)) {
            z3 = true;
        }
        C90474aD.A11(this.A0L, z3);
        C90474aD.A11(this.A0M, r4.A02);
        this.A00 -= r4.A00;
        this.A0N.setValue(r4);
        if (z) {
            float f = r4.A03;
            if (f > this.A07.Bvq(C129726If.A00)) {
                Snapshot A022 = AnonymousClass6VV.A02();
                try {
                    A062 = A022.A06();
                    float A023 = C90484aE.A02(this.A03.A05);
                    C137126fd r2 = this.A03;
                    boolean z4 = r2.A03;
                    if (z4) {
                        float f2 = ((C93304gL) r2.A02).A00;
                        this.A03 = new C137126fd(new C93304gL(f2), r2.A04, Float.valueOf(A023 - f), r2.A01, r2.A00, z4);
                        AnonymousClass040 r22 = this.A08;
                        if (r22 != null) {
                            C36331k8.A1T(new LazyListState$updateScrollDeltaForPostLookahead$2$1(this, (C023509x) null), r22);
                        }
                    } else {
                        this.A03 = new C137126fd((C129076Ev) null, C114135gh.A02, Float.valueOf(-f), Long.MIN_VALUE, Long.MIN_VALUE, false);
                        AnonymousClass040 r23 = this.A08;
                        if (r23 != null) {
                            C36331k8.A1T(new LazyListState$updateScrollDeltaForPostLookahead$2$2(this, (C023509x) null), r23);
                        }
                    }
                    C1269066c.A00(A062);
                    A022.A0B();
                } catch (Throwable th) {
                    A022.A0B();
                    throw th;
                }
            }
        }
        this.A0B++;
    }

    public float B5g(float f) {
        return this.A0D.B5g(f);
    }

    public boolean B9N() {
        return C90474aD.A1U(this.A0L);
    }

    public boolean B9O() {
        return C90474aD.A1U(this.A0M);
    }

    public boolean BN7() {
        return this.A0D.BN7();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
        if (r1.BpQ(r7, r5, r9) != r3) goto L_0x0023;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object BpQ(X.AnonymousClass5RT r7, X.C023509x r8, X.C009003v r9) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C151627Ah
            if (r0 == 0) goto L_0x005c
            r5 = r8
            X.7Ah r5 = (X.C151627Ah) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005c
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r4 = r5.result
            X.0AO r3 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r5.label
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0026
            if (r0 == r1) goto L_0x003b
            if (r0 != r2) goto L_0x0062
            X.AnonymousClass0AN.A00(r4)
        L_0x0023:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0026:
            X.AnonymousClass0AN.A00(r4)
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r0 = r6.A0H
            r5.L$0 = r6
            r5.L$1 = r7
            r5.L$2 = r9
            r5.label = r1
            java.lang.Object r0 = r0.A00(r5)
            if (r0 == r3) goto L_0x005b
            r0 = r6
            goto L_0x004a
        L_0x003b:
            java.lang.Object r9 = r5.L$2
            X.03v r9 = (X.C009003v) r9
            java.lang.Object r7 = r5.L$1
            X.5RT r7 = (X.AnonymousClass5RT) r7
            java.lang.Object r0 = r5.L$0
            androidx.compose.foundation.lazy.LazyListState r0 = (androidx.compose.foundation.lazy.LazyListState) r0
            X.AnonymousClass0AN.A00(r4)
        L_0x004a:
            X.7lC r1 = r0.A0D
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.L$2 = r0
            r5.label = r2
            java.lang.Object r0 = r1.BpQ(r7, r5, r9)
            if (r0 != r3) goto L_0x0023
        L_0x005b:
            return r3
        L_0x005c:
            X.7Ah r5 = new X.7Ah
            r5.<init>(r6, r8)
            goto L_0x0012
        L_0x0062:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListState.BpQ(X.5RT, X.09x, X.03v):java.lang.Object");
    }

    public LazyListState(int i, int i2) {
        this.A0G = new AnonymousClass6SC(i, i2);
        this.A0Q = new C114245gu(this);
        C137746ge r0 = C129726If.A01;
        C137056fW r4 = C137056fW.A00;
        this.A0N = C93994hT.A00(r4, r0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
        this.A0E = new C136726et();
        this.A07 = new C138226hV(1.0f, 1.0f);
        this.A0D = new C136616eh(new C154037Qq(this));
        this.A0C = true;
        this.A01 = -1;
        this.A0P = new C137786gj(this);
        this.A0H = new AwaitFirstLayoutModifier();
        this.A0F = new AnonymousClass64S();
        this.A0I = new C114255gv();
        this.A02 = Constraints.A01.A01(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
        this.A0J = new AnonymousClass76V();
        C137076fY r2 = C137076fY.A00;
        this.A0M = C93994hT.A00(r2, false, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A0L = C93994hT.A00(r2, false, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        AnonymousClass0AJ r1 = AnonymousClass0AJ.A00;
        AnonymousClass00C.A0E(r4, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
        this.A0O = new C93994hT(r4, r1);
        this.A0K = new C114265gw();
        C156857b4 r22 = C114135gh.A02;
        Float valueOf = Float.valueOf(0.0f);
        this.A03 = new C137126fd(C136386eJ.A00(r22, valueOf), r22, valueOf, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public LazyListState() {
        this(0, 0);
    }
}
