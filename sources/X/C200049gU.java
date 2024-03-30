package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9gU  reason: invalid class name and case insensitive filesystem */
public class C200049gU {
    public static final byte[] A04 = Base64.decode("l6AjIyMhJYdTCB0+urtee7k2HmerRdr4c6seZyY2Pmw=", 2);
    public static final byte[] A05 = Base64.decode("oHsO+vVXYHOZXitgkZS2DI9N4+L+klLpMby3+JOPVGo=", 2);
    public final C19970wo A00;
    public final C199469fM A01;
    public final C24611Dc A02 = C165607th.A0c("PaymentsProviderKeyManager", "infra");
    public final C111495cN A03;

    public AF3 A00(C203399nx r15) {
        Long A0f;
        byte[] bytes;
        String A0h = r15.A0h("key-type");
        String A0h2 = r15.A0h("provider");
        String A0h3 = r15.A0h("key-version");
        String A0h4 = r15.A0h("key-scope");
        byte[] bArr = null;
        String A0i = r15.A0i("expiry-ts", (String) null);
        if (!"none".equals(A0h)) {
            bArr = r15.A0d("data").A01;
        }
        if (TextUtils.isEmpty(A0i)) {
            A0f = null;
        } else {
            A0f = C165597tg.A0f(A0i);
        }
        AF3 af3 = new AF3(A0f, A0h2, A0h4, A0h, A0h3, bArr);
        if (!"DOC-UPLOAD".equals(A0h4) && !"DYI-REPORT".equals(A0h4)) {
            byte[] bArr2 = r15.A0d(PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE).A01;
            C18740tg.A06(bArr2);
            AZ8 az8 = new AZ8(A04);
            byte[][] bArr3 = new byte[6][];
            bArr3[0] = af3.A05.getBytes();
            bArr3[1] = af3.A03.getBytes();
            bArr3[2] = af3.A04.getBytes();
            byte[] bArr4 = af3.A06;
            if (bArr4 == null) {
                bArr4 = new byte[0];
            }
            bArr3[3] = bArr4;
            bArr3[4] = af3.A02.getBytes();
            Long l = af3.A01;
            if (l == null) {
                bytes = new byte[0];
            } else {
                bytes = String.valueOf(l).getBytes();
            }
            bArr3[5] = bytes;
            if (!C131336Oq.A00().A01(az8.A01, C203239na.A05(bArr3), bArr2)) {
                return null;
            }
        }
        return af3;
    }

    public AF3 A01(String str, String str2) {
        Long l;
        C199469fM r6 = this.A01;
        AF3 A012 = r6.A01(str, str2);
        if (A012 == null || (l = A012.A01) == null || l.longValue() * 1000 >= C19970wo.A00(this.A00)) {
            return A012;
        }
        r6.A02(str, str2);
        return null;
    }

    public void A02(C202059ky r5, String str, String str2) {
        this.A01.A02(str, str2);
        C203399nx r0 = r5.A03;
        if (r0 != null) {
            try {
                AF3 A002 = A00(r0);
                if (A002 != null) {
                    A03(A002);
                }
            } catch (C235919b e) {
                C165567td.A15(this.A02, e, "handleStaleKey/failed to parse key node/exception: ", AnonymousClass000.A0u());
            }
        }
    }

    public void A03(AF3 af3) {
        C199469fM r4 = this.A01;
        String str = af3.A02;
        SharedPreferences.Editor edit = C199469fM.A00(r4).edit();
        JSONObject A1B = C36441kJ.A1B();
        try {
            A1B.put("key_type", af3.A03).put("key_version", af3.A04);
            byte[] bArr = af3.A06;
            if (bArr != null) {
                A1B.put("key_data", C36441kJ.A13(bArr));
            }
            Long l = af3.A01;
            if (l != null) {
                A1B.put("key_expiry", AnonymousClass000.A0l(l, "", AnonymousClass000.A0u()));
            }
            edit.putString(AnonymousClass000.A0p("::", str, AnonymousClass000.A0v(af3.A05)), A1B.toString());
            edit.apply();
        } catch (JSONException e) {
            C165567td.A15(r4.A01, e, "storeProviderKey threw ", AnonymousClass000.A0u());
        }
    }

    public C200049gU(C19970wo r3, C199469fM r4, C111495cN r5) {
        this.A00 = r3;
        this.A03 = r5;
        this.A01 = r4;
    }
}
