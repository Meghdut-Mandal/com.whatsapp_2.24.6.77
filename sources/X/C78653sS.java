package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;

/* renamed from: X.3sS  reason: invalid class name and case insensitive filesystem */
public final class C78653sS implements C17820s5 {
    public final AnonymousClass005 A00;

    public C78653sS(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public void BmI(AnonymousClass3T1 r3, C52942qQ r4) {
        AnonymousClass00C.A0D(r3, 0);
        if (AnonymousClass000.A1S(r3.A0A & ZipDecompressor.UNZIP_BUFFER_SIZE, ZipDecompressor.UNZIP_BUFFER_SIZE)) {
            ((AnonymousClass1TV) this.A00.get()).A02(r3);
            if (r4 != null) {
                throw C36321k7.A04(C78653sS.class);
            }
        }
    }
}
