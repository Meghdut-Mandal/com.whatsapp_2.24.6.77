package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.whatsapp.R;

/* renamed from: X.0DU  reason: invalid class name */
public class AnonymousClass0DU extends Dialog implements AnonymousClass012, AnonymousClass01F {
    public AnonymousClass01N A00;
    public final AnonymousClass01W A01 = new AnonymousClass01W(new C11030fc(this));

    public static final void A01(AnonymousClass0DU r1) {
        AnonymousClass00C.A0D(r1, 0);
        super.onBackPressed();
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AnonymousClass00C.A0D(view, 0);
        A00();
        super.addContentView(view, layoutParams);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AnonymousClass00C.A0D(view, 0);
        A00();
        super.setContentView(view, layoutParams);
    }

    public final AnonymousClass01M getLifecycle() {
        AnonymousClass01N r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass01N r02 = new AnonymousClass01N(this);
        this.A00 = r02;
        return r02;
    }

    public void onBackPressed() {
        this.A01.A00();
    }

    public void onStop() {
        AnonymousClass01N r1 = this.A00;
        if (r1 == null) {
            r1 = new AnonymousClass01N(this);
            this.A00 = r1;
        }
        r1.A06(AnonymousClass05R.ON_DESTROY);
        this.A00 = null;
        super.onStop();
    }

    public AnonymousClass0DU(Context context, int i) {
        super(context, i);
    }

    private final void A00() {
        Window window = getWindow();
        AnonymousClass00C.A0B(window);
        window.getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        AnonymousClass00C.A0B(window2);
        View decorView = window2.getDecorView();
        AnonymousClass00C.A08(decorView);
        decorView.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass01N r1 = this.A00;
        if (r1 == null) {
            r1 = new AnonymousClass01N(this);
            this.A00 = r1;
        }
        r1.A06(AnonymousClass05R.ON_CREATE);
    }

    public void onStart() {
        super.onStart();
        AnonymousClass01N r1 = this.A00;
        if (r1 == null) {
            r1 = new AnonymousClass01N(this);
            this.A00 = r1;
        }
        r1.A06(AnonymousClass05R.ON_RESUME);
    }

    public final AnonymousClass01W BEd() {
        return this.A01;
    }

    public void setContentView(View view) {
        AnonymousClass00C.A0D(view, 0);
        A00();
        super.setContentView(view);
    }

    public void setContentView(int i) {
        A00();
        super.setContentView(i);
    }
}
