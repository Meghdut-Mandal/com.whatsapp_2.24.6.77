package X;

import com.whatsapp.status.playback.MessageReplyActivity;

/* renamed from: X.3bn  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C68373bn implements C16930qR {
    public final /* synthetic */ MessageReplyActivity A00;

    public /* synthetic */ C68373bn(MessageReplyActivity messageReplyActivity) {
        this.A00 = messageReplyActivity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a6, code lost:
        if (X.AnonymousClass1K2.A02(r2.A08, r2.A0s) < r2.A0D.A07(5645)) goto L_0x00a8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BSU(com.google.android.material.button.MaterialButtonToggleGroup r10, int r11, boolean r12) {
        /*
            r9 = this;
            com.whatsapp.status.playback.MessageReplyActivity r2 = r9.A00
            if (r12 == 0) goto L_0x0025
            android.widget.GridLayout r1 = r2.A05
            java.lang.String r0 = "hasAvatar="
            r5 = 4
            if (r1 != 0) goto L_0x0026
            X.1Ae r3 = r2.A0u
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r0)
            X.1BF r0 = r2.A0t
            boolean r0 = r0.A01()
            java.lang.String r1 = X.C36421kH.A0d(r1, r0)
            java.lang.String r0 = "failed_to_select_reaction_tab_null_avatar_grid"
        L_0x001d:
            r3.A02(r5, r0, r1)
        L_0x0020:
            android.graphics.Bitmap r0 = r2.A00
            com.whatsapp.status.playback.MessageReplyActivity.A0L(r0, r2)
        L_0x0025:
            return
        L_0x0026:
            android.widget.GridLayout r4 = r2.A06
            if (r4 != 0) goto L_0x003d
            X.1Ae r3 = r2.A0u
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r0)
            X.1BF r0 = r2.A0t
            boolean r0 = r0.A01()
            java.lang.String r1 = X.C36421kH.A0d(r1, r0)
            java.lang.String r0 = "failed_to_select_reaction_tab_null_emoji_grid"
            goto L_0x001d
        L_0x003d:
            r0 = 2131429870(0x7f0b09ee, float:1.8481425E38)
            r3 = 8
            r1 = 0
            if (r11 != r0) goto L_0x0066
            r4.setVisibility(r1)
            android.widget.GridLayout r0 = r2.A05
            r0.setVisibility(r3)
            android.widget.FrameLayout r0 = r2.A04
            com.whatsapp.status.playback.MessageReplyActivity.A0M(r0, r2)
            X.2pg r1 = X.C52592pg.EMOJI
        L_0x0054:
            r2.A0x = r1
            X.0v0 r0 = r2.A09
            java.lang.String r3 = r1.name()
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)
            java.lang.String r0 = "status_reactions_type_selected_tab"
            X.C36341k9.A0x(r1, r0, r3)
            goto L_0x0020
        L_0x0066:
            r0 = 2131427878(0x7f0b0226, float:1.8477385E38)
            if (r11 != r0) goto L_0x0020
            r4.setVisibility(r3)
            android.widget.GridLayout r0 = r2.A05
            r0.setVisibility(r1)
            com.whatsapp.status.playback.avatar.AvatarReactionRepository r4 = r2.A0y
            boolean r0 = X.C36381kD.A1X(r2)
            if (r0 == 0) goto L_0x00a8
            boolean r0 = X.C36431kI.A1R(r2)
            if (r0 == 0) goto L_0x00a8
            X.0yC r1 = r2.A0D
            r0 = 4196(0x1064, float:5.88E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x00a8
            X.0yC r1 = r2.A0D
            r0 = 5644(0x160c, float:7.909E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x00a8
            X.0wg r1 = r2.A0s
            X.0yb r0 = r2.A08
            int r3 = X.AnonymousClass1K2.A02(r0, r1)
            X.0yC r1 = r2.A0D
            r0 = 5645(0x160d, float:7.91E-42)
            int r0 = r1.A07(r0)
            r8 = 1
            if (r3 >= r0) goto L_0x00a9
        L_0x00a8:
            r8 = 0
        L_0x00a9:
            X.3Fk r0 = r2.A1X
            java.lang.ref.WeakReference r5 = X.AnonymousClass001.A0F(r0)
            java.lang.Object r1 = r5.get()
            X.3Fk r1 = (X.C62253Fk) r1
            if (r1 == 0) goto L_0x00bc
            java.util.List r0 = r4.A01
            r1.A01(r0)
        L_0x00bc:
            X.02l r1 = r4.A04
            r6 = 0
            X.03h r0 = new X.03h
            r0.<init>(r6)
            X.02h r0 = X.C008803t.A02(r1, r0)
            X.041 r7 = X.C009403z.A02(r0)
            java.util.List r1 = r4.A01
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00dc
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x00dc
        L_0x00d8:
            X.2pg r1 = X.C52592pg.AVATAR
            goto L_0x0054
        L_0x00dc:
            java.util.Iterator r1 = r1.iterator()
        L_0x00e0:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00d8
            java.lang.Object r0 = r1.next()
            boolean r0 = r0 instanceof X.C47472ep
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00e0
            com.whatsapp.status.playback.avatar.AvatarReactionRepository$startAsyncAvatarReactionFetch$2 r3 = new com.whatsapp.status.playback.avatar.AvatarReactionRepository$startAsyncAvatarReactionFetch$2
            r3.<init>(r4, r5, r6, r7, r8)
            X.C36331k8.A1T(r3, r7)
            goto L_0x00d8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68373bn.BSU(com.google.android.material.button.MaterialButtonToggleGroup, int, boolean):void");
    }
}
