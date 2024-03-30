package X;

import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.0DT  reason: invalid class name */
public abstract class AnonymousClass0DT extends Dialog implements AnonymousClass01J {
    public C002300y A00;
    public final AnonymousClass013 A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0DT(android.content.Context r6, int r7) {
        /*
            r5 = this;
            r0 = r7
            if (r7 != 0) goto L_0x0015
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources$Theme r2 = r6.getTheme()
            r1 = 2130969198(0x7f04026e, float:1.7547071E38)
            r0 = 1
            r2.resolveAttribute(r1, r3, r0)
            int r0 = r3.resourceId
        L_0x0015:
            r5.<init>(r6, r0)
            X.0cs r0 = new X.0cs
            r0.<init>(r5)
            r5.A01 = r0
            X.00y r4 = r5.A02()
            if (r7 != 0) goto L_0x0037
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources$Theme r2 = r6.getTheme()
            r1 = 2130969198(0x7f04026e, float:1.7547071E38)
            r0 = 1
            r2.resolveAttribute(r1, r3, r0)
            int r7 = r3.resourceId
        L_0x0037:
            r0 = r4
            X.02U r0 = (X.AnonymousClass02U) r0
            r0.A04 = r7
            r0 = 0
            r4.A0N(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0DT.<init>(android.content.Context, int):void");
    }

    public void Bih(AnonymousClass0V9 r1) {
    }

    public void Bii(AnonymousClass0V9 r1) {
    }

    public C002300y A02() {
        C002300y r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass02U r02 = new AnonymousClass02U(getContext(), getWindow(), this, this);
        this.A00 = r02;
        return r02;
    }

    public boolean A03(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A02().A0P(view, layoutParams);
    }

    public void dismiss() {
        super.dismiss();
        A02().A0J();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C05990Rw.A00(keyEvent, getWindow().getDecorView(), this, this.A01);
    }

    public View findViewById(int i) {
        AnonymousClass02U r0 = (AnonymousClass02U) A02();
        AnonymousClass02U.A0A(r0);
        return r0.A0A.findViewById(i);
    }

    public void invalidateOptionsMenu() {
        A02().A0I();
    }

    public void onCreate(Bundle bundle) {
        A02().A0H();
        super.onCreate(bundle);
        A02().A0N(bundle);
    }

    public void onStop() {
        super.onStop();
        A02().A0K();
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A02().A0Q(view, layoutParams);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        A02().A0S(getContext().getString(i));
    }

    public void setContentView(int i) {
        A02().A0L(i);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        A02().A0S(charSequence);
    }

    public void setContentView(View view) {
        A02().A0O(view);
    }
}
