package X;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.Application;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.content.ClipboardManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.ContextWrapper;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.PowerManager;
import android.os.UserManager;
import android.os.Vibrator;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;

/* renamed from: X.0yb  reason: invalid class name and case insensitive filesystem */
public class C21060yb {
    public static boolean A0P;
    public AppOpsManager A00;
    public JobScheduler A01;
    public UserManager A02;
    public ActivityManager A03;
    public KeyguardManager A04;
    public NotificationManager A05;
    public C21070yc A06;
    public UsageStatsManager A07;
    public ClipboardManager A08;
    public SensorManager A09;
    public CameraManager A0A;
    public LocationManager A0B;
    public AudioManager A0C;
    public ConnectivityManager A0D;
    public WifiManager A0E;
    public PowerManager A0F;
    public Vibrator A0G;
    public TelecomManager A0H;
    public SubscriptionManager A0I;
    public TelephonyManager A0J;
    public WindowManager A0K;
    public AccessibilityManager A0L;
    public InputMethodManager A0M;
    public final C19630wG A0N;
    public final C21050ya A0O;

    private C21070yc A00() {
        C21070yc r1 = this.A06;
        if (r1 != null) {
            return r1;
        }
        C21070yc r12 = new C21070yc((AlarmManager) A03(this, "alarm", false));
        this.A06 = r12;
        return r12;
    }

    public static WindowManager A01(Context context) {
        Object A022 = A02(context, "window");
        C18740tg.A06(A022);
        return (WindowManager) A022;
    }

    public static Object A02(Context context, String str) {
        C18740tg.A0D(!(context instanceof Application), "Application context should not be used here");
        return context.getSystemService(str);
    }

    public static Object A03(C21060yb r1, String str, boolean z) {
        if (!A0P) {
            ConditionVariable conditionVariable = C18740tg.A00;
        }
        Context context = r1.A0N.A00;
        if (!z) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context.getSystemService(str);
    }

    public ActivityManager A04() {
        ActivityManager activityManager = this.A03;
        if (activityManager != null) {
            return activityManager;
        }
        ActivityManager activityManager2 = (ActivityManager) A03(this, "activity", false);
        this.A03 = activityManager2;
        return activityManager2;
    }

    public AlarmManager A05() {
        int i = Build.VERSION.SDK_INT;
        if (i < 23 || i >= 26) {
            return (AlarmManager) A03(this, "alarm", false);
        }
        return A00();
    }

    public KeyguardManager A06() {
        KeyguardManager keyguardManager = this.A04;
        if (keyguardManager != null) {
            return keyguardManager;
        }
        KeyguardManager keyguardManager2 = (KeyguardManager) A03(this, "keyguard", true);
        this.A04 = keyguardManager2;
        return keyguardManager2;
    }

    public NotificationManager A07() {
        NotificationManager notificationManager = this.A05;
        if (notificationManager != null) {
            return notificationManager;
        }
        NotificationManager notificationManager2 = (NotificationManager) A03(this, "notification", true);
        this.A05 = notificationManager2;
        return notificationManager2;
    }

    public UsageStatsManager A08() {
        UsageStatsManager usageStatsManager = this.A07;
        if (usageStatsManager != null) {
            return usageStatsManager;
        }
        UsageStatsManager usageStatsManager2 = (UsageStatsManager) A03(this, "usagestats", true);
        this.A07 = usageStatsManager2;
        return usageStatsManager2;
    }

    public ClipboardManager A09() {
        ClipboardManager clipboardManager = this.A08;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        ClipboardManager clipboardManager2 = (ClipboardManager) A03(this, "clipboard", true);
        this.A08 = clipboardManager2;
        return clipboardManager2;
    }

    public SensorManager A0A() {
        SensorManager sensorManager = this.A09;
        if (sensorManager != null) {
            return sensorManager;
        }
        SensorManager sensorManager2 = (SensorManager) A03(this, "sensor", true);
        this.A09 = sensorManager2;
        return sensorManager2;
    }

    public CameraManager A0B() {
        CameraManager cameraManager = this.A0A;
        if (cameraManager != null) {
            return cameraManager;
        }
        CameraManager cameraManager2 = (CameraManager) A03(this, "camera", true);
        this.A0A = cameraManager2;
        return cameraManager2;
    }

