package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import androidx.fragment.app.DialogFragment;
import java.lang.ref.Reference;

/* renamed from: X.4X2  reason: invalid class name */
public class AnonymousClass4X2 implements AnonymousClass4PI {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4X2(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public void BfK(boolean z) {
        Context A0G;
        if (this.A02 != 0) {
            Reference reference = (Reference) this.A00;
            Intent intent = (Intent) this.A01;
            if (z && (A0G = C36441kJ.A0G(reference)) != null) {
                A0G.startActivity(intent);
            }
        } else if (z) {
            Looper.getMainLooper();
            C36401kF.A0L((Activity) this.A00).Btl((DialogFragment) this.A01, "SharePhoneNumberBottomSheet");
        }
    }
}
