package X;

import com.whatsapp.expressionstray.stickers.StickerExpressionsDataSource$createStickersFlow$1;
import com.whatsapp.expressionstray.stickers.mediacomposer.ContentStickerProvider$observeContentStickers$1;
import com.whatsapp.expressionstray.stickers.mediacomposer.ContentStickerProvider$observeShapesStickers$1;
import com.whatsapp.stickers.flow.StickerPackFlow;

/* renamed from: X.5yD  reason: invalid class name and case insensitive filesystem */
public final class C124455yD {
    public final C122505ux A00;
    public final StickerPackFlow A01;
    public final AnonymousClass6ST A02;
    public final C130566Lo A03;
    public final AnonymousClass040 A04;
    public final AnonymousClass05H A05;
    public final AnonymousClass05H A06;
    public final C005502l A07;

    public C124455yD(C122505ux r12, StickerPackFlow stickerPackFlow, AnonymousClass6ST r14, C130566Lo r15, C005502l r16) {
        C005502l r0 = r16;
        C36321k7.A19(r14, r15, r12, r0);
        this.A01 = stickerPackFlow;
        this.A02 = r14;
        this.A03 = r15;
        this.A00 = r12;
        this.A07 = r0;
        this.A04 = C90494aF.A0n(r0);
        AnonymousClass05H r7 = this.A01.A0G;
        C18500tG r6 = new C18500tG(C1036456g.A00, 0);
        C18500tG r5 = new C18500tG(AnonymousClass56j.A00, 0);
        AnonymousClass05H r4 = this.A02.A07;
        AnonymousClass05H r3 = this.A03.A06;
        StickerExpressionsDataSource$createStickersFlow$1 stickerExpressionsDataSource$createStickersFlow$1 = new StickerExpressionsDataSource$createStickersFlow$1((C023509x) null);
        AnonymousClass05H[] r1 = new AnonymousClass05H[5];
        r1[0] = r7;
        C90464aC.A1D(r6, r5, r4, r1);
        r1[4] = r3;
        this.A05 = new C18510tH((Object) r1, (Object) stickerExpressionsDataSource$createStickersFlow$1, 7);
        AnonymousClass05H r8 = this.A01.A0G;
        C122505ux r32 = this.A00;
        C15330nA r02 = new C15330nA(new ContentStickerProvider$observeContentStickers$1(r32, (C023509x) null));
        C005502l r2 = r32.A03;
        AnonymousClass05H A002 = AnonymousClass0R1.A00(r2, r02);
        AnonymousClass05H A003 = AnonymousClass0R1.A00(r2, new C15330nA(new ContentStickerProvider$observeShapesStickers$1(r32, (C023509x) null)));
        AnonymousClass05H r42 = this.A02.A06;
        AnonymousClass05H r33 = this.A03.A06;
        StickerExpressionsDataSource$createStickersFlow$1 stickerExpressionsDataSource$createStickersFlow$12 = new StickerExpressionsDataSource$createStickersFlow$1((C023509x) null);
        AnonymousClass05H[] r13 = new AnonymousClass05H[5];
        r13[0] = r8;
        C90464aC.A1D(A002, A003, r42, r13);
        r13[4] = r33;
        this.A06 = new C18510tH((Object) r13, (Object) stickerExpressionsDataSource$createStickersFlow$12, 7);
    }
}
