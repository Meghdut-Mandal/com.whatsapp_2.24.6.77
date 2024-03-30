package X;

import com.whatsapp.util.Log;

/* renamed from: X.9hO  reason: invalid class name and case insensitive filesystem */
public abstract class C200429hO {
    public static void A01(C45832Sw r1, C177808eP r2, int i) {
        if (r2 != null) {
            r2.A02 = false;
        }
        if (r1 != null) {
            r1.A00 = false;
            r1.A08 = Integer.valueOf(i);
        }
    }

    public static byte[] A02(C45832Sw r4, C177808eP r5, byte[] bArr) {
        int length;
        String str;
        if (bArr == null || (length = bArr.length) == 0) {
            Log.w("MessageUtil/removePadding/ axolotl derived null or empty plaintext from message");
            return null;
        }
        byte b = bArr[length - 1] & 255;
        if (b == 0) {
            str = "MessageUtil/removePadding/ axolotl derived plaintext has invalid padding";
        } else if (b >= length) {
            str = "MessageUtil/removePadding/ axolotl derived entire plaintext as padding";
        } else {
            int i = length - b;
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            return bArr2;
        }
        Log.w(str);
        A01(r4, r5, 10);
        return null;
    }

    public static AnonymousClass8SX A00(AnonymousClass8SX r2) {
        if (!AnonymousClass000.A1P(r2.bitField0_ & 33554432)) {
            return r2;
        }
        C172958Pv r0 = r2.deviceSentMessage_;
        if (r0 == null) {
            r0 = C172958Pv.DEFAULT_INSTANCE;
        }
        AnonymousClass8SX r22 = r0.message_;
        if (r22 == null) {
            return AnonymousClass8SX.DEFAULT_INSTANCE;
        }
        return r22;
    }
}
