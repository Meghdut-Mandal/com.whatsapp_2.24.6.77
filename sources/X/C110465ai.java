package X;

import com.whatsapp.util.Log;

/* renamed from: X.5ai  reason: invalid class name and case insensitive filesystem */
public abstract class C110465ai {
    public static final int A00(AnonymousClass3L0 r4) {
        if (r4 != null) {
            int i = r4.A01;
            boolean A01 = r4.A01();
            if (i == 2) {
                if (A01) {
                    return 4;
                }
                Log.w("NFMWamUtils/getBizPlatform: unexpected combination of isCloudApi and isEnterprise results");
            } else if (A01) {
                return 3;
            } else {
                if (r4.A02()) {
                    return 2;
                }
            }
        }
        return 1;
    }
}
