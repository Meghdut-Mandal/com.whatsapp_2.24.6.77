package X;

import android.content.DialogInterface;
import java.lang.ref.WeakReference;

/* renamed from: X.9pF  reason: invalid class name and case insensitive filesystem */
public class C203969pF implements DialogInterface.OnClickListener {
    public final WeakReference A00;

    public void onClick(DialogInterface dialogInterface, int i) {
        WeakReference weakReference = this.A00;
        if (weakReference.get() != null) {
            ((C167717yg) weakReference.get()).A0V(true);
        }
    }

    public C203969pF(C167717yg r2) {
        this.A00 = AnonymousClass001.A0F(r2);
    }
}
