package X;

import android.view.ViewTreeObserver;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.components.SelectionCheckView;
import com.whatsapp.registration.phonenumberentry.ChangeNumberNotifyContacts;

/* renamed from: X.4Yt  reason: invalid class name and case insensitive filesystem */
public class C90014Yt implements ViewTreeObserver.OnPreDrawListener {
    public Object A00;
    public boolean A01;
    public final int A02;

    public C90014Yt(int i, Object obj, boolean z) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = z;
    }

    public boolean onPreDraw() {
        if (this.A02 != 0) {
            SelectionCheckView selectionCheckView = ((AnonymousClass3B3) this.A00).A08;
            C36351kA.A1D(selectionCheckView, this);
            selectionCheckView.A04(this.A01, true);
            return false;
        }
        ChangeNumberNotifyContacts changeNumberNotifyContacts = (ChangeNumberNotifyContacts) this.A00;
        C36351kA.A1D(changeNumberNotifyContacts.A04, this);
        SwitchCompat switchCompat = changeNumberNotifyContacts.A06;
        boolean z = this.A01;
        switchCompat.setChecked(!z);
        changeNumberNotifyContacts.A06.setChecked(z);
        return false;
    }
}
