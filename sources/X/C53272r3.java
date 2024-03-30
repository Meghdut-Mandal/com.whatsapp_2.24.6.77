package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;
import java.util.Objects;

/* renamed from: X.2r3  reason: invalid class name and case insensitive filesystem */
public abstract class C53272r3 {
    public static void A00(Context context, ImageView imageView, AnonymousClass30T r5) {
        C165737u4 r2 = new C165737u4();
        C203529oE.A06(context, R.raw.wds_anim_e2ee_backup).A02(new C68303bg(r2, r5));
        imageView.setImageDrawable(r2);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        layoutParams.height = -2;
        imageView.setLayoutParams(layoutParams);
    }
}
