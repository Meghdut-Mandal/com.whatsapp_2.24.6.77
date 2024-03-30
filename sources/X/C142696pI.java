package X;

import com.whatsapp.wds.metrics.logging.network.HierarchyUploadScheduler$HierarchyUploadWorker;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6pI  reason: invalid class name and case insensitive filesystem */
public final class C142696pI implements C19710wO {
    public final C194059Ny A00;
    public final C21570zS A01;

    public String BIB() {
        return "HierarchyUploadScheduler";
    }

    public /* synthetic */ void BRM() {
    }

    public void BRL() {
        if (C36331k8.A1b(this.A00.A07)) {
            C97394pF r3 = new C97394pF(HierarchyUploadScheduler$HierarchyUploadWorker.class, TimeUnit.HOURS, 24);
            C1271667f r1 = new C1271667f();
            r1.A00 = C023109s.A0C;
            r1.A02 = true;
            r3.A03(r1.A00());
            r3.A02(5, TimeUnit.MINUTES);
            C161147mG A02 = C90514aH.A0V(this.A01).A02((C97414pH) r3.A00(), C023109s.A01, "name.whatsapp.wds.metrics.logging");
            AnonymousClass00C.A08(A02);
            try {
                ((C138776ig) A02).A00.get();
            } catch (Exception unused) {
            }
        }
    }

    public C142696pI(C194059Ny r1, C21570zS r2) {
        C36321k7.A0x(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }
}
