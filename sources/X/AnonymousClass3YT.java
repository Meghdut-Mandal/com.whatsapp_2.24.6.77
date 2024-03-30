package X;

import android.view.View;

/* renamed from: X.3YT  reason: invalid class name */
public class AnonymousClass3YT implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02ff, code lost:
        r6 = (X.C47512et) r6;
        r1 = r6.A03;
        r12 = r6.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0347, code lost:
        if (r0 != false) goto L_0x031b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0372, code lost:
        if (r0 == false) goto L_0x0374;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0390, code lost:
        if (r0 == false) goto L_0x0392;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x027e, code lost:
        if (r8.equals(r2.A0J.A1J) == false) goto L_0x0280;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r15) {
        /*
            r14 = this;
            r7 = r14
            int r0 = r14.A04
            switch(r0) {
                case 0: goto L_0x022e;
                case 1: goto L_0x0217;
                case 2: goto L_0x01f1;
                case 3: goto L_0x01cd;
                case 4: goto L_0x01a0;
                case 5: goto L_0x015f;
                case 6: goto L_0x0132;
                case 7: goto L_0x0106;
                case 8: goto L_0x00c8;
                case 9: goto L_0x00ae;
                case 10: goto L_0x008b;
                case 11: goto L_0x0020;
                case 12: goto L_0x0051;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r5 = r14.A00
            X.4Uu r5 = (X.C88984Uu) r5
            boolean r0 = r5.B54()
            if (r0 == 0) goto L_0x001d
            java.lang.Object r6 = r14.A01
        L_0x0012:
            android.graphics.drawable.Drawable r6 = (android.graphics.drawable.Drawable) r6
            r9 = 0
            r10 = 1
            java.lang.String r8 = ""
            r11 = 1
            r5.Azo(r6, r7, r8, r9, r10, r11)
        L_0x001c:
            return
        L_0x001d:
            java.lang.Object r6 = r14.A02
            goto L_0x0012
        L_0x0020:
            java.lang.Object r10 = r14.A00
            X.2fB r10 = (X.C47592fB) r10
            java.lang.Object r1 = r14.A01
            java.util.concurrent.atomic.AtomicLong r1 = (java.util.concurrent.atomic.AtomicLong) r1
            java.lang.Object r9 = r14.A02
            X.3BK r9 = (X.AnonymousClass3BK) r9
            java.lang.Object r11 = r14.A03
            android.graphics.PointF r11 = (android.graphics.PointF) r11
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r10.A01
            int r0 = r0.A0J
            r8 = 4
            if (r0 != r8) goto L_0x001c
            r10.A0D()
            boolean r0 = r10.A03
            if (r0 == 0) goto L_0x001c
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r0 = r1.get()
            long r3 = r3 - r0
            r1 = 300(0x12c, double:1.48E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0296
            r10.A0H()
            return
        L_0x0051:
            java.lang.Object r0 = r14.A03
            org.npci.upi.security.pinactivitycomponent.w r0 = (org.npci.upi.security.pinactivitycomponent.w) r0
            java.util.ArrayList r1 = r0.A04
            int r0 = r0.A07
            java.lang.Object r0 = r1.get(r0)
            X.4Uu r0 = (X.C88984Uu) r0
            r0.B1f()
            java.lang.Object r5 = r14.A00
            X.4Uu r5 = (X.C88984Uu) r5
            boolean r0 = r5.getTextEntered()
            if (r0 != 0) goto L_0x0086
            boolean r0 = r5.B54()
        L_0x0070:
            if (r0 == 0) goto L_0x0083
            java.lang.Object r6 = r14.A01
        L_0x0074:
            android.graphics.drawable.Drawable r6 = (android.graphics.drawable.Drawable) r6
            r0 = 0
            r10 = 1
            java.lang.String r8 = "MASTERO CARD"
            r9 = 0
            r11 = 1
            r5.Azo(r6, r7, r8, r9, r10, r11)
            r5.setTextEntered(r0)
            return
        L_0x0083:
            java.lang.Object r6 = r14.A02
            goto L_0x0074
        L_0x0086:
            boolean r0 = r5.getToggleCheckBox()
            goto L_0x0070
        L_0x008b:
            java.lang.Object r0 = r14.A00
            X.3En r0 = (X.C62043En) r0
            java.lang.Object r5 = r14.A01
            android.app.Dialog r5 = (android.app.Dialog) r5
            java.lang.Object r4 = r14.A02
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            java.lang.Object r3 = r14.A03
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            X.3TX r2 = r0.A00
            java.lang.String r1 = "verification_complete_dialog"
            java.lang.String r0 = "click_verification_complete_dialog_continue"
            r2.A08(r1, r0)
            r5.dismiss()
            r4.run()
            r3.run()
            return
        L_0x00ae:
            java.lang.Object r0 = r14.A00
            X.1zC r0 = (X.C42671zC) r0
            java.lang.Object r4 = r14.A01
            X.141 r4 = (X.AnonymousClass141) r4
            java.lang.Object r3 = r14.A02
            X.34G r3 = (X.AnonymousClass34G) r3
            java.lang.Object r2 = r14.A03
            X.350 r2 = (X.AnonymousClass350) r2
            X.1wb r0 = r0.A07
            X.4R8 r1 = r0.A0K
            int r0 = r2.A00
            r1.Bap(r3, r4, r0)
            return
        L_0x00c8:
            java.lang.Object r5 = r14.A00
            com.whatsapp.mediaview.MediaViewFragment r5 = (com.whatsapp.mediaview.MediaViewFragment) r5
            java.lang.Object r4 = r14.A01
            X.2bU r4 = (X.AnonymousClass2bU) r4
            java.lang.Object r1 = r14.A02
            X.5NI r1 = (X.AnonymousClass5NI) r1
            java.lang.Object r3 = r14.A03
            X.3Qq r3 = (X.C65083Qq) r3
            boolean r0 = r4.A1h()
            if (r0 == 0) goto L_0x00f2
            r2 = 0
            r1.setPlayControlVisibility(r2)
            r3.A0D()
            X.1X4 r1 = r5.A0M
            X.14u r0 = X.C36431kI.A0U(r5)
            r1.A0G(r0, r4, r2)
            r3.A0C()
            return
        L_0x00f2:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "cannot retry download on message with null url, key="
            r1.append(r0)
            X.3Qa r0 = r4.A1J
            java.lang.String r0 = X.AnonymousClass000.A0o(r0, r1)
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0106:
            java.lang.Object r2 = r14.A00
            X.7jQ r2 = (X.C159477jQ) r2
            java.lang.Object r3 = r14.A01
            X.6wd r3 = (X.C147076wd) r3
            java.lang.Object r5 = r14.A02
            X.9nR r5 = (X.C203169nR) r5
            java.lang.Object r4 = r14.A03
            boolean r0 = r2.BCK()
            if (r0 != 0) goto L_0x012e
            X.17Y r0 = r3.A02
            if (r0 == 0) goto L_0x0129
            r6 = 44
            X.74x r1 = new X.74x
            r1.<init>((java.lang.Object) r2, (java.lang.Object) r3, (java.lang.Object) r4, (java.lang.Object) r5, (int) r6)
            r0.A0H(r1)
            return
        L_0x0129:
            java.lang.RuntimeException r0 = X.C36321k7.A06()
            throw r0
        L_0x012e:
            r5.A07()
            return
        L_0x0132:
            java.lang.Object r1 = r14.A00
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            java.lang.Object r5 = r14.A01
            X.2ml r5 = (X.C50862ml) r5
            java.lang.Object r4 = r14.A02
            com.whatsapp.jid.GroupJid r4 = (com.whatsapp.jid.GroupJid) r4
            java.lang.Object r3 = r14.A03
            r0 = 1
            X.AnonymousClass00C.A0D(r5, r0)
            X.147 r2 = X.C65533Sl.A01(r1)
            if (r2 == 0) goto L_0x0153
            X.0wU r1 = r5.getWaWorkers()
            r0 = 13
            X.C80403vL.A01(r1, r5, r3, r2, r0)
        L_0x0153:
            X.0xE r1 = r5.getCommunityNavigator()
            android.content.Context r0 = X.C36371kC.A0B(r5)
            r1.Bkx(r0, r5, r4)
            return
        L_0x015f:
            java.lang.Object r1 = r14.A00
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            java.lang.Object r5 = r14.A01
            X.2mn r5 = (X.C50882mn) r5
            java.lang.Object r4 = r14.A02
            X.3T1 r4 = (X.AnonymousClass3T1) r4
            java.lang.Object r3 = r14.A03
            com.whatsapp.jid.GroupJid r3 = (com.whatsapp.jid.GroupJid) r3
            r0 = 1
            X.AnonymousClass00C.A0D(r5, r0)
            X.147 r2 = X.C65533Sl.A01(r1)
            if (r2 == 0) goto L_0x0182
            X.0wU r1 = r5.getWaWorkers()
            r0 = 12
            X.C80403vL.A01(r1, r5, r4, r2, r0)
        L_0x0182:
            X.0wQ r1 = r5.getMeManager()
            X.11F r0 = r4.A0J()
            boolean r2 = r1.A0M(r0)
            X.0xE r1 = r5.getCommunityNavigator()
            android.content.Context r0 = X.C36371kC.A0B(r5)
            if (r2 == 0) goto L_0x019c
            r1.Bkx(r0, r5, r3)
            return
        L_0x019c:
            r1.Bkv(r0, r5, r3)
            return
        L_0x01a0:
            java.lang.Object r1 = r14.A00
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            java.lang.Object r5 = r14.A01
            X.2mk r5 = (X.C50852mk) r5
            java.lang.Object r4 = r14.A02
            com.whatsapp.jid.GroupJid r4 = (com.whatsapp.jid.GroupJid) r4
            java.lang.Object r3 = r14.A03
            r0 = 1
            X.AnonymousClass00C.A0D(r5, r0)
            X.147 r2 = X.C65533Sl.A01(r1)
            if (r2 == 0) goto L_0x01c1
            X.0wU r1 = r5.getWaWorkers()
            r0 = 11
            X.C80403vL.A01(r1, r5, r3, r2, r0)
        L_0x01c1:
            X.0xE r1 = r5.getCommunityNavigator()
            android.content.Context r0 = X.C36371kC.A0B(r5)
            r1.Bkv(r0, r5, r4)
            return
        L_0x01cd:
            java.lang.Object r3 = r14.A01
            X.4Uw r3 = (X.C89004Uw) r3
            java.lang.Object r1 = r14.A02
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            java.lang.Object r2 = r14.A03
            X.1RJ r2 = (X.AnonymousClass1RJ) r2
            boolean r0 = r3.BK6()
            if (r0 == 0) goto L_0x01ed
            boolean r1 = r3.Bvv(r1)
            android.view.View r0 = r2.A01()
            com.whatsapp.conversation.conversationrow.carousel.CarouselItemSelectionView r0 = (com.whatsapp.conversation.conversationrow.carousel.CarouselItemSelectionView) r0
            r0.setRowSelected(r1)
            return
        L_0x01ed:
            r3.Bur(r1)
            return
        L_0x01f1:
            java.lang.Object r0 = r14.A00
            X.3TU r0 = (X.AnonymousClass3TU) r0
            java.lang.Object r1 = r14.A01
            X.3Rh r1 = (X.C65243Rh) r1
            java.lang.Object r4 = r14.A02
            java.util.Set r4 = (java.util.Set) r4
            java.lang.Object r3 = r14.A03
            X.3T1 r3 = (X.AnonymousClass3T1) r3
            android.content.Context r0 = r0.A04
            android.app.Activity r2 = X.C24801Dv.A00(r0)
            X.14u r2 = (X.C225314u) r2
            java.lang.String r1 = r1.A03
            X.3Qa r0 = r3.A1J
            java.lang.String r0 = r0.A01
            com.whatsapp.SuspiciousLinkWarningDialogFragment r0 = X.C53152qr.A00(r1, r0, r4)
            r2.Btm(r0)
            return
        L_0x0217:
            java.lang.Object r3 = r14.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r14.A02
            X.1Dv r2 = (X.C24801Dv) r2
            java.lang.Object r1 = r14.A03
            X.00S r1 = (X.AnonymousClass00S) r1
            android.content.Intent r0 = X.AnonymousClass1NC.A00(r3)
            r2.A06(r3, r0)
            r1.invoke()
            return
        L_0x022e:
            java.lang.Object r5 = r14.A00
            X.3Tn r5 = (X.C65803Tn) r5
            java.lang.Object r6 = r14.A01
            X.2bi r6 = (X.C46812bi) r6
            java.lang.Object r4 = r14.A02
            X.3Ac r4 = (X.C60983Ac) r4
            java.lang.Object r3 = r14.A03
            X.14u r3 = (X.C225314u) r3
            boolean r0 = r6.A1g()
            if (r0 != 0) goto L_0x024c
            com.whatsapp.audiopicker.AudioPickerActivity r0 = r5.A0C
            X.1X7 r0 = r0.A0F
            r0.A03(r3)
            return
        L_0x024c:
            com.whatsapp.audiopicker.AudioPickerActivity r7 = r5.A0C
            X.1V6 r0 = r7.A0B
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x025d
            X.1V6 r1 = r7.A0B
            X.005 r0 = r7.A0H
            X.AnonymousClass3UR.A0A(r1, r0)
        L_0x025d:
            X.1V6 r0 = r7.A0B
            X.6zU r2 = r0.A00()
            if (r2 == 0) goto L_0x0280
            X.3Qa r8 = r6.A1J
            X.2bi r0 = r2.A0J
            X.3Qa r0 = r0.A1J
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0276
            r1 = 1
            r0 = 0
            r2.A0H(r1, r0)
        L_0x0276:
            X.2bi r0 = r2.A0J
            X.3Qa r0 = r0.A1J
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0291
        L_0x0280:
            X.3HF r1 = r7.A0A
            r0 = 0
            X.6zU r2 = r1.A01(r3, r0, r0)
            r2.A0J = r6
            X.1V6 r0 = r7.A0B
            r0.A08(r2)
            r5.A04(r3, r4)
        L_0x0291:
            r0 = 0
            r2.A0F(r0)
            return
        L_0x0296:
            com.whatsapp.ui.media.MediaCaptionTextView r0 = r9.A0F
            boolean r0 = r0.A05
            r7 = 1
            r2 = 0
            if (r0 == 0) goto L_0x02ca
            float r1 = r11.y
            android.view.View r0 = r9.A09
            int r0 = r0.getTop()
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x02ca
            com.whatsapp.ui.media.MediaCaptionTextView r0 = r9.A0F
            boolean r0 = r0.A0K()
            if (r0 != 0) goto L_0x03c5
            com.whatsapp.ui.media.MediaCaptionTextView r0 = r9.A0F
            r0.setExpanded(r7)
            r10.A0G()
        L_0x02bb:
            android.view.View r1 = r9.A0A
            com.whatsapp.ui.media.MediaCaptionTextView r0 = r9.A0F
            int r0 = r0.getVisibility()
            r1.setVisibility(r0)
        L_0x02c6:
            X.C47592fB.A03(r10)
            return
        L_0x02ca:
            com.whatsapp.ui.media.MediaCaptionTextView r0 = r9.A0F
            boolean r0 = r0.A0K()
            if (r0 != 0) goto L_0x03c5
            X.3LJ r6 = r10.A0D()
            float r3 = r11.x
            float r2 = r11.y
            boolean r0 = r6 instanceof X.C47522eu
            if (r0 == 0) goto L_0x02fb
            X.2eu r6 = (X.C47522eu) r6
            X.0yC r1 = r6.A0D
            com.whatsapp.mediaview.PhotoView r12 = r6.A0G
            X.2cZ r0 = r6.A0H
            com.whatsapp.InteractiveAnnotation r5 = X.AnonymousClass3LS.A00(r12, r1, r0, r3, r2)
            if (r5 == 0) goto L_0x0374
            android.content.Context r13 = r12.getContext()
            boolean r0 = r5.skipConfirmation
            if (r0 == 0) goto L_0x034a
            X.AnonymousClass00C.A0B(r13)
            X.C47522eu.A01(r13, r5, r6)
            goto L_0x02c6
        L_0x02fb:
            boolean r0 = r6 instanceof X.C47512et
            if (r0 == 0) goto L_0x0374
            X.2et r6 = (X.C47512et) r6
            X.0yC r1 = r6.A03
            com.whatsapp.mediaview.PhotoView r12 = r6.A05
            X.2bp r0 = r6.A06
            com.whatsapp.InteractiveAnnotation r5 = X.AnonymousClass3LS.A00(r12, r1, r0, r3, r2)
            if (r5 == 0) goto L_0x0374
            android.content.Context r13 = r12.getContext()
            boolean r0 = r5.skipConfirmation
            if (r0 == 0) goto L_0x031f
            X.AnonymousClass00C.A0B(r13)
            X.C47512et.A00(r13, r5, r6)
        L_0x031b:
            r6.A0D()
            goto L_0x02c6
        L_0x031f:
            X.AnonymousClass00C.A0B(r13)
            X.0ts r4 = r6.A03
            android.view.View r3 = r12.getRootView()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.AnonymousClass00C.A0E(r3, r0)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r1 = 27
            X.3YM r0 = new X.3YM
            r0.<init>(r6, r5, r13, r1)
            X.3ES r2 = new X.3ES
            r2.<init>(r13, r0, r3, r4)
            r1 = 2
            X.4Ym r0 = new X.4Ym
            r0.<init>(r6, r1)
            boolean r0 = r2.A00(r0, r5, r12)
            r6.A00 = r2
            if (r0 == 0) goto L_0x0374
            goto L_0x031b
        L_0x034a:
            X.AnonymousClass00C.A0B(r13)
            X.0ts r4 = r6.A03
            android.view.View r3 = r12.getRootView()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.AnonymousClass00C.A0E(r3, r0)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r1 = 28
            X.3YM r0 = new X.3YM
            r0.<init>(r6, r5, r13, r1)
            X.3ES r2 = new X.3ES
            r2.<init>(r13, r0, r3, r4)
            r1 = 3
            X.4Ym r0 = new X.4Ym
            r0.<init>(r6, r1)
            boolean r0 = r2.A00(r0, r5, r12)
            r6.A01 = r2
            if (r0 != 0) goto L_0x02c6
        L_0x0374:
            float r1 = r11.x
            android.view.View r0 = r9.A0C
            int r0 = r0.getWidth()
            int r0 = r0 / 6
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x03c1
            r4 = 9
            r8 = 5
        L_0x0386:
            X.3JQ r0 = r10.A0H
            if (r7 == 0) goto L_0x0397
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r0 = r0.A02
            boolean r0 = com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment.A0G(r0, r4, r8)
        L_0x0390:
            if (r0 != 0) goto L_0x02c6
        L_0x0392:
            r10.A0H()
            goto L_0x02c6
        L_0x0397:
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r3 = r0.A02
            java.util.List r0 = r3.A0n
            r2 = 0
            if (r0 == 0) goto L_0x0392
            int r1 = r3.A00
            r0 = 1
            if (r1 <= 0) goto L_0x03b0
            int r1 = r1 - r0
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment.A0E(r3, r1)
            X.3LC r0 = com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment.A05(r3)
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment.A0F(r3, r0, r4, r8)
            goto L_0x02c6
        L_0x03b0:
            X.01I r1 = r3.A0h()
            X.4Rq r1 = (X.C88164Rq) r1
            if (r1 == 0) goto L_0x0392
            java.lang.String r0 = r3.A1Z()
            boolean r0 = r1.BZP(r0, r4, r8, r2)
            goto L_0x0390
        L_0x03c1:
            r7 = 0
            r4 = 8
            goto L_0x0386
        L_0x03c5:
            com.whatsapp.ui.media.MediaCaptionTextView r0 = r9.A0F
            r0.setExpanded(r2)
            r10.A0H()
            goto L_0x02bb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3YT.onClick(android.view.View):void");
    }

    public AnonymousClass3YT(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
    }
}
