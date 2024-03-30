package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.payments.ui.PaymentTransactionHistoryActivity;
import java.util.Calendar;
import java.util.List;

/* renamed from: X.7zm  reason: invalid class name and case insensitive filesystem */
public class C168147zm extends AnonymousClass0CZ implements C160717lT {
    public AnonymousClass9FD A00 = null;
    public List A01;
    public final int A02;
    public final Context A03;
    public final C22956Az8 A04;
    public final C22828Awd A05;
    public final C1276068y A06;
    public final C18820ts A07;
    public final C20310xM A08;
    public final AnonymousClass1VZ A09;
    public final C24611Dc A0A;
    public final AnonymousClass1FR A0B;

    public int A0J() {
        return this.A01.size();
    }

    /* renamed from: A0L */
    public void BSC(C168247zw r3, int i) {
        List list = AnonymousClass0D3.A0I;
        r3.A00.setText(((PaymentTransactionHistoryActivity) this.A05).A0Y.get(i).toString());
    }

    public int BAF(int i) {
        return ((C1512678w) ((PaymentTransactionHistoryActivity) this.A05).A0Y.get(i)).count;
    }

    public int BCL() {
        return ((PaymentTransactionHistoryActivity) this.A05).A0Y.size();
    }

    public long BCM(int i) {
        return -((Calendar) ((PaymentTransactionHistoryActivity) this.A05).A0Y.get(i)).getTimeInMillis();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x009e, code lost:
        if (r9.A01(((X.C202319lY) r12.A01.get(r14)).A05).equals(r9.A01(((X.C202319lY) r12.A01.get(r7)).A05)) != false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00a6, code lost:
        if (r7 == r12.A01.size()) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00a8, code lost:
        r2.findViewById(com.whatsapp.R.id.divider).setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00b4, code lost:
        r11 = ((com.whatsapp.payments.ui.PaymentTransactionHistoryActivity) r12.A05).A0M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00ba, code lost:
        if (r11 == null) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00bc, code lost:
        r0 = r12.A09.A00(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00c2, code lost:
        if (r0 == null) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00c4, code lost:
        r9 = r0.A0b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00c8, code lost:
        r10 = r12.A0B;
        r7 = r10.A0Q(r3);
        r8 = r12.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00d5, code lost:
        if (X.C202859mm.A04(r8, r9, r11, true) == false) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00d7, code lost:
        r6.A0J(r9, ((com.whatsapp.payments.ui.PaymentTransactionHistoryActivity) r13.A01.A05).A0M, 0, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00e5, code lost:
        if (r12.A00 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00e7, code lost:
        X.C36371kC.A1F(r2, r12, r3, 37);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ec, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00f1, code lost:
        if (X.C202859mm.A04(r8, r7, r11, true) == false) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00f3, code lost:
        r1 = ((com.whatsapp.payments.ui.PaymentTransactionHistoryActivity) r13.A01.A05).A0M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00fb, code lost:
        r5.A0J(r7, r1, 0, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0100, code lost:
        r7 = r10.A0P(r3);
        r1 = ((com.whatsapp.payments.ui.PaymentTransactionHistoryActivity) r13.A01.A05).A0M;
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x010e, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BSE(X.AnonymousClass0D3 r13, int r14) {
        /*
            r12 = this;
            java.util.List r0 = r12.A01
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0010
            X.1Dc r1 = r12.A0A
            java.lang.String r0 = "Transaction items size zero even when binding"
            r1.A05(r0)
        L_0x000f:
            return
        L_0x0010:
            java.util.List r0 = r12.A01
            java.lang.Object r3 = r0.get(r14)
            X.9lY r3 = (X.C202319lY) r3
            X.C18740tg.A06(r3)
            boolean r0 = r13 instanceof X.C168197zr
            if (r0 == 0) goto L_0x0027
            android.view.View r0 = r13.A0H
            com.whatsapp.payments.ui.widget.PaymentInteropShimmerRow r0 = (com.whatsapp.payments.ui.widget.PaymentInteropShimmerRow) r0
            r0.B1s(r3)
            return
        L_0x0027:
            X.7zz r13 = (X.C168277zz) r13
            X.8li r2 = r13.A00
            com.whatsapp.TextEmojiLabel r5 = r2.A0D
            java.lang.String r8 = ""
            r5.setText(r8)
            android.content.Context r6 = r2.getContext()
            android.content.Context r4 = r2.getContext()
            r1 = 2130970020(0x7f0405a4, float:1.7548738E38)
            r0 = 2131101134(0x7f0605ce, float:1.781467E38)
            int r0 = X.C224514j.A00(r4, r1, r0)
            X.C36331k8.A0r(r6, r5, r0)
            com.whatsapp.TextEmojiLabel r6 = r2.A0C
            r6.setText(r8)
            com.whatsapp.TextEmojiLabel r4 = r2.A0B
            r4.setText(r8)
            r7 = 0
            r4.setVisibility(r7)
            android.view.View r0 = r2.A02
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r2.A09
            r0.setText(r8)
            r0.setVisibility(r7)
            com.whatsapp.WaImageView r0 = r2.A0F
            r0.setVisibility(r1)
            r0 = 2131429619(0x7f0b08f3, float:1.8480916E38)
            X.C36341k9.A10(r2, r0, r7)
            r2.B1s(r3)
            int r7 = r14 + 1
            java.util.List r0 = r12.A01
            int r0 = r0.size()
            if (r7 >= r0) goto L_0x00a0
            java.util.List r0 = r12.A01
            java.lang.Object r1 = r0.get(r14)
            X.9lY r1 = (X.C202319lY) r1
            java.util.List r0 = r12.A01
            java.lang.Object r10 = r0.get(r7)
            X.9lY r10 = (X.C202319lY) r10
            X.68y r9 = r12.A06
            long r0 = r1.A05
            X.78w r8 = r9.A01(r0)
            long r0 = r10.A05
            X.78w r0 = r9.A01(r0)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00a8
        L_0x00a0:
            java.util.List r0 = r12.A01
            int r0 = r0.size()
            if (r7 != r0) goto L_0x00b4
        L_0x00a8:
            r0 = 2131429619(0x7f0b08f3, float:1.8480916E38)
            android.view.View r1 = r2.findViewById(r0)
            r0 = 8
            r1.setVisibility(r0)
        L_0x00b4:
            X.Awd r0 = r12.A05
            com.whatsapp.payments.ui.PaymentTransactionHistoryActivity r0 = (com.whatsapp.payments.ui.PaymentTransactionHistoryActivity) r0
            java.util.ArrayList r11 = r0.A0M
            if (r11 == 0) goto L_0x00e3
            X.1VZ r0 = r12.A09
            X.3T1 r0 = r0.A00(r3)
            if (r0 == 0) goto L_0x010e
            java.lang.String r9 = r0.A0b()
        L_0x00c8:
            X.1FR r10 = r12.A0B
            java.lang.String r7 = r10.A0Q(r3)
            X.0ts r8 = r12.A07
            r1 = 1
            boolean r0 = X.C202859mm.A04(r8, r9, r11, r1)
            if (r0 == 0) goto L_0x00ed
            X.7zm r0 = r13.A01
            X.Awd r0 = r0.A05
            com.whatsapp.payments.ui.PaymentTransactionHistoryActivity r0 = (com.whatsapp.payments.ui.PaymentTransactionHistoryActivity) r0
            java.util.ArrayList r1 = r0.A0M
            r0 = 0
            r6.A0J(r9, r1, r0, r0)
        L_0x00e3:
            X.9FD r0 = r12.A00
            if (r0 == 0) goto L_0x000f
            r0 = 37
            X.C36371kC.A1F(r2, r12, r3, r0)
            return
        L_0x00ed:
            boolean r0 = X.C202859mm.A04(r8, r7, r11, r1)
            if (r0 == 0) goto L_0x0100
            X.7zm r0 = r13.A01
            X.Awd r0 = r0.A05
            com.whatsapp.payments.ui.PaymentTransactionHistoryActivity r0 = (com.whatsapp.payments.ui.PaymentTransactionHistoryActivity) r0
            java.util.ArrayList r1 = r0.A0M
        L_0x00fb:
            r0 = 0
            r5.A0J(r7, r1, r0, r0)
            goto L_0x00e3
        L_0x0100:
            java.lang.String r7 = r10.A0P(r3)
            X.7zm r0 = r13.A01
            X.Awd r0 = r0.A05
            com.whatsapp.payments.ui.PaymentTransactionHistoryActivity r0 = (com.whatsapp.payments.ui.PaymentTransactionHistoryActivity) r0
            java.util.ArrayList r1 = r0.A0M
            r5 = r4
            goto L_0x00fb
        L_0x010e:
            r9 = 0
            goto L_0x00c8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C168147zm.BSE(X.0D3, int):void");
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUs(ViewGroup viewGroup) {
        boolean z = this instanceof C179238jf;
        Context context = this.A03;
        LayoutInflater layoutInflater = C24801Dv.A00(context).getLayoutInflater();
        if (z) {
            View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
            inflate.setClickable(false);
            C36341k9.A0q(context, inflate, C36411kG.A01(context));
            return new C179228je(inflate);
        }
        View inflate2 = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
        inflate2.setClickable(false);
        C36341k9.A0q(context, inflate2, C36411kG.A01(context));
        return new C168247zw(inflate2);
    }

    public AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        if (i == 2000) {
            return new C168197zr(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved));
        }
        return new C168277zz(new C180388li(this.A03, this.A04, this.A02), this);
    }

    public int getItemViewType(int i) {
        C202319lY r2 = (C202319lY) this.A01.get(i);
        if (r2.A03 != 1000 || !r2.A0P) {
            return 1000;
        }
        return 2000;
    }

    public C168147zm(Context context, C18820ts r3, C20310xM r4, AnonymousClass1VZ r5, C22956Az8 az8, C24611Dc r7, C22828Awd awd, C1276068y r9, AnonymousClass1FR r10, List list, int i) {
        this.A03 = context;
        this.A01 = C36441kJ.A15(list);
        this.A04 = az8;
        this.A0A = r7;
        this.A08 = r4;
        this.A09 = r5;
        this.A07 = r3;
        this.A0B = r10;
        this.A06 = r9;
        this.A05 = awd;
        this.A02 = i;
    }

    public /* bridge */ /* synthetic */ boolean Bhn(MotionEvent motionEvent, AnonymousClass0D3 r3, int i) {
        return false;
    }
}
