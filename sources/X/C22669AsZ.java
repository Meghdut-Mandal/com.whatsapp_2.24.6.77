package X;

import java.util.Arrays;

/* renamed from: X.AsZ  reason: case insensitive filesystem */
public class C22669AsZ extends AnonymousClass121 implements B0I {
    public final byte[] A00;

    public C22669AsZ(byte[] bArr) {
        this.A00 = bArr;
    }

    public void A0D(C200179gm r3, boolean z) {
        r3.A04(this.A00, 12, z);
    }

    public boolean A0E() {
        return false;
    }

    public int hashCode() {
        return AnonymousClass124.A00(this.A00);
    }

    public String toString() {
        return BHz();
    }

    public int A0A() {
        return C165587tf.A08(this.A00);
    }

    public boolean A0F(AnonymousClass121 r3) {
        if (!(r3 instanceof C22669AsZ)) {
            return false;
        }
        return Arrays.equals(this.A00, ((C22669AsZ) r3).A00);
    }

    public String BHz() {
        byte[] bArr = this.A00;
        String str = AnonymousClass11q.A00;
        int length = bArr.length;
        char[] cArr = new char[length];
        int i = 0;
        int i2 = 0;
        loop0:
        while (true) {
            if (i < length) {
                int i3 = i + 1;
                byte b = bArr[i];
                if (b >= 0) {
                    if (i2 >= length) {
                        break;
                    }
                    cArr[i2] = (char) b;
                    i = i3;
                    i2++;
                } else {
                    short s = C190829Al.A01[b & Byte.MAX_VALUE];
                    int i4 = s >>> 8;
                    byte b2 = (byte) s;
                    while (true) {
                        if (b2 >= 0) {
                            if (i3 >= length) {
                                break loop0;
                            }
                            byte b3 = bArr[i3];
                            i4 = (i4 << 6) | (b3 & 63);
                            b2 = C190829Al.A00[b2 + ((b3 & 255) >>> 4)];
                            i3++;
                        } else if (b2 == -2) {
                            break;
                        } else {
                            if (i4 > 65535) {
                                if (i2 >= length - 1) {
                                    break;
                                }
                                int i5 = i2 + 1;
                                cArr[i2] = (char) ((i4 >>> 10) + 55232);
                                i2 = i5 + 1;
                                cArr[i5] = (char) (56320 | (i4 & 1023));
                            } else if (i2 >= length) {
                                break;
                            } else {
                                cArr[i2] = (char) i4;
                                i2++;
                            }
                            i = i3;
                        }
                    }
                }
            } else if (i2 >= 0) {
                return new String(cArr, 0, i2);
            }
        }
        throw AnonymousClass001.A08("Invalid UTF-8 input");
    }

    public C22669AsZ(String str) {
        String str2 = AnonymousClass11q.A00;
        this.A00 = AnonymousClass11q.A04(str.toCharArray());
    }
}
