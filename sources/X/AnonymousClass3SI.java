package X;

import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.3SI  reason: invalid class name */
public abstract class AnonymousClass3SI {
    public static String A02(String str) {
        if (str != null) {
            Matcher matcher = Pattern.compile("^([17]|2[07]|3[0123469]|4[013456789]|5[12345678]|6[0123456]|8[1246]|9[0123458]|\\d{3})\\d*?(\\d{4,6})$").matcher(str.replaceAll("\\D", ""));
            if (matcher.find()) {
                return matcher.group(1);
            }
        }
        return null;
    }

    public static AnonymousClass3XJ A00(C203559oI r6, String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            String replaceAll = str.replaceAll("\\D", "");
            if (!TextUtils.isEmpty(str3) && !str3.equals("ZZ")) {
                try {
                    AUN A0F = r6.A0F(replaceAll, str3.toUpperCase(Locale.US));
                    return new AnonymousClass3XJ(String.valueOf(A0F.countryCode_), String.valueOf(A0F.nationalNumber_), str2);
                } catch (AnonymousClass172 e) {
                    Log.w("parsePhoneNumber/exception", e);
                }
            }
            String A02 = A02(replaceAll);
            if (A02 != null) {
                return new AnonymousClass3XJ(A02, C36431kI.A1B(A02, replaceAll), str2);
            }
        }
        return null;
    }

    public static String A01(C21060yb r3, C19630wG r4, C20830yE r5) {
        List<SubscriptionInfo> activeSubscriptionInfoList;
        if (!r5.A0F()) {
            Log.i("verifynumber/getphonennumber/permission denied");
        } else {
            if (Build.VERSION.SDK_INT >= 22 && (activeSubscriptionInfoList = SubscriptionManager.from(r4.A00).getActiveSubscriptionInfoList()) != null) {
                for (SubscriptionInfo number : activeSubscriptionInfoList) {
                    String number2 = number.getNumber();
                    if (number2 != null) {
                        return number2;
                    }
                }
            }
            try {
                TelephonyManager A0K = r3.A0K();
                if (A0K != null) {
                    return A0K.getLine1Number();
                }
            } catch (Exception e) {
                Log.w("verifynumber/getphonennumber/error ", e);
                return null;
            }
        }
        return null;
    }

    public static ArrayList A03(C203559oI r6, C21060yb r7, C20830yE r8) {
        List<SubscriptionInfo> activeSubscriptionInfoList;
        AnonymousClass3XJ A00;
        ArrayList A0I = AnonymousClass001.A0I();
        if (!r8.A0F()) {
            Log.i("verifynumber/getphonennumbers/permission denied");
        } else if (Build.VERSION.SDK_INT >= 22) {
            SubscriptionManager A0J = r7.A0J();
            if (!(A0J == null || (activeSubscriptionInfoList = A0J.getActiveSubscriptionInfoList()) == null)) {
                for (SubscriptionInfo next : activeSubscriptionInfoList) {
                    if (!(next.getCarrierName() == null || (A00 = A00(r6, next.getNumber(), next.getCarrierName().toString(), next.getCountryIso())) == null)) {
                        A0I.add(A00);
                    }
                }
            }
        } else {
            try {
                TelephonyManager A0K = r7.A0K();
                if (A0K != null) {
                    String line1Number = A0K.getLine1Number();
                    String networkOperatorName = A0K.getNetworkOperatorName();
                    Charset charset = AnonymousClass1M4.A06;
                    AnonymousClass3XJ A002 = A00(r6, line1Number, networkOperatorName, A0K.getSimCountryIso());
                    if (A002 != null) {
                        A0I.add(A002);
                        return A0I;
                    }
                }
            } catch (Exception e) {
                Log.w("verifynumber/getphonennumbers/error ", e);
                return A0I;
            }
        }
        return A0I;
    }
}
