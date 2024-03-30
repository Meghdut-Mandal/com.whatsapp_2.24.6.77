package X;

import com.whatsapp.stickers.recent.RecentStickerFlowImpl$avatarStickerCallbackFlow$1;
import com.whatsapp.stickers.recent.RecentStickerFlowImpl$avatarStickerShapesCallbackFlow$1;
import com.whatsapp.stickers.recent.RecentStickerFlowImpl$stickerCallbackFlow$1;
import com.whatsapp.stickers.recent.RecentStickerFlowImpl$stickerShapesCallbackFlow$1;
import com.whatsapp.stickers.recent.RecentStickerFlowImpl$updateAvatarStickerList$1;

/* renamed from: X.6ST  reason: invalid class name */
public final class AnonymousClass6ST {
    public final C104655Aq A00;
    public final AnonymousClass005 A01;
    public final AnonymousClass005 A02;
    public final C005502l A03;
    public final AnonymousClass05H A04;
    public final AnonymousClass05H A05;
    public final AnonymousClass05H A06;
    public final AnonymousClass05H A07;
    public final AnonymousClass040 A08;
    public final AnonymousClass05H A09;
    public final AnonymousClass05H A0A;
    public final AnonymousClass05H A0B;
    public final AnonymousClass05H A0C;

    public static final void A00(AnonymousClass6ST r3, C18000sQ r4) {
        C36381kD.A1R(r3.A03, new RecentStickerFlowImpl$updateAvatarStickerList$1(r3, (C023509x) null, r4), r4);
    }

    public AnonymousClass6ST(C104655Aq r10, AnonymousClass1BB r11, AnonymousClass005 r12, AnonymousClass005 r13, C005502l r14) {
        C36321k7.A1B(r11, r12, r13, r14, r10);
        this.A02 = r12;
        this.A01 = r13;
        this.A03 = r14;
        this.A00 = r10;
        C007703h r1 = new C007703h((C007403e) null);
        C005602m r0 = AnonymousClass19R.A00;
        AnonymousClass041 A022 = C009403z.A02(r1.plus(C36401kF.A0y()));
        this.A08 = A022;
        C15390nG A002 = AnonymousClass0R0.A00(new RecentStickerFlowImpl$stickerCallbackFlow$1(r11, this, (C023509x) null));
        this.A0B = A002;
        C15390nG A003 = AnonymousClass0R0.A00(new RecentStickerFlowImpl$avatarStickerCallbackFlow$1(r11, this, (C023509x) null));
        this.A09 = A003;
        C15390nG A004 = AnonymousClass0R0.A00(new RecentStickerFlowImpl$stickerShapesCallbackFlow$1(this, (C023509x) null));
        this.A0C = A004;
        C15390nG A005 = AnonymousClass0R0.A00(new RecentStickerFlowImpl$avatarStickerShapesCallbackFlow$1(this, (C023509x) null));
        this.A0A = A005;
        C13120jC r02 = new C13120jC(0);
        C106705Ky r3 = C106705Ky.A00;
        this.A07 = C07360Xi.A01(r3, A022, A002, r02);
        this.A05 = C07360Xi.A01(r3, A022, A003, new C13120jC(0));
        this.A06 = C07360Xi.A01(r3, A022, A004, new C13120jC(0));
        this.A04 = C07360Xi.A01(r3, A022, A005, new C13120jC(0));
    }
}
