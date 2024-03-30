package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.whatsapp.TextData;
import com.whatsapp.util.Log;

/* renamed from: X.3O2  reason: invalid class name */
public final class AnonymousClass3O2 {
    public final C20810yC A00;
    public final AnonymousClass005 A01;
    public final AnonymousClass005 A02;
    public final C21060yb A03;
    public final AnonymousClass1H2 A04;
    public final AnonymousClass1DU A05;
    public final C19890wg A06;

    public static final C36861lQ A00(Context context, Drawable drawable, AnonymousClass2bV r17, AnonymousClass3O2 r18, boolean z) {
        AnonymousClass3O2 r3 = r18;
        Drawable drawable2 = drawable;
        AnonymousClass2bV r2 = r17;
        String A052 = AnonymousClass3UN.A05(r3.A05, r2);
        if (A052 != null) {
            if (A052.length() > 700) {
                A052 = C36431kI.A16(0, 700, A052);
            }
            TextData textData = r2.A02;
            if (textData == null) {
                Log.e("Text status missing text data");
                textData = new TextData();
            }
            Context context2 = context;
            AnonymousClass00C.A0D(context, 0);
            Typeface A042 = AnonymousClass3UN.A04(context, textData.fontStyle);
            if (A042 == null) {
                A042 = Typeface.SANS_SERIF;
            }
            if (z) {
                AnonymousClass1H2 r9 = r3.A04;
                C21060yb r8 = r3.A03;
                C19890wg r10 = r3.A06;
                C51352ng r1 = C51352ng.ROUND;
                if (drawable2 instanceof C36861lQ) {
                    C36861lQ r4 = (C36861lQ) drawable2;
                    if (r4.A06 == r1 && C1901797e.A00(r4.A07, A052) && C1901797e.A00(r4.A05, textData)) {
                        return r4;
                    }
                }
                return new AnonymousClass2g4(context2, A042, textData, r8, r9, r10, A052);
            }
            AnonymousClass1H2 r22 = r3.A04;
            return C55602ut.A00(context, A042, drawable2, textData, r3.A03, r22, r3.A06, A052);
        }
        Log.e("Text status missing content");
        return null;
    }

    public AnonymousClass3O2(C21060yb r1, AnonymousClass1H2 r2, C20810yC r3, AnonymousClass1DU r4, C19890wg r5, AnonymousClass005 r6, AnonymousClass005 r7) {
        C36321k7.A1B(r3, r6, r7, r4, r2);
        C36321k7.A10(r1, r5);
        this.A00 = r3;
        this.A01 = r6;
        this.A02 = r7;
        this.A05 = r4;
        this.A04 = r2;
        this.A03 = r1;
        this.A06 = r5;
    }
}
