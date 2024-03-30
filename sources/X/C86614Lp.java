package X;

import android.content.Intent;
import com.whatsapp.wabloks.ui.WaBloksBottomSheetActivity;

/* renamed from: X.4Lp  reason: invalid class name and case insensitive filesystem */
public final class C86614Lp extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ WaBloksBottomSheetActivity $bloksBottomSheetActivity;
    public final /* synthetic */ AnonymousClass1KH this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86614Lp(AnonymousClass1KH r2, WaBloksBottomSheetActivity waBloksBottomSheetActivity) {
        super(1);
        this.this$0 = r2;
        this.$bloksBottomSheetActivity = waBloksBottomSheetActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass141 r5 = (AnonymousClass141) obj;
        AnonymousClass00C.A0D(r5, 0);
        Intent A1Z = this.this$0.A07.A1Z(this.$bloksBottomSheetActivity, C36351kA.A0j(r5), 20);
        AnonymousClass00C.A08(A1Z);
        this.$bloksBottomSheetActivity.startActivity(A1Z);
        return AnonymousClass0AJ.A00;
    }
}
