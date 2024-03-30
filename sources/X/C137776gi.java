package X;

/* renamed from: X.6gi  reason: invalid class name and case insensitive filesystem */
public final class C137776gi implements C157707dy, C157717dz, AnonymousClass7bE {
    public final C161507n1 A00 = new C94024hW(-1);
    public final C161507n1 A01 = new C94024hW(0);
    public final C161547n5 A02;
    public final C161547n5 A03;
    public final Object A04;
    public final AnonymousClass76V A05;

    public C137776gi Blc() {
        C137776gi r1;
        C161507n1 r2 = this.A01;
        if (r2.BCn() == 0) {
            this.A05.A00.add(this);
            C157717dz r0 = (C157717dz) this.A02.getValue();
            if (r0 != null) {
                r1 = r0.Blc();
            } else {
                r1 = null;
            }
            this.A03.setValue(r1);
        }
        r2.Br4(r2.BCn() + 1);
        return this;
    }

    public void release() {
        C161507n1 r1 = this.A01;
        if (r1.BCn() > 0) {
            r1.Br4(r1.BCn() - 1);
            if (r1.BCn() == 0) {
                this.A05.A00.remove(this);
                C161547n5 r12 = this.A03;
                C157707dy r0 = (C157707dy) r12.getValue();
                if (r0 != null) {
                    r0.release();
                }
                r12.setValue((Object) null);
                return;
            }
            return;
        }
        throw AnonymousClass001.A09("Release should only be called once");
    }

    public C137776gi(AnonymousClass76V r5, Object obj) {
        this.A04 = obj;
        this.A05 = r5;
        AnonymousClass00T r0 = C113525fg.A01;
        C137076fY r2 = C137076fY.A00;
        this.A03 = C93994hT.A00(r2, (Object) null, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A02 = C93994hT.A00(r2, (Object) null, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
    }
}
