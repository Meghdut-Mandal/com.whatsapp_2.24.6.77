package X;

import android.view.View;
import com.google.android.material.imageview.ShapeableImageView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

/* renamed from: X.4nx  reason: invalid class name and case insensitive filesystem */
public final class C96824nx extends AnonymousClass0D3 {
    public final View A00;
    public final View A01;
    public final ShapeableImageView A02;
    public final WaImageView A03;
    public final AnonymousClass1RJ A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96824nx(View view) {
        super(view);
        AnonymousClass00C.A0D(view, 1);
        ShapeableImageView shapeableImageView = (ShapeableImageView) C36361kB.A0G(view, R.id.icon);
        float dimension = view.getResources().getDimension(R.dimen.f7nameremoved);
        AnonymousClass06M r1 = new AnonymousClass06M(shapeableImageView.A07);
        r1.A01(dimension);
        shapeableImageView.setShapeAppearanceModel(new AnonymousClass06J(r1));
        this.A02 = shapeableImageView;
        this.A03 = C90474aD.A0P(view, R.id.selector);
        this.A00 = C36361kB.A0G(view, R.id.badge);
        this.A01 = C36361kB.A0G(view, R.id.tap_area);
        this.A04 = C36341k9.A0X(view, R.id.plus_icon);
    }
}
