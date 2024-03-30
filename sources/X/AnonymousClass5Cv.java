package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerRecyclerView;
import java.util.List;
import java.util.Map;

/* renamed from: X.5Cv  reason: invalid class name */
public class AnonymousClass5Cv extends AnonymousClass6Q0 {
    public long A00;
    public boolean A01;
    public final AnonymousClass1AP A02;
    public final List A03 = AnonymousClass001.A0I();
    public final Map A04;

    public AnonymousClass5Cv(RecyclerView recyclerView, C117475mK r4, ShapePickerRecyclerView shapePickerRecyclerView, AnonymousClass1AP r6) {
        super(recyclerView, r4, shapePickerRecyclerView, true);
        this.A02 = r6;
        this.A00 = 0;
        this.A04 = AnonymousClass001.A0J();
    }

    public void A01(C96694nk r6, boolean z) {
        super.A01(r6, z);
        View view = r6.A0H;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        RecyclerView recyclerView = this.A05;
        Resources A0F = C36341k9.A0F(recyclerView);
        int i = R.dimen.f7nameremoved;
        if (z) {
            i = R.dimen.f7nameremoved;
        }
        layoutParams.width = A0F.getDimensionPixelSize(i);
        view.setLayoutParams(layoutParams);
        ImageView imageView = r6.A01;
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        Resources A0F2 = C36341k9.A0F(recyclerView);
        int i2 = R.dimen.f7nameremoved;
        if (z) {
            i2 = R.dimen.f7nameremoved;
        }
        int dimensionPixelSize = A0F2.getDimensionPixelSize(i2);
        layoutParams2.width = dimensionPixelSize;
        layoutParams2.height = dimensionPixelSize;
        imageView.setLayoutParams(layoutParams2);
    }
}
