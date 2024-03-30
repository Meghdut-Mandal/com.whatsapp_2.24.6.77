package X;

import com.whatsapp.R;

/* renamed from: X.4Ml  reason: invalid class name and case insensitive filesystem */
public final class C86834Ml extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C225314u $activity;
    public final /* synthetic */ C006302t $threadOpener;
    public final /* synthetic */ C51582o3 $tosType;
    public final /* synthetic */ AnonymousClass3UC this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86834Ml(C225314u r2, C51582o3 r3, AnonymousClass3UC r4, C006302t r5) {
        super(1);
        this.this$0 = r4;
        this.$activity = r2;
        this.$threadOpener = r5;
        this.$tosType = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean A1X = AnonymousClass000.A1X(obj);
        AnonymousClass3UC r3 = this.this$0;
        C225314u r2 = this.$activity;
        if (A1X) {
            AnonymousClass3UC.A03(r2, this.$tosType, r3, this.$threadOpener);
        } else {
            r2.BO5(R.string.f12nameremoved);
        }
        return AnonymousClass0AJ.A00;
    }
}
