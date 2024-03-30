package X;

import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.52W  reason: invalid class name */
public final class AnonymousClass52W extends C97034oI {
    public AnonymousClass60n A00;
    public final LinearLayout A01;
    public final CallGridViewModel A02;
    public final WDSButton A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass52W(View view, AnonymousClass16L r10, CallGridViewModel callGridViewModel, AnonymousClass1Pp r12, AnonymousClass171 r13) {
        super(view, r10, (C116925lQ) null, callGridViewModel, r12, r13);
        C36321k7.A18(r10, view, r12, r13);
        this.A02 = callGridViewModel;
        this.A01 = (LinearLayout) C36361kB.A0G(view, R.id.container);
        this.A03 = (WDSButton) C36361kB.A0G(view, R.id.stop_btn);
    }

    public void A0D(int i) {
    }

    public void A0H(C129066Eu r3) {
        AnonymousClass00C.A0D(r3, 0);
        this.A05 = r3;
        this.A01.setRotation((float) r3.A03);
        C36411kG.A1C(this.A03, this, r3, 39);
    }

    public void A0B() {
        if (A0A()) {
            this.A05 = null;
            this.A03.setOnClickListener((View.OnClickListener) null);
        }
    }
}
