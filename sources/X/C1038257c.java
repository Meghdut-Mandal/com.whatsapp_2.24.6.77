package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: X.57c  reason: invalid class name and case insensitive filesystem */
public final class C1038257c extends AnonymousClass1DJ {
    public final C19630wG A00;

    public C1038257c(C19630wG r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public void A01() {
        Context context = this.A00.A00;
        PackageManager packageManager = context.getPackageManager();
        AnonymousClass00C.A08(packageManager);
        packageManager.setComponentEnabledSetting(new ComponentName(context, "com.whatsapp.xfamily.groups.ui.LinkExistingGroupActivity"), 1, 1);
    }
}
