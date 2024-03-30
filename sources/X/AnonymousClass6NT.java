package X;

import com.whatsapp.funstickers.logging.FunStickersFetchLogger$logError$2;

/* renamed from: X.6NT  reason: invalid class name */
public final class AnonymousClass6NT {
    public long A00;
    public long A01;
    public AnonymousClass58I A02;
    public Integer A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public final C19970wo A08;
    public final AnonymousClass1UA A09;
    public final C20810yC A0A;
    public final C21010yW A0B;
    public final C005502l A0C;

    public static final void A00(AnonymousClass58H r1, AnonymousClass6NT r2) {
        r1.A06 = r2.A07;
        r1.A05 = r2.A04;
        r1.A02 = r2.A03;
    }

    public static void A01(AnonymousClass6NT r2) {
        r2.A05 = r2.A04;
        r2.A04 = null;
        r2.A01 = 0;
        r2.A00 = 0;
    }

    public final Object A02(Integer num, C023509x r6, int i) {
        if (this.A04 != null) {
            if (i == 10) {
                this.A00++;
            }
            Object A002 = AnonymousClass0A2.A00(r6, this.A0C, new FunStickersFetchLogger$logError$2(this, num, (C023509x) null, i));
            if (A002 == AnonymousClass0AO.COROUTINE_SUSPENDED) {
                return A002;
            }
        }
        return AnonymousClass0AJ.A00;
    }

    public AnonymousClass6NT(C19970wo r1, AnonymousClass1UA r2, C20810yC r3, C21010yW r4, C005502l r5) {
        C36321k7.A1B(r3, r4, r2, r1, r5);
        this.A0A = r3;
        this.A0B = r4;
        this.A09 = r2;
        this.A08 = r1;
        this.A0C = r5;
    }
}
