package X;

import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1UC  reason: invalid class name */
public class AnonymousClass1UC {
    public static final String A07;
    public SharedPreferences A00;
    public Boolean A01;
    public final C19970wo A02;
    public final C20810yC A03;
    public final C19890wg A04;
    public final C19770wU A05;
    public final AnonymousClass1UD A06;

    public AnonymousClass1UC(C19970wo r2, C20810yC r3, C19890wg r4, C19770wU r5, AnonymousClass1UD r6) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        AnonymousClass00C.A0D(r5, 3);
        AnonymousClass00C.A0D(r4, 4);
        this.A02 = r2;
        this.A03 = r3;
        this.A05 = r5;
        this.A04 = r4;
        this.A06 = r6;
    }

    public static final synchronized void A00(AnonymousClass1UC r4) {
        synchronized (r4) {
            r4.A06().edit().putLong("last_cache_update_time", C19970wo.A00(r4.A02)).apply();
        }
    }

    public static final synchronized void A01(AnonymousClass1UC r2, Boolean bool, String str) {
        synchronized (r2) {
            if (bool == null) {
                A02(r2, str);
            } else {
                r2.A06().edit().putBoolean(str, bool.booleanValue()).apply();
            }
            A00(r2);
        }
    }

    public static final synchronized void A02(AnonymousClass1UC r1, String str) {
        synchronized (r1) {
            r1.A06().edit().remove(str).apply();
        }
    }

    public final synchronized SharedPreferences A06() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A04.A00(A07);
            this.A00 = sharedPreferences;
        }
        if (sharedPreferences == null) {
            throw new IllegalStateException("Required value was null.");
        }
        return sharedPreferences;
    }

    public Boolean A08() {
        if (!A0B() || A03()) {
            return null;
        }
        return Boolean.valueOf(A06().getBoolean("is_paused", false));
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(C19430v1.A0A);
        sb.append("_waffle_client_cache");
        A07 = sb.toString();
    }

    public void A09() {
        AnonymousClass1UD r3 = this.A06;
        AnonymousClass61K r2 = new AnonymousClass61K(this);
        AnonymousClass1U9 r1 = r3.A03;
        if (r1 != null) {
            r1.A01(new C145486ty(r2, r3));
        } else {
            AnonymousClass00C.A0G("accountLinkingPingHelper");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
    }

    public final boolean A0B() {
        Boolean bool = this.A01;
        if (bool == null) {
            Boolean bool2 = C18750th.A03;
            bool = false;
            this.A01 = bool;
        }
        if (bool.booleanValue()) {
            return true;
        }
        if ("wa_android_waffle".length() != 0) {
            String A09 = this.A03.A09(1010);
            AnonymousClass00C.A08(A09);
            if (A09.length() != 0) {
                try {
                    JSONArray jSONArray = new JSONObject(A09).getJSONArray("client_cache");
                    AnonymousClass00C.A0B(jSONArray);
                    int length = jSONArray.length();
                    int i = 0;
                    while (i < length) {
                        try {
                            if ("wa_android_waffle".equalsIgnoreCase(jSONArray.getString(i))) {
                                return true;
                            }
                            i++;
                        } catch (JSONException e) {
                            C18740tg.A0A(e);
                        }
                    }
                } catch (JSONException unused) {
                }
                return false;
            }
        }
        return false;
    }

    private final boolean A03() {
        long j = A06().getLong("last_cache_update_time", 0);
        long A002 = (long) C20800yB.A00(C21000yV.A02, this.A03, 1101);
        if (j == 0 || C19970wo.A00(this.A02) - j <= TimeUnit.HOURS.toMillis(A002)) {
            return false;
        }
        A06().edit().clear().apply();
        this.A05.Boy(new C35751jC(this, 16));
        return true;
    }

    public static final boolean A04(AnonymousClass1UC r3) {
        if (!r3.A0B() || r3.A03() || r3.A07("F") == null || !r3.A06().getBoolean("fb_auto_crossposting", false)) {
            return false;
        }
        return true;
    }

    public static final boolean A05(AnonymousClass1UC r3) {
        if (!r3.A0B() || r3.A03() || r3.A07("I") == null || !r3.A06().getBoolean("ig_auto_crossposting", false)) {
            return false;
        }
        return true;
    }

    public C135086c7 A07(String str) {
        String str2;
        if (!A0B() || A03()) {
            return null;
        }
        if (str.equals("F")) {
            str2 = A06().getString("crossposting_destination_fb", (String) null);
            if (str2 == null) {
                return null;
            }
        } else if (!str.equals("I") || (str2 = A06().getString("crossposting_destination_ig", (String) null)) == null) {
            return null;
        }
        return new C135086c7(new C146356vT(), String.class, str2, "WaffleCrosspostingDestination");
    }

    public void A0A(Boolean bool) {
        if (A0B()) {
            A01(this, bool, "is_paused");
        }
    }
}
