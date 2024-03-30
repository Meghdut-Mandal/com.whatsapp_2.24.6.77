package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import java.util.List;

/* renamed from: X.AlU  reason: case insensitive filesystem */
public final class C22367AlU extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass8X1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22367AlU(AnonymousClass8X1 r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        AnonymousClass00C.A0D(bitmap, 0);
        AnonymousClass8X1 r1 = this.this$0;
        List list = AnonymousClass0D3.A0I;
        ((ImageView) r1.A01.getValue()).setImageBitmap(bitmap);
        return AnonymousClass0AJ.A00;
    }
}
