package X;

/* renamed from: X.6fU  reason: invalid class name and case insensitive filesystem */
public final class C137036fU implements C159847k1, AnonymousClass7bM {
    public C157607do A00;
    public C160267kj A01;
    public AnonymousClass7bL A02;
    public Object A03;
    public String A04;
    public Object[] A05;
    public final AnonymousClass00S A06 = new C152007Iv(this);

    public static final void A00(C137036fU r5) {
        StringBuilder sb;
        String str;
        String A0q;
        C160267kj r4 = r5.A01;
        C157607do r2 = r5.A00;
        if (r2 != null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("entry(");
            A0u.append(r2);
            throw AnonymousClass000.A0c(") is not null", A0u);
        } else if (r4 != null) {
            AnonymousClass00S r1 = r5.A06;
            Object invoke = r1.invoke();
            if (invoke == null || r4.B2M(invoke)) {
                r5.A00 = r4.BnI(r5.A04, r1);
                return;
            }
            if (invoke instanceof C161487mz) {
                C161487mz r3 = (C161487mz) invoke;
                C157587dm BG0 = r3.BG0();
                C137056fW r12 = C137056fW.A00;
                AnonymousClass00C.A0E(r12, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
                if (BG0 != r12) {
                    C157587dm BG02 = r3.BG0();
                    C137076fY r13 = C137076fY.A00;
                    AnonymousClass00C.A0E(r13, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
                    if (BG02 != r13) {
                        C157587dm BG03 = r3.BG0();
                        C137066fX r14 = C137066fX.A00;
                        AnonymousClass00C.A0E(r14, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>");
                        if (BG03 != r14) {
                            A0q = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                        }
                    }
                }
                sb = AnonymousClass000.A0u();
                sb.append("MutableState containing ");
                sb.append(r3.getValue());
                str = " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                A0q = AnonymousClass000.A0q(str, sb);
            } else {
                sb = C36381kD.A11(invoke);
                str = " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
                A0q = AnonymousClass000.A0q(str, sb);
            }
            throw AnonymousClass001.A08(A0q);
        }
    }

    public void BQW() {
        C157607do r0 = this.A00;
        if (r0 != null) {
            r0.BwK();
        }
    }

    public void BYM() {
        C157607do r0 = this.A00;
        if (r0 != null) {
            r0.BwK();
        }
    }

    public C137036fU(C160267kj r2, AnonymousClass7bL r3, Object obj, String str, Object[] objArr) {
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = str;
        this.A03 = obj;
        this.A05 = objArr;
    }

    public void BeY() {
        A00(this);
    }
}
