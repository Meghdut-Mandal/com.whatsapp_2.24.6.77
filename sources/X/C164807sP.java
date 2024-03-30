package X;

import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;

/* renamed from: X.7sP  reason: invalid class name and case insensitive filesystem */
public class C164807sP implements AnonymousClass7g5 {
    public Object A00;
    public final int A01;

    public C164807sP(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final AnonymousClass6QG BH2() {
        switch (this.A01) {
            case 0:
                return BusinessDirectoryContextualSearchViewModel.A02((BusinessDirectoryContextualSearchViewModel) this.A00);
            case 1:
                C95404kp r1 = (C95404kp) this.A00;
                AnonymousClass00C.A0D(r1, 0);
                return r1.A05;
            default:
                return ((C95394km) this.A00).A0N.A00.A01;
        }
    }
}
