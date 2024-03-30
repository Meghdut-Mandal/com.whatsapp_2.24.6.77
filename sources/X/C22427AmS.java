package X;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: X.AmS  reason: case insensitive filesystem */
public final class C22427AmS extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass804 $this_apply;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22427AmS(AnonymousClass804 r2) {
        super(1);
        this.$this_apply = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        AnonymousClass804 r0 = this.$this_apply;
        if (bitmap != null) {
            r0.A00.setImageBitmap(bitmap);
        } else {
            ImageView imageView = r0.A00;
            imageView.setImageDrawable(C36401kF.A0A(imageView));
        }
        return AnonymousClass0AJ.A00;
    }
}
