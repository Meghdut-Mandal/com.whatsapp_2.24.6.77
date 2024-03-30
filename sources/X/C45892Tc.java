package X;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.File;

/* renamed from: X.2Tc  reason: invalid class name and case insensitive filesystem */
public final class C45892Tc extends C74833mF {
    public final long A00;

    public C45892Tc(AnonymousClass2bU r7, File file, long j, long j2) {
        super(Uri.fromFile(file), r7, file, j);
        this.A00 = j2;
    }

    public Bitmap Bvb(int i) {
        return null;
    }

    public String BEF() {
        return "audio/*";
    }

    public int getType() {
        return 3;
    }
}
