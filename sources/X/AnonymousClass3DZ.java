package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.3DZ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3DZ {
    public final /* synthetic */ C207269up A00;
    public final /* synthetic */ C102264ze A01;
    public final /* synthetic */ UserJid A02;

    public /* synthetic */ AnonymousClass3DZ(C207269up r1, C102264ze r2, UserJid userJid) {
        this.A01 = r2;
        this.A02 = userJid;
        this.A00 = r1;
    }

    public final void A00() {
        Bundle bundle;
        C102264ze r2 = this.A01;
        UserJid userJid = this.A02;
        C207269up r1 = this.A00;
        List list = AnonymousClass0D3.A0I;
        View view = r2.A0H;
        Context context = view.getContext();
        String str = r1.A0F;
        Intent A0D = C36431kI.A0D();
        A0D.setClassName(context.getPackageName(), "com.whatsapp.biz.product.view.activity.ProductBottomSheetTransparentActivity");
        A0D.putExtra("extra_product_id", str);
        A0D.putExtra("extra_product_owner_id", userJid);
        Activity A012 = C18860tw.A01(view.getContext(), AnonymousClass01L.class);
        if (A012 != null) {
            A0D.putExtra("view_product_origin", 3);
            if (!C64013Mh.A00) {
                bundle = null;
            } else {
                bundle = AnonymousClass0YW.A01(A012, new AnonymousClass00I[0]).A00.toBundle();
            }
            AnonymousClass0XN.A02(A012, A0D, bundle, 1);
        }
    }
}
