package X;

import android.os.Bundle;
import com.whatsapp.gallerypicker.GalleryPickerFragment;

/* renamed from: X.4Bf  reason: invalid class name and case insensitive filesystem */
public final class C83914Bf extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C39401sD this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83914Bf(C39401sD r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        GalleryPickerFragment galleryPickerFragment = new GalleryPickerFragment();
        C39401sD r4 = this.this$0;
        Bundle A07 = AnonymousClass001.A07();
        A07.putString("android.intent.extra.TEXT", r4.A0E);
        A07.putInt("include", r4.A00);
        A07.putBoolean("preview", r4.A0K);
        A07.putString("jid", r4.A0H);
        A07.putString("mentions", r4.A0F);
        A07.putString("quoted_group_jid", r4.A0G);
        Long l = r4.A0C;
        if (l != null) {
            A07.putLong("quoted_message_row_id", l.longValue());
        }
        Integer num = r4.A0A;
        if (num != null) {
            A07.putInt("max_items", num.intValue());
        }
        Boolean bool = r4.A03;
        if (bool != null) {
            A07.putBoolean("skip_max_items_new_limit", bool.booleanValue());
        }
        Boolean bool2 = r4.A04;
        if (bool2 != null) {
            A07.putBoolean("is_in_multi_select_mode_only", bool2.booleanValue());
        }
        Boolean bool3 = r4.A05;
        if (bool3 != null) {
            A07.putBoolean("is_send_as_document", bool3.booleanValue());
        }
        Long l2 = r4.A0D;
        if (l2 != null) {
            A07.putLong("picker_open_time", l2.longValue());
        }
        Boolean bool4 = r4.A08;
        if (bool4 != null) {
            A07.putBoolean("should_send_media", bool4.booleanValue());
        }
        Boolean bool5 = r4.A07;
        if (bool5 != null) {
            A07.putBoolean("should_hide_caption_view", bool5.booleanValue());
        }
        Boolean bool6 = r4.A06;
        if (bool6 != null) {
            A07.putBoolean("disable_shared_activity_transition_animation", bool6.booleanValue());
        }
        Boolean bool7 = r4.A09;
        if (bool7 != null) {
            A07.putBoolean("should_set_gallery_result", bool7.booleanValue());
        }
        Integer num2 = r4.A0B;
        if (num2 != null) {
            A07.putInt("origin", num2.intValue());
        }
        galleryPickerFragment.A17(A07);
        return galleryPickerFragment;
    }
}
