package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.9o1  reason: invalid class name and case insensitive filesystem */
public abstract class C203439o1 {
    public static int A00(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        return A02(bArr);
    }

    public static int A01(byte[] bArr) {
        return (bArr[2] & 255) | C165597tg.A08(bArr, 1, 0 | ((bArr[0] & 255) << 16));
    }

    public static boolean A06(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null || (length = bArr.length) != bArr2.length) {
            return false;
        }
        boolean z = true;
        for (int i = 0; i < length; i++) {
            z &= AnonymousClass000.A1S(bArr[i], bArr2[i]);
        }
        return z;
    }

    public static byte[] A0C(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        byte[] bArr2 = new byte[A02(bArr)];
        byteBuffer.get(bArr2);
        return bArr2;
    }

    public static int A02(byte[] bArr) {
        if (bArr == null || bArr.length != 2) {
            throw C165567td.A0E("Invalid argument. Byte array is null or length != 2", (byte) 80);
        }
        return (bArr[1] & 255) | 0 | ((bArr[0] & 255) << 8);
    }

    public static long A03(byte[] bArr) {
        if (bArr != null && bArr.length == 4) {
            return (((long) (bArr[0] & 255)) << 24) | (((long) (bArr[1] & 255)) << 16) | (((long) (bArr[2] & 255)) << 8) | ((long) (bArr[3] & 255));
        }
        throw C165567td.A0E("Invalid argument. byte array is null or length != 4", (byte) 80);
    }

    public static String A04(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        Formatter formatter = new Formatter();
        for (byte valueOf : bArr) {
            Object[] A0L = AnonymousClass001.A0L();
            A0L[0] = Byte.valueOf(valueOf);
            formatter.format("%02x ", A0L);
        }
        return formatter.toString();
    }

    public static byte[] A07(int i) {
        if (i < 0 || i >= 16777216) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Invalid argument. The supplied int value = ");
            A0u.append(i);
            A0u.append(" does not fit in 3 bytes.");
            throw C165567td.A0D(A0u, (byte) 80);
        }
        byte[] bArr = new byte[3];
        C165597tg.A1N(bArr, i >>> 16, 0);
        C165597tg.A1N(bArr, i >>> 8, 1);
        C165597tg.A1N(bArr, i, 2);
        return bArr;
    }

    public static byte[] A08(int i) {
        if (i < 0 || i >= 65536) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Invalid argument. The supplied int value = ");
            A0u.append(i);
            A0u.append(" does not fit in 2 bytes.");
            throw C165567td.A0D(A0u, (byte) 80);
        }
        byte[] bArr = new byte[2];
        C165597tg.A1N(bArr, i >>> 8, 0);
        C165597tg.A1N(bArr, i, 1);
        return bArr;
    }

    public static byte[] A0A(String str, byte[] bArr, int i) {
        if (bArr != null) {
            int length = bArr.length;
            try {
                byte[] bytes = AnonymousClass000.A0p("tls13 ", str, AnonymousClass000.A0u()).getBytes(DefaultCrypto.UTF_8);
                int length2 = bytes.length;
                ByteBuffer allocate = ByteBuffer.allocate(length2 + 1 + 2 + length + 1);
                A05(i, allocate);
                short s = (short) length2;
                if (s < 0 || s >= 256) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("Invalid argument. Short val = ");
                    A0u.append(s);
                    A0u.append(" cannot fit in single byte");
                    throw C165567td.A0D(A0u, (byte) 80);
                }
                allocate.put((byte) (s & 255));
                allocate.put(bytes);
                allocate.put((byte) length);
                allocate.put(bArr);
                return allocate.array();
            } catch (UnsupportedEncodingException e) {
                throw C165577te.A0W(e);
            }
        } else {
            throw C165567td.A0E("Context cannot be null when generating info", (byte) 80);
        }
    }

    public static byte[] A0B(String str, byte[] bArr, byte[] bArr2) {
        try {
            String replace = str.replace("-", "");
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, C36321k7.A0D("Hmac", replace));
            Mac instance = Mac.getInstance(C36321k7.A0D("Hmac", replace));
            instance.init(secretKeySpec);
            return instance.doFinal(bArr2);
        } catch (NoSuchAlgorithmException e) {
            throw C165577te.A0V(AnonymousClass000.A0q(" not found", C36331k8.A0k("Hmac", str)), e, (byte) 80);
        } catch (InvalidKeyException e2) {
            throw C165577te.A0V("Invalid key", e2, (byte) 80);
        }
    }

    public static void A05(int i, ByteBuffer byteBuffer) {
        byteBuffer.put(A08(i));
    }

    public static byte[] A09(String str, String str2, int i) {
        StringBuilder A0v = AnonymousClass000.A0v(str);
        A0v.append("#");
        A0v.append(i);
        try {
            return AnonymousClass000.A0p("#", str2, A0v).getBytes(DefaultCrypto.UTF_8);
        } catch (UnsupportedEncodingException e) {
            throw C165577te.A0W(e);
        }
    }
}
