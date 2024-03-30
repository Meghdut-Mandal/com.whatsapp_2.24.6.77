package X;

import com.whatsapp.util.Log;

/* renamed from: X.8d9  reason: invalid class name and case insensitive filesystem */
public abstract class C177068d9 extends ACR {
    public final C198409dV A00;

    public void A03(C132286Sy r9, int i) {
        int i2 = i;
        if (this instanceof AnonymousClass8W3) {
            AnonymousClass8W3 r4 = (AnonymousClass8W3) this;
            AnonymousClass8W3.A00(r4);
            Log.e("GetSingleCollectionGraphQLService/sendRequest/onErrorResponse");
            AnonymousClass9XP r3 = r4.A01;
            if (!r4.A08(r3.A04, r9.A01, true)) {
                r4.A02.BXK(r3, i);
            }
        } else if (this instanceof AnonymousClass8W1) {
            int i3 = r9.A01;
            AnonymousClass8W1.A00(new C21114A8z(2), (AnonymousClass8W1) this, (Exception) null, "/onErrorResponse", i2, i3, true);
        } else if (this instanceof AnonymousClass8W2) {
            AnonymousClass8W2.A00((AnonymousClass8W2) this, (Exception) null, "/onErrorResponse", i2, r9.A01, true);
        } else if (this instanceof AnonymousClass8W4) {
            AnonymousClass8W4.A00((AnonymousClass8W4) this, (Exception) null, "/onErrorResponse", r9.A01, i2, true, false);
        } else if (this instanceof AnonymousClass8W0) {
            AnonymousClass8W0 r42 = (AnonymousClass8W0) this;
            AnonymousClass8W0.A00(r42);
            C36321k7.A1S("GetCollectionsGraphQLService/onErrorResponse/error - ", AnonymousClass000.A0u(), i);
            C193989Nr r32 = r42.A02;
            if (!r42.A08(r32.A05, r9.A01, true)) {
                r42.A00.A01(r32, i);
            }
        } else if (this instanceof C174308Vz) {
            C174308Vz r43 = (C174308Vz) this;
            try {
                int i4 = r9.A01;
                C128516Co r2 = r43.A01;
                if (!r43.A08(r2.A02, i4, true)) {
                    r43.A03.BXJ(r2, i);
                }
            } catch (Exception unused) {
                r43.A03.BXJ(r43.A01, i);
            }
        } else {
            C174298Vy r33 = (C174298Vy) this;
            try {
                if (!r33.A08(r33.A01.A00, r9.A01, true)) {
                    C174298Vy.A00(r33, i);
                }
            } catch (Exception unused2) {
                C174298Vy.A00(r33, i);
            }
        }
    }

    public C177068d9(C198409dV r1) {
        this.A00 = r1;
    }
}
