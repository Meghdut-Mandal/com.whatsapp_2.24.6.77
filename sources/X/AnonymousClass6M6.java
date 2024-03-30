package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;

/* renamed from: X.6M6  reason: invalid class name */
public class AnonymousClass6M6 {
    public static final C22868AxN A00 = C139596k9.A00;

    public AU0 A00(Uri uri) {
        Bitmap decodeFile = BitmapFactory.decodeFile(uri.getPath(), new BitmapFactory.Options());
        C22868AxN axN = A00;
        C22867AxM axM = AU0.A04;
        if (decodeFile != null) {
            return new AU0(axM, axN, (Object) decodeFile);
        }
        return null;
    }
}
