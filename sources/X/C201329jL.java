package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;

/* renamed from: X.9jL  reason: invalid class name and case insensitive filesystem */
public class C201329jL {
    public C201329jL A00;
    public byte[] A01;
    public final String A02;

    public final int A02(C203329nn r4) {
        int i = 0;
        for (C201329jL r1 = this; r1 != null; r1 = r1.A00) {
            r4.A08(r1.A02);
            i += r1.A01.length + 6;
        }
        return i;
    }

    public final void A03(C201639k2 r5, C203329nn r6) {
        for (C201329jL r3 = this; r3 != null; r3 = r3.A00) {
            byte[] bArr = r3.A01;
            int length = bArr.length;
            C201639k2.A00(r3.A02, r5, r6);
            r5.A06(length);
            r5.A0C(bArr, 0, length);
        }
    }

    public static int A00(C203329nn r2, int i, int i2) {
        int i3;
        if ((i & ZipDecompressor.UNZIP_BUFFER_SIZE) == 0 || r2.A03 >= 49) {
            i3 = 0;
        } else {
            r2.A08("Synthetic");
            i3 = 6;
        }
        if (i2 != 0) {
            r2.A08("Signature");
            i3 += 8;
        }
        if ((i & C132986Wc.A0F) == 0) {
            return i3;
        }
        r2.A08("Deprecated");
        return i3 + 6;
    }

    public static void A01(C201639k2 r3, C203329nn r4, int i, int i2) {
        if ((i & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0 && r4.A03 < 49) {
            C201639k2.A00("Synthetic", r3, r4);
            r3.A06(0);
        }
        if (i2 != 0) {
            C201639k2.A00("Signature", r3, r4);
            r3.A06(2);
            r3.A07(i2);
        }
        if ((i & C132986Wc.A0F) != 0) {
            C201639k2.A00("Deprecated", r3, r4);
            r3.A06(0);
        }
    }

    public C201329jL(String str) {
        this.A02 = str;
    }
}
