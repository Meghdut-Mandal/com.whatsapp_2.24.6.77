package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

/* renamed from: X.2mi  reason: invalid class name and case insensitive filesystem */
public final class C50832mi extends WDSButton implements C22928Aye {
    public C87194Nv A00;
    public C39891uA A01;
    public boolean A02;

    public C50832mi(Context context) {
        super(context, (AttributeSet) null);
        A04();
        setAction(C34301gn.DESTRUCTIVE);
        setVariant(C27981Qp.OUTLINE);
        setText(R.string.f12nameremoved);
        setIcon((int) R.drawable.ic_exit_group);
    }

    public final void setViewModelFactory(C87194Nv r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public void A04() {
        if (!this.A02) {
            this.A02 = true;
            C27861Qc r1 = (C27861Qc) ((C27851Qb) generatedComponent());
            C36321k7.A0k(r1.A0M, this);
            this.A00 = (C87194Nv) r1.A03.get();
        }
    }

    public final C87194Nv getViewModelFactory() {
        C87194Nv r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("viewModelFactory");
    }

    public List getCTAViews() {
        return C36371kC.A11(this);
    }
}
