package X;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.view.MenuItem;
import android.view.View;
import com.whatsapp.HomeActivity;
import com.whatsapp.conversationslist.ConversationsFragment;
import java.util.List;

/* renamed from: X.1iE  reason: invalid class name and case insensitive filesystem */
public class C35151iE implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C35151iE(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final void onClick(View view) {
        switch (this.A02) {
            case 3:
                ((Context) this.A01).startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://faq.whatsapp.com/335178174377229")));
                C19420v0 r3 = ((C33921g9) this.A00).A02.A00;
                C19420v0.A00(r3).putInt("biz_shop_sunset_banner_clicked", ((SharedPreferences) r3.A00.get()).getInt("biz_shop_sunset_banner_clicked", 0) + 1).apply();
                return;
            case 4:
                ConversationsFragment conversationsFragment = (ConversationsFragment) this.A00;
                Context context = (Context) this.A01;
                conversationsFragment.A1B.A00(8);
                if (!conversationsFragment.A0f.A0L()) {
                    C24801Dv r32 = conversationsFragment.A0X;
                    Intent className = new Intent().setClassName(view.getContext().getPackageName(), "com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity");
                    className.putExtra("invite_source", 8);
                    r32.A07(context, className);
                    return;
                }
                conversationsFragment.A0h.A01(view.getContext(), 8);
                return;
            case 5:
                C31951ci r5 = (C31951ci) this.A00;
                for (AnonymousClass11F r33 : (List) this.A01) {
                    if (!(r33 instanceof AnonymousClass146)) {
                        r5.A0N.A1k.A08(r33, 0, true);
                    }
                }
                return;
            case 6:
                ((Context) this.A01).startActivity(AnonymousClass190.A13(((AnonymousClass1T3) this.A00).A00.A00, "maiba-learn-more"));
                return;
            default:
                ((HomeActivity) this.A00).onOptionsItemSelected((MenuItem) this.A01);
                return;
        }
    }
}
