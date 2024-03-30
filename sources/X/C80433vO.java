package X;

import com.whatsapp.R;
import com.whatsapp.migration.export.ui.ExportMigrationActivity;

/* renamed from: X.3vO  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C80433vO implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ ExportMigrationActivity A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ C80433vO(ExportMigrationActivity exportMigrationActivity, String str, String str2, long j) {
        this.A01 = exportMigrationActivity;
        this.A02 = str;
        this.A03 = str2;
        this.A00 = j;
    }

    public final void run() {
        ExportMigrationActivity exportMigrationActivity = this.A01;
        String str = this.A02;
        String str2 = this.A03;
        long j = this.A00;
        C39001qm A002 = AnonymousClass3LW.A00(exportMigrationActivity);
        A002.A0q(str);
        A002.A0p(str2);
        A002.A0r(false);
        C39001qm.A0B(A002, exportMigrationActivity, 36, R.string.f12nameremoved);
        A002.A0f(new AnonymousClass3V5(exportMigrationActivity, j), R.string.f12nameremoved);
        A002.A0b();
    }
}
