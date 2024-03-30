package X;

import androidx.compose.animation.core.InfiniteTransition$run$1;

/* renamed from: X.63C  reason: invalid class name */
public final class AnonymousClass63C {
    public long A00;
    public final C161547n5 A01;
    public final C161547n5 A02;
    public final C1506776e A03 = C1506776e.A02(new C137106fb[16]);

    public AnonymousClass63C() {
        C137076fY r3 = C137076fY.A00;
        this.A02 = C93994hT.A00(r3, false, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A00 = Long.MIN_VALUE;
        this.A01 = C93994hT.A00(r3, C36371kC.A0m(), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
    }

    public final void A00(C161337ma r4, int i) {
        r4.Bun(-318043801);
        Object A0X = C90494aF.A0X(r4);
        if (A0X == C129736Ig.A00) {
            A0X = C93994hT.A00(C137076fY.A00, (Object) null, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
            r4.Bwv(A0X);
        }
        C136916fF.A0N(r4);
        C161547n5 r1 = (C161547n5) A0X;
        if (C90474aD.A1U(this.A01) || C90474aD.A1U(this.A02)) {
            C132846Vm.A03(r4, this, new InfiniteTransition$run$1(this, r1, (C023509x) null));
        }
        C136976fO B6Z = r4.B6Z();
        if (B6Z != null) {
            B6Z.A06 = new AnonymousClass7Y9(this, i);
        }
    }
}
