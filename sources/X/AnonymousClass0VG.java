package X;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import java.util.Iterator;

/* renamed from: X.0VG  reason: invalid class name */
public abstract class AnonymousClass0VG {
    public static RemoteInput A00(AnonymousClass0TH r3) {
        RemoteInput.Builder addExtras = new RemoteInput.Builder(r3.A02).setLabel(r3.A01).setChoices(r3.A04).setAllowFreeFormInput(true).addExtras(r3.A00);
        if (Build.VERSION.SDK_INT >= 26) {
            Iterator it = r3.A03.iterator();
            while (it.hasNext()) {
                C05270Pb.A00(addExtras, AnonymousClass001.A0C(it));
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            C05280Pc.A00(addExtras);
        }
        return addExtras.build();
    }

    public static Bundle A01(Intent intent) {
        return RemoteInput.getResultsFromIntent(intent);
    }
}
