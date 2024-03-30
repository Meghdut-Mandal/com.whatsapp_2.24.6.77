package X;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1Nv  reason: invalid class name and case insensitive filesystem */
public class C27341Nv {
    public final AnonymousClass17Y A00;
    public final C27361Nx A01;
    public final Map A02 = Collections.synchronizedMap(new HashMap());
    public final Set A03 = Collections.synchronizedSet(new HashSet());
    public final Handler A04 = new Handler(Looper.getMainLooper());
    public final C19600wD A05;
    public final C19420v0 A06;
    public final AnonymousClass19A A07;
    public final Runnable A08;

    public int A00(String str) {
        int A0O = this.A06.A0O(AnonymousClass3TL.A01(str), 0);
        AnonymousClass30R r0 = (AnonymousClass30R) this.A02.get(str);
        if (r0 != null) {
            A0O = AnonymousClass3TL.A00(r0.A00);
        }
        return Math.max(0, A0O);
    }

    public void A01(AnonymousClass3EB r14) {
        C76553p4 r7 = new C76553p4(new C593233m(this, r14), this.A07);
        Log.i("PrivacySettingsProtocolHelper/sendGetPrivacySettingsRequest");
        AnonymousClass19A r6 = r7.A00;
        String A09 = r6.A09();
        r6.A0K(r7, new C203399nx(new C203399nx("privacy", (AnonymousClass1AL[]) null), "iq", new AnonymousClass1AL[]{new AnonymousClass1AL((Jid) C177588e2.A00, "to"), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A09), new AnonymousClass1AL("xmlns", "privacy"), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get")}), A09, 70, 0);
    }

    public void A02(String str, String str2) {
        String str3 = str2;
        String str4 = str;
        this.A02.put(str4, new AnonymousClass30R(str3));
        C76553p4 r11 = new C76553p4(new C593233m(this, (AnonymousClass3EB) null), this.A07);
        Log.i("PrivacySettingsProtocolHelper/sendSetPrivacySettingsRequest");
        AnonymousClass19A r10 = r11.A00;
        String A09 = r10.A09();
        r10.A0K(r11, new C203399nx(new C203399nx("privacy", (AnonymousClass1AL[]) null, new C203399nx[]{new C203399nx("category", new AnonymousClass1AL[]{new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str4), new AnonymousClass1AL("value", str3)})}), "iq", new AnonymousClass1AL[]{new AnonymousClass1AL((Jid) C177588e2.A00, "to"), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set"), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A09), new AnonymousClass1AL("xmlns", "privacy")}), A09, 69, 0);
        this.A00.Bp3(new C35641j1((Object) this, 45));
    }

    public boolean A04(String str, String str2) {
        if (!this.A05.A09()) {
            this.A00.A07(R.string.f12nameremoved, 0);
            return false;
        }
        A02(str, str2);
        Handler handler = this.A04;
        Runnable runnable = this.A08;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 20000);
        return true;
    }

    public C27341Nv(AnonymousClass17Y r3, C19600wD r4, C19420v0 r5, AnonymousClass19A r6, C27361Nx r7) {
        this.A00 = r3;
        this.A07 = r6;
        this.A01 = r7;
        this.A06 = r5;
        this.A05 = r4;
        this.A08 = new C35621iz(this, r3, 9);
    }

    public void A03(Map map) {
        C19420v0 r4;
        SharedPreferences sharedPreferences;
        String str;
        boolean z = false;
        boolean z2 = false;
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            StringBuilder sb = new StringBuilder();
            sb.append("settingsprivacy/received ");
            sb.append(str2);
            sb.append(":");
            sb.append(str3);
            Log.i(sb.toString());
            int A002 = AnonymousClass3TL.A00(str3);
            if (A002 < 0 || !AnonymousClass3TL.A03(str2, A002)) {
                this.A02.remove(str2);
                z = true;
            } else {
                Map map2 = this.A02;
                AnonymousClass30R r0 = (AnonymousClass30R) map2.get(str2);
                if (r0 == null || r0.A00.equals(str3)) {
                    map2.remove(str2);
                    if ("last".equals(str2)) {
                        r4 = this.A06;
                        sharedPreferences = (SharedPreferences) r4.A00.get();
                        str = "privacy_last_seen";
                    } else if ("online".equals(str2)) {
                        r4 = this.A06;
                        sharedPreferences = (SharedPreferences) r4.A00.get();
                        str = "privacy_online";
                    } else if ("readreceipts".equals(str2)) {
                        C19420v0 r1 = this.A06;
                        C19420v0.A00(r1).putBoolean("read_receipts_enabled", "all".contentEquals(str3)).apply();
                    } else {
                        try {
                            this.A06.A1c(AnonymousClass3TL.A01(str2), A002);
                        } catch (IllegalArgumentException e) {
                            Log.i("Received unexpected privacy category from the server", e);
                        }
                    }
                    int i = sharedPreferences.getInt(str, 0);
                    C19420v0.A00(r4).putInt(str, A002).apply();
                    if (i != A002) {
                        z2 = true;
                    }
                }
            }
        }
        if (z) {
            this.A00.A0H(new C35641j1((Object) this, 43));
        }
        if (z2) {
            this.A00.A0H(new C35641j1((Object) this, 44));
        }
        this.A00.Bp3(new C35641j1((Object) this, 45));
    }
}
