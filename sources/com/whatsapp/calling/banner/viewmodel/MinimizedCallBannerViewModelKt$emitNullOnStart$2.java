package com.whatsapp.calling.banner.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass05G;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerViewModelKt$emitNullOnStart$2", f = "MinimizedCallBannerViewModel.kt", i = {}, l = {145}, m = "invokeSuspend", n = {}, s = {})
public final class MinimizedCallBannerViewModelKt$emitNullOnStart$2 extends AnonymousClass0A1 implements C009003v {
    public /* synthetic */ Object L$0;
    public int label;

    public MinimizedCallBannerViewModelKt$emitNullOnStart$2(C023509x r2) {
        super(2, r2);
    }

    public final C023509x create(Object obj, C023509x r3) {
        MinimizedCallBannerViewModelKt$emitNullOnStart$2 minimizedCallBannerViewModelKt$emitNullOnStart$2 = new MinimizedCallBannerViewModelKt$emitNullOnStart$2(r3);
        minimizedCallBannerViewModelKt$emitNullOnStart$2.L$0 = obj;
        return minimizedCallBannerViewModelKt$emitNullOnStart$2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        MinimizedCallBannerViewModelKt$emitNullOnStart$2 minimizedCallBannerViewModelKt$emitNullOnStart$2 = new MinimizedCallBannerViewModelKt$emitNullOnStart$2((C023509x) obj2);
        minimizedCallBannerViewModelKt$emitNullOnStart$2.L$0 = obj;
        return minimizedCallBannerViewModelKt$emitNullOnStart$2.invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            this.label = 1;
            if (((AnonymousClass05G) this.L$0).B6N((Object) null, this) == r3) {
                return r3;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }
}
