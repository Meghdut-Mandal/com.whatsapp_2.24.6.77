package X;

import android.graphics.Bitmap;
import com.whatsapp.R;
import java.util.ArrayList;

/* renamed from: X.A8h  reason: case insensitive filesystem */
public final class C21096A8h implements C160397kw {
    public C102164zP A00;
    public final int A01;

    public /* bridge */ /* synthetic */ void BRN(C160797lb r2) {
        C22914AyQ ayQ;
        C21097A8i a8i = (C21097A8i) r2;
        if (a8i.A00() && (ayQ = a8i.A06) != null) {
            ayQ.BRO(a8i);
        }
    }

    public /* bridge */ /* synthetic */ void BZu(C160797lb r20) {
        C22915AyR ayR;
        C21097A8i a8i = (C21097A8i) r20;
        if (a8i.A04 == 1) {
            ArrayList A14 = C36441kJ.A14(2);
            C1903397z r9 = new C1903397z(a8i, this, 1);
            C206759tv r6 = a8i.A05;
            int i = this.A01;
            C21097A8i a8i2 = new C21097A8i(a8i.BCZ(), r6, (C22914AyQ) null, (C22915AyR) null, r9, 2, i, i);
            C21097A8i a8i3 = new C21097A8i(a8i.BCZ(), r6, (C22914AyQ) null, (C22915AyR) null, r9, 3, Integer.MAX_VALUE, Integer.MAX_VALUE);
            A14.add(a8i2);
            A14.add(a8i3);
            a8i.A00 = A14;
            C102164zP r0 = this.A00;
            if (r0 != null) {
                r0.A01(a8i2, true);
                this.A00.A01(a8i3, true);
            }
        } else if (a8i.A00() && (ayR = a8i.A07) != null) {
            ayR.BZx(a8i);
        }
    }

    public /* bridge */ /* synthetic */ void Ba5(Bitmap bitmap, C160797lb r5, boolean z) {
        C21097A8i a8i = (C21097A8i) r5;
        if (a8i.A00()) {
            if (a8i.BCZ() != null) {
                a8i.BCZ().setTag(R.id.loaded_image_url, a8i.BIk());
            }
            a8i.A08.Ba4(bitmap, a8i, z);
        }
    }

    public C21096A8h(int i) {
        this.A01 = i;
    }

    public /* bridge */ /* synthetic */ void Ba1(C160797lb r1) {
    }
}
