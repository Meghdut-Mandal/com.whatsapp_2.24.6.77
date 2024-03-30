package X;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;

/* renamed from: X.83C  reason: invalid class name */
public final class AnonymousClass83C extends A0K implements B39 {
    public int A00;
    public C202189lD A01;
    public byte[] A02;

    public AnonymousClass83C() {
        super(false);
    }

    public Uri BIj() {
        C202189lD r0 = this.A01;
        if (r0 != null) {
            return r0.A04;
        }
        return null;
    }

    public void close() {
        if (this.A02 != null) {
            this.A02 = null;
            A01();
        }
        this.A01 = null;
    }

    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        byte[] bArr2 = this.A02;
        int length = bArr2.length;
        int i3 = this.A00;
        int i4 = length - i3;
        if (i4 == 0) {
            return -1;
        }
        int min = Math.min(i2, i4);
        System.arraycopy(bArr2, i3, bArr, i, min);
        this.A00 += min;
        A03(min);
        return min;
    }

    public long Bks(C202189lD r6) {
        A02();
        this.A01 = r6;
        Uri uri = r6.A04;
        String scheme = uri.getScheme();
        if ("data".equals(scheme)) {
            String[] split = uri.getSchemeSpecificPart().split(",");
            if (split.length <= 2) {
                String str = split[1];
                if (split[0].contains(";base64")) {
                    try {
                        this.A02 = Base64.decode(str, 0);
                    } catch (IllegalArgumentException e) {
                        throw new C187398xn(AnonymousClass000.A0p("Error while parsing Base64 encoded string: ", str, AnonymousClass000.A0u()), e);
                    }
                } else {
                    this.A02 = URLDecoder.decode(str, "US-ASCII").getBytes();
                }
                A04(r6);
                return (long) this.A02.length;
            }
            throw C187398xn.A00(AnonymousClass000.A0l(uri, "Unexpected URI format: ", AnonymousClass000.A0u()));
        }
        throw C187398xn.A00(AnonymousClass000.A0p("Unsupported scheme: ", scheme, AnonymousClass000.A0u()));
    }
}
