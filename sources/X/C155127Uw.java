package X;

import androidx.compose.animation.core.SuspendAnimationKt;

/* renamed from: X.7Uw  reason: invalid class name and case insensitive filesystem */
public final class C155127Uw extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass040 $$this$LaunchedEffect;
    public final /* synthetic */ C10780fD $durationScale;
    public final /* synthetic */ C161547n5 $toolingOverride;
    public final /* synthetic */ AnonymousClass63C this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C155127Uw(AnonymousClass63C r2, C161547n5 r3, C10780fD r4, AnonymousClass040 r5) {
        super(1);
        this.$toolingOverride = r3;
        this.this$0 = r2;
        this.$durationScale = r4;
        this.$$this$LaunchedEffect = r5;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long j;
        boolean z;
        long A09 = C36431kI.A09(obj);
        C157597dn r0 = (C157597dn) this.$toolingOverride.getValue();
        if (r0 != null) {
            j = C36431kI.A09(r0.getValue());
        } else {
            j = A09;
        }
        int i = 0;
        if (this.this$0.A00 == Long.MIN_VALUE || this.$durationScale.element != SuspendAnimationKt.A00(this.$$this$LaunchedEffect.BAE())) {
            AnonymousClass63C r02 = this.this$0;
            r02.A00 = A09;
            C1506776e r03 = r02.A03;
            int i2 = r03.A00;
            if (i2 > 0) {
                Object[] objArr = r03.A01;
                int i3 = 0;
                do {
                    ((C137106fb) objArr[i3]).A06 = true;
                    i3++;
                } while (i3 < i2);
            }
            this.$durationScale.element = SuspendAnimationKt.A00(this.$$this$LaunchedEffect.BAE());
        }
        float f = this.$durationScale.element;
        int i4 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        AnonymousClass63C r6 = this.this$0;
        if (i4 == 0) {
            C1506776e r04 = r6.A03;
            int i5 = r04.A00;
            if (i5 > 0) {
                Object[] objArr2 = r04.A01;
                do {
                    C137106fb r2 = (C137106fb) objArr2[i];
                    r2.A08.setValue(r2.A02.A08);
                    r2.A06 = true;
                    i++;
                } while (i < i5);
            }
        } else {
            long j2 = (long) (((float) (j - r6.A00)) / f);
            C1506776e r05 = r6.A03;
            int i6 = r05.A00;
            if (i6 > 0) {
                Object[] objArr3 = r05.A01;
                int i7 = 0;
                z = true;
                do {
                    C137106fb r11 = (C137106fb) objArr3[i7];
                    if (!r11.A05) {
                        C90474aD.A11(r11.A09.A02, false);
                        if (r11.A06) {
                            r11.A06 = false;
                            r11.A00 = j2;
                        }
                        long j3 = j2 - r11.A00;
                        r11.A08.setValue(r11.A02.BIp(j3));
                        r11.A05 = C36401kF.A1U((j3 > r11.A02.A00 ? 1 : (j3 == r11.A02.A00 ? 0 : -1)));
                    }
                    if (!r11.A05) {
                        z = false;
                    }
                    i7++;
                } while (i7 < i6);
            } else {
                z = true;
            }
            C90474aD.A11(r6.A01, !z);
        }
        return AnonymousClass0AJ.A00;
    }
}
