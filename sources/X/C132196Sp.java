package X;

import android.text.TextUtils;
import android.util.Base64;
import java.nio.charset.Charset;
import java.security.cert.CertificateException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6Sp  reason: invalid class name and case insensitive filesystem */
public class C132196Sp {
    public final AnonymousClass133 A00;
    public final Set A01;
    public final C19700wN A02;
    public final AnonymousClass132 A03;
    public final AnonymousClass1UX A04;

    public static HashMap A00(C132196Sp r5) {
        String A0t = C36371kC.A0t(AnonymousClass1UX.A00(r5.A04), "pref_fb_user_certs_encrypted");
        if (A0t != null) {
            C1264463z A002 = AnonymousClass132.A00(new JSONArray(A0t));
            if (A002 == null) {
                C18740tg.A0D(false, "null key data");
            } else {
                byte[] A022 = r5.A00.A02(A002, AnonymousClass6JD.A0V);
                if (A022 != null) {
                    HashMap A0J = AnonymousClass001.A0J();
                    JSONObject A1C = C36441kJ.A1C(new String(A022, C19430v1.A0D));
                    Iterator<String> keys = A1C.keys();
                    while (keys.hasNext()) {
                        String A0C = AnonymousClass001.A0C(keys);
                        A0J.put(new AnonymousClass6P0(A0C), new AnonymousClass6LK(A1C.getString(A0C)));
                    }
                    return A0J;
                }
            }
            C18740tg.A0D(false, "null decrypt result");
        }
        return AnonymousClass001.A0J();
    }

    public C132196Sp(C19700wN r1, AnonymousClass132 r2, AnonymousClass133 r3, AnonymousClass1UX r4, Set set) {
        this.A02 = r1;
        this.A03 = r2;
        this.A00 = r3;
        this.A04 = r4;
        this.A01 = set;
    }

    public static void A01(C132196Sp r8, Map map) {
        byte[] A022;
        String str;
        HashMap A0J = AnonymousClass001.A0J();
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            String str2 = ((AnonymousClass6P0) A11.getKey()).A01;
            AnonymousClass6LK r6 = (AnonymousClass6LK) A11.getValue();
            A0J.put(str2, C36441kJ.A1B().put("e_cert", Base64.encodeToString(r6.A04.getEncoded(), 3)).put("s_cert", Base64.encodeToString(r6.A05.getEncoded(), 3)).put("ttl", r6.A00).put("ts", r6.A01).put("ppk", r6.A03).put("ppk_id", r6.A02).toString());
        }
        String A0n = C90504aG.A0n(A0J);
        AnonymousClass133 r4 = r8.A00;
        Charset charset = C19430v1.A0D;
        byte[] bytes = A0n.getBytes(charset);
        String str3 = AnonymousClass6JD.A0V;
        C1264463z A012 = r4.A01(str3, bytes);
        if (A012 == null) {
            str = "null keyData";
        } else {
            String A002 = A012.A00();
            if (TextUtils.isEmpty(A002)) {
                str = "empty result";
            } else {
                C1264463z A003 = AnonymousClass132.A00(new JSONArray(A002));
                if (A003 == null) {
                    C18740tg.A0D(false, "null key data");
                    A022 = null;
                } else {
                    A022 = r4.A02(A003, str3);
                }
                if (!new String(A022, charset).equals(A0n)) {
                    C18740tg.A0D(false, "decrypted does not match original");
                    r8.A02.A0E("FbUserEntityCertificateCache/encryptAndStoreMap", "Failed to encrypt cert", true);
                    return;
                }
                C36341k9.A0x(AnonymousClass1UX.A00(r8.A04).edit(), "pref_fb_user_certs_encrypted", A002);
                return;
            }
        }
        C18740tg.A0D(false, str);
    }

    public void A02(AnonymousClass6P0 r2) {
        try {
            HashMap A002 = A00(this);
            A002.remove(r2);
            A01(this, A002);
        } catch (CertificateException | JSONException e) {
            C18740tg.A0A(e);
        }
    }
}
