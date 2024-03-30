package X;

import com.whatsapp.biz.catalog.view.AvailabilityStateImageView;
import java.util.List;

/* renamed from: X.7Ui  reason: invalid class name and case insensitive filesystem */
public final class C154987Ui extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C102244zY $displayItem;
    public final /* synthetic */ boolean $isAvailable;
    public final /* synthetic */ C96784nt this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154987Ui(C102244zY r2, C96784nt r3, boolean z) {
        super(1);
        this.this$0 = r3;
        this.$isAvailable = z;
        this.$displayItem = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AvailabilityStateImageView availabilityStateImageView = (AvailabilityStateImageView) obj;
        AnonymousClass00C.A0D(availabilityStateImageView, 0);
        C96784nt r1 = this.this$0;
        List list = AnonymousClass0D3.A0I;
        AnonymousClass9HG r6 = new AnonymousClass9HG(new AnonymousClass9ED(897459302), r1.A02);
        availabilityStateImageView.setAvailable(this.$isAvailable);
        C96784nt r12 = this.this$0;
        r12.A00.A01(availabilityStateImageView, this.$displayItem.A00, (C22914AyQ) null, r6, (C22915AyR) null, r12.A01, 2);
        return AnonymousClass0AJ.A00;
    }
}
