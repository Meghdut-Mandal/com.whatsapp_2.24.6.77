package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.5FC  reason: invalid class name */
public abstract class AnonymousClass5FC extends C46482Xv {
    public WaImageButton A00;
    public WaImageView A01;
    public WaTextView A02;
    public WaTextView A03;

    public void A0B() {
        this.A01.setImageDrawable((Drawable) null);
        this.A03.setText("");
        WaTextView waTextView = this.A02;
        waTextView.setText("");
        waTextView.setVisibility(8);
        WaImageButton waImageButton = this.A00;
        waImageButton.setImageDrawable((Drawable) null);
        waImageButton.setVisibility(8);
        waImageButton.setOnClickListener((View.OnClickListener) null);
    }

    public AnonymousClass5FC(View view) {
        super(view);
        this.A01 = C36431kI.A0X(view, R.id.icon);
        this.A03 = C36401kF.A0Q(view, R.id.title);
        this.A02 = C36401kF.A0Q(view, R.id.subtitle);
        this.A00 = (WaImageButton) C012005e.A02(view, R.id.action_button);
    }
}
