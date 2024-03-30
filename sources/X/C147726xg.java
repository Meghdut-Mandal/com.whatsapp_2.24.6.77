package X;

import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6xg  reason: invalid class name and case insensitive filesystem */
public class C147726xg implements C236119d {
    public final AnonymousClass19A A00;
    public final Map A01;
    public final C19700wN A02;
    public final C1259161v A03;

    public void BVN(String str) {
        C1259161v r1 = this.A03;
        Log.w("FetchPrekeyForMissingDeviceManager/requestPrekeyForMissingDevice delivery failure");
        r1.A01.BVO(C36381kD.A0j());
    }

    public C147726xg(C19700wN r1, C1259161v r2, AnonymousClass19A r3, Map map) {
        this.A02 = r1;
        this.A00 = r3;
        this.A01 = map;
        this.A03 = r2;
    }

    public void BWw(C203399nx r6, String str) {
        Pair A012 = AnonymousClass3ME.A01(r6);
        C1259161v r4 = this.A03;
        if (A012 != null) {
            int A04 = C36381kD.A04(A012);
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("FetchPrekeyForMissingDeviceManager/requestPrekeyForMissingDevice error=");
            A0u.append(A04);
            C36321k7.A1R("; text=", (String) A012.second, A0u);
            r4.A01.BVO(C36381kD.A0j());
            return;
        }
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("FetchPrekeyForMissingDeviceManager/requestPrekeyForMissingDevice error=");
        A0u2.append(0);
        C36321k7.A1R("; text=", (String) null, A0u2);
        r4.A01.BVO(C36381kD.A0j());
    }

    public void BiM(C203399nx r28, String str) {
        C203399nx[] r12;
        byte b;
        C121865tq r0;
        HashMap A0J = AnonymousClass001.A0J();
        ArrayList A0I = AnonymousClass001.A0I();
        C203399nx A0c = r28.A0c("list");
        if (!(A0c == null || (r12 = A0c.A02) == null)) {
            for (C203399nx r2 : r12) {
                UserJid userJid = (UserJid) r2.A0X(UserJid.class, "jid");
                if (userJid != null) {
                    C203399nx A0c2 = r2.A0c("error");
                    if (A0c2 != null) {
                        C36341k9.A1K(userJid, A0J, A0c2.A0R("code"));
                    } else {
                        C203399nx[] r9 = r2.A02;
                        if (r9 != null) {
                            Arrays.sort(r9, C1506075x.A00);
                            for (C203399nx r7 : r9) {
                                byte[] bArr = null;
                                try {
                                    DeviceJid A012 = DeviceJid.Companion.A01(userJid, r7.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID));
                                    C203399nx A0d = r7.A0d("identity");
                                    C203399nx A0c3 = r7.A0c("device-identity");
                                    C203399nx A0d2 = r7.A0d("registration");
                                    C203399nx A0c4 = r7.A0c(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                                    if (A0c4 == null) {
                                        b = 5;
                                    } else {
                                        byte[] bArr2 = A0c4.A01;
                                        if (bArr2 == null || bArr2.length != 1) {
                                            throw new C235919b("type node should contain exactly 1 byte");
                                        }
                                        b = bArr2[0];
                                    }
                                    C203399nx A0c5 = r7.A0c("key");
                                    if (A0c5 != null) {
                                        r0 = new C121865tq(A0c5.A0d(PublicKeyCredentialControllerUtility.JSON_KEY_ID).A01, A0c5.A0d("value").A01, (byte[]) null);
                                    } else {
                                        r0 = null;
                                    }
                                    C203399nx A0d3 = r7.A0d("skey");
                                    C203399nx A0d4 = A0d3.A0d(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                                    C203399nx A0d5 = A0d3.A0d("value");
                                    C203399nx A0d6 = A0d3.A0d(PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE);
                                    byte[] bArr3 = A0d.A01;
                                    byte[] bArr4 = A0d2.A01;
                                    if (A0c3 != null) {
                                        bArr = A0c3.A01;
                                    }
                                    A0I.add(new C124295xu(A012, r0, new C121865tq(A0d4.A01, A0d5.A01, A0d6.A01), bArr3, bArr4, bArr, b));
                                } catch (C19740wR unused) {
                                }
                            }
                            continue;
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        C1259161v r4 = this.A03;
        A0I.size();
        if (!A0I.isEmpty()) {
            C124185xj r1 = r4.A00;
            if (r1.A01.A0X()) {
                r1.A06.Boy(new C1502474n(r4, A0I, r4.A01, 43));
            } else {
                r1.A02.A00.execute(new C1502474n(r4, A0I, r4.A01, 44));
            }
        } else {
            r4.A01.BVO(C36371kC.A0m());
        }
        Iterator A10 = C36371kC.A10(A0J);
        while (A10.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A10);
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("FetchPrekeyForMissingDeviceManager/onSuccess error jid=");
            A0u.append(A11.getKey());
            A0u.append("; code=");
            C36331k8.A1P(A11.getValue(), A0u);
        }
    }
}
