package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.CatalogImageListActivity;
import com.whatsapp.CatalogMediaView;
import com.whatsapp.info.views.CustomNotificationsInfoView;
import com.whatsapp.info.views.NotificationsAndSoundsInfoView;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.2iJ  reason: invalid class name and case insensitive filesystem */
public class C48942iJ extends C33541fX {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C48942iJ(Object obj, int i, int i2, Object obj2) {
        this.A03 = i2;
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = i;
    }

    public void A02(View view) {
        switch (this.A03) {
            case 0:
                AnonymousClass00C.A0D(view, 0);
                Context A0B = C36371kC.A0B(view);
                CatalogImageListActivity catalogImageListActivity = (CatalogImageListActivity) this.A01;
                C207269up r7 = catalogImageListActivity.A02;
                if (r7 == null) {
                    throw C36331k8.A0d("product");
                }
                List list = AnonymousClass0D3.A0I;
                AnonymousClass3CG r4 = ((C42211yS) this.A02).A02;
                int i = this.A00;
                UserJid userJid = catalogImageListActivity.A04;
                if (userJid == null) {
                    throw C36331k8.A0d("productOwnerJid");
                }
                AnonymousClass00C.A0D(r4, 2);
                Intent A0H = C36441kJ.A0H(A0B, CatalogMediaView.class);
                A0H.putExtra("product", r7);
                A0H.putExtra("target_image_index", i);
                A0H.putExtra("cached_jid", userJid.getRawString());
                AnonymousClass3U9.A08(A0B, A0H, view);
                AnonymousClass3U9.A09(A0B, A0H, view, r4, AnonymousClass000.A0p("thumb-transition-", AnonymousClass000.A0r("_", AnonymousClass000.A0v(r7.A0F), i), AnonymousClass000.A0u()));
                return;
            case 1:
                C119295pa r42 = (C119295pa) this.A01;
                C122335ug r3 = r42.A01;
                r3.A01 = 2;
                r3.A02 = new C119285pZ((C134986bw) this.A02, this.A00);
                r42.A00.A0C(r3);
                return;
            case 2:
                ((Activity) this.A01).startActivityForResult((Intent) this.A02, this.A00);
                return;
            case 3:
                CustomNotificationsInfoView customNotificationsInfoView = (CustomNotificationsInfoView) this.A02;
                AnonymousClass0XN.A02(customNotificationsInfoView.A01, AnonymousClass190.A0j(customNotificationsInfoView.getContext(), (Jid) this.A01), (Bundle) null, 16);
                return;
            default:
                NotificationsAndSoundsInfoView notificationsAndSoundsInfoView = (NotificationsAndSoundsInfoView) this.A02;
                C225314u A022 = notificationsAndSoundsInfoView.getActivity();
                notificationsAndSoundsInfoView.getWaIntents$app_productinfra_chat_chat_non_modified();
                AnonymousClass0XN.A02(A022, AnonymousClass190.A0j(notificationsAndSoundsInfoView.getContext(), (Jid) this.A01), (Bundle) null, 16);
                return;
        }
    }

    public C48942iJ(CustomNotificationsInfoView customNotificationsInfoView, AnonymousClass147 r3) {
        this.A03 = 3;
        this.A02 = customNotificationsInfoView;
        this.A01 = r3;
        this.A00 = 16;
    }

    public C48942iJ(NotificationsAndSoundsInfoView notificationsAndSoundsInfoView, AnonymousClass147 r3) {
        this.A03 = 4;
        this.A02 = notificationsAndSoundsInfoView;
        this.A01 = r3;
        this.A00 = 16;
    }
}
