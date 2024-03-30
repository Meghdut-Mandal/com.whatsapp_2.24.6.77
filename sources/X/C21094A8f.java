package X;

import android.content.DialogInterface;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import java.util.concurrent.TimeUnit;

/* renamed from: X.A8f  reason: case insensitive filesystem */
public class C21094A8f implements C160387kv, B6I {
    public final /* synthetic */ C160387kv A00;
    public final /* synthetic */ AnonymousClass8UX A01;

    public void BRY(int i, CharSequence charSequence) {
        if (i == 7) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            AnonymousClass8UX r5 = this.A01;
            C19970wo r6 = r5.A02;
            long seconds = timeUnit.toSeconds(C19970wo.A00(r6)) + 30;
            r5.A03.A02(seconds);
            long j = (seconds * 1000) + 500;
            if (j > C19970wo.A00(r6)) {
                r5.A01.A1k(j);
            }
        }
        this.A00.BRY(i, charSequence);
    }

    public C21094A8f(C160387kv r1, AnonymousClass8UX r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A00() {
        AnonymousClass8UX r1 = this.A01;
        r1.A01.A1b();
        C39001qm A002 = AnonymousClass3LW.A00(r1.A00);
        A002.A0d(R.string.f12nameremoved);
        A002.A0c(R.string.f12nameremoved);
        B83.A01(A002, this, 14, R.string.f12nameremoved);
        A002.A0r(false);
        A002.A0b();
    }

    public /* synthetic */ void A01() {
        C21253AEj aEj = this.A01.A04;
        BrazilPaymentActivity brazilPaymentActivity = aEj.A05;
        C207249un r2 = aEj.A03;
        AnonymousClass16X r1 = aEj.A02;
        String str = aEj.A06;
        String str2 = aEj.A07;
        BrazilPaymentActivity.A16(aEj.A01, r1, r2, aEj.A04, brazilPaymentActivity, str, str2);
    }

    public void BOa(C202059ky r2, Integer num) {
        this.A01.A04.BOa(r2, num);
        BWh(r2, num);
    }

    public Integer BOe() {
        return this.A01.A04.BOe();
    }

    public void BOr(C202059ky r2, Integer num) {
        this.A01.A04.BOr(r2, num);
    }

    public void BOs(Integer num) {
        this.A01.A04.BOs(num);
    }

    public void BRZ() {
        this.A00.BRZ();
    }

    public void BRb(int i, CharSequence charSequence) {
        this.A00.BRb(i, charSequence);
    }

    public void BRc(byte[] bArr) {
        AnonymousClass8UX r2 = this.A01;
        r2.A01.A06 = true;
        r2.A00.Bu1(R.string.f12nameremoved);
    }

    public void BWh(C202059ky r13, Integer num) {
        AE9 ae9;
        int i;
        String str;
        DialogInterface.OnDismissListener b8t;
        C23185B8t b8t2;
        C23185B8t b8t3;
        C206359tF A002;
        AnonymousClass8UX r2 = this.A01;
        r2.A00.Bnv();
        FingerprintBottomSheet fingerprintBottomSheet = r2.A01;
        fingerprintBottomSheet.A06 = false;
        int i2 = r13.A00;
        if (i2 == 1441) {
            fingerprintBottomSheet.A1k(r13.A02 * 1000);
            return;
        }
        C21253AEj aEj = r2.A04;
        BrazilPaymentActivity brazilPaymentActivity = aEj.A05;
        brazilPaymentActivity.A0M.A06("error_code", (long) i2, brazilPaymentActivity.A00);
        int i3 = r13.A00;
        if (i3 == 454) {
            C203399nx r0 = r13.A04;
            if (!(r0 == null || (A002 = AnonymousClass9ZX.A00(r0)) == null)) {
                brazilPaymentActivity.A0C.A05(AnonymousClass97K.A00(brazilPaymentActivity.A05, A002));
            }
            BrazilPaymentActivity.A14(aEj.A00, brazilPaymentActivity);
            return;
        }
        if (i3 == 2896003 || i3 == 2896004) {
            C203049nB.A04(C203049nB.A01(brazilPaymentActivity.A07, (AnonymousClass16X) null, brazilPaymentActivity.A0U, (String) null, false), brazilPaymentActivity.A0J, "incentive_unavailable", "payment_confirm_prompt");
            ae9 = brazilPaymentActivity.A09;
            i = r13.A00;
            str = null;
            b8t = new C23185B8t(aEj.A00, aEj, 0);
            b8t2 = null;
            b8t3 = null;
        } else {
            if (i3 == 444 || i3 == 478) {
                brazilPaymentActivity.A0H.A01.A02("FB", "PIN");
            }
            ae9 = brazilPaymentActivity.A09;
            i = r13.A00;
            AnonymousClass171 r3 = brazilPaymentActivity.A04;
            AnonymousClass1A5 r1 = brazilPaymentActivity.A06;
            UserJid userJid = brazilPaymentActivity.A0G;
            C18740tg.A06(userJid);
            str = r3.A0H(r1.A01(userJid));
            FingerprintBottomSheet fingerprintBottomSheet2 = aEj.A00;
            b8t2 = new C23185B8t(fingerprintBottomSheet2, aEj, 1);
            b8t = new C23186B8u(fingerprintBottomSheet2, 2);
            b8t3 = new C23185B8t(fingerprintBottomSheet2, aEj, 2);
        }
        ae9.A00(brazilPaymentActivity, b8t2, b8t, b8t3, str, i).show();
    }

    public void BfI(String str, Integer num) {
        AnonymousClass8UX r3 = this.A01;
        r3.A00.Bnv();
        FingerprintBottomSheet fingerprintBottomSheet = r3.A01;
        fingerprintBottomSheet.A1g(false);
        TextView textView = fingerprintBottomSheet.A01;
        if (textView != null) {
            textView.setEnabled(false);
        }
        TextView textView2 = fingerprintBottomSheet.A00;
        if (textView2 != null) {
            textView2.setEnabled(false);
        }
        C21253AEj aEj = r3.A04;
        BrazilPaymentActivity brazilPaymentActivity = aEj.A05;
        brazilPaymentActivity.A0M.A04(num, "pay-precheck");
        String str2 = aEj.A06;
        AnonymousClass16X r5 = aEj.A02;
        C207249un r6 = aEj.A03;
        String str3 = aEj.A07;
        int i = 1;
        if (brazilPaymentActivity.A3v(r5, brazilPaymentActivity.A01) == null) {
            i = 0;
        }
        brazilPaymentActivity.A3w(aEj.A01, r5, r6, aEj.A04, str2, str, str3, i);
        this.A00.BRc((byte[]) null);
    }
}
