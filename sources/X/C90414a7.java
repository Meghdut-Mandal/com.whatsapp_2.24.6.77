package X;

import com.whatsapp.status.StatusesFragment;
import com.whatsapp.status.viewmodels.StatusesViewModel;

/* renamed from: X.4a7  reason: invalid class name and case insensitive filesystem */
public class C90414a7 implements C88124Rm {
    public Object A00;
    public final int A01;

    public C90414a7(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BhW(AnonymousClass11F r2) {
        if (this.A01 != 0) {
            StatusesViewModel.A03(r2, (StatusesViewModel) this.A00);
        } else {
            ((StatusesFragment) this.A00).A1a();
        }
    }
}
