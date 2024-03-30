package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.5BK  reason: invalid class name */
public class AnonymousClass5BK extends C1496572e {
    public void run() {
        File A0H = AnonymousClass1GW.A0H(this.A02, this.A04);
        if (A0H.exists() && !A0H.delete()) {
            Log.w("MediaDeleteDoodleJob/failed-delete-doodle-file");
        }
    }

    public AnonymousClass5BK(Context context, C20690y0 r2, AnonymousClass1H2 r3, AnonymousClass4R0 r4, String str) {
        super(context, r2, r3, r4, str);
    }
}
