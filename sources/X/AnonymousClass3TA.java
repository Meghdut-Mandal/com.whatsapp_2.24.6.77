package X;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/* renamed from: X.3TA  reason: invalid class name */
public abstract class AnonymousClass3TA {
    public static final String[] A00() {
        LinkedHashSet A17 = C36441kJ.A17();
        AnonymousClass03Y.A0D(A17, A01());
        AnonymousClass03Y.A0D(A17, A02());
        return C36371kC.A1b(A17, 0);
    }

    public static final String[] A01() {
        ArrayList A0I = AnonymousClass001.A0I();
        if (!C19550w8.A09() && !C19550w8.A07()) {
            A0I.add("android.permission.READ_EXTERNAL_STORAGE");
        }
        A0I.add("android.permission.CAMERA");
        if (!C19550w8.A07()) {
            A0I.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        return C36371kC.A1b(A0I, 0);
    }

    public static final String[] A02() {
        String str;
        ArrayList A0I = AnonymousClass001.A0I();
        if (C19550w8.A09()) {
            A0I.add("android.permission.READ_MEDIA_IMAGES");
            str = "android.permission.READ_MEDIA_VIDEO";
        } else {
            str = "android.permission.READ_EXTERNAL_STORAGE";
        }
        A0I.add(str);
        if (C19550w8.A0A()) {
            A0I.add("android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
        }
        if (!C19550w8.A07()) {
            A0I.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        return C36371kC.A1b(A0I, 0);
    }

    public static final String[] A03() {
        String str;
        ArrayList A0I = AnonymousClass001.A0I();
        if (C19550w8.A09()) {
            str = "android.permission.READ_MEDIA_AUDIO";
        } else {
            str = "android.permission.READ_EXTERNAL_STORAGE";
        }
        A0I.add(str);
        if (!C19550w8.A07()) {
            A0I.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        return C36371kC.A1b(A0I, 0);
    }

    public static final String[] A04() {
        LinkedHashSet A17 = C36441kJ.A17();
        AnonymousClass03Y.A0D(A17, A02());
        AnonymousClass03Y.A0D(A17, A03());
        return C36371kC.A1b(A17, 0);
    }
}
