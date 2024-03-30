package X;

import android.os.SystemClock;
import com.whatsapp.jid.GroupJid;
import java.net.URL;

/* renamed from: X.3pP  reason: invalid class name and case insensitive filesystem */
public class C76763pP implements C236119d {
    public final long A00 = SystemClock.elapsedRealtime();
    public final AnonymousClass4TE A01;
    public final GroupJid A02;
    public final String A03;
    public final String A04;

    public void BVN(String str) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.net.URL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.net.URL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.net.URL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r10v4, types: [java.net.URL] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BiM(X.C203399nx r14, java.lang.String r15) {
        /*
            r13 = this;
            java.lang.String r0 = "picture"
            X.9nx r5 = r14.A0c(r0)
            java.lang.String r3 = r13.A03
            com.whatsapp.jid.GroupJid r6 = r13.A02
            java.lang.String r4 = r13.A04
            r10 = 0
            if (r5 == 0) goto L_0x0043
            java.lang.String r0 = "id"
            java.lang.String r3 = r5.A0i(r0, r10)
            java.lang.String r0 = "type"
            java.lang.String r4 = r5.A0i(r0, r10)
            java.lang.String r0 = "linked_group_jid"
            java.lang.String r2 = r5.A0i(r0, r10)
            java.lang.String r0 = "url"
            java.lang.String r1 = r5.A0i(r0, r10)
            java.lang.String r0 = "direct_path"
            java.lang.String r7 = r5.A0i(r0, r10)
            java.lang.String r0 = "hash"
            java.lang.String r8 = r5.A0i(r0, r10)
            if (r1 == 0) goto L_0x0047
            java.net.URL r10 = new java.net.URL     // Catch:{ MalformedURLException -> 0x003b }
            r10.<init>(r1)     // Catch:{ MalformedURLException -> 0x003b }
            goto L_0x0047
        L_0x003b:
            java.lang.String r1 = "Malformed picture url"
            X.19b r0 = new X.19b
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0043:
            r9 = r10
            r7 = r10
            r8 = r10
            goto L_0x0053
        L_0x0047:
            byte[] r1 = r5.A01
            if (r2 == 0) goto L_0x0051
            X.3Sl r0 = X.AnonymousClass147.A01
            X.147 r6 = r0.A06(r2)
        L_0x0051:
            r9 = r10
            r10 = r1
        L_0x0053:
            if (r3 != 0) goto L_0x0059
            r11 = -1
        L_0x0056:
            if (r4 == 0) goto L_0x0074
            goto L_0x005e
        L_0x0059:
            int r11 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0075 }
            goto L_0x0056
        L_0x005e:
            X.4TE r2 = r13.A01     // Catch:{ NumberFormatException -> 0x0075 }
            java.lang.String r0 = "preview"
            boolean r0 = r0.equals(r4)     // Catch:{ NumberFormatException -> 0x0075 }
            int r12 = X.C36371kC.A00(r0)
            X.5xp r5 = new X.5xp     // Catch:{ NumberFormatException -> 0x0075 }
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ NumberFormatException -> 0x0075 }
            long r0 = r13.A00     // Catch:{ NumberFormatException -> 0x0075 }
            r2.Bdf(r5, r0)     // Catch:{ NumberFormatException -> 0x0075 }
        L_0x0074:
            return
        L_0x0075:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Malformed photo id="
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r3, r1)
            X.19b r0 = new X.19b
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76763pP.BiM(X.9nx, java.lang.String):void");
    }

    public C76763pP(AnonymousClass4TE r3, GroupJid groupJid, GroupJid groupJid2, String str, String str2) {
        this.A01 = r3;
        if (groupJid == null) {
            this.A02 = groupJid2;
        } else {
            this.A02 = groupJid;
        }
        this.A04 = str;
        this.A03 = str2;
    }

    public void BWw(C203399nx r12, String str) {
        int A002 = AnonymousClass3ME.A00(r12);
        GroupJid groupJid = this.A02;
        if (groupJid == null || A002 != 404) {
            this.A01.Bde(groupJid, this.A04, A002, this.A00);
        } else {
            this.A01.Bdf(new C124245xp(groupJid, (String) null, (String) null, (URL) null, (byte[]) null, -1, C36371kC.A00("preview".equals(this.A04) ? 1 : 0)), this.A00);
        }
    }
}
