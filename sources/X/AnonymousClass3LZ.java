package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.R;
import java.util.Locale;

/* renamed from: X.3LZ  reason: invalid class name */
public abstract class AnonymousClass3LZ {
    public static int A00(AnonymousClass3SB r3) {
        String str;
        C52782qA r2 = r3.A08;
        String str2 = r3.A09;
        if (str2 != null) {
            str = str2.toLowerCase(Locale.US);
        } else {
            str = null;
        }
        switch (r2.ordinal()) {
            case 0:
                if ("wear os".equals(str)) {
                    return R.drawable.vec_device_list_ic_wearos;
                }
                break;
            case 1:
                return R.drawable.device_list_ic_chrome;
            case 2:
                return R.drawable.device_list_ic_firefox;
            case 3:
                return R.drawable.device_list_ic_ie;
            case 4:
                return R.drawable.device_list_ic_opera;
            case 5:
                return R.drawable.device_list_ic_safari;
            case 6:
                return R.drawable.device_list_ic_edge;
            case 7:
                if ("windows".equals(str)) {
                    return R.drawable.device_list_ic_windows;
                }
                if ("mac os".equals(str)) {
                    return R.drawable.device_list_ic_mac;
                }
                return R.drawable.device_list_ic_desktop_fallback;
            case 8:
                return R.drawable.vec_device_list_ic_ipad;
            case 9:
            case 16:
            case 17:
                return R.drawable.vec_device_list_ic_android;
            case 10:
            case 11:
            case 12:
            case 13:
                return R.drawable.device_list_ic_portal;
            case 14:
                return R.drawable.vec_device_list_ic_iphone;
            case 15:
                return R.drawable.device_list_ic_mac;
            case 18:
                return R.drawable.vec_device_list_ic_wearos;
            case 21:
                return R.drawable.device_list_ic_windows;
            case 22:
                return R.drawable.device_list_ic_meta_quest;
        }
        return R.drawable.device_list_ic_unknown_browser;
    }

    public static Intent A01(Context context, int i) {
        Intent A0D = C36431kI.A0D();
        A0D.setClassName(context.getPackageName(), "com.whatsapp.companiondevice.LinkedDevicesActivity");
        A0D.putExtra("entry_point", i);
        return A0D;
    }
}
