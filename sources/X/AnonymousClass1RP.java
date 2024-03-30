package X;

import android.content.Context;
import android.view.LayoutInflater;

/* renamed from: X.1RP  reason: invalid class name */
public final class AnonymousClass1RP extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ Context $context;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1RP(Context context) {
        super(0);
        this.$context = context;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return LayoutInflater.from(this.$context);
    }
}
