package X;

import android.widget.EdgeEffect;
import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;

/* renamed from: X.7Qd  reason: invalid class name and case insensitive filesystem */
public final class C153907Qd extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AndroidEdgeEffectOverscrollEffect this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C153907Qd(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect) {
        super(1);
        this.this$0 = androidEdgeEffectOverscrollEffect;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long j = ((C131286Ol) obj).A00;
        long A02 = AnonymousClass6GI.A02(j);
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = this.this$0;
        long j2 = androidEdgeEffectOverscrollEffect.A01;
        long j3 = AnonymousClass6X0.A02;
        boolean z = !AnonymousClass000.A1Q((A02 > j2 ? 1 : (A02 == j2 ? 0 : -1)));
        androidEdgeEffectOverscrollEffect.A01 = AnonymousClass6GI.A02(j);
        if (z) {
            EdgeEffect edgeEffect = androidEdgeEffectOverscrollEffect.A0B;
            int A08 = C90494aF.A08(j);
            int A03 = C90474aD.A03(j);
            edgeEffect.setSize(A08, A03);
            this.this$0.A05.setSize(A08, A03);
            this.this$0.A07.setSize(A03, A08);
            this.this$0.A09.setSize(A03, A08);
            this.this$0.A0C.setSize(A08, A03);
            this.this$0.A06.setSize(A08, A03);
            this.this$0.A08.setSize(A03, A08);
            this.this$0.A0A.setSize(A03, A08);
            AndroidEdgeEffectOverscrollEffect.A08(this.this$0);
            AndroidEdgeEffectOverscrollEffect.A07(this.this$0);
        }
        return AnonymousClass0AJ.A00;
    }
}
