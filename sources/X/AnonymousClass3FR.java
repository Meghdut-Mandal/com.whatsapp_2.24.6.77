package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.ArrayList;

/* renamed from: X.3FR  reason: invalid class name */
public final class AnonymousClass3FR {
    public int A00 = -1;
    public int A01;
    public int A02;
    public int A03 = -1;
    public int A04;
    public long A05 = -1;
    public long A06;
    public long A07;
    public Uri A08;
    public Bundle A09;
    public AnonymousClass3XT A0A;
    public Integer A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public ArrayList A0G;
    public ArrayList A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P = true;
    public boolean A0Q;
    public boolean A0R;
    public final Context A0S;

    public static void A00(C132366Tg r1, AnonymousClass3FR r2) {
        Bundle bundle = new Bundle();
        C132366Tg.A02(bundle, r1);
        r2.A09 = bundle;
    }

    public AnonymousClass3FR(Context context) {
        this.A0S = context;
    }

    public Intent A01() {
        long j;
        Intent A0D2 = C36431kI.A0D();
        A0D2.setClassName(this.A0S.getPackageName(), "com.whatsapp.mediacomposer.MediaComposerActivity");
        A0D2.putExtra("android.intent.extra.STREAM", this.A0H);
        A0D2.putExtra("android.intent.extra.TEXT", this.A0F);
        A0D2.putExtra("first_caption", this.A0C);
        A0D2.putExtra("jid", this.A0D);
        A0D2.putExtra("jids", this.A0G);
        A0D2.putExtra("max_items", this.A01);
        A0D2.putExtra("skip_max_items_new_limit", this.A0Q);
        A0D2.putExtra("origin", this.A02);
        long j2 = this.A06;
        if (j2 <= 0) {
            j2 = SystemClock.elapsedRealtime();
        }
        A0D2.putExtra("picker_open_time", j2);
        A0D2.putExtra("send", this.A0N);
        A0D2.putExtra("disable_tools_for_newsletter_forward", this.A0J);
        A0D2.putExtra("quoted_message_row_id", this.A07);
        A0D2.putExtra("quoted_group_jid", this.A0E);
        A0D2.putExtra("number_from_url", this.A0K);
        A0D2.putExtra("media_preview_params", this.A09);
        A0D2.putExtra("smb_quick_reply", false);
        A0D2.putExtra("should_send_media", this.A0P);
        A0D2.putExtra("should_hide_caption_view", this.A0O);
        A0D2.putExtra("start_home", this.A0R);
        A0D2.putExtra("animate_uri", this.A08);
        A0D2.putExtra("preselected_image_uri", (Parcelable) null);
        A0D2.putExtra("scan_for_qr", this.A0M);
        A0D2.putExtra("is_new_content", this.A0L);
        A0D2.putExtra("status_distribution", this.A0A);
        int i = this.A02;
        if (i == 1 || i == 11 || i == 14 || i == 17 || i == 20 || i == 21) {
            j = this.A05;
        } else {
            j = -1;
        }
        A0D2.putExtra("gallery_duration_ms", j);
        A0D2.putExtra("preview_top_margin", this.A03);
        A0D2.putExtra("preview_bottom_margin", this.A00);
        Integer num = this.A0B;
        if (num != null) {
            A0D2.putExtra("media_quality_selection", num);
        }
        A0D2.putExtra("show_delete_thumbnail_for_single_media", false);
        A0D2.putExtra("set_result_when_last_media_deleted", false);
        A0D2.putExtra("disable_converting_video_to_gif_option", this.A0I);
        A0D2.putExtra("media_sharing_user_journey_origin", this.A04);
        return A0D2;
    }
}
