package X;

import androidx.compose.foundation.gestures.AbstractDraggableNode;

/* renamed from: X.7Qi  reason: invalid class name and case insensitive filesystem */
public final class C153957Qi extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AbstractDraggableNode this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C153957Qi(AbstractDraggableNode abstractDraggableNode) {
        super(1);
        this.this$0 = abstractDraggableNode;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        float A00;
        AnonymousClass6E5 r6 = (AnonymousClass6E5) obj;
        C158747iA r4 = ((C93374gS) this.this$0).A04;
        long A02 = C133206Xf.A02(r6.A06, r6.A07);
        if (((C163947r1) r4).A00 != 0) {
            A00 = C133206Xf.A01(A02);
        } else {
            A00 = C133206Xf.A00(A02);
        }
        int i = (Math.abs(A00) > 0.0f ? 1 : (Math.abs(A00) == 0.0f ? 0 : -1));
        boolean z = false;
        if (i == 0) {
            z = true;
        }
        return C36441kJ.A0x(z);
    }
}
