package X;

import com.whatsapp.R;
import com.whatsapp.greenalert.GreenAlertActivity;
import com.whatsapp.qrcode.contactqr.QrScanCodeFragment;

/* renamed from: X.4Vn  reason: invalid class name and case insensitive filesystem */
public class C89174Vn extends AnonymousClass02H {
    public Object A00;
    public final int A01;

    public C89174Vn(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BcB(int i, float f, int i2) {
        if (1 - this.A01 != 0) {
            super.BcB(i, f, i2);
            return;
        }
        C47072cl r2 = (C47072cl) this.A00;
        boolean z = true;
        if (i != C36351kA.A1Y(r2.A0H) && f == 0.0f) {
            z = false;
        }
        if (r2.A0W != z) {
            r2.A0W = z;
            if (z) {
                C47072cl.A01(r2);
                return;
            }
            QrScanCodeFragment qrScanCodeFragment = r2.A0T;
            qrScanCodeFragment.A00.A0I(qrScanCodeFragment.A0D, 200);
            qrScanCodeFragment.A00.A0G(qrScanCodeFragment.A0C);
        }
    }

    public void BcC(int i) {
        int i2;
        if (this.A01 != 0) {
            C47072cl r3 = (C47072cl) this.A00;
            r3.A1o();
            C39391sC r4 = r3.A0R;
            int i3 = 0;
            do {
                r4.A00[i3].A00.setSelected(AnonymousClass000.A1S(i3, i));
                i3++;
            } while (i3 < 2);
            boolean A1Y = C36351kA.A1Y(r3.A0H);
            if (i == 0) {
                A1Y = !A1Y;
            } else if (i != 1) {
                return;
            }
            if (!A1Y) {
                AnonymousClass1RC.A06(r3, C224514j.A00(r3, R.attr.f4nameremoved, R.color.f6nameremoved), 1);
            } else if (A1Y) {
                AnonymousClass1RC.A06(r3, R.color.f6nameremoved, 2);
                if (!r3.A0W) {
                    r3.A0W = true;
                    C47072cl.A01(r3);
                }
                if (!C36431kI.A1R(r3)) {
                    r3.A05.A06(R.string.f12nameremoved, 1);
                }
            }
        } else {
            GreenAlertActivity greenAlertActivity = (GreenAlertActivity) this.A00;
            int currentLogicalItem = greenAlertActivity.A02.getCurrentLogicalItem();
            C29371Wj r2 = greenAlertActivity.A05;
            if (currentLogicalItem == 1) {
                i2 = 7;
                if (AnonymousClass3RI.A02(greenAlertActivity.A06)) {
                    i2 = 3;
                }
            } else {
                i2 = 11;
            }
            C29371Wj.A01(r2, Integer.valueOf(i2));
            GreenAlertActivity.A07(greenAlertActivity, currentLogicalItem);
            GreenAlertActivity.A0F(greenAlertActivity, currentLogicalItem);
        }
    }
}
