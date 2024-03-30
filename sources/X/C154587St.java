package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.extensions.phoenix.view.FlowsInitialLoadingView;

/* renamed from: X.7St  reason: invalid class name and case insensitive filesystem */
public final class C154587St extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ FlowsInitialLoadingView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154587St(FlowsInitialLoadingView flowsInitialLoadingView) {
        super(1);
        this.this$0 = flowsInitialLoadingView;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        AnonymousClass1RJ r2 = this.this$0.A09;
        if (r2 == null) {
            throw C36331k8.A0d("businessLogoViewStubHolder");
        }
        int i = 8;
        if (bitmap != null) {
            i = 0;
        }
        r2.A03(i);
        if (bitmap != null) {
            AnonymousClass1RJ r0 = this.this$0.A09;
            if (r0 == null) {
                throw C36331k8.A0d("businessLogoViewStubHolder");
            }
            ((ImageView) r0.A01()).setImageBitmap(bitmap);
        }
        return AnonymousClass0AJ.A00;
    }
}
