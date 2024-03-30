package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerRecyclerView;

/* renamed from: X.5Cw  reason: invalid class name and case insensitive filesystem */
public class C104995Cw extends AnonymousClass6Q0 {
    public static final int[] A01 = {R.drawable.ic_emoji_people, R.drawable.ic_emoji_nature, R.drawable.ic_emoji_food, R.drawable.ic_emoji_activity, R.drawable.ic_emoji_travel, R.drawable.ic_emoji_objects, R.drawable.ic_emoji_symbols, R.drawable.ic_emoji_flags};
    public static final int[] A02 = {R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved};
    public final C96304n7 A00;

    public C104995Cw(RecyclerView recyclerView, C117475mK r6, ShapePickerRecyclerView shapePickerRecyclerView) {
        super(recyclerView, r6, shapePickerRecyclerView, false);
        Resources A0F = C36341k9.A0F(recyclerView);
        C96304n7 r0 = new C96304n7(A0F.getDimensionPixelSize(R.dimen.f7nameremoved), A0F.getDimensionPixelSize(R.dimen.f7nameremoved), A0F.getDimensionPixelSize(R.dimen.f7nameremoved));
        this.A00 = r0;
        recyclerView.A0t(r0);
    }

    public void A01(C96694nk r8, boolean z) {
        int i;
        super.A01(r8, z);
        ImageView imageView = r8.A01;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        RecyclerView recyclerView = this.A05;
        Resources A0F = C36341k9.A0F(recyclerView);
        int i2 = R.dimen.f7nameremoved;
        if (z) {
            i2 = R.dimen.f7nameremoved;
        }
        int dimensionPixelSize = A0F.getDimensionPixelSize(i2);
        float f = (float) dimensionPixelSize;
        float A002 = C36441kJ.A00(C36341k9.A0F(recyclerView), R.dimen.f7nameremoved);
        float f2 = 1.0f;
        if (z) {
            f2 = 0.9f;
        }
        int i3 = ((int) (f - (A002 * f2))) / 2;
        layoutParams.width = dimensionPixelSize;
        layoutParams.height = dimensionPixelSize;
        imageView.setLayoutParams(layoutParams);
        imageView.setPadding(i3, i3, i3, i3);
        View view = r8.A0H;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (z) {
            i = C36341k9.A0F(recyclerView).getDimensionPixelOffset(R.dimen.f7nameremoved);
        } else {
            i = -2;
        }
        layoutParams2.width = i;
        view.setLayoutParams(layoutParams2);
        this.A00.A00 = z;
    }
}
