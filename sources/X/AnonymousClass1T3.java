package X;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import org.json.JSONObject;

/* renamed from: X.1T3  reason: invalid class name */
public final class AnonymousClass1T3 implements AnonymousClass1T2 {
    public final C19630wG A00;
    public final AnonymousClass190 A01;

    public AnonymousClass1T3(C19630wG r2, AnonymousClass190 r3) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public void Bl5(boolean z) {
        Intent A0U;
        String obj = new JSONObject(C000300d.A03(new AnonymousClass011("server_params", C000300d.A03(new AnonymousClass011("is_bottom_sheet", Boolean.valueOf(z)))))).toString();
        AnonymousClass00C.A08(obj);
        Context context = this.A00.A00;
        if (z) {
            A0U = new Intent();
            A0U.setClassName(context, "com.whatsapp.wabloks.ui.WaBloksBottomSheetActivity");
            A0U.putExtra("screen_name", "com.bloks.www.whatsapp.ai.biz.learn_more");
            A0U.putExtra("screen_params", obj);
            A0U.putExtra("is_async_component", false);
        } else {
            A0U = AnonymousClass190.A0U(context, (Parcelable) null, "com.bloks.www.whatsapp.ai.biz.learn_more", obj);
        }
        AnonymousClass00C.A0B(A0U);
        A0U.setFlags(268435456);
        context.startActivity(A0U);
    }
}
