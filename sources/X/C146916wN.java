package X;

import com.whatsapp.migration.export.ui.ExportMigrationViewModel;

/* renamed from: X.6wN  reason: invalid class name and case insensitive filesystem */
public class C146916wN implements C160757lX {
    public final /* synthetic */ ExportMigrationViewModel A00;

    public C146916wN(ExportMigrationViewModel exportMigrationViewModel) {
        this.A00 = exportMigrationViewModel;
    }

    public void BT4() {
        this.A00.A0S(0);
    }

    public void BT5() {
        this.A00.A0S(5);
    }

    public void BXA() {
        this.A00.A0S(2);
    }

    public void BXB(int i) {
        ExportMigrationViewModel exportMigrationViewModel = this.A00;
        Integer valueOf = Integer.valueOf(i);
        C001700s r1 = exportMigrationViewModel.A01;
        if (!C1901797e.A00(valueOf, r1.A04())) {
            if (i > 100) {
                i = 100;
            } else if (i < 0) {
                i = 0;
            }
            C36341k9.A17(r1, i);
        }
    }

    public void BXC() {
        this.A00.A0S(1);
    }

    public void onError(int i) {
        ExportMigrationViewModel exportMigrationViewModel = this.A00;
        C36321k7.A1T("ExportMigrationViewModel/setErrorCode: ", AnonymousClass000.A0u(), 1);
        C001700s r1 = exportMigrationViewModel.A00;
        if (!C90494aF.A1U(r1, 1)) {
            r1.A0C(1);
        }
    }
}
