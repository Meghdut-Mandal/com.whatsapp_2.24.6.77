package X;

import android.text.TextUtils;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.whatsapp.conversationslist.ConversationsFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1gf  reason: invalid class name and case insensitive filesystem */
public class C34231gf extends BaseAdapter implements Filterable {
    public List A00 = new ArrayList();
    public C226015b A01 = new C226015b();
    public String A02;
    public final Filter A03 = new C34241gg(this);
    public final C18820ts A04;
    public final AnonymousClass1CR A05;
    public final AnonymousClass16D A06;
    public final C34211gd A07;
    public final /* synthetic */ ConversationsFragment A08;

    public int getViewTypeCount() {
        return 5;
    }

    public boolean hasStableIds() {
        return true;
    }

    public C34231gf(AnonymousClass16D r2, ConversationsFragment conversationsFragment, C34211gd r4, C18820ts r5, AnonymousClass1CR r6) {
        this.A08 = conversationsFragment;
        this.A06 = r2;
        this.A04 = r5;
        this.A05 = r6;
        this.A07 = r4;
    }

    public int getCount() {
        return this.A08.A36.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A08.A36.get(i);
    }

    public long getItemId(int i) {
        return (long) this.A08.A36.get(i).hashCode();
    }

    public int getItemViewType(int i) {
        Object obj = this.A08.A36.get(i);
        if (obj instanceof C71033g7) {
            return 1;
        }
        if (obj instanceof C71023g6) {
            return 3;
        }
        if (obj instanceof C71013g5) {
            return 4;
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0242, code lost:
        if (r2 == null) goto L_0x0244;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r24, android.view.View r25, android.view.ViewGroup r26) {
        /*
            r23 = this;
            r6 = r26
            r2 = r25
            if (r26 == 0) goto L_0x02ca
            r3 = r23
            com.whatsapp.conversationslist.ConversationsFragment r4 = r3.A08
            java.util.List r0 = r4.A36
            r15 = r24
            java.lang.Object r11 = r0.get(r15)
            X.7gQ r11 = (X.AnonymousClass7gQ) r11
            if (r11 == 0) goto L_0x02c4
            if (r25 == 0) goto L_0x0035
            java.lang.Object r0 = r2.getTag()
            boolean r0 = r0 instanceof com.whatsapp.conversationslist.ViewHolder
            if (r0 == 0) goto L_0x0035
            java.lang.Object r1 = r2.getTag()
            com.whatsapp.conversationslist.ViewHolder r1 = (com.whatsapp.conversationslist.ViewHolder) r1
            X.7gQ r0 = r1.A01
            boolean r0 = X.C1901797e.A00(r0, r11)
            if (r0 != 0) goto L_0x0035
            X.9k6 r0 = r1.A00
            if (r0 == 0) goto L_0x0035
            r0.A0R()
        L_0x0035:
            int r1 = r3.getItemViewType(r15)
            r0 = 4
            java.lang.String r7 = "window"
            r5 = 0
            if (r1 != r0) goto L_0x00c1
            X.15b r8 = r4.A1c()
            java.util.Random r0 = r4.A3h
            long r0 = r0.nextLong()
            r8.A00 = r0
            com.whatsapp.conversationslist.filter.ConversationFilterViewModel r1 = r4.A1b
            r4.A0a()
            X.15b r0 = r3.A01
            java.util.List r0 = r0.A03
            if (r0 != 0) goto L_0x0058
            X.09w r0 = X.C023409w.A00
        L_0x0058:
            r1.A0T(r0)
            if (r25 != 0) goto L_0x0091
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131624736(0x7f0e0320, float:1.887666E38)
            android.view.View r2 = r1.inflate(r0, r6, r5)
            android.content.Context r0 = r6.getContext()
            java.lang.Object r0 = r0.getSystemService(r7)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.util.DisplayMetrics r1 = new android.util.DisplayMetrics
            r1.<init>()
            android.view.Display r0 = r0.getDefaultDisplay()
            r0.getMetrics(r1)
            int r0 = r1.heightPixels
            int r6 = r2.getPaddingLeft()
            int r1 = r0 / 5
            int r0 = r2.getPaddingRight()
            r2.setPadding(r6, r1, r0, r5)
        L_0x0091:
            r0 = 2131432101(0x7f0b12a5, float:1.848595E38)
            android.view.View r6 = X.C012005e.A02(r2, r0)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            X.0ts r5 = r3.A04
            android.content.Context r1 = r4.A0a()
            r0 = 2131233939(0x7f080c93, float:1.808403E38)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass00E.A00(r1, r0)
            X.4vb r0 = new X.4vb
            r0.<init>(r1, r5)
            r6.setImageDrawable(r0)
            r0 = 2131435137(0x7f0b1e81, float:1.8492108E38)
            android.view.View r4 = X.C012005e.A02(r2, r0)
            r1 = 39
            X.1iF r0 = new X.1iF
            r0.<init>((java.lang.Object) r3, (int) r1)
            r4.setOnClickListener(r0)
        L_0x00c0:
            return r2
        L_0x00c1:
            boolean r0 = r11 instanceof X.C71023g6
            if (r0 == 0) goto L_0x01c8
            X.15b r8 = r4.A1c()
            java.util.Random r0 = r4.A3h
            long r0 = r0.nextLong()
            r8.A00 = r0
            X.1U5 r8 = r4.A1U
            X.15b r0 = r4.A1c()
            long r0 = r0.A00
            X.3g6 r11 = (X.C71023g6) r11
            java.lang.String r10 = r11.A00
            X.0yW r9 = r8.A00
            X.2S2 r8 = new X.2S2
            r8.<init>()
            r11 = 46
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r8.A00 = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r5)
            r8.A03 = r11
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.A04 = r0
            int r1 = r10.hashCode()
            r0 = -1730152220(0xffffffff98dff8e4, float:-5.7895464E-24)
            if (r1 == r0) goto L_0x01bc
            r0 = 72525144(0x452a558, float:2.4761303E-36)
            if (r1 == r0) goto L_0x01b1
            r0 = 1827283464(0x6cea2208, float:2.2643948E27)
            if (r1 != r0) goto L_0x011a
            java.lang.String r0 = "UNREAD_FILTER"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x011a
            r0 = 2
        L_0x0114:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.A01 = r0
        L_0x011a:
            r9.Bly(r8)
            if (r25 != 0) goto L_0x0153
            android.content.Context r0 = r6.getContext()
            java.lang.Object r0 = r0.getSystemService(r7)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.util.DisplayMetrics r2 = new android.util.DisplayMetrics
            r2.<init>()
            android.view.Display r0 = r0.getDefaultDisplay()
            r0.getMetrics(r2)
            int r7 = r2.heightPixels
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r0 = 2131624737(0x7f0e0321, float:1.8876662E38)
            android.view.View r2 = r2.inflate(r0, r6, r5)
            int r6 = r2.getPaddingLeft()
            int r5 = r2.getPaddingRight()
            int r0 = r7 / 3
            r2.setPadding(r6, r0, r5, r0)
        L_0x0153:
            r0 = 2131432093(0x7f0b129d, float:1.8485934E38)
            android.view.View r5 = X.C012005e.A02(r2, r0)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 2131434758(0x7f0b1d06, float:1.8491339E38)
            android.view.View r7 = X.C012005e.A02(r2, r0)
            r6 = 39
            X.1iF r0 = new X.1iF
            r0.<init>((java.lang.Object) r3, (int) r6)
            r7.setOnClickListener(r0)
            com.whatsapp.conversationslist.filter.ConversationFilterViewModel r3 = r4.A1b
            r0 = -1730152220(0xffffffff98dff8e4, float:-5.7895464E-24)
            if (r1 == r0) goto L_0x01a1
            r0 = 72525144(0x452a558, float:2.4761303E-36)
            if (r1 == r0) goto L_0x0193
            r0 = 1827283464(0x6cea2208, float:2.2643948E27)
            if (r1 != r0) goto L_0x01af
            java.lang.String r0 = "UNREAD_FILTER"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x01af
            X.0wG r1 = r3.A03
            r0 = 2131891645(0x7f1215bd, float:1.9418016E38)
        L_0x018b:
            java.lang.String r0 = r1.A01(r0)
        L_0x018f:
            r5.setText(r0)
            return r2
        L_0x0193:
            java.lang.String r0 = "GROUP_FILTER"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x01af
            X.0wG r1 = r3.A03
            r0 = 2131891599(0x7f12158f, float:1.9417923E38)
            goto L_0x018b
        L_0x01a1:
            java.lang.String r0 = "CONTACTS_FILTER"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x01af
            X.0wG r1 = r3.A03
            r0 = 2131891589(0x7f121585, float:1.9417902E38)
            goto L_0x018b
        L_0x01af:
            r0 = 0
            goto L_0x018f
        L_0x01b1:
            java.lang.String r0 = "GROUP_FILTER"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x011a
            r0 = 3
            goto L_0x0114
        L_0x01bc:
            java.lang.String r0 = "CONTACTS_FILTER"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x011a
            r0 = 10
            goto L_0x0114
        L_0x01c8:
            boolean r0 = r11 instanceof X.C71033g7
            if (r0 == 0) goto L_0x01f8
            if (r25 != 0) goto L_0x01dd
            X.01I r0 = r4.A0i()
            android.view.LayoutInflater r1 = r0.getLayoutInflater()
            r0 = 2131625384(0x7f0e05a8, float:1.8877974E38)
            android.view.View r2 = r1.inflate(r0, r6, r5)
        L_0x01dd:
            r0 = 2131434724(0x7f0b1ce4, float:1.849127E38)
            android.view.View r1 = r2.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            X.C33511fU.A03(r1)
            X.3g7 r11 = (X.C71033g7) r11
            java.lang.String r0 = r11.A00
            r1.setText(r0)
            X.1gd r0 = r3.A07
            if (r0 == 0) goto L_0x00c0
            r0.Bfd(r15)
            return r2
        L_0x01f8:
            if (r25 != 0) goto L_0x02bd
            X.0yC r2 = r4.A21
            r1 = 0
            r0 = 7456(0x1d20, float:1.0448E-41)
            boolean r0 = X.AnonymousClass1MI.A02(r2, r1, r0)
            if (r0 == 0) goto L_0x02ba
            X.1RL r2 = r4.A2E
        L_0x0207:
            java.util.List r0 = X.AnonymousClass0D3.A0I
            r8 = 2131624742(0x7f0e0326, float:1.8876672E38)
            if (r2 == 0) goto L_0x0244
            android.content.Context r1 = r6.getContext()
            X.AnonymousClass00C.A0D(r1, r5)
            java.util.HashMap r10 = r2.A02
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            boolean r0 = r10.containsKey(r9)
            if (r0 == 0) goto L_0x0244
            X.1RO r7 = r2.A00(r1)
            java.lang.String r0 = java.lang.String.valueOf(r8)
            X.1RM r2 = r7.A00
            X.1RT r1 = new X.1RT
            r1.<init>(r0)
            r1.A04 = r7
            r1.A00 = r8
            r1.A02 = r6
            r0 = 1
            r1.A06 = r0
            r2.B6e(r1)
            java.lang.Object r2 = r10.remove(r9)
            android.view.View r2 = (android.view.View) r2
            if (r2 != 0) goto L_0x0250
        L_0x0244:
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            android.view.View r2 = r0.inflate(r8, r6, r5)
        L_0x0250:
            X.1ez r5 = r4.A0Z
            android.content.Context r17 = r6.getContext()
            r22 = 0
            X.1f4 r1 = r4.A1N
            X.1RY r0 = r4.A3Q
            r18 = r2
            r19 = r0
            r20 = r1
            r21 = r4
            r16 = r5
            com.whatsapp.conversationslist.ViewHolder r10 = r16.A00(r17, r18, r19, r20, r21, r22)
        L_0x026a:
            r2.setTag(r10)
            X.01N r0 = r4.A0P
            r0.A04(r10)
            X.11F r1 = r11.BDC()
            X.13r r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r1 = X.C222813r.A00(r1)
            com.whatsapp.status.viewmodels.StatusesViewModel r0 = r4.A2i
            if (r0 == 0) goto L_0x02b8
            if (r1 == 0) goto L_0x02b8
            X.3Ed r13 = r0.A0S(r1)
        L_0x0286:
            androidx.fragment.app.ListFragment.A00(r4)
            android.widget.ListView r0 = r4.A05
            int r1 = r0.getFirstVisiblePosition()
            r16 = 0
            boolean r0 = r4.A3B
            if (r0 != 0) goto L_0x02b1
            if (r1 != 0) goto L_0x0299
        L_0x0297:
            r16 = 1
        L_0x0299:
            boolean r0 = com.whatsapp.conversationslist.ConversationsFragment.A0X(r4)
            if (r0 == 0) goto L_0x02ac
            r14 = 10
        L_0x02a1:
            X.1gd r12 = r3.A07
            r17 = 0
            r10.A0G(r11, r12, r13, r14, r15, r16, r17)
            com.whatsapp.conversationslist.ConversationsFragment.A0D(r2)
            return r2
        L_0x02ac:
            int r14 = r4.A1a()
            goto L_0x02a1
        L_0x02b1:
            if (r1 != 0) goto L_0x0299
            int r0 = r4.A02
            if (r15 >= r0) goto L_0x0299
            goto L_0x0297
        L_0x02b8:
            r13 = 0
            goto L_0x0286
        L_0x02ba:
            r2 = 0
            goto L_0x0207
        L_0x02bd:
            java.lang.Object r10 = r2.getTag()
            com.whatsapp.conversationslist.ViewHolder r10 = (com.whatsapp.conversationslist.ViewHolder) r10
            goto L_0x026a
        L_0x02c4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x02ca:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34231gf.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public Filter getFilter() {
        return this.A03;
    }

    public boolean isEmpty() {
        if (!super.isEmpty()) {
            return false;
        }
        ConversationsFragment conversationsFragment = this.A08;
        if ((conversationsFragment.A00 != 0 || conversationsFragment.A3E) && TextUtils.isEmpty(this.A01.A02)) {
            return false;
        }
        return true;
    }
}
