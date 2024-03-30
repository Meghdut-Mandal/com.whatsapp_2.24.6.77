package X;

import android.content.Context;
import com.whatsapp.registration.VerifyTwoFactorAuth;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: X.2jQ  reason: invalid class name and case insensitive filesystem */
public class C49622jQ extends C132446Tt {
    public final C19630wG A00;
    public final C19420v0 A01;
    public final AnonymousClass3UV A02;
    public final String A03;
    public final String A04;
    public final WeakReference A05;

    public C49622jQ(C19630wG r2, C19420v0 r3, AnonymousClass3UV r4, VerifyTwoFactorAuth verifyTwoFactorAuth, String str, String str2) {
        super(verifyTwoFactorAuth, true);
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = AnonymousClass001.A0F(verifyTwoFactorAuth);
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        try {
            C19420v0 r2 = this.A01;
            int A012 = C36371kC.A01(C36341k9.A0E(r2), "reg_attempts_check_exist") + 1;
            C36321k7.A0q(r2, "reg_attempts_check_exist", A012);
            AnonymousClass3DL r22 = new AnonymousClass3DL(A012, (String) null);
            Context context = this.A00.A00;
            String str = this.A04;
            return this.A02.A0C(r22, this.A03, str, C56442wI.A00.A01(context, str), "-1", (JSONObject) null, (byte[]) null, true);
        } catch (Exception e) {
            Log.e("VerifyTwoFactorAuth/checkifexists/error", e);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0060, code lost:
        if (((r8.A02 * 1000) + (r8.A03 - (r8.A04 * 1000))) >= X.C36431kI.A08(r8)) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0C(java.lang.Object r15) {
        /*
            r14 = this;
            X.3OL r15 = (X.AnonymousClass3OL) r15
            java.lang.ref.WeakReference r0 = r14.A05
            java.lang.Object r8 = r0.get()
            com.whatsapp.registration.VerifyTwoFactorAuth r8 = (com.whatsapp.registration.VerifyTwoFactorAuth) r8
            if (r8 == 0) goto L_0x003a
            r2 = 0
            r8.A0Q = r2
            r4 = 5000(0x1388, double:2.4703E-320)
            r9 = 1
            if (r15 == 0) goto L_0x004e
            int r0 = r15.A0S
            if (r0 != r9) goto L_0x003b
            java.lang.String r0 = "VerifyTwoFactorAuth/checkifexists ok"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.registration.VerifyTwoFactorAuth.A0H(r8, r9)
            X.0v0 r1 = r8.A09
            boolean r0 = r15.A0X
            r1.A1w(r0)
            X.0v0 r1 = r8.A09
            boolean r0 = r15.A0W
            r1.A1v(r0)
            X.0v0 r1 = r8.A09
            boolean r0 = r15.A0V
            r1.A1r(r0)
            java.lang.String r0 = r15.A0U
            r8.A3j(r2, r0)
        L_0x003a:
            return
        L_0x003b:
            long r2 = r15.A09
            long r0 = r15.A08
            long r2 = r2 + r0
            long r6 = r8.A02
            int r10 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r10 >= 0) goto L_0x006a
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            long r4 = java.lang.Math.max(r0, r4)
            goto L_0x0062
        L_0x004e:
            long r12 = X.C36431kI.A08(r8)
            long r6 = r8.A03
            long r2 = r8.A04
            long r0 = r8.A02
            r10 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r10
            long r0 = r0 * r10
            long r6 = r6 - r2
            long r0 = r0 + r6
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 < 0) goto L_0x006a
        L_0x0062:
            android.os.Handler r1 = r8.A0f
            java.lang.Runnable r0 = r8.A0h
            r1.postDelayed(r0, r4)
            return
        L_0x006a:
            com.whatsapp.registration.VerifyTwoFactorAuth.A0H(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49622jQ.A0C(java.lang.Object):void");
    }
}
