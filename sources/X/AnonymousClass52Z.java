package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;

/* renamed from: X.52Z  reason: invalid class name */
public class AnonymousClass52Z extends C1028252b {
    public final TextView A00;

    public void A0D(int i) {
    }

    public void A0H(C129066Eu r4) {
        C61243Bc r0 = r4.A09;
        if (r0 != null) {
            TextView textView = this.A00;
            CharSequence A0V = C90474aD.A0V(textView, r0);
            textView.setVisibility(0);
            textView.setText(A0V);
        } else {
            this.A00.setVisibility(8);
        }
        super.A0H(r4);
    }

    public AnonymousClass52Z(View view, AnonymousClass1LI r3, AnonymousClass16L r4, C116925lQ r5, CallGridViewModel callGridViewModel, AnonymousClass1Pp r7, AnonymousClass171 r8, C18820ts r9, C20810yC r10) {
        super(view, r3, r4, r5, callGridViewModel, r7, r8, r9, r10);
        this.A02 = 0;
        this.A00 = C36391kE.A0O(view, R.id.audio_call_status);
    }
}
