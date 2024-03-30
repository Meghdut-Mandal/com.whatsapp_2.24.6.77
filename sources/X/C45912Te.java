package X;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.File;

/* renamed from: X.2Te  reason: invalid class name and case insensitive filesystem */
public final class C45912Te extends C74833mF {
    public final long A00;

    public C45912Te(AnonymousClass2bU r7, File file, long j, long j2) {
        super(Uri.fromFile(file), r7, file, j);
        this.A00 = j2;
    }

    public Bitmap Bvb(int i) {
        return C25541Gs.A01(this.A03);
    }

    public String BEF() {
        return "video/*";
    }

    public int getType() {
        return 1;
    }
}
