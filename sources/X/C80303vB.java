package X;

/* renamed from: X.3vB  reason: invalid class name and case insensitive filesystem */
public class C80303vB implements Runnable {
    public long A00;
    public Object A01;
    public final int A02;

    public C80303vB(Object obj, long j, int i) {
        this.A02 = i;
        this.A01 = obj;
        this.A00 = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x010c, code lost:
        r1.A0C(java.lang.Long.valueOf(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0113, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0164, code lost:
        r5.A0H(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0167, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01f9, code lost:
        r3.A15(r0);
        r3.A1h("business_activity_report_timestamp", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0201, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r14 = this;
            int r0 = r14.A02
            switch(r0) {
                case 0: goto L_0x02f7;
                case 1: goto L_0x0114;
                case 2: goto L_0x024e;
                case 3: goto L_0x0238;
                case 4: goto L_0x00f4;
                case 5: goto L_0x00db;
                case 6: goto L_0x00c2;
                case 7: goto L_0x0081;
                case 8: goto L_0x0068;
                case 9: goto L_0x0041;
                case 10: goto L_0x021f;
                case 11: goto L_0x0215;
                case 12: goto L_0x0130;
                case 13: goto L_0x0017;
                case 14: goto L_0x0202;
                case 15: goto L_0x01ec;
                case 16: goto L_0x01d3;
                case 17: goto L_0x01c6;
                case 18: goto L_0x0176;
                case 19: goto L_0x0168;
                case 20: goto L_0x002d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r14.A01
            X.6E3 r2 = (X.AnonymousClass6E3) r2
            long r0 = r14.A00
            r2.A00 = r0
            X.5n3 r0 = r2.A05
            if (r0 == 0) goto L_0x0016
            X.6WC r0 = r0.A00
            X.AnonymousClass6WC.A01(r0)
        L_0x0016:
            return
        L_0x0017:
            java.lang.Object r3 = r14.A01
            com.whatsapp.mediaview.MediaViewFragment r3 = (com.whatsapp.mediaview.MediaViewFragment) r3
            long r1 = r14.A00
            X.1A1 r0 = r3.A1e
            X.3T1 r1 = X.C36421kH.A0R(r0, r1)
            X.17Y r5 = r3.A0H
            r0 = 4
            X.74j r4 = new X.74j
            r4.<init>(r3, r1, r0)
            goto L_0x0164
        L_0x002d:
            java.lang.Object r0 = r14.A01
            X.1lt r0 = (X.C37151lt) r0
            long r1 = r14.A00
            java.lang.ref.WeakReference r0 = r0.A0E
            java.lang.Object r0 = r0.get()
            X.6zV r0 = (X.C148836zV) r0
            if (r0 == 0) goto L_0x0016
            r0.A05(r1)
            return
        L_0x0041:
            java.lang.Object r7 = r14.A01
            X.1uh r7 = (X.C40061uh) r7
            long r3 = r14.A00
            X.3T1 r6 = r7.A0S()
            X.1Rs r5 = r7.A16
            boolean r0 = X.C36351kA.A1W(r5)
            if (r0 == 0) goto L_0x0016
            X.3Qa r0 = r6.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0016
            X.0wo r0 = r7.A0g
            long r1 = X.AnonymousClass3T1.A05(r0, r6)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0328
            r0 = 0
            X.C36341k9.A18(r5, r0)
            return
        L_0x0068:
            java.lang.Object r3 = r14.A01
            X.3fk r3 = (X.C70803fk) r3
            long r1 = r14.A00
            X.1A1 r0 = r3.A52
            X.3T1 r1 = X.C36421kH.A0R(r0, r1)
            if (r1 == 0) goto L_0x0016
            X.17Y r5 = r3.A1U
            r0 = 38
            X.3v9 r4 = new X.3v9
            r4.<init>(r3, r1, r0)
            goto L_0x0164
        L_0x0081:
            java.lang.Object r1 = r14.A01
            X.3pW r1 = (X.C76833pW) r1
            long r10 = r14.A00
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0016
            X.3CL r6 = r1.A05
            X.2q9 r7 = r1.A01
            X.39o r8 = r1.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "CompanionDeviceQrHandler/onRetry retryTs="
            X.C36321k7.A1V(r0, r1, r10)
            X.3Sv r5 = r6.A00
            X.C65623Sv.A00(r5)
            X.1OH r0 = r5.A04
            X.0wo r0 = r0.A00
            long r0 = r0.A06()
            long r0 = X.C36391kE.A0B(r0)
            r3 = 86400(0x15180, double:4.26873E-319)
            long r3 = r3 + r0
            int r2 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x032c
            r5.A04()
            X.0wU r0 = r5.A0F
            r9 = 1
            X.73L r5 = new X.73L
            r5.<init>(r6, r7, r8, r9, r10)
            r0.Boy(r5)
            return
        L_0x00c2:
            java.lang.Object r2 = r14.A01
            X.2k7 r2 = (X.C50052k7) r2
            long r3 = r14.A00
            java.lang.ref.WeakReference r0 = r2.A0B
            java.lang.Object r1 = r0.get()
            X.1to r1 = (X.C39801to) r1
            if (r1 == 0) goto L_0x0016
            boolean r0 = X.C36431kI.A1Y(r2)
            if (r0 != 0) goto L_0x0016
            X.00s r1 = r1.A0E
            goto L_0x010c
        L_0x00db:
            java.lang.Object r2 = r14.A01
            X.2k7 r2 = (X.C50052k7) r2
            long r3 = r14.A00
            java.lang.ref.WeakReference r0 = r2.A0B
            java.lang.Object r1 = r0.get()
            X.1to r1 = (X.C39801to) r1
            if (r1 == 0) goto L_0x0016
            boolean r0 = X.C36431kI.A1Y(r2)
            if (r0 != 0) goto L_0x0016
            X.00s r1 = r1.A0D
            goto L_0x010c
        L_0x00f4:
            java.lang.Object r2 = r14.A01
            X.2k7 r2 = (X.C50052k7) r2
            long r3 = r14.A00
            java.lang.ref.WeakReference r0 = r2.A0B
            java.lang.Object r1 = r0.get()
            X.1to r1 = (X.C39801to) r1
            if (r1 == 0) goto L_0x0016
            boolean r0 = X.C36431kI.A1Y(r2)
            if (r0 != 0) goto L_0x0016
            X.00s r1 = r1.A0A
        L_0x010c:
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r1.A0C(r0)
            return
        L_0x0114:
            java.lang.Object r0 = r14.A01
            X.A2e r0 = (X.C20990A2e) r0
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A00
            java.util.Iterator r3 = r0.iterator()
        L_0x011e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0016
            java.lang.Object r2 = r3.next()
            X.7m6 r2 = (X.C161067m6) r2
            long r0 = r14.A00
            r2.Bg4(r0)
            goto L_0x011e
        L_0x0130:
            java.lang.Object r2 = r14.A01
            com.whatsapp.inappsupportbloks.components.BloksSupportVideoView r2 = (com.whatsapp.inappsupportbloks.components.BloksSupportVideoView) r2
            long r3 = r14.A00
            java.lang.String r1 = r2.A0D
            if (r1 != 0) goto L_0x0141
            java.lang.String r0 = "videoUrl"
            java.lang.RuntimeException r1 = X.C36331k8.A0d(r0)
            throw r1
        L_0x0141:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r9 = r0.toMicros(r3)
            r3 = 0
            r5 = 0
            r7 = -1
            X.3nQ r4 = new X.3nQ
            r4.<init>(r1)
            r12 = 1
            r6 = 0
            r8 = 0
            r11 = 0
            android.graphics.Bitmap r1 = X.C25541Gs.A00(r3, r4, r5, r6, r7, r8, r9, r11, r12)
            if (r1 == 0) goto L_0x0016
            X.17Y r5 = r2.getGlobalUI()
            r0 = 20
            X.3vA r4 = new X.3vA
            r4.<init>(r2, r1, r0)
        L_0x0164:
            r5.A0H(r4)
            return
        L_0x0168:
            java.lang.Object r2 = r14.A01
            X.5ts r2 = (X.C121885ts) r2
            long r0 = r14.A00
            monitor-enter(r2)
            r2.A00 = r0     // Catch:{ all -> 0x0173 }
            monitor-exit(r2)
            return
        L_0x0173:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0176:
            java.lang.Object r5 = r14.A01
            com.whatsapp.schedulecall.ScheduleCallBroadcastReceiver r5 = (com.whatsapp.schedulecall.ScheduleCallBroadcastReceiver) r5
            long r0 = r14.A00
            X.1Jh r2 = r5.A07
            X.12P r2 = r2.A04
            X.1M0 r4 = r2.A05()
            r7 = 1
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x01bc }
            r9.<init>(r7)     // Catch:{ all -> 0x01bc }
            java.lang.String r6 = "is_upcoming"
            r3 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x01bc }
            r9.put(r6, r2)     // Catch:{ all -> 0x01bc }
            X.14e r8 = r4.A02     // Catch:{ all -> 0x01bc }
            java.lang.String r10 = "scheduled_calls"
            java.lang.String r11 = "creation_message_row_id = ?"
            java.lang.String[] r13 = new java.lang.String[r7]     // Catch:{ all -> 0x01bc }
            X.C36351kA.A1V(r13, r3, r0)     // Catch:{ all -> 0x01bc }
            java.lang.String r12 = "ScheduledCallsStore/UPDATE_IS_UPCOMING_SCHEDULED_CALL_BY_ROW_ID"
            int r2 = r8.A01(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x01bc }
            if (r2 != 0) goto L_0x01ac
            java.lang.String r2 = "ScheduledCallsStore/updateScheduledCallIsUpcomingToFalse (by row ID) failed to update"
            com.whatsapp.util.Log.w((java.lang.String) r2)     // Catch:{ all -> 0x01bc }
        L_0x01ac:
            r4.close()
            X.17Y r4 = r5.A01
            r3 = 17
            X.3vB r2 = new X.3vB
            r2.<init>(r5, r0, r3)
            r4.A0H(r2)
            return
        L_0x01bc:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x01c1 }
            throw r1
        L_0x01c1:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x01c6:
            java.lang.Object r0 = r14.A01
            com.whatsapp.schedulecall.ScheduleCallBroadcastReceiver r0 = (com.whatsapp.schedulecall.ScheduleCallBroadcastReceiver) r0
            long r2 = r14.A00
            X.1bA r1 = r0.A09
            r0 = 1
            r1.A00(r2, r0)
            return
        L_0x01d3:
            java.lang.Object r0 = r14.A01
            X.3pU r0 = (X.C76813pU) r0
            long r1 = r14.A00
            X.32r r0 = r0.A00
            com.whatsapp.report.BusinessActivityReportViewModel r4 = r0.A00
            X.00s r3 = r4.A01
            r0 = 0
            X.C36341k9.A16(r3, r0)
            X.00s r3 = r4.A02
            r0 = 1
            X.C36341k9.A16(r3, r0)
            X.0v0 r3 = r4.A04
            goto L_0x01f9
        L_0x01ec:
            java.lang.Object r0 = r14.A01
            X.3pT r0 = (X.C76803pT) r0
            long r1 = r14.A00
            X.32s r0 = r0.A00
            com.whatsapp.report.BusinessActivityReportViewModel r0 = r0.A00
            X.0v0 r3 = r0.A04
            r0 = 1
        L_0x01f9:
            r3.A15(r0)
            java.lang.String r0 = "business_activity_report_timestamp"
            r3.A1h(r0, r1)
            return
        L_0x0202:
            java.lang.Object r5 = r14.A01
            com.whatsapp.migration.export.ui.ExportMigrationActivity r5 = (com.whatsapp.migration.export.ui.ExportMigrationActivity) r5
            long r3 = r14.A00
            X.68x r2 = r5.A0G
            java.lang.String r1 = r5.A0J
            r0 = 9
            r2.A00(r1, r0)
            com.whatsapp.migration.export.ui.ExportMigrationActivity.A07(r5, r3)
            return
        L_0x0215:
            java.lang.Object r2 = r14.A01
            com.whatsapp.inappsupportbloks.components.BloksSupportVideoView r2 = (com.whatsapp.inappsupportbloks.components.BloksSupportVideoView) r2
            long r0 = r14.A00
            com.whatsapp.inappsupportbloks.components.BloksSupportVideoView.A01(r2, r0)
            return
        L_0x021f:
            java.lang.Object r0 = r14.A01
            X.1uh r0 = (X.C40061uh) r0
            long r3 = r14.A00
            X.1SL r1 = r0.A0u
            X.11F r2 = r0.A0t
            X.1Uw r2 = (X.C28981Uw) r2
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            r5 = 9223372036854675806(0x7ffffffffffe795e, double:NaN)
            r1.A04(r2, r3, r5)
            return
        L_0x0238:
            java.lang.Object r3 = r14.A01
            X.9Ts r3 = (X.C195309Ts) r3
            long r1 = r14.A00
            monitor-enter(r3)
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()     // Catch:{ all -> 0x024b }
            r0.gc()     // Catch:{ all -> 0x024b }
            r3.A01(r1)     // Catch:{ all -> 0x024b }
            monitor-exit(r3)     // Catch:{ all -> 0x024b }
            return
        L_0x024b:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x024b }
            throw r1
        L_0x024e:
            java.lang.Object r5 = r14.A01
            com.whatsapp.calling.callgrid.view.VoipInCallNotifBanner r5 = (com.whatsapp.calling.callgrid.view.VoipInCallNotifBanner) r5
            long r2 = r14.A00
            boolean r0 = r5.isAttachedToWindow()
            if (r0 != 0) goto L_0x0260
            java.lang.String r0 = "VoipInCallNotifBanner/animateIn view is not attached yet"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0260:
            r6 = 0
            r5.setVisibility(r6)
            int r0 = r5.A01
            if (r0 == 0) goto L_0x026c
            int r0 = r5.A00
            if (r0 != 0) goto L_0x0297
        L_0x026c:
            android.view.ViewParent r0 = r5.getParent()
            android.view.View r0 = (android.view.View) r0
            int r4 = r0.getWidth()
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131166771(0x7f070633, float:1.7947797E38)
            int r0 = X.C36441kJ.A05(r1, r0)
            int r0 = r0 * 2
            int r4 = r4 - r0
            r0 = 1073741824(0x40000000, float:2.0)
            X.C36411kG.A1B(r5, r4, r0)
            int r0 = r5.getMeasuredWidth()
            int r0 = r0 / 2
            r5.A00 = r0
            int r0 = r5.getMeasuredHeight()
            r5.A01 = r0
        L_0x0297:
            android.animation.AnimatorSet r4 = X.C36441kJ.A0C()
            r0 = 600(0x258, double:2.964E-321)
            r4.setDuration(r0)
            X.4aP r0 = new X.4aP
            r0.<init>(r5, r2)
            r4.addListener(r0)
            r1 = 1073741824(0x40000000, float:2.0)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>(r1)
            r4.setInterpolator(r0)
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            int r9 = r5.A00
            int r8 = r5.A01
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131165600(0x7f0701a0, float:1.7945422E38)
            float r7 = r1.getDimension(r0)
            int r0 = r5.A00
            float r2 = (float) r0
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131165599(0x7f07019f, float:1.794542E38)
            float r0 = r1.getDimension(r0)
            float r2 = r2 + r0
            android.animation.Animator r0 = android.view.ViewAnimationUtils.createCircularReveal(r5, r9, r8, r7, r2)
            r3.add(r0)
            r0 = 2
            float[] r2 = new float[r0]
            int r0 = r5.A02
            float r0 = (float) r0
            r2[r6] = r0
            r1 = 1
            r0 = 0
            r2[r1] = r0
            java.lang.String r0 = "translationY"
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r5, r0, r2)
            r3.add(r0)
            r4.playTogether(r3)
            r4.start()
            return
        L_0x02f7:
            java.lang.Object r6 = r14.A01
            X.9eF r6 = (X.C198819eF) r6
            java.io.File r0 = X.C198819eF.A03
            java.lang.Object r5 = r6.A01
            monitor-enter(r5)
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0325 }
            r0 = 23
            if (r1 < r0) goto L_0x030c
            r0 = 100
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0319 }
            goto L_0x0320
        L_0x030c:
            java.io.File r0 = X.C198819eF.A03     // Catch:{ all -> 0x0325 }
            long r3 = r0.lastModified()     // Catch:{ all -> 0x0325 }
            long r1 = r14.A00     // Catch:{ all -> 0x0325 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0320
            goto L_0x030c
        L_0x0319:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0325 }
            r0.interrupt()     // Catch:{ all -> 0x0325 }
        L_0x0320:
            r6.A00()     // Catch:{ all -> 0x0325 }
            monitor-exit(r5)     // Catch:{ all -> 0x0325 }
            return
        L_0x0325:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0325 }
            throw r1
        L_0x0328:
            X.C40061uh.A0C(r7, r6)
            return
        L_0x032c:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "CompanionDeviceAdvUtil/isRetryTimestampValid retryTs="
            r3.append(r2)
            r3.append(r10)
            java.lang.String r2 = "; ntpTs="
            X.C36341k9.A1M(r2, r3, r0)
            java.lang.String r0 = "CompanionDeviceQrHandler/onRetry invalid local ts"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.4Uk r0 = r5.A0D
            r0.BZH()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80303vB.run():void");
    }
}
