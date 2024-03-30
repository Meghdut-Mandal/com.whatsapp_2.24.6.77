package X;

import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Trace;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.6ml  reason: invalid class name and case insensitive filesystem */
public class C141156ml implements AnonymousClass7ez {
    public AnonymousClass65N B78(Uri uri) {
        int i;
        String str;
        String str2;
        Trace.beginSection("ImageMetadataExtractor.extract");
        if (uri.getPath() != null) {
            File A0c = C90484aE.A0c(uri);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(A0c.getPath(), options);
            int i2 = options.outHeight;
            int i3 = options.outWidth;
            try {
                i = 0;
                int attributeInt = new ExifInterface(A0c.getPath()).getAttributeInt("Orientation", 0);
                if (attributeInt == 3) {
                    i = 180;
                } else if (attributeInt == 6) {
                    i = 90;
                } else if (attributeInt == 8) {
                    i = 270;
                }
            } catch (IOException unused) {
                i = 0;
            }
            try {
                str = new ExifInterface(A0c.getPath()).getAttribute("Copyright");
            } catch (IOException e) {
                AnonymousClass6YR.A09("ImageMetadataExtractor", C36331k8.A0i("Failed to fetch ExifInterface.TAG_COPYRIGHT: ", AnonymousClass000.A0u(), e), e);
                str = null;
            }
            try {
                str2 = new ExifInterface(A0c.getPath()).getAttribute("Model");
            } catch (IOException e2) {
                Object[] A0M = AnonymousClass001.A0M();
                C90494aF.A1H(e2.getMessage(), e2, A0M);
                AnonymousClass6YR.A0F("ImageMetadataExtractor", "Failed to fetch ExifInterface.TAG_MODEL: %s", A0M);
                str2 = null;
            }
            int i4 = i3;
            AnonymousClass65N r6 = new AnonymousClass65N((C206529tY) null, str, str2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, "PHOTO", (HashMap) null, i4, i2, i, 0, 0, -1, -1, -1, A0c.length(), false);
            Trace.endSection();
            return r6;
        }
        Trace.endSection();
        throw C90524aI.A0X("uri.getPath() is null");
    }
}
