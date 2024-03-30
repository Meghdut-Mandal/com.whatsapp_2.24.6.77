package X;

import android.content.ContentValues;

/* renamed from: X.1Jq  reason: invalid class name and case insensitive filesystem */
public class C26301Jq {
    public final AnonymousClass12P A00;

    public static void A00(C26911Lz r4, C180868mY r5, long j) {
        ContentValues contentValues = new ContentValues(3);
        contentValues.put("message_add_on_row_id", Long.valueOf(j));
        contentValues.put("reaction", r5.A01);
        contentValues.put("sender_timestamp", Long.valueOf(r5.A00));
        ((AnonymousClass1M0) r4).A02.A05("message_add_on_reaction", "MessageAddOnReactionStore/insertMessageAddOnReaction", contentValues);
    }

    public C26301Jq(AnonymousClass12P r1) {
        this.A00 = r1;
    }
}
