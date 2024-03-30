package X;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* renamed from: X.1GT  reason: invalid class name */
public class AnonymousClass1GT {
    public static final byte[] A04 = {87, 65, 77, 5, 1, 0, 0, 2};
    public int A00 = 0;
    public byte[] A01 = new byte[0];
    public final HashMap A02 = new HashMap();
    public final LinkedHashSet A03 = new LinkedHashSet();

    public void A00(String str, byte[] bArr, int i) {
        HashMap hashMap = this.A02;
        OutputStream outputStream = (OutputStream) hashMap.get(str);
        if (outputStream == null) {
            outputStream = new ByteArrayOutputStream(16384);
            byte[] bArr2 = A04;
            bArr2[5] = (byte) 231;
            bArr2[6] = (byte) 3;
            outputStream.write(bArr2, 0, 8);
            int i2 = this.A00;
            if (i2 > 0) {
                outputStream.write(this.A01, 0, i2);
            }
            hashMap.put(str, outputStream);
            this.A03.add(str);
        }
        outputStream.write(bArr, 0, i);
    }
}
