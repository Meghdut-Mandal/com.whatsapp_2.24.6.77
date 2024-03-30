package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.whatsapp.util.Log;

/* renamed from: X.21c  reason: invalid class name and case insensitive filesystem */
public class C428921c extends C67243Zb {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ViewGroup A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ C70803fk A04;

    public C428921c(View view, ViewGroup viewGroup, C70803fk r3, int i, boolean z) {
        this.A04 = r3;
        this.A02 = viewGroup;
        this.A01 = view;
        this.A03 = z;
        this.A00 = i;
    }

    public void onAnimationEnd(Animation animation) {
        Log.i("conversation/hideinputextension/end");
        ViewGroup viewGroup = this.A02;
        viewGroup.setVisibility(8);
        C70803fk r4 = this.A04;
        AnonymousClass3AC r3 = r4.A2R;
        r3.A02.getViewTreeObserver().addOnGlobalLayoutListener(new C90204Zm((Object) new AnonymousClass3ZM(this.A01, viewGroup, this, this.A03), (Object) r3, 1));
        r4.A1V.setClipChildren(true);
        r4.A2U.setTranscriptMode(this.A00);
    }
}
