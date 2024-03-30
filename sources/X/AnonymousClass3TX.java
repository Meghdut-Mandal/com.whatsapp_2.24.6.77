package X;

import android.content.Context;
import android.content.res.Configuration;
import android.telephony.TelephonyManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3TX  reason: invalid class name */
public final class AnonymousClass3TX {
    public final C19630wG A00;
    public final AnonymousClass005 A01;
    public final AnonymousClass005 A02;
    public final AnonymousClass005 A03;
    public final AnonymousClass00T A04 = C36431kI.A1I(AnonymousClass4IE.A00);
    public final AnonymousClass00T A05 = C36431kI.A1I(AnonymousClass4IF.A00);
    public final AnonymousClass3L9 A06;

    private final void A01(String str, Map map) {
        AnonymousClass005 r3 = this.A02;
        String string = C36341k9.A0E((C19420v0) r3.get()).getString("previous_registration_screen", (String) null);
        if (string == null) {
            string = "unknown";
        }
        String string2 = C36341k9.A0E((C19420v0) r3.get()).getString("previous_registration_action", (String) null);
        if (string2 == null) {
            string2 = "unknown";
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FunnelLogger/");
        A0u.append(string);
        A0u.append('/');
        A0u.append(string2);
        A0u.append('/');
        C36321k7.A1a(A0u, str);
        ((C19770wU) this.A03.get()).Boy(new C80643vj(this, map, str, string, string2, 0));
    }

    public final void A04(String str) {
        String A1E;
        if (C36331k8.A1b(this.A05)) {
            C62243Fi r2 = new C62243Fi();
            synchronized (this) {
                A1E = C36431kI.A1E(this.A04);
            }
            r2.A01("funnel_id", A1E);
            A01(str, r2.A00);
        }
    }

    public final void A05(String str) {
        String A1E;
        String str2;
        TelephonyManager telephonyManager;
        if (C36331k8.A1b(this.A05)) {
            C62243Fi r3 = new C62243Fi();
            synchronized (this) {
                A1E = C36431kI.A1E(this.A04);
            }
            r3.A01("funnel_id", A1E);
            Context context = this.A00.A00;
            AnonymousClass00C.A08(context);
            boolean hasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.telephony");
            if (hasSystemFeature) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            r3.A01("sim_card_supported", str2);
            if (hasSystemFeature) {
                int i = -1;
                if (context.getPackageManager().hasSystemFeature("android.hardware.telephony")) {
                    Object systemService = context.getSystemService("phone");
                    if ((systemService instanceof TelephonyManager) && (telephonyManager = (TelephonyManager) systemService) != null) {
                        i = telephonyManager.getSimState();
                    }
                }
                r3.A00("sim_state", i);
            }
            C26881Lw A022 = C25961Ii.A02(context);
            if (A022 != null) {
                r3.A00("screen_diagonal_inches", A022.A00);
            }
            Configuration A0U = AnonymousClass000.A0U(C25981Ik.A00(context));
            r3.A00("screen_width_dp", A0U.screenWidthDp);
            r3.A00("screen_height_dp", A0U.screenHeightDp);
            A01(str, r3.A00);
        }
    }

    public final void A06(String str, String str2) {
        A00(this, (Long) null, str, str2, (String) null, (String) null);
    }

    public final void A09(String str, String str2, String str3) {
        A00(this, (Long) null, str, str2, str3, (String) null);
    }

    public final void A0B(String str, String str2, String str3, String str4, long j) {
        String A1E;
        if (C36331k8.A1b(this.A05)) {
            C62243Fi r3 = new C62243Fi();
            synchronized (this) {
                A1E = C36431kI.A1E(this.A04);
            }
            r3.A01("funnel_id", A1E);
            r3.A01("ios_attempt_id", str3);
            r3.A01("ios_export_duration", str4);
            r3.A01("google_migrate_import_error", str2);
            if (j > 0) {
                r3.A00.put("google_migrate_import_duration", C36351kA.A1b(String.valueOf(j)));
            }
            A01(str, r3.A00);
        }
    }

    public static final boolean A02(AnonymousClass3TX r0) {
        return C36331k8.A1b(r0.A05);
    }

    public final void A03(C62983Ih r7, String str, long j) {
        A00(this, Long.valueOf(j), "verify_passkey", str, r7.A01, r7.A00);
    }

    public final void A07(String str, String str2) {
        if (C36331k8.A1b(this.A05)) {
            A04(str);
            A08(str, str2);
        }
    }

    public final void A08(String str, String str2) {
        if (C36331k8.A1b(this.A05)) {
            C19420v0 r2 = (C19420v0) this.A02.get();
            C36341k9.A0x(C19420v0.A00(r2), "previous_registration_screen", str);
            C36341k9.A0x(C19420v0.A00(r2), "previous_registration_action", str2);
        }
    }

    public final void A0A(String str, String str2, String str3) {
        if (C36331k8.A1b(this.A05)) {
            C62243Fi r1 = new C62243Fi();
            r1.A01("event_name", str2);
            if (str3 != null) {
                r1.A01("client_error_type", str3);
            }
            A01(str, r1.A00);
        }
    }

    public AnonymousClass3TX(C19630wG r2, AnonymousClass3L9 r3, AnonymousClass005 r4, AnonymousClass005 r5, AnonymousClass005 r6) {
        C36321k7.A18(r2, r4, r5, r6);
        this.A00 = r2;
        this.A03 = r4;
        this.A02 = r5;
        this.A01 = r6;
        this.A06 = r3;
    }

    public static final void A00(AnonymousClass3TX r5, Long l, String str, String str2, String str3, String str4) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FunnelLogger/passkeyLoginEvent/");
        A0u.append(str);
        A0u.append('/');
        A0u.append(str2);
        A0u.append("/errorType=");
        A0u.append(str4);
        C36321k7.A1Q("/errorReason=", str3, A0u);
        if (C36331k8.A1b(r5.A05)) {
            C36341k9.A0x(C19420v0.A00((C19420v0) r5.A02.get()), "previous_registration_screen", str);
            C62243Fi r4 = new C62243Fi();
            r4.A01("event_name", str2);
            if (str3 != null) {
                r4.A01("client_error_context", str3);
            }
            if (str4 != null) {
                r4.A01("client_error_type", str4);
            }
            long A002 = AnonymousClass1L0.A00(r5.A06.A00, "com.google.android.gms");
            C36321k7.A1V("PasskeyGooglePlayChecks / determineDeviceGMSVersionCode:  ", AnonymousClass000.A0u(), A002);
            JSONObject A1B = C36441kJ.A1B();
            try {
                A1B.put("GMSVersion", A002);
                if (l != null) {
                    A1B.put("passkey_api_request_time_in_milli", l);
                }
            } catch (JSONException unused) {
            }
            r4.A01("client_metrics", A1B.toString());
            r5.A01(str, r4.A00);
        }
    }
}
