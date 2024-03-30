package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.6ys  reason: invalid class name and case insensitive filesystem */
public class C148446ys implements C88964Us {
    public String A00 = "";
    public final C19730wQ A01;
    public final C19630wG A02;

    public void BrU(String str) {
        AnonymousClass00C.A0D(str, 0);
        this.A00 = str;
    }

    public String BDM() {
        if (this instanceof AnonymousClass5KP) {
            return "two_fac";
        }
        if (this instanceof AnonymousClass5KU) {
            return "share_autoconf_verifier";
        }
        if (this instanceof AnonymousClass5KL) {
            return "security_notifications";
        }
        if (this instanceof AnonymousClass5KK) {
            return "request_account_info";
        }
        if (this instanceof AnonymousClass5KT) {
            return "remove_account";
        }
        if (this instanceof AnonymousClass5KS) {
            return "passkeys";
        }
        if (this instanceof AnonymousClass5KO) {
            return "log_out";
        }
        if (this instanceof AnonymousClass5KR) {
            return "email_verification";
        }
        if (this instanceof AnonymousClass5KN) {
            return "delete_account";
        }
        if (this instanceof AnonymousClass5KM) {
            return "change_number";
        }
        if (this instanceof AnonymousClass5KQ) {
            return "add_account";
        }
        return "account";
    }

    public String BF6() {
        if ((this instanceof AnonymousClass5KP) || (this instanceof AnonymousClass5KU) || (this instanceof AnonymousClass5KL) || (this instanceof AnonymousClass5KK) || (this instanceof AnonymousClass5KT) || (this instanceof AnonymousClass5KS) || (this instanceof AnonymousClass5KO) || (this instanceof AnonymousClass5KR) || (this instanceof AnonymousClass5KN) || (this instanceof AnonymousClass5KM) || (this instanceof AnonymousClass5KQ)) {
            return "account";
        }
        return "";
    }

    public String BGE() {
        if (this instanceof AnonymousClass5KP) {
            return C36371kC.A0v(this.A02, R.string.f12nameremoved);
        }
        if (this instanceof AnonymousClass5KU) {
            return C36371kC.A0v(this.A02, R.string.f12nameremoved);
        }
        if (this instanceof AnonymousClass5KL) {
            return C36371kC.A0v(this.A02, R.string.f12nameremoved);
        }
        if (this instanceof AnonymousClass5KK) {
            return C36371kC.A0v(this.A02, R.string.f12nameremoved);
        }
        if (this instanceof AnonymousClass5KT) {
            return C36371kC.A0v(this.A02, R.string.f12nameremoved);
        }
        if (this instanceof AnonymousClass5KS) {
            return C36371kC.A0v(this.A02, R.string.f12nameremoved);
        }
        if (this instanceof AnonymousClass5KO) {
            return C36371kC.A0v(this.A02, R.string.f12nameremoved);
        }
        if (this instanceof AnonymousClass5KR) {
            return C36371kC.A0v(this.A02, R.string.f12nameremoved);
        }
        if (this instanceof AnonymousClass5KN) {
            return C36371kC.A0v(this.A02, R.string.f12nameremoved);
        }
        if (this instanceof AnonymousClass5KM) {
            return C36371kC.A0v(this.A02, R.string.f12nameremoved);
        }
        boolean z = this instanceof AnonymousClass5KQ;
        C19630wG r1 = this.A02;
        if (z) {
            return C36371kC.A0v(r1, R.string.f12nameremoved);
        }
        return C36371kC.A0v(r1, R.string.f12nameremoved);
    }

    public View BJ3(View view) {
        int i;
        if (this instanceof AnonymousClass5KP) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.two_step_verification_preference;
        } else if (this instanceof AnonymousClass5KU) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.settings_maac_phase_2_row_layout;
        } else if (this instanceof AnonymousClass5KL) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.security_preference;
        } else if (this instanceof AnonymousClass5KK) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.request_account_info_preference;
        } else if (this instanceof AnonymousClass5KT) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.remove_account;
        } else if (this instanceof AnonymousClass5KS) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.passkeys_preference;
        } else if (this instanceof AnonymousClass5KO) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.log_out_preference;
        } else if (this instanceof AnonymousClass5KR) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.email_verification_preference;
        } else if (this instanceof AnonymousClass5KN) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.delete_account_preference;
        } else if (this instanceof AnonymousClass5KM) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.change_number_preference;
        } else if (this instanceof AnonymousClass5KQ) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.add_account;
        } else {
            AnonymousClass00C.A0D(view, 0);
            boolean A0L = this.A01.A0L();
            i = R.id.settings_account_info;
            if (A0L) {
                i = R.id.companion_settings_account_info;
            }
        }
        return view.findViewById(i);
    }

    public /* synthetic */ boolean BNj() {
        if (this instanceof AnonymousClass5KP) {
            return AnonymousClass000.A1Q(this.A01.A0L() ? 1 : 0);
        }
        if (this instanceof AnonymousClass5KU) {
            AnonymousClass5KU r0 = (AnonymousClass5KU) this;
            return AnonymousClass000.A1P(C65983Uf.A0U(r0.A00, r0.A01) ? 1 : 0);
        } else if (this instanceof AnonymousClass5KT) {
            return ((AnonymousClass5KT) this).A00.A0A();
        } else {
            if (this instanceof AnonymousClass5KS) {
                C63293Jm r1 = ((AnonymousClass5KS) this).A00;
                if (C19550w8.A05()) {
                    return r1.A02.A0E(5060);
                }
                return false;
            } else if (this instanceof AnonymousClass5KO) {
                return AnonymousClass000.A1P(this.A01.A0L() ? 1 : 0);
            } else {
                if (this instanceof AnonymousClass5KR) {
                    return ((AnonymousClass5KR) this).A00.A00();
                }
                if (this instanceof AnonymousClass5KN) {
                    return AnonymousClass000.A1Q(this.A01.A0L() ? 1 : 0);
                }
                if (this instanceof AnonymousClass5KM) {
                    return AnonymousClass000.A1Q(this.A01.A0L() ? 1 : 0);
                }
                if (!(this instanceof AnonymousClass5KQ)) {
                    return true;
                }
                AnonymousClass1RU r12 = ((AnonymousClass5KQ) this).A00;
                if (!r12.A0B() || r12.A09.A0I() + 1 >= 2) {
                    return false;
                }
                return true;
            }
        }
    }

    public Drawable getIcon() {
        return AnonymousClass00E.A00(this.A02.A00, R.drawable.ic_settings_account);
    }

    public C148446ys(C19730wQ r2, C19630wG r3) {
        C36321k7.A0x(r2, r3);
        this.A01 = r2;
        this.A02 = r3;
    }

    public /* synthetic */ List B8J() {
        return C023409w.A00;
    }

    public String BF9() {
        return this.A00;
    }

    public int BIQ() {
        return 2;
    }

    public /* synthetic */ boolean BN8() {
        return false;
    }

    public /* synthetic */ boolean Bt1() {
        return true;
    }
}
