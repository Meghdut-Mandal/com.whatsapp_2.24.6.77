package X;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.File;

/* renamed from: X.2Tf  reason: invalid class name and case insensitive filesystem */
public final class C45922Tf extends C74833mF {
    public final long A00;
    public final AnonymousClass1SV A01;
    public final String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45922Tf(C46972by r7, AnonymousClass1SV r8, File file, String str, long j, long j2) {
        super(Uri.fromFile(file), r7, file, j);
        AnonymousClass00C.A0D(r8, 1);
        this.A01 = r8;
        this.A00 = j2;
        this.A02 = str == null ? "application/*" : str;
    }

    public Bitmap Bvb(int i) {
        AnonymousClass2bU r1 = this.A02;
        if (!(r1 instanceof C46972by)) {
            return null;
        }
        AnonymousClass1SV r0 = this.A01;
        AnonymousClass00C.A07(r1);
        return r0.A0A(r1);
    }

    public String BEF() {
        return this.A02;
    }

    public int getType() {
        return 4;
    }
}
