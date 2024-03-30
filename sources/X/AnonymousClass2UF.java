package X;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.File;

/* renamed from: X.2UF  reason: invalid class name */
public final class AnonymousClass2UF extends C74823mE {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2UF(Uri uri, C21050ya r3, String str, String str2, long j, long j2, long j3) {
        super(uri, r3, str, str2, j, j2, j3);
        AnonymousClass00C.A0D(uri, 3);
    }

    public Bitmap Bvb(int i) {
        File file;
        String str = this.A03;
        if (str == null) {
            file = null;
        } else {
            file = new File(str);
        }
        return C25541Gs.A01(file);
    }

    public int getType() {
        return 2;
    }
}
