package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.9Xg  reason: invalid class name and case insensitive filesystem */
public abstract class C196019Xg {
    public void A04(Exception exc) {
    }

    public void A01(int i) {
        C22947Ayz ayz;
        Message message;
        Handler handler;
        int i2;
        int i3;
        C22947Ayz ayz2;
        Handler handler2;
        int i4;
        int i5;
        if (this instanceof B7S) {
            B7S b7s = (B7S) this;
            switch (b7s.A02) {
                case 1:
                    ((C200139gg) b7s.A00).A06.A03((DeviceJid[]) b7s.A01, i);
                    return;
                case 2:
                    C199709fp r1 = ((C200139gg) b7s.A00).A06;
                    Log.i("ConnectionThreadRequestsImpl/client_config_error");
                    ayz = r1.A00;
                    handler = null;
                    i2 = 0;
                    i3 = 27;
                    break;
                default:
                    return;
            }
        } else if (this instanceof B7R) {
            B7R b7r = (B7R) this;
            switch (b7r.A01) {
                case 3:
                    if (i == 404) {
                        C199709fp r12 = ((C200139gg) b7r.A00).A06;
                        Log.i("ConnectionThreadRequestsImpl/on-get-pre-key-digest-none");
                        ayz2 = r12.A00;
                        handler2 = null;
                        i4 = 0;
                        i5 = 83;
                    } else if (i == 503) {
                        C199709fp r13 = ((C200139gg) b7r.A00).A06;
                        Log.i("ConnectionThreadRequestsImpl/on-get-pre-key-digest-server-error");
                        ayz2 = r13.A00;
                        handler2 = null;
                        i4 = 0;
                        i5 = 84;
                    } else {
                        return;
                    }
                    message = Message.obtain(handler2, i4, i5, i4);
                    break;
                case 4:
                    C36321k7.A1S("ConnectionWriter/sendClearFbnsToken/failed to clear code=", AnonymousClass000.A0u(), i);
                    return;
                case 5:
                    C199709fp r2 = ((C200139gg) b7r.A00).A06;
                    C36321k7.A1T("ConnectionThreadRequestsImpl/on-number-normalization-error=", AnonymousClass000.A0u(), i);
                    ayz = r2.A00;
                    handler = null;
                    i2 = 0;
                    i3 = 199;
                    break;
                case 6:
                    C36321k7.A1U("ConnectionWriter/change number failed; code=", AnonymousClass000.A0u(), i);
                    C199709fp r22 = ((C200139gg) b7r.A00).A06;
                    C36321k7.A1T("ConnectionThreadRequestsImpl/on-change-number-error=", AnonymousClass000.A0u(), i);
                    ayz = r22.A00;
                    handler = null;
                    i2 = 0;
                    i3 = 201;
                    break;
                default:
                    return;
            }
        } else {
            return;
        }
        message = Message.obtain(handler, i2, i3, i);
        ayz.Bkm(message);
    }

    public void A02(C203399nx r6) {
        Iterator A08 = C203399nx.A08(r6, "error");
        while (A08.hasNext()) {
            C203399nx A0s = C36431kI.A0s(A08);
            if (A0s != null) {
                String A0i = A0s.A0i("code", (String) null);
                A0s.A0i("text", (String) null);
                if (A0i != null) {
                    A01(Integer.parseInt(A0i));
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [byte[][], java.io.Serializable] */
    public void A03(C203399nx r17) {
        C22947Ayz ayz;
        Message obtain;
        int i;
        if (this instanceof C180878mZ) {
            C180878mZ r4 = (C180878mZ) this;
            C199709fp r2 = r4.A00.A06;
            boolean z = r4.A01;
            C36321k7.A1X("ConnectionThreadRequestsImpl/connectionactive/set ", AnonymousClass000.A0u(), z);
            C165577te.A18(r2.A00, Boolean.valueOf(z), 87);
            return;
        }
        B7R b7r = (B7R) this;
        C203399nx r1 = r17;
        switch (b7r.A01) {
            case 0:
                C203399nx.A0A(r1.A0b(0), "remove");
                C199709fp r12 = ((C200139gg) b7r.A00).A06;
                Log.i("ConnectionThreadRequestsImpl/removeaccount");
                ayz = r12.A00;
                obtain = Message.obtain((Handler) null, 0, 12, 0);
                break;
            case 1:
                return;
            case 2:
                C203399nx A0c = r1.A0c("props");
                if (A0c != null) {
                    C199709fp r13 = ((C200139gg) b7r.A00).A06;
                    Log.i("ConnectionThreadRequestsImpl/server-props");
                    ayz = r13.A00;
                    obtain = Message.obtain((Handler) null, 0, 174, 0, A0c);
                    break;
                } else {
                    return;
                }
            case 3:
                C203399nx A0d = r1.A0d("digest");
                C203399nx A0d2 = A0d.A0d("registration");
                C203399nx A0d3 = A0d.A0d(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                C203399nx A0d4 = A0d.A0d("skey").A0d(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                C203399nx A0d5 = A0d.A0d("list");
                C203399nx A0d6 = A0d.A0d("hash");
                C203399nx[] r14 = A0d5.A02;
                if (r14 != null) {
                    i = r14.length;
                } else {
                    i = 0;
                }
                ? r7 = new byte[i][];
                for (int i2 = 0; i2 < i; i2++) {
                    C203399nx.A0A(r14[i2], PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    r7[i2] = C203399nx.A0K(r14[i2], 3);
                }
                C199709fp r22 = ((C200139gg) b7r.A00).A06;
                byte[] A0K = C203399nx.A0K(A0d2, 4);
                byte b = C203399nx.A0K(A0d3, 1)[0];
                byte[] A0K2 = C203399nx.A0K(A0d4, 3);
                byte[] A0K3 = C203399nx.A0K(A0d6, 20);
                Log.i("ConnectionThreadRequestsImpl/on-get-pre-key-digest");
                ayz = r22.A00;
                Bundle A07 = AnonymousClass001.A07();
                A07.putByteArray("registration", A0K);
                A07.putByte(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, b);
                A07.putByteArray("signedKeyId", A0K2);
                A07.putSerializable("keyIds", r7);
                A07.putByteArray("hash", A0K3);
                obtain = Message.obtain((Handler) null, 0, 82, 0, A07);
                break;
            case 4:
                Log.i("ConnectionWriter/Connection/sendClearFbnsToken/successfully cleared");
                return;
            case 5:
                C203399nx A0b = r1.A0b(0);
                C203399nx.A0A(A0b, "normalize");
                String A0i = A0b.A0i("result", (String) null);
                C199709fp r23 = ((C200139gg) b7r.A00).A06;
                C36321k7.A1Q("ConnectionThreadRequestsImpl/on-number-normalized=", A0i, AnonymousClass000.A0u());
                C165577te.A18(r23.A00, A0i, 198);
                return;
            default:
                Log.i("ConnectionWriter/change number succeeded");
                C203399nx.A0A(r1.A0b(0), "modify");
                C199709fp r15 = ((C200139gg) b7r.A00).A06;
                Log.i("ConnectionThreadRequestsImpl/on-change-number-success");
                ayz = r15.A00;
                obtain = Message.obtain((Handler) null, 0, 200, 0);
                break;
        }
        ayz.Bkm(obtain);
    }
}
