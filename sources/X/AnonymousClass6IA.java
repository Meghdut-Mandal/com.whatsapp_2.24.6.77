package X;

import android.graphics.Bitmap;

/* renamed from: X.6IA  reason: invalid class name */
public abstract class AnonymousClass6IA {
    public static final AnonymousClass00T A00 = C36431kI.A1I(C153817Pu.A00);

    public static final int A00(Bitmap.Config config) {
        switch (C90524aI.A03(config, C112745eO.A00)) {
            case 1:
            case 6:
            case 7:
                return 4;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
                return 8;
            default:
                throw AnonymousClass001.A0E("The provided Bitmap.Config is not supported");
        }
    }
}
