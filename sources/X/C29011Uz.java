package X;

import android.content.SharedPreferences;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.1Uz  reason: invalid class name and case insensitive filesystem */
public class C29011Uz {
    public static final long A0F = TimeUnit.SECONDS.toMillis(35);
    public static final long[] A0G = {TimeUnit.HOURS.toMillis(6), TimeUnit.HOURS.toMillis(12), TimeUnit.DAYS.toMillis(1), TimeUnit.DAYS.toMillis(1), TimeUnit.DAYS.toMillis(3), TimeUnit.DAYS.toMillis(7)};
    public boolean A00;
    public SharedPreferences A01;
    public final C19700wN A02;
    public final AnonymousClass17Y A03;
    public final AnonymousClass164 A04;
    public final C19970wo A05;
    public final AnonymousClass133 A06;
    public final C20810yC A07;
    public final C19770wU A08;
    public final List A09 = new LinkedList();
    public final C19600wD A0A;
    public final AnonymousClass132 A0B;
    public final C19890wg A0C;
    public final AnonymousClass1V0 A0D;
    public volatile String A0E;

    public static synchronized SharedPreferences A00(C29011Uz r2) {
        SharedPreferences sharedPreferences;
        synchronized (r2) {
            sharedPreferences = r2.A01;
            if (sharedPreferences == null) {
                sharedPreferences = r2.A0C.A00(C19430v1.A0A);
                r2.A01 = sharedPreferences;
            }
        }
        return sharedPreferences;
    }

    public static String A01(C29011Uz r4, String str) {
        byte[] A022;
        try {
            C1264463z A002 = AnonymousClass132.A00(new JSONArray(str));
            if (A002 == null || (A022 = r4.A06.A02(A002, AnonymousClass6JD.A0V)) == null) {
                return null;
            }
            return new String(A022, C19430v1.A0D);
        } catch (JSONException e) {
            Log.w("TwoFactorAuthManager/decryptCode/cannot create Json", e);
            return null;
        }
    }

    public String A02() {
        if (this.A0E == null) {
            synchronized (this) {
                if (this.A0E == null) {
                    String string = A00(this).getString("two_factor_auth_code", (String) null);
                    String str = "";
                    if (string == null) {
                        this.A0E = str;
                    } else {
                        boolean z = A00(this).getBoolean("two_factor_auth_using_encryption", false);
                        if (!z || (string = A01(this, string)) != null) {
                            str = string;
                        } else {
                            this.A02.A0E("TwoFactorAuthManager/loadCodeInMemory/EncryptedCodeFailure", (String) null, false);
                        }
                        this.A0E = str;
                        StringBuilder sb = new StringBuilder();
                        sb.append("TwoFactorAuthManager/loadCodeInMemory/isUsingEncryption: ");
                        sb.append(z);
                        Log.i(sb.toString());
                    }
                }
            }
        }
        String str2 = this.A0E;
        C18740tg.A06(str2);
        return str2;
    }

    public void A03(String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("TwoFactorAuthManager/onAuthSettingsError errorCode [");
        sb.append(i);
        sb.append("] errorMessage [");
        sb.append(str);
        sb.append("]");
        Log.w(sb.toString());
        for (C88614Tj Bjj : this.A09) {
            Bjj.Bjj(i);
        }
    }

    public void A04(String str, String str2) {
        if (!this.A0A.A09()) {
            Log.i("TwoFactorAuthManager/setTwoFactorAuthSettings/no internet connection, cancelling");
            this.A03.Bp3(new C35751jC(this, 1));
            return;
        }
        Log.i("TwoFactorAuthManager/setTwoFactorAuthSettings");
        AnonymousClass1V0 r5 = this.A0D;
        AnonymousClass19A r10 = r5.A01;
        String A092 = r10.A09();
        StringBuilder sb = new StringBuilder();
        sb.append("TwoFactorXmppMethods/sendSetTwoFactorAuth; iq=");
        sb.append(A092);
        Log.i(sb.toString());
        ArrayList arrayList = new ArrayList(2);
        String str3 = str;
        if (str != null) {
            arrayList.add(new C203399nx("code", str3, (AnonymousClass1AL[]) null));
        }
        String str4 = str2;
        if (str2 != null) {
            arrayList.add(new C203399nx("email", str4, (AnonymousClass1AL[]) null));
        }
        r10.A0K(new C76653pE(r5, str3, str4), new C203399nx(new C203399nx("2fa", (AnonymousClass1AL[]) null, (C203399nx[]) arrayList.toArray(new C203399nx[0])), "iq", new AnonymousClass1AL[]{new AnonymousClass1AL((Jid) C177588e2.A00, "to"), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A092), new AnonymousClass1AL("xmlns", "urn:xmpp:whatsapp:account"), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set")}), A092, 111, 32000);
    }

    public C29011Uz(C19700wN r2, AnonymousClass17Y r3, AnonymousClass164 r4, C19600wD r5, C19970wo r6, AnonymousClass132 r7, AnonymousClass133 r8, C20810yC r9, C19890wg r10, AnonymousClass1V0 r11, C19770wU r12) {
        this.A05 = r6;
        this.A07 = r9;
        this.A03 = r3;
        this.A02 = r2;
        this.A08 = r12;
        this.A0B = r7;
        this.A04 = r4;
        this.A0D = r11;
        this.A06 = r8;
        this.A0C = r10;
        this.A0A = r5;
    }

    public void A05(boolean z) {
        int max;
        int i = A00(this).getInt("two_factor_auth_nag_interval", 0);
        if (z) {
            max = Math.min(i + 1, 5);
        } else {
            max = Math.max(i - 1, 0);
        }
        A00(this).edit().putLong("two_factor_auth_nag_time", C19970wo.A00(this.A05)).putInt("two_factor_auth_nag_interval", max).putBoolean("two_factor_auth_last_code_correctness", z).apply();
    }

    public boolean A06() {
        long j;
        if (!(!A02().isEmpty())) {
            return false;
        }
        long j2 = A00(this).getLong("two_factor_auth_nag_time", -1);
        C19970wo r6 = this.A05;
        long A002 = C19970wo.A00(r6);
        C20810yC r2 = this.A07;
        C21000yV r1 = C21000yV.A02;
        if (C20800yB.A01(r1, r2, 5571)) {
            j = TimeUnit.DAYS.toMillis((long) C20800yB.A00(r1, r2, 5595));
        } else {
            j = A0G[Math.min(5, A00(this).getInt("two_factor_auth_nag_interval", 0))];
        }
        boolean z = false;
        if (A002 > j + j2) {
            z = true;
        }
        boolean z2 = A00(this).getBoolean("two_factor_auth_last_code_correctness", false);
        boolean z3 = false;
        if (C19970wo.A00(r6) < j2) {
            z3 = true;
            Log.w("TwoFactorAuthManager/clock-moved-back");
        }
        if (z || !z2 || z3) {
            return true;
        }
        return false;
    }
}
