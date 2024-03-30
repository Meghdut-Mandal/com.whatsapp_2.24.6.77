package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.IntentChooserBottomSheetDialogFragment;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4mV  reason: invalid class name and case insensitive filesystem */
public class C95924mV extends AnonymousClass0CZ {
    public final List A00;
    public final /* synthetic */ IntentChooserBottomSheetDialogFragment A01;

    public C95924mV(IntentChooserBottomSheetDialogFragment intentChooserBottomSheetDialogFragment, List list) {
        this.A01 = intentChooserBottomSheetDialogFragment;
        this.A00 = list;
    }

    public int A0J() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r6, int i) {
        Drawable drawable;
        C96634ne r62 = (C96634ne) r6;
        C134926bp r2 = (C134926bp) this.A00.get(i);
        int i2 = r2.A05;
        r62.A01.setText(r2.A06);
        View view = r62.A0H;
        C36411kG.A1C(view, this, r2, 2);
        C33521fV.A02(view);
        try {
            ImageView imageView = r62.A00;
            Context context = imageView.getContext();
            Integer num = r2.A02;
            if (i2 == 0) {
                drawable = context.getPackageManager().getApplicationIcon("com.whatsapp");
            } else {
                drawable = AnonymousClass00E.A00(context, i2);
            }
            if (!(drawable == null || num == null)) {
                drawable = AnonymousClass08I.A01(drawable);
                AnonymousClass076.A06(drawable, num.intValue());
            }
            imageView.setImageDrawable(drawable);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        boolean A0E = this.A01.A02.A0E(689);
        int i2 = R.layout.f9nameremoved;
        if (A0E) {
            i2 = R.layout.f9nameremoved;
        }
        return new C96634ne(C36361kB.A0E(C36351kA.A0C(viewGroup), viewGroup, i2));
    }
}
