package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.whatsapp.calling.callhistory.group.GroupCallSelectedContactsList;
import com.whatsapp.contact.picker.SelectedContactsList;

/* renamed from: X.1qU  reason: invalid class name and case insensitive filesystem */
public abstract class C38921qU extends RelativeLayout implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;

    public void A01() {
        if (this instanceof GroupCallSelectedContactsList) {
            GroupCallSelectedContactsList groupCallSelectedContactsList = (GroupCallSelectedContactsList) this;
            if (!groupCallSelectedContactsList.A04) {
                groupCallSelectedContactsList.A04 = true;
                C18800tq A0W = C36391kE.A0W(groupCallSelectedContactsList.generatedComponent());
                groupCallSelectedContactsList.A06 = C36341k9.A0S(A0W);
                groupCallSelectedContactsList.A02 = C36341k9.A0T(A0W);
                groupCallSelectedContactsList.A03 = C36351kA.A0q(A0W);
            }
        } else if (!this.A01) {
            this.A01 = true;
            ((SelectedContactsList) this).A06 = C36341k9.A0S(((C27861Qc) ((C27851Qb) generatedComponent())).A0M);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C38921qU(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
    }
}
