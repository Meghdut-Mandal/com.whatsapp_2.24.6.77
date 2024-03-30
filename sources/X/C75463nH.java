package X;

import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import com.whatsapp.infra.graphql.generated.autoconf.UpdateAutoConfConsentMutationImpl$Builder;
import com.whatsapp.infra.graphql.generated.autoconf.UpdateAutoConfConsentResponseImpl;
import com.whatsapp.util.Log;
import org.json.JSONArray;

/* renamed from: X.3nH  reason: invalid class name and case insensitive filesystem */
public final class C75463nH implements B6H {
    public C88534Tb A00;
    public final C27591Ow A01;

    public void Bey(C177278dX r4) {
        AnonymousClass00C.A0D(r4, 0);
        Log.i("UpdateAutoConfConsentManager/onResponse");
        JSONArray jSONArray = r4.A01;
        if (jSONArray.length() > 0) {
            Log.e("UpdateAutoConfConsentManager/onResponse/error");
            if (jSONArray.length() > 1) {
                C62963If A002 = C55242uJ.A00(jSONArray);
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("UpdateAutoConfConsentManager/onResponse/errorCode=");
                A0u.append(A002.A00);
                A0u.append("/errorDescription=");
                C36321k7.A1Z(A0u, A002.A01);
            }
        } else if (r4.A00.A00.optBoolean("xwa2_autoconf_consent_update")) {
            Log.i("UpdateAutoConfConsentManager/onResponse/consent updated on server");
            C88534Tb r0 = this.A00;
            if (r0 != null) {
                r0.Bjv();
                return;
            }
            throw C36331k8.A0d("callback");
        } else {
            Log.i("UpdateAutoConfConsentManager/onResponse/consent failed to be updated on server");
        }
        C88534Tb r02 = this.A00;
        if (r02 != null) {
            r02.Bju();
            return;
        }
        throw C36331k8.A0d("callback");
    }

    public C75463nH(C27591Ow r1) {
        this.A01 = r1;
    }

    public final void A00(C88534Tb r5, boolean z) {
        String str;
        C36321k7.A1X("UpdateAutoConfConsentManager/updateAutoConfConsent/switch to ", AnonymousClass000.A0u(), z);
        this.A00 = r5;
        if (z) {
            str = "foa";
        } else {
            str = SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME;
        }
        AnonymousClass9VA r3 = new UpdateAutoConfConsentMutationImpl$Builder().A00;
        r3.A02("autoconfConsent", str);
        this.A01.A00(new AnonymousClass9JF(r3, UpdateAutoConfConsentResponseImpl.class, "UpdateAutoConfConsent"), this).A00();
    }

    public void BXQ(Throwable th) {
        C36321k7.A1J(th, "UpdateAutoConfConsentManager/onFailure/MEX error: ", C36341k9.A0i(th));
    }
}
