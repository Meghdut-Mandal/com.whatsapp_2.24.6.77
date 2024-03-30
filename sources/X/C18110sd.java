package X;

import android.view.View;
import androidx.appcompat.widget.AppCompatSpinner;

/* renamed from: X.0sd  reason: invalid class name and case insensitive filesystem */
public class C18110sd extends C09150bu {
    public Object A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18110sd(View view, Object obj, Object obj2, int i) {
        super(view);
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public C17250qy A01() {
        if (this.A02 != 0) {
            return (C09470cQ) this.A01;
        }
        C03460Fe r0 = ((C03480Fl) this.A00).A00.A0F;
        if (r0 == null) {
            return null;
        }
        return r0.A00();
    }

    public boolean A02() {
        if (this.A02 != 0) {
            return super.A02();
        }
        C09460cP r1 = ((C03480Fl) this.A00).A00;
        if (r1.A0D != null) {
            return false;
        }
        r1.A01();
        return true;
    }

    public boolean A03() {
        if (this.A02 != 0) {
            AppCompatSpinner appCompatSpinner = (AppCompatSpinner) this.A00;
            C17360rA r2 = appCompatSpinner.A01;
            if (r2.BNH()) {
                return true;
            }
            r2.Btd(appCompatSpinner.getTextDirection(), appCompatSpinner.getTextAlignment());
            return true;
        }
        ((C03480Fl) this.A00).A00.A03();
        return true;
    }
}
