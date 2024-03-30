package com.whatsapp.calling.banner.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass05R;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C019408g;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerViewModel$effectiveVisibilityState$1", f = "MinimizedCallBannerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MinimizedCallBannerViewModel$effectiveVisibilityState$1 extends AnonymousClass0A1 implements C019408g {
    public /* synthetic */ int I$0;
    public /* synthetic */ Object L$0;
    public int label;

    public MinimizedCallBannerViewModel$effectiveVisibilityState$1(C023509x r2) {
        super(3, r2);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            int i = this.I$0;
            if (this.L$0 != AnonymousClass05R.ON_RESUME) {
                i = 8;
            }
            return new Integer(i);
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object BKt(Object obj, Object obj2, Object obj3) {
        int A0I = AnonymousClass000.A0I(obj);
        MinimizedCallBannerViewModel$effectiveVisibilityState$1 minimizedCallBannerViewModel$effectiveVisibilityState$1 = new MinimizedCallBannerViewModel$effectiveVisibilityState$1((C023509x) obj3);
        minimizedCallBannerViewModel$effectiveVisibilityState$1.I$0 = A0I;
        minimizedCallBannerViewModel$effectiveVisibilityState$1.L$0 = obj2;
        return minimizedCallBannerViewModel$effectiveVisibilityState$1.invokeSuspend(AnonymousClass0AJ.A00);
    }
}
