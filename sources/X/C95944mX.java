package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4mX  reason: invalid class name and case insensitive filesystem */
public final class C95944mX extends AnonymousClass0CZ {
    public final Context A00;
    public final C1275668u A01;
    public final List A02;

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass00C.A0D(viewGroup, 0);
        return new C96794nu(C36371kC.A0J(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved, false));
    }

    public int A0J() {
        return this.A02.size();
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r6, int i) {
        C96794nu r62 = (C96794nu) r6;
        AnonymousClass00C.A0D(r62, 0);
        List list = this.A02;
        Bitmap bitmap = ((AnonymousClass6BU) list.get(i)).A00;
        ImageView imageView = r62.A00;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        Context context = this.A00;
        imageView.setColorFilter(AnonymousClass00F.A00(context, R.color.f6nameremoved), PorterDuff.Mode.SRC_IN);
        TextView textView = r62.A01;
        textView.setText(((AnonymousClass6BU) list.get(i)).A01);
        C36331k8.A0r(context, textView, R.color.f6nameremoved);
        int intValue = ((AnonymousClass6BU) list.get(i)).A02.intValue();
        TextView textView2 = r62.A02;
        if (textView2 != null) {
            textView2.setText(intValue);
            C36331k8.A0r(context, textView2, R.color.f6nameremoved);
        }
    }

    public C95944mX(Context context, C1275668u r2, List list) {
        this.A00 = context;
        this.A02 = list;
        this.A01 = r2;
    }
}
