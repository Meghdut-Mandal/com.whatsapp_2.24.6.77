package X;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* renamed from: X.0LQ  reason: invalid class name */
public abstract class AnonymousClass0LQ extends AnonymousClass0MQ {
    public final int A00;

    public abstract byte[] A03();

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C17390rG)) {
            try {
                AnonymousClass0LQ r5 = (AnonymousClass0LQ) ((C17390rG) obj);
                if (r5.A00 == this.A00) {
                    return Arrays.equals(A03(), (byte[]) new AnonymousClass0LR(r5.A03()).A00);
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.A00;
    }

    public static byte[] A00(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public AnonymousClass0LQ(byte[] bArr) {
        AnonymousClass006.A06(AnonymousClass000.A1S(bArr.length, 25));
        this.A00 = Arrays.hashCode(bArr);
    }
}
