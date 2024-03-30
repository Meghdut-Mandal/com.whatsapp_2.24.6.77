package X;

import android.content.Context;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.8Yi  reason: invalid class name and case insensitive filesystem */
public class C174758Yi extends AnonymousClass2IR {
    public AnonymousClass1T1 A00;
    public boolean A01;
    public final TextView A02;

    public boolean A1G() {
        return true;
    }

    public boolean A25() {
        return false;
    }

    public int getUserNameInGroupLayoutOption() {
        return 3;
    }

    public void A16() {
        if (!this.A01) {
            this.A01 = true;
            C27861Qc A0n = C175108Zr.A0n(this);
            C18800tq r4 = A0n.A0M;
            C27111My A0m = C175108Zr.A0m(r4, A0n, this);
            C18830tt r2 = r4.A00;
            C175108Zr.A0y(r4, r2, r2, this);
            C175108Zr.A11(r4, this);
            C175108Zr.A14(r4, this, C165597tg.A0h(r4));
            C175108Zr.A12(r4, this);
            C175108Zr.A10(r4, r2, this, C175108Zr.A0q(r4));
            C175108Zr.A13(r4, this);
            C19470v6 A0k = C175108Zr.A0k(A0m, r4, r2, this, C165577te.A0U(r4));
            C175108Zr.A0v(A0k, r4, r2, this, C175108Zr.A0o(r4, this));
            C175108Zr.A0w(A0m, r4, r2, this);
            C175108Zr.A0z(r4, r2, A0n, this, C175108Zr.A0p(r2));
            C175108Zr.A0x(A0m, A0n, this);
            C175108Zr.A0u(A0k, r4, r2, A0n, this);
            this.A00 = (AnonymousClass1T1) r4.A8V.get();
        }
    }

    public void A22(AnonymousClass3T1 r2, boolean z) {
        boolean A1W = C36371kC.A1W(r2, this.A0K);
        super.A22(r2, z);
        if (z || A1W) {
            A2D();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r5.A0T.A0M(r1) == false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2D() {
        /*
            r5 = this;
            X.3T1 r4 = r5.A0K
            X.2bI r4 = (X.AnonymousClass2bI) r4
            boolean r0 = r4.A1Y()
            r2 = 0
            if (r0 == 0) goto L_0x001a
            X.11F r1 = r4.A0J()
            if (r1 == 0) goto L_0x001a
            X.0wQ r0 = r5.A0T
            boolean r0 = r0.A0M(r1)
            r3 = 1
            if (r0 != 0) goto L_0x001b
        L_0x001a:
            r3 = 0
        L_0x001b:
            X.1T1 r0 = r5.A00
            java.lang.String r0 = r0.A0O(r4, r2)
            android.widget.TextView r2 = r5.A02
            r2.setText(r0)
            r1 = 3
            X.3YD r0 = new X.3YD
            r0.<init>(r1, r5, r3)
            r2.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C174758Yi.A2D():void");
    }

    public C181058mr getFMessage() {
        return (C181058mr) this.A0K;
    }

    public void setFMessage(AnonymousClass3T1 r2) {
        C18740tg.A0C(r2 instanceof C181058mr);
        this.A0K = r2;
    }

    public C174758Yi(Context context, C89004Uw r4, AnonymousClass2bI r5) {
        super(context, r4, r5);
        A16();
        setClickable(false);
        setLongClickable(false);
        TextView A0O = C36391kE.A0O(this, R.id.info);
        this.A02 = A0O;
        A0O.setBackgroundResource(R.drawable.date_balloon);
        A0O.setTextSize(getDividerFontSize());
        A2D();
    }

    public int getCenteredLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getOutgoingLayoutId() {
        return R.layout.f9nameremoved;
    }
}
