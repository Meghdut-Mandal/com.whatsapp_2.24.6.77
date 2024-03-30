package X;

import org.json.JSONObject;

/* renamed from: X.9cl  reason: invalid class name and case insensitive filesystem */
public class C198019cl {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final boolean A04;

    public C198019cl(C203399nx r3, long j, long j2) {
        this.A03 = j;
        this.A01 = C203399nx.A00(r3, "redeemed_count");
        this.A00 = C203399nx.A00(r3, "reserved_count");
        this.A04 = "1".equalsIgnoreCase(r3.A0h("is_eligible"));
        this.A02 = j2;
    }

    public C198019cl(String str) {
        JSONObject A1C = C36441kJ.A1C(str);
        this.A03 = A1C.getLong("offer_id");
        this.A04 = A1C.getBoolean("is_eligible");
        this.A00 = A1C.getInt("pending_count");
        this.A01 = A1C.getInt("redeemed_count");
        this.A02 = A1C.getLong("last_sync_time_ms");
    }
}
