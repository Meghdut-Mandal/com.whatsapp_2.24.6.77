package X;

import android.content.Context;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Calendar;

/* renamed from: X.9Uc  reason: invalid class name and case insensitive filesystem */
public class C195389Uc {
    public String A00 = "PENDING";
    public final AnonymousClass17Y A01;
    public final C19630wG A02;
    public final C29221Vu A03;
    public final C29121Vk A04;
    public final AnonymousClass9RT A05;
    public final C24611Dc A06 = C165607th.A0c("PaymentsComplianceManager", "infra");

    public void A00(B1S b1s, String str, String str2, int i, int i2, int i3) {
        String str3;
        C203399nx A042;
        B1S b1s2 = b1s;
        if (this.A00.equals("UNSUPPORTED")) {
            b1s2.BVz(true);
            return;
        }
        AnonymousClass9NG r11 = new AnonymousClass9NG(this.A02.A00, this.A01, this.A03, this.A04, this.A05);
        C194669Qq r12 = new C194669Qq(b1s2, this);
        ArrayList A0I = AnonymousClass001.A0I();
        C36381kD.A1M("action", "check-account-eligibility", A0I);
        C36381kD.A1M("action-type", str, A0I);
        String str4 = str2;
        if (!TextUtils.isEmpty(str4)) {
            C36381kD.A1M("credential_id", str4, A0I);
        }
        AnonymousClass1AL[] A1a = C165577te.A1a(A0I, 0);
        AnonymousClass9RT r7 = r11.A04;
        AnonymousClass9F3 r1 = r7.A00;
        int i4 = i2;
        if (i2 < 0 || i4 > 11) {
            throw AnonymousClass000.A0d("Months are 0 indexed, invalid month: ", AnonymousClass000.A0u(), i4);
        }
        Calendar instance = Calendar.getInstance();
        int i5 = i;
        int i6 = i3;
        instance.set(i5, i4, i6);
        instance.setLenient(false);
        try {
            instance.getTime();
            Calendar instance2 = Calendar.getInstance();
            instance2.setTimeInMillis(C19970wo.A00(r1.A00));
            int i7 = instance2.get(1) - instance.get(1);
            int i8 = instance.get(2);
            int i9 = instance2.get(2);
            if (i8 > i9 || (i8 == i9 && instance.get(5) > instance2.get(5))) {
                i7--;
            }
            int i10 = 13;
            if (r7.A01.A04()) {
                i10 = 16;
            }
            if (i7 < i10) {
                str3 = "2";
            } else if (i7 < 18) {
                str3 = "1";
            } else {
                str3 = "0";
            }
            if (str3.equals("0")) {
                AnonymousClass1AL[] r72 = new AnonymousClass1AL[4];
                C36341k9.A1L("state", "0", r72, 0);
                r72[1] = new AnonymousClass1AL("day", i6);
                r72[2] = new AnonymousClass1AL("month", i2 + 1);
                r72[3] = new AnonymousClass1AL("year", i5);
                A042 = C203399nx.A04("dob", r72);
            } else {
                AnonymousClass1AL[] r0 = new AnonymousClass1AL[1];
                C36341k9.A1L("state", str3, r0, 0);
                A042 = C203399nx.A04("dob", r0);
            }
            C165597tg.A1C(r11.A03, new B7J(r11.A00, r11.A02, r11.A01, r11, r12, 14), new C203399nx(A042, "account", A1a));
        } catch (Exception unused) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Date format invalid. Year: ");
            A0u.append(i5);
            A0u.append(" Month: ");
            A0u.append(i4);
            throw AnonymousClass000.A0d(" Day: ", A0u, i6);
        }
    }

    public void A01(B1T b1t, String str, String str2) {
        if (this.A00.equals("UNSUPPORTED")) {
            b1t.BbK(true);
            return;
        }
        Context context = this.A02.A00;
        AnonymousClass17Y r8 = this.A01;
        AnonymousClass9RT r11 = this.A05;
        AnonymousClass9NG r6 = new AnonymousClass9NG(context, r8, this.A03, this.A04, r11);
        C194659Qp r7 = new C194659Qp(b1t, this);
        C18740tg.A05(str);
        AnonymousClass1AL[] r3 = new AnonymousClass1AL[2];
        boolean A1Y = C36371kC.A1Y("action", "check-account-eligibility", r3);
        r3[1] = new AnonymousClass1AL("action-type", str2);
        AnonymousClass1AL[] r1 = new AnonymousClass1AL[1];
        C36341k9.A1L("full", str, r1, A1Y ? 1 : 0);
        C203399nx r12 = new C203399nx(C203399nx.A04(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r1), "account", r3);
        C165597tg.A1C(r6.A03, new B7J(r6.A00, r6.A02, r6.A01, r6, r7, 13), r12);
    }

    public C195389Uc(AnonymousClass17Y r3, C19630wG r4, C29221Vu r5, C29121Vk r6, AnonymousClass9RT r7) {
        this.A02 = r4;
        this.A01 = r3;
        this.A05 = r7;
        this.A04 = r6;
        this.A03 = r5;
    }
}
