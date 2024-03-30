package X;

import com.whatsapp.biz.catalog.view.AvailabilityStateTextView;

/* renamed from: X.7U5  reason: invalid class name */
public final class AnonymousClass7U5 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C102234zX $displayItem;
    public final /* synthetic */ boolean $isAvailable;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7U5(C102234zX r2, boolean z) {
        super(1);
        this.$displayItem = r2;
        this.$isAvailable = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AvailabilityStateTextView availabilityStateTextView = (AvailabilityStateTextView) obj;
        AnonymousClass00C.A0D(availabilityStateTextView, 0);
        availabilityStateTextView.setText(this.$displayItem.A00);
        availabilityStateTextView.setAvailable(this.$isAvailable);
        return AnonymousClass0AJ.A00;
    }
}
