package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

/* renamed from: X.014  reason: invalid class name */
public abstract class AnonymousClass014 extends Activity implements AnonymousClass012, AnonymousClass013 {
    public AnonymousClass007 A00 = new AnonymousClass007(0);
    public AnonymousClass01N A01 = new AnonymousClass01N(this);

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(java.lang.String[] r3) {
        /*
            r2 = 0
            if (r3 == 0) goto L_0x000f
            int r0 = r3.length
            if (r0 <= 0) goto L_0x000f
            r1 = r3[r2]
            int r0 = r1.hashCode()
            switch(r0) {
                case -645125871: goto L_0x0010;
                case 100470631: goto L_0x001d;
                case 472614934: goto L_0x0020;
                case 1159329357: goto L_0x002d;
                case 1455016274: goto L_0x003a;
                default: goto L_0x000f;
            }
        L_0x000f:
            return r2
        L_0x0010:
            java.lang.String r0 = "--translation"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            goto L_0x0046
        L_0x001d:
            java.lang.String r0 = "--dump-dumpable"
            goto L_0x0022
        L_0x0020:
            java.lang.String r0 = "--list-dumpables"
        L_0x0022:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            goto L_0x0046
        L_0x002d:
            java.lang.String r0 = "--contentcapture"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            goto L_0x0046
        L_0x003a:
            java.lang.String r0 = "--autofill"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
        L_0x0046:
            if (r1 < r0) goto L_0x000f
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass014.A00(java.lang.String[]):boolean");
    }

    public abstract AnonymousClass01M getLifecycle();

    @Deprecated
    public void A1V(AnonymousClass0OJ r3) {
        this.A00.put(r3.getClass(), r3);
    }

    @Deprecated
    public void A1W(Class cls) {
        this.A00.get(cls);
    }

    public void onSaveInstanceState(Bundle bundle) {
        AnonymousClass01N r2 = this.A01;
        AnonymousClass01P r1 = AnonymousClass01P.CREATED;
        AnonymousClass01N.A03("markState");
        r2.A07(r1);
        super.onSaveInstanceState(bundle);
    }

    public boolean BvE(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C012005e.A0f(decorView, keyEvent)) {
            return C05990Rw.A00(keyEvent, decorView, this, this);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C012005e.A0f(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass05P.A00(this);
    }
}
