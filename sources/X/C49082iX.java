package X;

import com.whatsapp.jid.UserJid;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2iX  reason: invalid class name and case insensitive filesystem */
public class C49082iX extends C132446Tt {
    public final WeakReference A00;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C47582fA r0 = (C47582fA) this.A00.get();
        if (r0 == null) {
            return null;
        }
        AnonymousClass3CY A002 = r0.A0E.A00(r0.A05);
        ArrayList A0I = AnonymousClass001.A0I();
        Set entrySet = A002.A00.entrySet();
        AnonymousClass00C.A08(entrySet);
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(it);
            long A01 = ((AnonymousClass3Q6) A11.getValue()).A01(13);
            if (A01 > 0) {
                A0I.add(new C597635e((UserJid) A11.getKey(), A01));
            }
        }
        Collections.sort(A0I, C81753xW.A00);
        return A0I;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00d7, code lost:
        if (r0 != 0) goto L_0x00d9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0C(java.lang.Object r14) {
        /*
            r13 = this;
            java.util.List r14 = (java.util.List) r14
            java.lang.ref.WeakReference r0 = r13.A00
            java.lang.Object r2 = r0.get()
            X.2f9 r2 = (X.C47572f9) r2
            if (r2 == 0) goto L_0x00e6
            if (r14 == 0) goto L_0x00e6
            X.0v0 r0 = r2.A07
            boolean r12 = r0.A2L()
            X.2f7 r3 = r2.A0S()
            X.3PF r4 = r3.A08
            if (r4 == 0) goto L_0x007b
            if (r12 == 0) goto L_0x006a
            r11 = 0
            com.whatsapp.WaTextView r10 = r4.A07
            X.0ts r9 = r4.A0G
            r8 = 2131755413(0x7f100195, float:1.9141705E38)
            int r0 = r14.size()
            long r0 = (long) r0
            java.lang.Object[] r7 = X.AnonymousClass001.A0L()
            int r5 = r14.size()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r5 = 0
            r7[r11] = r6
            java.lang.String r0 = r9.A0L(r7, r8, r0)
            r10.setText(r0)
            X.1w5 r0 = r4.A01
            if (r0 != 0) goto L_0x004a
            java.lang.RuntimeException r0 = X.C36331k8.A0Y()
            throw r0
        L_0x004a:
            r0.A00 = r14
            r0.A06()
            android.widget.TextView r1 = r4.A04
            boolean r0 = r14.isEmpty()
            int r0 = X.C36351kA.A00(r0)
            r1.setVisibility(r0)
            androidx.recyclerview.widget.RecyclerView r1 = r4.A05
            boolean r0 = X.C36401kF.A1a(r14)
            if (r0 != 0) goto L_0x0066
            r5 = 8
        L_0x0066:
            r1.setVisibility(r5)
            goto L_0x0078
        L_0x006a:
            com.whatsapp.WaTextView r1 = r4.A07
            r0 = 2131895757(0x7f1225cd, float:1.9426356E38)
            r1.setText(r0)
            android.widget.TextView r1 = r4.A04
            r0 = 0
            r1.setVisibility(r0)
        L_0x0078:
            X.AnonymousClass3PF.A00(r4)
        L_0x007b:
            android.widget.TextView r1 = r3.A07
            r7 = 0
            int r0 = X.C36351kA.A00(r12)
            r1.setVisibility(r0)
            android.widget.TextView r4 = r3.A07
            X.0ts r8 = r2.A08
            java.text.NumberFormat r2 = r8.A0M()
            int r0 = r14.size()
            long r0 = (long) r0
            X.C36411kG.A1E(r4, r2, r0)
            android.view.ViewGroup r6 = r3.A0E
            int r5 = r14.size()
            r4 = 2131755413(0x7f100195, float:1.9141705E38)
            long r1 = (long) r5
            java.lang.Object[] r0 = X.AnonymousClass001.A0L()
            X.AnonymousClass000.A1L(r0, r5, r7)
            java.lang.String r0 = r8.A0L(r0, r4, r1)
            r6.setContentDescription(r0)
            r0 = 2131891212(0x7f12140c, float:1.9417138E38)
            X.C33521fV.A03(r6, r0)
            android.view.ViewGroup r0 = r3.A0E
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x00ce
            android.view.ViewGroup r0 = r3.A0E
            r0.setVisibility(r7)
            android.view.animation.AlphaAnimation r2 = X.C36351kA.A0D()
            r0 = 120(0x78, double:5.93E-322)
            r2.setDuration(r0)
            android.view.ViewGroup r0 = r3.A0E
            r0.startAnimation(r2)
        L_0x00ce:
            if (r12 != 0) goto L_0x00d9
            int r0 = r14.size()
            r1 = 2131232817(0x7f080831, float:1.8081754E38)
            if (r0 == 0) goto L_0x00dc
        L_0x00d9:
            r1 = 2131232908(0x7f08088c, float:1.8081939E38)
        L_0x00dc:
            android.widget.ImageView r0 = r3.A06
            r0.setImageResource(r1)
            android.view.ViewGroup r0 = r3.A0D
            r0.requestLayout()
        L_0x00e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49082iX.A0C(java.lang.Object):void");
    }

    public C49082iX(C47572f9 r2) {
        this.A00 = AnonymousClass001.A0F(r2);
    }
}
