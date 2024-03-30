package X;

import android.content.pm.PackageItemInfo;
import java.util.Comparator;
import java.util.Set;

/* renamed from: X.75S  reason: invalid class name */
public class AnonymousClass75S implements Comparator {
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        int i2;
        PackageItemInfo packageItemInfo = (PackageItemInfo) obj;
        PackageItemInfo packageItemInfo2 = (PackageItemInfo) obj2;
        String str = packageItemInfo.packageName;
        Set set = C114075gb.A00;
        if (set.contains(str)) {
            i = str.contains("lite");
        } else {
            i = 2;
        }
        Integer valueOf = Integer.valueOf(i);
        String str2 = packageItemInfo2.packageName;
        if (set.contains(str2)) {
            i2 = str2.contains("lite");
        } else {
            i2 = 2;
        }
        int compareTo = valueOf.compareTo(Integer.valueOf(i2));
        if (compareTo == 0) {
            return packageItemInfo.packageName.compareTo(packageItemInfo2.packageName);
        }
        return compareTo;
    }
}
