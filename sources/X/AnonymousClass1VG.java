package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import android.util.Pair;

/* renamed from: X.1VG  reason: invalid class name */
public class AnonymousClass1VG {
    public final C19630wG A00;
    public final AnonymousClass1VI A01;

    public C128946Ef A01(String str) {
        Context context = this.A00.A00;
        int i = context.getPackageManager().getPackageInfo(str, 0).applicationInfo.uid;
        String A02 = C132916Vu.A02(C132916Vu.A00(context.getPackageManager(), str));
        boolean z = false;
        if (this.A01.A01.contains(Pair.create(str, A02))) {
            z = true;
        }
        return new C128946Ef(str, A02, i, z);
    }

    public AnonymousClass1VG(C19630wG r1, AnonymousClass1VI r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public C128946Ef A00() {
        int length;
        int callingUid = Binder.getCallingUid();
        Boolean bool = C18750th.A03;
        if (callingUid != Process.myUid()) {
            Context context = this.A00.A00;
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(callingUid);
            if (packagesForUid == null || (length = packagesForUid.length) == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("No packages associated with uid: ");
                sb.append(callingUid);
                throw new SecurityException(sb.toString());
            } else if (length == 1) {
                String str = packagesForUid[0];
                String A02 = C132916Vu.A02(C132916Vu.A00(context.getPackageManager(), str));
                boolean z = false;
                if (this.A01.A01.contains(Pair.create(str, A02))) {
                    z = true;
                }
                return new C128946Ef(str, A02, callingUid, z);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Multiple packages per uid are not supported, uid: ");
                sb2.append(callingUid);
                throw new SecurityException(sb2.toString());
            }
        } else {
            throw new IllegalStateException("This method should be called on behalf of an IPC transaction from binder thread");
        }
    }

    public C128946Ef A02(String str) {
        try {
            C128946Ef A012 = A01(str);
            A012.A00();
            return A012;
        } catch (PackageManager.NameNotFoundException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Package not found: ");
            sb.append(str);
            throw new SecurityException(sb.toString(), e);
        }
    }
}
