package X;

import android.widget.ImageView;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4Wv  reason: invalid class name and case insensitive filesystem */
public class C89514Wv implements C22914AyQ {
    public Object A00;
    public final int A01;

    public C89514Wv(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BRO(C21097A8i a8i) {
        ImageView imageView;
        int i = this.A01;
        Object obj = this.A00;
        switch (i) {
            case 0:
                List list = AnonymousClass0D3.A0I;
                ((C42211yS) obj).A01.setImageResource(R.color.f6nameremoved);
                return;
            case 4:
                imageView = (ImageView) obj;
                if (imageView == null) {
                    return;
                }
                break;
            default:
                imageView = (ImageView) obj;
                break;
        }
        C53332r9.A00(imageView);
    }
}
