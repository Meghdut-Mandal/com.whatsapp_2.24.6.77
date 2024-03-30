package X;

import com.whatsapp.net.tls13.WtCachedPsk;
import com.whatsapp.watls13.WtPersistentSession;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashSet;

public final class AA4 implements C30631aW {
    public final C21220yr A00;

    public AA4(C21220yr r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public /* synthetic */ void BV3() {
    }

    public void BV2() {
        File[] listFiles;
        LinkedHashSet linkedHashSet;
        long j;
        C21220yr r8 = this.A00;
        synchronized (r8) {
            File A01 = C21220yr.A01(r8);
            if (!(A01 == null || (listFiles = A01.listFiles()) == null)) {
                for (File file : listFiles) {
                    WtPersistentSession A002 = C21220yr.A00(file);
                    if (A002 != null && (linkedHashSet = A002.A03) != null) {
                        Iterator it = linkedHashSet.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            WtCachedPsk wtCachedPsk = (WtCachedPsk) it.next();
                            if (wtCachedPsk.useTestTime) {
                                j = 3600000;
                            } else {
                                j = System.currentTimeMillis();
                            }
                            if (j - wtCachedPsk.ticketIssuedTime <= wtCachedPsk.ticketLifetime) {
                                break;
                            }
                        }
                    }
                    file.delete();
                    file.getAbsolutePath();
                }
            }
        }
    }
}
