package X;

import android.view.View;
import com.whatsapp.R;

/* renamed from: X.3tf  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C79403tf implements C34871hm {
    public final /* synthetic */ AnonymousClass36T A00;
    public final /* synthetic */ AnonymousClass31J A01;
    public final /* synthetic */ AnonymousClass141 A02;

    public /* synthetic */ C79403tf(AnonymousClass36T r1, AnonymousClass31J r2, AnonymousClass141 r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final void BZ9(View view) {
        AnonymousClass36T r4 = this.A00;
        AnonymousClass141 r3 = this.A02;
        AnonymousClass31J r2 = this.A01;
        AnonymousClass00C.A0D(r2, 2);
        AnonymousClass3YF.A00(view.findViewById(R.id.unblock_button_blocked_chat_footer), r4, r3, 47);
        AnonymousClass3YF.A00(view.findViewById(R.id.delete_button_blocked_chat_footer), r4, r2, 46);
    }
}
