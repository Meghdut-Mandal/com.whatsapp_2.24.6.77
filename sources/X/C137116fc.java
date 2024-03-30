package X;

/* renamed from: X.6fc  reason: invalid class name and case insensitive filesystem */
public final class C137116fc implements C157597dn {
    public int A00;
    public final C161547n5 A01;

    public C137116fc(int i) {
        int i2 = (i / 30) * 30;
        this.A01 = C93994hT.A00(C137076fY.A00, C15040mb.A05(Math.max(i2 - 100, 0), i2 + 30 + 100), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A00 = i;
    }

    public final void A00(int i) {
        if (i != this.A00) {
            this.A00 = i;
            int i2 = (i / 30) * 30;
            this.A01.setValue(C15040mb.A05(Math.max(i2 - 100, 0), i2 + 30 + 100));
        }
    }

    public /* bridge */ /* synthetic */ Object getValue() {
        return this.A01.getValue();
    }
}
