package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

/* renamed from: X.2mj  reason: invalid class name and case insensitive filesystem */
public final class C50842mj extends WDSButton implements C22928Aye {
    public C19970wo A00;
    public AnonymousClass190 A01;
    public boolean A02;

    public C50842mj(Context context) {
        super(context, (AttributeSet) null);
        A04();
        setVariant(C27981Qp.OUTLINE);
        setText(R.string.f12nameremoved);
        setIcon((int) R.drawable.ic_action_info);
    }

    public final void setTime(C19970wo r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final void setWaIntents(AnonymousClass190 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public void A04() {
        if (!this.A02) {
            this.A02 = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            C36321k7.A0k(A0W, this);
            this.A00 = C36351kA.A0V(A0W);
            this.A01 = C36351kA.A0h(A0W);
        }
    }

    public final C19970wo getTime() {
        C19970wo r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("time");
    }

    public final AnonymousClass190 getWaIntents() {
        AnonymousClass190 r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0X();
    }

    public List getCTAViews() {
        return C36371kC.A11(this);
    }
}
