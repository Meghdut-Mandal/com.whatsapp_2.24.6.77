package X;

import android.content.DialogInterface;
import com.whatsapp.R;

/* renamed from: X.3HP  reason: invalid class name */
public final class AnonymousClass3HP {
    public final DialogInterface.OnClickListener A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass3HP) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass3HP) obj).A00));
    }

    public AnonymousClass3HP(DialogInterface.OnClickListener onClickListener) {
        this.A00 = onClickListener;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, 1664244023);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ButtonAction(textId=");
        A0u.append(R.string.f12nameremoved);
        A0u.append(", clickListener=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
