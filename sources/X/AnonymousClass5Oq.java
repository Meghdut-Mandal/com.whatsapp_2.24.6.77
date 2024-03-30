package X;

import android.content.Context;
import java.util.List;
import java.util.Map;

/* renamed from: X.5Oq  reason: invalid class name */
public class AnonymousClass5Oq extends C101094wz {
    public C158047fi A00;
    public List A01;
    public final C159757js A02;
    public final Map A03 = AnonymousClass001.A0J();
    public final Context A04;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008a, code lost:
        if (r1.equals(r0) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008c, code lost:
        r5.setShowAsAction(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009f, code lost:
        r3 = X.C91364bt.A00(r1, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a3, code lost:
        r5.setIcon(r3);
        r5.setShowAsAction(1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BUv(android.view.Menu r11) {
        /*
            r10 = this;
            java.util.List r0 = r10.A01
            if (r0 == 0) goto L_0x00aa
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00aa
            java.util.List r0 = r10.A01
            java.util.Iterator r9 = r0.iterator()
            r7 = 0
            r6 = 0
        L_0x0012:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00aa
            java.lang.Object r3 = r9.next()
            X.5ty r3 = (X.C121945ty) r3
            java.lang.String r0 = r3.A02
            android.view.MenuItem r5 = r11.add(r7, r6, r7, r0)
            X.7ku r0 = r3.A00
            if (r0 == 0) goto L_0x0037
            java.util.Map r2 = r10.A03
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r0 = 43
            X.7rQ r0 = X.C164197rQ.A00(r3, r0)
            r2.put(r1, r0)
        L_0x0037:
            java.lang.String r1 = r3.A01
            if (r1 == 0) goto L_0x0043
            int r0 = r1.hashCode()
            r8 = 1
            switch(r0) {
                case -906336856: goto L_0x0090;
                case -316266717: goto L_0x0084;
                case 3327275: goto L_0x005f;
                case 109400031: goto L_0x005c;
                case 529642498: goto L_0x0059;
                case 928814795: goto L_0x0049;
                case 1505434244: goto L_0x0046;
                default: goto L_0x0043;
            }
        L_0x0043:
            int r6 = r6 + 1
            goto L_0x0012
        L_0x0046:
            java.lang.String r0 = "copy_link"
            goto L_0x0086
        L_0x0049:
            java.lang.String r0 = "report_a_bug"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0043
            X.0ts r2 = r10.A00
            android.content.Context r1 = r10.A04
            r0 = 2131234274(0x7f080de2, float:1.808471E38)
            goto L_0x009f
        L_0x0059:
            java.lang.String r0 = "overflow"
            goto L_0x0086
        L_0x005c:
            java.lang.String r0 = "share"
            goto L_0x0086
        L_0x005f:
            java.lang.String r0 = "lock"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0043
            X.0ts r1 = r10.A00
            android.content.Context r4 = r10.A04
            r0 = 2131232284(0x7f08061c, float:1.8080673E38)
            X.4vb r3 = X.C91364bt.A00(r4, r1, r0)
            android.content.res.Resources r2 = r4.getResources()
            r1 = 2130971131(0x7f0409fb, float:1.7550992E38)
            r0 = 2131102536(0x7f060b48, float:1.7817513E38)
            int r0 = X.C224514j.A00(r4, r1, r0)
            X.C90484aE.A15(r2, r3, r0)
            goto L_0x00a3
        L_0x0084:
            java.lang.String r0 = "open_in_browser"
        L_0x0086:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0043
            r5.setShowAsAction(r7)
            goto L_0x0043
        L_0x0090:
            java.lang.String r0 = "search"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0043
            X.0ts r2 = r10.A00
            android.content.Context r1 = r10.A04
            r0 = 2131231838(0x7f08045e, float:1.8079768E38)
        L_0x009f:
            X.4vb r3 = X.C91364bt.A00(r1, r2, r0)
        L_0x00a3:
            r5.setIcon(r3)
            r5.setShowAsAction(r8)
            goto L_0x0043
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5Oq.BUv(android.view.Menu):void");
    }

    public AnonymousClass5Oq(Context context, C18820ts r3, C159757js r4) {
        super(r3);
        this.A04 = context;
        this.A02 = r4;
    }
}
