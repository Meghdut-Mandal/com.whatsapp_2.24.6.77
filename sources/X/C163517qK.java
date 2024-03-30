package X;

import android.content.ClipData;
import android.net.Uri;
import android.util.Pair;
import android.view.View;
import com.bloks.stdlib.components.bkcomponentstextinput.BloksEditText;

/* renamed from: X.7qK  reason: invalid class name and case insensitive filesystem */
public class C163517qK implements C16690pv {
    public Object A00;
    public final int A01;

    public C163517qK(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final AnonymousClass0X6 BeE(View view, AnonymousClass0X6 r13) {
        if (this.A01 != 0) {
            Pair A012 = r13.A01(C138306he.A00);
            AnonymousClass00C.A08(A012);
            AnonymousClass0X6 r0 = (AnonymousClass0X6) A012.first;
            r13 = (AnonymousClass0X6) A012.second;
            if (r0 != null) {
                C157807ei r4 = (C157807ei) this.A00;
                ClipData B9k = r0.A00.B9k();
                AnonymousClass00C.A08(B9k);
                int itemCount = B9k.getItemCount();
                for (int i = 0; i < itemCount; i++) {
                    Uri uri = B9k.getItemAt(i).getUri();
                    if (uri != null) {
                        String obj = uri.toString();
                        C140266lJ r02 = (C140266lJ) r4;
                        C132926Vv.A01(new C1503574y(r02.A01, r02.A02, r02.A00, obj, 1));
                    }
                }
            }
        } else {
            BloksEditText bloksEditText = (BloksEditText) this.A00;
            if (bloksEditText.A01 != null) {
                Pair A013 = r13.A01(C138296hd.A00);
                AnonymousClass0X6 r03 = (AnonymousClass0X6) A013.first;
                r13 = (AnonymousClass0X6) A013.second;
                if (r03 != null) {
                    ClipData B9k2 = r03.A00.B9k();
                    for (int i2 = 0; i2 < B9k2.getItemCount(); i2++) {
                        Uri uri2 = B9k2.getItemAt(i2).getUri();
                        if (uri2 != null) {
                            C157807ei r04 = bloksEditText.A01;
                            C140266lJ r05 = (C140266lJ) r04;
                            C132926Vv.A01(new C1503574y(r05.A01, r05.A02, r05.A00, uri2.toString(), 1));
                        }
                    }
                }
            }
        }
        return r13;
    }
}
