package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;

/* renamed from: X.4oI  reason: invalid class name and case insensitive filesystem */
public abstract class C97034oI extends AnonymousClass0D3 {
    public int A00 = 0;
    public int A01;
    public int A02;
    public int A03 = 0;
    public CallGridViewModel A04;
    public C129066Eu A05;
    public boolean A06;
    public boolean A07;
    public AnimatorSet A08;
    public AnonymousClass04S A09;
    public final C116925lQ A0A;
    public final C144456sD A0B;
    public final AnonymousClass171 A0C;

    public abstract void A0B();

    public abstract void A0D(int i);

    public abstract void A0H(C129066Eu r1);

    private void A00(View view, boolean z) {
        AnimatorSet animatorSet = this.A08;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.A08.cancel();
        }
        View view2 = this.A0H;
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[2];
        float[] fArr = new float[1];
        float f = 0.95f;
        float f2 = 1.0f;
        float f3 = 1.0f;
        if (z) {
            f3 = 0.95f;
        }
        fArr[0] = f3;
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat("scaleX", fArr);
        float[] fArr2 = new float[1];
        if (!z) {
            f = 1.0f;
        }
        fArr2[0] = f;
        propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat("scaleY", fArr2);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view2, propertyValuesHolderArr);
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[1];
        float[] fArr3 = new float[1];
        if (!z) {
            f2 = 0.0f;
        }
        fArr3[0] = f2;
        propertyValuesHolderArr2[0] = PropertyValuesHolder.ofFloat("alpha", fArr3);
        ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(view, propertyValuesHolderArr2);
        AnimatorSet A0C2 = C36441kJ.A0C();
        A0C2.playTogether(new Animator[]{ofPropertyValuesHolder, ofPropertyValuesHolder2});
        A0C2.setDuration((long) 200);
        C90494aF.A0q(A0C2);
        this.A08 = A0C2;
        A0C2.start();
    }

    public boolean A0A() {
        return AnonymousClass000.A1V(this.A05);
    }

    public void A0C(int i) {
        if (!(this instanceof C1028252b)) {
            if (this instanceof AnonymousClass52X) {
                AnonymousClass52X r2 = (AnonymousClass52X) this;
                r2.A0H.setVisibility(i);
                View view = r2.A0E;
                if (view instanceof SurfaceView) {
                    if (!r2.A0A()) {
                        i = 8;
                    }
                    view.setVisibility(i);
                    return;
                }
                return;
            } else if (!(this instanceof AnonymousClass52W)) {
                return;
            }
        }
        this.A0H.setVisibility(i);
    }

    public void A0E(MotionEvent motionEvent, View view) {
        if (view == null) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            A00(view, true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            A00(view, false);
        }
    }

    public void A0F(ViewGroup viewGroup, TextView textView) {
        if (this.A02 == 3 && textView != null && viewGroup != null) {
            AnonymousClass088.A07(textView, textView.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), textView.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), 1, 0);
            viewGroup.setBackground(AnonymousClass0BT.A00((Resources.Theme) null, viewGroup.getResources(), R.drawable.h_scroll_call_status_background));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        if (r5.A07 != false) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0G(android.widget.ImageView r6, X.AnonymousClass141 r7, boolean r8, boolean r9) {
        /*
            r5 = this;
            X.5lQ r2 = r5.A0A
            if (r2 == 0) goto L_0x002d
            r4 = 0
            if (r8 != 0) goto L_0x000c
            boolean r0 = r5.A07
            r1 = 0
            if (r0 == 0) goto L_0x000d
        L_0x000c:
            r1 = 1
        L_0x000d:
            java.util.Map r0 = r2.A00
            java.lang.Object r3 = X.C36371kC.A0r(r0, r1)
            X.1RY r3 = (X.AnonymousClass1RY) r3
            if (r3 == 0) goto L_0x002d
            X.6sD r2 = r5.A0B
            r2.A00 = r9
            java.util.HashSet r1 = r2.A02
            int r0 = r6.hashCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r8 == 0) goto L_0x002e
            r1.add(r0)
        L_0x002a:
            r3.A06(r6, r2, r7, r4)
        L_0x002d:
            return
        L_0x002e:
            r1.remove(r0)
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97034oI.A0G(android.widget.ImageView, X.141, boolean, boolean):void");
    }

    public C97034oI(View view, AnonymousClass16L r6, C116925lQ r7, CallGridViewModel callGridViewModel, AnonymousClass1Pp r9, AnonymousClass171 r10) {
        super(view);
        this.A0C = r10;
        this.A0A = r7;
        this.A04 = callGridViewModel;
        if (r6.A07 == null) {
            synchronized (r6.A01) {
                if (r6.A07 == null) {
                    r6.A07 = r6.A00.A00("blurredContactsThumbCache", AnonymousClass16L.A0D);
                }
            }
        }
        this.A0B = new C144456sD(r6.A07, r9);
    }
}
