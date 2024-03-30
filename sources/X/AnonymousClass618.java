package X;

import android.os.Build;
import com.whatsapp.networkresources.NetworkResourceDownloadWorker;
import java.util.Map;

/* renamed from: X.618  reason: invalid class name */
public class AnonymousClass618 {
    public final C21570zS A00;

    public void A00(C119885qc r7, String str) {
        C1271667f r5 = new C1271667f();
        r5.A00 = C023109s.A01;
        r5.A01 = true;
        r5.A03 = true;
        if (Build.VERSION.SDK_INT >= 23) {
            r5.A01();
        }
        C97384pE r4 = new C97384pE(NetworkResourceDownloadWorker.class);
        AnonymousClass6EH r3 = new AnonymousClass6EH();
        Map map = r3.A00;
        map.put("resource_id", str);
        map.put("resource_filename", r7.A00.fileName);
        r4.A00.A0A = r3.A00();
        r4.A03(r5.A00());
        r4.A06("NetworkResourceDownloadTask-Lazy");
        C90514aH.A0V(this.A00).A07((C97404pG) r4.A00(), C023109s.A00, AnonymousClass000.A0p("Resource-Download-", str, AnonymousClass000.A0u()));
    }

    public AnonymousClass618(C21570zS r1) {
        this.A00 = r1;
    }
}
