package X;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.Html;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1fh  reason: invalid class name and case insensitive filesystem */
public abstract class C33641fh {
    public final C20810yC A00;
    public final AnonymousClass1EZ A01;
    public final AnonymousClass1EV A02;

    public void A02() {
        boolean z;
        SharedPreferences.Editor A002;
        String str;
        if (this instanceof C33661fj) {
            z = true;
            A002 = C19420v0.A00(((C33661fj) this).A00);
            str = "payments_onboarding_chat_banner_dismmissed";
        } else {
            z = true;
            A002 = C19420v0.A00(((C33651fi) this).A01);
            str = "payments_incentive_banner_dismissed";
        }
        A002.putBoolean(str, z).apply();
    }

    public void A03(Context context) {
        String str;
        if (this instanceof C33661fj) {
            C33661fj r3 = (C33661fj) this;
            Intent BFp = r3.A02.A05().BFp(context, "p2p_context", "in_app_banner");
            if (BFp == null) {
                str = "Pay : PaymentsOnboardingBannerManager/showPaymentsOnboardingScreen intent is null";
            } else {
                context.startActivity(BFp);
                r3.A02();
                return;
            }
        } else {
            C33651fi r4 = (C33651fi) this;
            AnonymousClass1EU r1 = r4.A02;
            Intent BCa = r1.A05().BCa(context);
            if (BCa == null) {
                str = "Pay : PaymentsIncentiveBannerManager/getIncentivesOnboardingIntent intent is null";
            } else {
                context.startActivity(BCa);
                C196199Yc BFZ = r1.A05().BFZ();
                if (BFZ != null) {
                    C20810yC r12 = BFZ.A07;
                    C21000yV r5 = C21000yV.A02;
                    if (!C20800yB.A01(r5, r12, 979)) {
                        C19420v0 r32 = r4.A01;
                        int i = ((SharedPreferences) r32.A00.get()).getInt("payments_incentive_banner_clicked_count", 0) + 1;
                        C19420v0.A00(r32).putInt("payments_incentive_banner_clicked_count", i).apply();
                        int A002 = C20800yB.A00(r5, r4.A00, 2217);
                        if (A002 != 0 && i >= A002) {
                            r4.A02();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
        Log.e(str);
    }

    public boolean A04() {
        C196199Yc BFZ;
        C198299dE A022;
        if (this instanceof C33661fj) {
            C33661fj r6 = (C33661fj) this;
            C20810yC r2 = r6.A00;
            C21000yV r1 = C21000yV.A02;
            C33661fj.A04 = C20800yB.A00(r1, r2, 486);
            if (!C20800yB.A01(r1, r2, 484)) {
                return false;
            }
            C19420v0 r3 = r6.A00;
            AnonymousClass005 r22 = r3.A00;
            if (((SharedPreferences) r22.get()).getBoolean("payments_onboarding_banner_registration_started", false) || !r6.A02.A03()) {
                return false;
            }
            AnonymousClass1EZ r12 = r6.A01;
            if (r12.A0D() || r12.A0G("tos_no_wallet")) {
                return false;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long A0V = r3.A0V("payments_onboarding_banner_start_cool_off_timestamp");
            if ((A0V != -1 && currentTimeMillis <= A0V + 604800000) || ((SharedPreferences) r22.get()).getBoolean("payments_onboarding_chat_banner_dismmissed", false)) {
                return false;
            }
            if (r3.A0V("payments_onboarding_banner_start_timestamp") == -1) {
                r3.A1h("payments_onboarding_banner_start_timestamp", System.currentTimeMillis());
                r3.A1h("payments_onboarding_banner_last_seen_timestamp", System.currentTimeMillis());
                C19420v0.A00(r3).putInt("payments_onboarding_banner_total_days", 0).apply();
            } else if (r3.A2V("payments_onboarding_banner_last_seen_timestamp", 86400000)) {
                int i = ((SharedPreferences) r22.get()).getInt("payments_onboarding_banner_total_days", 0);
                int i2 = C33661fj.A04;
                if (i >= i2) {
                    C19420v0.A00(r3).putInt("payments_onboarding_banner_total_days", i2).apply();
                    r6.A02();
                } else {
                    C19420v0.A00(r3).putInt("payments_onboarding_banner_total_days", ((SharedPreferences) r22.get()).getInt("payments_onboarding_banner_total_days", 0) + 1).apply();
                }
                r3.A1h("payments_onboarding_banner_last_seen_timestamp", System.currentTimeMillis());
            }
            if (((SharedPreferences) r22.get()).getInt("payments_onboarding_banner_total_days", 0) < C33661fj.A04) {
                return true;
            }
            return false;
        }
        C33651fi r62 = (C33651fi) this;
        AnonymousClass1EU r8 = r62.A02;
        C196199Yc BFZ2 = r8.A05().BFZ();
        if (BFZ2 != null) {
            if (C20800yB.A01(C21000yV.A02, BFZ2.A07, 842) && (A022 = r62.A03.A02()) != null) {
                long j = A022.A08.A01;
                C19420v0 r7 = r62.A01;
                if (j != ((SharedPreferences) r7.A00.get()).getLong("payments_incentive_banner_offer_id", -1)) {
                    r7.A1h("payments_incentive_banner_start_timestamp", -1);
                    C33651fi.A00(r62, 0);
                    C19420v0.A00(r7).putInt("payments_incentive_banner_clicked_count", 0).apply();
                    C19420v0.A00(r7).putBoolean("payments_incentive_banner_dismissed", false).apply();
                    C19420v0.A00(r7).putLong("payments_incentive_banner_offer_id", j).apply();
                }
            }
        }
        C20810yC r5 = r62.A00;
        C21000yV r4 = C21000yV.A02;
        if (!C20800yB.A01(r4, r5, 884) || !r62.A02.A03()) {
            return false;
        }
        C19420v0 r23 = r62.A01;
        AnonymousClass005 r72 = r23.A00;
        if (((SharedPreferences) r72.get()).getBoolean("payments_incentive_banner_dismissed", false)) {
            return false;
        }
        long A002 = ((long) C20800yB.A00(r4, r5, 905)) * 60000;
        long currentTimeMillis2 = System.currentTimeMillis();
        long A0V2 = r23.A0V("payments_incentive_banner_start_cool_off_timestamp");
        if ((A0V2 != -1 && currentTimeMillis2 <= A0V2 + A002) || (BFZ = r8.A05().BFZ()) == null || !C20800yB.A01(r4, BFZ.A07, 842)) {
            return false;
        }
        AnonymousClass6O3 A012 = r62.A03.A01();
        C198299dE r0 = A012.A01;
        C198019cl r82 = A012.A02;
        boolean A04 = BFZ.A04(r0, r82);
        if (r0 == null || A04) {
            r62.A04.Boy(new C35231iM(8, (Object) r62, A04));
        }
        if (A012.A00(TimeUnit.MILLISECONDS.toSeconds(C19970wo.A00(r62.A00))) != 1) {
            return false;
        }
        if (r82 != null && (!r82.A04 || r82.A01 >= 1 || r82.A00 >= 1)) {
            return false;
        }
        if (r23.A0V("payments_incentive_banner_start_timestamp") == -1) {
            r23.A1h("payments_incentive_banner_start_timestamp", System.currentTimeMillis());
            r23.A1h("payments_incentive_banner_last_seen_timestamp", System.currentTimeMillis());
            C33651fi.A00(r62, 0);
        } else if (r23.A2V("payments_incentive_banner_last_seen_timestamp", 86400000)) {
            int A003 = C20800yB.A00(r4, r5, 885);
            if (((SharedPreferences) r72.get()).getInt("payments_incentive_banner_total_days", 0) >= A003) {
                C33651fi.A00(r62, A003);
                r62.A02();
            } else {
                C33651fi.A00(r62, ((SharedPreferences) r72.get()).getInt("payments_incentive_banner_total_days", 0) + 1);
            }
            r23.A1h("payments_incentive_banner_last_seen_timestamp", System.currentTimeMillis());
        }
        if (((SharedPreferences) r72.get()).getInt("payments_incentive_banner_total_days", 0) < C20800yB.A00(r4, r5, 885)) {
            return true;
        }
        return false;
    }

    public C33641fh(C20810yC r1, AnonymousClass1EZ r2, AnonymousClass1EV r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public CharSequence A01(Context context, int i) {
        return Html.fromHtml(context.getString(R.string.f12nameremoved));
    }
}
