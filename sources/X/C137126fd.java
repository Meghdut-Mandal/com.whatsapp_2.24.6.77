package X;

/* renamed from: X.6fd  reason: invalid class name and case insensitive filesystem */
public final class C137126fd implements C157597dn {
    public long A00;
    public long A01;
    public C129076Ev A02;
    public boolean A03;
    public final C156857b4 A04;
    public final C161547n5 A05;

    public Object getValue() {
        return this.A05.getValue();
    }

    public C137126fd(C129076Ev r3, C156857b4 r4, Object obj, long j, long j2, boolean z) {
        C129076Ev A002;
        this.A04 = r4;
        this.A05 = C93994hT.A00(C137076fY.A00, obj, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        if (r3 != null) {
            A002 = C108975Vs.A00(r3);
        } else {
            A002 = C136386eJ.A00(r4, obj);
            A002.A04();
        }
        this.A02 = A002;
        this.A01 = j;
        this.A00 = j2;
        this.A03 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AnimationState(value=");
        A0u.append(this.A05.getValue());
        A0u.append(", velocity=");
        A0u.append(((C136386eJ) this.A04).A00.invoke(this.A02));
        A0u.append(", isRunning=");
        A0u.append(this.A03);
        A0u.append(", lastFrameTimeNanos=");
        A0u.append(this.A01);
        A0u.append(", finishedTimeNanos=");
        return C36331k8.A0j(A0u, this.A00);
    }
}
