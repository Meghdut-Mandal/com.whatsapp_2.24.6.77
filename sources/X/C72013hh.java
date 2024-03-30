package X;

/* renamed from: X.3hh  reason: invalid class name and case insensitive filesystem */
public class C72013hh implements AnonymousClass15z {
    public /* synthetic */ void B7s(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("agent_device_index", "CREATE INDEX IF NOT EXISTS agent_device_index ON agent_devices (device)");
    }

    public void B7q(AnonymousClass38H r8, C65063Qo r9) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r5 = new C64563Om[5];
        A00.A02 = "agent_id";
        C52502pX r4 = C52502pX.TEXT;
        A00.A00 = r4;
        A00.A05 = true;
        C63573Ko.A0b(A00, r5);
        r5[1] = new C64563Om(r4, "agent_name", "UNIQUE NOT NULL");
        A00.A02 = "device";
        C52502pX r1 = C52502pX.INTEGER;
        C63573Ko.A0T(A00, r1, r5);
        C63573Ko.A09(A00, r1, "last_modified_time", r5);
        A00.A02 = "is_deleted";
        A00.A00 = C52502pX.BOOLEAN;
        C63573Ko.A0c(A00, r5);
        r9.A0B("agent_devices", r5);
    }
}
