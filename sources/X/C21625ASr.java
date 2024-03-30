package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.ASr  reason: case insensitive filesystem */
public class C21625ASr implements C88964Us {
    public String A00 = "";
    public final C19630wG A01;

    public C21625ASr(C19630wG r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A01 = r2;
    }

    public void BrU(String str) {
        AnonymousClass00C.A0D(str, 0);
        this.A00 = str;
    }

    public /* synthetic */ List B8J() {
        if (this instanceof C182848po) {
            return C36371kC.A11(C36371kC.A0v(this.A01, R.string.f12nameremoved));
        }
        if (this instanceof C182888ps) {
            return C36371kC.A11(C36371kC.A0v(this.A01, R.string.f12nameremoved));
        }
        if (this instanceof C182908pu) {
            return C36371kC.A11(C36371kC.A0v(this.A01, R.string.f12nameremoved));
        }
        if (!(this instanceof C182898pt)) {
            return C023409w.A00;
        }
        String[] A1S = C36441kJ.A1S();
        C19630wG r2 = this.A01;
        A1S[0] = C36371kC.A0v(r2, R.string.f12nameremoved);
        return C36341k9.A0m(C36371kC.A0v(r2, R.string.f12nameremoved), A1S, 1);
    }

    public String BDM() {
        if (this instanceof C182848po) {
            return "chat_wallpaper";
        }
        if (this instanceof C182868pq) {
            return "transfer_chats";
        }
        if (this instanceof C182888ps) {
            return "chat_theme";
        }
        if (this instanceof C182838pn) {
            return "media_visibility";
        }
        if (this instanceof C182908pu) {
            return "keep_chats_archived";
        }
        if (this instanceof C182878pr) {
            return "instant_video_messages";
        }
        if (this instanceof C182828pm) {
            return "font_size";
        }
        if (this instanceof C182898pt) {
            return "enter_is_send";
        }
        if (this instanceof C182818pl) {
            C182818pl r1 = (C182818pl) this;
            if (r1 instanceof C182808pk) {
                return "export_chat";
            }
            if (r1 instanceof C182798pj) {
                return "delete_all_chats";
            }
            if (r1 instanceof C182788pi) {
                return "clear_all_chats";
            }
            if (r1 instanceof C182778ph) {
                return "archive_all_chats";
            }
            return "chat_history";
        } else if (this instanceof C182858pp) {
            return "chat_backup";
        } else {
            return "chat";
        }
    }

    public String BF6() {
        if ((this instanceof C182848po) || (this instanceof C182868pq) || (this instanceof C182888ps) || (this instanceof C182838pn) || (this instanceof C182908pu) || (this instanceof C182878pr) || (this instanceof C182828pm) || (this instanceof C182898pt)) {
            return "chat";
        }
        if (this instanceof C182818pl) {
            C182818pl r1 = (C182818pl) this;
            if ((r1 instanceof C182808pk) || (r1 instanceof C182798pj) || (r1 instanceof C182788pi) || (r1 instanceof C182778ph)) {
                return "chat_history";
            }
            return "chat";
        } else if (!(this instanceof C182858pp)) {
            return "";
        } else {
            return "chat";
        }
    }

