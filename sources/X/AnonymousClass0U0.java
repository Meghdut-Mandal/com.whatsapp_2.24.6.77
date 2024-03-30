package X;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* renamed from: X.0U0  reason: invalid class name */
public class AnonymousClass0U0 {
    public int A00;
    public boolean A01;
    public final Runnable A02 = new C11330g8(this);
    public final /* synthetic */ BottomSheetBehavior A03;

    public AnonymousClass0U0(BottomSheetBehavior bottomSheetBehavior) {
        this.A03 = bottomSheetBehavior;
    }

    public void A00(int i) {
        WeakReference weakReference = this.A03.A0S;
        if (weakReference != null && weakReference.get() != null) {
            this.A00 = i;
            if (!this.A01) {
                C011504z.A07(AnonymousClass000.A0Y(weakReference), this.A02);
                this.A01 = true;
            }
        }
    }
}
