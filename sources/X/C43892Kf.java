package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.2Kf  reason: invalid class name and case insensitive filesystem */
public abstract class C43892Kf extends C38231o5 {
    public View A00 = findViewById(R.id.negative_btn);
    public View A01 = findViewById(R.id.positive_btn);
    public ViewGroup A02 = C36411kG.A0P(this, R.id.content);
    public TextView A03 = C36391kE.A0P(this, R.id.header);
    public AnonymousClass13J A04;

    public abstract int getNegativeButtonTextResId();

    public abstract int getPositiveButtonIconResId();

    public abstract int getPositiveButtonTextResId();

    public C43892Kf(Context context) {
        super(context);
        View.inflate(context, R.layout.f9nameremoved, this);
        C36391kE.A0N(this, R.id.positive_btn_icon).setImageResource(getPositiveButtonIconResId());
        TextView A0P = C36391kE.A0P(this, R.id.positive_btn_text);
        TextView A0P2 = C36391kE.A0P(this, R.id.negative_btn_text);
        C33511fU.A03(A0P);
        A0P.setText(getPositiveButtonTextResId());
        C33511fU.A03(A0P2);
        A0P2.setText(getNegativeButtonTextResId());
    }
}
