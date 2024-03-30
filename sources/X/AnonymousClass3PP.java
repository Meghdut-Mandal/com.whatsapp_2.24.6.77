package X;

import android.app.Activity;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import com.whatsapp.R;
import com.whatsapp.registration.verifyphone.VerifyPhoneNumber;
import com.whatsapp.util.Log;

/* renamed from: X.3PP  reason: invalid class name */
public class AnonymousClass3PP {
    public final AnonymousClass17Y A00;
    public final C62653Gz A01;
    public final C19970wo A02;

    public void A02(long j, long j2) {
        AnonymousClass3G5 r2 = this.A01.A05;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AccountDefenceLocalDataRepository/save-original-wait-time-diffs ");
        A0u.append(j);
        C36321k7.A1V(", ", A0u, j2);
        SharedPreferences.Editor A0G = C36381kD.A0G(r2.A00, "AccountDefenceLocalDataRepository_prefs");
        A0G.putLong("com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.account_defence_original_sms_wait_time", j);
        A0G.putLong("com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.account_defence_original_voice_wait_time", j2);
        if (!A0G.commit()) {
            Log.e("AccountDefenceLocalDataRepository/save-original-wait-time-diffs/error");
        }
    }

    public AnonymousClass3PP(AnonymousClass17Y r1, C19970wo r2, C62653Gz r3) {
        this.A02 = r2;
        this.A00 = r1;
        this.A01 = r3;
    }

    public static boolean A00(VerifyPhoneNumber verifyPhoneNumber) {
        int A3i = verifyPhoneNumber.A3i();
        if (A3i == 13 || A3i == 14) {
            return true;
        }
        return false;
    }

    public SpannableStringBuilder A01(Activity activity, String str, int i) {
        int i2;
        String A0w;
        C36321k7.A1T("AccountDefenceSecondCodeViewPresenter/getAccountDefenceTopDescription for state:", AnonymousClass000.A0u(), i);
        if (i == 1 || i == 2) {
            i2 = R.string.f12nameremoved;
            A0w = C36351kA.A0w(activity, str, 1, i2);
        } else if (i != 3) {
            A0w = activity.getString(R.string.f12nameremoved);
        } else {
            i2 = R.string.f12nameremoved;
            A0w = C36351kA.A0w(activity, str, 1, i2);
        }
        return AnonymousClass3LN.A01(C81143wX.A00(activity, 5), A0w, "learn-more");
    }
}
