package X;

import android.graphics.Canvas;
import java.util.Map;

/* renamed from: X.4gh  reason: invalid class name and case insensitive filesystem */
public final class C93524gh extends C136496eU implements C159847k1 {
    public int A00 = -1;
    public long A01 = AnonymousClass6X0.A02;
    public final C92374dq A02;
    public final C161547n5 A03;
    public final C161547n5 A04;
    public final C157597dn A05;
    public final C157597dn A06;
    public final AnonymousClass00S A07 = new C151977Is(this);

    public void B67(C161667nH r10) {
        int Bor;
        AnonymousClass00C.A0D(r10, 0);
        long BHc = r10.BHc();
        this.A01 = BHc;
        if (Float.isNaN(Float.NaN)) {
            Bor = C14960mT.A01(C129486He.A00(r10, BHc));
        } else {
            Bor = r10.Bor(Float.NaN);
        }
        this.A00 = Bor;
        long j = ((C133336Xx) this.A05.getValue()).A00;
        float f = ((C128296Br) this.A06.getValue()).A03;
        r10.B63();
        A01(r10, j);
        C161047m3 A002 = C128306Bs.A00(r10.BBD());
        this.A03.getValue();
        C92314dW r2 = (C92314dW) this.A04.getValue();
        if (r2 != null) {
            r2.A02(f, this.A00, r10.BHc(), j);
            Canvas canvas = C112335dj.A00;
            AnonymousClass00C.A0E(A002, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidCanvas");
            r2.draw(((C137386g3) A002).A00);
        }
    }

    public void BeY() {
    }

    private final void A00() {
        C92374dq r4 = this.A02;
        this.A04.setValue((Object) null);
        C118265nb r0 = r4.A02;
        Map map = r0.A01;
        C92314dW r2 = (C92314dW) map.get(this);
        if (r2 != null) {
            r2.A00();
            Object obj = map.get(this);
            if (obj != null) {
                r0.A00.remove(obj);
            }
            map.remove(this);
            r4.A04.add(r2);
        }
    }

    public C93524gh(C92374dq r4, C157597dn r5, C157597dn r6) {
        super(r6);
        this.A05 = r5;
        this.A06 = r6;
        this.A02 = r4;
        C137076fY r2 = C137076fY.A00;
        this.A04 = C93994hT.A00(r2, (Object) null, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A03 = C93994hT.A00(r2, C36371kC.A0m(), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
    }

    public void BQW() {
        A00();
    }

    public void BYM() {
        A00();
    }
}
