package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.View;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6T7  reason: invalid class name */
public final class AnonymousClass6T7 {
    public static final AnonymousClass6T7 A00 = new AnonymousClass6T7();

    public static final void A00(C131146Nx r5, AnonymousClass7hB r6, AnonymousClass005 r7, Set set, AnonymousClass00S r9) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C108415Tk r1 = (C108415Tk) it.next();
            int A01 = r5.A01(r1.id);
            if (!(A01 == 3 || A01 == 2)) {
                ((AnonymousClass6NJ) r7.get()).A01(r6, r1);
                r9.invoke();
            }
        }
    }

    public final Bitmap A01(C19630wG r8, String str) {
        String str2;
        Uri A01;
        C36331k8.A1I(str, r8);
        C108405Tj[] values = C108405Tj.values();
        int length = values.length;
        int i = 0;
        while (true) {
            str2 = null;
            if (i >= length) {
                break;
            }
            C108405Tj r1 = values[i];
            if (AnonymousClass099.A0O(r1.fileName, str, false)) {
                String str3 = r1.fileName;
                if (str3 != null && (A01 = AnonymousClass6XA.A01(r8, str3)) != null) {
                    str2 = A01.getPath();
                }
            } else {
                i++;
            }
        }
        Bitmap decodeFile = BitmapFactory.decodeFile(str2);
        AnonymousClass00C.A08(decodeFile);
        return decodeFile;
    }

    public final void A02(View view, C19630wG r6, Map map) {
        C36321k7.A0v(map, 0, r6);
        C108405Tj.values();
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            C36341k9.A0L(view, C90484aE.A0G(A11)).setImageBitmap(A01(r6, ((C108415Tk) A11.getKey()).id));
        }
    }
}
