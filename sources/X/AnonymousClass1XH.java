package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.1XH  reason: invalid class name */
public final class AnonymousClass1XH {
    public final C19970wo A00;
    public final C19630wG A01;

    public AnonymousClass1XH(C19970wo r2, C19630wG r3) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public final void A00(BroadcastReceiver broadcastReceiver, Bundle bundle, String str) {
        Intent intent = new Intent();
        intent.setPackage("com.facebook.katana");
        intent.setAction(str);
        Context context = this.A01.A00;
        C111715cj.A00(context, intent);
        context.sendOrderedBroadcast(intent, (String) null, broadcastReceiver, (Handler) null, 1, (String) null, bundle);
    }

    public final boolean A01() {
        String str;
        StringBuilder sb;
        String str2;
        Log.i("FoaBackupTokenInterAppCommunicationManager/isEligibleForCommunication");
        Context context = this.A01.A00;
        if (AnonymousClass1L0.A00(context, "com.facebook.katana") == -1) {
            str = "FoaBackupTokenInterAppCommunicationManager/isEligibleForCommunication/fb app not installed";
        } else {
            PackageManager packageManager = context.getPackageManager();
            AnonymousClass00C.A08(packageManager);
            try {
                int i = 64;
                if (C19550w8.A05()) {
                    i = 134217728;
                }
                PackageInfo packageInfo = packageManager.getPackageInfo("com.facebook.katana", i);
                if (packageInfo != null) {
                    List singletonList = Collections.singletonList("ijxLJi1yGs1JpL-X1SExmchvork");
                    AnonymousClass00C.A08(singletonList);
                    if (!new HashSet(singletonList).contains(C132916Vu.A01(packageInfo))) {
                        str = "FoaBackupTokenInterAppCommunicationManager/isEligibleForCommunication/fb app is not trusted";
                    } else if (AnonymousClass1L0.A00(context, "com.facebook.katana") >= 446613853) {
                        return true;
                    } else {
                        str = "FoaBackupTokenInterAppCommunicationManager/isEligibleForCommunication/fb app version is old";
                    }
                }
            } catch (PackageManager.NameNotFoundException e) {
                e = e;
                sb = new StringBuilder();
                str2 = "FoaBackupTokenInterAppCommunicationManager/could not find package; packageName=";
                sb.append(str2);
                sb.append("com.facebook.katana");
                Log.e(sb.toString(), e);
                str = "FoaBackupTokenInterAppCommunicationManager/isEligibleForCommunication/package info is null";
                Log.i(str);
                return false;
            } catch (RuntimeException e2) {
                e = e2;
                sb = new StringBuilder();
                str2 = "FoaBackupTokenInterAppCommunicationManager/failed to get package info for packageName=";
                sb.append(str2);
                sb.append("com.facebook.katana");
                Log.e(sb.toString(), e);
                str = "FoaBackupTokenInterAppCommunicationManager/isEligibleForCommunication/package info is null";
                Log.i(str);
                return false;
            }
            str = "FoaBackupTokenInterAppCommunicationManager/isEligibleForCommunication/package info is null";
        }
        Log.i(str);
        return false;
    }
}
