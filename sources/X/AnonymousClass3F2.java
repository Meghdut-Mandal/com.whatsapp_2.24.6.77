package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3F2  reason: invalid class name */
public final class AnonymousClass3F2 {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final Context A05;
    public final UserJid A06;
    public final String A07;

    public AnonymousClass3F2(Context context, UserJid userJid, String str) {
        C36321k7.A11(context, userJid, str);
        this.A05 = context;
        this.A06 = userJid;
        this.A07 = str;
    }

    public final Intent A00() {
        Intent A0D = C36431kI.A0D();
        A0D.setClassName(this.A05.getPackageName(), "com.whatsapp.blockbusiness.BlockBusinessActivity");
        A0D.putExtra("jid_extra", this.A06.getRawString());
        A0D.putExtra("entry_point_extra", this.A07);
        A0D.putExtra("show_success_toast_extra", this.A04);
        A0D.putExtra("show_report_upsell", this.A03);
        A0D.putExtra("should_delete_chat_post_block", this.A01);
        A0D.putExtra("should_launch_home_activity_post_block", this.A02);
        A0D.putExtra("third_party_bot", this.A00);
        return A0D;
    }
}
