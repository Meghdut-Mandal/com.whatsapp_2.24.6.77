package X;

import android.content.Context;
import android.net.Uri;

/* renamed from: X.6jM  reason: invalid class name and case insensitive filesystem */
public class C139176jM implements B39 {
    public long A00;
    public Uri A01;
    public boolean A02;
    public final B39 A03;
    public final Object A04 = C36441kJ.A11();

    public void B0p(B2E b2e) {
    }

    public /* synthetic */ void cancel() {
        throw null;
    }

    public Uri BIj() {
        Uri uri;
        synchronized (this.A04) {
            uri = this.A01;
        }
        return uri;
    }

    public long Bks(C202189lD r8) {
        long j;
        Uri uri;
        synchronized (this.A04) {
            j = r8.A03;
            this.A00 = j;
            uri = this.A01;
        }
        if (uri != null) {
            return this.A03.Bks(new C202189lD(uri, j, -1));
        }
        throw C90524aI.A0X("Uri not set");
    }

    public void close() {
        this.A03.close();
    }

    public int read(byte[] bArr, int i, int i2) {
        long j;
        Uri uri;
        Object obj = this.A04;
        synchronized (obj) {
            j = this.A00;
            if (this.A02) {
                this.A02 = false;
                uri = this.A01;
            } else {
                uri = null;
            }
        }
        if (uri != null) {
            B39 b39 = this.A03;
            b39.close();
            b39.Bks(new C202189lD(uri, j, -1));
        }
        int read = this.A03.read(bArr, i, i2);
        synchronized (obj) {
            this.A00 += (long) read;
        }
        return read;
    }

    public C139176jM(Context context, Uri uri) {
        this.A03 = new AnonymousClass83G(context);
        this.A01 = uri;
    }
}
