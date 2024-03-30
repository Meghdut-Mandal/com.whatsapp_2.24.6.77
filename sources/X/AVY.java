package X;

public class AVY implements Runnable {
    public Object A00;
    public final int A01;

    public AVY(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(C19770wU r1, Object obj, int i) {
        r1.Boy(new AVY(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v36, resolved type: X.8hw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v40, resolved type: X.2i0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v42, resolved type: X.8hw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v43, resolved type: X.8hw} */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03ed, code lost:
        r1.A0G = r0;
        r2.A08.A0D(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03f4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x010e, code lost:
        r6 = new X.AVb(r3, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0604, code lost:
        r1.A07 = java.lang.Integer.valueOf(r0);
        r1.A08 = r2;
        X.C173858Tk.A0r(r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x060f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0664, code lost:
        ((android.app.Activity) r0).finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0669, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0683, code lost:
        r1.A3v();
        r1.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0689, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x015f, code lost:
        r7.A0H(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0162, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x016b, code lost:
        r0.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x016e, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r23 = this;
            r1 = r23
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x06df;
                case 1: goto L_0x016f;
                case 2: goto L_0x06bf;
                case 3: goto L_0x069c;
                case 4: goto L_0x0163;
                case 5: goto L_0x068a;
                case 6: goto L_0x00d4;
                case 7: goto L_0x066a;
                case 8: goto L_0x0662;
                case 9: goto L_0x0617;
                case 10: goto L_0x0617;
                case 11: goto L_0x0610;
                case 12: goto L_0x05f8;
                case 13: goto L_0x05f8;
                case 14: goto L_0x05eb;
                case 15: goto L_0x0662;
                case 16: goto L_0x00ab;
                case 17: goto L_0x05e3;
                case 18: goto L_0x059a;
                case 19: goto L_0x0591;
                case 20: goto L_0x055b;
                case 21: goto L_0x04f5;
                case 22: goto L_0x04bb;
                case 23: goto L_0x067a;
                case 24: goto L_0x04b3;
                case 25: goto L_0x0092;
                case 26: goto L_0x0062;
                case 27: goto L_0x04a0;
                case 28: goto L_0x048d;
                case 29: goto L_0x0114;
                case 30: goto L_0x0039;
                case 31: goto L_0x002f;
                case 32: goto L_0x0471;
                case 33: goto L_0x0464;
                case 34: goto L_0x045c;
                case 35: goto L_0x0454;
                case 36: goto L_0x0007;
                case 37: goto L_0x0007;
                case 38: goto L_0x0441;
                case 39: goto L_0x0417;
                case 40: goto L_0x03fd;
                case 41: goto L_0x03f5;
                case 42: goto L_0x03e0;
                case 43: goto L_0x03cc;
                case 44: goto L_0x03be;
                case 45: goto L_0x0353;
                case 46: goto L_0x02c4;
                case 47: goto L_0x020c;
                case 48: goto L_0x01b6;
                case 49: goto L_0x01a2;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A00
            X.6ww r0 = (X.C147266ww) r0
            X.4vw r2 = r0.A00
            com.facebook.shimmer.ShimmerFrameLayout r0 = r2.A06
            r1 = 8
            r0.setVisibility(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r2.A05
            r0.setVisibility(r1)
            android.widget.TextView r1 = r2.A03
            r0 = 2131890827(0x7f12128b, float:1.9416357E38)
            r1.setText(r0)
            androidx.constraintlayout.widget.ConstraintLayout r1 = r2.A04
            r0 = 0
            r1.setVisibility(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r2.A09
            r0 = 49
            X.C36421kH.A13(r1, r2, r0)
        L_0x002e:
            return
        L_0x002f:
            java.lang.Object r0 = r1.A00
            X.AGg r0 = (X.C21302AGg) r0
            com.whatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2 r0 = r0.A05
            com.whatsapp.WaButtonWithLoader r0 = r0.A0B
            goto L_0x016b
        L_0x0039:
            java.lang.Object r2 = r1.A00
            X.8i1 r2 = (X.C178868i1) r2
            X.1YK r1 = r2.A02
            X.9un r0 = r2.A04
            java.lang.String r0 = r0.A0A
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1.A03(r0)
            X.1EU r0 = r2.A09
            X.16S r1 = X.C165617ti.A0O(r0)
            X.9un r0 = r2.A04
            java.lang.String r0 = r0.A0A
            X.9un r1 = r1.A07(r0)
            X.17Y r7 = r2.A00
            r0 = 0
            X.72v r6 = new X.72v
            r6.<init>(r2, r1, r0)
            goto L_0x015f
        L_0x0062:
            java.lang.Object r5 = r1.A00
            X.2i0 r5 = (X.C48762i0) r5
            java.lang.Object r4 = r5.A00
            X.8hM r4 = (X.C178788hM) r4
            X.8i4 r0 = r4.A04
            X.1EU r0 = r0.A09
            java.util.ArrayList r0 = X.C165577te.A0o(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x0076:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0090
            X.9un r2 = X.C165607th.A0S(r3)
            int r1 = r2.A03
            r0 = 2
            if (r1 != r0) goto L_0x0076
        L_0x0085:
            X.17Y r7 = r4.A0A
            r0 = 49
            X.AVb r6 = new X.AVb
            r6.<init>(r5, r2, r0)
            goto L_0x015f
        L_0x0090:
            r2 = 0
            goto L_0x0085
        L_0x0092:
            java.lang.Object r3 = r1.A00
            X.2i0 r3 = (X.C48762i0) r3
            java.lang.Object r2 = r3.A00
            X.8hM r2 = (X.C178788hM) r2
            X.8i4 r0 = r2.A04
            X.1EU r0 = r0.A09
            X.16S r0 = X.C165617ti.A0O(r0)
            X.9un r1 = r0.A06()
            X.17Y r7 = r2.A0A
            r0 = 48
            goto L_0x010e
        L_0x00ab:
            java.lang.Object r1 = r1.A00
            com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity r1 = (com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity) r1
            X.1EU r0 = r1.A0P
            java.util.ArrayList r0 = X.C165577te.A0o(r0)
            X.9un r0 = X.AnonymousClass16S.A02(r0)
            if (r0 != 0) goto L_0x00cb
            java.lang.String r0 = "no valid account found, finishing"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.17Y r7 = r1.A05
            r0 = 15
        L_0x00c4:
            X.AVY r6 = new X.AVY
            r6.<init>(r1, r0)
            goto L_0x015f
        L_0x00cb:
            X.8az r0 = (X.C175748az) r0
            r1.A01 = r0
            X.17Y r7 = r1.A05
            r0 = 17
            goto L_0x00c4
        L_0x00d4:
            java.lang.Object r3 = r1.A00
            X.8hw r3 = (X.C178848hw) r3
            java.lang.String r4 = r3.A0o
            X.C18740tg.A06(r4)
            X.1Dc r2 = r3.A0g
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "onPayRequestFromNonWa; request is paid; transaction id: "
            r1.append(r0)
            X.C165567td.A18(r2, r4, r1)
            X.1Ed r4 = r3.A07
            java.lang.String r5 = r3.A0o
            X.0wo r0 = r3.A07
            long r8 = X.C19970wo.A00(r0)
            X.0wo r0 = r3.A07
            long r10 = X.C19970wo.A00(r0)
            r6 = 1
            r7 = 401(0x191, float:5.62E-43)
            r4.A0Y(r5, r6, r7, r8, r10)
            X.1Ed r2 = r3.A07
            java.lang.String r1 = r3.A0o
            r0 = 0
            X.9lY r1 = X.C165587tf.A0R(r2, r0, r1)
            X.17Y r7 = r3.A05
            r0 = 40
        L_0x010e:
            X.AVb r6 = new X.AVb
            r6.<init>(r3, r1, r0)
            goto L_0x015f
        L_0x0114:
            java.lang.Object r5 = r1.A00
            com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity r5 = (com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity) r5
            X.1A1 r1 = r5.A0P
            if (r1 == 0) goto L_0x0782
            X.AGg r0 = r5.A3j()
            X.3Qa r0 = r0.A07
            X.3T1 r4 = r1.A03(r0)
            X.2bZ r4 = (X.AnonymousClass2bZ) r4
            if (r4 == 0) goto L_0x002e
            X.9uk r0 = r4.A00
            if (r0 == 0) goto L_0x002e
            X.9ui r0 = r0.A01
            if (r0 == 0) goto L_0x002e
            java.lang.String r3 = r0.A06
            if (r3 == 0) goto L_0x002e
            X.1Db r0 = r5.A0A
            if (r0 == 0) goto L_0x077b
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C90494aF.A0E(r0)
            java.lang.String r0 = "has_p2mlite_transactions"
            X.C36331k8.A0w(r1, r0, r2)
            X.9UZ r0 = r5.A3k()
            X.1Ed r0 = r0.A01
            X.9lY r0 = r0.A0K(r3)
            if (r0 == 0) goto L_0x0156
            boolean r0 = r0.A0L()
            if (r0 != 0) goto L_0x002e
        L_0x0156:
            X.17Y r7 = r5.A05
            r0 = 10
            X.74m r6 = new X.74m
            r6.<init>(r5, r4, r3, r0)
        L_0x015f:
            r7.A0H(r6)
            return
        L_0x0163:
            java.lang.Object r0 = r1.A00
            com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment r0 = (com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment) r0
            com.whatsapp.WaButtonWithLoader r0 = r0.A01
            if (r0 == 0) goto L_0x002e
        L_0x016b:
            r0.A01()
            return
        L_0x016f:
            java.lang.Object r6 = r1.A00
            com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity r6 = (com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity) r6
            boolean r0 = r6.A0W
            if (r0 != 0) goto L_0x002e
            X.1Dc r1 = r6.A0g
            java.lang.String r0 = "IndiaUpiDeviceBindActivity: device binding canceled"
            r1.A06(r0)
            X.AF7 r5 = r6.A0S
            r4 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r0 = 117(0x75, float:1.64E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1 = 0
            java.lang.String r0 = "device_binding"
            r5.BOm(r3, r2, r0, r1)
            r6.A0W = r4
            X.9ek r0 = r6.A0D
            r0.A01 = r1
            X.AE0 r1 = r6.A0M
            X.9lR r0 = r6.A0L
            X.C173858Tk.A0s(r0, r1, r6)
            r0 = 0
            r6.A0m = r0
            return
        L_0x01a2:
            java.lang.Object r2 = r1.A00
            X.7yZ r2 = (X.C167687yZ) r2
            X.17Y r0 = r2.A0B
            r0.A02()
            X.1DR r1 = r2.A0F
            X.9lY r0 = r2.A07
            r1.A00(r0)
            X.C167687yZ.A02(r2)
            return
        L_0x01b6:
            java.lang.Object r9 = r1.A00
            com.whatsapp.payments.ui.viewmodel.IndiaUpiMandateHistoryViewModel r9 = (com.whatsapp.payments.ui.viewmodel.IndiaUpiMandateHistoryViewModel) r9
            X.1Ed r5 = r9.A04
            r4 = 3
            r8 = 2
            java.lang.Integer[] r7 = new java.lang.Integer[r8]
            r0 = 20
            boolean r3 = X.C36361kB.A1b(r7, r0)
            r0 = 401(0x191, float:5.62E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6 = 1
            r7[r6] = r0
            java.lang.Integer[] r1 = new java.lang.Integer[r6]
            r0 = 40
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1[r3] = r2
            java.util.List r10 = r5.A0U(r7, r1, r4)
            java.lang.Integer[] r1 = new java.lang.Integer[r8]
            r0 = 417(0x1a1, float:5.84E-43)
            X.AnonymousClass000.A1L(r1, r0, r3)
            r0 = 418(0x1a2, float:5.86E-43)
            X.AnonymousClass000.A1L(r1, r0, r6)
            java.lang.Integer[] r0 = new java.lang.Integer[r6]
            r0[r3] = r2
            java.util.List r11 = r5.A0U(r1, r0, r4)
            java.lang.Integer[] r1 = new java.lang.Integer[r6]
            r0 = 415(0x19f, float:5.82E-43)
            X.AnonymousClass000.A1L(r1, r0, r3)
            java.lang.Integer[] r0 = new java.lang.Integer[r6]
            r0[r3] = r2
            java.util.List r12 = r5.A0U(r1, r0, r4)
            X.17Y r0 = r9.A03
            r13 = 7
            X.73N r8 = new X.73N
            r8.<init>(r9, r10, r11, r12, r13)
            r0.A0H(r8)
            return
        L_0x020c:
            java.lang.Object r6 = r1.A00
            com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel r6 = (com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel) r6
            X.1Ed r8 = r6.A02
            r5 = 1
            java.lang.Integer[] r3 = new java.lang.Integer[r5]
            r0 = 20
            boolean r7 = X.C36361kB.A1b(r3, r0)
            java.lang.Integer[] r1 = new java.lang.Integer[r5]
            r0 = 40
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r1[r7] = r10
            r2 = -1
            java.util.List r9 = r8.A0U(r3, r1, r2)
            X.0yC r4 = r6.A03
            X.AE0 r3 = r6.A04
            java.lang.String r0 = r3.A0B()
            boolean r0 = X.C202699mR.A02(r4, r0)
            if (r0 != 0) goto L_0x025e
            java.util.Iterator r1 = r9.iterator()
        L_0x023c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x025e
            java.lang.Object r0 = r1.next()
            X.9lY r0 = (X.C202319lY) r0
            X.8av r0 = r0.A0A
            X.8bI r0 = (X.C175928bI) r0
            if (r0 == 0) goto L_0x023c
            X.9jw r0 = r0.A0G
            if (r0 == 0) goto L_0x023c
            java.lang.String r0 = r0.A0E
            boolean r0 = X.C202699mR.A03(r0)
            if (r0 == 0) goto L_0x023c
            r1.remove()
            goto L_0x023c
        L_0x025e:
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x02be
            java.lang.Integer[] r1 = new java.lang.Integer[r5]
            r0 = 417(0x1a1, float:5.84E-43)
            X.AnonymousClass000.A1L(r1, r0, r7)
            java.lang.Integer[] r0 = new java.lang.Integer[r5]
            r0[r7] = r10
            java.util.List r0 = r8.A0U(r1, r0, r2)
            java.util.Iterator r7 = r0.iterator()
        L_0x0277:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x02a2
            java.lang.Object r0 = r7.next()
            X.9lY r0 = (X.C202319lY) r0
            X.8av r1 = r0.A0A
            boolean r0 = r1 instanceof X.C175928bI
            if (r0 == 0) goto L_0x0277
            X.8bI r1 = (X.C175928bI) r1
            X.9jw r1 = r1.A0G
            java.lang.String r0 = r3.A0B()
            boolean r0 = X.C202699mR.A02(r4, r0)
            if (r0 != 0) goto L_0x02a4
            if (r1 == 0) goto L_0x0277
            java.lang.String r0 = r1.A0E
            boolean r0 = X.C202699mR.A03(r0)
            if (r0 == 0) goto L_0x02a6
            goto L_0x0277
        L_0x02a2:
            r5 = 0
            goto L_0x02be
        L_0x02a4:
            if (r1 == 0) goto L_0x0277
        L_0x02a6:
            X.9je r2 = r1.A0C
            if (r2 == 0) goto L_0x0277
            java.lang.String r1 = r2.A08
            java.lang.String r0 = "UNKNOWN"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0277
            java.lang.String r1 = r2.A09
            java.lang.String r0 = "INIT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0277
        L_0x02be:
            X.00s r0 = r6.A00
            X.C36341k9.A19(r0, r5)
            return
        L_0x02c4:
            java.lang.Object r0 = r1.A00
            X.8ld r0 = (X.C180358ld) r0
            X.9jf r3 = r0.A06
            java.lang.String r6 = X.C36361kB.A0l()
            X.9FV r2 = new X.9FV
            r2.<init>(r0)
            java.lang.String r7 = r0.A08
            monitor-enter(r3)
            X.0y0 r5 = r3.A02     // Catch:{ all -> 0x0350 }
            java.io.File r4 = r5.A0U(r7)     // Catch:{ all -> 0x0350 }
            r0 = 0
            X.AnonymousClass6YY.A0E(r4, r0)     // Catch:{ all -> 0x0350 }
            java.io.File r0 = r5.A0Q(r7)     // Catch:{ all -> 0x0350 }
            java.io.File r5 = r5.A0a(r6, r7)     // Catch:{ all -> 0x0350 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0311 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x0311 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ all -> 0x0307 }
            r0.<init>(r5)     // Catch:{ all -> 0x0307 }
            X.AnonymousClass6YY.A0J(r4, r0)     // Catch:{ all -> 0x02fd }
            r0.close()     // Catch:{ all -> 0x0307 }
            r4.close()     // Catch:{ IOException -> 0x0311 }
            goto L_0x0318
        L_0x02fd:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0302 }
            goto L_0x0306
        L_0x0302:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0307 }
        L_0x0306:
            throw r1     // Catch:{ all -> 0x0307 }
        L_0x0307:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x030c }
            goto L_0x0310
        L_0x030c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0311 }
        L_0x0310:
            throw r1     // Catch:{ IOException -> 0x0311 }
        L_0x0311:
            r1 = move-exception
            java.lang.String r0 = "dyiReportManager/prepare-report-for-export/can't prepare report file"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0350 }
            goto L_0x0329
        L_0x0318:
            X.0wo r0 = r3.A04     // Catch:{ all -> 0x0350 }
            long r0 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x0350 }
            boolean r0 = r5.setLastModified(r0)     // Catch:{ all -> 0x0350 }
            if (r0 != 0) goto L_0x033e
            java.lang.String r0 = "dyiReportManager/prepare-report-for-export/failed to update report file"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0350 }
        L_0x0329:
            java.lang.String r0 = "DyiViewModel/export-report/on-error"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0350 }
            X.8ld r0 = r2.A00     // Catch:{ all -> 0x0350 }
            X.00s r2 = r0.A03     // Catch:{ all -> 0x0350 }
            java.lang.Integer r1 = X.C36361kB.A0j()     // Catch:{ all -> 0x0350 }
            X.9ky r0 = X.C202059ky.A00()     // Catch:{ all -> 0x0350 }
            X.C165587tf.A11(r2, r1, r0)     // Catch:{ all -> 0x0350 }
            goto L_0x034e
        L_0x033e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0350 }
            java.lang.String r0 = "DyiViewModel/export-report/on-ready-to-export :: "
            X.C36321k7.A1Q(r0, r6, r1)     // Catch:{ all -> 0x0350 }
            X.8ld r0 = r2.A00     // Catch:{ all -> 0x0350 }
            X.00s r0 = r0.A00     // Catch:{ all -> 0x0350 }
            r0.A0C(r6)     // Catch:{ all -> 0x0350 }
        L_0x034e:
            monitor-exit(r3)
            return
        L_0x0350:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0353:
            java.lang.Object r0 = r1.A00
            X.8ld r0 = (X.C180358ld) r0
            X.9jf r1 = r0.A06
            X.9Q1 r2 = new X.9Q1
            r2.<init>(r0)
            java.lang.String r3 = r0.A08
            monitor-enter(r1)
            java.lang.String r0 = "dyiReportManager/download-report"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x03bb }
            X.9KY r0 = r1.A03(r3)     // Catch:{ all -> 0x03bb }
            if (r0 != 0) goto L_0x0378
            java.lang.String r0 = "dyiReportManager/download-report no valid report info"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x03bb }
        L_0x0371:
            r1.A04(r3)     // Catch:{ all -> 0x03bb }
            r2.A00()     // Catch:{ all -> 0x03bb }
            goto L_0x03b7
        L_0x0378:
            java.lang.String r13 = r0.A02     // Catch:{ all -> 0x03bb }
            if (r13 != 0) goto L_0x0382
            java.lang.String r0 = "dyiReportManager/download-report no url"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x03bb }
            goto L_0x0371
        L_0x0382:
            X.0wo r6 = r1.A04     // Catch:{ all -> 0x03bb }
            X.0yC r8 = r1.A06     // Catch:{ all -> 0x03bb }
            X.0ww r5 = r1.A03     // Catch:{ all -> 0x03bb }
            X.0wx r7 = r1.A05     // Catch:{ all -> 0x03bb }
            X.1BS r11 = r1.A09     // Catch:{ all -> 0x03bb }
            X.1BV r9 = r1.A07     // Catch:{ all -> 0x03bb }
            java.lang.String r14 = "application/zip"
            X.0y0 r0 = r1.A02     // Catch:{ all -> 0x03bb }
            java.io.File r12 = r0.A0Q(r3)     // Catch:{ all -> 0x03bb }
            X.1Gl r10 = X.C25471Gl.A0A     // Catch:{ all -> 0x03bb }
            X.5Bw r4 = new X.5Bw     // Catch:{ all -> 0x03bb }
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x03bb }
            r1.A00 = r4     // Catch:{ all -> 0x03bb }
            X.ADa r0 = new X.ADa     // Catch:{ all -> 0x03bb }
            r0.<init>(r1, r2, r3)     // Catch:{ all -> 0x03bb }
            r4.B0M(r0)     // Catch:{ all -> 0x03bb }
            java.lang.String r0 = "dyiReportManager/on-report-downloading"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x03b9 }
            X.1Db r2 = r1.A08     // Catch:{ all -> 0x03b9 }
            r0 = 3
            r2.A0F(r0, r3)     // Catch:{ all -> 0x03b9 }
            X.5Bw r0 = r1.A00     // Catch:{ all -> 0x03bb }
            r0.A02()     // Catch:{ all -> 0x03bb }
        L_0x03b7:
            monitor-exit(r1)
            return
        L_0x03b9:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x03bb }
        L_0x03bb:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x03be:
            java.lang.Object r2 = r1.A00
            X.7yq r2 = (X.C167797yq) r2
            r0 = 11
            X.9Og r1 = new X.9Og
            r1.<init>(r0)
            java.lang.String r0 = "https://faq.whatsapp.com/payments/26000350"
            goto L_0x03ed
        L_0x03cc:
            java.lang.Object r1 = r1.A00
            X.7yq r1 = (X.C167797yq) r1
            X.1XC r2 = r1.A0Z
            r0 = 7
            X.B8c r3 = new X.B8c
            r3.<init>(r1, r0)
            r4 = 0
            r6 = r4
            r7 = r4
            r5 = r4
            r2.A01(r3, r4, r5, r6, r7)
            return
        L_0x03e0:
            java.lang.Object r2 = r1.A00
            X.7yq r2 = (X.C167797yq) r2
            r0 = 11
            X.9Og r1 = new X.9Og
            r1.<init>(r0)
            java.lang.String r0 = "https://faq.whatsapp.com/payments/26000351"
        L_0x03ed:
            r1.A0G = r0
            X.1Rs r0 = r2.A08
            r0.A0D(r1)
            return
        L_0x03f5:
            java.lang.Object r0 = r1.A00
            X.1YK r0 = (X.AnonymousClass1YK) r0
            r0.A02()
            return
        L_0x03fd:
            java.lang.Object r0 = r1.A00
            com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperValuePropsActivity r0 = (com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperValuePropsActivity) r0
            X.AF7 r4 = r0.A3i()
            java.lang.Integer r3 = X.C36361kB.A0i()
            java.lang.Integer r2 = X.C36401kF.A0i()
            java.lang.String r1 = X.C36331k8.A0e(r0)
            java.lang.String r0 = "alias_intro"
            r4.BOm(r3, r2, r0, r1)
            return
        L_0x0417:
            java.lang.Object r0 = r1.A00
            com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationActivity r0 = (com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationActivity) r0
            X.1Dc r5 = r0.A0B
            X.0ts r0 = r0.A00
            java.util.Locale r4 = X.C36401kF.A0x(r0)
            r3 = 2
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r1 = 0
            java.lang.String r0 = "supported-countries-faq"
            r2[r1] = r0
            r1 = 1
            java.lang.String r0 = "1293279751500598"
            r2[r1] = r0
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r2, r3)
            java.lang.String r0 = "Supported Country Learn More Linked. Key: %s, FaqId: %s."
            java.lang.String r0 = java.lang.String.format(r4, r0, r1)
            X.AnonymousClass00C.A08(r0)
            r5.A03(r0)
            return
        L_0x0441:
            java.lang.Object r4 = r1.A00
            com.whatsapp.payments.ui.compliance.IndiaConfirmLegalNameBottomSheetFragment r4 = (com.whatsapp.payments.ui.compliance.IndiaConfirmLegalNameBottomSheetFragment) r4
            r0 = 150(0x96, float:2.1E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = r4.A03
            r1 = 1
            java.lang.String r0 = "enter_name"
            r4.A1b(r3, r0, r2, r1)
            return
        L_0x0454:
            java.lang.Object r0 = r1.A00
            X.4vw r0 = (X.C100844vw) r0
            X.C100844vw.A03(r0)
            return
        L_0x045c:
            java.lang.Object r0 = r1.A00
            X.1Fo r0 = (X.C25251Fo) r0
            r0.A01()
            return
        L_0x0464:
            java.lang.Object r0 = r1.A00
            com.whatsapp.payments.ui.PaymentSettingsFragment r0 = (com.whatsapp.payments.ui.PaymentSettingsFragment) r0
            X.1N6 r2 = r0.A0r
            r1 = 77
            r0 = 0
            r2.A03(r0, r1)
            return
        L_0x0471:
            java.lang.Object r2 = r1.A00
            com.whatsapp.payments.ui.PaymentIncentiveViewFragment r2 = (com.whatsapp.payments.ui.PaymentIncentiveViewFragment) r2
            r0 = 86
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            X.0wo r1 = r2.A02
            X.6O3 r0 = r2.A07
            r5 = 0
            r6 = 1
            X.6Ps r1 = X.C203049nB.A01(r1, r5, r0, r5, r6)
            X.B3f r2 = r2.A06
            java.lang.String r4 = "incentive_details"
            X.C203049nB.A03(r1, r2, r3, r4, r5, r6)
            return
        L_0x048d:
            java.lang.Object r4 = r1.A00
            com.whatsapp.payments.ui.compliance.ConfirmLegalNameBottomSheetFragment r4 = (com.whatsapp.payments.ui.compliance.ConfirmLegalNameBottomSheetFragment) r4
            r0 = 150(0x96, float:2.1E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r2 = 1
            java.lang.String r1 = "enter_name"
            java.lang.String r0 = "order_details"
            r4.A1b(r3, r1, r0, r2)
            return
        L_0x04a0:
            java.lang.Object r4 = r1.A00
            com.whatsapp.payments.ui.compliance.ConfirmDateOfBirthBottomSheetFragment r4 = (com.whatsapp.payments.ui.compliance.ConfirmDateOfBirthBottomSheetFragment) r4
            r0 = 150(0x96, float:2.1E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r2 = 1
            java.lang.String r1 = "enter_dob"
            java.lang.String r0 = "confirm_legal_name_in_progress_prompt"
            r4.A1a(r3, r1, r0, r2)
            return
        L_0x04b3:
            java.lang.Object r0 = r1.A00
            X.14u r0 = (X.C225314u) r0
            r0.Bnv()
            return
        L_0x04bb:
            java.lang.Object r2 = r1.A00
            com.whatsapp.payments.ui.IndiaUpiStepUpActivity r2 = (com.whatsapp.payments.ui.IndiaUpiStepUpActivity) r2
            r0 = 10
            X.AnonymousClass3SJ.A00(r2, r0)
            X.AE0 r0 = r2.A0M
            java.lang.String r4 = r0.A0D()
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x04ef
            java.lang.String r6 = X.C173858Tk.A0J(r2)
            r2.A05 = r6
            X.8az r0 = r2.A01
            java.lang.String r5 = r0.A0B
            X.8bF r3 = r0.A08
            X.8b6 r3 = (X.C175818b6) r3
            r8 = 3
            java.lang.Object r7 = X.C207249un.A06(r0)
            java.lang.String r7 = (java.lang.String) r7
            r2.A4H(r3, r4, r5, r6, r7, r8)
            X.7yI r1 = r2.A04
            java.lang.String r0 = r2.A05
            r1.A03 = r0
            return
        L_0x04ef:
            X.8gR r0 = r2.A03
            r0.A02()
            return
        L_0x04f5:
            java.lang.Object r0 = r1.A00
            X.8qm r0 = (X.C183428qm) r0
            com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity r5 = r0.A00
            r0 = 5
            r5.A00 = r0
            r5.A4P()
            X.9tz r0 = r5.A0U
            if (r0 == 0) goto L_0x0527
            X.0yC r1 = r5.A0D
            java.math.BigDecimal r0 = X.C202809mh.A00
            int r0 = X.C165607th.A07(r1)
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r5.A0l = r0
        L_0x0513:
            X.6x8 r4 = r5.A0D
            X.9k4 r3 = r5.A0N
            java.lang.String r2 = r5.A0l
        L_0x0519:
            java.lang.String r1 = r5.A0m
            java.lang.String r0 = r5.A0k
            X.16X r0 = r3.A02(r2, r1, r0)
            r4.A00 = r0
        L_0x0523:
            com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity.A12(r5)
            return
        L_0x0527:
            java.lang.String r4 = X.C173858Tk.A0M(r5)
            boolean r0 = X.AnonymousClass14B.A0F(r4)
            if (r0 != 0) goto L_0x054a
            X.0yC r1 = r5.A0D
            r0 = 1955(0x7a3, float:2.74E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x054a
            X.6x8 r3 = r5.A0D
            X.9k4 r2 = r5.A0N
            java.lang.String r1 = r5.A0m
            java.lang.String r0 = r5.A0k
            X.16X r0 = r2.A02(r4, r1, r0)
            r3.A00 = r0
            goto L_0x0523
        L_0x054a:
            boolean r0 = r5.A0n
            if (r0 != 0) goto L_0x0513
            java.math.BigDecimal r0 = r5.A0H
            if (r0 == 0) goto L_0x0513
            X.6x8 r4 = r5.A0D
            X.9k4 r3 = r5.A0N
            java.lang.String r2 = java.lang.String.valueOf(r0)
            goto L_0x0519
        L_0x055b:
            java.lang.Object r0 = r1.A00
            X.AH4 r0 = (X.AH4) r0
            com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity r5 = r0.A00
            X.1Vk r4 = r5.A0M
            com.whatsapp.payments.ui.widget.PaymentView r0 = r5.A0M
            if (r0 == 0) goto L_0x058e
            java.lang.String r1 = r0.getPaymentNote()
        L_0x056b:
            com.whatsapp.payments.ui.widget.PaymentView r0 = r5.A0M
            if (r0 == 0) goto L_0x058c
            java.util.List r0 = r0.getMentionedJids()
        L_0x0573:
            X.2bV r3 = r5.A3j(r1, r0)
            com.whatsapp.jid.UserJid r2 = r5.A0E
            X.C18740tg.A06(r2)
            X.16X r1 = r5.A09
            com.whatsapp.payments.ui.widget.PaymentView r0 = r5.A0M
            if (r0 == 0) goto L_0x058a
            X.6c9 r0 = r0.getPaymentBackground()
        L_0x0586:
            r4.A08(r1, r0, r2, r3)
            return
        L_0x058a:
            r0 = 0
            goto L_0x0586
        L_0x058c:
            r0 = 0
            goto L_0x0573
        L_0x058e:
            java.lang.String r1 = ""
            goto L_0x056b
        L_0x0591:
            java.lang.Object r1 = r1.A00
            com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity r1 = (com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity) r1
            r0 = 1
            com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity.A17(r1, r0)
            return
        L_0x059a:
            java.lang.Object r10 = r1.A00
            com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity r10 = (com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity) r10
            X.1Dc r1 = r10.A0g
            java.lang.String r0 = "Getting PLE encryption key in background..."
            r1.A04(r0)
            X.17Y r11 = r10.A05
            X.19A r12 = r10.A0H
            X.9lR r13 = r10.A0L
            X.1Vk r1 = r10.A0M
            X.1Vu r0 = r10.A0K
            X.8g9 r8 = new X.8g9
            r9 = r8
            r14 = r0
            r15 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15)
            X.9FQ r9 = new X.9FQ
            r9.<init>(r10)
            java.lang.String r3 = "cd7962b7"
            java.lang.String r0 = "PAY: getPleServerPublicKey called"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.19A r2 = r8.A02
            java.lang.String r1 = r2.A09()
            r0 = 9
            X.8vH r10 = new X.8vH
            r10.<init>((java.lang.String) r1, (java.lang.String) r3, (int) r0)
            X.9nx r0 = r10.A00
            android.content.Context r4 = r8.A00
            X.17Y r5 = r8.A01
            X.1Vu r6 = r8.A03
            X.9YX r7 = r8.A00
            X.B7O r3 = new X.B7O
            r3.<init>((android.content.Context) r4, (X.AnonymousClass17Y) r5, (X.C29221Vu) r6, (X.AnonymousClass9YX) r7, (X.AnonymousClass8g9) r8, (X.AnonymousClass9FQ) r9, (X.C186018vH) r10)
            X.C165577te.A1A(r2, r3, r0, r1)
            return
        L_0x05e3:
            java.lang.Object r0 = r1.A00
            com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity r0 = (com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity) r0
            com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity.A10(r0)
            return
        L_0x05eb:
            java.lang.Object r3 = r1.A00
            com.whatsapp.payments.ui.IndiaUpiPaymentsTosActivity r3 = (com.whatsapp.payments.ui.IndiaUpiPaymentsTosActivity) r3
            java.lang.Integer r2 = X.C36361kB.A0i()
            X.8cT r1 = r3.A08
            r0 = 31
            goto L_0x0604
        L_0x05f8:
            java.lang.Object r3 = r1.A00
            com.whatsapp.payments.ui.IndiaUpiPaymentsTosActivity r3 = (com.whatsapp.payments.ui.IndiaUpiPaymentsTosActivity) r3
            java.lang.Integer r2 = X.C36361kB.A0i()
            X.8cT r1 = r3.A08
            r0 = 20
        L_0x0604:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A07 = r0
            r1.A08 = r2
            X.C173858Tk.A0r(r1, r3)
            return
        L_0x0610:
            java.lang.Object r0 = r1.A00
            X.B7r r0 = (X.C23157B7r) r0
            java.lang.Object r0 = r0.A00
            goto L_0x0664
        L_0x0617:
            java.lang.Object r0 = r1.A00
            com.whatsapp.payments.ui.PaymentSettingsFragment r0 = (com.whatsapp.payments.ui.PaymentSettingsFragment) r0
            X.1Ed r5 = r0.A0Q
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            r0 = 0
            android.database.Cursor r3 = X.C24881Ed.A01(r5, r0)
        L_0x0626:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0656 }
            if (r0 == 0) goto L_0x064f
            X.9lY r2 = X.C24881Ed.A09(r3, r5)     // Catch:{ 0wR -> 0x0646 }
            X.0wo r0 = r5.A01     // Catch:{ 0wR -> 0x0646 }
            long r0 = X.C19970wo.A00(r0)     // Catch:{ 0wR -> 0x0646 }
            r2.A06 = r0     // Catch:{ 0wR -> 0x0646 }
            X.8av r1 = r2.A0A     // Catch:{ 0wR -> 0x0646 }
            if (r1 == 0) goto L_0x0642
            java.lang.Boolean r0 = X.C36371kC.A0m()     // Catch:{ 0wR -> 0x0646 }
            r1.A03 = r0     // Catch:{ 0wR -> 0x0646 }
        L_0x0642:
            r4.add(r2)     // Catch:{ 0wR -> 0x0646 }
            goto L_0x0626
        L_0x0646:
            r2 = move-exception
            X.1Dc r1 = r5.A04     // Catch:{ all -> 0x0656 }
            java.lang.String r0 = "setAllPendingRequestViewed/InvalidJidException - Skipped pending transaction with invalid JID"
            r1.A0A(r0, r2)     // Catch:{ all -> 0x0656 }
            goto L_0x0626
        L_0x064f:
            r3.close()
            r5.A0e(r4)
            return
        L_0x0656:
            r1 = move-exception
            if (r3 == 0) goto L_0x0661
            r3.close()     // Catch:{ all -> 0x065d }
            throw r1
        L_0x065d:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x0661:
            throw r1
        L_0x0662:
            java.lang.Object r0 = r1.A00
        L_0x0664:
            android.app.Activity r0 = (android.app.Activity) r0
            r0.finish()
            return
        L_0x066a:
            java.lang.Object r1 = r1.A00
            X.8jE r1 = (X.C179128jE) r1
            X.11F r0 = r1.A0E
            boolean r0 = X.AnonymousClass143.A0G(r0)
            if (r0 == 0) goto L_0x0683
            r0 = 0
            r1.A0G = r0
            return
        L_0x067a:
            java.lang.Object r1 = r1.A00
            X.8jE r1 = (X.C179128jE) r1
            r0 = 12
            X.C165577te.A13(r1, r0)
        L_0x0683:
            r1.A3v()
            r1.finish()
            return
        L_0x068a:
            java.lang.Object r3 = r1.A00
            X.8hw r3 = (X.C178848hw) r3
            r2 = 0
            com.whatsapp.payments.CheckFirstTransaction r0 = r3.A09
            X.3ty r1 = r0.A00
            X.B9t r0 = new X.B9t
            r0.<init>(r2, r3, r2)
            r1.A0A(r0)
            return
        L_0x069c:
            java.lang.Object r5 = r1.A00
            com.whatsapp.payments.ui.IndiaUpiIncentivesValuePropsActivity r5 = (com.whatsapp.payments.ui.IndiaUpiIncentivesValuePropsActivity) r5
            X.AF7 r4 = r5.A0S
            java.lang.Integer r3 = X.C36361kB.A0i()
            java.lang.Integer r2 = X.C36401kF.A0i()
            java.lang.String r1 = "incentive_value_prop"
            r0 = 0
            X.8cT r1 = r4.A04(r3, r2, r1, r0)
            boolean r0 = X.C173858Tk.A0x(r5)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A01 = r0
            X.C173858Tk.A0r(r1, r5)
            return
        L_0x06bf:
            java.lang.Object r2 = r1.A00
            com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity r2 = (com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity) r2
            java.lang.String r0 = "2"
            r2.A0Q = r0
            android.view.View r0 = r2.A04
            com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity.A13(r0, r2)
            android.view.View r0 = r2.A02
            com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity.A14(r0, r2)
            android.view.View r0 = r2.A03
            com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity.A12(r0, r2)
            com.whatsapp.WaImageView r1 = r2.A05
            r0 = 2131232885(0x7f080875, float:1.8081892E38)
            X.C36391kE.A18(r2, r1, r0)
            return
        L_0x06df:
            java.lang.Object r0 = r1.A00
            com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity r0 = (com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity) r0
            X.9ek r8 = r0.A0D
            java.lang.String r12 = r0.A0R
            java.lang.String r3 = r0.A0T
            java.lang.String r2 = r0.A0S
            X.9lR r0 = r0.A0L
            java.lang.String r13 = r0.A05(r12)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PAY: sendDeviceBindingIq called with psp: "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = " verificationData: "
            r1.append(r0)
            java.lang.String r0 = X.C200449hQ.A00(r3)
            X.C36321k7.A1a(r1, r0)
            X.AF7 r9 = r8.A0E
            r1 = 20
            r10 = 0
            r0 = 0
            r9.A07(r10, r1, r0)
            X.9YX r7 = r8.A0C
            java.lang.String r0 = "upi-bind-device"
            r7.A02(r0)
            X.19A r1 = r8.A09
            java.lang.String r17 = r1.A09()
            java.util.ArrayList r0 = X.AnonymousClass5Pm.A00
            X.1Vl r0 = r8.A0H
            java.lang.String r18 = r0.A01()
            r4 = 3
            java.lang.Long r15 = java.lang.Long.valueOf(r4)
            java.lang.Long r16 = X.C36411kG.A0t()
            X.AE0 r0 = r8.A0A
            boolean r0 = r0.A0N()
            java.lang.String r22 = X.C165617ti.A0Y(r0)
            X.5Pm r14 = new X.5Pm
            r19 = r3
            r20 = r12
            r21 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            X.0yC r2 = r8.A08
            r0 = 2227(0x8b3, float:3.12E-42)
            boolean r3 = r2.A0E(r0)
            java.lang.String r11 = "in_upi_device_binding_tag"
            if (r3 == 0) goto L_0x075a
            X.5GM r2 = r8.A0F
            r0 = 185476608(0xb0e2600, float:2.7376793E-32)
            r2.A01(r0, r11)
        L_0x075a:
            X.9nx r0 = r14.A00
            X.0wG r2 = r8.A06
            android.content.Context r4 = r2.A00
            X.17Y r5 = r8.A05
            X.1Vu r6 = r8.A0B
            if (r3 == 0) goto L_0x0779
            X.5GM r10 = r8.A0F
        L_0x0768:
            X.8ga r3 = new X.8ga
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r6 = 0
            r5 = 204(0xcc, float:2.86E-43)
            r2 = r3
            r3 = r0
            r4 = r17
            r1.A0E(r2, r3, r4, r5, r6)
            return
        L_0x0779:
            r11 = r10
            goto L_0x0768
        L_0x077b:
            java.lang.String r0 = "paymentSharedPrefs"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0782:
            java.lang.String r0 = "fMessageDatabase"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AVY.run():void");
    }
}
