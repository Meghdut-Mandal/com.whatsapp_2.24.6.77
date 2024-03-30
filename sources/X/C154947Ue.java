package X;

import android.view.DragEvent;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.7Ue  reason: invalid class name and case insensitive filesystem */
public final class C154947Ue extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C114345h4 $event$inlined;
    public final /* synthetic */ C10810fG $match;
    public final /* synthetic */ C94134hh this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154947Ue(C114345h4 r2, C94134hh r3, C10810fG r4) {
        super(1);
        this.$match = r4;
        this.this$0 = r3;
        this.$event$inlined = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C161857na r6 = (C161857na) obj;
        if (r6 instanceof C161647nF) {
            C161647nF r4 = (C161647nF) r6;
            if (((C135616cz) ((AndroidComposeView) AnonymousClass6VZ.A03(this.this$0)).A0Q).A00.contains(r4)) {
                DragEvent dragEvent = this.$event$inlined.A00;
                long A0B = C90464aC.A0B(dragEvent.getX(), dragEvent.getY());
                long j = C133206Xf.A03;
                if (AnonymousClass5WN.A00(r4, A0B)) {
                    this.$match.element = r6;
                    return C107945Rm.CancelTraversal;
                }
            }
        }
        return C107945Rm.ContinueTraversal;
    }
}
