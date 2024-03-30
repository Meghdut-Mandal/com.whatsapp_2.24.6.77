package X;

import android.util.Size;
import com.whatsapp.voipcalling.camera.VoipLiteCamera;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.9Yx  reason: invalid class name and case insensitive filesystem */
public abstract class C196329Yx {
    static {
        new AnonymousClass9W3(VoipLiteCamera.DEFAULT_SUPERNOVA_WIDTH, VoipLiteCamera.DEFAULT_SUPERNOVA_HEIGHT);
        new AnonymousClass9W3(1920, 1080);
    }

    public static List A00(Size[] sizeArr) {
        int length;
        if (sizeArr == null || (length = sizeArr.length) == 0) {
            return Collections.emptyList();
        }
        ArrayList A14 = C36441kJ.A14(length);
        int i = 0;
        do {
            A14.add(new AnonymousClass9W3(sizeArr[i].getWidth(), sizeArr[i].getHeight()));
            i++;
        } while (i < length);
        return Collections.unmodifiableList(A14);
    }
}
