package X;

import android.content.Context;

/* renamed from: X.5c6  reason: invalid class name and case insensitive filesystem */
public abstract class C111325c6 {
    public static final AnonymousClass6TW A00(Context context, AnonymousClass5TI r6, AnonymousClass5TJ r7) {
        C108165Sk r2;
        C108155Sj r0;
        AnonymousClass00C.A0D(context, 0);
        if (r6 == null || r7 == null || r7 == AnonymousClass5TJ.PLAIN) {
            return null;
        }
        C125485zz r3 = AnonymousClass6TW.A02;
        int ordinal = r7.ordinal();
        if (ordinal == 0) {
            r2 = C108165Sk.BORDERLESS;
        } else if (ordinal == 1) {
            r2 = C108165Sk.FILLED;
        } else if (ordinal == 2) {
            r2 = C108165Sk.TONAL;
        } else {
            throw C36441kJ.A18();
        }
        int ordinal2 = r6.ordinal();
        if (ordinal2 == 1) {
            r0 = C108155Sj.DESTRUCTIVE;
        } else if (ordinal2 == 2) {
            r0 = C108155Sj.WARNING;
        } else if (ordinal2 == 0) {
            r0 = C108155Sj.NORMAL;
        } else {
            throw C36441kJ.A18();
        }
        return r3.A00(context, r0, r2);
    }
}
