package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3OM  reason: invalid class name */
public final class AnonymousClass3OM {
    public Uri A00;
    public AnonymousClass11F A01;
    public C28981Uw A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09;
    public Boolean A0A;
    public Boolean A0B;
    public Boolean A0C;
    public Boolean A0D;
    public Boolean A0E;
    public Boolean A0F;
    public Boolean A0G;
    public Boolean A0H;
    public Boolean A0I;
    public Boolean A0J;
    public Boolean A0K;
    public Boolean A0L;
    public Boolean A0M;
    public Integer A0N;
    public Integer A0O;
    public Integer A0P;
    public Integer A0Q;
    public Integer A0R;
    public Long A0S;
    public Long A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public ArrayList A0Z;
    public ArrayList A0a;
    public List A0b;
    public List A0c;
    public final Context A0d;

    public AnonymousClass3OM(Context context) {
        AnonymousClass00C.A0D(context, 1);
        this.A0d = context;
    }

    public static Intent A00(AnonymousClass3OM r1) {
        return A02(r1, "com.whatsapp.contact.picker.ContactPicker");
    }

    public static Intent A01(AnonymousClass3OM r1, int i) {
        r1.A0Q = Integer.valueOf(i);
        r1.A0O = 2000;
        return A02(r1, "com.whatsapp.contact.picker.AudienceSelectionContactPicker");
    }

    public static final Intent A02(AnonymousClass3OM r4, String str) {
        Intent A0D2 = C36431kI.A0D();
        A0D2.setClassName(r4.A0d.getPackageName(), str);
        Boolean bool = r4.A0G;
        if (bool != null) {
            A0D2.putExtra("send", bool);
        }
        Boolean bool2 = r4.A0L;
        if (bool2 != null) {
            A0D2.putExtra("skip_preview", bool2);
        }
        String str2 = r4.A0V;
        if (str2 != null) {
            A0D2.putExtra("file_path", str2);
        }
        ArrayList arrayList = r4.A0a;
        if (arrayList != null) {
            A0D2.putExtra("message_types", arrayList);
        }
        Boolean bool3 = r4.A03;
        if (bool3 != null) {
            A0D2.putExtra("block_contact", bool3);
        }
        ArrayList arrayList2 = r4.A0Z;
        if (arrayList2 != null) {
            A0D2.putExtra("blocked_list", arrayList2);
        }
        String str3 = r4.A0Y;
        if (str3 != null) {
            A0D2.setType(str3);
        }
        String str4 = r4.A0X;
        if (str4 != null) {
            A0D2.putExtra("android.intent.extra.TEXT", str4);
        }
        Boolean bool4 = r4.A09;
        if (bool4 != null) {
            A0D2.putExtra("forward", bool4);
        }
        AnonymousClass11F r3 = r4.A01;
        if (!(r3 == null && r4.A0U == null)) {
            String str5 = r4.A0U;
            if (str5 == null) {
                str5 = AnonymousClass143.A03(r3);
            }
            A0D2.putExtra("forward_jid", str5);
        }
        List list = r4.A0c;
        if (list != null) {
            A0D2.putExtra("jids", AnonymousClass143.A07(list));
        }
        C28981Uw r0 = r4.A02;
        if (r0 != null) {
            A0D2.putExtra("newsletter_invite_link_jid", r0.getRawString());
        }
        Long l = r4.A0T;
        if (l != null) {
            A0D2.putExtra("forward_video_duration", l);
        }
        Integer num = r4.A0R;
        if (num != null) {
            A0D2.putExtra("forward_text_length", num);
        }
        Integer num2 = r4.A0N;
        if (num2 != null) {
            A0D2.putExtra("forward_messages_becoming_frequently_forwarded", num2);
        }
        Boolean bool5 = r4.A0C;
        if (bool5 != null) {
            A0D2.putExtra("is_forwarded", bool5);
        }
        Boolean bool6 = r4.A0A;
        if (bool6 != null) {
            A0D2.putExtra("forward_ctwa", bool6);
        }
        Boolean bool7 = r4.A0B;
        if (bool7 != null) {
            A0D2.putExtra("forward_highly_forwarded", bool7);
        }
        Boolean bool8 = r4.A0D;
        if (bool8 != null) {
            A0D2.putExtra("is_voice_status_forward_allowed", bool8);
        }
        Boolean bool9 = r4.A0H;
        if (bool9 != null) {
            A0D2.putExtra("set_group_icon", bool9);
        }
        Long l2 = r4.A0S;
        if (l2 != null) {
            A0D2.putExtra("message_row_id", l2);
        }
        List list2 = r4.A0b;
        if (list2 != null) {
            Bundle A072 = AnonymousClass001.A07();
            AnonymousClass3UJ.A0A(A072, list2);
            A0D2.putExtra("message_keys", A072);
        }
        Boolean bool10 = r4.A08;
        if (bool10 != null) {
            A0D2.putExtra("email_history", bool10);
        }
        Boolean bool11 = r4.A04;
        if (bool11 != null) {
            A0D2.putExtra("call_picker", bool11);
        }
        Boolean bool12 = r4.A0F;
        if (bool12 != null) {
            A0D2.putExtra("request_sync", bool12);
        }
        Boolean bool13 = r4.A0K;
        if (bool13 != null) {
            A0D2.putExtra("show_new_chat_and_community", bool13);
        }
        Uri uri = r4.A00;
        if (uri != null) {
            A0D2.putExtra("android.intent.extra.STREAM", uri);
        }
        Boolean bool14 = r4.A0M;
        if (bool14 != null) {
            A0D2.putExtra("status_chip_clicked", bool14);
        }
        Boolean bool15 = r4.A0E;
        if (bool15 != null) {
            A0D2.putExtra("multi_select_ddm", bool15);
        }
        Integer num3 = r4.A0P;
        if (num3 != null) {
            A0D2.putExtra("dm_duration", num3);
        }
        if (r4.A0O != null) {
            A0D2.putExtra("use_custom_multiselect_limit", true);
            A0D2.putExtra("custom_multiselect_limit", r4.A0O);
        }
        Integer num4 = r4.A0Q;
        if (num4 != null) {
            A0D2.putExtra("status_distribution_mode", num4);
        }
        if (r4.A05 != null) {
            A0D2.putExtra("contacts_list_view_mode", true);
        }
        Boolean bool16 = r4.A0J;
        if (bool16 != null) {
            A0D2.putExtra("show_ad_creation", bool16);
        }
        Boolean bool17 = r4.A0I;
        if (bool17 != null) {
            A0D2.putExtra("should_blink_create_group_item", bool17);
        }
        Boolean bool18 = r4.A07;
        if (bool18 != null) {
            A0D2.putExtra("disable_text_size_limit_message", bool18);
        }
        Boolean bool19 = r4.A06;
        if (bool19 != null) {
            A0D2.putExtra("disable_post_send_intent", bool19);
        }
        String str6 = r4.A0W;
        if (str6 != null) {
            A0D2.putExtra("show_more_sharing_options_content", str6);
        }
        return A0D2;
    }

    public static void A03(AnonymousClass3OM r2, int i) {
        r2.A0a = new ArrayList(Collections.singleton(Integer.valueOf(i)));
    }
}
