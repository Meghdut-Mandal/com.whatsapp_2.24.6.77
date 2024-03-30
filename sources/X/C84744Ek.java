package X;

import com.whatsapp.biz.catalog.view.AvailabilityStateImageView;

/* renamed from: X.4Ek  reason: invalid class name and case insensitive filesystem */
public final class C84744Ek extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ boolean $value;
    public final /* synthetic */ AvailabilityStateImageView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84744Ek(AvailabilityStateImageView availabilityStateImageView, boolean z) {
        super(0);
        this.this$0 = availabilityStateImageView;
        this.$value = z;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C36851lP r2 = this.this$0.A00;
        if (r2 == null) {
            throw C36331k8.A0d("frameDrawable");
        }
        boolean z = this.$value;
        if (r2.A00 != z) {
            r2.A00 = z;
            C36851lP.A00(r2, C36421kH.A03(r2));
            r2.invalidateSelf();
        }
        return AnonymousClass0AJ.A00;
    }
}
