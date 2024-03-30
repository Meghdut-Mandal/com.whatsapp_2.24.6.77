package X;

import android.net.Uri;
import java.io.File;

/* renamed from: X.3mF  reason: invalid class name and case insensitive filesystem */
public abstract class C74833mF implements AnonymousClass4V2 {
    public Long A00;
    public final Uri A01;
    public final AnonymousClass2bU A02;
    public final File A03;
    public final long A04;

    public /* synthetic */ long BBF() {
        if (this instanceof C45912Te) {
            return ((C45912Te) this).A00;
        }
        if (this instanceof C45902Td) {
            return ((C45902Td) this).A00;
        }
        if (this instanceof C45922Tf) {
            return ((C45922Tf) this).A00;
        }
        if (this instanceof C45892Tc) {
            return ((C45892Tc) this).A00;
        }
        return 0;
    }

    public final long getContentLength() {
        long j;
        Long l = this.A00;
        if (l == null) {
            File file = this.A03;
            if (file != null) {
                j = file.length();
            } else {
                j = 0;
            }
            l = Long.valueOf(j);
            this.A00 = l;
        }
        return l.longValue();
    }

    public C74833mF(Uri uri, AnonymousClass2bU r2, File file, long j) {
        this.A03 = file;
        this.A01 = uri;
        this.A04 = j;
        this.A02 = r2;
    }

    public final Uri B7k() {
        return this.A01;
    }

    public final long BAn() {
        return this.A04;
    }
}
