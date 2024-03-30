package X;

import android.app.ActivityManager;
import android.app.NotificationManager;
import android.app.usage.UsageEvents;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.whatsapp.util.Log;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6zJ  reason: invalid class name and case insensitive filesystem */
public final class C148716zJ implements AnonymousClass4UH {
    public final C21060yb A00;
    public final C20830yE A01;
    public final C19730wQ A02;
    public final C19970wo A03;
    public final C19630wG A04;
    public final C19420v0 A05;

    public void BOc(String str) {
        NotificationManager A07;
        AnonymousClass00C.A0D(str, 0);
        C224714l.A01();
        StringBuilder A0v = AnonymousClass000.A0v(str);
        A0v.append("/settings/notifications-enabled: ");
        Context context = this.A04.A00;
        C36331k8.A1S(A0v, new C007203c(context).A01());
        StringBuilder A0v2 = AnonymousClass000.A0v(str);
        A0v2.append("/google-play-services: ");
        C36331k8.A1S(A0v2, AnonymousClass000.A1Q(C34201gc.A00(context)));
        C21060yb r3 = this.A00;
        PowerManager A0G = r3.A0G();
        if (A0G != null) {
            StringBuilder A0v3 = AnonymousClass000.A0v(str);
            A0v3.append("/power-save-mode:");
            C36331k8.A1S(A0v3, A0G.isPowerSaveMode());
        }
        if (C19550w8.A05() && (A07 = r3.A07()) != null) {
            int currentInterruptionFilter = A07.getCurrentInterruptionFilter();
            StringBuilder A0v4 = AnonymousClass000.A0v(str);
            A0v4.append("/do-not-disturb:");
            boolean z = true;
            if (currentInterruptionFilter == 1 || currentInterruptionFilter == 0) {
                z = false;
            }
            C36331k8.A1S(A0v4, z);
        }
        if (C19550w8.A05()) {
            ActivityManager A042 = r3.A04();
            if (A042 != null) {
                StringBuilder A0v5 = AnonymousClass000.A0v(str);
                A0v5.append("/background-restricted:");
                C36331k8.A1S(A0v5, A042.isBackgroundRestricted());
            }
            A01(str);
        }
    }

