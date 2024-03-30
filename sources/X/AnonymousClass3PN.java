package X;

import android.content.SharedPreferences;

/* renamed from: X.3PN  reason: invalid class name */
public final class AnonymousClass3PN {
    public final C19420v0 A00;
    public final C18820ts A01;
    public final C19630wG A02;

    public final boolean A02(C51632o8 r5, int i) {
        String str;
        SharedPreferences.Editor editor;
        SharedPreferences.Editor putInt;
        int ordinal = r5.ordinal();
        if (ordinal == 0) {
            C19420v0 r1 = this.A00;
            if (r1.A0J() == i) {
                return false;
            }
            editor = C19420v0.A00(r1);
            str = "photo_quality";
            putInt = editor.putInt(str, i);
        } else if (ordinal != 1) {
            int i2 = 0;
            if (i == 1) {
                i2 = 3;
            }
            C19420v0 r2 = this.A00;
            if (C36371kC.A01(C36341k9.A0E(r2), "original_media_quality") == i2) {
                return false;
            }
            putInt = C19420v0.A00(r2).putInt("original_media_quality", i2);
        } else {
            C19420v0 r22 = this.A00;
            str = "video_quality";
            if (C36371kC.A01(C36341k9.A0E(r22), str) == i) {
                return false;
            }
            editor = C19420v0.A00(r22);
            putInt = editor.putInt(str, i);
        }
        putInt.apply();
        return true;
    }

    public final String A01(C51632o8 r4) {
        int[] iArr;
        C19630wG r2 = this.A02;
        int ordinal = r4.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            iArr = C56752wp.A02;
        } else {
            iArr = C56752wp.A01;
        }
        return C36371kC.A0v(r2, iArr[A00(this, r4)]);
    }

    public AnonymousClass3PN(C19630wG r1, C19420v0 r2, C18820ts r3) {
        C36321k7.A11(r1, r3, r2);
        this.A02 = r1;
        this.A01 = r3;
        this.A00 = r2;
    }

    public static final int A00(AnonymousClass3PN r4, C51632o8 r5) {
        int ordinal = r5.ordinal();
        if (ordinal == 0) {
            return r4.A00.A0J();
        }
        SharedPreferences A0E = C36341k9.A0E(r4.A00);
        if (ordinal != 1) {
            return AnonymousClass000.A1S(C36371kC.A01(A0E, "original_media_quality"), 3) ? 1 : 0;
        }
        return C36371kC.A01(A0E, "video_quality");
    }
}
