package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.security.KeyStore;
import java.security.KeyStoreException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6wm  reason: invalid class name and case insensitive filesystem */
public class C147166wm implements B34 {
    public final AnonymousClass1EZ A00;
    public final C24601Db A01;
    public final C119935qh A02;
    public final C201469jf A03;
    public final C120055qt A04;

    public boolean B5D(String str, boolean z) {
        return false;
    }

    public boolean Bws(C175898bF r2) {
        return false;
    }

    public void B5C() {
        SharedPreferences sharedPreferences;
        this.A01.A0K((String) null);
        C120055qt r3 = this.A04;
        synchronized (r3) {
            sharedPreferences = r3.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r3.A01.A00("com.whatsapp_br_payment_preferences");
                r3.A00 = sharedPreferences;
            }
        }
        C36331k8.A0w(sharedPreferences.edit(), "br_p2m_hpp_tos_accepted", false);
        this.A03.A04("personal");
        C119935qh r32 = this.A02;
        AnonymousClass626 r0 = (AnonymousClass626) r32.A01.A00.get();
        if (r0 != null) {
            try {
                KeyStore keyStore = r0.A00;
                if (keyStore.containsAlias("alias-payments-br-trusted-device-key")) {
                    keyStore.deleteEntry("alias-payments-br-trusted-device-key");
                }
            } catch (KeyStoreException unused) {
                Log.e("PAY: Secp256r1KeyStoreHelper/deleteKeyPair failed");
            }
        }
        try {
            C24601Db r2 = r32.A00;
            String A06 = r2.A06();
            if (!TextUtils.isEmpty(A06)) {
                JSONObject A1C = C36441kJ.A1C(A06);
                A1C.remove("td");
                r2.A0K(A1C.toString());
            }
        } catch (JSONException e) {
            Log.w("PAY: TrustedDeviceKeyStore delete failed", e);
        }
    }

    public boolean Bsv(C175708av r4) {
        C24601Db r2 = this.A01;
        if (!C36371kC.A1U(r2.A03(), "payments_card_can_receive_payment") || !this.A00.A0F() || !r2.A03().getString("pref_income_verification_state", "not_required").equals("collected")) {
            return true;
        }
        return false;
    }

    public boolean BwY(long j, boolean z) {
        C24601Db r3 = this.A01;
        C36331k8.A0w(C90494aF.A0E(r3), "payment_account_recoverable", z);
        if (!z) {
            r3.A0H(0);
            return true;
        } else if (j > 0) {
            r3.A0H(j * 1000);
            return true;
        } else {
            r3.A0B();
            return true;
        }
    }

    public C147166wm(AnonymousClass1EZ r1, C24601Db r2, C119935qh r3, C201469jf r4, C120055qt r5) {
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A04 = r5;
    }
}
