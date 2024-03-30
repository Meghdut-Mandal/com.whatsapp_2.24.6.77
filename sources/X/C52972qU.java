package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2qU  reason: invalid class name and case insensitive filesystem */
public abstract class C52972qU {
    public static String A00(Context context, List list, boolean z) {
        ArrayList arrayList;
        PackageManager packageManager = context.getPackageManager();
        if (list == null) {
            arrayList = AnonymousClass001.A0I();
        } else {
            arrayList = list;
        }
        Intent A04 = C36331k8.A04("http://");
        ArrayList arrayList2 = arrayList;
        if (!z) {
            ResolveInfo resolveActivity = packageManager.resolveActivity(A04, 0);
            arrayList2 = arrayList;
            if (resolveActivity != null) {
                String str = resolveActivity.activityInfo.packageName;
                ArrayList A14 = C36441kJ.A14(arrayList.size() + 1);
                A14.add(str);
                arrayList2 = A14;
                if (list != null) {
                    A14.addAll(list);
                    arrayList2 = A14;
                }
            }
        }
        Intent A0I = C36441kJ.A0I("android.support.customtabs.action.CustomTabsService");
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            String A0C = AnonymousClass001.A0C(it);
            A0I.setPackage(A0C);
            if (packageManager.resolveService(A0I, 0) != null) {
                return A0C;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }
}