    public LocationManager A0C() {
        LocationManager locationManager = this.A0B;
        if (locationManager != null) {
            return locationManager;
        }
        LocationManager locationManager2 = (LocationManager) A03(this, "location", true);
        this.A0B = locationManager2;
        return locationManager2;
    }

    public AudioManager A0D() {
        AudioManager audioManager = this.A0C;
        if (audioManager != null) {
            return audioManager;
        }
        AudioManager audioManager2 = (AudioManager) A03(this, "audio", false);
        this.A0C = audioManager2;
        return audioManager2;
    }

    public ConnectivityManager A0E() {
        ConnectivityManager connectivityManager = this.A0D;
        if (connectivityManager != null) {
            return connectivityManager;
        }
        ConnectivityManager connectivityManager2 = (ConnectivityManager) A03(this, "connectivity", true);
        this.A0D = connectivityManager2;
        return connectivityManager2;
    }

    public WifiManager A0F() {
        WifiManager wifiManager = this.A0E;
        if (wifiManager != null) {
            return wifiManager;
        }
        WifiManager wifiManager2 = (WifiManager) ((ContextWrapper) this.A0N.A00).getBaseContext().getSystemService("wifi");
        this.A0E = wifiManager2;
        return wifiManager2;
    }

    public PowerManager A0G() {
        PowerManager powerManager = this.A0F;
        if (powerManager != null) {
            return powerManager;
        }
        PowerManager powerManager2 = (PowerManager) A03(this, "power", false);
        this.A0F = powerManager2;
        return powerManager2;
    }

    public Vibrator A0H() {
        Vibrator vibrator = this.A0G;
        if (vibrator != null) {
            return vibrator;
        }
        Vibrator vibrator2 = (Vibrator) A03(this, "vibrator", false);
        this.A0G = vibrator2;
        return vibrator2;
    }

    public TelecomManager A0I() {
        TelecomManager telecomManager = this.A0H;
        if (telecomManager != null) {
            return telecomManager;
        }
        TelecomManager telecomManager2 = (TelecomManager) A03(this, "telecom", true);
        this.A0H = telecomManager2;
        return telecomManager2;
    }

    public SubscriptionManager A0J() {
        SubscriptionManager subscriptionManager = this.A0I;
        if (subscriptionManager != null) {
            return subscriptionManager;
        }
        SubscriptionManager subscriptionManager2 = (SubscriptionManager) A03(this, "telephony_subscription_service", true);
        this.A0I = subscriptionManager2;
        return subscriptionManager2;
    }

    public TelephonyManager A0K() {
        TelephonyManager telephonyManager = this.A0J;
        if (telephonyManager != null) {
            return telephonyManager;
        }
        TelephonyManager telephonyManager2 = (TelephonyManager) A03(this, "phone", false);
        this.A0J = telephonyManager2;
        return telephonyManager2;
    }

    @Deprecated
    public WindowManager A0L() {
        WindowManager windowManager = this.A0K;
        if (windowManager == null) {
            windowManager = (WindowManager) A03(this, "window", true);
            this.A0K = windowManager;
        }
        C18740tg.A06(windowManager);
        return windowManager;
    }

    public AccessibilityManager A0M() {
        AccessibilityManager accessibilityManager = this.A0L;
        if (accessibilityManager != null) {
            return accessibilityManager;
        }
        AccessibilityManager accessibilityManager2 = (AccessibilityManager) A03(this, "accessibility", true);
        this.A0L = accessibilityManager2;
        return accessibilityManager2;
    }

    public InputMethodManager A0N() {
        InputMethodManager inputMethodManager = this.A0M;
        if (inputMethodManager != null) {
            return inputMethodManager;
        }
        InputMethodManager inputMethodManager2 = (InputMethodManager) A03(this, "input_method", true);
        this.A0M = inputMethodManager2;
        return inputMethodManager2;
    }

    public C21050ya A0O() {
        C21050ya r1 = this.A0O;
        if (r1.A00 == null) {
            ContentResolver contentResolver = this.A0N.A00.getContentResolver();
            if (contentResolver == null) {
                return null;
            }
            r1.A00 = contentResolver;
        }
        return r1;
    }

    public boolean A0P(String str) {
        return this.A0N.A00.getPackageManager().hasSystemFeature(str);
    }

    public C21060yb(C19630wG r1, C21050ya r2) {
        this.A0N = r1;
        this.A0O = r2;
    }
}
