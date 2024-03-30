package X;

import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;

/* renamed from: X.62D  reason: invalid class name */
public class AnonymousClass62D {
    public final PackageManager A00;
    public final AnonymousClass1VG A01;

    public boolean A00(String str) {
        boolean z;
        try {
            z = this.A01.A01(str).A03;
        } catch (PackageManager.NameNotFoundException unused) {
            z = false;
        }
        if (z) {
            PackageManager packageManager = this.A00;
            if (packageManager.checkPermission("com.apple.movetoios.ACCESS", str) == 0) {
                try {
                    PermissionInfo permissionInfo = packageManager.getPermissionInfo("com.apple.movetoios.ACCESS", 0);
                    if ((permissionInfo.protectionLevel & 15) == 2) {
                        return C132916Vu.A00(packageManager, permissionInfo.packageName).equals(C132916Vu.A00(packageManager, str));
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    return false;
                }
            }
        }
        return false;
    }

    public AnonymousClass62D(C19630wG r2, AnonymousClass1VG r3) {
        this.A00 = r2.A00.getPackageManager();
        this.A01 = r3;
    }
}
