package X;

import android.content.Context;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import com.whatsapp.businessapisearch.view.activity.BusinessApiSearchActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.6NC  reason: invalid class name */
public class AnonymousClass6NC {
    public final AnonymousClass16D A00;
    public final C20430xY A01;
    public final C24801Dv A02;
    public final C19700wN A03;
    public final C19970wo A04;
    public final C25851Hx A05;

    private void A00(C144416s9 r10, String str) {
        C25851Hx r1 = this.A05;
        UserJid A0l = C36431kI.A0l(r10.A0F);
        C18740tg.A06(A0l);
        r1.A02(A0l, str, SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME, System.currentTimeMillis(), System.currentTimeMillis());
    }

    public void A01(Context context, C144416s9 r11) {
        AnonymousClass16D r7 = this.A00;
        String str = r11.A0F;
        C222713q r6 = AnonymousClass11F.A00;
        AnonymousClass141 A0i = C36441kJ.A0i(r7, r6.A02(str));
        try {
            if (C36421kH.A1T(C24801Dv.A01(context, BusinessApiSearchActivity.class).getIntent(), "directory_source")) {
                A00(r11, "directory");
            } else {
                A00(r11, "biz_search");
            }
        } catch (IllegalStateException e) {
            this.A03.A0E("ContactBusinessUtil/startMessageBusiness", e.getMessage(), true);
            Log.e("This method is expected to be called from BusinessApiSearch context, therefore no entrypoint conversion is stored", e);
        }
        this.A01.A09(C36441kJ.A0i(r7, r6.A02(str)));
        this.A02.A07(context, C90504aG.A0G(context, A0i));
    }

    public AnonymousClass6NC(C24801Dv r1, C19700wN r2, AnonymousClass16D r3, C20430xY r4, C19970wo r5, C25851Hx r6) {
        this.A04 = r5;
        this.A03 = r2;
        this.A02 = r1;
        this.A00 = r3;
        this.A01 = r4;
        this.A05 = r6;
    }
}
