package X;

import androidx.compose.animation.core.Animatable$runAnimation$2;
import androidx.compose.animation.core.MutatorMutex$mutate$2;

/* renamed from: X.6Td  reason: invalid class name and case insensitive filesystem */
public final class C132336Td {
    public C129076Ev A00;
    public C129076Ev A01;
    public final C137126fd A02;
    public final C118225nX A03 = new C118225nX();
    public final C156857b4 A04;
    public final C161547n5 A05;
    public final C161547n5 A06;
    public final C129076Ev A07;
    public final C129076Ev A08;
    public final C136306eA A09;
    public final Object A0A;

    public final Object A03(AnonymousClass7dW r15, Object obj, Object obj2, C023509x r18) {
        C137126fd r1 = this.A02;
        Object value = r1.A05.getValue();
        C156857b4 r11 = this.A04;
        Object obj3 = obj2;
        C136286e8 r8 = new C136286e8(r15, C136386eJ.A00(r11, obj3), r11, value, obj);
        long j = r1.A01;
        return C009403z.A00(r18, new MutatorMutex$mutate$2(AnonymousClass5RS.Default, this.A03, (C023509x) null, new Animatable$runAnimation$2(this, r8, obj3, (C023509x) null, (C006302t) null, j)));
    }

    public static final Object A00(C132336Td r8, Object obj) {
        C129076Ev r7 = r8.A00;
        if (!AnonymousClass00C.A0J(r7, r8.A07) || !AnonymousClass00C.A0J(r8.A01, r8.A08)) {
            C136386eJ r6 = (C136386eJ) r8.A04;
            C129076Ev r5 = (C129076Ev) r6.A01.invoke(obj);
            int A022 = r5.A02();
            boolean z = false;
            for (int i = 0; i < A022; i++) {
                if (r5.A01(i) < r7.A01(i) || r5.A01(i) > r8.A01.A01(i)) {
                    r5.A05(i, C15040mb.A01(r5.A01(i), r7.A01(i), r8.A01.A01(i)));
                    z = true;
                }
            }
            if (z) {
                return r6.A00.invoke(r5);
            }
        }
        return obj;
    }

    public static final void A01(C132336Td r3) {
        C137126fd r2 = r3.A02;
        r2.A02.A04();
        r2.A01 = Long.MIN_VALUE;
        C90474aD.A11(r3.A05, false);
    }

    public final Object A02() {
        return ((C136386eJ) this.A04).A00.invoke(this.A02.A02);
    }

    public C132336Td(C156857b4 r10, Object obj, Object obj2) {
        C129076Ev r3;
        C129076Ev r0;
        this.A04 = r10;
        this.A0A = obj2;
        this.A02 = new C137126fd((C129076Ev) null, r10, obj, Long.MIN_VALUE, Long.MIN_VALUE, false);
        C137076fY r2 = C137076fY.A00;
        this.A05 = C93994hT.A00(r2, false, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A06 = C93994hT.A00(r2, obj, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A09 = new C136306eA(obj2, 1500.0f);
        C129076Ev r1 = this.A02.A02;
        if (r1 instanceof C93304gL) {
            r3 = AnonymousClass6J9.A00;
        } else if (r1 instanceof C93314gM) {
            r3 = AnonymousClass6J9.A02;
        } else if (r1 instanceof C93324gN) {
            r3 = AnonymousClass6J9.A04;
        } else {
            r3 = AnonymousClass6J9.A06;
        }
        AnonymousClass00C.A0E(r3, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.A07 = r3;
        C129076Ev r12 = this.A02.A02;
        if (r12 instanceof C93304gL) {
            r0 = AnonymousClass6J9.A01;
        } else if (r12 instanceof C93314gM) {
            r0 = AnonymousClass6J9.A03;
        } else if (r12 instanceof C93324gN) {
            r0 = AnonymousClass6J9.A05;
        } else {
            r0 = AnonymousClass6J9.A07;
        }
        AnonymousClass00C.A0E(r0, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.A08 = r0;
        this.A00 = r3;
        this.A01 = r0;
    }
}
