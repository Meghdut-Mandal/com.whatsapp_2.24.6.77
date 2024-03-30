package X;

import android.content.ContentValues;

/* renamed from: X.3kj  reason: invalid class name and case insensitive filesystem */
public class C73893kj implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7s(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public static void A00(C224114e r5) {
        ContentValues contentValues = new ContentValues(2);
        contentValues.put("prop_name", "wa_db_schema_version");
        contentValues.put("prop_value", "ConsumerRelease-560baf20bde5471a5862167d0085134f");
        r5.A07("wa_props", C63853Lr.A01("WaDatabaseHelper", "setProp", "WADB_REPLACE_PROPS_STRING"), contentValues);
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] A0l = C63573Ko.A0l(A00);
        boolean A0g = C63573Ko.A0g(A00, C52502pX.INTEGER, A0l);
        A00.A02 = "prop_name";
        C52502pX r1 = C52502pX.TEXT;
        C63573Ko.A0X(A00, r1, A0l, A0g);
        C63573Ko.A08(A00, r1, "prop_value", A0l);
        r7.A0B("wa_props", A0l);
    }
}
