package X;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import java.util.UUID;

/* renamed from: X.6pw  reason: invalid class name and case insensitive filesystem */
public class C143076pw implements C22916AyS {
    public AnonymousClass9N6 A00;
    public final C20690y0 A01;
    public final AnonymousClass1GX A02;
    public final C19770wU A03;

    public void Ba4(Bitmap bitmap, C21097A8i a8i, boolean z) {
        C36391kE.A1R(this.A03, this, bitmap, 45);
    }

    public C143076pw(C20690y0 r1, AnonymousClass1GX r2, C19770wU r3) {
        this.A03 = r3;
        this.A01 = r1;
        this.A02 = r2;
    }

    public static AnonymousClass00I A00(Bitmap bitmap, C20690y0 r5) {
        boolean z;
        FileOutputStream A0W;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(UUID.randomUUID());
        File A0X = r5.A0X(AnonymousClass000.A0q(".jpeg", A0u));
        try {
            A0W = C90524aI.A0W(A0X);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 80, A0W);
            A0W.close();
            z = true;
        } catch (Exception e) {
            C36321k7.A1J(e, "product-details/send-product/save-to-storage/failed: ", AnonymousClass000.A0u());
            z = false;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        return C36441kJ.A0W(Boolean.valueOf(z), A0X);
        throw th;
    }
}
