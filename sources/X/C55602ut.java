package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.whatsapp.TextData;

/* renamed from: X.2ut  reason: invalid class name and case insensitive filesystem */
public abstract class C55602ut {
    public static final AnonymousClass2g3 A00(Context context, Typeface typeface, Drawable drawable, TextData textData, C21060yb r14, AnonymousClass1H2 r15, C19890wg r16, String str) {
        C21060yb r6 = r14;
        AnonymousClass1H2 r7 = r15;
        C19890wg r8 = r16;
        String str2 = str;
        C36321k7.A19(r15, r14, r8, str2);
        C51352ng r1 = C51352ng.ROUND;
        C36861lQ r2 = null;
        TextData textData2 = textData;
        if (drawable instanceof C36861lQ) {
            C36861lQ r12 = (C36861lQ) drawable;
            if (r12.A06 == r1 && C1901797e.A00(r12.A07, str2) && C1901797e.A00(r12.A05, textData)) {
                r2 = r12;
            }
        }
        AnonymousClass2g3 r22 = (AnonymousClass2g3) r2;
        if (r22 == null) {
            return new AnonymousClass2g3(context, typeface, textData2, r6, r7, r8, str2);
        }
        return r22;
    }
}
