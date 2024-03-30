package X;

import android.view.ViewGroup;

/* renamed from: X.4M3  reason: invalid class name */
public final class AnonymousClass4M3 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ ViewGroup $container;
    public final /* synthetic */ AnonymousClass383 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4M3(ViewGroup viewGroup, AnonymousClass383 r3) {
        super(1);
        this.this$0 = r3;
        this.$container = viewGroup;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (!((AnonymousClass3IZ) obj).A00.A0N()) {
            AnonymousClass383 r2 = this.this$0;
            ViewGroup viewGroup = this.$container;
            r2.A00 = true;
            viewGroup.setVisibility(8);
        }
        return AnonymousClass0AJ.A00;
    }
}
