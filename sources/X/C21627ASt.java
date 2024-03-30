package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.ASt  reason: case insensitive filesystem */
public class C21627ASt implements C88964Us {
    public String A00 = "";
    public final C19630wG A01;

    public C21627ASt(C19630wG r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A01 = r2;
    }

    public void BrU(String str) {
        AnonymousClass00C.A0D(str, 0);
        this.A00 = str;
    }

    public String BDM() {
        if (this instanceof C183198qN) {
            return "show_reaction_notifications";
        }
        if (this instanceof C183188qM) {
            return "message_popup_notifications";
        }
        if (this instanceof C183108qE) {
            return "message_notifications_vibrate";
        }
        if (this instanceof C183098qD) {
            return "sounds";
        }
        if (this instanceof C183178qL) {
            return "message_notifications_section";
        }
        if (this instanceof C183088qC) {
            return "message_notifications_light";
        }
        if (this instanceof C183208qO) {
            return "message_high_priority_notifications";
        }
        if (this instanceof C183168qK) {
            return "group_show_reaction_notifications";
        }
        if (this instanceof C183158qJ) {
            return "group_message_popup_notifications";
        }
        if (this instanceof C183078qB) {
            return "group_message_notifications_vibrate";
        }
        if (this instanceof C183068qA) {
            return "group_sounds";
        }
        if (this instanceof C183148qI) {
            return "group_message_notifications_section";
        }
        if (this instanceof C183058q9) {
            return "group_message_notifications_light";
        }
        if (this instanceof C183138qH) {
            return "group_message_high_priority_notifications";
        }
        if (this instanceof C183128qG) {
            return "conversation_tones";
        }
        if (this instanceof C183048q8) {
            return "incoming_call_vibrate";
        }
        if (this instanceof C183038q7) {
            return "incoming_call_ringtone";
        }
        if (this instanceof C183118qF) {
            return "call_notifications_section";
        }
        return "notifications";
    }

    public String BF6() {
        if ((this instanceof C183198qN) || (this instanceof C183188qM) || (this instanceof C183108qE) || (this instanceof C183098qD)) {
            return "message_notifications_section";
        }
        if (this instanceof C183178qL) {
            return "notifications";
        }
        if ((this instanceof C183088qC) || (this instanceof C183208qO)) {
            return "message_notifications_section";
        }
        if ((this instanceof C183168qK) || (this instanceof C183158qJ) || (this instanceof C183078qB) || (this instanceof C183068qA)) {
            return "group_message_notifications_section";
        }
        if (this instanceof C183148qI) {
            return "notifications";
        }
        if ((this instanceof C183058q9) || (this instanceof C183138qH)) {
            return "group_message_notifications_section";
        }
        if (this instanceof C183128qG) {
            return "notifications";
        }
        if ((this instanceof C183048q8) || (this instanceof C183038q7)) {
            return "call_notifications_section";
        }
        if (!(this instanceof C183118qF)) {
            return "";
        }
        return "notifications";
    }

    public String BGE() {
        if (this instanceof C183198qN) {
            return C36371kC.A0v(this.A01, R.string.f12nameremoved);
        }
        if (this instanceof C183188qM) {
            return C36371kC.A0v(this.A01, R.string.f12nameremoved);
        }
        if (this instanceof C183108qE) {
            return C36371kC.A0v(this.A01, R.string.f12nameremoved);
        }
        if (this instanceof C183098qD) {
            return C36371kC.A0v(this.A01, R.string.f12nameremoved);
        }
        if (this instanceof C183178qL) {
            return C36371kC.A0v(this.A01, R.string.f12nameremoved);
        }
        if (this instanceof C183088qC) {
            return C36371kC.A0v(this.A01, R.string.f12nameremoved);
        }
        if (this instanceof C183208qO) {
            return C36371kC.A0v(this.A01, R.string.f12nameremoved);
        }
        if (this instanceof C183168qK) {
            return C36371kC.A0v(this.A01, R.string.f12nameremoved);
        }
        if (this instanceof C183158qJ) {
            return C36371kC.A0v(this.A01, R.string.f12nameremoved);
        }
        if (this instanceof C183078qB) {
            return C36371kC.A0v(this.A01, R.string.f12nameremoved);
        }
        if (this instanceof C183068qA) {
            return C36371kC.A0v(this.A01, R.string.f12nameremoved);
        }
        if (this instanceof C183148qI) {
            return C36371kC.A0v(this.A01, R.string.f12nameremoved);
        }
        if (this instanceof C183058q9) {
            return C36371kC.A0v(this.A01, R.string.f12nameremoved);
        }
        if (this instanceof C183138qH) {
            return C36371kC.A0v(this.A01, R.string.f12nameremoved);
        }
        if (this instanceof C183128qG) {
            return C36371kC.A0v(this.A01, R.string.f12nameremoved);
        }
        if (this instanceof C183048q8) {
            return C36371kC.A0v(this.A01, R.string.f12nameremoved);
        }
        if (this instanceof C183038q7) {
            return C36371kC.A0v(this.A01, R.string.f12nameremoved);
        }
        boolean z = this instanceof C183118qF;
        C19630wG r1 = this.A01;
        if (z) {
            return C36371kC.A0v(r1, R.string.f12nameremoved);
        }
        return C36371kC.A0v(r1, R.string.f12nameremoved);
    }

    public View BJ3(View view) {
        int i;
        if (this instanceof C183198qN) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.reaction_notifications_setting;
        } else if (this instanceof C183188qM) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.popup_notification_setting;
        } else if (this instanceof C183108qE) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.vibrate_setting;
        } else if (this instanceof C183098qD) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.notification_tone_setting;
        } else if (this instanceof C183178qL) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.message_notifications_section_header;
        } else if (this instanceof C183088qC) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.notification_light_setting;
        } else if (this instanceof C183208qO) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.high_priority_notifications_setting;
        } else if (this instanceof C183168qK) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.group_reaction_notifications_setting;
        } else if (this instanceof C183158qJ) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.group_popup_notification_setting;
        } else if (this instanceof C183078qB) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.group_vibrate_setting;
        } else if (this instanceof C183068qA) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.group_notification_tone_setting;
        } else if (this instanceof C183148qI) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.group_message_notifications_section_header;
        } else if (this instanceof C183058q9) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.group_notification_light_setting;
        } else if (this instanceof C183138qH) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.group_high_priority_notifications_setting;
        } else if (this instanceof C183128qG) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.conversation_sound_setting;
        } else if (this instanceof C183048q8) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.call_vibrate_setting;
        } else if (this instanceof C183038q7) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.call_tone_setting;
        } else if (this instanceof C183118qF) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.call_notifications_section_header;
        } else {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.settings_notifications;
        }
        return view.findViewById(i);
    }

    public /* synthetic */ boolean BN8() {
        if ((this instanceof C183178qL) || (this instanceof C183148qI) || (this instanceof C183118qF)) {
            return true;
        }
        return false;
    }

    public /* synthetic */ boolean Bt1() {
        if ((this instanceof C183198qN) || (this instanceof C183208qO) || (this instanceof C183168qK) || (this instanceof C183138qH) || (this instanceof C183128qG)) {
            return false;
        }
        return true;
    }

    public Drawable getIcon() {
        return AnonymousClass00E.A00(this.A01.A00, R.drawable.ic_settings_notification);
    }

    public /* synthetic */ List B8J() {
        return C023409w.A00;
    }

    public String BF9() {
        return this.A00;
    }

    public int BIQ() {
        return 4;
    }

    public /* synthetic */ boolean BNj() {
        return true;
    }
}
