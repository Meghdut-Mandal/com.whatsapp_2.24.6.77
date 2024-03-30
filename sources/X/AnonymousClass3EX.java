package X;

import android.os.ConditionVariable;
import com.whatsapp.productinfra.datasharingdisclosure.data.network.ConsumerCtwaDisclosureProtocolHelper;

/* renamed from: X.3EX  reason: invalid class name */
public final class AnonymousClass3EX {
    public final C19970wo A00;
    public final ConsumerCtwaDisclosureProtocolHelper A01;
    public final AnonymousClass35I A02;
    public final C005502l A03;
    public final AnonymousClass040 A04;

    public final boolean A00() {
        return AnonymousClass000.A1P((C36411kG.A0E(this.A02.A01).getLong("consumer_disclosure", -1) > -1 ? 1 : (C36411kG.A0E(this.A02.A01).getLong("consumer_disclosure", -1) == -1 ? 0 : -1)));
    }

    public AnonymousClass3EX(C19970wo r2, ConsumerCtwaDisclosureProtocolHelper consumerCtwaDisclosureProtocolHelper, AnonymousClass35I r4, C005502l r5, AnonymousClass040 r6) {
        C36321k7.A18(r2, r5, r6, r4);
        this.A00 = r2;
        this.A03 = r5;
        this.A04 = r6;
        this.A02 = r4;
        this.A01 = consumerCtwaDisclosureProtocolHelper;
        ConditionVariable conditionVariable = C18740tg.A00;
    }
}
