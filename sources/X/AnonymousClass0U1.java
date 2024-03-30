package X;

import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

/* renamed from: X.0U1  reason: invalid class name */
public class AnonymousClass0U1 {
    public int A00;
    public boolean A01;
    public final Runnable A02 = new C11350gA(this);
    public final /* synthetic */ SideSheetBehavior A03;

    public AnonymousClass0U1(SideSheetBehavior sideSheetBehavior) {
        this.A03 = sideSheetBehavior;
    }

    public void A00(int i) {
        WeakReference weakReference = this.A03.A0D;
        if (weakReference != null && weakReference.get() != null) {
            this.A00 = i;
            if (!this.A01) {
                C011504z.A07(AnonymousClass000.A0Y(weakReference), this.A02);
                this.A01 = true;
            }
        }
    }
}
