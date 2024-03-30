package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.5cl  reason: invalid class name and case insensitive filesystem */
public abstract class C111735cl {
    public static final String A00(C19700wN r7, AnonymousClass2bU r8) {
        File file;
        boolean z = false;
        AnonymousClass00C.A0D(r7, 0);
        String str = r8.A05;
        if (str == null || str.length() == 0) {
            z = true;
        }
        if (!z) {
            return str;
        }
        C65013Qj r0 = r8.A01;
        if (!(r0 == null || (file = r0.A0I) == null)) {
            try {
                int i = r8.A1I;
                if (i == 2) {
                    return AnonymousClass1DC.A06(AnonymousClass1DC.A03(file));
                }
                if (i == 3 || i == 13) {
                    int i2 = AnonymousClass1DC.A04(file).A01;
                    if (i2 == 7) {
                        return "video/quicktime";
                    }
                    if (i2 == 3) {
                        return "video/3gpp";
                    }
                    return "video/mp4";
                }
            } catch (C108715Up | IOException e) {
                Log.e("useractions/getmediamimetype exception", e);
            }
        }
        int i3 = r8.A1I;
        if (i3 == 1) {
            return "image/jpeg";
        }
        if (i3 == 2) {
            return "audio/*";
        }
        if (i3 == 3 || i3 == 13) {
            return "video/*";
        }
        if (i3 == 23 || i3 == 25 || i3 == 37 || i3 == 42) {
            return "image/jpeg";
        }
        if (i3 != 43) {
            return "*/*";
        }
        return "video/*";
    }
}
