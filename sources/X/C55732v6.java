package X;

import android.content.res.Resources;
import android.text.TextUtils;
import com.whatsapp.R;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2v6  reason: invalid class name and case insensitive filesystem */
public abstract class C55732v6 {
    public static String A00(C19630wG r10, AnonymousClass2bW r11) {
        C602837f A01;
        List A1X = r11.A1X();
        int size = A1X.size() - 1;
        int i = 0;
        while (i < A1X.size() && i < 100) {
            String A0s = C36401kF.A0s(A1X, i);
            if (A0s != null && (A01 = C65643Sx.A01(A0s)) != null) {
                C65643Sx r7 = new C65643Sx();
                Iterator it = A01.A02.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        continue;
                        break;
                    }
                    AnonymousClass3KL r8 = (AnonymousClass3KL) it.next();
                    String str = r8.A01;
                    if (!TextUtils.isEmpty(r8.A02)) {
                        if (str.equals("N")) {
                            C65643Sx.A02(r8.A03, r7.A0A);
                        }
                        AnonymousClass3F9 r1 = r7.A0A;
                        if (!TextUtils.isEmpty(r1.A02)) {
                            String str2 = r1.A02;
                            if (str2 != null) {
                                Resources A0B = C36421kH.A0B(r10);
                                Object[] A1b = C36411kG.A1b(str2);
                                AnonymousClass000.A1L(A1b, size, 1);
                                return A0B.getQuantityString(R.plurals.f10nameremoved, size, A1b);
                            }
                        }
                    }
                }
            }
            i++;
        }
        return C36321k7.A0B(C36421kH.A0B(r10), A1X.size(), 0, R.plurals.f10nameremoved);
    }
}
