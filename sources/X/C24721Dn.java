package X;

import com.whatsapp.privacy.protocol.xmpp.DisclosureGetStageByIdsWorker;
import com.whatsapp.privacy.protocol.xmpp.DisclosureMetadataGetWorker;
import com.whatsapp.privacy.protocol.xmpp.DisclosureResultSendWorker;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1Dn  reason: invalid class name and case insensitive filesystem */
public class C24721Dn {
    public final C21570zS A00;
    public volatile int A01 = 0;

    public void A00(int i, int i2) {
        AnonymousClass6EH r1 = new AnonymousClass6EH();
        r1.A01("disclosure_id", i);
        r1.A01("result", i2);
        AnonymousClass6X2 A002 = r1.A00();
        C1271667f r12 = new C1271667f();
        r12.A00 = C023109s.A01;
        C132316Tb A003 = r12.A00();
        C97384pE r4 = new C97384pE(DisclosureResultSendWorker.class);
        r4.A06("tag.whatsapp.privacy.SendDisclosureResult");
        r4.A03(A003);
        Integer num = C023109s.A00;
        r4.A05(num, TimeUnit.HOURS, 1);
        r4.A00.A0A = A002;
        StringBuilder sb = new StringBuilder();
        sb.append("tag.whatsapp.privacy.SendDisclosureResult.");
        sb.append(i);
        sb.append(".");
        sb.append(i2);
        String obj = sb.toString();
        ((AnonymousClass6VR) this.A00.get()).A07((C97404pG) r4.A00(), num, obj);
    }

    public void A01(boolean z, int i) {
        AnonymousClass6EH r1 = new AnonymousClass6EH();
        r1.A01("disclosure_id", i);
        AnonymousClass6X2 A002 = r1.A00();
        C1271667f r12 = new C1271667f();
        r12.A00 = C023109s.A01;
        C132316Tb A003 = r12.A00();
        C97384pE r4 = new C97384pE(DisclosureMetadataGetWorker.class);
        r4.A06("tag.whatsapp.privacy.GetDisclosureMetadata");
        r4.A00.A0A = A002;
        Integer num = C023109s.A00;
        if (z) {
            r4.A05(num, TimeUnit.SECONDS, 10);
            r4.A04(num);
        } else {
            r4.A05(num, TimeUnit.MINUTES, 30);
            r4.A03(A003);
        }
        C97404pG r42 = (C97404pG) r4.A00();
        StringBuilder sb = new StringBuilder();
        sb.append("tag.whatsapp.privacy.GetDisclosureMetadata.");
        sb.append(this.A01);
        String obj = sb.toString();
        this.A01++;
        if (this.A01 > 1000) {
            this.A01 = 0;
        }
        ((AnonymousClass6VR) this.A00.get()).A07(r42, num, obj);
    }

    public void A02(int[] iArr) {
        AnonymousClass6EH r1 = new AnonymousClass6EH();
        r1.A02("disclosure_ids", iArr);
        AnonymousClass6X2 A002 = r1.A00();
        C1271667f r12 = new C1271667f();
        r12.A00 = C023109s.A01;
        C132316Tb A003 = r12.A00();
        C97384pE r3 = new C97384pE(DisclosureGetStageByIdsWorker.class);
        r3.A06("tag.whatsapp.privacy.GetDisclosureStageByIds");
        r3.A00.A0A = A002;
        r3.A03(A003);
        Integer num = C023109s.A00;
        r3.A05(num, TimeUnit.MINUTES, 30);
        C97404pG r32 = (C97404pG) r3.A00();
        StringBuilder sb = new StringBuilder();
        sb.append("tag.whatsapp.privacy.GetDisclosureStageByIds.");
        sb.append(this.A01);
        String obj = sb.toString();
        this.A01++;
        if (this.A01 > 1000) {
            this.A01 = 0;
        }
        ((AnonymousClass6VR) this.A00.get()).A07(r32, num, obj);
    }

    public C24721Dn(C21570zS r2) {
        this.A00 = r2;
    }
}
