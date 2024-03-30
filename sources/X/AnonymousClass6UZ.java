package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.SystemClock;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6UZ  reason: invalid class name */
public abstract class AnonymousClass6UZ {
    public static long A00;
    public static BroadcastReceiver A01;
    public static Context A02;
    public static String A03;
    public static String A04;
    public static String A05;
    public static boolean A06;
    public static final C124075xY A07 = new C124075xY("https://maps.instagram.com/maps/tile/?", "https://maps.instagram.com/maps/static/?", (Rect[]) null, (String[]) null, (C130866Ms[][]) null, Integer.MAX_VALUE);
    public static final List A08 = C90524aI.A0l();
    public static final Semaphore A09 = new Semaphore(1);
    public static final C124075xY A0A;
    public static volatile C124075xY A0B;
    public static volatile String A0C;
    public static volatile String A0D = "https://graph.facebook.com/v2.2/maps_configs?fields=base_url,static_base_url,osm_config,url_override_config&pretty=0&access_token=";

    static {
        C124075xY r0 = new C124075xY("https://www.facebook.com/maps/tile/?", "https://www.facebook.com/maps/static/?", (Rect[]) null, (String[]) null, (C130866Ms[][]) null, Integer.MAX_VALUE);
        A0A = r0;
        A0B = r0;
        A00();
    }

    public static void A01(Context context, String str) {
        A0C = str;
        Context applicationContext = context.getApplicationContext();
        A02 = applicationContext;
        String packageName = applicationContext.getPackageName();
        if ("com.instagram.android".equals(packageName)) {
            A0D = "https://graph.instagram.com/maps_configs?fields=base_url,static_base_url,osm_config,url_override_config&pretty=0&access_token=";
            A0B = A07;
        } else if ("com.whatsapp".equals(packageName) || "com.whatsapp.w4b".equals(packageName)) {
            A0D = "https://graph.whatsapp.net/v2.2/maps_configs?fields=base_url,static_base_url,osm_config,url_override_config&pretty=0&access_token=";
        }
        if (A01 == null) {
            C90794aq r3 = new C90794aq();
            A01 = r3;
            A02.registerReceiver(r3, new IntentFilter("android.intent.action.LOCALE_CHANGED"));
        }
    }

    public static void A02(boolean z) {
        if (A0C != null && A02 != null) {
            Semaphore semaphore = A09;
            if (semaphore.tryAcquire()) {
                long j = A00;
                if (j == 0 || SystemClock.uptimeMillis() - j >= 3600000) {
                    A06 = z;
                    C97804qI r1 = new C97804qI(A02);
                    C133046Wl.A01(r1);
                    C118505oA.A00(r1, "MapConfigUpdateDispatchable");
                    return;
                }
                semaphore.release();
            } else if (z) {
                try {
                    if (semaphore.tryAcquire(10, TimeUnit.SECONDS)) {
                        semaphore.release();
                    }
                } catch (InterruptedException unused) {
                    AnonymousClass6TY.A07.A03();
                }
            }
        }
    }

    public static void A00() {
        String str;
        String str2;
        String language = Locale.getDefault().getLanguage();
        if (language.length() == 2) {
            String country = Locale.getDefault().getCountry();
            StringBuilder A0v = AnonymousClass000.A0v(language);
            if (country.length() == 2) {
                str2 = AnonymousClass000.A0p("_", country, AnonymousClass000.A0u());
            } else {
                str2 = "";
            }
            str = AnonymousClass000.A0q(str2, A0v);
        } else {
            str = "en";
        }
        A04 = str;
        A05 = C90514aH.A0y(str);
        try {
            Locale.getDefault().getISO3Language();
        } catch (MissingResourceException unused) {
        }
    }
}
