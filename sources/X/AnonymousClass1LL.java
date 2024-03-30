package X;

import com.whatsapp.util.Log;

/* renamed from: X.1LL  reason: invalid class name */
public final class AnonymousClass1LL {
    public final C19700wN A00;
    public final AnonymousClass1A6 A01;
    public final AnonymousClass12O A02;
    public final AnonymousClass1FV A03;
    public final C20810yC A04;

    public AnonymousClass1LL(C19700wN r2, AnonymousClass1A6 r3, AnonymousClass12O r4, AnonymousClass1FV r5, C20810yC r6) {
        AnonymousClass00C.A0D(r6, 1);
        AnonymousClass00C.A0D(r2, 2);
        AnonymousClass00C.A0D(r3, 3);
        AnonymousClass00C.A0D(r4, 4);
        AnonymousClass00C.A0D(r5, 5);
        this.A04 = r6;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
    }

    private final void A00(C223313w r6, boolean z, boolean z2) {
        String str;
        if (z != z2) {
            this.A03.A09(r6, z2);
            if (z2) {
                str = "deprecating";
            } else {
                str = "reactivating";
            }
            boolean A0E = this.A01.A0E(r6);
            StringBuilder sb = new StringBuilder();
            sb.append("jid = ");
            sb.append(r6);
            sb.append(", hasLidChat = ");
            sb.append(A0E);
            String obj = sb.toString();
            C19700wN r2 = this.A00;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("-lid-chat-pnh-ctwa-mat");
            r2.A0E(sb2.toString(), obj, true);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("DuplicateLidThreadManager/setDuplicateFlag ");
            sb3.append(str);
            sb3.append(" a lid chat, chatJid=");
            sb3.append(r6);
            Log.i(sb3.toString());
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.13w, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        r0 = r7.A02;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.whatsapp.jid.UserJid A01(X.AnonymousClass11F r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C223313w
            r6 = 0
            if (r0 == 0) goto L_0x0036
            X.13w r8 = (X.C223313w) r8
            if (r8 == 0) goto L_0x0036
            X.0yC r2 = r7.A04
            r1 = 2479(0x9af, float:3.474E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x0036
            X.12O r0 = r7.A02
            com.whatsapp.jid.PhoneUserJid r5 = r0.A0A(r8)
            if (r5 == 0) goto L_0x0036
            X.13w r4 = r0.A09(r5)
            X.1A6 r0 = r7.A01
            boolean r3 = r0.A0E(r5)
            X.1FV r0 = r7.A03
            boolean r2 = r0.A0A(r8)
            r1 = 1
            if (r3 == 0) goto L_0x0037
            r7.A00(r8, r2, r1)
        L_0x0033:
            r6 = r5
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
        L_0x0036:
            return r6
        L_0x0037:
            if (r4 == 0) goto L_0x0044
            boolean r0 = r8.equals(r4)
            if (r0 != 0) goto L_0x0044
            r7.A00(r8, r2, r1)
            r5 = r4
            goto L_0x0033
        L_0x0044:
            r0 = 0
            r7.A00(r8, r2, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1LL.A01(X.11F):com.whatsapp.jid.UserJid");
    }
}
