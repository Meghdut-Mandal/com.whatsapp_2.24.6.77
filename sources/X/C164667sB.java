package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.conversationslist.ViewHolder;

/* renamed from: X.7sB  reason: invalid class name and case insensitive filesystem */
public class C164667sB implements C34871hm {
    public Object A00;
    public Object A01;
    public final int A02;

    public C164667sB(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final void BZ9(View view) {
        switch (this.A02) {
            case 0:
                Context context = (Context) this.A00;
                Object obj = this.A01;
                ImageView imageView = (ImageView) view;
                C36321k7.A0w(context, obj);
                imageView.setImageResource(R.drawable.vec_ic_lwc_leave);
                imageView.setColorFilter(AnonymousClass00F.A00(context, R.color.f6nameremoved));
                C135456cj.A01(imageView, obj, 17);
                return;
            case 1:
                Context context2 = (Context) this.A01;
                ImageView imageView2 = (ImageView) view;
                if (((ViewHolder) this.A00).A0K.A0E(363)) {
                    AnonymousClass1JZ.A03(imageView2, context2.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), 0);
                }
                boolean z = C222013h.A07;
                int i = R.drawable.ic_inline_mute;
                if (z) {
                    i = R.drawable.ic_inline_mute_filled_wds;
                }
                imageView2.setImageResource(i);
                return;
            default:
                Context context3 = (Context) this.A01;
                ImageView imageView3 = (ImageView) view;
                if (((ViewHolder) this.A00).A0K.A0E(363)) {
                    AnonymousClass1JZ.A03(imageView3, context3.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), 0);
                    boolean z2 = C222013h.A07;
                    int i2 = R.drawable.ic_inline_pin_new;
                    if (z2) {
                        i2 = R.drawable.ic_inline_pin_new_filled_wds;
                    }
                    C36391kE.A18(context3, imageView3, i2);
                } else {
                    boolean z3 = C222013h.A07;
                    int i3 = R.drawable.ic_inline_pin;
                    if (z3) {
                        i3 = R.drawable.ic_inline_pin_new_filled_wds;
                    }
                    imageView3.setImageResource(i3);
                }
                C90504aG.A11(context3, imageView3, R.color.f6nameremoved);
                return;
        }
    }
}
