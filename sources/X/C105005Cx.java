package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5Cx  reason: invalid class name and case insensitive filesystem */
public class C105005Cx extends C1271167a {
    public final C20690y0 A00;
    public final C1032954s A01;
    public final AnonymousClass1D1 A02;
    public final C132106Se A03;

    public C105005Cx(C20690y0 r7, C19630wG r8, C18820ts r9, C1032954s r10, AnonymousClass1H2 r11, AnonymousClass1D1 r12, C132106Se r13, AnonymousClass1HA r14, AnonymousClass1GX r15) {
        super(r8, r9, r11, r14, r15);
        this.A02 = r12;
        this.A01 = r10;
        this.A00 = r7;
        this.A03 = r13;
    }

    public static void A02(Bitmap bitmap, C1042358u r13, AnonymousClass6VQ r14) {
        List list = r14.A04;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C90524aI.A0N(it).A0D();
        }
        Canvas A0A = C90524aI.A0A(bitmap);
        int i = r14.A00;
        RectF rectF = r14.A01;
        Matrix A002 = AnonymousClass6VQ.A00((float) bitmap.getWidth(), (float) bitmap.getHeight(), (float) i, rectF.width(), rectF.height(), false, false);
        A002.preTranslate(-rectF.left, -rectF.top);
        A0A.concat(A002);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C90524aI.A0N(it2).A0I(A0A);
        }
        r14.A07(r13);
    }

    public static Uri.Builder A00(C1042358u r2, AnonymousClass6QO r3, AnonymousClass1GX r4) {
        File A06 = r3.A06();
        if (A06 != null) {
            Long l = r2.A0D;
            if (l != null) {
                r2.A0D = C90464aC.A0S(l);
            }
            r4.A0l(r3.A08());
            r3.A0F((File) null);
        } else {
            A06 = r3.A08();
        }
        C18740tg.A06(A06);
        return Uri.fromFile(A06).buildUpon();
    }

    public static File A01(Uri uri, C20690y0 r3) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(C18750th.A04(uri.toString()));
        return r3.A0X(AnonymousClass000.A0q("-crop", A0u));
    }
}
