package X;

import android.view.ContentInfo;
import android.view.View;

/* renamed from: X.0Xa  reason: invalid class name and case insensitive filesystem */
public abstract class C07280Xa {
    public static void A01(View view, C16690pv r2, String[] strArr) {
        view.setOnReceiveContentListener(strArr, new C08990be(r2));
    }

    public static AnonymousClass0X6 A00(View view, AnonymousClass0X6 r3) {
        ContentInfo A02 = r3.A02();
        ContentInfo performReceiveContent = view.performReceiveContent(A02);
        if (performReceiveContent == null) {
            return null;
        }
        if (performReceiveContent == A02) {
            return r3;
        }
        return AnonymousClass0X6.A00(performReceiveContent);
    }

    public static String[] A02(View view) {
        return view.getReceiveContentMimeTypes();
    }
}
