package X;

import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.7Ud  reason: invalid class name and case insensitive filesystem */
public final class C154937Ud extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C10770fC $handledByChild;
    public final /* synthetic */ C114345h4 $startEvent;
    public final /* synthetic */ C94134hh this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154937Ud(C114345h4 r2, C94134hh r3, C10770fC r4) {
        super(1);
        this.$handledByChild = r4;
        this.$startEvent = r2;
        this.this$0 = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C94134hh r7 = (C94134hh) obj;
        C10770fC r5 = this.$handledByChild;
        boolean z = r5.element;
        C114345h4 r3 = this.$startEvent;
        boolean z2 = false;
        if (r7.A08) {
            C10770fC r1 = new C10770fC();
            C94134hh.A00(r7, new C154937Ud(r3, r7, r1));
            if (r1.element) {
                z2 = true;
            }
        }
        C94134hh r0 = this.this$0;
        if (z2) {
            ((C135616cz) ((AndroidComposeView) AnonymousClass6VZ.A03(r0)).A0Q).A00.add(r7);
        }
        r5.element = z | z2;
        return C36371kC.A0m();
    }
}
