package X;

import org.json.JSONObject;

/* renamed from: X.2cM  reason: invalid class name */
public final class AnonymousClass2cM extends AnonymousClass2bI {
    public int A00;
    public int A01;

    public synchronized void A16(String str) {
        if (str != null) {
            JSONObject A1C = C36441kJ.A1C(str);
            this.A00 = A1C.getInt("bizOptOutAction");
            this.A01 = A1C.getInt("bizOptOutCategory");
        }
    }

    public AnonymousClass2cM(C64933Qa r2, long j) {
        super(r2, 153, j);
    }
}
