package X;

import android.util.Log;
import com.facebook.rendercore.RootHostView;
import com.whatsapp.bloks.ui.BloksDialogFragment;

/* renamed from: X.6qB  reason: invalid class name and case insensitive filesystem */
public class C143216qB implements C159257j4 {
    public final /* synthetic */ C92084d6 A00;

    public C143216qB(C92084d6 r1) {
        this.A00 = r1;
    }

    public void BUA(AnonymousClass6XK r5) {
        AnonymousClass65A r2;
        C92084d6 r3 = this.A00;
        RootHostView rootHostView = r3.A01;
        if (rootHostView != null) {
            rootHostView.setVisibility(0);
        }
        AnonymousClass6PY r0 = r3.A02;
        if (r0 != null) {
            r0.A02();
        }
        BloksDialogFragment bloksDialogFragment = r3.A05;
        if (bloksDialogFragment != null) {
            bloksDialogFragment.A03 = new C116745l5(r5);
        }
        AnonymousClass02E r1 = r3.A00;
        if (!(r1 == null || (r2 = r3.A04) == null || !r1.A12())) {
            r3.A02 = new AnonymousClass64D(r1.A0i(), r5, r2).A00();
        }
        r3.A00();
        AnonymousClass30X r02 = r3.A06;
        if (r02 != null) {
            r02.A00.A02();
        }
    }

    public void BWo(String str) {
        Log.e("Whatsapp", str);
        AnonymousClass30X r0 = this.A00.A06;
        if (r0 != null) {
            r0.A00.A02();
        }
    }
}
