package X;

import androidx.compose.foundation.BackgroundElement;
import androidx.compose.ui.graphics.BlockGraphicsLayerElement;

/* renamed from: X.7ZA  reason: invalid class name */
public final class AnonymousClass7ZA extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ float $absoluteElevation;
    public final /* synthetic */ AnonymousClass5VU $border = null;
    public final /* synthetic */ long $color;
    public final /* synthetic */ C009003v $content;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C161437mu $interactionSource;
    public final /* synthetic */ C161267mT $modifier;
    public final /* synthetic */ AnonymousClass00S $onClick;
    public final /* synthetic */ float $shadowElevation;
    public final /* synthetic */ C157657dt $shape;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7ZA(C161437mu r3, C161267mT r4, C157657dt r5, AnonymousClass00S r6, C009003v r7, float f, float f2, int i, long j, boolean z) {
        super(2);
        this.$modifier = r4;
        this.$shape = r5;
        this.$color = j;
        this.$absoluteElevation = f;
        this.$$changed = i;
        this.$shadowElevation = f2;
        this.$interactionSource = r3;
        this.$enabled = z;
        this.$onClick = r6;
        this.$content = r7;
        this.$$changed1 = 6;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        float f;
        float f2;
        C161337ma r4 = (C161337ma) obj;
        if ((AnonymousClass000.A0I(obj2) & 11) != 2 || !r4.BHg()) {
            C161267mT r2 = this.$modifier;
            C93564gm r0 = C113815gA.A01;
            AnonymousClass00C.A0D(r2, 0);
            C006302t r8 = C112455dv.A00;
            C161267mT Bva = r2.Bva(new C95014je(r8, C156657aK.A00));
            C157657dt r9 = this.$shape;
            long j = this.$color;
            float f3 = this.$absoluteElevation;
            r4.Bum(-2079918090);
            C93564gm r12 = C129516Hh.A00;
            C136916fF r22 = (C136916fF) r4;
            if (j == C90474aD.A0D(((AnonymousClass65R) AnonymousClass6G0.A01(r22, r12)).A0O)) {
                AnonymousClass65R r10 = (AnonymousClass65R) AnonymousClass6G0.A01(r22, r12);
                AnonymousClass00C.A0D(r10, 0);
                if (AnonymousClass000.A1Q(Float.compare(f3, (float) 0))) {
                    j = C90474aD.A0D(r10.A0O);
                } else {
                    long A05 = AnonymousClass6QU.A00(C114185go.A0K[(int) (C90474aD.A0D(r10.A0P) & 63)], C133336Xx.A04(C90474aD.A0D(r10.A0P)), C133336Xx.A03(C90474aD.A0D(r10.A0P)), C133336Xx.A02(C90474aD.A0D(r10.A0P)), ((((float) Math.log((double) (f3 + ((float) 1)))) * 4.5f) + 2.0f) / 100.0f);
                    long A0D = C90474aD.A0D(r10.A0O);
                    int i = (int) (A0D & 63);
                    AnonymousClass6FX[] r19 = C114185go.A0K;
                    long A06 = C133336Xx.A06(r19[i], A05);
                    float A01 = C133336Xx.A01(A0D);
                    float A012 = C133336Xx.A01(A06);
                    float f4 = 1.0f - A012;
                    float f5 = (A01 * f4) + A012;
                    float A04 = C133336Xx.A04(A06);
                    float A042 = C133336Xx.A04(A0D);
                    float f6 = 0.0f;
                    int i2 = (f5 > 0.0f ? 1 : (f5 == 0.0f ? 0 : -1));
                    if (i2 == 0) {
                        f = 0.0f;
                    } else {
                        f = ((A04 * A012) + ((A042 * A01) * f4)) / f5;
                    }
                    float A03 = C133336Xx.A03(A06);
                    float A032 = C133336Xx.A03(A0D);
                    if (i2 == 0) {
                        f2 = 0.0f;
                    } else {
                        f2 = ((A03 * A012) + ((A032 * A01) * f4)) / f5;
                    }
                    float A02 = C133336Xx.A02(A06);
                    float A022 = C133336Xx.A02(A0D);
                    if (i2 != 0) {
                        f6 = ((A02 * A012) + ((A022 * A01) * f4)) / f5;
                    }
                    j = AnonymousClass6QU.A00(r19[i], f, f2, f6, f5);
                }
            }
            C136916fF.A0M(r22, false);
            float f7 = this.$shadowElevation;
            long j2 = C112345dk.A00;
            if (Float.compare(f7, (float) 0) > 0) {
                BlockGraphicsLayerElement blockGraphicsLayerElement = new BlockGraphicsLayerElement(new AnonymousClass7VO(r9, f7, j2, j2));
                C95024jf r102 = new C95024jf(r8);
                Bva = Bva.Bva(r102).Bva(blockGraphicsLayerElement).Bva(r102.A00);
            }
            C161267mT A00 = AnonymousClass5WO.A00(Bva.Bva(C161267mT.A00).Bva(new BackgroundElement(r9, r8, j)), r9);
            C161437mu r92 = this.$interactionSource;
            C161267mT A002 = C108995Vu.A00(C129496Hf.A00(r4), r92, A00, (AnonymousClass68P) null, (String) null, this.$onClick, this.$enabled);
            C009003v r5 = this.$content;
            int i3 = this.$$changed1;
            r4.Bum(733328855);
            C157697dx A003 = C129716Ie.A00(r4, AnonymousClass6J7.A05, true);
            r4.Bum(-1323940314);
            Object A013 = AnonymousClass6G0.A01(r22, C131996Rr.A00);
            Object A014 = AnonymousClass6G0.A01(r22, C131996Rr.A03);
            Object A015 = AnonymousClass6G0.A01(r22, C131996Rr.A04);
            AnonymousClass00S r93 = AnonymousClass6JB.A00;
            C1509977p r3 = new C1509977p(-55743822, new C156557aA(A002), true);
            C136916fF.A0F(r4, r22, r93);
            r22.A0P = false;
            AnonymousClass5WF.A01(r4, A003, AnonymousClass6JB.A04);
            AnonymousClass5WF.A01(r4, A013, AnonymousClass6JB.A02);
            AnonymousClass5WF.A01(r4, A014, AnonymousClass6JB.A03);
            AnonymousClass5WF.A01(r4, A015, AnonymousClass6JB.A07);
            r22.A0P = C36401kF.A1U(r22.A05);
            C1509977p.A01(r4, r3, new AnonymousClass68J(r4), 0);
            r5.invoke(r4, Integer.valueOf(i3 & 14));
            C136916fF.A0L(r22, true);
        } else {
            r4.BuE();
        }
        return AnonymousClass0AJ.A00;
    }
}
