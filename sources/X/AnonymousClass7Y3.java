package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.7Y3  reason: invalid class name */
public final class AnonymousClass7Y3 extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ C124145xf this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7Y3(C124145xf r2) {
        super(2);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ImageView imageView = (ImageView) obj;
        String str = (String) obj2;
        C36321k7.A0w(imageView, str);
        AnonymousClass5l9 r3 = this.this$0.A03;
        Drawable A02 = AnonymousClass3UF.A02(imageView.getContext(), R.drawable.ic_business_category, R.color.f6nameremoved);
        AnonymousClass00C.A08(A02);
        r3.A00.A00((Drawable) null, A02, imageView, (C160197kc) null, str);
        return AnonymousClass0AJ.A00;
    }
}
