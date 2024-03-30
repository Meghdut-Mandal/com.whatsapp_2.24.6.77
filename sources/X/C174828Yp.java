package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.8Yp  reason: invalid class name and case insensitive filesystem */
public class C174828Yp extends AnonymousClass2IR {
    public AnonymousClass1Pp A00;
    public AnonymousClass28m A01;
    public boolean A02;
    public final TextView A03 = C36391kE.A0P(this, R.id.vcard_text);
    public final TextView A04;
    public final ImageView[] A05;
    public final LinearLayout A06;
    public final AnonymousClass1RY A07;
    public final AnonymousClass2XJ A08;

    public static void A0C(C174828Yp r8, String str, List list, int i) {
        CharSequence A022;
        int i2 = 0;
        do {
            if (list == null || i2 >= list.size()) {
                r8.A00.A06(r8.A05[i2], R.drawable.avatar_contact);
            } else {
                r8.A07.A0C(r8.A05[i2], (C65643Sx) list.get(i2));
            }
            i2++;
        } while (i2 < 3);
        if (!TextUtils.isEmpty(str)) {
            int i3 = i - 1;
            Object[] A1b = C36411kG.A1b(AnonymousClass14B.A0D(str, 50));
            AnonymousClass000.A1L(A1b, i3, 1);
            String A0L = r8.A0E.A0L(A1b, R.plurals.f10nameremoved, (long) i3);
            Context context = r8.getContext();
            TextView textView = r8.A03;
            TextPaint paint = textView.getPaint();
            AnonymousClass1H2 r1 = r8.A1M;
            if (A0L == null) {
                A022 = null;
            } else {
                A022 = AnonymousClass3UG.A02(context, paint, new C74233lH(), r1, A0L);
            }
            C175108Zr.A0t(textView, r8, A022);
            return;
        }
        TextView textView2 = r8.A03;
        Object[] objArr = new Object[1];
        AnonymousClass000.A1L(objArr, i, 0);
        textView2.setText(r8.A0E.A0L(objArr, R.plurals.f10nameremoved, (long) i));
    }

    public int getUserNameInGroupLayoutOption() {
        return 0;
    }

    public void A16() {
        if (!this.A02) {
            this.A02 = true;
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
            this.A00 = C36361kB.A0V(r4);
        }
    }

    public boolean A1K() {
        return this.A0d.BtQ();
    }

    public int getMainChildMaxWidth() {
        if (this.A0d.BLu(getFMessage())) {
            return 0;
        }
        return C175108Zr.A0h(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (X.C131806Qs.A02(r3) != false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setFMessage(X.AnonymousClass3T1 r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof X.AnonymousClass2bW
            if (r0 != 0) goto L_0x000b
            boolean r1 = X.C131806Qs.A02(r3)
            r0 = 0
            if (r1 == 0) goto L_0x000c
        L_0x000b:
            r0 = 1
        L_0x000c:
            X.C18740tg.A0C(r0)
            r2.A0K = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C174828Yp.setFMessage(X.3T1):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: android.widget.ImageView[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C174828Yp(android.content.Context r4, X.AnonymousClass1RY r5, X.C89004Uw r6, X.AnonymousClass3T1 r7, X.AnonymousClass2XJ r8) {
        /*
            r3 = this;
            r3.<init>(r4, r6, r7)
            r3.A16()
            r0 = 3
            android.widget.ImageView[] r2 = new android.widget.ImageView[r0]
            r3.A05 = r2
            r3.A07 = r5
            r3.A08 = r8
            r0 = 2131435064(0x7f0b1e38, float:1.849196E38)
            android.widget.TextView r0 = X.C36391kE.A0P(r3, r0)
            r3.A03 = r0
            r0 = 2131432708(0x7f0b1504, float:1.8487181E38)
            android.view.View r1 = r3.findViewById(r0)
            r0 = 0
            r2[r0] = r1
            r0 = 2131432709(0x7f0b1505, float:1.8487183E38)
            android.view.View r1 = r3.findViewById(r0)
            r0 = 1
            r2[r0] = r1
            r0 = 2131432710(0x7f0b1506, float:1.8487185E38)
            android.view.View r1 = r3.findViewById(r0)
            r0 = 2
            r2[r0] = r1
            r0 = 2131435146(0x7f0b1e8a, float:1.8492126E38)
            android.widget.TextView r0 = X.C36391kE.A0P(r3, r0)
            r3.A04 = r0
            r0 = 2131429055(0x7f0b06bf, float:1.8479772E38)
            android.widget.LinearLayout r1 = X.C36441kJ.A0U(r3, r0)
            r3.A06 = r1
            r0 = 48
            X.C48912iG.A00(r1, r3, r0)
            android.view.View$OnLongClickListener r0 = r3.A2W
            r1.setOnLongClickListener(r0)
            r3.A0B()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C174828Yp.<init>(android.content.Context, X.1RY, X.4Uw, X.3T1, X.2XJ):void");
    }

    private void A0B() {
        boolean z;
        AnonymousClass141 A0i;
        boolean z2;
        AnonymousClass3T1 fMessage = getFMessage();
        int A002 = AnonymousClass3RN.A00(fMessage);
        TextView textView = this.A03;
        C64933Qa r5 = fMessage.A1J;
        textView.setTag(r5);
        AnonymousClass28m r1 = this.A01;
        if (r1 != null) {
            this.A08.A07(r1);
        }
        AnonymousClass28m r2 = (AnonymousClass28m) this.A08.A02(fMessage);
        this.A01 = r2;
        r2.A0B(new AnonymousClass411(this, 10), this.A0R.A04);
        A0C(this, (String) null, (List) null, A002);
        ImageView imageView = this.A05[2];
        if (A002 == 2) {
            imageView.setVisibility(4);
        } else {
            imageView.setVisibility(0);
        }
        if (!r5.A02) {
            AnonymousClass11F r22 = r5.A00;
            boolean A0G = AnonymousClass143.A0G(r22);
            boolean z3 = true;
            AnonymousClass16D r12 = this.A0l;
            if (A0G) {
                A0i = C36441kJ.A0i(r12, fMessage.A0J());
                z2 = (!this.A1Q.A0U.A0H((AnonymousClass147) r22)) & this.A1u.A06(r22) & true;
            } else {
                A0i = C36441kJ.A0i(r12, r22);
                z2 = true;
            }
            if (A0i.A0F != null) {
                z3 = false;
            }
            z = z2 & z3 & this.A1u.A06(C36331k8.A0G(A0i));
        } else {
            z = false;
        }
        View findViewById = findViewById(R.id.button_div);
        TextView textView2 = this.A04;
        if (!z) {
            textView2.setVisibility(0);
            C48912iG.A00(textView2, this, 48);
            return;
        }
        C36421kH.A0x(textView2, findViewById);
    }

    public boolean A1E() {
        return C175108Zr.A15(this);
    }

    public void A1Y() {
        super.A1Y();
        A0B();
    }

    public void A22(AnonymousClass3T1 r2, boolean z) {
        boolean A1W = C36371kC.A1W(r2, getFMessage());
        super.A22(r2, z);
        if (z || A1W) {
            A0B();
        }
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
