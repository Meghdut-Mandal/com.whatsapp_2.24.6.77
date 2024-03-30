package X;

import android.content.Context;

/* renamed from: X.7Nh  reason: invalid class name and case insensitive filesystem */
public final class C153167Nh extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C92924f8 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C153167Nh(Context context, C92924f8 r3) {
        super(0);
        this.$context = context;
        this.this$0 = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Context context = this.$context;
        C19770wU waWorkers = this.this$0.getWaWorkers();
        return new C124135xe(context, this.this$0.getGlobalUI(), this.this$0.getHeroSettingProvider(), waWorkers);
    }
}
