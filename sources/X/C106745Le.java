package X;

import android.graphics.Bitmap;

/* renamed from: X.5Le  reason: invalid class name and case insensitive filesystem */
public final class C106745Le extends AnonymousClass12N implements AnonymousClass1H8 {
    public final C19700wN A00;
    public final C93274gI A01 = new C93274gI((int) (C19430v1.A00 / 32768));

    public void Bma(Bitmap bitmap, C1275268q r4, boolean z) {
        AnonymousClass00C.A0D(bitmap, 2);
        this.A01.A08(new AnonymousClass6AA(r4, z), bitmap);
    }

    public Bitmap B87(C1275268q r3, boolean z) {
        return (Bitmap) this.A01.A04(new AnonymousClass6AA(r3, z));
    }

    public void Bjh(AnonymousClass5SK r3, boolean z) {
        this.A01.A07(-1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106745Le(C19700wN r5, C220112n r6) {
        super(r6);
        C36321k7.A0x(r6, r5);
        this.A00 = r5;
        A08();
    }

    public String BHv() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("EmojiLruCache - ");
        A0u.append(Integer.valueOf(this.A01.A02()));
        return AnonymousClass000.A0q(" kb", A0u);
    }
}
