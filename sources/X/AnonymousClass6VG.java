package X;

import android.os.Build;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6VG  reason: invalid class name */
public class AnonymousClass6VG {
    public final C07610Yn A00;
    public final C24601Db A01;
    public final C24611Dc A02 = C24611Dc.A00("PaymentFingerprintKeyStore", "payment-settings", "COMMON");

    public static synchronized String A01(AnonymousClass6VG r8, int i) {
        String str;
        JSONObject A1C;
        synchronized (r8) {
            str = null;
            try {
                C24601Db r6 = r8.A01;
                String A06 = r6.A06();
                if (TextUtils.isEmpty(A06)) {
                    A1C = C36441kJ.A1B();
                } else {
                    A1C = C36441kJ.A1C(A06);
                }
                JSONObject A0t = C90474aD.A0t("bio", A1C);
                A0t.put("v", "1");
                if (i == 0) {
                    A0t.remove("bioId");
                    A0t.remove("bioPublicKey");
                } else if (i == 2) {
                    str = C36361kB.A0l().replace("-", "");
                    A0t.put("bioId", str);
                }
                A0t.put("bioState", i);
                r6.A0K(C90484aE.A0l(A0t, "bio", A1C));
            } catch (JSONException e) {
                r8.A02.A0A("PaymentFingerprintKeyStore setState threw: ", e);
            }
        }
        return str;
    }

    public synchronized int A02() {
        int i;
        JSONObject optJSONObject;
        i = 0;
        try {
            String A06 = this.A01.A06();
            if (!TextUtils.isEmpty(A06) && (optJSONObject = C36441kJ.A1C(A06).optJSONObject("bio")) != null && (i = optJSONObject.optInt("bioState", 0)) == 1) {
                if (A00() == null) {
                    A03();
                    i = 3;
                }
            }
        } catch (JSONException e) {
            this.A02.A0A("getState threw: ", e);
        }
        return i;
    }

    public static AnonymousClass0Y0 A00() {
        Log.i("FingerprintHelper-helper/get-crypto-object");
        try {
            Signature instance = Signature.getInstance("SHA256withECDSA");
            KeyStore instance2 = KeyStore.getInstance("AndroidKeyStore");
            instance2.load((KeyStore.LoadStoreParameter) null);
            instance.initSign((PrivateKey) instance2.getKey("payment_bio_key_alias", (char[]) null));
            return new AnonymousClass0Y0(instance);
        } catch (IOException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException | CertificateException e) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("FingerprintHelper/getCryptoObject: api=");
            A0u.append(Build.VERSION.SDK_INT);
            C36321k7.A1Z(A0u, C90494aF.A0c(e, " error: ", A0u));
            return null;
        }
    }

    public void A03() {
        Log.i("FingerprintHelper-helper/remove-key");
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            instance.deleteEntry("payment_bio_key_alias");
            A01(this, 0);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("FingerprintHelper/removeKey: api=");
            A0u.append(Build.VERSION.SDK_INT);
            C36321k7.A1a(A0u, C90494aF.A0c(e, " error: ", A0u));
        }
    }

    public void A04(String str) {
        String str2;
        JSONObject optJSONObject;
        if (str != null) {
            synchronized (this) {
                str2 = null;
                try {
                    String A06 = this.A01.A06();
                    if (!TextUtils.isEmpty(A06) && (optJSONObject = C36441kJ.A1C(A06).optJSONObject("bio")) != null) {
                        str2 = optJSONObject.optString("bioId", (String) null);
                    }
                } catch (JSONException e) {
                    this.A02.A0A("getId threw: ", e);
                }
            }
            if (str.equals(str2)) {
                A01(this, 1);
                return;
            }
        }
        A03();
        return;
    }

    public boolean A05() {
        C07610Yn r1 = this.A00;
        if (!r1.A06() || !r1.A05()) {
            return false;
        }
        return true;
    }

    public AnonymousClass6VG(C19630wG r4, C24601Db r5) {
        this.A01 = r5;
        this.A00 = new C07610Yn(r4.A00);
    }

    public boolean A06(C02680Bk r4, C160387kv r5, byte[] bArr) {
        AnonymousClass0Y0 A002 = A00();
        if (A002 != null) {
            this.A00.A04(new C95124k5(r5, this, bArr), A002, r4);
            return true;
        }
        this.A02.A06("sign: cryptoObject is null");
        A03();
        return false;
    }
}
