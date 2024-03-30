package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.whatsapp.migration.export.ui.ExportMigrationActivity;

/* renamed from: X.5qZ  reason: invalid class name and case insensitive filesystem */
public class C119855qZ {
    public final ComponentName A00;
    public final PackageManager A01;

    public C119855qZ(Context context) {
        this.A01 = context.getPackageManager();
        this.A00 = new ComponentName(context, ExportMigrationActivity.class);
    }
}
