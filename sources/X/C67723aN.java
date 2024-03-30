package X;

import androidx.core.view.inputmethod.InputConnectionCompat;
import com.whatsapp.mentions.MentionableEntry;

/* renamed from: X.3aN  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C67723aN implements InputConnectionCompat.OnCommitContentListener {
    public final /* synthetic */ MentionableEntry A00;

    public /* synthetic */ C67723aN(MentionableEntry mentionableEntry) {
        this.A00 = mentionableEntry;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
        if ("video/x.looping_mp4".equals(r3) != false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c2, code lost:
        if ((r6.A0k instanceof X.C177528dw) == false) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0128, code lost:
        if (r6.equals("video/x.looping_mp4") != false) goto L_0x012a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onCommitContent(androidx.core.view.inputmethod.InputContentInfoCompat r20, int r21, android.os.Bundle r22) {
        /*
            r19 = this;
            r0 = r19
            com.whatsapp.mentions.MentionableEntry r0 = r0.A00
            X.4R9 r1 = r0.A0D
            if (r1 != 0) goto L_0x000f
            java.lang.String r0 = "mentionable/entry/no on commit content listener"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x000d:
            r0 = 0
            return r0
        L_0x000f:
            X.4XH r1 = (X.AnonymousClass4XH) r1
            int r0 = r1.A02
            r3 = r20
            r2 = r21
            switch(r0) {
                case 0: goto L_0x00d7;
                case 1: goto L_0x009b;
                default: goto L_0x001a;
            }
        L_0x001a:
            java.lang.Object r5 = r1.A00
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r5 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r5
            java.lang.Object r0 = r1.A01
            X.3Od r0 = (X.C64483Od) r0
            X.33l r0 = r0.A00(r3, r2)
            if (r0 == 0) goto L_0x000d
            android.net.Uri r7 = r0.A00
            java.lang.String r3 = r0.A01
            if (r7 == 0) goto L_0x008c
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            r6.add(r7)
            java.lang.String r0 = "image/gif"
            boolean r0 = r0.equals(r3)
            java.lang.String r2 = "video/x.looping_mp4"
            if (r0 != 0) goto L_0x0046
            boolean r0 = r2.equals(r3)
            r4 = 5
            if (r0 == 0) goto L_0x0048
        L_0x0046:
            r4 = 23
        L_0x0048:
            com.whatsapp.status.widget.StatusEditText r0 = r5.A0f
            java.lang.String r0 = r0.getStringText()
            X.6QO r1 = new X.6QO
            r1.<init>(r7)
            r1.A0H(r0)
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L_0x0063
            java.lang.Integer r0 = X.C36421kH.A0V()
            r1.A0G(r0)
        L_0x0063:
            X.6Tg r3 = new X.6Tg
            r3.<init>(r1)
            X.3FR r2 = new X.3FR
            r2.<init>(r5)
            r2.A0H = r6
            X.8dw r0 = X.C177528dw.A00
            java.lang.String r0 = r0.getRawString()
            r2.A0D = r0
            r2.A02 = r4
            r1 = 1
            r2.A0N = r1
            r0 = 34
            r2.A04 = r0
            X.AnonymousClass3FR.A00(r3, r2)
            android.content.Intent r0 = r2.A01()
            r5.startActivityForResult(r0, r1)
        L_0x008a:
            r0 = 1
            return r0
        L_0x008c:
            java.lang.String r0 = "textstatus/setuppreview/share-failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.17Y r2 = r5.A05
            r1 = 2131894328(0x7f122038, float:1.9423458E38)
            r0 = 0
            r2.A06(r1, r0)
            goto L_0x008a
        L_0x009b:
            java.lang.Object r6 = r1.A00
            com.whatsapp.status.playback.MessageReplyActivity r6 = (com.whatsapp.status.playback.MessageReplyActivity) r6
            java.lang.Object r0 = r1.A01
            X.3Od r0 = (X.C64483Od) r0
            X.33l r5 = r0.A00(r3, r2)
            if (r5 == 0) goto L_0x000d
            r4 = 0
            java.lang.String r3 = r5.A01
            java.lang.String r0 = "image/gif"
            boolean r0 = r3.equals(r0)
            java.lang.String r1 = "video/x.looping_mp4"
            if (r0 != 0) goto L_0x00bc
            boolean r0 = r3.equals(r1)
            if (r0 == 0) goto L_0x00c4
        L_0x00bc:
            X.11F r0 = r6.A0k
            boolean r0 = r0 instanceof X.C177528dw
            r2 = 25
            if (r0 != 0) goto L_0x00c5
        L_0x00c4:
            r2 = 5
        L_0x00c5:
            boolean r0 = r3.equals(r1)
            if (r0 == 0) goto L_0x00cf
            java.lang.Integer r4 = X.C36421kH.A0V()
        L_0x00cf:
            X.28e r1 = r6.A0P
            android.net.Uri r0 = r5.A00
            r1.A0E(r0, r4, r2)
            goto L_0x008a
        L_0x00d7:
            java.lang.Object r0 = r1.A00
            X.3fk r0 = (X.C70803fk) r0
            java.lang.Object r1 = r1.A01
            X.3Od r1 = (X.C64483Od) r1
            X.33l r2 = r1.A00(r3, r2)
            r12 = 0
            if (r2 == 0) goto L_0x000d
            boolean r1 = X.C70803fk.A1b(r0)
            if (r1 == 0) goto L_0x0117
            X.155 r2 = X.C70803fk.A0C(r0)
            r1 = 2131887011(0x7f1203a3, float:1.9408617E38)
            java.lang.String r9 = r2.getString(r1)
            X.155 r2 = X.C70803fk.A0B(r0)
            r1 = 16908298(0x102000a, float:2.3877257E-38)
            android.view.View r6 = X.C03570Gk.A0B(r2, r1)
            r11 = -1
            java.util.List r10 = java.util.Collections.emptyList()
            X.0yb r8 = r0.A31
            X.155 r7 = X.C70803fk.A0C(r0)
            X.3ZU r5 = new X.3ZU
            r5.<init>((android.view.View) r6, (X.AnonymousClass012) r7, (X.C21060yb) r8, (java.lang.String) r9, (java.util.List) r10, (int) r11, (boolean) r12)
            r5.A02()
            goto L_0x008a
        L_0x0117:
            java.lang.String r6 = r2.A01
            java.lang.String r1 = "image/gif"
            boolean r1 = r6.equals(r1)
            java.lang.String r3 = "video/x.looping_mp4"
            if (r1 != 0) goto L_0x012a
            boolean r1 = r6.equals(r3)
            r5 = 5
            if (r1 == 0) goto L_0x012c
        L_0x012a:
            r5 = 23
        L_0x012c:
            boolean r1 = r6.equals(r3)
            r8 = 0
            if (r1 == 0) goto L_0x0179
            java.lang.Integer r4 = X.C36421kH.A0V()
        L_0x0137:
            java.lang.String r1 = "image/webp.wasticker"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x017b
            X.6c4 r3 = new X.6c4
            r3.<init>()
            X.1XQ[] r11 = new X.AnonymousClass1XQ[r12]
            java.lang.String r5 = ""
            X.3S2 r4 = new X.3S2
            r7 = r5
            r10 = r8
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r6 = r5
            r9 = r8
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r3.A04 = r4
            r1 = 512(0x200, float:7.175E-43)
            r3.A03 = r1
            r3.A02 = r1
            java.lang.String r1 = "image/webp"
            r3.A0D = r1
            android.net.Uri r1 = r2.A00
            java.lang.String r2 = r1.toString()
            r1 = 3
            r3.A02(r2, r1)
            X.4Rx r1 = r0.A78
            X.11F r0 = r0.A45
            r1.Bhl(r0, r3, r8, r12)
            goto L_0x008a
        L_0x0179:
            r4 = r8
            goto L_0x0137
        L_0x017b:
            java.lang.String r1 = "image/png"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x01a4
            X.0yC r3 = r0.A3n
            r1 = 6314(0x18aa, float:8.848E-42)
            boolean r1 = r3.A0E(r1)
            if (r1 == 0) goto L_0x01a4
            android.net.Uri r3 = r2.A00
            X.0wU r2 = X.C70803fk.A0K(r0)
            r11 = 9
            X.3vW r1 = new X.3vW
            r6 = r1
            r7 = r0
            r8 = r3
            r9 = r4
            r10 = r5
            r6.<init>(r7, r8, r9, r10, r11)
            r2.Boy(r1)
            goto L_0x008a
        L_0x01a4:
            X.28e r1 = r0.A2Q
            android.net.Uri r0 = r2.A00
            r1.A0E(r0, r4, r5)
            goto L_0x008a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67723aN.onCommitContent(androidx.core.view.inputmethod.InputContentInfoCompat, int, android.os.Bundle):boolean");
    }
}
