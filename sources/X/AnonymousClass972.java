package X;

import android.text.TextUtils;
import android.util.Base64;
import java.nio.ByteBuffer;
import java.security.SecureRandom;

/* renamed from: X.972  reason: invalid class name */
public abstract class AnonymousClass972 {
    public static String A00(C193619Me r10, String str) {
        if (TextUtils.isEmpty(str) || r10 == null) {
            return null;
        }
        byte[] bArr = new byte[24];
        new SecureRandom().nextBytes(bArr);
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(1);
        byte[] array = allocate.array();
        byte[] bytes = "cd7962b7".getBytes();
        ByteBuffer allocate2 = ByteBuffer.allocate(4);
        allocate2.putInt(r10.A02);
        byte[] array2 = allocate2.array();
        ByteBuffer allocate3 = ByteBuffer.allocate(8);
        allocate3.putLong(r10.A03);
        byte[] array3 = allocate3.array();
        byte[][] bArr2 = new byte[6][];
        bArr2[0] = bytes;
        bArr2[1] = array3;
        C90514aH.A1O(array2, array, bArr2);
        bArr2[4] = r10.A01;
        bArr2[5] = bArr;
        return Base64.encodeToString(C203239na.A05(C203239na.A05(bArr2), C200419hN.A03(C201929kj.A00(r10.A04, r10.A00), bArr, str.getBytes())), 0);
    }
}
