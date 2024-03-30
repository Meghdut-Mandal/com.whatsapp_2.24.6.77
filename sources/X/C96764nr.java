package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.mediacomposer.doodle.shapepicker.ShapeItemView;

/* renamed from: X.4nr  reason: invalid class name and case insensitive filesystem */
public class C96764nr extends AnonymousClass0D3 {
    public C161307mX A00;
    public ShapeItemView A01;
    public final /* synthetic */ C96184mv A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96764nr(View view, C96184mv r4) {
        super(view);
        this.A02 = r4;
        ShapeItemView shapeItemView = (ShapeItemView) view.findViewById(R.id.shape_item_view);
        this.A01 = shapeItemView;
        ViewGroup.LayoutParams layoutParams = shapeItemView.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        this.A01.setLayoutParams(layoutParams);
        C135466ck.A00(view, this, 24);
    }
}
