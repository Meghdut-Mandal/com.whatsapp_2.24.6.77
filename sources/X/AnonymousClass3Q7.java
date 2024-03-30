package X;

import android.content.Context;
import android.os.Build;
import com.whatsapp.R;

/* renamed from: X.3Q7  reason: invalid class name */
public class AnonymousClass3Q7 {
    public static final int[] A03 = (Build.VERSION.SDK_INT >= 29 ? new int[]{R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved} : new int[]{R.string.f12nameremoved, R.string.f12nameremoved});
    public final C19900wh A00;
    public final Context A01;
    public final C18820ts A02;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
        if (r4 != 2) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r4 != 2) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A00() {
        /*
            r7 = this;
            android.content.Context r6 = r7.A01
            int[] r5 = A03
            X.0wh r0 = r7.A00
            int r4 = r0.A00()
            int r3 = android.os.Build.VERSION.SDK_INT
            r2 = 1
            r1 = 2
            r0 = 29
            if (r3 < r0) goto L_0x001f
            if (r4 == r2) goto L_0x0022
            r0 = 2
            if (r4 == r1) goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            r0 = r5[r0]
            java.lang.String r0 = r6.getString(r0)
            return r0
        L_0x001f:
            if (r4 == r1) goto L_0x0022
            goto L_0x0017
        L_0x0022:
            r0 = 1
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Q7.A00():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        if (r5 != 2) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
        if (r5 != 2) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C225314u r7) {
        /*
            r6 = this;
            X.0wh r0 = r6.A00
            int r5 = r0.A00()
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r4 = 2
            r0 = 29
            if (r2 < r0) goto L_0x002f
            if (r5 == r1) goto L_0x0032
            r3 = 2
            if (r5 == r4) goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            X.0ts r1 = r6.A02
            int[] r0 = A03
            java.lang.String[] r2 = r1.A0Q(r0)
            r0 = 2131894278(0x7f122006, float:1.9423356E38)
            com.whatsapp.SingleSelectionDialogFragment r1 = new com.whatsapp.SingleSelectionDialogFragment
            r1.<init>()
            android.os.Bundle r0 = com.whatsapp.SingleSelectionDialogFragment.A05(r2, r4, r3, r0)
            r1.A17(r0)
            r7.Btm(r1)
            return
        L_0x002f:
            if (r5 == r4) goto L_0x0032
            goto L_0x0013
        L_0x0032:
            r3 = 1
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Q7.A01(X.14u):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        if (r7 != 1) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(int r7) {
        /*
            r6 = this;
            X.0wh r5 = r6.A00
            int r4 = r5.A00()
            int r3 = android.os.Build.VERSION.SDK_INT
            r2 = 2
            r1 = 1
            r0 = 29
            if (r3 < r0) goto L_0x002e
            if (r7 == r1) goto L_0x0030
            if (r7 == r2) goto L_0x0013
            r2 = -1
        L_0x0013:
            if (r4 == r2) goto L_0x0032
            android.content.SharedPreferences r0 = r5.A01
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "night_mode"
            X.C36341k9.A0v(r1, r0, r2)
            X.C002300y.A00(r2)
            android.content.Context r0 = r6.A01
            android.content.res.Configuration r1 = X.AnonymousClass000.A0U(r0)
            r0 = 1
            X.C224314h.A02(r0, r1)
            return r0
        L_0x002e:
            if (r7 == r1) goto L_0x0013
        L_0x0030:
            r2 = 1
            goto L_0x0013
        L_0x0032:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Q7.A02(int):boolean");
    }

    public AnonymousClass3Q7(Context context, C19900wh r2, C18820ts r3) {
        this.A01 = context;
        this.A02 = r3;
        this.A00 = r2;
    }
}
