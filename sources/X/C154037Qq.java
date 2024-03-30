package X;

import androidx.compose.foundation.lazy.LazyListState;

/* renamed from: X.7Qq  reason: invalid class name and case insensitive filesystem */
public final class C154037Qq extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ LazyListState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154037Qq(LazyListState lazyListState) {
        super(1);
        this.this$0 = lazyListState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        float A03 = C36441kJ.A03(obj);
        LazyListState lazyListState = this.this$0;
        float f = -A03;
        if ((f >= 0.0f || C90474aD.A1U(lazyListState.A0M)) && (f <= 0.0f || C90474aD.A1U(lazyListState.A0L))) {
            float f2 = lazyListState.A00;
            if (Math.abs(f2) <= 0.5f) {
                float f3 = f2 + f;
                lazyListState.A00 = f3;
                if (Math.abs(f3) > 0.5f) {
                    C161547n5 r8 = lazyListState.A0N;
                    C137746ge r7 = (C137746ge) r8.getValue();
                    float f4 = lazyListState.A00;
                    int A01 = C14960mT.A01(f4);
                    C137746ge r1 = lazyListState.A04;
                    if (!r7.A00(A01, !lazyListState.A09) || (r1 != null && !r1.A00(A01, true))) {
                        AnonymousClass7e0 r0 = lazyListState.A06;
                        if (r0 != null) {
                            r0.B7Y();
                        }
                        LazyListState.A00((C156927bB) r8.getValue(), lazyListState, f4 - lazyListState.A00);
                    } else {
                        lazyListState.A01(r7, lazyListState.A09, true);
                        lazyListState.A0O.setValue(AnonymousClass0AJ.A00);
                        LazyListState.A00(r7, lazyListState, f4 - lazyListState.A00);
                    }
                }
                float f5 = lazyListState.A00;
                if (Math.abs(f5) > 0.5f) {
                    f -= f5;
                    lazyListState.A00 = 0.0f;
                }
            } else {
                throw AnonymousClass001.A09(C90484aE.A0o("entered drag with non-zero pending scroll: ", AnonymousClass000.A0u(), f2));
            }
        } else {
            f = 0.0f;
        }
        return Float.valueOf(-f);
    }
}
