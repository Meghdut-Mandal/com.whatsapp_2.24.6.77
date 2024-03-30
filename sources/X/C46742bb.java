package X;

import android.database.Cursor;
import java.util.HashMap;

/* renamed from: X.2bb  reason: invalid class name and case insensitive filesystem */
public class C46742bb extends AnonymousClass2bM {
    public int A00 = 0;

    public C46742bb(C64933Qa r3, C195759Vv r4, long j, long j2) {
        super(r3, 86, j);
        this.A04 = r4;
        this.A03 = null;
        this.A01 = j2;
        this.A01 = r4.A01.A02 ? 7 : 8;
        this.A00 = 1;
    }

    public void A1c(Cursor cursor, C219712j r7, HashMap hashMap) {
        int i;
        super.A1c(cursor, r7, hashMap);
        int A002 = C224014d.A00("edit_type", hashMap);
        int A003 = C224014d.A00("message_edit_version", hashMap);
        int i2 = cursor.getInt(A002);
        int i3 = 0;
        if (cursor.isNull(A003)) {
            i = 0;
        } else {
            i = cursor.getInt(A003);
        }
        if (i2 != 1) {
            C36321k7.A1S("FMessageScheduledCallEdit/fillMessageAddOn unknown edit type: ", AnonymousClass000.A0u(), i2);
            i2 = 0;
        }
        if (i == 7 || i == 8) {
            i3 = i;
        } else {
            C36321k7.A1S("FMessageScheduledCallEdit/fillMessageAddOn unknown edit version: ", AnonymousClass000.A0u(), i);
        }
        this.A00 = i2;
        this.A01 = i3;
    }

    public C46742bb(C64933Qa r2, long j) {
        super(r2, 86, j);
    }
}
