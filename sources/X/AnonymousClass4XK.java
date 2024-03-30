package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.whatsapp.WaPreferenceFragment;

/* renamed from: X.4XK  reason: invalid class name */
public class AnonymousClass4XK implements DialogInterface.OnClickListener {
    public Object A00;
    public final int A01;

    public AnonymousClass4XK(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Activity activity;
        int i2;
        switch (this.A01) {
            case 4:
                Runnable runnable = (Runnable) this.A00;
                dialogInterface.dismiss();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 5:
                AnonymousClass4Y2 r0 = (AnonymousClass4Y2) ((C88644Tm) this.A00);
                int i3 = r0.A01;
                Object obj = r0.A00;
                switch (i3) {
                    case 0:
                        activity = ((AnonymousClass28b) obj).A03;
                        i2 = 0;
                        break;
                    case 1:
                        activity = ((WaPreferenceFragment) obj).A00;
                        if (activity != null) {
                            i2 = 3;
                            break;
                        } else {
                            return;
                        }
                    default:
                        ((C88634Tl) obj).BbO();
                        return;
                }
                AnonymousClass3SJ.A00(activity, i2);
                return;
            default:
                AnonymousClass00S r02 = (AnonymousClass00S) this.A00;
                if (r02 != null) {
                    r02.invoke();
                    return;
                }
                return;
        }
    }
}
