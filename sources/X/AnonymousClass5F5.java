package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.5F5  reason: invalid class name */
public class AnonymousClass5F5 extends C46482Xv {
    public final AnonymousClass1QW A00;
    public final WaTextView A01;
    public final WaTextView A02;
    public final WaTextView A03;
    public final WaTextView A04;

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0C(java.lang.Object r6) {
        /*
            r5 = this;
            X.5Dv r6 = (X.C105225Dv) r6
            com.whatsapp.WaTextView r1 = r5.A02
            int r3 = r6.A00
            switch(r3) {
                case 0: goto L_0x00a8;
                case 1: goto L_0x00a3;
                case 2: goto L_0x009e;
                case 3: goto L_0x0099;
                case 4: goto L_0x0009;
                case 5: goto L_0x0009;
                case 6: goto L_0x0094;
                case 7: goto L_0x008f;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = 2131886817(0x7f1202e1, float:1.9408224E38)
        L_0x000c:
            r1.setText(r0)
            X.7lU r2 = r6.A01
            r1 = 0
            r0 = 1
            if (r3 == r0) goto L_0x007a
            r0 = 2
            if (r3 == r0) goto L_0x007a
            if (r3 == 0) goto L_0x0083
            r0 = 7
            if (r3 == r0) goto L_0x0083
            r0 = 6
            if (r3 == r0) goto L_0x0083
            com.whatsapp.WaTextView r1 = r5.A03
            r0 = 8
            r1.setVisibility(r0)
            android.view.View r1 = r5.A0H
            r0 = 0
            r1.setOnClickListener(r0)
        L_0x002d:
            com.whatsapp.WaTextView r4 = r5.A01
            r0 = 0
            r4.setVisibility(r0)
            if (r3 == 0) goto L_0x006d
            r0 = 3
            if (r3 == r0) goto L_0x006d
            r0 = 4
            if (r3 == r0) goto L_0x0062
            r0 = 5
            if (r3 == r0) goto L_0x005a
            r0 = 6
            if (r3 == r0) goto L_0x006d
            r0 = 7
            if (r3 == r0) goto L_0x006d
            r0 = 8
            r4.setVisibility(r0)
            r1 = 0
        L_0x004a:
            r4.setOnClickListener(r1)
        L_0x004d:
            com.whatsapp.WaTextView r1 = r5.A04
            if (r3 != 0) goto L_0x00ad
            r0 = 0
            r1.setVisibility(r0)
            r0 = 7
            X.C36361kB.A17(r1, r2, r0)
            return
        L_0x005a:
            r0 = 2131886739(0x7f120293, float:1.9408065E38)
            r4.setText(r0)
            r0 = 4
            goto L_0x0069
        L_0x0062:
            r0 = 2131886861(0x7f12030d, float:1.9408313E38)
            r4.setText(r0)
            r0 = 3
        L_0x0069:
            X.C36361kB.A17(r4, r2, r0)
            goto L_0x004d
        L_0x006d:
            r0 = 2131886782(0x7f1202be, float:1.9408153E38)
            r4.setText(r0)
            r0 = 5
            X.3Yr r1 = new X.3Yr
            r1.<init>(r2, r3, r0)
            goto L_0x004a
        L_0x007a:
            com.whatsapp.WaTextView r0 = r5.A03
            r0.setVisibility(r1)
            android.view.View r1 = r5.A0H
            r0 = 5
            goto L_0x008b
        L_0x0083:
            com.whatsapp.WaTextView r0 = r5.A03
            r0.setVisibility(r1)
            android.view.View r1 = r5.A0H
            r0 = 6
        L_0x008b:
            X.C36361kB.A17(r1, r2, r0)
            goto L_0x002d
        L_0x008f:
            r0 = 2131886764(0x7f1202ac, float:1.9408116E38)
            goto L_0x000c
        L_0x0094:
            r0 = 2131891604(0x7f121594, float:1.9417933E38)
            goto L_0x000c
        L_0x0099:
            r0 = 2131886818(0x7f1202e2, float:1.9408226E38)
            goto L_0x000c
        L_0x009e:
            r0 = 2131886826(0x7f1202ea, float:1.9408242E38)
            goto L_0x000c
        L_0x00a3:
            r0 = 2131886821(0x7f1202e5, float:1.9408232E38)
            goto L_0x000c
        L_0x00a8:
            r0 = 2131886819(0x7f1202e3, float:1.9408228E38)
            goto L_0x000c
        L_0x00ad:
            r0 = 8
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5F5.A0C(java.lang.Object):void");
    }

    public AnonymousClass5F5(View view, AnonymousClass1QW r3) {
        super(view);
        this.A00 = r3;
        this.A02 = C36401kF.A0Q(view, R.id.error_message);
        this.A03 = C36401kF.A0Q(view, R.id.retry_button);
        this.A04 = C36401kF.A0Q(view, R.id.settings_btn);
        this.A01 = C36401kF.A0Q(view, R.id.fallback_action_button);
    }
}
