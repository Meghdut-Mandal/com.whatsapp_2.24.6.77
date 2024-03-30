package X;

import android.net.Uri;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class A0Y implements B5U {
    public B39 A00;
    public final B39 A01;
    public final Map A02;

    public Uri BIj() {
        return null;
    }

    public void cancel() {
    }

    public long Bks(C202189lD r16) {
        String str;
        B39 b39;
        C202189lD r3 = r16;
        Map map = this.A02;
        if (map.size() == 1) {
            Iterator A0z = AnonymousClass000.A0z(map);
            str = null;
            while (A0z.hasNext()) {
                str = AnonymousClass001.A0C(A0z);
            }
        } else {
            str = C36431kI.A1A(r3.A06, map);
        }
        if (str != null) {
            Uri fromFile = Uri.fromFile(C90524aI.A0S(str));
            long j = r3.A01;
            long j2 = r3.A03;
            long j3 = r3.A02;
            r3 = new C202189lD(fromFile, r3.A05, r3.A06, (byte[]) null, r3.A00, j, j2, j3);
            b39 = new AnonymousClass83D();
        } else {
            b39 = this.A01;
        }
        this.A00 = b39;
        return b39.Bks(r3);
    }

    public void close() {
        B39 b39 = this.A00;
        if (b39 != null) {
            b39.close();
            this.A00 = null;
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        B39 b39 = this.A00;
        if (b39 == null) {
            return -1;
        }
        return b39.read(bArr, i, i2);
    }

    public A0Y(B39 b39, Map map) {
        this.A01 = b39;
        this.A02 = map;
    }

    public void B0p(B2E b2e) {
        Objects.requireNonNull(b2e);
        this.A01.B0p(b2e);
    }
}
