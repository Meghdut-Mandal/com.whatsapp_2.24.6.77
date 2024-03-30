package X;

import android.content.Context;
import java.util.Set;

/* renamed from: X.9GV  reason: invalid class name */
public class AnonymousClass9GV {
    public Context A00;
    public Set A01 = C36441kJ.A16();

    public AnonymousClass9GV(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.A00 = applicationContext;
        if (applicationContext == null) {
            this.A00 = context;
        }
    }
}
