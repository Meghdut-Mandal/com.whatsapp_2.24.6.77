package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.Arrays;

/* renamed from: X.9fp  reason: invalid class name and case insensitive filesystem */
public class C199709fp {
    public final C22947Ayz A00;
    public final C19970wo A01;

    public void A02(String str, String str2) {
        Log.i("ConnectionThreadRequestsImpl/on-attestation-request");
        C22947Ayz ayz = this.A00;
        Message obtain = Message.obtain((Handler) null, 0, 179, 0);
        Bundle data = obtain.getData();
        data.putString("nonce", str);
        data.putString("apiKey", str2);
        ayz.Bkm(obtain);
    }

    public void A03(DeviceJid[] deviceJidArr, int i) {
        String[] strArr;
        Log.i("ConnectionThreadRequestsImpl/on-get-pre-key-error");
        C22947Ayz ayz = this.A00;
        Bundle A07 = AnonymousClass001.A07();
        if (!A07.containsKey("jids")) {
            if (deviceJidArr != null) {
                strArr = AnonymousClass143.A0O(Arrays.asList(deviceJidArr));
            } else {
                strArr = null;
            }
            A07.putStringArray("jids", strArr);
            A07.putInt("errorCode", i);
            C165577te.A18(ayz, A07, 76);
            return;
        }
        throw AnonymousClass000.A0c(" already used", AnonymousClass000.A0v("jids"));
    }

    public C199709fp(C19970wo r1, C22947Ayz ayz) {
        this.A00 = ayz;
        this.A01 = r1;
    }

    public static void A00(int i) {
        C36321k7.A1T("ConnectionThreadRequestsImpl/on-qr-sync-error ", AnonymousClass000.A0u(), i);
    }

    public void A01(C203399nx r5, C207209uj r6, int i) {
        C36321k7.A1T("ConnectionThreadRequestsImpl/on-xmpp-recv type=", AnonymousClass000.A0u(), i);
        C22947Ayz ayz = this.A00;
        Message obtain = Message.obtain((Handler) null, 0, i, 0, r5);
        if (r6 != null) {
            obtain.getData().putParcelable("stanzaKey", r6);
        }
        ayz.Bkm(obtain);
    }
}
