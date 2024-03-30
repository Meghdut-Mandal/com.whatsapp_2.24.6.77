package X;

import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.whatsapp.newsletter.NewsletterInfoActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1na  reason: invalid class name and case insensitive filesystem */
public final class C38021na extends BaseAdapter implements Filterable {
    public C52382pL A00 = C52382pL.SUBSCRIBED;
    public String A01;
    public ArrayList A02;
    public final LayoutInflater A03;
    public final C61423Bv A04;
    public final C19730wQ A05;
    public final AnonymousClass1LI A06;
    public final AnonymousClass171 A07;
    public final AnonymousClass1RY A08;
    public final C18820ts A09;
    public final C20810yC A0A;
    public final NewsletterInfoActivity A0B;
    public final List A0C = AnonymousClass001.A0I();
    public final List A0D = AnonymousClass001.A0I();
    public final AnonymousClass00T A0E = C36431kI.A1I(new AnonymousClass4CX(this));
    public final AnonymousClass00T A0F = C36431kI.A1I(new AnonymousClass4CY(this));
    public final Filter A0G = new C38081ng(this);

    public final void A01(C52382pL r4, List list) {
        AnonymousClass00C.A0D(list, 0);
        this.A00 = r4;
        List list2 = this.A0C;
        list2.clear();
        list2.addAll(list);
        String str = this.A01;
        this.A01 = str;
        if (str == null || str.length() == 0) {
            A00(this, list2);
        } else {
            getFilter().filter(str);
        }
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getViewTypeCount() {
        return 3;
    }

    public static final void A00(C38021na r2, List list) {
        List list2 = r2.A0D;
        list2.clear();
        list2.addAll(list);
        ArrayList A032 = C202859mm.A03(r2.A09, r2.A01);
        AnonymousClass00C.A08(A032);
        r2.A02 = A032;
        r2.notifyDataSetChanged();
    }

    public int getCount() {
        return this.A0D.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A0D.get(i);
    }

    public int getItemViewType(int i) {
        Object obj = this.A0D.get(i);
        if (obj instanceof AnonymousClass2Y2) {
            return 0;
        }
        if (obj instanceof AnonymousClass2Y4) {
            return 1;
        }
        if (obj instanceof AnonymousClass2Y5) {
            return 2;
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0122, code lost:
        if (r5 != r10) goto L_0x0124;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0143  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r18, android.view.View r19, android.view.ViewGroup r20) {
        /*
            r17 = this;
            r3 = r19
            r0 = 2
            r4 = r20
            X.AnonymousClass00C.A0D(r4, r0)
            r6 = r17
            java.util.List r0 = r6.A0D
            r1 = r18
            java.lang.Object r5 = r0.get(r1)
            X.2tY r5 = (X.C54792tY) r5
            if (r19 != 0) goto L_0x0034
            int r3 = r6.getItemViewType(r1)
            r2 = 0
            if (r3 == 0) goto L_0x0059
            r0 = 1
            if (r3 == r0) goto L_0x004a
            r0 = 2
            if (r3 != r0) goto L_0x018a
            android.view.LayoutInflater r1 = r6.A03
            r0 = 2131625627(0x7f0e069b, float:1.8878467E38)
            android.view.View r3 = X.C36371kC.A0J(r1, r4, r0, r2)
            X.2Y7 r0 = new X.2Y7
            r0.<init>(r3, r6)
        L_0x0031:
            r3.setTag(r0)
        L_0x0034:
            java.lang.Object r4 = r3.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.newsletter.NewsletterMembersListAdapter.ViewHolder"
            X.AnonymousClass00C.A0E(r4, r0)
            X.3Ck r4 = (X.AnonymousClass3Ck) r4
            java.util.ArrayList r0 = r6.A02
            if (r0 != 0) goto L_0x0068
            java.lang.String r0 = "filterTerms"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x004a:
            android.view.LayoutInflater r1 = r6.A03
            r0 = 2131625637(0x7f0e06a5, float:1.8878488E38)
            android.view.View r3 = X.C36371kC.A0J(r1, r4, r0, r2)
            X.2Y6 r0 = new X.2Y6
            r0.<init>(r3, r6)
            goto L_0x0031
        L_0x0059:
            android.view.LayoutInflater r1 = r6.A03
            r0 = 2131625638(0x7f0e06a6, float:1.887849E38)
            android.view.View r3 = X.C36371kC.A0J(r1, r4, r0, r2)
            X.2Y8 r0 = new X.2Y8
            r0.<init>(r3, r6)
            goto L_0x0031
        L_0x0068:
            boolean r0 = r4 instanceof X.AnonymousClass2Y7
            if (r0 == 0) goto L_0x0088
            X.2Y7 r4 = (X.AnonymousClass2Y7) r4
            r8 = 0
            X.AnonymousClass00C.A0D(r5, r8)
            r7 = 1
            r4.A00 = r5
            X.2Y5 r5 = (X.AnonymousClass2Y5) r5
            java.lang.String r6 = r5.A00
            int r0 = r6.length()
            if (r0 != 0) goto L_0x0167
            com.whatsapp.WaTextView r1 = r4.A00
            r0 = 2131893867(0x7f121e6b, float:1.9422523E38)
            r1.setText(r0)
        L_0x0087:
            return r3
        L_0x0088:
            boolean r0 = r4 instanceof X.AnonymousClass2Y8
            if (r0 == 0) goto L_0x0178
            X.2Y8 r4 = (X.AnonymousClass2Y8) r4
            r2 = 0
            X.AnonymousClass00C.A0D(r5, r2)
            r4.A00 = r5
            boolean r0 = r5 instanceof X.AnonymousClass2Y2
            X.C18740tg.A0C(r0)
            X.2Y2 r5 = (X.AnonymousClass2Y2) r5
            X.378 r7 = r5.A00
            X.141 r9 = r7.A00
            X.11F r0 = r9.A0H
            X.1na r6 = r4.A05
            X.0wQ r12 = r6.A05
            boolean r8 = r12.A0M(r0)
            X.3SF r1 = r4.A02
            r0 = 0
            com.whatsapp.TextEmojiLabel r11 = r1.A01
            r11.setText(r0)
            com.whatsapp.newsletter.NewsletterInfoActivity r10 = r6.A0B
            r5 = 2130970020(0x7f0405a4, float:1.7548738E38)
            r0 = 2131101134(0x7f0605ce, float:1.781467E38)
            X.C36321k7.A0M(r10, r11, r5, r0)
            com.whatsapp.TextEmojiLabel r5 = r4.A01
            r0 = 2131101132(0x7f0605cc, float:1.7814665E38)
            X.C36331k8.A0r(r10, r5, r0)
            X.2pL r13 = r7.A02
            X.1RJ r0 = r4.A04
            r16 = r0
            android.view.View r14 = r16.A01()
            X.AnonymousClass00C.A08(r14)
            r0 = 2
            X.2pL[] r15 = new X.C52382pL[r0]
            X.2pL r10 = X.C52382pL.ADMIN
            r11 = 0
            r15[r2] = r10
            X.2pL r2 = X.C52382pL.OWNER
            r0 = 1
            java.util.List r0 = X.C36341k9.A0m(r2, r15, r0)
            boolean r0 = r0.contains(r13)
            if (r0 != 0) goto L_0x00e8
            r11 = 8
        L_0x00e8:
            r14.setVisibility(r11)
            if (r13 != r10) goto L_0x015d
            android.widget.TextView r11 = X.C36441kJ.A0V(r16)
            r0 = 2131891313(0x7f121471, float:1.9417343E38)
        L_0x00f4:
            r11.setText(r0)
        L_0x00f7:
            if (r8 == 0) goto L_0x0143
            r1.A02()
            X.1RY r9 = r6.A08
            X.142 r1 = X.C36381kD.A0T(r12)
            com.whatsapp.WaImageView r0 = r4.A03
            r9.A08(r0, r1)
            r0 = 2131891395(0x7f1214c3, float:1.9417509E38)
            r5.setText(r0)
        L_0x010d:
            X.2pL r0 = r6.A00
            boolean r0 = X.C36361kB.A1a(r0, r10)
            r8 = r8 & r0
            X.00T r0 = r6.A0E
            boolean r0 = X.C36331k8.A1b(r0)
            r8 = r8 & r0
            X.2pL r5 = r6.A00
            r1 = 1
            if (r5 == r2) goto L_0x0124
            r1 = 0
            r0 = 1
            if (r5 == r10) goto L_0x0125
        L_0x0124:
            r0 = 0
        L_0x0125:
            r1 = r1 | r0
            r8 = r8 | r1
            android.view.View r2 = r4.A00
            r2.setClickable(r8)
            if (r8 == 0) goto L_0x0087
            r1 = 2
            X.4a1 r0 = new X.4a1
            r0.<init>(r7, r6, r1)
            r2.setOnCreateContextMenuListener(r0)
            r0 = 16
            X.AnonymousClass3Y4.A00(r2, r4, r0)
            r0 = 2131233671(0x7f080b87, float:1.8083486E38)
            r2.setBackgroundResource(r0)
            return r3
        L_0x0143:
            X.171 r11 = r6.A07
            r0 = 2
            X.34G r12 = r11.A0C(r9, r0)
            r14 = 0
            boolean r16 = r9.A0O()
            r15 = 2
            r13 = r9
            r11 = r1
            r11.A04(r12, r13, r14, r15, r16)
            X.1RY r1 = r6.A08
            com.whatsapp.WaImageView r0 = r4.A03
            X.C36401kF.A19(r0, r5, r1, r9)
            goto L_0x010d
        L_0x015d:
            if (r13 != r2) goto L_0x00f7
            android.widget.TextView r11 = X.C36441kJ.A0V(r16)
            r0 = 2131891458(0x7f121502, float:1.9417637E38)
            goto L_0x00f4
        L_0x0167:
            com.whatsapp.WaTextView r5 = r4.A00
            X.1na r0 = r4.A01
            com.whatsapp.newsletter.NewsletterInfoActivity r2 = r0.A0B
            r1 = 2131893866(0x7f121e6a, float:1.942252E38)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r6
            X.C36341k9.A0s(r2, r5, r0, r1)
            return r3
        L_0x0178:
            X.2Y6 r4 = (X.AnonymousClass2Y6) r4
            r0 = 0
            X.AnonymousClass00C.A0D(r5, r0)
            r4.A00 = r5
            android.widget.LinearLayout r2 = r4.A00
            X.1na r1 = r4.A01
            r0 = 40
            X.C48752hz.A00(r2, r1, r0)
            return r3
        L_0x018a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unknown type: "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r3)
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38021na.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public C38021na(LayoutInflater layoutInflater, C61423Bv r3, C19730wQ r4, AnonymousClass1LI r5, AnonymousClass171 r6, AnonymousClass1RY r7, C18820ts r8, C20810yC r9, NewsletterInfoActivity newsletterInfoActivity) {
        C36321k7.A1B(r9, r4, r8, r6, r5);
        AnonymousClass00C.A0D(r3, 6);
        this.A0A = r9;
        this.A05 = r4;
        this.A09 = r8;
        this.A07 = r6;
        this.A06 = r5;
        this.A04 = r3;
        this.A0B = newsletterInfoActivity;
        this.A03 = layoutInflater;
        this.A08 = r7;
    }

    public Filter getFilter() {
        return this.A0G;
    }
}
