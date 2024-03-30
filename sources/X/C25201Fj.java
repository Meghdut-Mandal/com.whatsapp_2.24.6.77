package X;

import com.whatsapp.data.ConversationDeleteWorker;
import java.util.Map;

/* renamed from: X.1Fj  reason: invalid class name and case insensitive filesystem */
public class C25201Fj {
    public final C220412q A00;
    public final AnonymousClass1FD A01;
    public final C21570zS A02;

    public void A00(AnonymousClass3B8 r8, String str) {
        C97384pE r5 = new C97384pE(ConversationDeleteWorker.class);
        AnonymousClass6EH r6 = new AnonymousClass6EH();
        Map map = r6.A00;
        map.put("delete_action", str);
        map.put("job_id", Long.valueOf(r8.A06));
        r5.A00.A0A = r6.A00();
        r5.A06(String.valueOf(r8.A07.hashCode()));
        r5.A04(C023109s.A00);
        ((AnonymousClass6VR) this.A02.get()).A08(r5.A00());
    }

    public C25201Fj(C220412q r1, AnonymousClass1FD r2, C21570zS r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}
