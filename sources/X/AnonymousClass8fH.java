package X;

import android.content.Context;
import com.whatsapp.util.Log;

/* renamed from: X.8fH  reason: invalid class name */
public final class AnonymousClass8fH extends C22726Aue {
    public transient C19700wN A00;
    public transient C26141Ja A01;
    public transient C30131Zi A02;
    public transient AnonymousClass1SL A03;
    public transient C220412q A04;
    public transient AnonymousClass19A A05;
    public final Long afterServerId;
    public final Long beforeServerId;
    public final C22949Az1 callback;
    public final long count;
    public final boolean fetchingForGaps;
    public final C28981Uw newsletterJid;
    public final String token;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8fH(C28981Uw r2, C22949Az1 az1, Long l, Long l2, String str, long j, boolean z) {
        super("GetNewsletterMetadataJob");
        AnonymousClass00C.A0D(str, 6);
        this.newsletterJid = r2;
        this.count = j;
        this.beforeServerId = l;
        this.afterServerId = l2;
        this.fetchingForGaps = z;
        this.token = str;
        this.callback = az1;
    }

    public boolean A0D(Exception exc) {
        return false;
    }

    public void A09() {
        Log.i("GetNewsletterMessagesJob/onAdded");
    }

    public void A0A() {
        Log.i("GetNewsletterMessagesJob/onCanceled");
        C22949Az1 az1 = this.callback;
        if (az1 != null) {
            az1.BoK(this.token);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B() {
        /*
            r11 = this;
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "GetNewsletterMessagesJob/onRun "
            r2.append(r0)
            long r0 = r11.count
            r2.append(r0)
            java.lang.String r1 = ", "
            r2.append(r1)
            java.lang.Long r0 = r11.beforeServerId
            r2.append(r0)
            r2.append(r1)
            java.lang.Long r0 = r11.afterServerId
            X.C36321k7.A1N(r0, r2)
            java.lang.Long r0 = r11.beforeServerId
            java.lang.String r7 = "crashLogs"
            r3 = 0
            r6 = 0
            if (r0 == 0) goto L_0x003f
            long r4 = r0.longValue()
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x003f
            X.0wN r1 = r11.A00
            if (r1 != 0) goto L_0x003b
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r7)
            throw r0
        L_0x003b:
            java.lang.String r0 = "GetNewsletterMessagesJob/invalid params - beforeServerId"
            goto L_0x00e1
        L_0x003f:
            long r4 = r11.count
            r1 = 1
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00d6
            r1 = 300(0x12c, double:1.48E-321)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00d6
            X.12q r1 = r11.A04
            if (r1 != 0) goto L_0x0058
            java.lang.String r0 = "chatsCache"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0058:
            X.1Uw r0 = r11.newsletterJid
            X.3Qp r1 = r1.A09(r0, r3)
            boolean r0 = r1 instanceof X.C44072La
            if (r0 == 0) goto L_0x0068
            X.2La r1 = (X.C44072La) r1
            if (r1 == 0) goto L_0x0068
            X.2pL r6 = r1.A09
        L_0x0068:
            X.19A r0 = r11.A05
            java.lang.String r5 = "messageClient"
            if (r0 != 0) goto L_0x0073
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x0073:
            java.lang.String r7 = r0.A09()
            long r0 = r11.count
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            java.util.ArrayList r0 = X.C185788un.A00
            X.1Uw r2 = r11.newsletterJid
            if (r6 == 0) goto L_0x00c2
            int r1 = r6.ordinal()
            if (r1 == r3) goto L_0x00bf
            r0 = 1
            if (r1 == r0) goto L_0x00bc
            r0 = 2
            if (r1 == r0) goto L_0x00b9
            r0 = 3
            if (r1 != r0) goto L_0x00c2
            java.lang.String r0 = "owner"
        L_0x0094:
            X.8un r3 = new X.8un
            r3.<init>(r2, r0)
            java.lang.Long r2 = r11.beforeServerId
            if (r2 == 0) goto L_0x00b1
            r0 = 1
        L_0x009e:
            X.8ul r1 = new X.8ul
            r1.<init>(r2, r0)
        L_0x00a3:
            X.8vH r0 = new X.8vH
            r0.<init>((X.C16450pG) r1, (X.C16470pI) r3, (java.lang.Long) r4, (java.lang.String) r7)
            X.19A r4 = r11.A05
            if (r4 != 0) goto L_0x00c4
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x00b1:
            java.lang.Long r2 = r11.afterServerId
            if (r2 == 0) goto L_0x00b7
            r0 = 0
            goto L_0x009e
        L_0x00b7:
            r1 = 0
            goto L_0x00a3
        L_0x00b9:
            java.lang.String r0 = "admin"
            goto L_0x0094
        L_0x00bc:
            java.lang.String r0 = "subscriber"
            goto L_0x0094
        L_0x00bf:
            java.lang.String r0 = "guest"
            goto L_0x0094
        L_0x00c2:
            r0 = 0
            goto L_0x0094
        L_0x00c4:
            r8 = 368(0x170, float:5.16E-43)
            X.9nx r6 = r0.A00
            X.AnonymousClass00C.A08(r6)
            X.BAc r5 = new X.BAc
            r5.<init>((X.AnonymousClass8fH) r11, (X.C186018vH) r0)
            r9 = 32000(0x7d00, double:1.581E-319)
            r4.A0E(r5, r6, r7, r8, r9)
            return
        L_0x00d6:
            X.0wN r1 = r11.A00
            if (r1 != 0) goto L_0x00df
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r7)
            throw r0
        L_0x00df:
            java.lang.String r0 = "GetNewsletterMessagesJob/invalid params - count"
        L_0x00e1:
            r1.A0E(r0, r6, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8fH.A0B():void");
    }

    public void Bqf(Context context) {
        C18800tq A0P = C165577te.A0P(context);
        this.A00 = A0P.B3m();
        this.A04 = C36351kA.A0a(A0P);
        this.A05 = C36361kB.A0c(A0P);
        this.A01 = (C26141Ja) A0P.A5m.get();
        this.A02 = C36431kI.A0m(A0P);
        this.A03 = (AnonymousClass1SL) A0P.A5Z.get();
    }
}
