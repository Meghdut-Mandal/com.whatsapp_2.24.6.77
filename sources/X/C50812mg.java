package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

/* renamed from: X.2mg  reason: invalid class name and case insensitive filesystem */
public final class C50812mg extends WDSButton implements C22928Aye {
    public boolean A00;

    public C50812mg(Context context) {
        super(context, (AttributeSet) null);
        A04();
        setVariant(C27981Qp.BORDERLESS);
        setText(R.string.f12nameremoved);
        setIcon((int) R.drawable.ic_safety_tip_wds);
    }

    public void A04() {
        if (!this.A00) {
            this.A00 = true;
            C36321k7.A0k(C36391kE.A0W(generatedComponent()), this);
        }
    }

    public List getCTAViews() {
        return C36371kC.A11(this);
    }
}
