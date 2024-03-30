package X;

import java.util.Set;

/* renamed from: X.4gi  reason: invalid class name and case insensitive filesystem */
public final class C93534gi extends C129136Fi {
    public Set A00;
    public final int A01;
    public final C161547n5 A02 = C93994hT.A00(C137066fX.A00, C93824hC.A00, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>");
    public final Set A03 = C36441kJ.A17();
    public final boolean A04;
    public final boolean A05;
    public final AnonymousClass6G1 A06;
    public final /* synthetic */ C136916fF A07;

    public C93534gi(C136916fF r4, AnonymousClass6G1 r5, int i, boolean z, boolean z2) {
        this.A07 = r4;
        this.A01 = i;
        this.A04 = z;
        this.A05 = z2;
        this.A06 = r5;
    }

    public final void A0C() {
        Set<C136916fF> set = this.A03;
        if (C90514aH.A1a(set)) {
            Set<Set> set2 = this.A00;
            if (set2 != null) {
                for (C136916fF r3 : set) {
                    for (Set remove : set2) {
                        remove.remove(r3.A0Y);
                    }
                }
            }
            set.clear();
        }
    }
}
