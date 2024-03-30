package X;

import android.graphics.Bitmap;
import android.net.Uri;
import com.whatsapp.conversation.viewmodel.CustomStickerViewModel$1;

/* renamed from: X.1uB  reason: invalid class name and case insensitive filesystem */
public final class C39901uB extends AnonymousClass04R {
    public boolean A00;
    public final Uri A01;
    public final AnonymousClass17Y A02;
    public final AnonymousClass1X4 A03;
    public final C19630wG A04;
    public final AnonymousClass1Ax A05;
    public final AnonymousClass1YP A06;
    public final C005502l A07;
    public final AnonymousClass05L A08;
    public final AnonymousClass05K A09;

    public C39901uB(Uri uri, AnonymousClass17Y r5, AnonymousClass1X4 r6, C19630wG r7, AnonymousClass1Ax r8, AnonymousClass1YP r9, C005502l r10) {
        AnonymousClass00C.A0D(r8, 1);
        C36321k7.A1A(r6, r7, r5, r10, 3);
        this.A05 = r8;
        this.A06 = r9;
        this.A03 = r6;
        this.A04 = r7;
        this.A02 = r5;
        this.A07 = r10;
        this.A01 = uri;
        AnonymousClass05N r0 = new AnonymousClass05N(new C64793Pl((Bitmap) null));
        this.A08 = r0;
        this.A09 = r0;
        C36381kD.A1R(r10, new CustomStickerViewModel$1(this, (C023509x) null), C109325Xd.A00(this));
    }

    public static final void A01(C39901uB r3) {
        AnonymousClass05L r32 = r3.A08;
        Bitmap bitmap = ((C64793Pl) r32.getValue()).A00;
        if (bitmap != null) {
            bitmap.recycle();
        }
        do {
        } while (!r32.B3B(r32.getValue(), new C64793Pl((Bitmap) null)));
    }

    public void A0R() {
        if (!this.A00) {
            A01(this);
        }
    }
}
