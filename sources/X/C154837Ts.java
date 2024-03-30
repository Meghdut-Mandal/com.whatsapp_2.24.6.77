package X;

import android.content.Context;

/* renamed from: X.7Ts  reason: invalid class name and case insensitive filesystem */
public final class C154837Ts extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C133476Yq $callbacks;
    public final /* synthetic */ Context $context;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154837Ts(Context context, C133476Yq r3) {
        super(1);
        this.$context = context;
        this.$callbacks = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.$context.getApplicationContext().registerComponentCallbacks(this.$callbacks);
        return new C164177rO(this.$context, this.$callbacks, 2);
    }
}
