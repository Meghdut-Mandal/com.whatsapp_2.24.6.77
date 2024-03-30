package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

/* renamed from: X.97N  reason: invalid class name */
public abstract class AnonymousClass97N {
    public static void A00(Context context, C202319lY r5, B66 b66, String str, int i) {
        if (b66 != null) {
            AnonymousClass11F r1 = r5.A0C;
            Intent A0H = C36441kJ.A0H(context, b66.BFn());
            C202319lY.A01(A0H, r5, r1);
            C203419nz r0 = C203419nz.$redex_init_class;
            A0H.putExtra("extra_transaction_detail_data", new C206289t2(r5));
            C165597tg.A0z(A0H, str);
            if (!TextUtils.isEmpty((CharSequence) null)) {
                A0H.putExtra("extra_origin_screen", (String) null);
            }
            A0H.putExtra("extra_payment_flow_entry_point", i);
            context.startActivity(A0H);
        }
    }
}
