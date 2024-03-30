package X;

import android.os.SystemClock;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import java.util.Map;

/* renamed from: X.9jx  reason: invalid class name and case insensitive filesystem */
public class C201609jx {
    public long A00;
    public long A01;
    public long A02;
    public long A03 = Long.MAX_VALUE;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08 = Long.MAX_VALUE;
    public Map A09;
    public Map A0A;
    public boolean A0B;
    public boolean A0C;
    public final C19700wN A0D;
    public final C29021Va A0E;
    public final AnonymousClass19O A0F;
    public final C21390zA A0G;
    public final C19730wQ A0H;
    public final C19970wo A0I;
    public final C220412q A0J;
    public final C20810yC A0K;
    public final C21010yW A0L;
    public final AnonymousClass19A A0M;
    public final C21380z9 A0N;
    public volatile long A0O;
    public volatile long A0P;

    public static String A00(String str) {
        if ("receipt".equals(str) || "notification".equals(str) || "message".equals(str) || "call".equals(str)) {
            return str;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0026, code lost:
        if ((r5 instanceof X.C177618e5) != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C203399nx r8, X.C201609jx r9, int r10) {
        /*
            java.lang.Class<com.whatsapp.jid.Jid> r2 = com.whatsapp.jid.Jid.class
            java.lang.String r0 = "from"
            com.whatsapp.jid.Jid r5 = r8.A0X(r2, r0)
            boolean r1 = r5 instanceof X.C177538dx
            java.lang.String r0 = "participant"
            com.whatsapp.jid.Jid r2 = r8.A0X(r2, r0)
            if (r1 == 0) goto L_0x0015
            r0 = r2
            r2 = r5
            r5 = r0
        L_0x0015:
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "recipient"
            com.whatsapp.jid.Jid r6 = r8.A0X(r1, r0)
            boolean r0 = X.AnonymousClass143.A0G(r5)
            if (r0 != 0) goto L_0x0028
            boolean r0 = r5 instanceof X.C177618e5
            r7 = r5
            if (r0 == 0) goto L_0x0029
        L_0x0028:
            r7 = r2
        L_0x0029:
            X.2SY r3 = new X.2SY
            r3.<init>()
            X.13q r0 = X.AnonymousClass11F.A00
            X.11F r1 = X.C222713q.A00(r5)
            X.12q r0 = r9.A0J
            java.lang.Integer r0 = X.AnonymousClass3UK.A06(r0, r1)
            r3.A09 = r0
            java.lang.String r0 = "type"
            r4 = 0
            java.lang.String r0 = r8.A0i(r0, r4)
            int r0 = X.C203229nZ.A03(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A07 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r3.A06 = r0
            if (r6 == 0) goto L_0x0056
            r5 = r6
        L_0x0056:
            java.lang.Integer r0 = X.C203229nZ.A06(r5, r2)
            r3.A03 = r0
            X.0wQ r1 = r9.A0H
            com.whatsapp.jid.DeviceJid r0 = com.whatsapp.jid.DeviceJid.of(r7)
            java.lang.Integer r0 = X.C203229nZ.A05(r1, r0)
            r3.A05 = r0
            java.lang.String r0 = "offline"
            java.lang.String r1 = r8.A0i(r0, r4)
            boolean r0 = X.AnonymousClass000.A1V(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A00 = r0
            r2 = 0
            if (r1 == 0) goto L_0x00a0
            java.lang.Long r0 = X.AnonymousClass097.A04(r1)
        L_0x007f:
            r3.A0A = r0
            java.lang.String r0 = "edit"
            java.lang.String r1 = r8.A0i(r0, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0098
            X.C18740tg.A06(r1)
            int r0 = java.lang.Integer.parseInt(r1)
            java.lang.Integer r2 = X.C203229nZ.A04(r0)
        L_0x0098:
            r3.A08 = r2
            X.0yW r0 = r9.A0L
            r0.Blv(r3)
            return
        L_0x00a0:
            r0 = r4
            goto L_0x007f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201609jx.A01(X.9nx, X.9jx, int):void");
    }

    public void A02() {
        this.A0N.A01("offline_resume", false);
        A06(false);
    }

    public void A03() {
        C19970wo r2 = this.A0I;
        this.A0O = SystemClock.uptimeMillis();
        this.A0P = C19970wo.A00(r2);
    }

    public void A04() {
        this.A0N.A01("offline_resume", false);
        A06(true);
    }

    public void A05(C203399nx r5, int i) {
        C176288bs r2 = new C176288bs();
        String str = r5.A00;
        r2.A00 = str;
        r2.A01 = C36391kE.A0x(r5, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        this.A0L.Bly(r2);
        String A002 = A00(str);
        if (A002 == null) {
            C36321k7.A1J(r5, "ConnectionReader/read/can't send nack for non ackable stanza:", AnonymousClass000.A0u());
            return;
        }
        AnonymousClass9YT r22 = new AnonymousClass9YT();
        r22.A05 = A002;
        r22.A07 = r5.A0h(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        r22.A08("error", String.valueOf(i));
        r22.A00 = -1;
        Class<Jid> cls = Jid.class;
        Jid A0X = r5.A0X(cls, "from");
        if (A0X != null) {
            r22.A02 = A0X;
        }
        String A0x = C36391kE.A0x(r5, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        if (A0x != null) {
            r22.A08 = A0x;
        }
        Jid A0X2 = r5.A0X(cls, "participant");
        if (A0X2 != null) {
            r22.A01 = A0X2;
        }
        this.A0M.A0H(r22.A01());
    }

    public void A06(boolean z) {
        if (!this.A0C) {
            this.A0C = true;
            if (this.A04 + this.A06 + this.A05 != 0) {
                C176588cM r5 = new C176588cM();
                r5.A0D = Long.valueOf(this.A0P);
                r5.A0A = C90504aG.A0h(this.A07, this.A0O);
                r5.A06 = C90504aG.A0h(this.A03, this.A0O);
                r5.A0B = C90504aG.A0h(SystemClock.uptimeMillis(), this.A0O);
                int i = 2;
                if (z) {
                    i = 1;
                }
                r5.A02 = Integer.valueOf(i);
                r5.A01 = Boolean.valueOf(this.A0G.A00);
                r5.A00 = Boolean.valueOf(!this.A0B);
                r5.A03 = Long.valueOf(this.A00);
                r5.A08 = Long.valueOf(this.A04);
                r5.A05 = Long.valueOf(this.A02);
                r5.A0C = Long.valueOf(this.A06);
                r5.A04 = Long.valueOf(this.A01);
                r5.A09 = Long.valueOf(this.A05);
                if (this.A08 != Long.MAX_VALUE) {
                    r5.A07 = Long.valueOf((this.A0P - this.A08) / 86400000);
                }
                this.A0L.Bly(r5);
            }
        }
    }

    public C201609jx(C21390zA r3, C19700wN r4, C19730wQ r5, C19970wo r6, C220412q r7, C20810yC r8, C21010yW r9, AnonymousClass19A r10, C29021Va r11, C21380z9 r12, AnonymousClass19O r13, Map map, Map map2) {
        this.A0I = r6;
        this.A0K = r8;
        this.A0D = r4;
        this.A0H = r5;
        this.A0J = r7;
        this.A0L = r9;
        this.A0M = r10;
        this.A0F = r13;
        this.A0N = r12;
        this.A0G = r3;
        this.A0A = map;
        this.A09 = map2;
        this.A0E = r11;
    }
}
