package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.1pJ  reason: invalid class name and case insensitive filesystem */
public final class C38561pJ extends LinearLayout implements C18700tb {
    public TextEmojiLabel A00;
    public WaTextView A01;
    public AnonymousClass1QZ A02;
    public boolean A03;
    public WaImageView A04;

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A02;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public C38561pJ(Context context) {
        super(context);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        View.inflate(getContext(), R.layout.f9nameremoved, this);
        setId(R.id.member_suggested_groups_container);
        C36321k7.A0N(this);
        setBackgroundResource(R.drawable.selector_orange_gradient);
        setOrientation(0);
        C36361kB.A10(getResources(), this, R.dimen.f7nameremoved);
        this.A04 = C36421kH.A0J(this, R.id.member_suggested_groups_icon);
        this.A01 = C36411kG.A0Z(this, R.id.member_suggested_groups_title);
        this.A00 = C36401kF.A0P(this, R.id.member_suggested_groups_description);
        WaImageView waImageView = this.A04;
        if (waImageView != null) {
            waImageView.setImageResource(R.drawable.vec_ic_member_suggested_groups);
        }
    }
}