    public void BOg(AnonymousClass37W r18) {
        String str;
        String str2;
        String str3;
        StringBuilder A0v;
        String str4;
        AnonymousClass37W r10 = r18;
        AnonymousClass00C.A0D(r10, 0);
        Context context = r10.A00;
        Locale locale = AnonymousClass000.A0U(context).locale;
        C19420v0 r5 = this.A05;
        String A0f = r5.A0f();
        AnonymousClass00C.A08(A0f);
        String A0h = r5.A0h();
        AnonymousClass00C.A08(A0h);
        C21060yb r7 = this.A00;
        TelephonyManager A0K = r7.A0K();
        String str5 = "N/A (no telephony manager)";
        if (A0K != null) {
            str5 = C65603St.A01(A0K.getNetworkOperator(), "N/A");
            AnonymousClass00C.A08(str5);
            str2 = C65603St.A01(A0K.getSimOperator(), "N/A");
            AnonymousClass00C.A08(str2);
            str = A0K.getNetworkOperatorName();
            AnonymousClass00C.A08(str);
        } else {
            str = "UNKNOWN (no telephony manager)";
            str2 = str5;
        }
        Integer valueOf = Integer.valueOf(this.A02.A04());
        Map map = r10.A01;
        map.put("Device ID", valueOf);
        Objects.requireNonNull("2.24.6.77");
        map.put("Description", "2.24.6.77");
        StringBuilder A0u = AnonymousClass000.A0u();
        Objects.requireNonNull("2.24.6.77");
        A0u.append("2.24.6.77");
        map.put("Version", AnonymousClass000.A0q("", A0u));
        map.put("App", "com.whatsapp");
        String str6 = "zz";
        if (locale != null) {
            str3 = locale.getCountry();
        } else {
            str3 = str6;
        }
        map.put("LC", str3);
        if (locale != null) {
            str6 = locale.getLanguage();
        }
        map.put("LG", str6);
        map.put("Carrier", str);
        map.put("Manufacturer", Build.MANUFACTURER);
        map.put("Model", Build.MODEL);
        map.put("CPU ABI", C131896Re.A02());
        map.put("OS", Build.VERSION.RELEASE);
        map.put("Radio MCC-MNC", str5);
        map.put("SIM MCC-MNC", str2);
        if (r10.A02) {
            A0v = C36331k8.A0k("", A0f);
        } else {
            A0v = AnonymousClass000.A0v(A0f);
            A0v.append(' ');
            A0v.append(A0h);
        }
        map.put("CCode", A0v.toString());
        TelephonyManager A0K2 = r7.A0K();
        String str7 = "UNKNOWN (no telephony manager)";
        if (A0K2 != null) {
            int phoneType = A0K2.getPhoneType();
            if (phoneType == 0) {
                str7 = "NONE";
            } else if (phoneType == 1) {
                str7 = "GSM";
            } else if (phoneType == 2) {
                str7 = "CDMA";
            } else if (phoneType != 3) {
                str7 = "UNKNOWN";
            } else {
                str7 = "SIP";
            }
            switch (C131896Re.A01(A0K2, this.A01)) {
                case 1:
                    str4 = "GPRS";
                    break;
                case 2:
                    str4 = "EDGE";
                    break;
                case 3:
                    str4 = "UMTS";
                    break;
                case 4:
                    str4 = "CDMA";
                    break;
                case 5:
                    str4 = "CDMA - EvDo rev. 0";
                    break;
                case 6:
                    str4 = "CDMA - EvDo rev. A";
                    break;
                case 7:
                    str4 = "CDMA - 1xRTT";
                    break;
                case 8:
                    str4 = "HSDPA";
                    break;
                case 9:
                    str4 = "HSUPA";
                    break;
                case 10:
                    str4 = "HSPA";
                    break;
                case 11:
                    str4 = "iDEN";
                    break;
                case 12:
                    str4 = "CDMA - EvDo rev. B";
                    break;
                case 13:
                    str4 = "LTE";
                    break;
                case 14:
                    str4 = "CDMA - eHRPD";
                    break;
                case 15:
                    str4 = "HSPA+";
                    break;
                default:
                    str4 = "UNKNOWN";
                    break;
            }
        } else {
            str4 = str7;
        }
        map.put("Target", "release");
        map.put("Product", Build.PRODUCT);
        map.put("Device", Build.DEVICE);
        map.put("Build", Build.FINGERPRINT);
        map.put("Board", Build.BOARD);
        map.put("Kernel", C18750th.A00());
        map.put("Device ISO8601", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", Locale.US).format(new Date()));
        int length = str7.length();
        StringBuilder A0h2 = C90524aI.A0h(length * 2);
        for (int i = 0; i < length; i++) {
            C90514aH.A1R(str7, A0h2, i);
            A0h2.append('.');
        }
        map.put("Phone Type", A0h2.toString());
        int length2 = str4.length();
        StringBuilder A0h3 = C90524aI.A0h(length2 * 2);
        for (int i2 = 0; i2 < length2; i2++) {
            C90514aH.A1R(str4, A0h3, i2);
            A0h3.append('.');
        }
        map.put("Network Type", A0h3.toString());
        if (C19550w8.A01()) {
            map.put("Missing Permissions", A00(context));
        }
        map.put("Architecture", System.getProperty("os.arch"));
        if (C19550w8.A05()) {
            AnonymousClass005 r4 = r5.A00;
            if (C36391kE.A0H(r4).getString("pref_primary_flash_call_status", (String) null) != null) {
                map.put("Primary flash call status", C36391kE.A0H(r4).getString("pref_primary_flash_call_status", (String) null));
            }
        }
        if (C19550w8.A01()) {
            AnonymousClass005 r42 = r5.A00;
            if (C36391kE.A0H(r42).getString("pref_secondary_flash_call_status", (String) null) != null) {
                map.put("Secondary flash call status", C36391kE.A0H(r42).getString("pref_secondary_flash_call_status", (String) null));
            }
        }
        AnonymousClass005 r43 = r5.A00;
        map.put("AutoConf status", C36371kC.A0t(C36391kE.A0H(r43), "pref_autoconf_status"));
        if (C36391kE.A0H(r43).getString("pref_wa_old_status", (String) null) != null) {
            map.put("WA old status", C36391kE.A0H(r43).getString("pref_wa_old_status", (String) null));
        }
        if (C36391kE.A0H(r43).getString("pref_email_otp_status", (String) null) != null) {
            map.put("Email OTP status", C36391kE.A0H(r43).getString("pref_email_otp_status", (String) null));
        }
        if (C36391kE.A0H(r43).getString("pref_captcha_status", (String) null) != null) {
            map.put("Captcha status", C36391kE.A0H(r43).getString("pref_captcha_status", (String) null));
        }
        if (C36391kE.A0H(r43).getString("pref_silent_auth_status", (String) null) != null) {
            map.put("Silent auth status", C36391kE.A0H(r43).getString("pref_silent_auth_status", (String) null));
        }
    }

    public /* synthetic */ void BOw(String str) {
    }

    private final void A01(String str) {
        StringBuilder sb;
        UsageStatsManager A08 = this.A00.A08();
        if (A08 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            UsageEvents queryEventsForSelf = A08.queryEventsForSelf(currentTimeMillis - TimeUnit.HOURS.toMillis(12), currentTimeMillis);
            AnonymousClass00C.A08(queryEventsForSelf);
            UsageEvents.Event event = new UsageEvents.Event();
            while (queryEventsForSelf.getNextEvent(event)) {
                if (event.getEventType() == 11) {
                    StringBuilder A0v = AnonymousClass000.A0v(str);
                    A0v.append("/app-standby bucket:");
                    A0v.append(event.getAppStandbyBucket());
                    A0v.append(" time:");
                    C36351kA.A1S(A0v, event.getTimeStamp());
                }
            }
            sb = AnonymousClass000.A0v(str);
            sb.append("/current app-standby bucket:");
            sb.append(A08.getAppStandbyBucket());
        } else {
            sb = AnonymousClass000.A0v(str);
            sb.append("/usage-stats-manager null");
        }
        C36411kG.A1P(sb);
    }

    public C148716zJ(C19730wQ r2, C21060yb r3, C19970wo r4, C19630wG r5, C20830yE r6, C19420v0 r7) {
        C36321k7.A1B(r4, r5, r2, r3, r7);
        AnonymousClass00C.A0D(r6, 6);
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = r2;
        this.A00 = r3;
        this.A05 = r7;
        this.A01 = r6;
    }

    public static final String A00(Context context) {
        Object obj;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            Log.e("findmissingpermissions/no-package-manager");
        } else {
            try {
                obj = packageManager.getPackageInfo("com.whatsapp", ZipDecompressor.UNZIP_BUFFER_SIZE);
            } catch (Throwable th) {
                obj = C90524aI.A0t(th);
            }
            Throwable A002 = AnonymousClass0AK.A00(obj);
            if (A002 == null) {
                AnonymousClass00C.A0A(obj);
                PackageInfo packageInfo = (PackageInfo) obj;
                String[] strArr = packageInfo.requestedPermissions;
                if (strArr != null) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    int[] iArr = packageInfo.requestedPermissionsFlags;
                    AnonymousClass00C.A07(iArr);
                    int length = iArr.length;
                    int i = 0;
                    int i2 = 0;
                    while (i < length) {
                        int i3 = i2 + 1;
                        if ((iArr[i] & 2) == 0) {
                            if (AnonymousClass000.A1R(A0u.length())) {
                                C90504aG.A1M(A0u);
                            }
                            A0u.append(strArr[i2]);
                        }
                        i++;
                        i2 = i3;
                    }
                    return C36381kD.A0y(A0u);
                }
            } else {
                Log.e(A002);
                return "";
            }
        }
        return "";
    }
}
