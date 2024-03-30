package X;

/* renamed from: X.93t  reason: invalid class name and case insensitive filesystem */
public class C1894293t implements AnonymousClass7hX {
    public Object A00;
    public final int A01;

    public C1894293t(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: X.8pC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: X.8pE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: X.8pD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: X.8pC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: X.8pC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: X.8pC} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        r3.setDescription(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        r0 = X.AnonymousClass3TF.A02(r2, r1.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f0, code lost:
        X.AnonymousClass3SU.A01(r2, r4.A09, r0.A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r1.A0B == 0) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        r0 = X.AnonymousClass3UY.A07(r2, (long) r1.A0B);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BhL(int r7) {
        /*
            r6 = this;
            int r0 = r6.A01
            java.lang.Object r4 = r6.A00
            switch(r0) {
                case 0: goto L_0x0069;
                case 1: goto L_0x0033;
                default: goto L_0x0007;
            }
        L_0x0007:
            X.8pD r4 = (X.C182518pD) r4
            r1 = 8
            if (r7 == 0) goto L_0x005e
            r0 = 1
            if (r7 == r0) goto L_0x00dd
            com.whatsapp.search.views.itemviews.AudioPlayerView r0 = r4.A09
            X.1RJ r0 = r0.A04
            r0.A03(r1)
            com.whatsapp.conversation.ui.AudioPlayerMetadataView r3 = r4.A04
            X.2bi r1 = r4.A09
            X.0ts r2 = r4.A05
        L_0x001d:
            int r0 = r1.A0B
            if (r0 == 0) goto L_0x002c
            int r0 = r1.A0B
            long r0 = (long) r0
            java.lang.String r0 = X.AnonymousClass3UY.A07(r2, r0)
        L_0x0028:
            r3.setDescription(r0)
            return
        L_0x002c:
            long r0 = r1.A00
            java.lang.String r0 = X.AnonymousClass3TF.A02(r2, r0)
            goto L_0x0028
        L_0x0033:
            X.8pE r4 = (X.C182528pE) r4
            r2 = 8
            java.lang.String r5 = "audioPlayerView"
            if (r7 == 0) goto L_0x00f8
            r0 = 1
            java.lang.String r1 = "audioPlayerMetadataView"
            if (r7 == r0) goto L_0x00ba
            com.whatsapp.search.views.itemviews.AudioPlayerView r0 = r4.A09
            if (r0 != 0) goto L_0x0049
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x0049:
            X.1RJ r0 = r0.A04
            r0.A03(r2)
            com.whatsapp.conversation.ui.AudioPlayerMetadataView r3 = r4.A04
            if (r3 != 0) goto L_0x0057
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r1)
            throw r0
        L_0x0057:
            X.2bi r1 = r4.A09
            X.0ts r2 = r4.getWhatsAppLocale()
            goto L_0x001d
        L_0x005e:
            com.whatsapp.search.views.itemviews.AudioPlayerView r0 = r4.A09
            X.1RJ r0 = r0.A04
            r0.A03(r1)
            X.C182518pD.A00(r4)
            return
        L_0x0069:
            X.8pC r4 = (X.C182508pC) r4
            r1 = 8
            if (r7 == 0) goto L_0x00af
            r0 = 1
            if (r7 == r0) goto L_0x0098
            com.whatsapp.search.views.itemviews.AudioPlayerView r0 = r4.A03
            X.1RJ r0 = r0.A04
            r0.A03(r1)
            com.whatsapp.conversation.conversationrow.ConversationRowAudioPreview r3 = r4.A00
            r3.A01()
            X.2bi r1 = r4.A09
            X.0ts r2 = r4.A02
            int r0 = r1.A0B
            if (r0 == 0) goto L_0x0091
            int r0 = r1.A0B
            long r0 = (long) r0
            java.lang.String r0 = X.AnonymousClass3UY.A07(r2, r0)
        L_0x008d:
            r3.setDuration(r0)
            return
        L_0x0091:
            long r0 = r1.A00
            java.lang.String r0 = X.AnonymousClass3TF.A02(r2, r0)
            goto L_0x008d
        L_0x0098:
            com.whatsapp.conversation.conversationrow.ConversationRowAudioPreview r3 = r4.A00
            r3.A01()
            X.0ts r2 = r4.A02
            X.2bi r0 = r4.A09
            long r0 = r0.A00
            java.lang.String r0 = X.AnonymousClass3TF.A02(r2, r0)
            r3.setDuration(r0)
            X.1Y4 r2 = r4.A06
            com.whatsapp.search.views.itemviews.AudioPlayerView r0 = r4.A03
            goto L_0x00f0
        L_0x00af:
            com.whatsapp.search.views.itemviews.AudioPlayerView r0 = r4.A03
            X.1RJ r0 = r0.A04
            r0.A03(r1)
            X.C182508pC.A00(r4)
            return
        L_0x00ba:
            com.whatsapp.conversation.ui.AudioPlayerMetadataView r3 = r4.A04
            if (r3 != 0) goto L_0x00c3
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r1)
            throw r0
        L_0x00c3:
            X.0ts r2 = r4.getWhatsAppLocale()
            X.2bi r0 = r4.A09
            long r0 = r0.A00
            java.lang.String r0 = X.AnonymousClass3TF.A02(r2, r0)
            r3.setDescription(r0)
            X.1Y4 r2 = r4.A06
            com.whatsapp.search.views.itemviews.AudioPlayerView r0 = r4.A09
            if (r0 != 0) goto L_0x00f0
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x00dd:
            com.whatsapp.conversation.ui.AudioPlayerMetadataView r3 = r4.A04
            X.0ts r2 = r4.A05
            X.2bi r0 = r4.A09
            long r0 = r0.A00
            java.lang.String r0 = X.AnonymousClass3TF.A02(r2, r0)
            r3.setDescription(r0)
            X.1Y4 r2 = r4.A06
            com.whatsapp.search.views.itemviews.AudioPlayerView r0 = r4.A09
        L_0x00f0:
            X.1RJ r1 = r0.A04
            X.2bi r0 = r4.A09
            X.AnonymousClass3SU.A01(r2, r0, r1)
            return
        L_0x00f8:
            com.whatsapp.search.views.itemviews.AudioPlayerView r0 = r4.A09
            if (r0 != 0) goto L_0x0101
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x0101:
            X.1RJ r0 = r0.A04
            r0.A03(r2)
            X.C182528pE.A00(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1894293t.BhL(int):void");
    }
}
