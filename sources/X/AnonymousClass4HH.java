package X;

import android.view.ViewGroup;

/* renamed from: X.4HH  reason: invalid class name */
public final class AnonymousClass4HH extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C27731Pn $contactPhotos;
    public final /* synthetic */ ViewGroup $container;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4HH(ViewGroup viewGroup, C27731Pn r3) {
        super(0);
        this.$contactPhotos = r3;
        this.$container = viewGroup;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return this.$contactPhotos.A05(this.$container.getContext(), "status-details-panel");
    }
}
