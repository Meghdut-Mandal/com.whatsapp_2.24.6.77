package X;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: X.0Gk  reason: invalid class name and case insensitive filesystem */
public abstract class C03570Gk extends AnonymousClass00F {
    public static View A0B(Activity activity, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AnonymousClass0PH.A00(activity, i);
        }
        View findViewById = activity.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw AnonymousClass001.A08("ID does not reference a View inside this Activity");
    }

    public static void A0C(Activity activity, String[] strArr, int i) {
        String[] strArr2;
        HashSet hashSet = new HashSet();
        int i2 = 0;
        while (true) {
            int length = strArr.length;
            if (i2 >= length) {
                int size = hashSet.size();
                if (size > 0) {
                    strArr2 = new String[(length - size)];
                    if (size != length) {
                        int i3 = 0;
                        for (int i4 = 0; i4 < length; i4++) {
                            if (!hashSet.contains(Integer.valueOf(i4))) {
                                strArr2[i3] = strArr[i4];
                                i3++;
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    strArr2 = strArr;
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    AnonymousClass0XO.A00(activity, strArr, i);
                    return;
                } else if (activity instanceof AnonymousClass01H) {
                    new Handler(Looper.getMainLooper()).post(new C11760gx(activity, strArr2, i));
                    return;
                } else {
                    return;
                }
            } else if (!TextUtils.isEmpty(strArr[i2])) {
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                    AnonymousClass000.A1F(hashSet, i2);
                }
                i2++;
            } else {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Permission request for permissions ");
                A0u.append(Arrays.toString(strArr));
                throw AnonymousClass000.A0c(" must not contain null or empty values", A0u);
            }
        }
    }

    public static boolean A0D(Activity activity, String str) {
        int i = Build.VERSION.SDK_INT;
        if (i < 33) {
            if (!TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                if (i < 32) {
                    if (i == 31) {
                        return AnonymousClass0PI.A00(activity, str);
                    }
                    if (i >= 23) {
                        return AnonymousClass0XO.A02(activity, str);
                    }
                }
            }
            return false;
        }
        return AnonymousClass0PJ.A00(activity, str);
    }
}
