package X;

import android.content.ContentValues;

/* renamed from: X.7OZ  reason: invalid class name */
public final class AnonymousClass7OZ extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ long $messageRowId;
    public final /* synthetic */ C134876bk $uniqueIdEnforced;
    public final /* synthetic */ C132396Tl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7OZ(C132396Tl r2, C134876bk r3, long j) {
        super(0);
        this.$uniqueIdEnforced = r3;
        this.this$0 = r2;
        this.$messageRowId = j;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        ContentValues A0E = C36441kJ.A0E();
        A0E.put("crossposting_status_unique_id", (String) this.$uniqueIdEnforced.A00("XFAM_CROSSPOSTING_DB_SQL"));
        C132396Tl.A01(A0E, this.this$0, C36371kC.A11(Long.valueOf(this.$messageRowId)));
        return AnonymousClass0AJ.A00;
    }
}
