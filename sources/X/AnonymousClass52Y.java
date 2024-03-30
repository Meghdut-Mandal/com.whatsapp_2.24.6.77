package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;

/* renamed from: X.52Y  reason: invalid class name */
public class AnonymousClass52Y extends AnonymousClass52Z {
    public final TextView A00;
    public final C18820ts A01;
    public final AnonymousClass04S A02 = new C165167sz(this, 37);

    public void A0B() {
        this.A05 = null;
        CallGridViewModel callGridViewModel = this.A04;
        if (callGridViewModel != null) {
            callGridViewModel.A0G.A0B(this.A02);
        }
    }

    public void A0H(C129066Eu r4) {
        CallGridViewModel callGridViewModel = this.A04;
        if (callGridViewModel != null) {
            callGridViewModel.A0G.A0A(this.A02);
        }
        A0I(r4);
        C61243Bc r0 = r4.A09;
        if (r0 != null) {
            TextView textView = this.A00;
            CharSequence A0V = C90474aD.A0V(textView, r0);
            textView.setVisibility(0);
            textView.setText(A0V);
        } else {
            this.A00.setVisibility(8);
        }
        this.A00.setVisibility(C36351kA.A00(r4.A0R ? 1 : 0));
        A0J(r4, false);
        this.A05 = r4;
    }

    public AnonymousClass52Y(View view, AnonymousClass1LI r4, AnonymousClass16L r5, C116925lQ r6, CallGridViewModel callGridViewModel, AnonymousClass1Pp r8, AnonymousClass171 r9, C18820ts r10, C20810yC r11) {
        super(view, r4, r5, r6, callGridViewModel, r8, r9, r10, r11);
        this.A01 = r10;
        this.A00 = C36391kE.A0O(view, R.id.audio_call_duration);
    }
}
