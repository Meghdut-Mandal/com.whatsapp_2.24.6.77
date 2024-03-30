package X;

/* renamed from: X.3vG  reason: invalid class name and case insensitive filesystem */
public class C80353vG implements Runnable {
    public int A00;
    public int A01;
    public Object A02;
    public final int A03;

    public C80353vG(Object obj, int i, int i2, int i3) {
        this.A03 = i3;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0195, code lost:
        if (r3 == 3) goto L_0x0197;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            int r0 = r9.A03
            switch(r0) {
                case 0: goto L_0x01aa;
                case 1: goto L_0x01f6;
                case 2: goto L_0x0202;
                case 3: goto L_0x0017;
                case 4: goto L_0x0052;
                case 5: goto L_0x0084;
                case 6: goto L_0x020e;
                case 7: goto L_0x00a2;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r9.A02
            com.whatsapp.waffle.wfac.ui.WfacBanBaseFragment r0 = (com.whatsapp.waffle.wfac.ui.WfacBanBaseFragment) r0
            int r3 = r9.A00
            int r2 = r9.A01
            X.3Fm r1 = r0.A1Z()
            java.lang.String r0 = "tos_link_opened"
            r1.A01(r0, r3, r2)
        L_0x0016:
            return
        L_0x0017:
            java.lang.Object r5 = r9.A02
            X.3Zj r5 = (X.C67323Zj) r5
            int r4 = r9.A00
            int r3 = r9.A01
            X.3fk r8 = r5.A05
            X.11F r7 = r8.A45
            X.0xf r6 = r8.A3o
            X.0yC r2 = r8.A3n
            X.4V6 r0 = r8.A2l
            X.16D r1 = r0.getContactManager()
            X.12O r0 = r8.A3Z
            boolean r0 = X.AnonymousClass3MX.A00(r1, r0, r2, r6, r7)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.A7a = r0
            r0 = 0
            r5.A00 = r0
            java.lang.Boolean r0 = r8.A7a
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0016
            X.17Y r2 = X.C70803fk.A09(r8)
            r1 = 2
            X.3vG r0 = new X.3vG
            r0.<init>(r5, r4, r3, r1)
            r2.A0H(r0)
            return
        L_0x0052:
            java.lang.Object r0 = r9.A02
            X.1lu r0 = (X.C37161lu) r0
            int r4 = r9.A00
            int r2 = r9.A01
            java.lang.ref.WeakReference r0 = r0.A0C
            java.lang.Object r3 = r0.get()
            X.2ew r3 = (X.C47542ew) r3
            if (r3 == 0) goto L_0x0016
            int r1 = r4 - r2
            r0 = 0
            int r7 = java.lang.Math.max(r0, r1)
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = (long) r7
            long r5 = r5.toSeconds(r0)
            int r1 = (int) r5
            boolean r0 = r3.A04
            if (r0 != 0) goto L_0x0276
            X.1oM r0 = r3.A09
            com.whatsapp.status.playback.widget.VoiceStatusContentView r0 = r0.A02
            if (r0 != 0) goto L_0x0273
            java.lang.String r0 = "voiceStatusContentView"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0084:
            java.lang.Object r3 = r9.A02
            android.widget.EditText r3 = (android.widget.EditText) r3
            int r2 = r9.A00
            int r1 = r9.A01
            java.lang.String[] r0 = com.whatsapp.mentions.MentionableEntry.A0P
            android.text.Editable r0 = r3.getText()
            if (r0 == 0) goto L_0x00a0
            int r0 = r0.length()
        L_0x0098:
            if (r2 > r0) goto L_0x0016
            if (r1 > r0) goto L_0x0016
            r3.setSelection(r2, r1)
            return
        L_0x00a0:
            r0 = 0
            goto L_0x0098
        L_0x00a2:
            java.lang.Object r4 = r9.A02
            X.61G r4 = (X.AnonymousClass61G) r4
            int r2 = r9.A00
            int r3 = r9.A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "InlineYoutubeVideoPlayer/YoutubeJsInterface/postPlayerEvent:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " data: "
            X.C36321k7.A1T(r0, r1, r3)
            if (r2 == 0) goto L_0x0129
            r5 = 1
            if (r2 == r5) goto L_0x02a7
            r0 = 2
            if (r2 == r0) goto L_0x00f3
            r0 = 3
            X.5NQ r4 = r4.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            if (r2 == r0) goto L_0x00e3
            java.lang.String r0 = "Invalid postPlayerEvent"
            java.lang.String r2 = X.AnonymousClass000.A0r(r0, r1, r3)
            if (r3 == 0) goto L_0x00d5
            r5 = 0
        L_0x00d5:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "player_error_"
        L_0x00db:
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r3)
            X.AnonymousClass5NQ.A01(r4, r2, r0, r5)
            return
        L_0x00e3:
            java.lang.String r0 = "Youtube player Error="
            java.lang.String r2 = X.AnonymousClass000.A0r(r0, r1, r3)
            if (r3 == 0) goto L_0x00ec
            r5 = 0
        L_0x00ec:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "youtube_error_"
            goto L_0x00db
        L_0x00f3:
            X.5NQ r6 = r4.A00
            int r0 = r3 * 1000
            long r7 = (long) r0
            boolean r0 = r6.A06
            if (r0 != 0) goto L_0x0016
            long r3 = r6.A04
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0016
            r6.A04 = r7
            android.webkit.WebView r1 = r6.A0B
            java.lang.String r0 = "javascript:(function() { loaded = true; })()"
            r1.loadUrl(r0)
            long r2 = r6.A04
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0016
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Invalid duration="
            java.lang.String r2 = X.C36381kD.A0z(r0, r1, r2)
            r1 = 0
            java.lang.String r0 = "invalid_duration"
            X.AnonymousClass5NQ.A01(r6, r2, r0, r1)
            return
        L_0x0129:
            X.5NQ r2 = r4.A00
            r0 = 3
            if (r3 <= r0) goto L_0x0186
            r0 = 5
            if (r3 != r0) goto L_0x0016
        L_0x0131:
            int r1 = r2.A02
            r0 = 2
            r5 = 1
            if (r1 == r0) goto L_0x0171
            if (r3 != r0) goto L_0x013c
            r2.A0A()
        L_0x013c:
            X.4SO r0 = r2.A08
            if (r0 == 0) goto L_0x0143
            r0.Bcs(r5, r3)
        L_0x0143:
            r2.A03 = r3
            int r1 = r2.A00
            if (r1 != r5) goto L_0x0164
            if (r3 == r5) goto L_0x0169
        L_0x014b:
            boolean r0 = r2.A06
            if (r0 != 0) goto L_0x0194
            if (r3 != r5) goto L_0x0194
            long r6 = r2.A04
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x019f
            java.lang.String r1 = "Video started playing before duration loaded."
            java.lang.String r0 = "playback_started_before_duration_loaded"
            X.AnonymousClass5NQ.A01(r2, r1, r0, r5)
            return
        L_0x0164:
            r0 = 2
            if (r1 != r0) goto L_0x014b
            if (r3 != r0) goto L_0x014b
        L_0x0169:
            r1 = 0
            r2.A00 = r1
            X.5NK r0 = r2.A0D
            r0.A0J = r1
            goto L_0x014b
        L_0x0171:
            if (r3 != r5) goto L_0x013c
            android.webkit.WebView r1 = r2.A0B
            java.lang.String r0 = "javascript:(function() { player.playVideo(); })()"
            r1.loadUrl(r0)
            r2.A02 = r5
            r2.A00 = r5
            X.5NK r0 = r2.A0D
            r0.A0F()
            r0.A0J = r5
            goto L_0x013c
        L_0x0186:
            if (r3 != 0) goto L_0x0131
            int r0 = r2.A03
            if (r0 == r3) goto L_0x0131
            X.4SL r0 = r2.A05
            if (r0 == 0) goto L_0x0131
            r0.BU7(r2)
            goto L_0x0131
        L_0x0194:
            r0 = 3
            if (r3 != r0) goto L_0x01a8
        L_0x0197:
            X.4SK r0 = r2.A04
            if (r0 == 0) goto L_0x0016
            r0.BSJ(r2, r5)
            return
        L_0x019f:
            r2.A06 = r5
            X.4SN r0 = r2.A07
            if (r0 == 0) goto L_0x01a8
            r0.BhC(r2)
        L_0x01a8:
            r5 = 0
            goto L_0x0197
        L_0x01aa:
            int r2 = r9.A00
            int r1 = r9.A01
            java.lang.Object r6 = r9.A02
            X.39h r6 = (X.C607739h) r6
            X.2QE r5 = new X.2QE
            r5.<init>()
            java.lang.String r0 = X.C36361kB.A0l()
            r5.A03 = r0
            java.lang.Long r0 = X.C36441kJ.A0y(r2)
            r5.A00 = r0
            java.lang.Long r0 = X.C36441kJ.A0y(r1)
            r5.A01 = r0
            X.1Nx r0 = r6.A04
            java.util.HashMap r0 = r0.A04
            java.util.Iterator r4 = X.C36391kE.A10(r0)
            r3 = 0
        L_0x01d2:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x01ea
            java.lang.Object r2 = r4.next()
            X.3A3 r2 = (X.AnonymousClass3A3) r2
            int r1 = r2.A02
            r0 = 1
            if (r1 != r0) goto L_0x01d2
            int r0 = r2.A01
            if (r0 == 0) goto L_0x01d2
            int r3 = r3 + 1
            goto L_0x01d2
        L_0x01ea:
            java.lang.Long r0 = X.C36441kJ.A0y(r3)
            r5.A02 = r0
            X.0yW r0 = r6.A03
            r0.Bly(r5)
            return
        L_0x01f6:
            java.lang.Object r2 = r9.A02
            X.70u r2 = (X.C1493370u) r2
            int r1 = r9.A00
            int r0 = r9.A01
            X.C1493370u.A07(r2, r1, r0)
            return
        L_0x0202:
            java.lang.Object r2 = r9.A02
            X.3Zj r2 = (X.C67323Zj) r2
            int r1 = r9.A00
            int r0 = r9.A01
            X.C67323Zj.A00(r2, r1, r0)
            return
        L_0x020e:
            java.lang.Object r6 = r9.A02
            X.3P4 r6 = (X.AnonymousClass3P4) r6
            int r0 = r9.A00
            int r8 = r9.A01
            monitor-enter(r6)
            X.2QW r7 = new X.2QW     // Catch:{ all -> 0x0270 }
            r7.<init>()     // Catch:{ all -> 0x0270 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0270 }
            r7.A00 = r0     // Catch:{ all -> 0x0270 }
            X.18g r1 = r6.A03     // Catch:{ all -> 0x0270 }
            int r0 = r1.A00()     // Catch:{ all -> 0x0270 }
            java.lang.Long r0 = X.C36441kJ.A0y(r0)     // Catch:{ all -> 0x0270 }
            r7.A03 = r0     // Catch:{ all -> 0x0270 }
            X.0wo r0 = r6.A01     // Catch:{ all -> 0x0270 }
            long r2 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x0270 }
            X.18d r0 = r1.A00     // Catch:{ all -> 0x0270 }
            android.content.SharedPreferences r1 = X.C233518d.A00(r0)     // Catch:{ all -> 0x0270 }
            java.lang.String r0 = "session_start_timestamp"
            long r0 = X.C36371kC.A08(r1, r0)     // Catch:{ all -> 0x0270 }
            long r2 = r2 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0270 }
            r7.A01 = r0     // Catch:{ all -> 0x0270 }
            X.0wU r5 = r6.A04     // Catch:{ all -> 0x0270 }
            X.00T r0 = r6.A05     // Catch:{ all -> 0x0270 }
            long r3 = X.C36351kA.A08(r0)     // Catch:{ all -> 0x0270 }
            java.lang.String r2 = "TimeSpentExternalEventLogger/logExternalEvent"
            r1 = 18
            X.3wm r0 = new X.3wm     // Catch:{ all -> 0x0270 }
            r0.<init>((java.lang.Object) r6, (int) r8, (int) r1)     // Catch:{ all -> 0x0270 }
            X.1jE r3 = r5.BpM(r0, r2, r3)     // Catch:{ all -> 0x0270 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0270 }
            X.37X r2 = new X.37X     // Catch:{ all -> 0x0270 }
            r2.<init>(r7, r3, r0)     // Catch:{ all -> 0x0270 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0270 }
            java.util.HashMap r0 = r6.A00     // Catch:{ all -> 0x0270 }
            r0.put(r1, r2)     // Catch:{ all -> 0x0270 }
            monitor-exit(r6)
            return
        L_0x0270:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0273:
            r0.setDuration(r1)
        L_0x0276:
            r0 = 50
            r1 = 1
            if (r7 > r0) goto L_0x028a
            boolean r0 = r3.A05
            if (r0 != 0) goto L_0x028a
            boolean r0 = r3.A06
            if (r0 != 0) goto L_0x028a
            X.3G7 r0 = r3.A05
            r0.A00()
            r3.A05 = r1
        L_0x028a:
            float r1 = (float) r2
            float r0 = (float) r4
            float r1 = r1 / r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r0
            r3.A00 = r1
            X.3rL r3 = r3.A0B
            X.00s r0 = r3.A02
            X.C36341k9.A16(r0, r4)
            int r0 = r2 / 150
            int r2 = r0 + -2
            r1 = -1
            X.00s r0 = r3.A03
            if (r2 >= r1) goto L_0x02a3
            r2 = -4
        L_0x02a3:
            X.C36341k9.A16(r0, r2)
            return
        L_0x02a7:
            X.5NQ r1 = r4.A00
            int r0 = r3 * 1000
            r1.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80353vG.run():void");
    }
}
