package X;

import android.content.Intent;
import com.whatsapp.R;
import com.whatsapp.calling.service.VoiceServiceEventCallback;
import com.whatsapp.email.EmailVerificationActivity;
import com.whatsapp.email.UpdateEmailActivity;
import com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView;
import com.whatsapp.registration.email.RegisterEmail;
import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.3vJ  reason: invalid class name and case insensitive filesystem */
public class C80383vJ implements Runnable {
    public Object A00;
    public String A01;
    public boolean A02;
    public final int A03;

    public C80383vJ(Object obj, String str, int i, boolean z) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = str;
        this.A02 = z;
    }

    public final void run() {
        Object obj;
        switch (this.A03) {
            case 0:
                boolean z = this.A02;
                String str = this.A01;
                C145166tS r2 = (C145166tS) this.A00;
                HashMap hashMap = C63983Me.A00;
                if (z) {
                    obj = hashMap.remove(str);
                } else {
                    obj = hashMap.get(str);
                }
                AbstractCollection abstractCollection = (AbstractCollection) obj;
                if (abstractCollection != null) {
                    Iterator it = abstractCollection.iterator();
                    while (it.hasNext()) {
                        C87924Qs r0 = (C87924Qs) it.next();
                        if (r0 != null) {
                            r0.Bc9(r2, z);
                        }
                    }
                }
                if (!C63933Lz.A01(str)) {
                    AnonymousClass166 r02 = C64033Mj.A00;
                    synchronized (r02) {
                        r02.put(str, r2);
                    }
                    return;
                }
                return;
            case 1:
                ((VoiceServiceEventCallback) this.A00).m11lambda$linkCreateAcked$0$comwhatsappcallingserviceVoiceServiceEventCallback(this.A01, this.A02);
                return;
            case 2:
                boolean z2 = this.A02;
                String str2 = this.A01;
                ExpressionsBottomSheetView expressionsBottomSheetView = ((C70803fk) this.A00).A3l;
                if (expressionsBottomSheetView == null) {
                    return;
                }
                if (z2) {
                    expressionsBottomSheetView.A0G(str2);
                    return;
                } else {
                    expressionsBottomSheetView.A0H(str2);
                    return;
                }
            case 3:
                String str3 = this.A01;
                EmailVerificationActivity emailVerificationActivity = (EmailVerificationActivity) this.A00;
                boolean z3 = this.A02;
                if (str3 == null || str3.length() == 0) {
                    EmailVerificationActivity.A0F(emailVerificationActivity, 5, 8);
                    emailVerificationActivity.A09.A1X((String) null);
                    emailVerificationActivity.A09.A23(false);
                    AnonymousClass3Y0.A01(C36361kB.A0F(C36391kE.A0L(C36341k9.A0X(emailVerificationActivity.A00, R.id.add_email_btn_view_stub), 0), R.id.add_email_submit), emailVerificationActivity, 23);
                } else {
                    EmailVerificationActivity.A0F(emailVerificationActivity, 7, 8);
                    emailVerificationActivity.A09.A1X(str3);
                    emailVerificationActivity.A09.A23(z3);
                    EmailVerificationActivity.A01(emailVerificationActivity);
                }
                EmailVerificationActivity.A07(emailVerificationActivity);
                return;
            case 4:
                UpdateEmailActivity updateEmailActivity = (UpdateEmailActivity) this.A00;
                String str4 = this.A01;
                boolean z4 = this.A02;
                AnonymousClass00C.A0D(str4, 1);
                AnonymousClass3SJ.A00(updateEmailActivity, 1);
                if (str4.length() == 0) {
                    updateEmailActivity.A3i().A00(updateEmailActivity.A09, (String) null, updateEmailActivity.A00, 4, 2, 1);
                    updateEmailActivity.A09.A1X((String) null);
                    updateEmailActivity.A09.A23(false);
                    C24801Dv r3 = updateEmailActivity.A01;
                    if (updateEmailActivity.A05 != null) {
                        r3.A06(updateEmailActivity, AnonymousClass190.A16(updateEmailActivity, updateEmailActivity.A09, updateEmailActivity.A00));
                        updateEmailActivity.finish();
                        return;
                    }
                    throw C36331k8.A0X();
                } else if (z4) {
                    updateEmailActivity.A3i().A00(updateEmailActivity.A09, (String) null, updateEmailActivity.A00, UpdateEmailActivity.A01(updateEmailActivity), 2, 1);
                    updateEmailActivity.A09.A1X(str4);
                    updateEmailActivity.A09.A23(false);
                    C24801Dv r4 = updateEmailActivity.A01;
                    if (updateEmailActivity.A05 != null) {
                        int i = updateEmailActivity.A01;
                        int i2 = updateEmailActivity.A00;
                        C36361kB.A0w(updateEmailActivity, C36401kF.A07(updateEmailActivity, str4, i), r4, updateEmailActivity.A09, i2);
                        AnonymousClass1RJ r1 = updateEmailActivity.A07;
                        if (r1 == null) {
                            throw C36331k8.A0d("invalidEmailViewStub");
                        }
                        r1.A03(8);
                        return;
                    }
                    throw C36331k8.A0X();
                } else {
                    updateEmailActivity.A3i().A00(updateEmailActivity.A09, "INVALID_EMAIL", updateEmailActivity.A00, UpdateEmailActivity.A01(updateEmailActivity), 2, 2);
                    UpdateEmailActivity.A07(updateEmailActivity);
                    return;
                }
            case 5:
                AnonymousClass6PZ r5 = (AnonymousClass6PZ) this.A00;
                String str5 = this.A01;
                boolean z5 = this.A02;
                C1042158s r22 = new C1042158s();
                AnonymousClass6PZ.A00(r5, r22);
                r22.A07 = Long.valueOf(r5.A00);
                r22.A0N = r5.A04;
                r22.A0L = str5;
                r22.A01 = r5.A02;
                r5.A09.Blv(r22);
                if (!"user_interrupted".equals(str5)) {
                    r5.A02((String) null, r5.A02);
                }
                if (z5) {
                    r5.A01 = null;
                    r5.A04 = null;
                    r5.A02 = null;
                    r5.A00 = 1;
                    return;
                }
                return;
            default:
                RegisterEmail registerEmail = (RegisterEmail) this.A00;
                boolean z6 = this.A02;
                String str6 = this.A01;
                AnonymousClass00C.A0D(str6, 2);
                AnonymousClass3SJ.A00(registerEmail, 1);
                C194349Pi r7 = registerEmail.A03;
                if (r7 != null) {
                    String str7 = registerEmail.A0D;
                    int i3 = registerEmail.A00;
                    if (z6) {
                        r7.A00(str7, (String) null, i3, 1, 2, 1);
                        registerEmail.A09.A1X(str6);
                        registerEmail.A09.A23(false);
                        AnonymousClass1RJ r12 = registerEmail.A0A;
                        if (r12 == null) {
                            throw C36331k8.A0d("invalidEmailViewStub");
                        }
                        r12.A03(8);
                        C24801Dv r72 = registerEmail.A01;
                        if (registerEmail.A06 != null) {
                            int i4 = registerEmail.A00;
                            String str8 = registerEmail.A0D;
                            Intent A0D = C36431kI.A0D();
                            A0D.setClassName(registerEmail.getPackageName(), "com.whatsapp.registration.email.VerifyEmail");
                            A0D.putExtra("email", str6);
                            C36361kB.A0w(registerEmail, A0D, r72, str8, i4);
                            return;
                        }
                        throw C36331k8.A0X();
                    }
                    r7.A00(str7, "INVALID_EMAIL", i3, 1, 2, 2);
                    AnonymousClass1RJ r03 = registerEmail.A0A;
                    if (r03 == null) {
                        throw C36331k8.A0d("invalidEmailViewStub");
                    }
                    r03.A03(0);
                    return;
                }
                throw C36331k8.A0d("emailVerificationLogger");
        }
    }
}
