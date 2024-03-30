package X;

/* renamed from: X.7or  reason: invalid class name and case insensitive filesystem */
public class C162607or extends C06570Uc {
    public Object A00;
    public final int A01;

    public C162607or(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r4.A0J == 4) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(android.view.View r9, float r10) {
        /*
            r8 = this;
            int r0 = r8.A01
            switch(r0) {
                case 0: goto L_0x0086;
                case 1: goto L_0x00bb;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r8.A00
            X.6WR r3 = (X.AnonymousClass6WR) r3
            com.google.android.material.bottomsheet.BottomSheetBehavior r4 = r3.A07
            if (r4 == 0) goto L_0x0013
            int r2 = r4.A0J
            r1 = 4
            r0 = 0
            if (r2 != r1) goto L_0x0014
        L_0x0013:
            r0 = 1
        L_0x0014:
            r2 = 1
            if (r0 == 0) goto L_0x0074
            boolean r0 = r3.A0D
            if (r0 == 0) goto L_0x0074
            r8.A03(r9, r2)
            r0 = 0
            r3.A0D = r0
        L_0x0021:
            X.6cU r0 = r3.A0T
            com.whatsapp.mediacomposer.MediaComposerFragment r0 = r0.A01
            X.7le r0 = r0.A1a()
            if (r0 == 0) goto L_0x002e
            r0.BXy(r10)
        L_0x002e:
            androidx.recyclerview.widget.RecyclerView r0 = r3.A0P
            X.0CP r7 = r0.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r7 = (androidx.recyclerview.widget.LinearLayoutManager) r7
            if (r7 == 0) goto L_0x00ca
            r6 = 1051931443(0x3eb33333, float:0.35)
            float r6 = r6 * r10
            r0 = 1059481190(0x3f266666, float:0.65)
            float r6 = r6 + r0
            r5 = 1055286886(0x3ee66666, float:0.45)
            float r5 = r5 * r10
            r0 = 1057803469(0x3f0ccccd, float:0.55)
            float r5 = r5 + r0
            int r4 = r7.A1T()
            int r2 = r7.A1V()
        L_0x0050:
            if (r4 > r2) goto L_0x00ca
            android.view.View r1 = r7.A0k(r4)
            if (r1 == 0) goto L_0x0071
            r1.setScaleX(r6)
            r1.setScaleY(r6)
            int r0 = r3.A01
            if (r4 != r0) goto L_0x0071
            r0 = 2131433816(0x7f0b1958, float:1.8489428E38)
            android.view.View r0 = r1.findViewById(r0)
            if (r0 == 0) goto L_0x0071
            r0.setScaleX(r5)
            r0.setScaleY(r5)
        L_0x0071:
            int r4 = r4 + 1
            goto L_0x0050
        L_0x0074:
            if (r4 == 0) goto L_0x0021
            int r1 = r4.A0J
            r0 = 3
            if (r1 != r0) goto L_0x0021
            boolean r0 = r3.A0E
            if (r0 == 0) goto L_0x0021
            r8.A03(r9, r2)
            r0 = 0
            r3.A0E = r0
            goto L_0x0021
        L_0x0086:
            java.lang.Object r3 = r8.A00
            X.6X3 r3 = (X.AnonymousClass6X3) r3
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r2 = r3.A0H
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2.A09(r2, r10)
            com.whatsapp.calling.views.VoipCallControlBottomSheetDragIndicator r0 = r2.A0T
            if (r0 == 0) goto L_0x0096
            r0.setSlideOffset(r10)
        L_0x0096:
            r0 = 0
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x00e4
            int r0 = r3.A00
            if (r0 <= 0) goto L_0x00b0
            int r1 = r9.getTop()
            int r0 = r3.A00
            int r1 = r1 - r0
        L_0x00a6:
            r2.A1h(r1, r10)
            int r0 = r9.getTop()
            r3.A00 = r0
            return
        L_0x00b0:
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r3.A0G
            int r0 = r0.A0S()
            int r0 = -r0
            float r0 = (float) r0
            float r0 = r0 * r10
            int r1 = (int) r0
            goto L_0x00a6
        L_0x00bb:
            java.lang.Object r0 = r8.A00
            com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet r0 = (com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet) r0
            com.whatsapp.WaEditText r0 = r0.A09
            if (r0 == 0) goto L_0x00e4
            r0.A0B()
            r0.clearFocus()
            return
        L_0x00ca:
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r3.A00
            float r10 = r10 * r0
            float r1 = r1 - r10
            android.view.View r0 = r3.A0M
            r0.setScaleX(r1)
            r0.setScaleY(r1)
            X.6wC r0 = r3.A0U
            if (r0 == 0) goto L_0x00e4
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r0.A0N
            r0.setScaleX(r1)
            r0.setScaleY(r1)
        L_0x00e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162607or.A02(android.view.View, float):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x017c, code lost:
        if (r4 != 5) goto L_0x01e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01c6, code lost:
        if (r12.A0G.A0J != 4) goto L_0x01c8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(android.view.View r19, int r20) {
        /*
            r18 = this;
            r7 = r18
            int r0 = r7.A01
            r4 = r20
            switch(r0) {
                case 0: goto L_0x0164;
                case 1: goto L_0x007d;
                default: goto L_0x0009;
            }
        L_0x0009:
            r6 = 4
            r2 = 1
            r5 = 0
            if (r4 != r6) goto L_0x008d
            java.lang.Object r3 = r7.A00
            X.6WR r3 = (X.AnonymousClass6WR) r3
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r3.A07
            int r1 = r0.A0S()
            int r0 = r19.getTop()
            int r1 = r1 + r0
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r3.A0N
            int r0 = r0.getHeight()
            if (r1 != r0) goto L_0x0065
            X.6cU r9 = r3.A0T
            com.whatsapp.mediacomposer.MediaComposerFragment r8 = r9.A01
            X.7le r4 = r8.A1a()
            if (r4 == 0) goto L_0x0049
            com.whatsapp.mediacomposer.MediaComposerActivity r4 = (com.whatsapp.mediacomposer.MediaComposerActivity) r4
            r0 = 0
            r4.BXy(r0)
            X.6vv r0 = r4.A0u
            r0.A05(r2)
            boolean r0 = r4.A1X
            if (r0 != 0) goto L_0x008a
            X.6vv r1 = r4.A0u
            X.6VT r0 = r4.A0s
            boolean r0 = r0.A0C()
            r1.A06(r0)
        L_0x0049:
            X.6wC r0 = r8.A0E
            if (r0 == 0) goto L_0x0054
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r0.A0N
            if (r0 == 0) goto L_0x0054
            r0.setEnabled(r2)
        L_0x0054:
            com.whatsapp.mediacomposer.ImageComposerFragment r0 = r9.A00
            com.whatsapp.mediacomposer.doodle.ImagePreviewContentLayout r0 = r0.A04
            X.6cY r0 = r0.A02
            r0.A0E = r2
            androidx.recyclerview.widget.RecyclerView r0 = r3.A0P
            r0.setVisibility(r6)
            r3.A0D = r2
            r3.A0F = r5
        L_0x0065:
            java.lang.Object r2 = r7.A00
            X.6WR r2 = (X.AnonymousClass6WR) r2
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r2.A07
            if (r0 == 0) goto L_0x0074
            int r1 = r0.A0J
            if (r1 == r6) goto L_0x0074
            r0 = 3
            if (r1 != r0) goto L_0x007d
        L_0x0074:
            boolean r0 = r2.A0C
            if (r0 == 0) goto L_0x007e
            r2.A04()
            r2.A0C = r5
        L_0x007d:
            return
        L_0x007e:
            boolean r0 = r2.A0A
            if (r0 == 0) goto L_0x007d
            boolean r0 = r2.A0B
            r2.A07(r0)
            r2.A0A = r5
            return
        L_0x008a:
            r4.A1X = r5
            goto L_0x0049
        L_0x008d:
            r0 = 3
            if (r4 != r0) goto L_0x012a
            java.lang.Object r4 = r7.A00
            X.6WR r4 = (X.AnonymousClass6WR) r4
            X.4me r0 = r4.A08
            if (r0 == 0) goto L_0x009b
            r0.A0L(r2)
        L_0x009b:
            int r1 = r19.getTop()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r4.A0N
            int r0 = r0.getTop()
            if (r1 != r0) goto L_0x0127
            X.6cU r3 = r4.A0T
            com.whatsapp.mediacomposer.MediaComposerFragment r8 = r3.A01
            X.7le r2 = r8.A1a()
            if (r2 == 0) goto L_0x00d4
            com.whatsapp.mediacomposer.MediaComposerActivity r2 = (com.whatsapp.mediacomposer.MediaComposerActivity) r2
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.BXy(r0)
            X.6vv r1 = r2.A0u
            X.6VT r0 = r2.A0s
            boolean r2 = r0.A0C()
            r1.A05(r5)
            com.whatsapp.mediacomposer.bottombar.BottomBarView r0 = r1.A02
            r0.setVisibility(r6)
            X.6vx r0 = r1.A07
            r1 = 8
            if (r2 == 0) goto L_0x00cf
            r1 = 4
        L_0x00cf:
            androidx.recyclerview.widget.RecyclerView r0 = r0.A05
            r0.setVisibility(r1)
        L_0x00d4:
            X.6wC r0 = r8.A0E
            if (r0 == 0) goto L_0x00df
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r0.A0N
            if (r0 == 0) goto L_0x00df
            r0.setEnabled(r5)
        L_0x00df:
            com.whatsapp.mediacomposer.ImageComposerFragment r0 = r3.A00
            com.whatsapp.mediacomposer.doodle.ImagePreviewContentLayout r0 = r0.A04
            X.6cY r2 = r0.A02
            r2.A0E = r5
            android.graphics.Matrix r1 = r2.A0H
            android.graphics.Matrix r0 = r2.A0I
            r1.set(r0)
            float r0 = r2.A03
            r2.A04 = r0
            X.65t r0 = r2.A0M
            r0.A01(r1)
            X.0v0 r3 = r4.A0R
            android.content.SharedPreferences r0 = X.C36341k9.A0E(r3)
            java.lang.String r2 = "filter_dismissal_amount"
            int r1 = r0.getInt(r2, r5)
            r0 = 5
            if (r1 > r0) goto L_0x010b
            int r0 = r1 + 1
            X.C36321k7.A0q(r3, r2, r0)
        L_0x010b:
            r4.A0E = r5
        L_0x010d:
            androidx.recyclerview.widget.RecyclerView r0 = r4.A0P
            r0.setVisibility(r5)
            X.0CP r1 = r0.getLayoutManager()
            if (r1 == 0) goto L_0x0065
            int r0 = r4.A01
            android.view.View r1 = r1.A0k(r0)
            if (r1 == 0) goto L_0x0065
            r0 = 8
            r1.sendAccessibilityEvent(r0)
            goto L_0x0065
        L_0x0127:
            r4.A0E = r2
            goto L_0x010d
        L_0x012a:
            if (r4 != r2) goto L_0x0065
            java.lang.Object r3 = r7.A00
            X.6WR r3 = (X.AnonymousClass6WR) r3
            androidx.recyclerview.widget.RecyclerView r2 = r3.A0P
            r2.getVisibility()
            X.6cU r0 = r3.A0T
            com.whatsapp.mediacomposer.MediaComposerFragment r0 = r0.A01
            X.7le r0 = r0.A1a()
            if (r0 == 0) goto L_0x014f
            com.whatsapp.mediacomposer.MediaComposerActivity r0 = (com.whatsapp.mediacomposer.MediaComposerActivity) r0
            X.6vv r1 = r0.A0u
            X.6VT r0 = r0.A0s
            boolean r0 = r0.A0C()
            r1.A05(r5)
            r1.A06(r0)
        L_0x014f:
            r3.A0F = r5
            X.4me r0 = r3.A08
            if (r0 != 0) goto L_0x015f
            android.os.Handler r1 = r3.A0J
            java.lang.Runnable r0 = r3.A0W
            r1.removeCallbacks(r0)
            r0.run()
        L_0x015f:
            r2.setVisibility(r5)
            goto L_0x0065
        L_0x0164:
            java.lang.Object r12 = r7.A00
            X.6X3 r12 = (X.AnonymousClass6X3) r12
            boolean r0 = r12.A0B
            r3 = 4
            if (r0 == 0) goto L_0x0175
            if (r4 == r3) goto L_0x0175
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r12.A0G
            r0.A0W(r3)
            return
        L_0x0175:
            r2 = 5
            r15 = 0
            r6 = 3
            if (r4 == r6) goto L_0x020a
            if (r4 == r3) goto L_0x017e
            if (r4 != r2) goto L_0x01e3
        L_0x017e:
            boolean r0 = r12.A05
            if (r0 != 0) goto L_0x0207
            if (r4 == r6) goto L_0x0207
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r4 != r3) goto L_0x0189
            r6 = 0
        L_0x0189:
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r5 = r12.A0H
            int r1 = r19.getTop()
            int r0 = r12.A00
            int r1 = r1 - r0
            r5.A1h(r1, r6)
            int r0 = r19.getTop()
            r12.A00 = r0
        L_0x019b:
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r12.A0H
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2.A09(r0, r6)
            com.whatsapp.calling.views.VoipCallControlBottomSheetDragIndicator r0 = r0.A0T
            if (r0 == 0) goto L_0x01a7
            r0.setSlideOffset(r6)
        L_0x01a7:
            r12.A04()
            r12.A05()
            boolean r0 = r12.A06
            if (r0 == 0) goto L_0x01e3
            android.view.View r5 = r12.A0D
            float r1 = r5.getTranslationY()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01e3
            boolean r0 = r12.A0A
            if (r0 != 0) goto L_0x01c8
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r12.A0G
            int r0 = r0.A0J
            r14 = 500(0x1f4, float:7.0E-43)
            if (r0 == r3) goto L_0x01c9
        L_0x01c8:
            r14 = 0
        L_0x01c9:
            float r0 = r5.getTranslationY()
            int r7 = (int) r0
            r6 = 1056964608(0x3f000000, float:0.5)
            r5 = 1068289229(0x3faccccd, float:1.35)
            r1 = 1053609165(0x3ecccccd, float:0.4)
            r0 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.PathInterpolator r13 = X.C017907q.A00(r6, r5, r1, r0)
            r17 = 0
            r16 = r7
            r12.A06(r13, r14, r15, r16, r17)
        L_0x01e3:
            if (r4 != r3) goto L_0x01f2
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r12.A0H
            com.whatsapp.calling.views.VoipCallFooter r0 = r0.A0U
            if (r0 == 0) goto L_0x01f2
            android.widget.ImageButton r0 = r0.A05
            if (r0 == 0) goto L_0x01f2
            r0.setSelected(r15)
        L_0x01f2:
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r1 = r12.A0H
            if (r4 == r2) goto L_0x01f7
            r15 = 1
        L_0x01f7:
            X.61I r0 = r1.A0d
            if (r0 == 0) goto L_0x01fe
            r0.A00(r15)
        L_0x01fe:
            r0 = 0
            if (r15 == 0) goto L_0x0203
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x0203:
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2.A0A(r1, r0)
            return
        L_0x0207:
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L_0x019b
        L_0x020a:
            r12.A05 = r15
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r7 = r12.A0H
            androidx.recyclerview.widget.RecyclerView r11 = r7.A0F
            if (r11 == 0) goto L_0x026b
            X.4mS r0 = r7.A0M
            if (r0 == 0) goto L_0x026b
            com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel r8 = r7.A0P
            java.util.Set r0 = r8.A0C
            java.util.HashSet r9 = X.C90524aI.A0k(r0)
            r10 = 0
        L_0x021f:
            int r0 = r11.getChildCount()
            if (r10 >= r0) goto L_0x0246
            android.view.View r1 = r11.getChildAt(r10)
            if (r1 == 0) goto L_0x0243
            java.lang.Object r0 = r1.getTag()
            boolean r0 = r0 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x0243
            java.lang.Object r5 = r1.getTag()
            X.C18740tg.A06(r5)
            boolean r0 = r9.contains(r5)
            if (r0 == 0) goto L_0x0255
            r9.remove(r5)
        L_0x0243:
            int r10 = r10 + 1
            goto L_0x021f
        L_0x0246:
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x026b
            X.0wN r5 = r8.A02
            java.lang.String r1 = r9.toString()
            java.lang.String r0 = "VoipCallControlBottomSheet/hasDuplicateParticipant/missing participants"
            goto L_0x0263
        L_0x0255:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VoipCallControlBottomSheet/hasDuplicateParticipant/duplicate participant = "
            X.C36321k7.A1L(r5, r0, r1)
            X.0wN r5 = r8.A02
            r1 = 0
            java.lang.String r0 = "VoipCallControlBottomSheet/hasDuplicateParticipant/duplicate participant"
        L_0x0263:
            r5.A0E(r0, r1, r15)
            X.4mS r0 = r7.A0M
            r0.A06()
        L_0x026b:
            com.whatsapp.calling.views.VoipCallFooter r0 = r7.A0U
            if (r0 == 0) goto L_0x017e
            android.widget.ImageButton r1 = r0.A05
            if (r1 == 0) goto L_0x017e
            r0 = 1
            r1.setSelected(r0)
            goto L_0x017e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162607or.A03(android.view.View, int):void");
    }
}
