package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4mg  reason: invalid class name and case insensitive filesystem */
public class C96034mg extends AnonymousClass0CZ {
    public final Context A00;
    public final C157437cx A01;
    public final AnonymousClass1N2 A02;
    public final List A03 = AnonymousClass001.A0I();
    public final AnonymousClass6CW A04;

    public int A0J() {
        return this.A03.size();
    }

    public void A0L(List list) {
        List list2 = this.A03;
        C36341k9.A1A(new C95574lq(list2, list), this, list, list2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c2, code lost:
        if (getItemViewType(r19 + 1) == 0) goto L_0x00c4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BSE(X.AnonymousClass0D3 r18, int r19) {
        /*
            r17 = this;
            r13 = r18
            r12 = r17
            java.util.List r3 = r12.A03
            int r0 = r3.size()
            r15 = r19
            if (r15 >= r0) goto L_0x002a
            java.lang.Object r4 = r3.get(r15)
            X.66u r4 = (X.C1270666u) r4
            int r2 = r4.A01
            if (r2 == 0) goto L_0x00cc
            r1 = 1
            if (r2 == r1) goto L_0x002b
            r0 = 2
            if (r2 != r0) goto L_0x002b
            X.4nY r13 = (X.C96574nY) r13
            java.util.List r0 = X.AnonymousClass0D3.A0I
            android.widget.TextView r1 = r13.A00
            r0 = 2131892349(0x7f12187d, float:1.9419444E38)
            r1.setText(r0)
        L_0x002a:
            return
        L_0x002b:
            X.8b6 r14 = r4.A02
            X.7cx r0 = r12.A01
            com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity r0 = (com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity) r0
            java.lang.String r2 = r0.A09
            java.util.ArrayList r0 = r0.A0A
            android.util.Pair r6 = X.C36441kJ.A0Q(r2, r0)
            android.content.Context r0 = r12.A00
            android.content.res.Resources r4 = r0.getResources()
            boolean r0 = r14.A0J
            r2 = 2131231091(0x7f080173, float:1.8078253E38)
            if (r0 == 0) goto L_0x0049
            r2 = 2131231092(0x7f080174, float:1.8078255E38)
        L_0x0049:
            r0 = 0
            android.graphics.drawable.Drawable r7 = X.AnonymousClass0BT.A00(r0, r4, r2)
            r2 = r13
            X.4nv r2 = (X.C96804nv) r2
            java.lang.Object r5 = r6.first
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r6.second
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.List r0 = X.AnonymousClass0D3.A0I
            java.lang.String r0 = r14.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0092
            X.6CW r6 = r2.A03
            java.lang.String r11 = r14.A03
            X.C18740tg.A06(r11)
            android.widget.ImageView r9 = r2.A01
            r10 = 0
            r8 = r7
            r6.A00(r7, r8, r9, r10, r11)
        L_0x0071:
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            if (r4 == 0) goto L_0x007a
            r6.addAll(r4)
        L_0x007a:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x0098
            r7 = 0
        L_0x0081:
            int r0 = r5.length()
            if (r7 >= r0) goto L_0x0098
            int r4 = r7 + 1
            java.lang.String r0 = r5.substring(r7, r4)
            r6.add(r0)
            r7 = r4
            goto L_0x0081
        L_0x0092:
            android.widget.ImageView r0 = r2.A01
            r0.setImageDrawable(r7)
            goto L_0x0071
        L_0x0098:
            com.whatsapp.TextEmojiLabel r5 = r2.A02
            X.6c7 r0 = r14.A01
            if (r0 != 0) goto L_0x00c9
            r4 = 0
        L_0x009f:
            java.lang.String r4 = (java.lang.String) r4
            r0 = 0
            r5.A0J(r4, r6, r0, r0)
            android.view.View r0 = r13.A0H
            r16 = 4
            X.6cs r11 = new X.6cs
            r11.<init>(r12, r13, r14, r15, r16)
            r0.setOnClickListener(r11)
            android.view.View r2 = r2.A00
            if (r2 == 0) goto L_0x002a
            int r0 = X.C36421kH.A06(r3, r1)
            if (r15 == r0) goto L_0x00c4
            int r0 = r19 + 1
            int r1 = r12.getItemViewType(r0)
            r0 = 0
            if (r1 != 0) goto L_0x00c5
        L_0x00c4:
            r0 = 4
        L_0x00c5:
            r2.setVisibility(r0)
            return
        L_0x00c9:
            java.lang.Object r4 = r0.A00
            goto L_0x009f
        L_0x00cc:
            X.4nY r13 = (X.C96574nY) r13
            java.util.List r0 = X.AnonymousClass0D3.A0I
            android.widget.TextView r1 = r13.A00
            java.lang.String r0 = r4.A00
            r1.setText(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96034mg.BSE(X.0D3, int):void");
    }

    public int getItemViewType(int i) {
        List list = this.A03;
        if (i >= list.size()) {
            return -1;
        }
        return ((C1270666u) list.get(i)).A01;
    }

    public C96034mg(Context context, C157437cx r3, AnonymousClass6CW r4, AnonymousClass1N2 r5) {
        this.A00 = context;
        this.A01 = r3;
        this.A02 = r5;
        this.A04 = r4;
    }

    public AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        int i2;
        int i3;
        LayoutInflater A0C = C36351kA.A0C(viewGroup);
        if (i != 0) {
            if (i == 1) {
                List list = AnonymousClass0D3.A0I;
                i3 = R.layout.f9nameremoved;
            } else if (i == 2) {
                List list2 = AnonymousClass0D3.A0I;
                i2 = R.layout.f9nameremoved;
            } else if (i == 3) {
                List list3 = AnonymousClass0D3.A0I;
                i3 = R.layout.f9nameremoved;
            } else {
                Object[] objArr = new Object[1];
                AnonymousClass000.A1L(objArr, i, 0);
                throw AnonymousClass001.A0E(String.format("PAY: BankListAdapter/onCreateViewHolder  unsupported view type %d", objArr));
            }
            return new C96804nv(A0C.inflate(i3, viewGroup, false), this.A04);
        }
        List list4 = AnonymousClass0D3.A0I;
        i2 = R.layout.f9nameremoved;
        return new C96574nY(A0C.inflate(i2, viewGroup, false));
    }
}
