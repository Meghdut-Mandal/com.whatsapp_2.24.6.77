package X;

import android.view.ScaleGestureDetector;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;

/* renamed from: X.4dB  reason: invalid class name and case insensitive filesystem */
public class C92134dB extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final /* synthetic */ AnonymousClass52X A00;

    public C92134dB(AnonymousClass52X r1) {
        this.A00 = r1;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        CallGridViewModel callGridViewModel = this.A00.A04;
        if (callGridViewModel != null) {
            callGridViewModel.A0U.A05++;
        }
    }
}
