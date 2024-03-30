package X;

import android.os.BaseBundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.push.RegistrationIntentService;
import com.whatsapp.util.Log;
import java.util.HashMap;

/* renamed from: X.1bD  reason: invalid class name and case insensitive filesystem */
public class C31061bD implements C236319f {
    public final C21100yf A00;
    public final AnonymousClass13T A01;
    public final C19970wo A02;
    public final C19630wG A03;
    public final C19420v0 A04;
    public final C21010yW A05;
    public final AnonymousClass1C4 A06;
    public final C31071bE A07;
    public final C19770wU A08;

    public int[] BCF() {
        return new int[]{6, 27, 250, 159, 174, 18};
    }

    public boolean BJl(Message message, int i) {
        int i2;
        int i3;
        Message message2 = message;
        int i4 = i;
        if (i4 == 6) {
            BaseBundle baseBundle = (BaseBundle) message2.obj;
            String string = baseBundle.getString("gcmToken");
            String string2 = baseBundle.getString("fbnsToken");
            String string3 = baseBundle.getString("mutedChatsHash");
            String string4 = baseBundle.getString("appMuteConfig");
            String string5 = baseBundle.getString("num_acc");
            String string6 = baseBundle.getString("pkey");
            String string7 = baseBundle.getString("voip_payload_type");
            StringBuilder sb = new StringBuilder();
            sb.append("AppMessagingXmppHandler/received client config from server; gcmToken=");
            boolean z = false;
            if (string != null) {
                i2 = string.length();
            } else {
                i2 = 0;
            }
            sb.append(i2);
            sb.append(" bytes; fbnsToken=");
            if (string2 != null) {
                i3 = string2.length();
            } else {
                i3 = 0;
            }
            sb.append(i3);
            sb.append(" bytes: mutedChatsHash=");
            sb.append(string3);
            sb.append(" appMuteConfig:");
            sb.append(string4);
            sb.append(" numberOfAccounts: ");
            sb.append(string5);
            sb.append(" has pKeyHash:");
            if (string6 != null) {
                z = true;
            }
            sb.append(z);
            sb.append(" voipPayloadType:");
            sb.append(string7);
            Log.i(sb.toString());
            RegistrationIntentService.A05(this.A03.A00, string, string3, string4, string5, string6, string7);
            C31071bE r2 = this.A07;
            if (r2.A01()) {
                r2.A00(string2);
                return true;
            } else if (!TextUtils.isEmpty(string2)) {
                this.A06.A02.A0J(Message.obtain((Handler) null, 0, 263, 0));
                return true;
            }
        } else if (i4 != 18) {
            if (i4 == 27) {
                int i5 = message2.arg2;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("AppMessagingXmppHandler/clientConfigError/");
                sb2.append(i5);
                Log.e(sb2.toString());
                if (i5 == 404) {
                    RegistrationIntentService.A05(this.A03.A00, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
                    C31071bE r1 = this.A07;
                    if (r1.A01()) {
                        r1.A00((String) null);
                        return true;
                    }
                }
            } else if (i4 == 159) {
                this.A01.A01(((BaseBundle) message2.obj).getLong("timestampMs"));
                return true;
            } else if (i4 != 174) {
                return false;
            } else {
                C203399nx r22 = (C203399nx) message2.obj;
                int A002 = AnonymousClass6R8.A00(r22.A0i("version", (String) null), 0);
                int A003 = AnonymousClass6R8.A00(r22.A0i("protocol", (String) null), 1);
                HashMap hashMap = new HashMap();
                for (C203399nx r4 : r22.A0j("prop")) {
                    hashMap.put(r4.A0h(PublicKeyCredentialControllerUtility.JSON_KEY_NAME), r4.A0i("value", (String) null));
                }
                if (A003 == 2) {
                    this.A00.A08(this.A02, r22.A0i("hash", (String) null), r22.A0i("key", (String) null), hashMap, A002, A003, AnonymousClass6R8.A01(r22.A0i("refresh", (String) null), 86400) * 1000);
                } else {
                    this.A00.A08(this.A02, (String) null, (String) null, hashMap, A002, 1, 86400000);
                }
                this.A08.Boy(new C35731jA((Object) this, 14));
            }
        }
        return true;
    }

    public C31061bD(C21100yf r1, AnonymousClass13T r2, C19970wo r3, C19630wG r4, C19420v0 r5, C21010yW r6, AnonymousClass1C4 r7, C31071bE r8, C19770wU r9) {
        this.A03 = r4;
        this.A02 = r3;
        this.A08 = r9;
        this.A05 = r6;
        this.A06 = r7;
        this.A00 = r1;
        this.A07 = r8;
        this.A04 = r5;
        this.A01 = r2;
    }
}
