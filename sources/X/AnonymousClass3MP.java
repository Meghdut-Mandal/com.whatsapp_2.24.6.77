package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.whatsapp.status.playback.fragment.OpenLinkConfirmationDialogFragment;
import com.whatsapp.status.playback.fragment.OpenLinkDialogFragment;
import java.util.Set;

/* renamed from: X.3MP  reason: invalid class name */
public abstract class AnonymousClass3MP {
    public static final void A00(Context context, C24791Du r9, C88574Tf r10, String str, String str2, Set set, boolean z, boolean z2) {
        OpenLinkDialogFragment A00;
        AnonymousClass00C.A0D(str, 0);
        Context context2 = context;
        C24791Du r2 = r9;
        C36321k7.A16(context, str2, r9, 1);
        if (set != null) {
            A00 = C53152qr.A00(str, str2, set);
        } else if (!z || z2) {
            r2.Bp9(context2, Uri.parse(str), (AnonymousClass3T1) null, 0, 1);
            return;
        } else {
            A00 = new OpenLinkConfirmationDialogFragment();
            Bundle A0I = C36431kI.A0I("url", str);
            A0I.putString("message_key_id", str2);
            A00.A17(A0I);
        }
        A00.A04 = r10;
        C36381kD.A0S(context).Btm(A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        if (r0.A0q == null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (X.C65703Td.A04((X.C46932bu) r12) == false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A01(X.C20810yC r10, X.AnonymousClass1SU r11, X.AnonymousClass3T1 r12) {
        /*
            r8 = 1
            X.AnonymousClass00C.A0D(r12, r8)
            boolean r3 = r12 instanceof X.AnonymousClass2bU
            boolean r2 = r12 instanceof X.C181798o3
            r9 = 0
            if (r2 == 0) goto L_0x0015
            r0 = r12
            X.2bu r0 = (X.C46932bu) r0
            boolean r0 = X.C65703Td.A04(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0016
        L_0x0015:
            r1 = 0
        L_0x0016:
            X.3Qa r0 = r12.A1J
            boolean r0 = r0.A02
            if (r3 == 0) goto L_0x0022
            if (r0 == 0) goto L_0x0023
            if (r2 == 0) goto L_0x0022
            if (r1 != 0) goto L_0x0023
        L_0x0022:
            return r8
        L_0x0023:
            r6 = r12
            X.2bU r6 = (X.AnonymousClass2bU) r6
            X.3Qj r5 = r6.A01
            if (r5 == 0) goto L_0x0072
            r7 = 0
            if (r10 == 0) goto L_0x0033
            r0 = 2917(0xb65, float:4.088E-42)
            java.lang.String r7 = r10.A09(r0)
        L_0x0033:
            int r1 = r12.A1I
            r0 = 3
            boolean r4 = X.AnonymousClass000.A1S(r1, r0)
            boolean r3 = r5.A0f
            X.4xN r0 = r11.A00(r5)
            if (r0 == 0) goto L_0x0047
            X.6Fc r0 = r0.A0q
            r2 = 1
            if (r0 != 0) goto L_0x0048
        L_0x0047:
            r2 = 0
        L_0x0048:
            int r0 = r5.A09
            boolean r1 = X.C36381kD.A1U(r0, r8)
            if (r4 == 0) goto L_0x005c
            if (r3 == 0) goto L_0x005c
            if (r2 == 0) goto L_0x005c
            boolean r0 = X.AnonymousClass6YG.A0C(r7)
            if (r0 != 0) goto L_0x005c
        L_0x005a:
            r9 = 1
        L_0x005b:
            return r9
        L_0x005c:
            boolean r0 = r12 instanceof X.C46882bp
            if (r0 == 0) goto L_0x0067
            boolean r0 = X.C66013Ui.A0x(r6)
            if (r0 == 0) goto L_0x0067
            goto L_0x005a
        L_0x0067:
            boolean r0 = r5.A0V
            if (r0 == 0) goto L_0x005b
            if (r1 == 0) goto L_0x005b
            java.io.File r0 = r5.A0I
            if (r0 == 0) goto L_0x005b
            goto L_0x005a
        L_0x0072:
            java.lang.IllegalArgumentException r0 = X.C36381kD.A0k()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3MP.A01(X.0yC, X.1SU, X.3T1):boolean");
    }
}
