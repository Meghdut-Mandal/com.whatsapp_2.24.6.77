package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.1rE  reason: invalid class name and case insensitive filesystem */
public final class C39111rE extends ConstraintLayout {
    public final WaImageView A00 = ((WaImageView) C36361kB.A0G(this, R.id.bullet_icon));
    public final WaTextView A01 = C36341k9.A0Q(this, R.id.bullet_subtitle);
    public final WaTextView A02 = C36341k9.A0Q(this, R.id.bullet_title);

    public C39111rE(Context context) {
        super(context, (AttributeSet) null);
        int A05 = C36441kJ.A05(context.getResources(), R.dimen.f7nameremoved);
        setPadding(0, A05, 0, A05);
        View.inflate(context, R.layout.f9nameremoved, this);
    }

    public final void setViewState(AnonymousClass3JS r3) {
        AnonymousClass00C.A0D(r3, 0);
        this.A00.setImageResource(r3.A00);
        this.A02.setText(r3.A02);
        WaTextView waTextView = this.A01;
        CharSequence charSequence = r3.A01;
        waTextView.setText(charSequence);
        C65723Tf.A03(waTextView, charSequence);
    }
}
