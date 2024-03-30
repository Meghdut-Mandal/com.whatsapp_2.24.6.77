package X;

import android.animation.Animator;
import com.whatsapp.contact.picker.SelectedListContactPickerFragment;

/* renamed from: X.3Um  reason: invalid class name and case insensitive filesystem */
public final class C66053Um implements Animator.AnimatorListener {
    public final /* synthetic */ SelectedListContactPickerFragment A00;

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public C66053Um(SelectedListContactPickerFragment selectedListContactPickerFragment) {
        this.A00 = selectedListContactPickerFragment;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        r4 = (com.whatsapp.contact.picker.VoipContactPickerFragment) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAnimationEnd(android.animation.Animator r6) {
        /*
            r5 = this;
            com.whatsapp.contact.picker.SelectedListContactPickerFragment r4 = r5.A00
            android.widget.RelativeLayout r1 = r4.A00
            if (r1 == 0) goto L_0x0018
            java.util.Map r0 = r4.A3o
            X.AnonymousClass00C.A07(r0)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            int r0 = X.C36351kA.A00(r0)
            r1.setVisibility(r0)
        L_0x0018:
            boolean r0 = r4 instanceof com.whatsapp.contact.picker.VoipContactPickerFragment
            if (r0 == 0) goto L_0x003e
            com.whatsapp.contact.picker.VoipContactPickerFragment r4 = (com.whatsapp.contact.picker.VoipContactPickerFragment) r4
            X.1RJ r3 = r4.A05
            if (r3 == 0) goto L_0x003e
            java.util.Map r0 = r4.A3o
            X.AnonymousClass00C.A07(r0)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            r1 = 0
            if (r0 == 0) goto L_0x003f
            android.view.View r2 = X.C36391kE.A0L(r3, r1)
            r1 = 22
            X.3v8 r0 = new X.3v8
            r0.<init>(r4, r3, r1)
            r2.post(r0)
        L_0x003e:
            return
        L_0x003f:
            r0 = 8
            r3.A03(r0)
            r4.A1o(r1, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66053Um.onAnimationEnd(android.animation.Animator):void");
    }

    public void onAnimationStart(Animator animator) {
        C36361kB.A14(this.A00.A00);
    }
}
