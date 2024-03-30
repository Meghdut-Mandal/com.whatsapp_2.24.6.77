package X;

import com.whatsapp.R;

/* renamed from: X.3wl  reason: invalid class name and case insensitive filesystem */
public class C81283wl implements Runnable {
    public int A00;
    public Object A01;
    public final int A02;

    public C81283wl(AnonymousClass3B4 r2) {
        this.A02 = 7;
        this.A01 = r2;
        this.A00 = 100;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:378:0x079e, code lost:
        if (r4.callState == com.whatsapp.voipcalling.CallState.CALLING) goto L_0x07a1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r18 = this;
            r4 = r18
            int r0 = r4.A02
            switch(r0) {
                case 0: goto L_0x070b;
                case 1: goto L_0x029e;
                case 2: goto L_0x0701;
                case 3: goto L_0x06f7;
                case 4: goto L_0x024d;
                case 5: goto L_0x0228;
                case 6: goto L_0x06ec;
                case 7: goto L_0x0201;
                case 8: goto L_0x0633;
                case 9: goto L_0x060a;
                case 10: goto L_0x05bc;
                case 11: goto L_0x05b0;
                case 12: goto L_0x05a7;
                case 13: goto L_0x01c2;
                case 14: goto L_0x059d;
                case 15: goto L_0x0591;
                case 16: goto L_0x055d;
                case 17: goto L_0x012c;
                case 18: goto L_0x04f4;
                case 19: goto L_0x011f;
                case 20: goto L_0x04ea;
                case 21: goto L_0x010d;
                case 22: goto L_0x04e0;
                case 23: goto L_0x00de;
                case 24: goto L_0x04cc;
                case 25: goto L_0x0099;
                case 26: goto L_0x048e;
                case 27: goto L_0x0482;
                case 28: goto L_0x0007;
                case 29: goto L_0x0007;
                case 30: goto L_0x0007;
                case 31: goto L_0x0444;
                case 32: goto L_0x0425;
                case 33: goto L_0x0086;
                case 34: goto L_0x0411;
                case 35: goto L_0x03e4;
                case 36: goto L_0x003e;
                case 37: goto L_0x03da;
                case 38: goto L_0x03c3;
                case 39: goto L_0x002c;
                case 40: goto L_0x03b7;
                case 41: goto L_0x03ab;
                case 42: goto L_0x0331;
                case 43: goto L_0x031e;
                case 44: goto L_0x0311;
                case 45: goto L_0x0303;
                case 46: goto L_0x0011;
                case 47: goto L_0x02f7;
                case 48: goto L_0x02b5;
                case 49: goto L_0x02ab;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r4.A01
            X.4QO r1 = (X.AnonymousClass4QO) r1
            int r0 = r4.A00
            r1.onError(r0)
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r3 = r4.A01
            com.whatsapp.mediaview.MediaViewFragment r3 = (com.whatsapp.mediaview.MediaViewFragment) r3
            int r2 = r4.A00
            X.4Up r0 = r3.A1C
            if (r0 == 0) goto L_0x0010
            X.2bU r1 = r0.BE2(r2)
            if (r1 == 0) goto L_0x0010
            X.4Up r0 = r3.A1C
            if (r0 == 0) goto L_0x0028
            r0.Bwc(r2)
        L_0x0028:
            com.whatsapp.mediaview.MediaViewFragment.A0P(r3, r1)
            return
        L_0x002c:
            java.lang.Object r0 = r4.A01
            X.3mZ r0 = (X.C75033mZ) r0
            int r2 = r4.A00
            X.4TJ r1 = r0.A01
            if (r1 == 0) goto L_0x0010
            X.6Da r0 = r0.A03
            com.whatsapp.jid.UserJid r0 = r0.A03
            r1.BXM(r0, r2)
            return
        L_0x003e:
            java.lang.Object r8 = r4.A01
            X.3Ka r8 = (X.C63433Ka) r8
            int r1 = r4.A00
            r0 = 400(0x190, float:5.6E-43)
            r3 = 3088(0xc10, float:4.327E-42)
            r7 = 0
            if (r1 == r0) goto L_0x0717
            r0 = 401(0x191, float:5.62E-43)
            if (r1 == r0) goto L_0x0717
            r0 = 404(0x194, float:5.66E-43)
            if (r1 == r0) goto L_0x0717
            r0 = 406(0x196, float:5.69E-43)
            if (r1 != r0) goto L_0x0010
            X.0yf r1 = r8.A04
            X.0yh r0 = X.C21100yf.A1v
            int r6 = r1.A04(r0)
            X.17Y r5 = r8.A03
            X.0ts r4 = r8.A06
            X.0yC r0 = r8.A08
            boolean r0 = r0.A0E(r3)
            r3 = 2131755354(0x7f10015a, float:1.9141585E38)
            if (r0 == 0) goto L_0x0071
            r3 = 2131755148(0x7f10008c, float:1.9141167E38)
        L_0x0071:
            long r1 = (long) r6
            java.lang.Object[] r0 = X.AnonymousClass001.A0L()
            X.AnonymousClass000.A1L(r0, r6, r7)
            java.lang.String r0 = r4.A0L(r0, r3, r1)
            r5.A0E(r0, r7)
            X.1C4 r0 = r8.A0A
            r0.A05(r7)
            return
        L_0x0086:
            java.lang.Object r2 = r4.A01
            com.whatsapp.gallery.MediaGalleryFragmentBase r2 = (com.whatsapp.gallery.MediaGalleryFragmentBase) r2
            int r1 = r4.A00
            X.4Uo r0 = r2.A0G
            if (r0 == 0) goto L_0x0010
            X.4V2 r0 = r0.BmQ(r1)
            if (r0 == 0) goto L_0x0010
            monitor-enter(r2)
            goto L_0x072b
        L_0x0099:
            java.lang.Object r0 = r4.A01
            X.1wC r0 = (X.C40841wC) r0
            int r5 = r4.A00
            X.1tO r4 = r0.A00
            X.00s r3 = r4.A01
            java.lang.Object r1 = r3.A04()
            X.3Ft r1 = (X.C62333Ft) r1
            if (r1 == 0) goto L_0x0010
            java.util.LinkedList r2 = r1.A00
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            int r0 = X.C36431kI.A07(r2)
            if (r5 > r0) goto L_0x0010
            boolean r0 = r1.A01()
            if (r0 == 0) goto L_0x00dc
            int r0 = X.C36431kI.A07(r2)
        L_0x00c1:
            if (r5 != r0) goto L_0x0742
            int r0 = r4.A00
            int r2 = r0 + 1
            X.1hi r1 = r4.A02
            int r0 = X.C36401kF.A00(r1)
            int r2 = r2 % r0
            r4.A00 = r2
            java.util.List r0 = X.C36401kF.A0w(r1)
            java.lang.Object r0 = r0.get(r2)
            r3.A0D(r0)
            return
        L_0x00dc:
            r0 = -1
            goto L_0x00c1
        L_0x00de:
            java.lang.Object r3 = r4.A01
            X.6W1 r3 = (X.AnonymousClass6W1) r3
            int r1 = r4.A00
            X.6Dh r2 = r3.A00
            if (r2 == 0) goto L_0x0010
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x0010
            if (r1 == 0) goto L_0x0010
            java.lang.String r0 = "onSearchTermChanged"
            X.2RF r1 = X.AnonymousClass6W1.A00(r3, r0)
            if (r1 == 0) goto L_0x0010
            java.lang.Integer r0 = X.C36381kD.A0n()
            r1.A02 = r0
            r0 = 16
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01 = r0
            X.0yW r0 = r3.A02
            r0.Bly(r1)
            r0 = 1
            r2.A01 = r0
            return
        L_0x010d:
            java.lang.Object r3 = r4.A01
            X.3pW r3 = (X.C76833pW) r3
            int r2 = r4.A00
            boolean r0 = r3.A03
            if (r0 == 0) goto L_0x0010
            X.3CL r1 = r3.A05
            X.39o r0 = r3.A00
            r1.A00(r0, r2)
            return
        L_0x011f:
            java.lang.Object r5 = r4.A01
            X.1wW r5 = (X.C41041wW) r5
            int r1 = r4.A00
            X.4Uo r3 = r5.A00
            if (r3 == 0) goto L_0x0010
            monitor-enter(r3)
            goto L_0x074c
        L_0x012c:
            java.lang.Object r6 = r4.A01
            X.6YM r6 = (X.AnonymousClass6YM) r6
            int r5 = r4.A00
            X.1aM r0 = r6.A2C
            com.whatsapp.voipcalling.CallInfo r4 = X.C34681hT.A03(r0)
            if (r4 == 0) goto L_0x0010
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/service/signal_thread/end_call/"
            r1.append(r0)
            int r0 = r6.A3R
            X.C36321k7.A1Y(r1, r0)
            r3 = 1
            if (r5 != r3) goto L_0x0776
            java.lang.Integer r0 = r6.A13
            if (r0 == 0) goto L_0x077d
            long r7 = r0.longValue()
            r1 = 10000(0x2710, double:4.9407E-320)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x077d
            boolean r0 = r4.isCaller
            if (r0 == 0) goto L_0x077d
            com.whatsapp.voipcalling.CallState r1 = r4.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 != r0) goto L_0x077d
            long r1 = r4.callDuration
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x077d
            long r7 = android.os.SystemClock.elapsedRealtime()
            long r0 = r6.A0T
            long r7 = r7 - r0
            r1 = 8000(0x1f40, double:3.9525E-320)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x077d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r6.A16 = r0
            android.content.Context r7 = r6.A22
            r5 = 2131895880(0x7f122648, float:1.9426605E38)
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r2 = 0
            com.whatsapp.jid.UserJid r1 = com.whatsapp.voipcalling.Voip.getPeerJid()
            if (r1 != 0) goto L_0x01b5
            java.lang.String r0 = "voip/getPeerDisplayNameShort/peer_jid_is_null call must have been finished"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 0
        L_0x0190:
            java.lang.String r2 = X.C36391kE.A0v(r7, r0, r4, r2, r5)
            X.0zA r0 = r6.A25
            boolean r0 = r0.A00
            java.lang.Boolean r8 = X.C36441kJ.A0x(r0)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)
            r9 = 0
            r12 = r9
            r11 = r9
            android.content.Intent r1 = X.AnonymousClass190.A0z(r7, r8, r9, r10, r11, r12)
            java.lang.String r0 = X.C114145gi.A06
            r1.setAction(r0)
            java.lang.String r0 = "confirmationString"
            r1.putExtra(r0, r2)
            r7.startActivity(r1)
            return
        L_0x01b5:
            X.16D r0 = r6.A2b
            X.141 r1 = r0.A0D(r1)
            X.171 r0 = r6.A2d
            java.lang.String r0 = X.C36381kD.A0v(r0, r1)
            goto L_0x0190
        L_0x01c2:
            java.lang.Object r5 = r4.A01
            X.6zT r5 = (X.C148816zT) r5
            int r6 = r4.A00
            int r2 = r5.A00
            if (r2 == r6) goto L_0x0010
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/audio_route/changeAudioRoute: change audioRoute "
            r1.append(r0)
            java.lang.String r0 = com.whatsapp.voipcalling.Voip.A05(r2)
            r1.append(r0)
            java.lang.String r0 = " -> "
            r1.append(r0)
            java.lang.String r0 = com.whatsapp.voipcalling.Voip.A05(r6)
            X.C36321k7.A1a(r1, r0)
            com.whatsapp.voipcalling.CallInfo r4 = com.whatsapp.voipcalling.Voip.getCallInfo()
            r3 = 3
            r2 = 1
            if (r6 == 0) goto L_0x07ab
            if (r6 == r2) goto L_0x07a7
            r0 = 2
            if (r6 == r0) goto L_0x07ab
            if (r6 == r3) goto L_0x07a3
            r0 = 4
            if (r6 == r0) goto L_0x07ab
            java.lang.String r1 = "UNKNOWN AudioRoute"
            r0 = 0
            X.C18740tg.A0D(r0, r1)
            return
        L_0x0201:
            java.lang.Object r8 = r4.A01
            X.3B4 r8 = (X.AnonymousClass3B4) r8
            boolean r0 = r8.A01
            if (r0 == 0) goto L_0x0010
            X.7ie r0 = r8.A05
            long r1 = r0.now()
            X.3Ef r0 = r8.A06
            java.util.List r10 = r8.A0A
            r0.A00(r10)
            X.3PT r9 = r8.A08
            r9.A02(r10, r1)
            java.util.List r7 = r8.A0B
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x08ec
            X.2xQ r6 = r8.A07
            monitor-enter(r6)
            goto L_0x07bf
        L_0x0228:
            java.lang.Object r0 = r4.A01
            X.9PG r0 = (X.AnonymousClass9PG) r0
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A00
            java.util.Iterator r3 = r0.iterator()
        L_0x0232:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0010
            r3.next()
            int r2 = r4.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Camera Lifecycle: onStartPreviewFailure error: "
            java.lang.String r1 = X.AnonymousClass000.A0r(r0, r1, r2)
            java.lang.String r0 = "Camera1Lifecycle"
            android.util.Log.d(r0, r1)
            goto L_0x0232
        L_0x024d:
            java.lang.Object r3 = r4.A01
            X.6lF r3 = (X.C140226lF) r3
            int r1 = r4.A00
            int r4 = r3.A04
            r0 = -1
            if (r1 == r0) goto L_0x0262
            int r0 = r1 + 45
            int r0 = r0 + 360
            int r0 = r0 / 90
            int r0 = r0 % 4
            int r4 = r0 * 90
        L_0x0262:
            r2 = 0
            X.88P r0 = r3.A08     // Catch:{ RuntimeException -> 0x028e }
            X.B3B r0 = r0.A00     // Catch:{ RuntimeException -> 0x028e }
            android.content.Context r1 = r0.getContext()     // Catch:{ RuntimeException -> 0x028e }
            java.lang.String r0 = "window"
            java.lang.Object r0 = r1.getSystemService(r0)     // Catch:{ RuntimeException -> 0x028e }
            android.view.WindowManager r0 = (android.view.WindowManager) r0     // Catch:{ RuntimeException -> 0x028e }
            if (r0 == 0) goto L_0x028e
            android.view.Display r0 = r0.getDefaultDisplay()     // Catch:{ RuntimeException -> 0x028e }
            int r1 = r0.getRotation()     // Catch:{ RuntimeException -> 0x028e }
            r0 = 1
            if (r1 == r0) goto L_0x028c
            r0 = 2
            if (r1 == r0) goto L_0x0289
            r0 = 3
            if (r1 != r0) goto L_0x028e
            r2 = 270(0x10e, float:3.78E-43)
            goto L_0x028e
        L_0x0289:
            r2 = 180(0xb4, float:2.52E-43)
            goto L_0x028e
        L_0x028c:
            r2 = 90
        L_0x028e:
            int r0 = r3.A04
            if (r0 != r4) goto L_0x0296
            int r0 = r3.A05
            if (r0 == r2) goto L_0x0010
        L_0x0296:
            r3.A04 = r4
            r3.A05 = r2
            X.C140226lF.A00(r3)
            return
        L_0x029e:
            java.lang.Object r2 = r4.A01
            X.6oL r2 = (X.C142106oL) r2
            int r1 = r4.A00
            r0 = -1
            if (r1 == r0) goto L_0x0010
            X.C142106oL.A00(r2, r1)
            return
        L_0x02ab:
            java.lang.Object r1 = r4.A01
            X.0CZ r1 = (X.AnonymousClass0CZ) r1
            int r0 = r4.A00
            r1.A07(r0)
            return
        L_0x02b5:
            java.lang.Object r5 = r4.A01
            X.6TQ r5 = (X.AnonymousClass6TQ) r5
            int r6 = r4.A00
            X.58t r4 = X.AnonymousClass6TQ.A00(r5, r6)
            X.6FO r0 = r5.A02
            X.005 r3 = r0.A01
            android.content.SharedPreferences r0 = X.C36391kE.A0H(r3)
            java.lang.String r2 = "/export/isDonor"
            r1 = 0
            boolean r0 = r0.getBoolean(r2, r1)
            if (r0 == 0) goto L_0x02d4
            r0 = 13
            if (r6 != r0) goto L_0x02e2
        L_0x02d4:
            android.content.SharedPreferences r0 = X.C36391kE.A0H(r3)
            boolean r0 = r0.getBoolean(r2, r1)
            if (r0 != 0) goto L_0x02f3
            r0 = 15
            if (r6 == r0) goto L_0x02f3
        L_0x02e2:
            monitor-enter(r5)
            X.14g r2 = r5.A04     // Catch:{ all -> 0x02ef }
            r0 = 0
            r2.A01 = r0     // Catch:{ all -> 0x02ef }
            r2.A00 = r0     // Catch:{ all -> 0x02ef }
            r2.A03()     // Catch:{ all -> 0x02ef }
            goto L_0x02f2
        L_0x02ef:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x02f2:
            monitor-exit(r5)
        L_0x02f3:
            X.AnonymousClass6TQ.A01(r4, r5)
            return
        L_0x02f7:
            java.lang.Object r0 = r4.A01
            com.whatsapp.migration.android.integration.service.GoogleMigrateService r0 = (com.whatsapp.migration.android.integration.service.GoogleMigrateService) r0
            int r1 = r4.A00
            X.6X5 r0 = r0.A02
            r0.A0E(r1)
            return
        L_0x0303:
            java.lang.Object r0 = r4.A01
            X.5Mx r0 = (X.C107195Mx) r0
            r2 = 2131894328(0x7f122038, float:1.9423458E38)
            r1 = 0
            X.17Y r0 = r0.A03
            r0.A06(r2, r1)
            return
        L_0x0311:
            java.lang.Object r0 = r4.A01
            X.5Mx r0 = (X.C107195Mx) r0
            int r2 = r4.A00
            r1 = 0
            X.17Y r0 = r0.A03
            r0.A04(r2, r1)
            return
        L_0x031e:
            java.lang.Object r0 = r4.A01
            X.4oK r0 = (X.C97054oK) r0
            int r4 = r4.A00
            X.4me r3 = r0.A05
            boolean[] r2 = r3.A02
            int r1 = r4 + -1
            r0 = 0
            r2[r1] = r0
            r3.A07(r4)
            return
        L_0x0331:
            java.lang.Object r7 = r4.A01
            X.4oK r7 = (X.C97054oK) r7
            int r9 = r4.A00
            X.4me r4 = r7.A05
            X.6WR r1 = r4.A09
            int r0 = r1.A01
            androidx.recyclerview.widget.RecyclerView r8 = r1.A0P
            X.0D3 r10 = r8.A0Q(r0)
            X.4oK r10 = (X.C97054oK) r10
            r2 = 100
            r6 = 1065353216(0x3f800000, float:1.0)
            r5 = 1
            if (r10 == 0) goto L_0x03a7
            com.whatsapp.components.SelectionCheckView r1 = r10.A04
            r0 = 0
            r1.A04(r0, r5)
            android.view.View r0 = r10.A00
            android.view.ViewPropertyAnimator r0 = r0.animate()
            android.view.ViewPropertyAnimator r0 = r0.scaleX(r6)
            android.view.ViewPropertyAnimator r0 = r0.scaleY(r6)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r2)
            r0.start()
        L_0x0367:
            java.util.List r0 = X.C129876Iu.A00
            int r1 = r0.size()
            if (r9 <= 0) goto L_0x039d
            int r0 = r1 / 2
            if (r9 >= r0) goto L_0x039d
            int r9 = r9 + -1
        L_0x0375:
            r8.A0i(r9)
            com.whatsapp.components.SelectionCheckView r0 = r7.A04
            r0.setScaleX(r6)
            r0.setScaleY(r6)
            r0.A04(r5, r5)
            android.view.View r0 = r7.A00
            android.view.ViewPropertyAnimator r1 = r0.animate()
            float r0 = r4.A05
            android.view.ViewPropertyAnimator r1 = r1.scaleX(r0)
            float r0 = r4.A04
            android.view.ViewPropertyAnimator r0 = r1.scaleY(r0)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r2)
            r0.start()
            return
        L_0x039d:
            int r0 = r1 / 2
            if (r9 <= r0) goto L_0x0375
            int r1 = r1 - r5
            if (r9 >= r1) goto L_0x0375
            int r9 = r9 + 1
            goto L_0x0375
        L_0x03a7:
            r4.A07(r0)
            goto L_0x0367
        L_0x03ab:
            java.lang.Object r2 = r4.A01
            com.whatsapp.mediacomposer.MediaComposerActivity r2 = (com.whatsapp.mediacomposer.MediaComposerActivity) r2
            int r1 = r4.A00
            X.1X7 r0 = r2.A1M
            r0.A02(r2, r1)
            return
        L_0x03b7:
            java.lang.Object r0 = r4.A01
            com.whatsapp.mediacomposer.MediaComposerActivity r0 = (com.whatsapp.mediacomposer.MediaComposerActivity) r0
            int r1 = r4.A00
            X.1X7 r0 = r0.A1M
            r0.A01(r1)
            return
        L_0x03c3:
            java.lang.Object r0 = r4.A01
            X.3pB r0 = (X.C76623pB) r0
            int r3 = r4.A00
            X.36w r2 = r0.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ChatSupportTicketManager/contactSupport/onError, errorCode="
            X.C36321k7.A1S(r0, r1, r3)
            X.4U7 r0 = r2.A00
            r0.BTS(r3)
            return
        L_0x03da:
            java.lang.Object r1 = r4.A01
            X.9j8 r1 = (X.C201239j8) r1
            int r0 = r4.A00
            X.C201239j8.A00(r1, r0)
            return
        L_0x03e4:
            java.lang.Object r5 = r4.A01
            com.whatsapp.group.GroupChatInfoActivity r5 = (com.whatsapp.group.GroupChatInfoActivity) r5
            int r2 = r4.A00
            X.147 r0 = r5.A1Z
            if (r0 != 0) goto L_0x03fa
            X.1LV r1 = r5.A0c
            X.147 r0 = r5.A3t()
            X.147 r0 = r1.A02(r0)
            r5.A1Z = r0
        L_0x03fa:
            X.17Y r1 = r5.A05
            X.01P r4 = X.AnonymousClass01P.RESUMED
            r0 = 34
            X.3wl r3 = new X.3wl
            r3.<init>((java.lang.Object) r5, (int) r2, (int) r0)
            android.os.Handler r2 = r1.A02
            r1 = 1
            X.1iV r0 = new X.1iV
            r0.<init>(r5, r4, r3, r1)
            r2.post(r0)
            return
        L_0x0411:
            java.lang.Object r0 = r4.A01
            com.whatsapp.group.GroupChatInfoActivity r0 = (com.whatsapp.group.GroupChatInfoActivity) r0
            int r5 = r4.A00
            com.whatsapp.group.view.custom.GroupDetailsCard r1 = r0.A1T
            boolean r6 = r0.A23
            X.141 r2 = r0.A0y
            com.whatsapp.group.GroupCallButtonController r3 = r0.A1B
            X.147 r4 = r0.A1Z
            r1.A05(r2, r3, r4, r5, r6)
            return
        L_0x0425:
            java.lang.Object r3 = r4.A01
            com.whatsapp.gallery.MediaGalleryFragmentBase r3 = (com.whatsapp.gallery.MediaGalleryFragmentBase) r3
            int r1 = r4.A00
            X.4Uo r0 = r3.A0G
            if (r0 == 0) goto L_0x043d
            X.4V2 r2 = r0.BmQ(r1)
        L_0x0433:
            X.17Y r1 = r3.A07
            if (r1 == 0) goto L_0x043f
            r0 = 41
            X.C81193wc.A00(r1, r3, r2, r0)
            return
        L_0x043d:
            r2 = 0
            goto L_0x0433
        L_0x043f:
            java.lang.RuntimeException r0 = X.C36321k7.A06()
            throw r0
        L_0x0444:
            java.lang.Object r3 = r4.A01
            com.whatsapp.dmsetting.ChangeDMSettingActivity r3 = (com.whatsapp.dmsetting.ChangeDMSettingActivity) r3
            int r7 = r4.A00
            r0 = -1
            if (r7 != r0) goto L_0x0453
            X.18x r0 = r3.A09
            int r7 = X.C36431kI.A05(r0)
        L_0x0453:
            X.3GX r4 = r3.A0A
            r6 = 1
            r5 = 0
            r8 = 0
            int r9 = r3.A00
            int r10 = r3.A01
            r4.A01(r5, r6, r7, r8, r9, r10)
            X.3OM r2 = new X.3OM
            r2.<init>(r3)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            r2.A0G = r1
            r2.A0L = r1
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
            r2.A0a = r0
            r2.A0E = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r2.A0P = r0
            android.content.Intent r0 = X.AnonymousClass3OM.A00(r2)
            r3.startActivityForResult(r0, r6)
            return
        L_0x0482:
            java.lang.Object r0 = r4.A01
            X.3pe r0 = (X.C76913pe) r0
            int r1 = r4.A00
            X.3E3 r0 = r0.A05
            r0.A00(r1)
            return
        L_0x048e:
            java.lang.Object r3 = r4.A01
            X.1uJ r3 = (X.C39941uJ) r3
            int r4 = r4.A00
            if (r4 == 0) goto L_0x04c3
            r0 = 1
            if (r4 == r0) goto L_0x04c3
            r0 = 2
            if (r4 == r0) goto L_0x04c3
            r0 = 3
            if (r4 != r0) goto L_0x04ab
            X.0v0 r0 = r3.A02
            android.content.SharedPreferences$Editor r2 = X.C19420v0.A00(r0)
            java.lang.String r1 = "push_to_video_first_time_watching_educational_nux_shown"
        L_0x04a7:
            r0 = 1
            X.C36331k8.A0w(r2, r1, r0)
        L_0x04ab:
            X.1hi r1 = r3.A03
            java.lang.Object r0 = X.C36401kF.A0m(r1)
            X.3QJ r0 = (X.AnonymousClass3QJ) r0
            boolean r6 = r0.A02
            boolean r7 = r0.A01
            boolean r8 = r0.A03
            r5 = 1
            X.3QJ r3 = new X.3QJ
            r3.<init>(r4, r5, r6, r7, r8)
            r1.A0D(r3)
            return
        L_0x04c3:
            X.0v0 r0 = r3.A02
            android.content.SharedPreferences$Editor r2 = X.C19420v0.A00(r0)
            java.lang.String r1 = "push_to_video_camera_entry_point_nux_shown"
            goto L_0x04a7
        L_0x04cc:
            java.lang.Object r5 = r4.A01
            X.3fk r5 = (X.C70803fk) r5
            int r3 = r4.A00
            r2 = 9
            X.3Nh r0 = r5.A5C
            r1 = 2
            X.C64263Nh.A00(r0, r1)
            X.28e r0 = r5.A2Q
            r0.A0C(r1, r3, r2)
            return
        L_0x04e0:
            java.lang.Object r1 = r4.A01
            com.whatsapp.companionmode.registration.CompanionBootstrapActivity r1 = (com.whatsapp.companionmode.registration.CompanionBootstrapActivity) r1
            int r0 = r4.A00
            com.whatsapp.companionmode.registration.CompanionBootstrapActivity.A01(r1, r0)
            return
        L_0x04ea:
            java.lang.Object r1 = r4.A01
            android.view.View r1 = (android.view.View) r1
            int r0 = r4.A00
            r1.setVisibility(r0)
            return
        L_0x04f4:
            java.lang.Object r2 = r4.A01
            X.6rs r2 = (X.C144246rs) r2
            int r5 = r4.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "cameraui/error "
            X.C36321k7.A1U(r0, r1, r5)
            X.6YT r4 = r2.A00
            X.1MK r2 = r4.A0d
            boolean r0 = r2.A03()
            if (r0 == 0) goto L_0x051c
            X.17Y r2 = r4.A0a
            r1 = 2131889279(0x7f120c7f, float:1.9413217E38)
            r0 = 1
            r2.A06(r1, r0)
        L_0x0516:
            X.7kJ r0 = r4.A12
            r0.BSr()
            return
        L_0x051c:
            r0 = 2
            if (r5 == r0) goto L_0x0516
            X.1Q4 r0 = r4.A0f
            X.0yE r1 = r0.A00
            java.lang.String r0 = "android.permission.CAMERA"
            int r0 = r1.A02(r0)
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            r3 = 1
            if (r0 != 0) goto L_0x053e
            java.lang.String r0 = "cameraui/no-camera-permission"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.17Y r2 = r4.A0a
            r1 = 2131887545(0x7f1205b9, float:1.94097E38)
        L_0x053a:
            r2.A06(r1, r3)
            goto L_0x0516
        L_0x053e:
            boolean r0 = r2.A00()
            if (r0 == 0) goto L_0x054a
            X.17Y r2 = r4.A0a
            r1 = 2131889338(0x7f120cba, float:1.9413337E38)
            goto L_0x053a
        L_0x054a:
            r0 = 3
            X.17Y r2 = r4.A0a
            if (r5 != r0) goto L_0x0553
            r1 = 2131893028(0x7f121b24, float:1.942082E38)
            goto L_0x053a
        L_0x0553:
            r0 = 4
            r1 = 2131887544(0x7f1205b8, float:1.9409698E38)
            if (r5 != r0) goto L_0x053a
            r1 = 2131895641(0x7f122559, float:1.942612E38)
            goto L_0x053a
        L_0x055d:
            java.lang.Object r5 = r4.A01
            X.6X3 r5 = (X.AnonymousClass6X3) r5
            int r3 = r4.A00
            r2 = 5
            if (r3 != r2) goto L_0x056d
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r5.A0G
            boolean r0 = r0.A0X
            if (r0 != 0) goto L_0x056d
            return
        L_0x056d:
            boolean r0 = r5.A06
            if (r0 != 0) goto L_0x0582
            r5.A01 = r3
            X.0Uc r1 = r5.A0F
            android.view.View r0 = r5.A0D
            r1.A03(r0, r3)
            boolean r0 = X.C36381kD.A1U(r3, r2)
            X.AnonymousClass6X3.A03(r5, r0)
            return
        L_0x0582:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "CallControlBottomSheetBehaviorController setBottomSheetState "
            X.C36321k7.A1T(r0, r1, r3)
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r5.A0G
            r0.A0W(r3)
            return
        L_0x0591:
            java.lang.Object r0 = r4.A01
            X.52X r0 = (X.AnonymousClass52X) r0
            int r1 = r4.A00
            com.whatsapp.WaImageView r0 = r0.A0K
            X.C53412rH.A00(r0, r1)
            return
        L_0x059d:
            java.lang.Object r1 = r4.A01
            androidx.recyclerview.widget.StaggeredGridLayoutManager r1 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r1
            int r0 = r4.A00
            r1.A1Y(r0)
            return
        L_0x05a7:
            java.lang.Object r0 = r4.A01
            com.whatsapp.backup.google.SettingsGoogleDrive r0 = (com.whatsapp.backup.google.SettingsGoogleDrive) r0
            int r1 = r4.A00
            X.1ei r0 = r0.A0X
            goto L_0x05b8
        L_0x05b0:
            java.lang.Object r0 = r4.A01
            X.4y9 r0 = (X.C101704y9) r0
            int r1 = r4.A00
            X.1ei r0 = r0.A0D
        L_0x05b8:
            r0.A0F(r1)
            return
        L_0x05bc:
            java.lang.Object r5 = r4.A01
            com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment r5 = (com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment) r5
            int r3 = r4.A00
            X.17Y r0 = r5.A04
            r0.A02()
            r2 = 405(0x195, float:5.68E-43)
            r0 = 2131895130(0x7f12235a, float:1.9425084E38)
            if (r3 != r2) goto L_0x05d1
            r0 = 2131895101(0x7f12233d, float:1.9425026E38)
        L_0x05d1:
            X.1qm r1 = X.AnonymousClass3LW.A04(r5)
            r1.A0c(r0)
            if (r3 != r2) goto L_0x05e0
            r0 = 2131895102(0x7f12233e, float:1.9425028E38)
            r1.A0d(r0)
        L_0x05e0:
            X.0FM r3 = r1.create()
            r2 = -1
            r0 = 2131893722(0x7f121dda, float:1.9422229E38)
            java.lang.String r1 = r5.A0n(r0)
            r0 = 15
            X.4XL r0 = X.AnonymousClass4XL.A00(r5, r0)
            r3.A04(r2, r1, r0)
            r2 = -2
            r0 = 2131896389(0x7f122845, float:1.9427638E38)
            java.lang.String r1 = r5.A0n(r0)
            r0 = 14
            X.4XL r0 = X.AnonymousClass4XL.A00(r5, r0)
            r3.A04(r2, r1, r0)
            r3.show()
            return
        L_0x060a:
            java.lang.Object r2 = r4.A01
            X.3mu r2 = (X.C75243mu) r2
            int r1 = r4.A00
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 == r0) goto L_0x0624
            switch(r1) {
                case 403: goto L_0x062a;
                case 404: goto L_0x061e;
                case 405: goto L_0x0618;
                default: goto L_0x0617;
            }
        L_0x0617:
            return
        L_0x0618:
            com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity r1 = r2.A01
            r0 = 2131894706(0x7f1221b2, float:1.9424224E38)
            goto L_0x062f
        L_0x061e:
            com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity r1 = r2.A01
            r0 = 2131894705(0x7f1221b1, float:1.9424222E38)
            goto L_0x062f
        L_0x0624:
            com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity r1 = r2.A01
            r0 = 2131894703(0x7f1221af, float:1.9424218E38)
            goto L_0x062f
        L_0x062a:
            com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity r1 = r2.A01
            r0 = 2131894704(0x7f1221b0, float:1.942422E38)
        L_0x062f:
            com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity.A07(r1, r0)
            return
        L_0x0633:
            java.lang.Object r5 = r4.A01
            X.39h r5 = (X.C607739h) r5
            int r6 = r4.A00
            java.util.ArrayList r1 = X.AnonymousClass001.A0I()
            X.16D r0 = r5.A01
            r0.A0n(r1)
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            java.util.Iterator r3 = r1.iterator()
        L_0x064a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x066b
            java.lang.Object r2 = r3.next()
            r1 = r2
            X.141 r1 = (X.AnonymousClass141) r1
            boolean r0 = r1.A0G()
            if (r0 != 0) goto L_0x064a
            X.11F r1 = r1.A0H
            boolean r0 = r1 instanceof X.C28981Uw
            if (r0 != 0) goto L_0x064a
            boolean r0 = r1 instanceof X.C177618e5
            if (r0 != 0) goto L_0x064a
            r7.add(r2)
            goto L_0x064a
        L_0x066b:
            int r4 = r7.size()
            java.util.List r0 = X.C007103b.A0a(r7, r6)
            r3 = 10
            java.util.ArrayList r2 = X.C36351kA.A0z(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x067d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x068b
            X.11F r0 = X.C36341k9.A0W(r1)
            r2.add(r0)
            goto L_0x067d
        L_0x068b:
            java.util.ArrayList r0 = X.C007103b.A0R(r2, r3, r3)
            java.util.Iterator r8 = r0.iterator()
        L_0x0693:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x06de
            java.lang.Object r0 = r8.next()
            java.util.List r0 = (java.util.List) r0
            X.1Nx r7 = r5.A04
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            java.util.Iterator r2 = r0.iterator()
        L_0x06a9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x06d3
            java.lang.Object r1 = r2.next()
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            boolean r0 = r1 instanceof X.C177618e5
            if (r0 != 0) goto L_0x06a9
            boolean r0 = r1 instanceof X.C177628e6
            if (r0 != 0) goto L_0x06a9
            boolean r0 = r1 instanceof X.C177638e7
            if (r0 != 0) goto L_0x06a9
            boolean r0 = r1 instanceof X.AnonymousClass146
            if (r0 != 0) goto L_0x06a9
            boolean r0 = r1 instanceof X.C28981Uw
            if (r0 != 0) goto L_0x06a9
            boolean r0 = X.AnonymousClass143.A0H(r1)
            if (r0 != 0) goto L_0x06a9
            r3.add(r1)
            goto L_0x06a9
        L_0x06d3:
            X.0wU r1 = r7.A02
            X.2if r0 = new X.2if
            r0.<init>(r7, r3)
            X.C36371kC.A1P(r0, r1)
            goto L_0x0693
        L_0x06de:
            X.17Y r3 = r5.A00
            r0 = 0
            X.3vG r2 = new X.3vG
            r2.<init>(r5, r4, r6, r0)
            r0 = 30000(0x7530, double:1.4822E-319)
            r3.A0I(r2, r0)
            return
        L_0x06ec:
            int r0 = r4.A00
            android.os.Process.setThreadPriority(r0)
            java.lang.Object r0 = r4.A01
            X.C36411kG.A1O(r0)
            return
        L_0x06f7:
            java.lang.Object r1 = r4.A01
            X.A14 r1 = (X.A14) r1
            int r0 = r4.A00
            r1.A00(r0)
            return
        L_0x0701:
            java.lang.Object r1 = r4.A01
            android.app.Activity r1 = (android.app.Activity) r1
            int r0 = r4.A00
            r1.setRequestedOrientation(r0)
            return
        L_0x070b:
            java.lang.Object r0 = r4.A01
            androidx.work.impl.foreground.SystemForegroundService r0 = (androidx.work.impl.foreground.SystemForegroundService) r0
            android.app.NotificationManager r1 = r0.A01
            int r0 = r4.A00
            r1.cancel(r0)
            return
        L_0x0717:
            X.17Y r2 = r8.A03
            X.0yC r0 = r8.A08
            boolean r1 = r0.A0E(r3)
            r0 = 2131890164(0x7f120ff4, float:1.9415012E38)
            if (r1 == 0) goto L_0x0727
            r0 = 2131890156(0x7f120fec, float:1.9414996E38)
        L_0x0727:
            r2.A06(r0, r7)
            return
        L_0x072b:
            X.17Y r1 = r2.A07     // Catch:{ all -> 0x073f }
            if (r1 == 0) goto L_0x073a
            r0 = 26
            X.3v5 r0 = X.C80243v5.A00(r2, r0)     // Catch:{ all -> 0x073f }
            r1.A0H(r0)     // Catch:{ all -> 0x073f }
            monitor-exit(r2)
            return
        L_0x073a:
            java.lang.RuntimeException r0 = X.C36321k7.A06()     // Catch:{ all -> 0x073f }
            throw r0     // Catch:{ all -> 0x073f }
        L_0x073f:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0742:
            X.1Rs r1 = r4.A03
            java.lang.Object r0 = r2.get(r5)
            r1.A0D(r0)
            return
        L_0x074c:
            X.4Uo r0 = r5.A00     // Catch:{ Exception -> 0x0760 }
            X.4V2 r0 = r0.BmQ(r1)     // Catch:{ Exception -> 0x0760 }
            if (r0 == 0) goto L_0x0771
            X.17Y r2 = r5.A02     // Catch:{ Exception -> 0x0760 }
            r1 = 7
            X.3wp r0 = new X.3wp     // Catch:{ Exception -> 0x0760 }
            r0.<init>((java.lang.Object) r5, (int) r1)     // Catch:{ Exception -> 0x0760 }
            r2.A0H(r0)     // Catch:{ Exception -> 0x0760 }
            goto L_0x0771
        L_0x0760:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0773 }
            java.lang.String r0 = "RecentMediaAdapter/refreshMediaElement/e"
            r1.append(r0)     // Catch:{ all -> 0x0773 }
            java.lang.String r0 = r2.getLocalizedMessage()     // Catch:{ all -> 0x0773 }
            X.C36321k7.A1Z(r1, r0)     // Catch:{ all -> 0x0773 }
        L_0x0771:
            monitor-exit(r3)     // Catch:{ all -> 0x0773 }
            return
        L_0x0773:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0773 }
            throw r0
        L_0x0776:
            r0 = 2
            if (r5 != r0) goto L_0x0796
            java.lang.Integer r0 = r6.A16
            r6.A14 = r0
        L_0x077d:
            int r1 = r4.callLinkState
            if (r1 == r3) goto L_0x07a1
            r0 = 2
            if (r1 == r0) goto L_0x07a1
            r0 = 3
            if (r1 == r0) goto L_0x07a1
            r0 = 32
            if (r5 != r0) goto L_0x0791
            com.whatsapp.voipcalling.CallState r1 = r4.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r1 == r0) goto L_0x07a1
        L_0x0791:
            r0 = 1
        L_0x0792:
            com.whatsapp.voipcalling.Voip.endCall(r0)
            return
        L_0x0796:
            r0 = 25
            if (r5 != r0) goto L_0x077d
            com.whatsapp.voipcalling.CallState r1 = r4.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CALLING
            if (r1 == r0) goto L_0x07a1
            goto L_0x077d
        L_0x07a1:
            r0 = 0
            goto L_0x0792
        L_0x07a3:
            r5.A0C(r4, r2)
            return
        L_0x07a7:
            r5.A0D(r4, r2)
            return
        L_0x07ab:
            int r1 = r5.A00
            r0 = 0
            if (r1 != r2) goto L_0x07b4
            r5.A0D(r4, r0)
            return
        L_0x07b4:
            if (r1 != r3) goto L_0x07ba
            r5.A0C(r4, r0)
            return
        L_0x07ba:
            r0 = 0
            r5.A0A(r4, r0)
            return
        L_0x07bf:
            java.util.Map r5 = r6.A00     // Catch:{ all -> 0x08e9 }
            java.util.Iterator r1 = X.AnonymousClass000.A10(r5)     // Catch:{ all -> 0x08e9 }
        L_0x07c5:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x08e9 }
            if (r0 == 0) goto L_0x07d5
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x08e9 }
            X.3PK r0 = (X.AnonymousClass3PK) r0     // Catch:{ all -> 0x08e9 }
            r7.add(r0)     // Catch:{ all -> 0x08e9 }
            goto L_0x07c5
        L_0x07d5:
            monitor-exit(r6)
            java.util.Iterator r17 = r7.iterator()
        L_0x07da:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x08d1
            java.lang.Object r4 = r17.next()
            X.3PK r4 = (X.AnonymousClass3PK) r4
            monitor-enter(r6)
            java.lang.Object r3 = r5.get(r4)     // Catch:{ all -> 0x08e9 }
            X.6Mp r3 = (X.C130836Mp) r3     // Catch:{ all -> 0x08e9 }
            if (r3 != 0) goto L_0x07f1
            X.6Mp r3 = X.C130836Mp.A03     // Catch:{ all -> 0x08e9 }
        L_0x07f1:
            monitor-exit(r6)
            java.util.Iterator r16 = r10.iterator()
        L_0x07f6:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x07da
            java.lang.Object r1 = r16.next()
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            android.graphics.Rect r2 = r8.A03
            android.graphics.Rect r11 = r8.A02
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            X.C36321k7.A0x(r11, r1)
            java.lang.ref.WeakReference r0 = r4.A00
            android.view.View r14 = X.AnonymousClass000.A0Y(r0)
            if (r14 == 0) goto L_0x07f6
            android.graphics.Point r0 = X.C56092vj.A00
            boolean r0 = r14.isShown()
            if (r0 != 0) goto L_0x0824
            r2.setEmpty()
            r11.setEmpty()
            goto L_0x07f6
        L_0x0824:
            android.graphics.Point r15 = X.C56092vj.A00
            boolean r0 = r14.getGlobalVisibleRect(r2, r15)
            if (r0 == 0) goto L_0x08c9
            boolean r0 = r2.intersect(r1)
            if (r0 == 0) goto L_0x08c9
            int r13 = r15.x
            int r12 = r15.y
            int r0 = r14.getWidth()
            int r1 = r13 + r0
            int r0 = r15.y
            int r0 = X.C36431kI.A04(r14, r0)
            r11.set(r13, r12, r1, r0)
            X.6Mp r12 = X.C130836Mp.A03
            if (r3 == r12) goto L_0x07f6
            java.util.Map r13 = r9.A03
            java.lang.String r14 = r3.A01
            java.lang.Object r1 = r13.get(r14)
            X.365 r1 = (X.AnonymousClass365) r1
            X.3NL r15 = r9.A02
            java.util.Set r0 = r15.A01
            boolean r0 = r0.add(r3)
            if (r0 == 0) goto L_0x086c
            java.util.Map r0 = r15.A00
            r0.remove(r14)
            if (r1 != 0) goto L_0x08c4
            X.365 r1 = new X.365
            r1.<init>()
            r13.put(r14, r1)
        L_0x086c:
            android.graphics.Rect r0 = r1.A01
            r0.set(r11)
            java.util.List r1 = r1.A02
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r2)
            r1.add(r0)
            X.6Mp r11 = r3.A00
            if (r11 == r12) goto L_0x07f6
            X.3NL r1 = r9.A01
            java.util.Set r0 = r1.A01
            boolean r0 = r0.add(r11)
            if (r0 == 0) goto L_0x08c2
            java.util.Map r1 = r1.A00
            java.lang.String r0 = r11.A01
            r1.remove(r0)
            r0 = 1
        L_0x0891:
            java.lang.String r12 = r11.A01
            java.lang.Object r11 = r13.get(r12)
            X.365 r11 = (X.AnonymousClass365) r11
            if (r0 == 0) goto L_0x08a6
            if (r11 == 0) goto L_0x08b2
            java.util.List r0 = r11.A02
            r0.clear()
            java.lang.Integer r0 = X.C023109s.A01
            r11.A00 = r0
        L_0x08a6:
            java.util.List r1 = r11.A02
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r2)
            r1.add(r0)
            goto L_0x07f6
        L_0x08b2:
            X.365 r11 = new X.365
            r11.<init>()
            android.graphics.Rect r1 = r11.A01
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.set(r0, r0, r0, r0)
            r13.put(r12, r11)
            goto L_0x08a6
        L_0x08c2:
            r0 = 0
            goto L_0x0891
        L_0x08c4:
            java.lang.Integer r0 = X.C023109s.A01
            r1.A00 = r0
            goto L_0x086c
        L_0x08c9:
            r11.setEmpty()
            r2.setEmpty()
            goto L_0x07f6
        L_0x08d1:
            r9.A01()
            X.3Bg r0 = r8.A00
            if (r0 == 0) goto L_0x08db
            r0.A00()
        L_0x08db:
            r7.clear()
            android.os.Handler r3 = r8.A04
            java.lang.Runnable r2 = r8.A09
            r0 = 100
            long r0 = (long) r0
            r3.postDelayed(r2, r0)
            return
        L_0x08e9:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x08ec:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81283wl.run():void");
    }

    public C81283wl(C107195Mx r2, int i, int i2) {
        this.A02 = i2;
        if (44 - i2 != 0) {
            this.A01 = r2;
            this.A00 = R.string.f12nameremoved;
            return;
        }
        this.A01 = r2;
        this.A00 = i;
    }

    public C81283wl(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }
}
