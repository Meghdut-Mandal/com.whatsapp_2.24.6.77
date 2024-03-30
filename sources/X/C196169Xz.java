package X;

import android.widget.ImageView;
import com.whatsapp.R;
import java.io.File;
import java.util.List;
import java.util.Set;

/* renamed from: X.9Xz  reason: invalid class name and case insensitive filesystem */
public class C196169Xz {
    public int A00 = Integer.MAX_VALUE;
    public C102164zP A01;
    public boolean A02 = false;
    public final Set A03;
    public final AnonymousClass17Y A04;
    public final C20050ww A05;
    public final C19970wo A06;
    public final C19630wG A07;
    public final C20810yC A08;
    public final C21010yW A09;
    public final AnonymousClass1BV A0A;
    public final AnonymousClass1BS A0B;

    public void A02(C21097A8i a8i) {
        a8i.A01 = true;
        C102164zP r0 = this.A01;
        if (r0 != null) {
            r0.A00(a8i);
        }
        List list = a8i.A00;
        if (list != null && list.size() > 0) {
            for (C21097A8i A022 : a8i.A00) {
                A02(A022);
            }
        }
    }

    public void A00() {
        File A0w = C36441kJ.A0w(this.A07.A00.getCacheDir(), "linked_account_images");
        C21096A8h a8h = new C21096A8h(this.A00);
        C19970wo r4 = this.A06;
        C20810yC r5 = this.A08;
        C102164zP r0 = new C102164zP(this.A04, this.A05, a8h, r4, r5, this.A09, this.A0A, this.A0B, A0w, "linked-account-image-loader", 4);
        this.A01 = r0;
        a8h.A00 = r0;
    }

    public void A01(ImageView imageView, C206759tv r16, C22914AyQ ayQ, C22916AyS ayS, int i) {
        C206759tv r7 = r16;
        ImageView imageView2 = imageView;
        C21097A8i a8i = new C21097A8i(imageView2, r7, new C23152B7m(ayQ, this, 1), new B9E(r7, 2), new A9B(ayS, this), i, Integer.MAX_VALUE, Integer.MAX_VALUE);
        if (this.A01 == null) {
            A00();
        }
        if (this.A01 != null) {
            if (a8i.BCZ() != null) {
                a8i.BCZ().setTag(R.id.image_id, a8i.A05.A04);
                a8i.BCZ().setTag(R.id.image_quality, Integer.valueOf(a8i.A04));
                if (!a8i.BIk().equals(a8i.BCZ().getTag(R.id.loaded_image_url))) {
                    a8i.BCZ().setTag(R.id.loaded_image_url, (Object) null);
                }
            }
            this.A01.A01(a8i, true);
        }
    }

    public C196169Xz(AnonymousClass17Y r2, C20050ww r3, C19970wo r4, C19630wG r5, C20810yC r6, C21010yW r7, AnonymousClass1BV r8, AnonymousClass1BS r9) {
        this.A07 = r5;
        this.A06 = r4;
        this.A08 = r6;
        this.A04 = r2;
        this.A05 = r3;
        this.A09 = r7;
        this.A0B = r9;
        this.A0A = r8;
        this.A03 = C36441kJ.A16();
        A00();
    }

    public void finalize() {
        super.finalize();
    }
}
