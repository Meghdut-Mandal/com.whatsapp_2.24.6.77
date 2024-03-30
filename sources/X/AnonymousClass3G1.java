package X;

import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.3G1  reason: invalid class name */
public class AnonymousClass3G1 {
    public final C132696Uw A00;
    public final AnonymousClass1A1 A01;

    public AnonymousClass3T1 A00(C128946Ef r6, String str) {
        try {
            JSONArray jSONArray = new JSONArray(this.A00.A03(r6, str));
            if (jSONArray.getInt(0) == 1) {
                String string = jSONArray.getString(1);
                boolean z = jSONArray.getBoolean(2);
                String string2 = jSONArray.getString(3);
                C222713q r0 = AnonymousClass11F.A00;
                AnonymousClass3T1 A03 = this.A01.A03(new C64933Qa(C222713q.A01(string2), string, z));
                if (A03 != null) {
                    return A03;
                }
                throw new SecurityException("Message not found");
            }
            throw new SecurityException("Decryption failed - version mismatch");
        } catch (C19740wR | JSONException e) {
            throw new SecurityException("Decryption failed", e);
        }
    }

    public String A01(C64933Qa r4, C128946Ef r5) {
        JSONArray jSONArray = new JSONArray();
        JSONArray put = jSONArray.put(1).put(r4.A01).put(r4.A02);
        AnonymousClass11F r0 = r4.A00;
        C18740tg.A06(r0);
        put.put(r0.getRawString());
        return this.A00.A04(r5, jSONArray.toString());
    }

    public AnonymousClass3G1(C132696Uw r1, AnonymousClass1A1 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
