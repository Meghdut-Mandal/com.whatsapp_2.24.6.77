package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;

/* renamed from: X.52a  reason: invalid class name and case insensitive filesystem */
public class C1028152a extends C1028252b {
    public final TextView A00;
    public final TextView A01;
    public final AnonymousClass04S A02 = new C165167sz(this, 42);

    public void A0D(int i) {
        if (this.A02 != i) {
            super.A0D(i);
            C129066Eu r0 = this.A05;
            if (r0 != null) {
                A0H(r0);
            }
        }
    }

    public C1028152a(View view, AnonymousClass1LI r4, AnonymousClass16L r5, C116925lQ r6, CallGridViewModel callGridViewModel, AnonymousClass1Pp r8, AnonymousClass171 r9, C18820ts r10, C20810yC r11) {
        super(view, r4, r5, r6, callGridViewModel, r8, r9, r10, r11);
        this.A02 = -1;
        this.A01 = C36391kE.A0O(view, R.id.audio_call_status);
        this.A00 = C36391kE.A0O(view, R.id.audio_call_duration);
    }

    public void A0B() {
        super.A0B();
        this.A05 = null;
        CallGridViewModel callGridViewModel = this.A04;
        if (callGridViewModel != null) {
            callGridViewModel.A0G.A0B(this.A02);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r2.A0K != false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0H(X.C129066Eu r5) {
        /*
            r4 = this;
            super.A0H(r5)
            X.6Eu r2 = r4.A05
            if (r2 == 0) goto L_0x0011
            int r1 = r4.A02
            r0 = 4
            if (r1 != r0) goto L_0x0011
            boolean r1 = r2.A0K
            r0 = 1
            if (r1 == 0) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            r3 = 0
            r2 = 8
            if (r0 == 0) goto L_0x0049
            X.3Bc r0 = r5.A09
            if (r0 == 0) goto L_0x0043
            android.widget.TextView r1 = r4.A01
            java.lang.CharSequence r0 = X.C90474aD.A0V(r1, r0)
            r1.setVisibility(r3)
            r1.setText(r0)
        L_0x0027:
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r4.A04
            if (r0 == 0) goto L_0x0032
            X.00s r1 = r0.A0G
            X.04S r0 = r4.A02
            r1.A0A(r0)
        L_0x0032:
            android.widget.TextView r1 = r4.A00
            boolean r0 = r5.A0R
            if (r0 != 0) goto L_0x003a
            r3 = 8
        L_0x003a:
            r1.setVisibility(r3)
            com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave r0 = r4.A0K
        L_0x003f:
            r0.setVisibility(r2)
            return
        L_0x0043:
            android.widget.TextView r0 = r4.A01
            r0.setVisibility(r2)
            goto L_0x0027
        L_0x0049:
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r4.A04
            if (r0 == 0) goto L_0x0054
            X.00s r1 = r0.A0G
            X.04S r0 = r4.A02
            r1.A0B(r0)
        L_0x0054:
            com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave r0 = r4.A0K
            r0.setVisibility(r3)
            android.widget.TextView r0 = r4.A01
            r0.setVisibility(r2)
            android.widget.TextView r0 = r4.A00
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1028152a.A0H(X.6Eu):void");
    }
}
