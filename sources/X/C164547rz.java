package X;

import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;

/* renamed from: X.7rz  reason: invalid class name and case insensitive filesystem */
public class C164547rz implements AnonymousClass7g4 {
    public Object A00;
    public final int A01;

    public C164547rz(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final boolean BMb() {
        AnonymousClass6QG A02;
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            A02 = ((C95394km) obj).A0N.A00.A01;
        } else {
            A02 = BusinessDirectoryContextualSearchViewModel.A02((BusinessDirectoryContextualSearchViewModel) obj);
        }
        return AnonymousClass6MI.A00(A02);
    }
}
