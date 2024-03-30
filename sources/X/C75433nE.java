package X;

import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.settings.autoconf.ShareAutoConfVerifierActivity;
import com.whatsapp.util.Log;
import org.json.JSONArray;

/* renamed from: X.3nE  reason: invalid class name and case insensitive filesystem */
public final class C75433nE implements B6H {
    public AnonymousClass4OY A00;
    public final C27591Ow A01;

    public void Bey(C177278dX r6) {
        AnonymousClass00C.A0D(r6, 0);
        Log.i("CheckAutoConfConsentManager/onResponse");
        JSONArray jSONArray = r6.A01;
        if (jSONArray.length() > 0) {
            Log.e("CheckAutoConfConsentManager/onResponse/error");
            if (jSONArray.length() > 1) {
                C62963If A002 = C55242uJ.A00(jSONArray);
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("CheckAutoConfConsentManager/onResponse/errorCode=");
                A0u.append(A002.A00);
                A0u.append("/errorDescription=");
                C36321k7.A1Z(A0u, A002.A01);
            }
            if (this.A00 != null) {
                Log.e("ShareAutoConfVerifierActivity/onCheckConsentFailure");
                return;
            }
            throw C36331k8.A0d("callback");
        }
        AnonymousClass4OY r4 = this.A00;
        if (r4 != null) {
            String A10 = C36411kG.A10("xwa2_autoconf_consent", r6.A00.A00);
            ShareAutoConfVerifierActivity shareAutoConfVerifierActivity = (ShareAutoConfVerifierActivity) r4;
            C36321k7.A1Q("ShareAutoConfVerifierActivity/onCheckConsentSuccess/consentType=", A10, AnonymousClass000.A0u());
            SwitchCompat switchCompat = shareAutoConfVerifierActivity.A00;
            if (switchCompat == null) {
                throw C36331k8.A0d("consentSwitch");
            }
            switchCompat.setChecked(A10.equals("foa"));
            C19420v0 r1 = shareAutoConfVerifierActivity.A09;
            SwitchCompat switchCompat2 = shareAutoConfVerifierActivity.A00;
            if (switchCompat2 == null) {
                throw C36331k8.A0d("consentSwitch");
            }
            C36331k8.A0w(C36331k8.A05(r1), "autoconf_consent_given", switchCompat2.isChecked());
            return;
        }
        throw C36331k8.A0d("callback");
    }

    public C75433nE(C27591Ow r1) {
        this.A01 = r1;
    }

    public void BXQ(Throwable th) {
        C36321k7.A1J(th, "CheckAutoConfConsentManager/onFailure/MEX error: ", C36341k9.A0i(th));
    }
}
