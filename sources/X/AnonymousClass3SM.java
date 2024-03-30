package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3SM  reason: invalid class name */
public abstract class AnonymousClass3SM {
    public static C79593ty A00(Context context, Intent intent, AnonymousClass17Y r18, C29461Ws r19, AnonymousClass9Y1 r20, C202279lS r21, UserJid userJid, String str, boolean z) {
        boolean z2;
        C79593ty r5 = new C79593ty();
        UserJid userJid2 = userJid;
        String str2 = str;
        Context context2 = context;
        Intent intent2 = intent;
        boolean z3 = z;
        if (r19.A06(userJid2, str2) == null) {
            C202279lS r6 = r21;
            if (r6.A0A(new AnonymousClass9NZ((AnonymousClass9W6) null, userJid2, Integer.valueOf(C36441kJ.A05(context2.getResources(), R.dimen.f7nameremoved)), Integer.valueOf(C36441kJ.A05(context2.getResources(), R.dimen.f7nameremoved)), str2, r20.A02, false))) {
                r6.A0N.add(new C69303dJ(context2, intent2, r18, r5, r6, userJid2, str2, z3));
                return r5;
            }
            z2 = false;
        } else {
            A01(context2, intent2, userJid2, (Integer) null, (Integer) null, str2, 6, z3);
            z2 = true;
        }
        r5.A0C(Boolean.valueOf(z2));
        return r5;
    }

    public static void A01(Context context, Intent intent, UserJid userJid, Integer num, Integer num2, String str, int i, boolean z) {
        Bundle bundle;
        Activity A01 = C18860tw.A01(context, AnonymousClass01L.class);
        if (A01 != null) {
            intent.putExtra("product", str);
            intent.putExtra("disable_report", z);
            C36371kC.A17(intent, userJid);
            if (num2 != null) {
                intent.putExtra("thumb_height", num2);
            }
            if (num != null) {
                intent.putExtra("thumb_width", num);
            }
            intent.putExtra("view_product_origin", i);
            if (!C64013Mh.A00) {
                bundle = null;
            } else {
                bundle = AnonymousClass0YW.A01(A01, new AnonymousClass00I[0]).A00.toBundle();
            }
            AnonymousClass0XN.A02(A01, intent, bundle, 0);
        }
    }

    public static void A02(Context context, View view, AnonymousClass9XI r18, C29461Ws r19, C199439fJ r20, C46852bm r21, AnonymousClass1SV r22, int i, boolean z, boolean z2, boolean z3) {
        C46852bm r6 = r21;
        String str = r6.A06;
        UserJid userJid = r6.A01;
        C18740tg.A06(userJid);
        C29461Ws r4 = r19;
        C207269up A06 = r4.A06((UserJid) null, str);
        Context context2 = context;
        AnonymousClass9XI r3 = r18;
        C199439fJ r5 = r20;
        int i2 = i;
        boolean z4 = z2;
        boolean z5 = z3;
        if (A06 == null) {
            View view2 = view;
            AnonymousClass1SV r7 = r22;
            C79333tY r0 = new C79333tY(context2, view2, r3, r4, r5, r6, r7, i2, z4, z5);
            if (z) {
                r7.A0D(view2, r6, r0);
            } else {
                r7.A0C(view2, r6, r0);
            }
        } else {
            A03(context2, r3, r5, userJid, (Integer) null, (Integer) null, A06.A0F, i2, z4, z5, false);
        }
    }

    public static void A03(Context context, AnonymousClass9XI r4, C199439fJ r5, UserJid userJid, Integer num, Integer num2, String str, int i, boolean z, boolean z2, boolean z3) {
        if (z2) {
            A01(context, C36431kI.A0D().setClassName(context.getPackageName(), "com.whatsapp.biz.product.view.activity.ProductDetailActivity"), userJid, num, num2, str, i, z);
            return;
        }
        r4.A02(userJid).A0A(new C79573tw(context, r4, r5, userJid, num, num2, str, i, z, z3));
    }
}
