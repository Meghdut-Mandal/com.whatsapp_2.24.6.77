package X;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3Dz  reason: invalid class name and case insensitive filesystem */
public class C61913Dz {
    public final C20810yC A00;
    public final AnonymousClass3PY A01;
    public final C19460v5 A02;
    public final AnonymousClass17Y A03;

    public boolean A00(Context context, Intent intent, C225014r r11, String str, boolean z) {
        Intent A012;
        if (z) {
            ArrayList A0I = AnonymousClass001.A0I();
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            if (queryIntentActivities != null) {
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    String str2 = activityInfo.name;
                    String str3 = activityInfo.applicationInfo.packageName;
                    Intent intent2 = new Intent(intent);
                    intent2.setClassName(str3, str2);
                    intent2.setPackage(str3);
                    if (str3.contains("gm") || str3.contains("email") || str3.contains("fsck.k9") || str3.contains("maildroid") || str3.contains("hotmail") || str3.contains("android.mail") || str3.contains("com.baydin.boomerang") || str3.contains("yandex.mail") || str3.contains("com.google.android.apps.inbox") || str3.contains("com.microsoft.office.outlook") || str3.contains("com.asus.email") || str3.equals("org.kman.AquaMail")) {
                        A0I.add(intent2);
                    }
                }
            }
            int size = A0I.size();
            if (size != 0) {
                if (size == 1) {
                    A012 = (Intent) A0I.get(0);
                } else {
                    int i = size - 1;
                    Object obj = A0I.get(i);
                    A0I.remove(i);
                    A0I.add(0, obj);
                    A012 = AnonymousClass3UJ.A01((IntentSender) null, str, A0I);
                }
                context.startActivity(A012);
                return true;
            } else if (r11 != null) {
                r11.BO5(R.string.f12nameremoved);
                return false;
            } else {
                this.A03.A06(R.string.f12nameremoved, 0);
                return false;
            }
        } else {
            try {
                context.startActivity(Intent.createChooser(intent, str));
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("email-sender/start-activity ", e);
                this.A03.A06(R.string.f12nameremoved, 0);
                return false;
            }
        }
    }

    public C61913Dz(C19460v5 r1, AnonymousClass17Y r2, C20810yC r3, AnonymousClass3PY r4) {
        this.A03 = r2;
        this.A02 = r1;
        this.A01 = r4;
        this.A00 = r3;
    }
}
