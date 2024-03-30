package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2kO  reason: invalid class name and case insensitive filesystem */
public final class C50212kO extends C132446Tt {
    public long A00;
    public final long A01;
    public final C19630wG A02;
    public final C19420v0 A03;
    public final C21520zN A04;
    public final C21510zM A05;
    public final AnonymousClass6OK A06;
    public final AnonymousClass3KB A07;
    public final AnonymousClass3UV A08;
    public final C199929gH A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final WeakReference A0D;
    public final JSONObject A0E;
    public final C19970wo A0F;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Set<String> stringSet;
        JSONObject jSONObject;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.A01;
            if (elapsedRealtime < j) {
                this.A00 = C36391kE.A0B(j - elapsedRealtime);
                return A00((Object) null, 11);
            }
            AnonymousClass3KB r6 = this.A07;
            boolean z = true;
            if (C19970wo.A00(r6.A00) <= C36341k9.A0B(r6.A01.A0F(), "pref_pre_chatd_ab_next_fetch_time")) {
                z = false;
            }
            if (z) {
                Log.i("CheckIfReinstalledTask/shouldFetchPreChatdABProps");
                this.A05.A02();
                String A002 = r6.A00(this.A0A, this.A0C);
                if (A002 != null) {
                    if (A002.equals("wamsys initialization fails")) {
                        return A00((Object) null, 22);
                    }
                    r6.A01(A002);
                }
            }
            byte[] A012 = this.A09.A01();
            AnonymousClass6OK r7 = this.A06;
            synchronized (r7) {
                AnonymousClass6OK.A00(r7);
                SharedPreferences sharedPreferences = r7.A00;
                if (sharedPreferences == null) {
                    sharedPreferences = r7.A05.A00(C19430v1.A0A);
                    r7.A00 = sharedPreferences;
                }
                stringSet = sharedPreferences.getStringSet("ab_offline_props:offline_exposure_strings", new HashSet(1));
            }
            JSONArray jSONArray = new JSONArray();
            for (String put : stringSet) {
                jSONArray.put(put);
            }
            try {
                jSONObject = C36441kJ.A1B();
                jSONObject.put("exposure", jSONArray);
                JSONObject jSONObject2 = this.A0E;
                if (jSONObject2 != null) {
                    jSONObject.put("metrics", jSONObject2);
                }
            } catch (JSONException e) {
                Log.e("CheckIfReinstalledTask/enterphone/getOfflineAbParams exception: ", e);
                jSONObject = null;
            }
            C19420v0 r4 = this.A03;
            int A013 = C36371kC.A01(C36341k9.A0E(r4), "reg_attempts_check_exist") + 1;
            C36321k7.A0q(r4, "reg_attempts_check_exist", A013);
            AnonymousClass3DL r72 = new AnonymousClass3DL(A013, C65983Uf.A0C(r4, this.A04));
            if (((AnonymousClass4UD) this.A0D.get()) == null) {
                return A00((Object) null, 4);
            }
            AnonymousClass6M2 r1 = C56442wI.A00;
            Context context = this.A02.A00;
            AnonymousClass00C.A08(context);
            String str = this.A0C;
            String A014 = r1.A01(context, str);
            AnonymousClass3UV r62 = this.A08;
            String str2 = this.A0A;
            String str3 = this.A0B;
            if (str3 == null) {
                str3 = "-1";
            }
            AnonymousClass3OL A0C2 = r62.A0C(r72, str2, str, A014, str3, jSONObject, A012, false);
            if (A0C2 == null) {
                Log.e("CheckIfReinstalledTask/doInBackground/null ExistResult");
                return A00((Object) null, 4);
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("CheckIfReinstalledTask/exist entrypoint response/autoconfType=");
            A0u.append(A0C2.A01);
            A0u.append("/autoconfCfType=");
            A0u.append(A0C2.A00);
            A0u.append("/non-null serverStartMessage=");
            A0u.append(AnonymousClass000.A1V(A0C2.A0J));
            A0u.append("/waOldEligible=");
            A0u.append(A0C2.A07);
            A0u.append("/emailOtpEligible=");
            A0u.append(A0C2.A02);
            A0u.append("/flashType=");
            A0u.append(A0C2.A03);
            A0u.append("/resetMethod=");
            A0u.append(A0C2.A0H);
            A0u.append("/wipeWait=");
            A0u.append(A0C2.A0A);
            A0u.append("/smsWait=");
            A0u.append(A0C2.A0K);
            A0u.append(";voiceWait=");
            A0u.append(A0C2.A0L);
            A0u.append(";waOldWait=");
            A0u.append(A0C2.A0M);
            A0u.append(";emailOtpWait=");
            A0u.append(A0C2.A0F);
            A0u.append(";silentAuthEligible=");
            C36321k7.A1Y(A0u, A0C2.A04);
            r4.A13(A0C2.A01);
            int i = A0C2.A01;
            if (i == 1 || i == 2 || i == 3) {
                r4.A1O("autoconf_server_enabled");
            }
            int i2 = A0C2.A0S;
            if (i2 != 0) {
                if (i2 == 1) {
                    return A00(A0C2, 1);
                }
                return A00((Object) null, 4);
            }
            C52062op r12 = A0C2.A0T;
            if (r12 == null) {
                return A00((Object) null, 4);
            }
            if (r12 == C52062op.FAIL_TO_INITIALIZE_WAMSYS) {
                return A00((Object) null, 22);
            }
            if (r12 == C52062op.BLOCKED) {
                return A00(A0C2, 5);
            }
            if (r12 == C52062op.LENGTH_LONG) {
                return A00((Object) null, 6);
            }
            if (r12 == C52062op.LENGTH_SHORT) {
                return A00((Object) null, 7);
            }
            if (r12 == C52062op.FORMAT_WRONG) {
                return A00((Object) null, 8);
            }
            if (r12 == C52062op.TEMPORARILY_UNAVAILABLE) {
                return A00(A0C2, 9);
            }
            if (r12 == C52062op.OLD_VERSION) {
                return A00(A0C2, 12);
            }
            if (r12 == C52062op.ERROR_BAD_TOKEN) {
                return A00((Object) null, 14);
            }
            if (r12 == C52062op.INVALID_SKEY_SIGNATURE) {
                return A00((Object) null, 15);
            }
            if (r12 == C52062op.SECURITY_CODE) {
                return A00(A0C2, 16);
            }
            if (r12 == C52062op.DEVICE_CONFIRM_OR_SECOND_CODE) {
                return A00(A0C2, 20);
            }
            if (r12 == C52062op.SECOND_CODE) {
                return A00(A0C2, 19);
            }
            if (r12 == C52062op.CODE_CHECKPOINT) {
                return A00(A0C2, 21);
            }
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("CheckIfReinstalledTask/possible-migration/");
            C36331k8.A1S(A0u2, A0C2.A0P);
            return A00(A0C2, 2);
        } catch (Exception e2) {
            Log.e("CheckIfReinstalledTask/error", e2);
        }
    }

    public void A09() {
        AnonymousClass4UD r0 = (AnonymousClass4UD) this.A0D.get();
        if (r0 != null) {
            r0.BKB();
        }
    }

    public void A0A() {
        C19420v0 r1 = this.A03;
        r1.A1N("did_not_query");
        r1.A13(-1);
        AnonymousClass4UD r0 = (AnonymousClass4UD) this.A0D.get();
        if (r0 != null) {
            r0.Bu0();
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass00I r9 = (AnonymousClass00I) obj;
        AnonymousClass00C.A0D(r9, 0);
        AnonymousClass4UD r1 = (AnonymousClass4UD) this.A0D.get();
        if (r1 != null) {
            r1.BKB();
            Object obj2 = r9.A00;
            C18740tg.A06(obj2);
            AnonymousClass00C.A08(obj2);
            r1.BX8((AnonymousClass3OL) r9.A01, this.A0A, this.A0C, AnonymousClass000.A0I(obj2), this.A00);
        }
    }

    public C50212kO(C19970wo r3, C19630wG r4, C19420v0 r5, C21520zN r6, C21510zM r7, AnonymousClass6OK r8, AnonymousClass3KB r9, AnonymousClass3UV r10, C199929gH r11, AnonymousClass4UD r12, String str, String str2, String str3, JSONObject jSONObject, long j) {
        C36321k7.A19(r3, str, str2, r4);
        C36321k7.A14(r8, r7, r6);
        C36321k7.A15(r11, r5, r9);
        AnonymousClass00C.A0D(r10, 14);
        this.A01 = j;
        this.A0F = r3;
        this.A0A = str;
        this.A0C = str2;
        this.A02 = r4;
        this.A0B = str3;
        this.A0E = jSONObject;
        this.A06 = r8;
        this.A05 = r7;
        this.A04 = r6;
        this.A09 = r11;
        this.A03 = r5;
        this.A07 = r9;
        this.A08 = r10;
        this.A0D = AnonymousClass001.A0F(r12);
    }

    public static AnonymousClass00I A00(Object obj, int i) {
        return new AnonymousClass00I(Integer.valueOf(i), obj);
    }
}
