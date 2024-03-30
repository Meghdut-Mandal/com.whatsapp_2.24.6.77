package X;

import com.whatsapp.status.crossposting.CrossPostingUpdatesViewModel;
import java.util.List;

/* renamed from: X.4Zw  reason: invalid class name and case insensitive filesystem */
public class C90304Zw implements C88144Ro {
    public Object A00;
    public final int A01;

    public C90304Zw(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BbW(List list) {
        boolean z;
        if (this.A01 != 0) {
            AnonymousClass3P1 r2 = (AnonymousClass3P1) this.A00;
            boolean z2 = false;
            AnonymousClass00C.A0D(r2, 0);
            if (!list.isEmpty()) {
                if (!r2.A01().A03) {
                    z2 = true;
                } else {
                    return;
                }
            }
            r2.A01().A03 = z2;
            r2.A01().A02 = z2;
            AnonymousClass3P1.A00(r2);
            return;
        }
        boolean isEmpty = list.isEmpty();
        CrossPostingUpdatesViewModel crossPostingUpdatesViewModel = (CrossPostingUpdatesViewModel) this.A00;
        if (isEmpty) {
            z = false;
        } else {
            AnonymousClass3KF r0 = crossPostingUpdatesViewModel.A00;
            if (r0 == null) {
                throw C36331k8.A0d("crossPostingViewModelState");
            } else if (!r0.A03) {
                z = true;
            } else {
                return;
            }
        }
        CrossPostingUpdatesViewModel.A01(crossPostingUpdatesViewModel, z, z);
    }
}
