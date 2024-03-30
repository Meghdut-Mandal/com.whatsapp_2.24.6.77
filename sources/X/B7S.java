package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.SparseArray;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class B7S extends C196019Xg {
    public Object A00;
    public Object A01;
    public final int A02;

    public B7S(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public void A02(C203399nx r9) {
        if (this.A02 != 0) {
            super.A02(r9);
            return;
        }
        int A002 = AnonymousClass3ME.A00(r9);
        if (A002 == 207) {
            Iterator A08 = C203399nx.A08(r9, "error");
            while (A08.hasNext()) {
                Iterator A082 = C203399nx.A08(C36431kI.A0s(A08), "error");
                while (A082.hasNext()) {
                    C203399nx A0s = C36431kI.A0s(A082);
                    String A0i = A0s.A0i("code", (String) null);
                    String A0i2 = A0s.A0i("text", (String) null);
                    if (A0i != null) {
                        int A003 = AnonymousClass6R8.A00(A0i, 0);
                        C199709fp r1 = ((C200139gg) this.A00).A06;
                        Log.i("ConnectionThreadRequestsImpl/on-set-pre-key-error");
                        C22947Ayz ayz = r1.A00;
                        Bundle A07 = AnonymousClass001.A07();
                        A07.putInt("errorCode", A003);
                        A07.putString("errorText", A0i2);
                        C165577te.A18(ayz, A07, 196);
                    }
                }
            }
            return;
        }
        C199709fp r12 = ((C200139gg) this.A00).A06;
        Log.i("ConnectionThreadRequestsImpl/on-set-pre-key-error");
        C22947Ayz ayz2 = r12.A00;
        Bundle A072 = AnonymousClass001.A07();
        A072.putInt("errorCode", A002);
        C165577te.A18(ayz2, A072, 78);
    }

    public void A03(C203399nx r30) {
        byte b;
        byte[] bArr;
        C121865tq r16;
        C203399nx r5 = r30;
        switch (this.A02) {
            case 0:
                C199709fp r1 = ((C200139gg) this.A00).A06;
                Log.i("ConnectionThreadRequestsImpl/on-set-pre-key-success");
                r1.A00.Bkm(Message.obtain((Handler) null, 0, 77, 0));
                return;
            case 1:
                C203399nx A0d = r5.A0d("list");
                DeviceJid[] deviceJidArr = (DeviceJid[]) this.A01;
                int length = deviceJidArr.length;
                HashSet hashSet = new HashSet(length);
                HashMap hashMap = new HashMap(length);
                C203399nx[] r10 = A0d.A02;
                int i = 0;
                if (r10 != null) {
                    Arrays.sort(r10, AnonymousClass76C.A00);
                    ArrayList A0I = AnonymousClass001.A0I();
                    int length2 = r10.length;
                    int i2 = 0;
                    while (i2 < length2) {
                        C203399nx r8 = r10[i2];
                        DeviceJid deviceJid = (DeviceJid) r8.A0Y(DeviceJid.class, "jid");
                        C203399nx A0c = r8.A0c("error");
                        if (A0c != null) {
                            int A002 = C203399nx.A00(A0c, "code");
                            hashSet.add(deviceJid);
                            C36341k9.A1K(deviceJid, hashMap, A002);
                        } else {
                            C203399nx A0d2 = r8.A0d("identity");
                            C203399nx A0c2 = r8.A0c("device-identity");
                            C203399nx A0d3 = r8.A0d("registration");
                            C203399nx A0c3 = r8.A0c(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                            if (A0c3 == null) {
                                b = 5;
                            } else {
                                byte[] bArr2 = A0c3.A01;
                                if (bArr2 == null || bArr2.length != 1) {
                                    throw C165617ti.A0Q("type node should contain exactly 1 byte");
                                }
                                b = bArr2[i];
                            }
                            C203399nx A0c4 = r8.A0c("key");
                            if (A0c4 != null) {
                                bArr = null;
                                r16 = new C121865tq(A0c4.A0d(PublicKeyCredentialControllerUtility.JSON_KEY_ID).A01, A0c4.A0d("value").A01, (byte[]) null);
                            } else {
                                bArr = null;
                                r16 = null;
                            }
                            C203399nx A0d4 = r8.A0d("skey");
                            C203399nx A0d5 = A0d4.A0d(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                            C203399nx A0d6 = A0d4.A0d("value");
                            C203399nx A0d7 = A0d4.A0d(PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE);
                            byte[] bArr3 = A0d2.A01;
                            byte[] bArr4 = A0d3.A01;
                            if (A0c2 != null) {
                                bArr = A0c2.A01;
                            }
                            A0I.add(new C124295xu(deviceJid, r16, new C121865tq(A0d5.A01, A0d6.A01, A0d7.A01), bArr3, bArr4, bArr, b));
                            hashSet.add(deviceJid);
                        }
                        i2++;
                        i = 0;
                    }
                    if (!A0I.isEmpty()) {
                        C199709fp r3 = ((C200139gg) this.A00).A06;
                        Log.i("ConnectionThreadRequestsImpl/on-get-pre-key-success");
                        C165577te.A18(r3.A00, A0I, 74);
                    }
                }
                SparseArray sparseArray = new SparseArray();
                while (i < length) {
                    DeviceJid deviceJid2 = deviceJidArr[i];
                    if (!hashSet.contains(deviceJid2)) {
                        C199709fp r32 = ((C200139gg) this.A00).A06;
                        Log.i("ConnectionThreadRequestsImpl/on-get-pre-key-none");
                        C22947Ayz ayz = r32.A00;
                        Bundle A07 = AnonymousClass001.A07();
                        C1900296p.A00(A07, deviceJid2, "jid");
                        C165577te.A18(ayz, A07, 75);
                    }
                    if (hashMap.containsKey(deviceJid2)) {
                        int A0I2 = AnonymousClass000.A0I(hashMap.get(deviceJid2));
                        List list = (List) sparseArray.get(A0I2);
                        if (list != null) {
                            list.add(deviceJid2);
                        } else {
                            sparseArray.put(A0I2, C90484aE.A0r(deviceJid2));
                        }
                    }
                    i++;
                }
                int size = sparseArray.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((C200139gg) this.A00).A06.A03((DeviceJid[]) ((List) sparseArray.valueAt(i3)).toArray(new DeviceJid[0]), sparseArray.keyAt(i3));
                }
                return;
            default:
                C203539oF.A0C(r5, C23213B9v.A00(C90514aH.A0e(r5, (C592133b) this.A01), 47));
                String[] strArr = {null};
                String[] strArr2 = {null};
                String[] strArr3 = {null};
                String[] strArr4 = {null};
                String[] strArr5 = {null};
                String[] strArr6 = {null};
                String[] strArr7 = {null};
                Iterator it = C203539oF.A09(r5, ARF.A00, new String[]{"config"}, 0, 2).iterator();
                while (it.hasNext()) {
                    ((B0A) ((C184078rr) it.next()).A00).B06(new C198169d1(this, strArr, strArr4, strArr2, strArr3, strArr5, strArr6, strArr7));
                }
                C199709fp r12 = ((C200139gg) this.A00).A06;
                String str = strArr[0];
                String str2 = strArr2[0];
                String str3 = strArr3[0];
                String str4 = strArr4[0];
                String str5 = strArr5[0];
                String str6 = strArr6[0];
                String str7 = strArr7[0];
                Log.i("ConnectionThreadRequestsImpl/client_config");
                C22947Ayz ayz2 = r12.A00;
                Bundle A072 = AnonymousClass001.A07();
                A072.putString("gcmToken", str);
                A072.putString("fbnsToken", str2);
                A072.putString("mutedChatsHash", str3);
                A072.putString("appMuteConfig", str4);
                A072.putString("num_acc", str5);
                A072.putString("pkey", str6);
                A072.putString("voip_payload_type", str7);
                C165577te.A18(ayz2, A072, 6);
                return;
        }
    }
}
