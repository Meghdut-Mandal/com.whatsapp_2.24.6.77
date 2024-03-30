package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.R;

/* renamed from: X.3FM  reason: invalid class name */
public class AnonymousClass3FM {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public int[] A08;
    public int[] A09;
    public int[] A0A;
    public String[] A0B;
    public String[] A0C;
    public Context A0D;

    public static AnonymousClass3FM A00(Context context) {
        AnonymousClass3FM r1 = new AnonymousClass3FM(context);
        r1.A01 = R.drawable.permission_cam;
        return r1;
    }

    public AnonymousClass3FM(Context context) {
        this.A0D = context;
    }

    public static void A01(AnonymousClass3FM r1, String str) {
        r1.A0C = new String[]{str};
    }

    public Intent A02() {
        Intent A0D2 = C36431kI.A0D();
        A0D2.setClassName(this.A0D.getPackageName(), "com.whatsapp.RequestPermissionActivity");
        A0D2.putExtra("drawable_id", this.A01);
        A0D2.putExtra("drawable_ids", this.A09);
        A0D2.putExtra("message_id", this.A02);
        A0D2.putExtra("message_params_id", this.A0A);
        A0D2.putExtra("formatted_message_html", this.A05);
        A0D2.putExtra("cancel_button_message_id", this.A00);
        A0D2.putExtra("perm_denial_message_id", this.A03);
        A0D2.putExtra("perm_denial_message_params_id", this.A08);
        A0D2.putExtra("permissions", this.A0C);
        A0D2.putExtra("force_ui", this.A06);
        A0D2.putExtra("minimal_partial_permissions", this.A0B);
        A0D2.putExtra("title_id", this.A04);
        A0D2.putExtra("hide_permissions_rationale", this.A07);
        return A0D2;
    }
}
