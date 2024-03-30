package X;

import com.whatsapp.R;
import com.whatsapp.extensions.webview.view.FlowsWebBottomSheetContainer;

/* renamed from: X.6pm  reason: invalid class name and case insensitive filesystem */
public final class C142976pm implements AnonymousClass7fZ {
    public final /* synthetic */ AnonymousClass01I A00;
    public final /* synthetic */ FlowsWebBottomSheetContainer A01;
    public final /* synthetic */ String A02;

    public void Bdc(AnonymousClass9N9 r6, boolean z) {
        if (AnonymousClass00C.A0J(this.A02, r6.A03)) {
            AnonymousClass005 r0 = this.A01.A0L;
            if (r0 != null) {
                ((C202279lS) r0.get()).A0O.remove(this);
                C225014r r3 = (C225014r) this.A00;
                r3.Bnv();
                if (z) {
                    r3.BO9(new Object[0], R.string.f12nameremoved, R.string.f12nameremoved);
                } else {
                    r3.BO5(R.string.f12nameremoved);
                }
            } else {
                throw C36331k8.A0d("catalogManagerLazy");
            }
        }
    }

    public C142976pm(AnonymousClass01I r1, FlowsWebBottomSheetContainer flowsWebBottomSheetContainer, String str) {
        this.A02 = str;
        this.A01 = flowsWebBottomSheetContainer;
        this.A00 = r1;
    }
}
