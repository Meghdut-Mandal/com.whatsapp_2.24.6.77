package X;

import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;

/* renamed from: X.7s0  reason: invalid class name and case insensitive filesystem */
public class C164557s0 implements AnonymousClass7g9 {
    public Object A00;
    public final int A01;

    public C164557s0(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final boolean BLo() {
        boolean A0E;
        if (this.A01 != 0) {
            C95394km r0 = (C95394km) this.A00;
            AnonymousClass6MI r1 = r0.A0I;
            AnonymousClass6QG r2 = r0.A0N.A00.A01;
            C20810yC r12 = r1.A00.A03;
            if (C90494aF.A1X(r12) && r12.A0E(1882) && r2 != null) {
                A0E = r2.A06();
            }
            return false;
        }
        BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = (BusinessDirectoryContextualSearchViewModel) this.A00;
        AnonymousClass6MI r02 = businessDirectoryContextualSearchViewModel.A0Q;
        AnonymousClass6QG A02 = BusinessDirectoryContextualSearchViewModel.A02(businessDirectoryContextualSearchViewModel);
        C20810yC r13 = r02.A00.A03;
        if (C90494aF.A1X(r13) && r13.A0E(1882) && A02.A06()) {
            C20810yC r14 = businessDirectoryContextualSearchViewModel.A0X.A03;
            if (C90494aF.A1X(r14)) {
                A0E = r14.A0E(2038);
            }
        }
        return false;
        if (!A0E) {
            return false;
        }
        return true;
    }
}
