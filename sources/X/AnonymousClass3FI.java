package X;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;

/* renamed from: X.3FI  reason: invalid class name */
public class AnonymousClass3FI {
    public int A00;
    public int A01 = 1;
    public int A02 = -1;
    public int A03 = 5;
    public AnonymousClass3XQ A04 = null;
    public AnonymousClass11F A05 = null;
    public C64933Qa A06 = null;
    public boolean A07 = false;
    public boolean A08 = false;
    public boolean A09 = false;
    public boolean A0A = false;
    public final Context A0B;

    public AnonymousClass3FI(Context context) {
        this.A0B = context;
    }

    public Intent A00() {
        Intent A0D = C36431kI.A0D();
        A0D.setClassName(this.A0B.getPackageName(), "com.whatsapp.mediaview.MediaViewActivity");
        A0D.putExtra("start_t", SystemClock.uptimeMillis());
        A0D.putExtra("video_play_origin", this.A03);
        A0D.putExtra("nogallery", this.A0A);
        A0D.putExtra("gallery", this.A07);
        A0D.putExtra("menu_style", this.A01);
        A0D.putExtra("menu_set_wallpaper", this.A09);
        A0D.putExtra("origin", this.A00);
        if (this.A08 && this.A04 != null) {
            A0D.putExtra("is_premium_message_insight", true);
            A0D.putExtra("temp_fmessage_media_info", this.A04);
        }
        C64933Qa r0 = this.A06;
        if (r0 != null) {
            AnonymousClass3UJ.A00(A0D, r0);
            int i = this.A02;
            if (i >= 0) {
                A0D.putExtra("message_card_index", i);
            }
        }
        AnonymousClass11F r02 = this.A05;
        if (r02 != null) {
            C36371kC.A17(A0D, r02);
        }
        return A0D;
    }
}
