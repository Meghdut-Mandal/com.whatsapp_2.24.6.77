package X;

import com.whatsapp.R;

/* renamed from: X.7OU  reason: invalid class name */
public final class AnonymousClass7OU extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C163397q8 $listener;
    public final /* synthetic */ C157077bn $poolingContainerListener;
    public final /* synthetic */ C92424dv $view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7OU(C92424dv r2, C157077bn r3, C163397q8 r4) {
        super(0);
        this.$view = r2;
        this.$listener = r4;
        this.$poolingContainerListener = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        this.$view.removeOnAttachStateChangeListener(this.$listener);
        C92424dv r3 = this.$view;
        C157077bn r2 = this.$poolingContainerListener;
        C36321k7.A0w(r3, r2);
        C114425hE r0 = (C114425hE) r3.getTag(R.id.pooling_container_listener_holder_tag);
        if (r0 == null) {
            r0 = new C114425hE();
            r3.setTag(R.id.pooling_container_listener_holder_tag, r0);
        }
        r0.A00.remove(r2);
        return AnonymousClass0AJ.A00;
    }
}
