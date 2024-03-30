package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

/* renamed from: X.2HK  reason: invalid class name */
public final class AnonymousClass2HK extends C80183uz {
    public View A00;
    public final ViewGroup A01;
    public final AnonymousClass16D A02;
    public final C19970wo A03;
    public final AnonymousClass17X A04;
    public final C20810yC A05;
    public final AnonymousClass11F A06;
    public final C19770wU A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2HK(ViewGroup viewGroup, AnonymousClass16D r4, AnonymousClass4V7 r5, C19970wo r6, AnonymousClass17X r7, C20810yC r8, AnonymousClass11F r9, C19770wU r10) {
        super(r5, 75);
        C36321k7.A1A(r6, r8, r10, r4, 3);
        AnonymousClass00C.A0D(r7, 7);
        AnonymousClass00C.A0D(viewGroup, 9);
        this.A03 = r6;
        this.A05 = r8;
        this.A07 = r10;
        this.A02 = r4;
        this.A04 = r7;
        this.A06 = r9;
        this.A01 = viewGroup;
    }

    public static final void A00(AnonymousClass2HK r3) {
        View view = r3.A00;
        if (view != null) {
            C66953Xy.A00(C36361kB.A0G(view, R.id.content), r3, 12);
            C66953Xy.A00(C36361kB.A0G(view, R.id.close_btn), r3, 13);
        }
    }
}
