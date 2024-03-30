package X;

import com.whatsapp.stickers.starred.StarredStickersFlow$avatarStickerCallbackFlow$1;
import com.whatsapp.stickers.starred.StarredStickersFlow$stickerCallbackFlow$1;
import com.whatsapp.stickers.starred.StarredStickersFlow$updateStickerList$1;

/* renamed from: X.6Lo  reason: invalid class name and case insensitive filesystem */
public final class C130566Lo {
    public AnonymousClass05J A00 = new C15350nC(C023109s.A00, 0, 0);
    public final C24041Av A01;
    public final C23981Ap A02;
    public final C24001Ar A03;
    public final C005502l A04;
    public final AnonymousClass05H A05;
    public final AnonymousClass05H A06;
    public final AnonymousClass040 A07;
    public final AnonymousClass05H A08;
    public final AnonymousClass05H A09;

    public static final void A00(C130566Lo r3, C18000sQ r4, int i) {
        C36381kD.A1R(r3.A04, new StarredStickersFlow$updateStickerList$1(r3, (C023509x) null, r4, i), r4);
    }

    public C130566Lo(C24041Av r8, C23981Ap r9, AnonymousClass1BB r10, C24001Ar r11, C005502l r12) {
        C36321k7.A1B(r10, r9, r11, r8, r12);
        this.A02 = r9;
        this.A03 = r11;
        this.A01 = r8;
        this.A04 = r12;
        C007703h r1 = new C007703h((C007403e) null);
        C005602m r0 = AnonymousClass19R.A00;
        AnonymousClass041 A022 = C009403z.A02(r1.plus(C36401kF.A0y()));
        this.A07 = A022;
        C15390nG A002 = AnonymousClass0R0.A00(new StarredStickersFlow$stickerCallbackFlow$1(r10, this, (C023509x) null));
        this.A09 = A002;
        C15390nG A003 = AnonymousClass0R0.A00(new StarredStickersFlow$avatarStickerCallbackFlow$1(r10, this, (C023509x) null));
        this.A08 = A003;
        C13120jC r02 = new C13120jC(0);
        AnonymousClass5L1 r13 = AnonymousClass5L1.A00;
        this.A06 = C07360Xi.A01(r13, A022, A002, r02);
        this.A05 = C07360Xi.A01(r13, A022, A003, new C13120jC(0));
    }
}