    public String BGE() {
        if (this instanceof C182848po) {
            return C36371kC.A0v(this.A01, R.string.f12nameremoved);
        }
        if (this instanceof C182868pq) {
            return C36371kC.A0v(this.A01, R.string.f12nameremoved);
        }
        if (this instanceof C182888ps) {
            return C36371kC.A0v(this.A01, R.string.f12nameremoved);
        }
        if (this instanceof C182838pn) {
            return C36371kC.A0v(this.A01, R.string.f12nameremoved);
        }
        if (this instanceof C182908pu) {
            return C36371kC.A0v(this.A01, R.string.f12nameremoved);
        }
        if (this instanceof C182878pr) {
            return C36371kC.A0v(this.A01, R.string.f12nameremoved);
        }
        if (this instanceof C182828pm) {
            return C36371kC.A0v(this.A01, R.string.f12nameremoved);
        }
        if (this instanceof C182898pt) {
            return C36371kC.A0v(this.A01, R.string.f12nameremoved);
        }
        if (this instanceof C182818pl) {
            C182818pl r1 = (C182818pl) this;
            if (r1 instanceof C182808pk) {
                return C36371kC.A0v(r1.A01, R.string.f12nameremoved);
            }
            if (r1 instanceof C182798pj) {
                return C36371kC.A0v(r1.A01, R.string.f12nameremoved);
            }
            if (r1 instanceof C182788pi) {
                return C36371kC.A0v(r1.A01, R.string.f12nameremoved);
            }
            boolean z = r1 instanceof C182778ph;
            C19630wG r12 = r1.A01;
            if (z) {
                return C36371kC.A0v(r12, R.string.f12nameremoved);
            }
            return C36371kC.A0v(r12, R.string.f12nameremoved);
        }
        boolean z2 = this instanceof C182858pp;
        C19630wG r13 = this.A01;
        if (z2) {
            return C36371kC.A0v(r13, R.string.f12nameremoved);
        }
        return C36371kC.A0v(r13, R.string.f12nameremoved);
    }

    public View BJ3(View view) {
        int i;
        if (this instanceof C182848po) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.wallpaper_preference;
        } else if (this instanceof C182868pq) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.chat_transfer_preference;
        } else if (this instanceof C182888ps) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.settings_theme;
        } else if (this instanceof C182838pn) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.media_visibility_preference;
        } else if (this instanceof C182908pu) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.chat_settings_notify_new_message_switch_view;
        } else if (this instanceof C182878pr) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.instant_video_messages_preference_stub;
        } else if (this instanceof C182828pm) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.font_size_preference;
        } else if (this instanceof C182898pt) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.enter_key_preference_switch;
        } else if (this instanceof C182818pl) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.chat_history_preference;
        } else if (this instanceof C182858pp) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.chat_backup_preference;
        } else {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.settings_chat;
        }
        return view.findViewById(i);
    }

    public /* synthetic */ boolean BNj() {
        C19730wQ r0;
        C19730wQ r02;
        if (this instanceof C182808pk) {
            C182808pk r2 = (C182808pk) this;
            if (r2.A01.A09(C21100yf.A0v)) {
                r02 = r2.A00;
            }
            return false;
        } else if (this instanceof C182868pq) {
            C182868pq r22 = (C182868pq) this;
            if (C19550w8.A01() && r22.A01.A0E(2870)) {
                r02 = r22.A00;
            }
            return false;
        } else if (this instanceof C182908pu) {
            C182908pu r1 = (C182908pu) this;
            if (r1.A01.A2F()) {
                r02 = r1.A00;
            }
            return false;
        } else if (this instanceof C182878pr) {
            return C63743Lf.A01(((C182878pr) this).A00);
        } else {
            if (this instanceof C182898pt) {
                r0 = ((C182898pt) this).A00;
            } else if (!(this instanceof C182858pp)) {
                return true;
            } else {
                r0 = ((C182858pp) this).A00;
            }
            return !r0.A0L();
        }
        if (r02.A0L()) {
            return false;
        }
        return true;
    }

    public /* synthetic */ boolean Bt1() {
        if ((this instanceof C182838pn) || (this instanceof C182908pu) || (this instanceof C182878pr) || (this instanceof C182898pt)) {
            return false;
        }
        return true;
    }

    public Drawable getIcon() {
        return AnonymousClass00E.A00(this.A01.A00, R.drawable.ic_settings_chats);
    }

    public String BF9() {
        return this.A00;
    }

    public int BIQ() {
        return 3;
    }

    public /* synthetic */ boolean BN8() {
        return false;
    }
}
