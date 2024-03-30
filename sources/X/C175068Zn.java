package X;

import android.content.Context;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.8Zn  reason: invalid class name and case insensitive filesystem */
public abstract class C175068Zn extends AnonymousClass8YU {
    public TextView A00;

    public int getUserNameInGroupLayoutOption() {
        return 3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        if (r10.A0G.A0E(6307) == false) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2D() {
        /*
            r10 = this;
            X.3T1 r5 = r10.A0K
            X.5J5 r5 = (X.AnonymousClass5J5) r5
            java.util.List r1 = r5.A00
            boolean r0 = r1.isEmpty()
            r6 = 0
            if (r0 != 0) goto L_0x001a
            java.lang.Object r0 = r1.get(r6)
            X.5Nh r0 = (X.C107265Nh) r0
            boolean r0 = r0.A0O()
            if (r0 == 0) goto L_0x001a
            r6 = 1
        L_0x001a:
            java.util.List r4 = r5.A00
            boolean r0 = r4.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0030
            java.lang.Object r0 = r4.get(r1)
            X.5Nh r0 = (X.C107265Nh) r0
            boolean r0 = r0.A0Q()
            if (r0 == 0) goto L_0x0030
            r1 = 1
        L_0x0030:
            r3 = 1
            r8 = 0
            if (r1 == 0) goto L_0x003f
            X.0yC r1 = r10.A0G
            r0 = 6307(0x18a3, float:8.838E-42)
            boolean r0 = r1.A0E(r0)
            r2 = 1
            if (r0 != 0) goto L_0x0040
        L_0x003f:
            r2 = 0
        L_0x0040:
            int r1 = r5.A1X()
            if (r1 == 0) goto L_0x00c6
            if (r1 == r3) goto L_0x00c3
            r0 = 2
            if (r1 == r0) goto L_0x00c0
            X.9Jy r1 = X.AnonymousClass8Z5.A02
        L_0x004d:
            if (r6 == 0) goto L_0x00a3
            r9 = 2131887490(0x7f120582, float:1.9409589E38)
        L_0x0052:
            X.0wo r2 = r10.A19
            long r0 = r5.A0I
            long r1 = r2.A08(r0)
            android.widget.TextView r4 = r10.A00
            X.0ts r7 = r10.A0E
            android.content.Context r6 = r10.getContext()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            X.0ts r0 = r10.A0E
            java.lang.String r0 = X.AnonymousClass3UM.A00(r0, r1)
            java.lang.String r0 = X.C36391kE.A0v(r6, r0, r3, r8, r9)
            java.lang.String r0 = X.AnonymousClass3UM.A01(r7, r0, r1)
            r4.setText(r0)
            r0 = 19
            X.AnonymousClass3YF.A00(r4, r10, r5, r0)
            X.0ts r3 = r10.A0E
            android.content.Context r2 = r10.getContext()
            boolean r0 = r5.A1Y()
            r1 = 2131232503(0x7f0806f7, float:1.8081117E38)
            if (r0 == 0) goto L_0x008c
            r1 = 2131233254(0x7f0809e6, float:1.808264E38)
        L_0x008c:
            r0 = 2131101695(0x7f0607ff, float:1.7815807E38)
            android.graphics.drawable.Drawable r2 = X.AnonymousClass3UF.A02(r2, r1, r0)
            boolean r0 = X.C36401kF.A1X(r3)
            r1 = 0
            if (r0 == 0) goto L_0x00c9
            X.4vb r0 = new X.4vb
            r0.<init>(r2, r3)
            r4.setCompoundDrawablesWithIntrinsicBounds(r1, r1, r0, r1)
            return
        L_0x00a3:
            if (r2 == 0) goto L_0x00a8
            int r9 = r1.A00
            goto L_0x0052
        L_0x00a8:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x00bd
            java.lang.Object r0 = r4.get(r8)
            X.5Nh r0 = (X.C107265Nh) r0
            boolean r0 = r0.A0P()
            if (r0 == 0) goto L_0x00bd
            int r9 = r1.A01
            goto L_0x0052
        L_0x00bd:
            int r9 = r1.A02
            goto L_0x0052
        L_0x00c0:
            X.9Jy r1 = X.AnonymousClass8Z5.A03
            goto L_0x004d
        L_0x00c3:
            X.9Jy r1 = X.AnonymousClass8Z5.A04
            goto L_0x004d
        L_0x00c6:
            X.9Jy r1 = X.AnonymousClass8Z5.A05
            goto L_0x004d
        L_0x00c9:
            r4.setCompoundDrawablesWithIntrinsicBounds(r2, r1, r1, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175068Zn.A2D():void");
    }

    public C175068Zn(Context context, C89004Uw r4, AnonymousClass3T1 r5) {
        super(context, r4, r5);
        TextView A0O = C36391kE.A0O(this, R.id.info);
        this.A00 = A0O;
        A0O.setTextSize(getDividerFontSize());
    }

    public void A1Y() {
        A2D();
        super.A1Y();
    }

    public void A22(AnonymousClass3T1 r2, boolean z) {
        boolean A1W = C36371kC.A1W(r2, getFMessage());
        super.A22(r2, z);
        if (z || A1W) {
            A2D();
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
