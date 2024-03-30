package X;

import android.os.Handler;
import com.whatsapp.status.StatusesFragment;

/* renamed from: X.3wa  reason: invalid class name and case insensitive filesystem */
public class C81173wa implements Runnable {
    public Object A00;
    public final int A01;

    public C81173wa(StatusesFragment statusesFragment, int i) {
        this.A01 = i;
        switch (i) {
            case 13:
            case 14:
            case 15:
                this.A00 = statusesFragment;
                return;
            default:
                this.A00 = statusesFragment;
                return;
        }
    }

    public static void A00(Handler handler, Object obj, int i) {
        handler.post(new C81173wa(obj, i));
    }

    public static void A01(C19770wU r1, Object obj, int i) {
        r1.Boy(new C81173wa(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02ae, code lost:
        r2.A06(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x02b1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x03c4, code lost:
        r4 = r4 - r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            int r0 = r12.A01
            switch(r0) {
                case 0: goto L_0x05a6;
                case 1: goto L_0x0589;
                case 2: goto L_0x056f;
                case 3: goto L_0x0561;
                case 4: goto L_0x0550;
                case 5: goto L_0x0543;
                case 6: goto L_0x0532;
                case 7: goto L_0x0513;
                case 8: goto L_0x04e9;
                case 9: goto L_0x0412;
                case 10: goto L_0x03fd;
                case 11: goto L_0x03f1;
                case 12: goto L_0x03a2;
                case 13: goto L_0x038f;
                case 14: goto L_0x0387;
                case 15: goto L_0x037d;
                case 16: goto L_0x0370;
                case 17: goto L_0x0355;
                case 18: goto L_0x034d;
                case 19: goto L_0x0317;
                case 20: goto L_0x0005;
                case 21: goto L_0x0005;
                case 22: goto L_0x0005;
                case 23: goto L_0x02fb;
                case 24: goto L_0x02ed;
                case 25: goto L_0x02e5;
                case 26: goto L_0x02d8;
                case 27: goto L_0x02d0;
                case 28: goto L_0x02be;
                case 29: goto L_0x02b2;
                case 30: goto L_0x0293;
                case 31: goto L_0x0276;
                case 32: goto L_0x0257;
                case 33: goto L_0x023e;
                case 34: goto L_0x01bf;
                case 35: goto L_0x01a3;
                case 36: goto L_0x0195;
                case 37: goto L_0x018d;
                case 38: goto L_0x016f;
                case 39: goto L_0x05de;
                case 40: goto L_0x0153;
                case 41: goto L_0x0149;
                case 42: goto L_0x0132;
                case 43: goto L_0x010d;
                case 44: goto L_0x00ba;
                case 45: goto L_0x00ae;
                case 46: goto L_0x009b;
                case 47: goto L_0x0093;
                case 48: goto L_0x0079;
                case 49: goto L_0x0060;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r12.A00
            com.whatsapp.status.audienceselector.StatusPrivacyActivity r4 = (com.whatsapp.status.audienceselector.StatusPrivacyActivity) r4
            java.lang.String r7 = "StatusPrivacyActivity/fetchFbUserFullName User error"
            X.1UM r0 = r4.A0I
            if (r0 == 0) goto L_0x0059
            X.1US r6 = X.AnonymousClass1US.STATUS_PRIVACY_ACTIVITY
            X.695 r0 = r0.A00(r6)
            r3 = 0
            if (r0 == 0) goto L_0x05d2
            r5 = 1
            X.6JV r8 = r4.A0J     // Catch:{ 5QT | 5QU | 5QV | 5QW | 5QZ | 5Qa -> 0x0045, 5QX -> 0x05cc, 5VM -> 0x0040 }
            if (r8 == 0) goto L_0x0039
            X.6bk r2 = r0.A00     // Catch:{ 5QT | 5QU | 5QV | 5QW | 5QZ | 5Qa -> 0x0045, 5QX -> 0x05cc, 5VM -> 0x0040 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 5QT | 5QU | 5QV | 5QW | 5QZ | 5Qa -> 0x0045, 5QX -> 0x05cc, 5VM -> 0x0040 }
            java.lang.String r0 = "FbProfileDataFetcher/fetchFbUserFullName called by "
            java.lang.String r1 = X.AnonymousClass000.A0l(r6, r0, r1)     // Catch:{ 5QT | 5QU | 5QV | 5QW | 5QZ | 5Qa -> 0x0045, 5QX -> 0x05cc, 5VM -> 0x0040 }
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)     // Catch:{ 5QT | 5QU | 5QV | 5QW | 5QZ | 5Qa -> 0x0045, 5QX -> 0x05cc, 5VM -> 0x0040 }
            X.7OM r1 = new X.7OM     // Catch:{ 5QT | 5QU | 5QV | 5QW | 5QZ | 5Qa -> 0x0045, 5QX -> 0x05cc, 5VM -> 0x0040 }
            r1.<init>(r2, r8)     // Catch:{ 5QT | 5QU | 5QV | 5QW | 5QZ | 5Qa -> 0x0045, 5QX -> 0x05cc, 5VM -> 0x0040 }
            r0 = 2
            java.lang.Object r3 = X.C131886Rd.A00(r1, r0)     // Catch:{ 5QT | 5QU | 5QV | 5QW | 5QZ | 5Qa -> 0x0045, 5QX -> 0x05cc, 5VM -> 0x0040 }
            goto L_0x05d2
        L_0x0039:
            java.lang.String r0 = "fbProfileDataFetcher"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)     // Catch:{ 5QT | 5QU | 5QV | 5QW | 5QZ | 5Qa -> 0x0045, 5QX -> 0x05cc, 5VM -> 0x0040 }
            throw r0     // Catch:{ 5QT | 5QU | 5QV | 5QW | 5QZ | 5Qa -> 0x0045, 5QX -> 0x05cc, 5VM -> 0x0040 }
        L_0x0040:
            r1 = move-exception
            java.lang.String r0 = "StatusPrivacyActivity/fetchFbUserFullName Unknown error"
            goto L_0x05cf
        L_0x0045:
            r0 = move-exception
            X.AnonymousClass1UT.A01(r7, r0)
            X.1UM r0 = r4.A0I
            if (r0 == 0) goto L_0x0052
            r0.A04(r6, r5)
            goto L_0x05d2
        L_0x0052:
            java.lang.String r0 = "fbAccountManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0059:
            java.lang.String r0 = "fbAccountManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0060:
            java.lang.Object r2 = r12.A00
            X.1XM r2 = (X.AnonymousClass1XM) r2
            r2.A07()
            monitor-enter(r2)
            java.util.List r0 = r2.A03     // Catch:{ all -> 0x0076 }
            r0.clear()     // Catch:{ all -> 0x0076 }
            X.1XK r1 = r2.A00     // Catch:{ all -> 0x0076 }
            java.util.List r0 = r2.A03     // Catch:{ all -> 0x0076 }
            r1.Blb(r0)     // Catch:{ all -> 0x0076 }
            monitor-exit(r2)     // Catch:{ all -> 0x0076 }
            return
        L_0x0076:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0076 }
            throw r0
        L_0x0079:
            java.lang.Object r0 = r12.A00
            X.5Ar r0 = (X.C104665Ar) r0
            X.1BB r0 = r0.A07
            java.util.Iterator r1 = X.C36361kB.A0s(r0)
        L_0x0083:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x05de
            java.lang.Object r0 = r1.next()
            X.6Fn r0 = (X.C129156Fn) r0
            r0.A01()
            goto L_0x0083
        L_0x0093:
            java.lang.Object r0 = r12.A00
            X.1XM r0 = (X.AnonymousClass1XM) r0
            r0.A07()
            return
        L_0x009b:
            java.lang.Object r0 = r12.A00
            com.whatsapp.status.posting.FirstStatusConfirmationDialogFragment r0 = (com.whatsapp.status.posting.FirstStatusConfirmationDialogFragment) r0
            X.6sT r0 = r0.A01
            if (r0 == 0) goto L_0x00a7
            r0.A01()
            return
        L_0x00a7:
            java.lang.String r0 = "syncdUpdateHelper"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00ae:
            java.lang.Object r1 = r12.A00
            X.3S6 r1 = (X.AnonymousClass3S6) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.AnonymousClass3S6.A01(r1)
            return
        L_0x00ba:
            java.lang.Object r0 = r12.A00
            X.2fB r0 = (X.C47592fB) r0
            X.1X7 r5 = r0.A0K
            android.view.View r0 = r0.A00
            X.C18740tg.A04(r0)
            android.app.Activity r0 = X.C36361kB.A06(r0)
            X.14u r4 = X.C36401kF.A0L(r0)
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            java.lang.String r1 = android.os.Environment.getExternalStorageState()
            java.lang.String r0 = "mounted"
            boolean r0 = r0.equals(r1)
            r3 = 1
            if (r0 != 0) goto L_0x00f7
            java.lang.String r0 = "mounted_ro"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00f7
            X.17Y r2 = r5.A00
            boolean r1 = X.C20060wx.A00()
            r0 = 2131891255(0x7f121437, float:1.9417225E38)
            if (r1 == 0) goto L_0x00f4
            r0 = 2131891254(0x7f121436, float:1.9417223E38)
        L_0x00f4:
            r2.A06(r0, r3)
        L_0x00f7:
            boolean r0 = X.AnonymousClass1X7.A00(r4, r5)
            if (r0 != 0) goto L_0x05de
            X.17Y r2 = r5.A00
            boolean r1 = X.C20060wx.A00()
            r0 = 2131889790(0x7f120e7e, float:1.9414254E38)
            if (r1 == 0) goto L_0x02ae
            r0 = 2131889789(0x7f120e7d, float:1.9414251E38)
            goto L_0x02ae
        L_0x010d:
            java.lang.Object r0 = r12.A00
            X.3G7 r0 = (X.AnonymousClass3G7) r0
            X.2fB r1 = r0.A01
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x05de
            r0 = 0
            r1.A06 = r0
            X.3JQ r3 = r1.A0H
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "StatusPlaybackBaseFragment/onPlaybackFinished "
            r1.append(r0)
            com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment r0 = r3.A01
            X.C36321k7.A1N(r0, r1)
            r2 = 4
            r1 = 6
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r0 = r3.A02
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment.A0G(r0, r2, r1)
            return
        L_0x0132:
            java.lang.Object r1 = r12.A00
            X.2fB r1 = (X.C47592fB) r1
            r0 = 0
            r1.A05 = r0
            X.3LJ r0 = r1.A0D()
            r0.A0E()
            X.14g r0 = r1.A0M
            r0.A01()
            X.C47592fB.A03(r1)
            return
        L_0x0149:
            java.lang.Object r2 = r12.A00
            X.2fB r2 = (X.C47592fB) r2
            r1 = 0
            r0 = 1
            X.C47592fB.A04(r2, r1, r0)
            return
        L_0x0153:
            java.lang.Object r1 = r12.A00
            X.3PF r1 = (X.AnonymousClass3PF) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x05de
            X.1w5 r0 = r1.A01
            if (r0 != 0) goto L_0x0168
            java.lang.RuntimeException r0 = X.C36331k8.A0Y()
            throw r0
        L_0x0168:
            r0.A06()
            X.AnonymousClass3PF.A00(r1)
            return
        L_0x016f:
            java.lang.Object r0 = r12.A00
            com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment r0 = (com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment) r0
            X.3BI r0 = r0.A04
            if (r0 == 0) goto L_0x05de
            com.whatsapp.status.playback.widget.AudioVolumeView r3 = r0.A0E
            if (r3 == 0) goto L_0x05de
            android.view.animation.AlphaAnimation r2 = X.C36371kC.A0L()
            r0 = 125(0x7d, double:6.2E-322)
            r2.setDuration(r0)
            r3.startAnimation(r2)
            r0 = 8
            r3.setVisibility(r0)
            return
        L_0x018d:
            java.lang.Object r0 = r12.A00
            X.1lu r0 = (X.C37161lu) r0
            X.C37161lu.A01(r0)
            return
        L_0x0195:
            java.lang.Object r1 = r12.A00
            X.1lu r1 = (X.C37161lu) r1
            X.C37161lu.A02(r1)
            r0 = 0
            r1.A04 = r0
            X.C37161lu.A03(r1)
            return
        L_0x01a3:
            java.lang.Object r1 = r12.A00
            X.1lu r1 = (X.C37161lu) r1
            X.6Tw r0 = r1.A03
            if (r0 == 0) goto L_0x01ae
            r0.A09()
        L_0x01ae:
            X.6Tw r0 = r1.A03
            if (r0 == 0) goto L_0x01b5
            r0.A06()
        L_0x01b5:
            r0 = 0
            r1.A03 = r0
            r1.quit()
            r1.interrupt()
            return
        L_0x01bf:
            java.lang.Object r4 = r12.A00
            X.1lu r4 = (X.C37161lu) r4
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            r0 = -16
            android.os.Process.setThreadPriority(r0)     // Catch:{ Exception -> 0x01cd }
            goto L_0x01d1
        L_0x01cd:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x01d1:
            java.lang.String r6 = "StatusPlaybackVoice/failed to prepare audio player"
            X.6Tw r0 = r4.A03
            if (r0 != 0) goto L_0x020d
            X.0wG r5 = r4.A08     // Catch:{ IOException -> 0x0207 }
            java.io.File r3 = r4.A0B     // Catch:{ IOException -> 0x0207 }
            r2 = 3
            X.0yC r1 = r4.A09     // Catch:{ IOException -> 0x0207 }
            X.005 r0 = r4.A0A     // Catch:{ IOException -> 0x0207 }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x0207 }
            X.6KH r0 = (X.AnonymousClass6KH) r0     // Catch:{ IOException -> 0x0207 }
            X.6Tw r0 = X.C132476Tw.A00(r5, r1, r0, r3, r2)     // Catch:{ IOException -> 0x0207 }
            r4.A03 = r0     // Catch:{ IOException -> 0x0207 }
            r3 = 1
            r0.A05()     // Catch:{ IllegalStateException -> 0x01fc, IOException -> 0x01f1 }
            goto L_0x020b
        L_0x01f1:
            r2 = move-exception
            X.0wN r1 = r4.A07     // Catch:{ IOException -> 0x0207 }
            java.lang.String r0 = r2.toString()     // Catch:{ IOException -> 0x0207 }
            r1.A0E(r6, r0, r3)     // Catch:{ IOException -> 0x0207 }
            goto L_0x0206
        L_0x01fc:
            r2 = move-exception
            X.0wN r1 = r4.A07     // Catch:{ IOException -> 0x0207 }
            java.lang.String r0 = r2.toString()     // Catch:{ IOException -> 0x0207 }
            r1.A0E(r6, r0, r3)     // Catch:{ IOException -> 0x0207 }
        L_0x0206:
            throw r2     // Catch:{ IOException -> 0x0207 }
        L_0x0207:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x020b:
            X.6Tw r0 = r4.A03
        L_0x020d:
            r3 = 0
            if (r0 == 0) goto L_0x0219
            r0.A08()     // Catch:{ IOException -> 0x0215 }
            r3 = 1
            goto L_0x0219
        L_0x0215:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x0219:
            android.os.Handler r2 = r4.A06
            r1 = 4
            X.3vD r0 = new X.3vD
            r0.<init>(r1, r4, r3)
            r2.post(r0)
            if (r3 != 0) goto L_0x05de
            X.6Tw r0 = r4.A03
            if (r0 == 0) goto L_0x022d
            r0.A09()
        L_0x022d:
            X.6Tw r0 = r4.A03
            if (r0 == 0) goto L_0x0234
            r0.A06()
        L_0x0234:
            r0 = 0
            r4.A03 = r0
            r4.quit()
            r4.interrupt()
            return
        L_0x023e:
            java.lang.Object r5 = r12.A00
            X.1lu r5 = (X.C37161lu) r5
            long r3 = r5.A01
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0250
            long r0 = android.os.SystemClock.elapsedRealtime()
            r5.A01 = r0
        L_0x0250:
            r0 = 1
            r5.A04 = r0
            X.C37161lu.A03(r5)
            return
        L_0x0257:
            java.lang.Object r5 = r12.A00
            X.1lu r5 = (X.C37161lu) r5
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x0262
            X.C37161lu.A02(r5)
        L_0x0262:
            r0 = 0
            r5.A00 = r0
            X.6Tw r1 = r5.A03
            if (r1 == 0) goto L_0x0280
            int r0 = X.C37161lu.A00(r5)     // Catch:{ IOException -> 0x0271 }
            r1.A0A(r0)     // Catch:{ IOException -> 0x0271 }
            goto L_0x0280
        L_0x0271:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            goto L_0x0280
        L_0x0276:
            java.lang.Object r5 = r12.A00
            X.1lu r5 = (X.C37161lu) r5
            r0 = 0
            r5.A05 = r0
            X.C37161lu.A03(r5)
        L_0x0280:
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x05de
            long r3 = r5.A01
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x05de
            long r0 = android.os.SystemClock.elapsedRealtime()
            r5.A01 = r0
            return
        L_0x0293:
            java.lang.Object r0 = r12.A00
            X.1lu r0 = (X.C37161lu) r0
            java.lang.ref.WeakReference r0 = r0.A0C
            java.lang.Object r1 = r0.get()
            X.2ew r1 = (X.C47542ew) r1
            if (r1 == 0) goto L_0x05de
            X.3S6 r0 = r1.A0A
            r0.A02(r1)
            r3 = 0
            r1.A02 = r3
            X.17Y r2 = r1.A01
            r0 = 2131889780(0x7f120e74, float:1.9414233E38)
        L_0x02ae:
            r2.A06(r0, r3)
            return
        L_0x02b2:
            java.lang.Object r1 = r12.A00
            X.1lu r1 = (X.C37161lu) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.C37161lu.A01(r1)
            return
        L_0x02be:
            java.lang.Object r1 = r12.A00
            X.1lu r1 = (X.C37161lu) r1
            r0 = 1
            r1.A05 = r0
            X.C37161lu.A03(r1)
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x05de
            X.C37161lu.A02(r1)
            return
        L_0x02d0:
            java.lang.Object r0 = r12.A00
            com.whatsapp.status.playback.StatusReplyActivity r0 = (com.whatsapp.status.playback.StatusReplyActivity) r0
            com.whatsapp.status.playback.StatusReplyActivity.A0I(r0)
            return
        L_0x02d8:
            java.lang.Object r1 = r12.A00
            com.whatsapp.status.playback.MyStatusesActivity r1 = (com.whatsapp.status.playback.MyStatusesActivity) r1
            X.1nO r0 = r1.A0X
            r0.notifyDataSetChanged()
            com.whatsapp.status.playback.MyStatusesActivity.A0x(r1)
            return
        L_0x02e5:
            java.lang.Object r1 = r12.A00
            com.whatsapp.status.playback.MyStatusesActivity r1 = (com.whatsapp.status.playback.MyStatusesActivity) r1
            r0 = 0
            r1.A0P = r0
            return
        L_0x02ed:
            java.lang.Object r1 = r12.A00
            X.14u r1 = (X.C225314u) r1
            r0 = 8
            com.whatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet r0 = com.whatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet.A03(r0)
            r1.Btm(r0)
            return
        L_0x02fb:
            java.lang.Object r0 = r12.A00
            com.whatsapp.status.playback.MessageReplyActivity r0 = (com.whatsapp.status.playback.MessageReplyActivity) r0
            X.1Hx r1 = r0.A0W
            X.11F r0 = r0.A0k
            com.whatsapp.jid.UserJid r2 = X.C36401kF.A0b(r0)
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = "status"
            java.lang.String r4 = "whatsapp"
            r1.A02(r2, r3, r4, r5, r7)
            return
        L_0x0317:
            java.lang.Object r1 = r12.A00
            com.whatsapp.status.audienceselector.StatusPrivacyActivity r1 = (com.whatsapp.status.audienceselector.StatusPrivacyActivity) r1
            r3 = 0
            X.16E r0 = r1.A0B
            if (r0 == 0) goto L_0x0346
            r2 = 0
            r0.A0F(r2, r3)
            X.6sT r0 = r1.A09
            if (r0 == 0) goto L_0x033f
            r0.A01()
            X.164 r1 = r1.A05
            if (r1 == 0) goto L_0x0338
            com.whatsapp.jobqueue.job.SendStatusPrivacyListJob r0 = new com.whatsapp.jobqueue.job.SendStatusPrivacyListJob
            r0.<init>(r2, r3)
            r1.A01(r0)
            return
        L_0x0338:
            java.lang.String r0 = "waJobManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x033f:
            java.lang.String r0 = "syncdUpdateHelper"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0346:
            java.lang.String r0 = "statusStore"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x034d:
            java.lang.Object r1 = r12.A00
            com.whatsapp.status.audienceselector.StatusPrivacyActivity r1 = (com.whatsapp.status.audienceselector.StatusPrivacyActivity) r1
            r0 = 0
            r1.A0C = r0
            return
        L_0x0355:
            java.lang.Object r4 = r12.A00
            com.whatsapp.status.advertise.CtwaStatusUpsellBottomSheetTriggerViewModel r4 = (com.whatsapp.status.advertise.CtwaStatusUpsellBottomSheetTriggerViewModel) r4
            X.1bg r0 = r4.A04
            java.lang.String r3 = "whatsapp_status_created"
            r2 = 11139(0x2b83, float:1.5609E-41)
            X.1bh r1 = r0.A00
            r0 = 0
            X.ATi r1 = r1.A00(r0, r3, r2)
            if (r1 == 0) goto L_0x05de
            r4.A00 = r1
            X.1Rs r0 = r4.A02
            r0.A0C(r1)
            return
        L_0x0370:
            java.lang.Object r1 = r12.A00
            com.whatsapp.status.StatusesFragment r1 = (com.whatsapp.status.StatusesFragment) r1
            X.1nZ r0 = r1.A0o
            r0.notifyDataSetChanged()
            com.whatsapp.status.StatusesFragment.A0C(r1)
            return
        L_0x037d:
            java.lang.Object r0 = r12.A00
            com.whatsapp.status.StatusesFragment r0 = (com.whatsapp.status.StatusesFragment) r0
            X.3Sn r0 = r0.A11
            r0.A02()
            return
        L_0x0387:
            java.lang.Object r1 = r12.A00
            com.whatsapp.status.StatusesFragment r1 = (com.whatsapp.status.StatusesFragment) r1
            r0 = 0
            r1.A0l = r0
            return
        L_0x038f:
            java.lang.Object r1 = r12.A00
            com.whatsapp.status.StatusesFragment r1 = (com.whatsapp.status.StatusesFragment) r1
            X.3P0 r0 = r1.A0x
            java.util.List r0 = r0.A02
            com.whatsapp.status.StatusesFragment.A0D(r1, r0)
            X.3P0 r0 = r1.A0x
            java.util.List r0 = r0.A01
            com.whatsapp.status.StatusesFragment.A0D(r1, r0)
            return
        L_0x03a2:
            java.lang.Object r8 = r12.A00
            com.whatsapp.status.StatusExpirationLifecycleOwner r8 = (com.whatsapp.status.StatusExpirationLifecycleOwner) r8
            X.16E r2 = r8.A02
            X.0wo r0 = r2.A01
            long r6 = X.C19970wo.A00(r0)
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r6 = r6 - r0
            X.12i r3 = r2.A04
            java.lang.String r0 = "earliest_status_time"
            r1 = 0
            long r4 = r3.A00(r0, r1)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x05de
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x03d6
            long r4 = r4 - r6
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x03d6
            if (r0 <= 0) goto L_0x05de
            X.17Y r3 = r8.A00
            java.lang.Runnable r2 = r8.A03
            r0 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 + r0
            r3.A0I(r2, r4)
            return
        L_0x03d6:
            X.1HT r3 = r8.A01
            java.util.concurrent.atomic.AtomicBoolean r2 = r3.A0I
            r1 = 0
            r0 = 1
            boolean r0 = r2.compareAndSet(r1, r0)
            if (r0 == 0) goto L_0x05de
            X.1C7 r2 = r3.A04
            r0 = 38
            X.1j6 r1 = new X.1j6
            r1.<init>(r3, r0)
            r0 = 41
            r2.A01(r1, r0)
            return
        L_0x03f1:
            java.lang.Object r1 = r12.A00
            com.whatsapp.status.StatusExpirationLifecycleOwner r1 = (com.whatsapp.status.StatusExpirationLifecycleOwner) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            r1.A00()
            return
        L_0x03fd:
            java.lang.Object r0 = r12.A00
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = (com.whatsapp.spamreport.ReportSpamDialogFragment) r0
            X.17Y r2 = r0.A01
            if (r2 == 0) goto L_0x040d
            r1 = 2131888336(0x7f1208d0, float:1.9411304E38)
            r0 = 1
            r2.A06(r1, r0)
            return
        L_0x040d:
            java.lang.RuntimeException r0 = X.C36321k7.A06()
            throw r0
        L_0x0412:
            java.lang.Object r10 = r12.A00
            com.whatsapp.shops.ShopsProductPreviewFragment r10 = (com.whatsapp.shops.ShopsProductPreviewFragment) r10
            androidx.constraintlayout.widget.ConstraintLayout r0 = r10.A00
            int r2 = r0.getWidth()
            androidx.constraintlayout.widget.ConstraintLayout r0 = r10.A00
            int r1 = r0.getHeight()
            android.content.Context r3 = r10.A0a()
            r0 = 1090519040(0x41000000, float:8.0)
            int r0 = X.C65103Qt.A01(r3, r0)
            java.util.LinkedList r9 = new java.util.LinkedList
            r9.<init>()
            r8 = 2
            int r0 = r0 * 2
            int r2 = r2 - r0
            r7 = 3
            int r2 = r2 / r7
            int r1 = r1 - r0
            int r6 = java.lang.Math.min(r2, r1)
            r5 = 0
            r2 = 0
        L_0x043e:
            android.view.View r1 = new android.view.View
            r1.<init>(r3)
            r0 = 2131233618(0x7f080b52, float:1.8083379E38)
            r1.setBackgroundResource(r0)
            int r0 = X.AnonymousClass04F.A00()
            r1.setId(r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r10.A00
            r0.addView(r1)
            r9.add(r1)
            int r2 = r2 + 1
            if (r2 >= r7) goto L_0x045d
            goto L_0x043e
        L_0x045d:
            java.lang.Object r0 = r9.get(r5)
            android.view.View r0 = (android.view.View) r0
            int r4 = r0.getId()
            X.0Yx r3 = new X.0Yx
            r3.<init>()
            X.0UV r0 = X.C07690Yx.A03(r3, r4)
            X.0X0 r0 = r0.A02
            r0.A0c = r6
            X.0UV r0 = X.C07690Yx.A03(r3, r4)
            X.0X0 r0 = r0.A02
            r0.A0a = r6
            r1 = 2131432742(0x7f0b1526, float:1.848725E38)
            r11 = 2131432742(0x7f0b1526, float:1.848725E38)
            r3.A08(r4, r7, r1, r7)
            r0 = 4
            r3.A08(r4, r0, r1, r0)
            r2 = 7
            r1 = 6
            if (r5 != 0) goto L_0x04b6
            r3.A08(r4, r1, r11, r1)
            r0 = 1
            java.lang.Object r0 = r9.get(r0)
            android.view.View r0 = (android.view.View) r0
            int r0 = r0.getId()
            r3.A08(r4, r2, r0, r1)
            r1 = 1
            X.0UV r0 = X.C07690Yx.A03(r3, r4)
            X.0X0 r0 = r0.A02
            r0.A0U = r1
        L_0x04a7:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r10.A00
            r3.A09(r0)
            int r5 = r5 + 1
            if (r5 < r7) goto L_0x045d
            com.facebook.shimmer.ShimmerFrameLayout r0 = r10.A01
            r0.A03()
            return
        L_0x04b6:
            if (r5 != r8) goto L_0x04ca
            r0 = 1
            java.lang.Object r0 = r9.get(r0)
            android.view.View r0 = (android.view.View) r0
            int r0 = r0.getId()
            r3.A08(r4, r1, r0, r2)
            r3.A08(r4, r2, r11, r2)
            goto L_0x04a7
        L_0x04ca:
            int r0 = r5 + -1
            java.lang.Object r0 = r9.get(r0)
            android.view.View r0 = (android.view.View) r0
            int r0 = r0.getId()
            r3.A08(r4, r1, r0, r2)
            int r0 = r5 + 1
            java.lang.Object r0 = r9.get(r0)
            android.view.View r0 = (android.view.View) r0
            int r0 = r0.getId()
            r3.A08(r4, r2, r0, r1)
            goto L_0x04a7
        L_0x04e9:
            java.lang.Object r2 = r12.A00
            X.1t2 r2 = (X.C39631t2) r2
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            X.16D r1 = r2.A02
            X.147 r0 = r2.A03
            X.141 r0 = r1.A08(r0)
            if (r0 == 0) goto L_0x050b
            X.00s r1 = r2.A00
            java.lang.String r0 = r0.A0J()
            r1.A0C(r0)
            X.0wU r1 = r2.A05
            r0 = 7
            A01(r1, r2, r0)
            return
        L_0x050b:
            X.1Rs r1 = r2.A04
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            r1.A0C(r0)
            return
        L_0x0513:
            java.lang.Object r2 = r12.A00
            X.1t2 r2 = (X.C39631t2) r2
            X.16D r1 = r2.A02
            X.147 r0 = r2.A03
            X.141 r0 = r1.A08(r0)
            if (r0 == 0) goto L_0x052d
            X.00s r1 = r2.A01
            boolean r0 = r0.A12
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0529:
            r1.A0C(r0)
            return
        L_0x052d:
            X.1Rs r1 = r2.A04
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            goto L_0x0529
        L_0x0532:
            java.lang.Object r3 = r12.A00
            com.whatsapp.shareinvitelink.ShareGroupInviteLinkActivity r3 = (com.whatsapp.shareinvitelink.ShareGroupInviteLinkActivity) r3
            X.1Dv r2 = r3.A01
            X.147 r1 = r3.A07
            r0 = 5
            android.content.Intent r0 = X.AnonymousClass190.A0e(r3, r1, r0)
            r2.A06(r3, r0)
            return
        L_0x0543:
            java.lang.Object r2 = r12.A00
            X.3ce r2 = (X.C68903ce) r2
            r1 = 0
            X.19J r0 = r2.A02
            r0.unregisterObserver(r2)
            r2.A00 = r1
            return
        L_0x0550:
            java.lang.Object r1 = r12.A00
            X.3ce r1 = (X.C68903ce) r1
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x05de
            X.19J r0 = r1.A02
            r0.registerObserver(r1)
            r0 = 1
            r1.A00 = r0
            return
        L_0x0561:
            java.lang.Object r1 = r12.A00
            com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsViewModel r1 = (com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsViewModel) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.11F r0 = r1.A00
            com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsViewModel.A01(r0, r1)
            return
        L_0x056f:
            java.lang.Object r0 = r12.A00
            com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment r0 = (com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment) r0
            X.1CR r3 = r0.A08
            if (r3 == 0) goto L_0x0582
            X.11F r2 = r0.A04
            X.C18740tg.A06(r2)
            r0 = 0
            r3.A0c(r2, r0)
            return
        L_0x0582:
            java.lang.String r0 = "chatSettingsStore"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0589:
            java.lang.Object r0 = r12.A00
            com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment r0 = (com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment) r0
            X.1dx r2 = r0.A05
            if (r2 == 0) goto L_0x059f
            X.11F r1 = r0.A04
            X.C18740tg.A06(r1)
            X.AnonymousClass00C.A08(r1)
            X.2oi r0 = X.C51992oi.CONTACT_INFO
            r2.A01(r1, r0)
            return
        L_0x059f:
            java.lang.String r0 = "userMuteActions"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x05a6:
            java.lang.Object r3 = r12.A00
            com.whatsapp.settings.notificationsandsounds.AdvancedNotificationSettingsFragment r3 = (com.whatsapp.settings.notificationsandsounds.AdvancedNotificationSettingsFragment) r3
            X.11F r1 = r3.A02
            if (r1 == 0) goto L_0x05de
            X.1CR r0 = r3.A1c()
            X.3LI r0 = X.C36361kB.A0d(r1, r0)
            r3.A03 = r0
            X.17Y r2 = r3.A00
            if (r2 == 0) goto L_0x05c7
            r1 = 49
            X.3wZ r0 = new X.3wZ
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.A0H(r0)
            return
        L_0x05c7:
            java.lang.RuntimeException r0 = X.C36321k7.A06()
            throw r0
        L_0x05cc:
            r1 = move-exception
            java.lang.String r0 = "StatusPrivacyActivity/fetchFbUserFullName Network error"
        L_0x05cf:
            X.AnonymousClass1UT.A01(r0, r1)
        L_0x05d2:
            X.17Y r2 = r4.A05
            r1 = 9
            X.3wd r0 = new X.3wd
            r0.<init>(r4, r3, r1)
            r2.Bp3(r0)
        L_0x05de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81173wa.run():void");
    }

    public C81173wa(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
