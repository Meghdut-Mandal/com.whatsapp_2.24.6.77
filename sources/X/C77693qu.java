package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.3qu  reason: invalid class name and case insensitive filesystem */
public class C77693qu implements C88964Us {
    public String A00 = "";
    public final C19630wG A01;

    public C77693qu(C19630wG r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A01 = r2;
    }

    public void BrU(String str) {
        AnonymousClass00C.A0D(str, 0);
        this.A00 = str;
    }

    public List B8J() {
        if (this instanceof C47292eG) {
            return C36371kC.A11(C36371kC.A0v(this.A01, R.string.f12nameremoved));
        }
        String[] A1S = C36441kJ.A1S();
        C19630wG r2 = this.A01;
        A1S[0] = C36371kC.A0v(r2, R.string.f12nameremoved);
        return C36341k9.A0m(C36371kC.A0v(r2, R.string.f12nameremoved), A1S, 1);
    }

    public String BDM() {
        if (this instanceof C47282eF) {
            return "terms";
        }
        if (this instanceof C47292eG) {
            return "get_help";
        }
        if (this instanceof AnonymousClass2eE) {
            return "app_info";
        }
        return "help";
    }

    public String BF6() {
        if ((this instanceof C47282eF) || (this instanceof C47292eG) || (this instanceof AnonymousClass2eE)) {
            return "help";
        }
        return "";
    }

    public String BGE() {
        if (this instanceof C47282eF) {
            return C36371kC.A0v(this.A01, R.string.f12nameremoved);
        }
        if (this instanceof C47292eG) {
            return C36371kC.A0v(this.A01, R.string.f12nameremoved);
        }
        boolean z = this instanceof AnonymousClass2eE;
        C19630wG r1 = this.A01;
        if (z) {
            return C36371kC.A0v(r1, R.string.f12nameremoved);
        }
        return C36371kC.A0v(r1, R.string.f12nameremoved);
    }

    public View BJ3(View view) {
        int i;
        if (this instanceof C47282eF) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.terms_and_privacy_preference;
        } else if (this instanceof C47292eG) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.get_help_preference;
        } else if (this instanceof AnonymousClass2eE) {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.about_preference;
        } else {
            AnonymousClass00C.A0D(view, 0);
            i = R.id.settings_help;
        }
        return view.findViewById(i);
    }

    public Drawable getIcon() {
        Context context = this.A01.A00;
        AnonymousClass00C.A08(context);
        return new C100754vc(AnonymousClass00E.A00(context, R.drawable.ic_settings_help), C36371kC.A0P(context).BxU());
    }

    public String BF9() {
        return this.A00;
    }

    public int BIQ() {
        return 6;
    }

    public /* synthetic */ boolean BN8() {
        return false;
    }

    public /* synthetic */ boolean BNj() {
        return true;
    }

    public /* synthetic */ boolean Bt1() {
        return true;
    }
}
