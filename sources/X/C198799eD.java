package X;

import android.text.TextUtils;
import android.util.Base64;
import java.io.UnsupportedEncodingException;

/* renamed from: X.9eD  reason: invalid class name and case insensitive filesystem */
public class C198799eD {
    public final C19730wQ A00;
    public final C19970wo A01;
    public final C29121Vk A02;

    public static byte[] A00(Boolean bool, Object obj, String str, String str2, byte[] bArr, Object[] objArr, long j) {
        String str3;
        Object obj2;
        if (bool == null) {
            str3 = null;
        } else if (bool.booleanValue()) {
            str3 = "PIN";
        } else {
            str3 = "BIO";
        }
        Object[] objArr2 = new Object[6];
        C90494aF.A1H(str, str3, objArr2);
        objArr2[2] = obj;
        AnonymousClass000.A1M(objArr2, 3, j);
        C36381kD.A1L(str2, bArr, objArr2);
        System.arraycopy(objArr, 0, objArr2, 6, 0);
        Object[] objArr3 = new String[6];
        for (int i = 0; i < 6; i++) {
            if (objArr2[i] == null) {
                obj2 = "";
            } else {
                boolean z = objArr2[i] instanceof String;
                obj2 = objArr2[i];
                if (z) {
                    continue;
                } else if ((obj2 instanceof Long) || (objArr2[i] instanceof Integer)) {
                    obj2 = String.valueOf(objArr2[i]);
                } else if (objArr2[i] instanceof byte[]) {
                    obj2 = Base64.encodeToString((byte[]) objArr2[i], 2);
                } else {
                    throw AnonymousClass001.A08(C24611Dc.A01("PinActions", "getPinNode: should only accept long, int, byte[], and String args"));
                }
            }
            objArr3[i] = obj2;
        }
        try {
            return TextUtils.join("|", objArr3).getBytes(C19430v1.A0B);
        } catch (UnsupportedEncodingException e) {
            C165577te.A1M("PinActions", AnonymousClass000.A0l(e, "constructPayload: UTF-8 not supported: ", AnonymousClass000.A0u()));
            throw new Error(e);
        }
    }

    public C198799eD(C19730wQ r1, C19970wo r2, C29121Vk r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
