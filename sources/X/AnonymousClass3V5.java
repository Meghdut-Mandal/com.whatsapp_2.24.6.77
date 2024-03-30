package X;

import android.content.DialogInterface;
import com.whatsapp.migration.export.ui.ExportMigrationActivity;

/* renamed from: X.3V5  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3V5 implements DialogInterface.OnClickListener {
    public final /* synthetic */ long A00;
    public final /* synthetic */ ExportMigrationActivity A01;

    public /* synthetic */ AnonymousClass3V5(ExportMigrationActivity exportMigrationActivity, long j) {
        this.A01 = exportMigrationActivity;
        this.A00 = j;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ExportMigrationActivity exportMigrationActivity = this.A01;
        long j = this.A00;
        exportMigrationActivity.A0G.A00(exportMigrationActivity.A0J, 7);
        ExportMigrationActivity.A0F(exportMigrationActivity, new C80303vB(exportMigrationActivity, j, 14), new C1497272n(exportMigrationActivity, 20), false);
    }
}
