package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.biz.catalog.view.widgets.QuantitySelector;

/* renamed from: X.7Og  reason: invalid class name and case insensitive filesystem */
public final class C153417Og extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C159967kF $adapter;
    public final /* synthetic */ View $itemView;
    public final /* synthetic */ C88374Sl $quantityPickerListener;
    public final /* synthetic */ C102264ze this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C153417Og(View view, C159967kF r3, C102264ze r4, C88374Sl r5) {
        super(0);
        this.$itemView = view;
        this.$adapter = r3;
        this.this$0 = r4;
        this.$quantityPickerListener = r5;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        View findViewById = this.$itemView.findViewById(R.id.product_item_quantity_selector);
        C159967kF r3 = this.$adapter;
        C102264ze r2 = this.this$0;
        C88374Sl r1 = this.$quantityPickerListener;
        QuantitySelector quantitySelector = (QuantitySelector) findViewById;
        quantitySelector.setCollapsible(true);
        quantitySelector.setVisibility(0);
        quantitySelector.A04 = new C69413dU(r3, r2, r1);
        quantitySelector.A03 = new C143136q3(r3, r2, r1);
        return quantitySelector;
    }
}
