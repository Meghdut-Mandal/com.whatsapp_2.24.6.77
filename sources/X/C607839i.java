package X;

import android.view.View;
import android.widget.CheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.39i  reason: invalid class name and case insensitive filesystem */
public final class C607839i {
    public final CheckBox A00;
    public final ConstraintLayout A01;
    public final WaImageView A02;
    public final WaTextView A03;
    public final WaTextView A04;
    public final WaTextView A05;

    public C607839i(View view) {
        AnonymousClass00C.A0D(view, 1);
        this.A01 = (ConstraintLayout) C36361kB.A0F(view, R.id.account_switching_item);
        this.A04 = C36351kA.A0Q(view, R.id.account_item_name_textview);
        this.A05 = C36351kA.A0Q(view, R.id.account_item_number_textview);
        this.A00 = (CheckBox) C36361kB.A0F(view, R.id.account_item_status);
        this.A02 = (WaImageView) C36361kB.A0F(view, R.id.account_item_profile_imageview);
        this.A03 = C36351kA.A0Q(view, R.id.account_badge_count);
    }
}
