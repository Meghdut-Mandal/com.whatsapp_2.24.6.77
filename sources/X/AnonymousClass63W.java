package X;

import com.whatsapp.expressionstray.stickers.StickerMakerChoiceBottomSheet;

/* renamed from: X.63W  reason: invalid class name */
public final class AnonymousClass63W {
    public final AnonymousClass6O1 A00;
    public final C130686Ma A01;
    public final C64473Oc A02;
    public final C63563Kn A03;

    public void A00(AnonymousClass01I r4, AnonymousClass3XM r5, AnonymousClass11F r6, int i, int i2) {
        if (this.A03.A00()) {
            C65443Sb.A04(new StickerMakerChoiceBottomSheet(new C153437Oi(r4, this, r5, i2), new C153447Oj(r4, this, r6, i)), r4.getSupportFragmentManager(), "sticker_maker_choice_bottom_sheet");
        } else {
            this.A02.A01(r4, r6, i);
        }
    }

    public AnonymousClass63W(AnonymousClass6O1 r1, C130686Ma r2, C63563Kn r3, C64473Oc r4) {
        C36321k7.A18(r3, r4, r1, r2);
        this.A03 = r3;
        this.A02 = r4;
        this.A00 = r1;
        this.A01 = r2;
    }
}
