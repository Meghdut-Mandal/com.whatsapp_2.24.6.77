package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.3rA  reason: invalid class name and case insensitive filesystem */
public class C77853rA implements C88964Us {
    public String A00 = "";
    public final C19630wG A01;
    public final C20810yC A02;

    public void BrU(String str) {
        AnonymousClass00C.A0D(str, 0);
        this.A00 = str;
    }

    public /* synthetic */ List B8J() {
        if (this instanceof C47412eV) {
            return C36371kC.A11(C36371kC.A0v(this.A01, R.string.f12nameremoved));
        }
        return C023409w.A00;
    }

    public String BDM() {
        if (this instanceof C47392eQ) {
            return "privacy_status";
        }
        if (this instanceof AnonymousClass2eU) {
            return "screen_lock";
        }
        if (this instanceof C47402eS) {
            return "wcs_read_receipts";
        }
        if (this instanceof C47382eP) {
            return "wcs_profile_photo";
        }
        if ((this instanceof C47372eO) || (this instanceof C47362eN)) {
            return "advanced_privacy_relay_calls";
        }
        if (this instanceof C47352eM) {
            return "live_location";
        }
        if (this instanceof C47342eL) {
            return "wcs_last_seen";
        }
        if (this instanceof C47332eK) {
            return "privacy_groups";
        }
        if (this instanceof C47412eV) {
            return "disappearing_messages_privacy";
        }
        if (this instanceof AnonymousClass2eR) {
            return "privacy_chat_lock";
        }
        if (this instanceof AnonymousClass2eT) {
            return "camera_effects";
        }
        if (this instanceof C47322eJ) {
            return "calling_privacy";
        }
        if (this instanceof C47312eI) {
            return "privacy_blocked";
        }
        if (this instanceof C47302eH) {
            return "wcs_about_status";
        }
        return "privacy";
    }

    public String BF6() {
        if ((this instanceof C47392eQ) || (this instanceof AnonymousClass2eU) || (this instanceof C47402eS) || (this instanceof C47382eP) || (this instanceof C47372eO) || (this instanceof C47362eN) || (this instanceof C47352eM) || (this instanceof C47342eL) || (this instanceof C47332eK) || (this instanceof C47412eV) || (this instanceof AnonymousClass2eR) || (this instanceof AnonymousClass2eT) || (this instanceof C47322eJ) || (this instanceof C47312eI) || (this instanceof C47302eH)) {
            return "privacy";
        }
        return "";
    }

    public String BGE() {
        if (this instanceof C47392eQ) {
            return C36371kC.A0v(this.A01, R.string.f12nameremoved);
        }
        if (this instanceof AnonymousClass2eU) {
            AnonymousClass2eU r0 = (AnonymousClass2eU) this;
            C19630wG r2 = r0.A01;
            boolean A1W = C36421kH.A1W(r0.A00);
            int i = R.string.f12nameremoved;
            if (A1W) {
                i = R.string.f12nameremoved;
            }
            return C36371kC.A0v(r2, i);
        } else if (this instanceof C47402eS) {
            return C36371kC.A0v(this.A01, R.string.f12nameremoved);
        } else {
            if (this instanceof C47382eP) {
                return C36371kC.A0v(this.A01, R.string.f12nameremoved);
            }
            if (this instanceof C47372eO) {
                return C36371kC.A0v(this.A01, R.string.f12nameremoved);
            }
            if (this instanceof C47362eN) {
                return C36371kC.A0v(this.A01, R.string.f12nameremoved);
            }
            if (this instanceof C47352eM) {
                return C36371kC.A0v(this.A01, R.string.f12nameremoved);
            }
            if (this instanceof C47342eL) {
                return C36371kC.A0v(this.A01, R.string.f12nameremoved);
            }
            if (this instanceof C47332eK) {
                return C36371kC.A0v(this.A01, R.string.f12nameremoved);
            }
            if (this instanceof C47412eV) {
                return C36371kC.A0v(this.A01, R.string.f12nameremoved);
            }
            if (this instanceof AnonymousClass2eR) {
                return C36371kC.A0v(this.A01, R.string.f12nameremoved);
            }
            if (this instanceof AnonymousClass2eT) {
                return C36371kC.A0v(this.A01, R.string.f12nameremoved);
            }
            if (this instanceof C47322eJ) {
                return C36371kC.A0v(this.A01, R.string.f12nameremoved);
            }
            if (this instanceof C47312eI) {
                return C36371kC.A0v(this.A01, R.string.f12nameremoved);
            }
            boolean z = this instanceof C47302eH;
            C19630wG r1 = this.A01;
            if (z) {
                return C36371kC.A0v(r1, R.string.f12nameremoved);
            }
            return C36371kC.A0v(r1, R.string.f12nameremoved);
        }
    }

    public View BJ3(View view) {
        int i;
        if (this instanceof C47392eQ) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.status_privacy_preference;
        } else if (this instanceof AnonymousClass2eU) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.security_privacy_preference;
        } else if (this instanceof C47402eS) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.read_receipts_privacy_preference;
        } else if (this instanceof C47382eP) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.profile_photo_privacy_preference;
        } else if ((this instanceof C47372eO) || (this instanceof C47362eN)) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.advanced_privacy_preference;
        } else if (this instanceof C47352eM) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.live_location_privacy_preference;
        } else if (this instanceof C47342eL) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.last_seen_privacy_preference;
        } else if (this instanceof C47332eK) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.group_add_permission_privacy_preference;
        } else if (this instanceof C47412eV) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.dm_privacy_preference_container;
        } else if (this instanceof AnonymousClass2eR) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.chat_lock_privacy_preference;
        } else if (this instanceof AnonymousClass2eT) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.camera_effects_privacy_preference;
        } else if (this instanceof C47322eJ) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.calling_privacy_preference;
        } else if (this instanceof C47312eI) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.block_list_privacy_preference;
        } else if (this instanceof C47302eH) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.about_privacy_preference;
        } else {
            AnonymousClass00C.A0D(view, 0);
            boolean A1W = C36411kG.A1W(this.A02);
            i = R.id.privacy_preference;
            if (A1W) {
                i = R.id.action_me_tab_privacy;
            }
        }
        return view.findViewById(i);
    }

    public /* synthetic */ boolean BNj() {
        if (this instanceof AnonymousClass2eU) {
            return ((AnonymousClass2eU) this).A00.A05();
        }
        if (this instanceof C47412eV) {
            return AnonymousClass000.A1P(((C47412eV) this).A00.A00() ? 1 : 0);
        }
        if (this instanceof AnonymousClass2eR) {
            return this.A02.A0E(5854);
        }
        if (this instanceof AnonymousClass2eT) {
            return ((AnonymousClass2eT) this).A00.A00();
        }
        return true;
    }

    public /* synthetic */ boolean Bt1() {
        if (this instanceof C47402eS) {
            return false;
        }
        return true;
    }

    public Drawable getIcon() {
        return AnonymousClass00E.A00(this.A01.A00, R.drawable.ic_settings_privacy);
    }

    public C77853rA(C19630wG r2, C20810yC r3) {
        C36321k7.A0x(r3, r2);
        this.A02 = r3;
        this.A01 = r2;
    }

    public String BF9() {
        return this.A00;
    }

    public int BIQ() {
        return 11;
    }

    public /* synthetic */ boolean BN8() {
        return false;
    }
}
