package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.1pT  reason: invalid class name and case insensitive filesystem */
public final class C38661pT extends LinearLayout implements C18700tb {
    public AnonymousClass171 A00;
    public AnonymousClass1QZ A01;
    public boolean A02;
    public final View A03;
    public final ImageView A04;
    public final TextView A05;

    public C38661pT(Context context) {
        super(context, (AttributeSet) null, 0, 0);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = C36341k9.A0S(C36391kE.A0W(generatedComponent()));
        }
        View inflate = View.inflate(context, R.layout.f9nameremoved, this);
        AnonymousClass00C.A08(inflate);
        setGravity(17);
        this.A05 = C36341k9.A0M(inflate, R.id.contact_name);
        ImageView A0L = C36341k9.A0L(inflate, R.id.contact_row_photo);
        this.A04 = A0L;
        this.A03 = C36361kB.A0G(inflate, R.id.close);
        C011504z.A06(A0L, 2);
        C33521fV.A04(inflate, R.string.f12nameremoved);
    }

    public final void setWaContactNames(AnonymousClass171 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A01;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass171 getWaContactNames() {
        AnonymousClass171 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0c();
    }
}
