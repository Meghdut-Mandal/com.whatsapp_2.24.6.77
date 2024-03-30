package X;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6YG  reason: invalid class name */
public abstract class AnonymousClass6YG {
    public static boolean A0E(String str, boolean z) {
        String A0q;
        if ((!z && str.equals("OMX.google.h264.encoder")) || str.equals("OMX.ST.VFM.H264Enc") || str.equals("OMX.Exynos.avc.enc") || str.equals("OMX.MARVELL.VIDEO.H264ENCODER")) {
            return false;
        }
        if (str.equals("OMX.MTK.VIDEO.ENCODER.AVC") && "QMobile".equalsIgnoreCase(Build.MANUFACTURER) && Build.VERSION.SDK_INT < 23) {
            A0q = "videotranscoder/ OMX.MTK.VIDEO.ENCODER.AVC on QMobile is not supported";
        } else if (!str.equals("OMX.allwinner.video.encoder.avc") && !str.equals("AVCEncoder")) {
            return true;
        } else {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("videotranscoder/ ");
            A0u.append(str);
            A0q = AnonymousClass000.A0q(" not supported", A0u);
        }
        Log.i(A0q);
        return false;
    }

    public static void A00(View view, Window window, C21060yb r5) {
        if (Build.MANUFACTURER.equals("OnePlus")) {
            String str = Build.MODEL;
            if ((str.equals("ONEPLUS A6000") || str.equals("ONEPLUS A6003")) && (window.getAttributes().flags & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0 && r5.A0P("com.oneplus.screen.cameranotch")) {
                view.setPadding(0, (int) C90464aC.A02(view.getContext(), 5.0f, 5), 0, 0);
            }
        }
    }

    public static boolean A01() {
        int i = Build.VERSION.SDK_INT;
        if ((i != 26 && i != 27) || !Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
            return false;
        }
        String str = Build.MODEL;
        if (str.startsWith("SM-G570") || str.startsWith("SM-J260") || str.startsWith("SM-G935") || str.startsWith("SM-G930") || str.startsWith("SM-A520") || str.startsWith("SM-A720") || str.startsWith("SM-A260") || str.startsWith("SM-J400") || str.startsWith("SM-J600") || str.startsWith("SM-G950")) {
            return true;
        }
        return false;
    }

    public static boolean A02() {
        if (!Build.MANUFACTURER.equals("OnePlus")) {
            return false;
        }
        String str = Build.MODEL;
        if (str.equals("ONEPLUS A3000") || str.equals("ONEPLUS A3003") || str.equals("ONEPLUS A3010")) {
            return true;
        }
        return false;
    }

    public static boolean A03() {
        String str = Build.MANUFACTURER;
        if (str.equals("bq") && Build.DEVICE.startsWith("bq_Aquaris5")) {
            return true;
        }
        if (str.equals("samsung") && Build.MODEL.equals("SM-G386F")) {
            return true;
        }
        if (str.equals("Fly")) {
            return Build.MODEL.equals("FS504");
        }
        return false;
    }

    public static boolean A04() {
        return C36371kC.A1T(Build.VERSION.SDK_INT, 28);
    }

    public static boolean A06() {
        return AnonymousClass000.A1S(Build.VERSION.SDK_INT, 23);
    }

    public static boolean A07() {
        String str;
        String str2;
        if (Build.VERSION.SDK_INT <= 23) {
            return true;
        }
        String str3 = Build.MANUFACTURER;
        if (str3.equalsIgnoreCase("oppo")) {
            str = Build.MODEL;
            str2 = "A53";
        } else if (!str3.equalsIgnoreCase("GiONEE")) {
            return false;
        } else {
            str = Build.MODEL;
            str2 = "GN5001S";
        }
        return str.equalsIgnoreCase(str2);
    }

    public static boolean A08() {
        if (!Build.MODEL.equals("Nokia 3.1 Plus") || Build.VERSION.SDK_INT != 28) {
            return false;
        }
        return true;
    }

    public static boolean A09() {
        String str = Build.MANUFACTURER;
        if (str.equals("Huawei") && Build.MODEL.equals("Nexus 6P")) {
            return true;
        }
        if (str.equals("Google")) {
            String str2 = Build.MODEL;
            if (str2.equals("Pixel 2") || str2.equals("Pixel 2 XL")) {
                return true;
            }
        }
        if (!str.equals("Xiaomi") || Build.VERSION.SDK_INT != 27) {
            return false;
        }
        return true;
    }

    public static boolean A0A() {
        String str = Build.MANUFACTURER;
        if (Build.VERSION.SDK_INT != 22 || !str.equalsIgnoreCase("LAVA")) {
            return false;
        }
        return true;
    }

    public static boolean A0B() {
        String str = Build.MANUFACTURER;
        if (str.equalsIgnoreCase("vestel") && Build.MODEL.equalsIgnoreCase("vsp250s")) {
            return true;
        }
        if (str.equalsIgnoreCase("asus")) {
            String str2 = Build.MODEL;
            if (str2.equalsIgnoreCase("ASUS_Z00AD") || str2.equalsIgnoreCase("asus_x00ada") || str2.equalsIgnoreCase("asus_x00adc") || str2.equalsIgnoreCase("asus_t00j") || str2.equalsIgnoreCase("asus_x00ad") || str2.equalsIgnoreCase("asus_x014d") || str2.equalsIgnoreCase("asus_z008d") || str2.equalsIgnoreCase("asus_z00ldd") || str2.equalsIgnoreCase("zb500kl")) {
                return true;
            }
        }
        if (!str.equalsIgnoreCase("realme") || !Build.MODEL.equalsIgnoreCase("RMX3231")) {
            return false;
        }
        return true;
    }

    public static boolean A0C(String str) {
        if (str == null) {
            return A0B();
        }
        try {
            JSONArray jSONArray = C36441kJ.A1C(str).getJSONArray(C90514aH.A0y(Build.MANUFACTURER));
            for (int i = 0; i < jSONArray.length(); i++) {
                if (Build.MODEL.equalsIgnoreCase(jSONArray.getString(i))) {
                    return true;
                }
            }
            return false;
        } catch (JSONException unused) {
            return A0B();
        }
    }

    public static boolean A05() {
        if (Build.MANUFACTURER.equalsIgnoreCase("samsung") && C19550w8.A09()) {
            String str = "";
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                str = (String) cls.getMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{"ro.build.version.oneui"});
            } catch (Exception | IllegalArgumentException e) {
                try {
                    Log.e("AndroidHallOfShame/getSystemProperty", e);
                } catch (NumberFormatException e2) {
                    Log.e("AndroidHallOfShame/isSamsungWithTouchTargetFix/ failed to parse system property: $property", e2);
                }
            }
            if (!TextUtils.isEmpty(str) && Integer.parseInt(str) >= 50100) {
                return true;
            }
            String str2 = Build.VERSION.SECURITY_PATCH;
            if (!str2.isEmpty()) {
                String[] split = str2.split("-");
                if (split.length == 3) {
                    try {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if ((((parseInt * 100) + parseInt2) * 100) + Integer.parseInt(split[2]) >= 20221201) {
                            return true;
                        }
                    } catch (NumberFormatException e3) {
                        Log.e("AndroidHallOfShame/isSamsungWithTouchTargetFix/ failed to extract date from SECURITY_PATCH: $securityPatch", e3);
                        return true;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean A0D(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject A1C = C36441kJ.A1C(str);
                String A0y = C90514aH.A0y(Build.MANUFACTURER);
                if (!A1C.has(A0y)) {
                    return false;
                }
                JSONArray jSONArray = A1C.getJSONArray(A0y);
                if (jSONArray.length() != 0) {
                    int i = 0;
                    while (i < jSONArray.length()) {
                        if (!Build.MODEL.equalsIgnoreCase(jSONArray.getString(i))) {
                            i++;
                        }
                    }
                }
                return true;
            } catch (JSONException unused) {
            }
        }
        return false;
    }
}
