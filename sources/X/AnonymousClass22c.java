package X;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.calling.calllink.view.CallLinkActivity;
import com.whatsapp.util.Log;

/* renamed from: X.22c  reason: invalid class name */
public abstract class AnonymousClass22c extends C47182dm {
    public LinearLayout A00;
    public TextView A01;
    public ViewGroup A02;

    public AnonymousClass23r A3j() {
        AnonymousClass23r r3 = new AnonymousClass23r();
        C135506co r2 = new C135506co(this, r3, 3);
        r3.A00 = A3i();
        r3.A00(r2, getString(R.string.f12nameremoved), R.drawable.ic_action_copy);
        return r3;
    }

    public AnonymousClass23t A3k() {
        AnonymousClass23t r3 = new AnonymousClass23t();
        C135506co r2 = new C135506co(this, r3, 4);
        if (!(this instanceof CallLinkActivity)) {
            C48932iI.A00(this.A00, r3, this, r2, 1);
        }
        r3.A00 = A3i();
        r3.A00(r2, getString(R.string.f12nameremoved), R.drawable.ic_share);
        return r3;
    }

    public AnonymousClass23s A3l() {
        AnonymousClass23s r4 = new AnonymousClass23s();
        C135506co r3 = new C135506co(this, r4, 5);
        String string = getString(R.string.f12nameremoved);
        r4.A00 = A3i();
        r4.A00(r3, C36321k7.A0A(this, string, R.string.f12nameremoved), R.drawable.ic_action_forward);
        return r4;
    }

    public void A3n(AnonymousClass23t r4) {
        Log.i("sharelinkactivity/sharelink/");
        if (!TextUtils.isEmpty(r4.A02)) {
            Intent A0B = C36431kI.A0B();
            A0B.putExtra("android.intent.extra.TEXT", r4.A02);
            if (!TextUtils.isEmpty(r4.A01)) {
                A0B.putExtra("android.intent.extra.SUBJECT", r4.A01);
            }
            C36371kC.A18(A0B, "text/plain");
            startActivity(Intent.createChooser(A0B, r4.A00));
        }
    }

    public void A3o(AnonymousClass23s r2) {
        Log.i("sharelinkactivity/sendlink/");
        if (!TextUtils.isEmpty(r2.A00)) {
            startActivity(AnonymousClass190.A12(this, r2.A00));
        }
    }

    public View A3i() {
        View A0D = C36421kH.A0D(this, R.layout.f9nameremoved);
        ViewGroup viewGroup = this.A02;
        C18740tg.A04(viewGroup);
        viewGroup.addView(A0D);
        return A0D;
    }

    public void A3m() {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this, R.style.f13nameremoved);
        View view = new View(contextThemeWrapper, (AttributeSet) null, R.style.f13nameremoved);
        view.setLayoutParams(new LinearLayout.LayoutParams(contextThemeWrapper, (AttributeSet) null));
        ViewGroup viewGroup = this.A02;
        C18740tg.A04(viewGroup);
        viewGroup.addView(view);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        C36341k9.A12(this);
        C36321k7.A0O(this);
        this.A02 = (ViewGroup) C03570Gk.A0B(this, R.id.share_link_root);
        this.A01 = C36401kF.A0H(this, R.id.link);
        this.A00 = (LinearLayout) C03570Gk.A0B(this, R.id.link_btn);
    }
}
