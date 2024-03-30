package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.9eZ  reason: invalid class name and case insensitive filesystem */
public class C199019eZ {
    public final AnonymousClass16T A00;
    public final AnonymousClass1EU A01;
    public final C22959AzB A02;
    public final Context A03;
    public final AnonymousClass17Y A04;
    public final C19730wQ A05;
    public final C19970wo A06;
    public final AnonymousClass19A A07;
    public final AnonymousClass6VM A08;
    public final C29221Vu A09;
    public final C29121Vk A0A;
    public final AnonymousClass646 A0B;

    public static void A00(C175798b4 r18, C199019eZ r19) {
        Log.i("PAY: BrazilDeviceBindingAction starts to bind device");
        C199019eZ r13 = r19;
        C19970wo r4 = r13.A06;
        C19730wQ r2 = r13.A05;
        String A002 = C237919w.A00(r2, r4);
        C175798b4 r6 = r18;
        String A003 = r13.A0B.A00(r6.A01);
        String A004 = C237919w.A00(r2, r4);
        AnonymousClass6VM r22 = r13.A08;
        String A052 = r22.A05(A003);
        C175898bF r0 = r6.A08;
        C18740tg.A06(r0);
        String A082 = r22.A08(A003, A002, ((AnonymousClass8b7) r0).A05);
        AnonymousClass19A r8 = r13.A07;
        String A092 = r8.A09();
        String str = r6.A0A;
        AnonymousClass6QB A0T = C36421kH.A0T();
        C165567td.A1D(A0T);
        C203539oF.A0E(A0T, A092);
        AnonymousClass6QB A0a = C165587tf.A0a();
        C36331k8.A1D(A0a, "action", "br-bind-network-token");
        C203539oF.A0D(A0a, str);
        if (C203539oF.A0P(A052, 1, 10000, false)) {
            C36331k8.A1D(A0a, "device-csr", A052);
        }
        if (C203539oF.A0P(A082, 1, 10000, false)) {
            C36331k8.A1D(A0a, "jws-token", A082);
        }
        if (C203539oF.A0P(A002, 1, 10000, false)) {
            C36331k8.A1D(A0a, "client-reference-id", A002);
        }
        C203539oF.A0G(A0a, A003, false);
        C203539oF.A0F(A0a, A004);
        C165577te.A1A(r8, new B7H(r13.A03, r13.A09, r13.A04, r13, 1), C165567td.A0I(A0a, A0T), A092);
    }

    public void A01(C175798b4 r8) {
        if (r8 == null) {
            this.A02.BVV((C175798b4) null, C202059ky.A00(), (ArrayList) null, false);
            return;
        }
        C175898bF r0 = r8.A08;
        C18740tg.A06(r0);
        if (TextUtils.isEmpty(((AnonymousClass8b7) r0).A05)) {
            new AnonymousClass9SK(this.A03, this.A04, this.A09, this.A0A, new B9T(r8, this, 0)).A00(r8.A0A);
            return;
        }
        A00(r8, this);
    }

    public C199019eZ(Context context, AnonymousClass17Y r2, C19730wQ r3, C19970wo r4, AnonymousClass16T r5, AnonymousClass19A r6, AnonymousClass6VM r7, C29221Vu r8, C29121Vk r9, AnonymousClass1EU r10, C22959AzB azB, AnonymousClass646 r12) {
        this.A06 = r4;
        this.A03 = context;
        this.A04 = r2;
        this.A05 = r3;
        this.A07 = r6;
        this.A01 = r10;
        this.A0A = r9;
        this.A0B = r12;
        this.A00 = r5;
        this.A08 = r7;
        this.A09 = r8;
        this.A02 = azB;
    }
}
