package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.ASs  reason: case insensitive filesystem */
public class C21626ASs implements C88964Us {
    public String A00 = "";
    public final C19630wG A01;

    public C21626ASs(C19630wG r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A01 = r2;
    }

    public void BrU(String str) {
        AnonymousClass00C.A0D(str, 0);
        this.A00 = str;
    }

    public String BDM() {
        if (this instanceof C183008q4) {
            return "proxy";
        }
        if (this instanceof C182968q0) {
            if (((C182968q0) this) instanceof C182938px) {
                return "reset_network_usage";
            }
            return "network_usage";
        } else if (this instanceof C183028q6) {
            C183028q6 r1 = (C183028q6) this;
            if (r1 instanceof C182928pw) {
                return "video_upload_quality";
            }
            if (r1 instanceof C182918pv) {
                return "photo_upload_quality";
            }
            return "media_upload_quality_section";
        } else if (this instanceof C182978q1) {
            return "media_auto_download_section";
        } else {
            if (this instanceof C182958pz) {
                return "manage_storage";
            }
            if (this instanceof C183018q5) {
                return "use_less_data_for_calls";
            }
            if (this instanceof C182948py) {
                return "media_download_wifi";
            }
            if (this instanceof C182998q3) {
                return "media_download_roaming";
            }
            if (this instanceof C182988q2) {
                return "media_download_mobile_data";
            }
            return "storage_and_data";
        }
    }

    public String BF6() {
        if (this instanceof C183008q4) {
            return "storage_and_data";
        }
        if (this instanceof C182968q0) {
            if (((C182968q0) this) instanceof C182938px) {
                return "network_usage";
            }
            return "storage_and_data";
        } else if (this instanceof C183028q6) {
            C183028q6 r1 = (C183028q6) this;
            if ((r1 instanceof C182928pw) || (r1 instanceof C182918pv)) {
                return "media_upload_quality_section";
            }
            return "storage_and_data";
        } else if ((this instanceof C182978q1) || (this instanceof C182958pz) || (this instanceof C183018q5)) {
            return "storage_and_data";
        } else {
            if ((this instanceof C182948py) || (this instanceof C182998q3) || (this instanceof C182988q2)) {
                return "media_auto_download_section";
            }
            return "";
        }
    }

    public String BGE() {
        if (this instanceof C183008q4) {
            return C36371kC.A0v(this.A01, R.string.f12nameremoved);
        }
        if (this instanceof C182968q0) {
            C182968q0 r1 = (C182968q0) this;
            boolean z = r1 instanceof C182938px;
            C19630wG r12 = r1.A01;
            if (z) {
                return C36371kC.A0v(r12, R.string.f12nameremoved);
            }
            return C36371kC.A0v(r12, R.string.f12nameremoved);
        } else if (this instanceof C183028q6) {
            C183028q6 r13 = (C183028q6) this;
            if (r13 instanceof C182928pw) {
                return C36371kC.A0v(r13.A01, R.string.f12nameremoved);
            }
            boolean z2 = r13 instanceof C182918pv;
            C19630wG r14 = r13.A01;
            if (z2) {
                return C36371kC.A0v(r14, R.string.f12nameremoved);
            }
            return C36371kC.A0v(r14, R.string.f12nameremoved);
        } else if (this instanceof C182978q1) {
            return C36371kC.A0v(this.A01, R.string.f12nameremoved);
        } else {
            if (this instanceof C182958pz) {
                return C36371kC.A0v(this.A01, R.string.f12nameremoved);
            }
            if (this instanceof C183018q5) {
                return C36371kC.A0v(this.A01, R.string.f12nameremoved);
            }
            if (this instanceof C182948py) {
                return C36371kC.A0v(this.A01, R.string.f12nameremoved);
            }
            if (this instanceof C182998q3) {
                return C36371kC.A0v(this.A01, R.string.f12nameremoved);
            }
            boolean z3 = this instanceof C182988q2;
            C19630wG r15 = this.A01;
            if (z3) {
                return C36371kC.A0v(r15, R.string.f12nameremoved);
            }
            return C36371kC.A0v(r15, R.string.f12nameremoved);
        }
    }

    public View BJ3(View view) {
        int i;
        if (this instanceof C183008q4) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.user_proxy_section;
        } else if (this instanceof C182968q0) {
            if (((C182968q0) this) instanceof C182938px) {
                AnonymousClass00C.A0D(view, 0);
                i = R.id.reset_network_usage_row;
            } else {
                AnonymousClass00C.A0D(view, 0);
                i = R.id.setting_network_usage;
            }
        } else if (this instanceof C183028q6) {
            C183028q6 r1 = (C183028q6) this;
            if (r1 instanceof C182928pw) {
                AnonymousClass00C.A0D(view, 0);
                i = R.id.setting_video_quality;
            } else if (r1 instanceof C182918pv) {
                AnonymousClass00C.A0D(view, 0);
                i = R.id.setting_photo_quality;
            } else {
                AnonymousClass00C.A0D(view, 0);
                i = R.id.media_quality_section;
            }
        } else if (this instanceof C182978q1) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.media_auto_download_title;
        } else if (this instanceof C182958pz) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.setting_storage_usage;
        } else if (this instanceof C183018q5) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.settings_calls_low_data;
        } else if (this instanceof C182948py) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.setting_autodownload_wifi;
        } else if (this instanceof C182998q3) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.setting_autodownload_roaming;
        } else if (this instanceof C182988q2) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.setting_autodownload_cellular;
        } else {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.settings_data_usage;
        }
        return view.findViewById(i);
    }

    public /* synthetic */ boolean BN8() {
        if (this instanceof C183028q6) {
            C183028q6 r1 = (C183028q6) this;
            if ((r1 instanceof C182928pw) || (r1 instanceof C182918pv)) {
                return false;
            }
            return true;
        } else if (this instanceof C182978q1) {
            return true;
        } else {
            return false;
        }
    }

    public /* synthetic */ boolean BNj() {
        if (this instanceof C183008q4) {
            C20810yC r1 = ((C183008q4) this).A00;
            if (r1.A0E(2784) || r1.A0E(3641)) {
                return true;
            }
            return false;
        } else if (this instanceof C183028q6) {
            C183028q6 r12 = (C183028q6) this;
            if (r12 instanceof C182928pw) {
                return r12.A00.A0E(662);
            }
            boolean z = r12 instanceof C182918pv;
            C20810yC r13 = r12.A00;
            boolean A0E = r13.A0E(702);
            if (z) {
                if (!A0E || r13.A0E(2653)) {
                    return false;
                }
                return true;
            } else if ((!A0E || r13.A0E(2653)) && !r13.A0E(662)) {
                return false;
            } else {
                return true;
            }
        } else if (this instanceof C183018q5) {
            return !((C183018q5) this).A00.A0L();
        }
        return true;
    }

    public /* synthetic */ boolean Bt1() {
        if (this instanceof C183018q5) {
            return false;
        }
        return true;
    }

    public Drawable getIcon() {
        return AnonymousClass00E.A00(this.A01.A00, R.drawable.ic_settings_data_usage);
    }

    public /* synthetic */ List B8J() {
        return C023409w.A00;
    }

    public String BF9() {
        return this.A00;
    }

    public int BIQ() {
        return 5;
    }
}
