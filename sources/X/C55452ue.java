package X;

import android.content.Context;
import com.whatsapp.TextData;

/* renamed from: X.2ue  reason: invalid class name and case insensitive filesystem */
public abstract class C55452ue {
    public static final C38401ok A00(Context context, C32721e5 r7, AnonymousClass2bV r8) {
        String str;
        C36331k8.A1I(context, r8);
        String A1Y = r8.A1Y();
        if (A1Y != null) {
            str = AnonymousClass3UN.A06(A1Y, 0, A1Y.length(), 10, 700);
        } else {
            str = "";
        }
        C38401ok r1 = new C38401ok(context);
        TextData textData = r8.A02;
        if (textData != null) {
            r1.setTextContentProperties(textData);
        }
        r1.A09 = r8;
        r1.A06 = r7;
        r1.A01 = null;
        r1.setTextContent(str.toString());
        return r1;
    }
}
