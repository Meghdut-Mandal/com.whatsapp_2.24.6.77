package X;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.facebook.rendercore.RootHostView;
import com.whatsapp.R;
import com.whatsapp.bloks.ui.BloksDialogFragment;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.4d6  reason: invalid class name and case insensitive filesystem */
public class C92084d6 extends GestureDetector.SimpleOnGestureListener {
    public AnonymousClass02E A00;
    public RootHostView A01;
    public AnonymousClass6PY A02;
    public C122285ub A03;
    public AnonymousClass65A A04;
    public BloksDialogFragment A05;
    public AnonymousClass30X A06;
    public Map A07;
    public Bundle A08;
    public AnonymousClass01L A09;
    public HashMap A0A;

    public void A00() {
        BloksDialogFragment bloksDialogFragment;
        AnonymousClass6PY r2 = this.A02;
        if (r2 != null && (bloksDialogFragment = this.A05) != null) {
            bloksDialogFragment.A06 = C36371kC.A0m();
            RootHostView rootHostView = this.A01;
            if (rootHostView != null) {
                r2.A03(rootHostView);
            }
            this.A05.A06 = C36381kD.A0j();
        }
    }

    public void A01(Bundle bundle, AnonymousClass01L r7, AnonymousClass02E r8, AnonymousClass65A r9, BloksDialogFragment bloksDialogFragment, AnonymousClass30X r11, String str, HashMap hashMap) {
        this.A09 = r7;
        this.A00 = r8;
        this.A05 = bloksDialogFragment;
        this.A06 = r11;
        C143216qB r3 = new C143216qB(this);
        this.A08 = bundle;
        this.A0A = hashMap;
        this.A04 = r9;
        bundle.getBoolean("hot_reload");
        C122285ub r4 = this.A03;
        C18740tg.A0E(!AnonymousClass6YY.A0U(str), AnonymousClass000.A0p("BloksPayloadHelperImpl/getBloks/invalid screen name: ", str, AnonymousClass000.A0u()));
        r4.A00.A05(0, R.string.f12nameremoved);
        r4.A03.Bp1(new C1502274l(r4, r3, str, 24));
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        return true;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }
}
