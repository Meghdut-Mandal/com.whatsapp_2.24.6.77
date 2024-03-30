package X;

import android.content.ContentUris;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.provider.MediaStore;

/* renamed from: X.3mL  reason: invalid class name and case insensitive filesystem */
public class C74893mL implements AnonymousClass4TB {
    public final long A00;
    public final /* synthetic */ C65803Tn A01;

    public Bitmap BOD() {
        C37001le r4;
        byte[] bArr = null;
        try {
            r4 = new C37001le();
            r4.setDataSource(this.A01.A0C.getApplicationContext(), ContentUris.withAppendedId(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, this.A00));
            bArr = r4.getEmbeddedPicture();
            r4.close();
        } catch (Exception | OutOfMemoryError unused) {
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        if (bArr == null) {
            return C132416Tn.A07;
        }
        try {
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        } catch (OutOfMemoryError unused2) {
            return C132416Tn.A07;
        }
        throw th;
    }

    public C74893mL(C65803Tn r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }

    public String BIB() {
        return Long.toString(this.A00);
    }
}
