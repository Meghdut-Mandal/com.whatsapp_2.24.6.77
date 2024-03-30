package X;

import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.mediacomposer.bottomsheet.ImageQualitySettingsBottomSheetFragment;
import java.util.Map;

/* renamed from: X.3wq  reason: invalid class name and case insensitive filesystem */
public class C81333wq implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C81333wq(AnonymousClass1X4 r2, AnonymousClass3T1 r3, int i) {
        this.A03 = 25;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = i;
    }

    public static void A00(C19770wU r1, Object obj, Object obj2, int i, int i2) {
        r1.Boy(new C81333wq(obj, i, i2, obj2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0298, code lost:
        if (com.whatsapp.backup.google.RestoreFromBackupActivity.A0n(r7) != false) goto L_0x03ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x029a, code lost:
        r7.A02.setIndeterminate(false);
        r7.A04.setText(com.whatsapp.R.string.f12nameremoved);
        r4 = r7.A0F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02a9, code lost:
        if (r4 != null) goto L_0x02b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02ab, code lost:
        r4 = (com.whatsapp.backup.google.GoogleDriveRestoreAnimationView) X.C03570Gk.A0B(r7, com.whatsapp.R.id.google_drive_restore_animation_view);
        r7.A0F = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02b6, code lost:
        r4.A01 = 4;
        r0 = r4.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02bb, code lost:
        if (r0 == null) goto L_0x02c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02bd, code lost:
        r0.cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02c0, code lost:
        r0 = X.C03570Gk.A0B(r7, com.whatsapp.R.id.google_drive_backup_error_info_view);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02c9, code lost:
        if (r2 == null) goto L_0x031b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02cb, code lost:
        r0.setVisibility(0);
        X.C36401kF.A0H(r7, com.whatsapp.R.id.google_drive_backup_error_info).setText(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02d8, code lost:
        X.C36391kE.A16(r7, com.whatsapp.R.id.gdrive_restore_info, 0);
        com.whatsapp.backup.google.RestoreFromBackupActivity.A0j(r7, X.C36331k8.A06(r7).getBoolean("gdrive_last_restore_file_is_encrypted", false));
        X.C36391kE.A16(r7, com.whatsapp.R.id.restore_actions_view, 0);
        X.C36391kE.A16(r7, com.whatsapp.R.id.google_drive_media_will_be_downloaded_later_notice, 8);
        r7.A0F.setVisibility(8);
        r7.A02.setVisibility(8);
        r7.A04.setVisibility(8);
        X.C36421kH.A10(X.C03570Gk.A0B(r7, com.whatsapp.R.id.dont_restore), r7, 8);
        r7.A01.setText(r8);
        r7.A01.setOnClickListener(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x031a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x031b, code lost:
        r0.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x03c4, code lost:
        com.whatsapp.util.Log.e(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03ce, code lost:
        r1 = X.AnonymousClass000.A0u();
        r1.append("restore>RestoreFromBackupActivity/display-msgstore-download-error failed to display error ");
        r1.append(r4);
        r0 = X.AnonymousClass000.A0q(" since Activity is about to finish.", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x087f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0880, code lost:
        com.whatsapp.accountswitching.secondaryprocess.AccountSwitchingActivity.A01(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0883, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x09a8, code lost:
        if (X.C36361kB.A1Z(r11, X.AnonymousClass3TP.A09) != false) goto L_0x09aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x09b4, code lost:
        if (X.AnonymousClass3TP.A01(r11, X.AnonymousClass3TP.A02) == false) goto L_0x09b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x09be, code lost:
        if (r1 != false) goto L_0x09c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x09e1, code lost:
        if (r14.isEmpty() == false) goto L_0x09e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x09ef, code lost:
        if (r1 != false) goto L_0x09f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0a04, code lost:
        if (r9 != false) goto L_0x0a06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x0a55, code lost:
        if (X.C36361kB.A1Z(r9, r1) == false) goto L_0x0a57;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x0a89, code lost:
        r1.A0C(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x0a8c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x0a9d, code lost:
        if (r6 != null) goto L_0x093c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x0acc, code lost:
        if (r8 == null) goto L_0x0912;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0040, code lost:
        if (r0 == false) goto L_0x0042;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x087f A[ExcHandler: all (r0v92 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:281:0x0806] */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x095b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r18 = this;
            r3 = r18
            int r0 = r3.A03
            switch(r0) {
                case 0: goto L_0x03e2;
                case 1: goto L_0x08ec;
                case 2: goto L_0x08de;
                case 3: goto L_0x08d2;
                case 4: goto L_0x08c4;
                case 5: goto L_0x08b4;
                case 6: goto L_0x08a2;
                case 7: goto L_0x07e5;
                case 8: goto L_0x07d1;
                case 9: goto L_0x07b8;
                case 10: goto L_0x0250;
                case 11: goto L_0x07a6;
                case 12: goto L_0x0226;
                case 13: goto L_0x0007;
                case 14: goto L_0x0007;
                case 15: goto L_0x0796;
                case 16: goto L_0x0788;
                case 17: goto L_0x0772;
                case 18: goto L_0x0761;
                case 19: goto L_0x074c;
                case 20: goto L_0x01ee;
                case 21: goto L_0x0737;
                case 22: goto L_0x08ff;
                case 23: goto L_0x072a;
                case 24: goto L_0x0719;
                case 25: goto L_0x070a;
                case 26: goto L_0x06b0;
                case 27: goto L_0x0696;
                case 28: goto L_0x017d;
                case 29: goto L_0x0139;
                case 30: goto L_0x0688;
                case 31: goto L_0x0630;
                case 32: goto L_0x00ea;
                case 33: goto L_0x00a1;
                case 34: goto L_0x05f8;
                case 35: goto L_0x05df;
                case 36: goto L_0x0066;
                case 37: goto L_0x0021;
                case 38: goto L_0x058e;
                case 39: goto L_0x0573;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r3.A01
            X.9lS r0 = (X.C202279lS) r0
            java.lang.Object r2 = r3.A02
            X.9iV r2 = (X.C200939iV) r2
            int r1 = r3.A00
            java.util.Map r0 = r0.A0P
            java.lang.Object r0 = r0.remove(r2)
            X.7j0 r0 = (X.C159217j0) r0
            if (r0 != 0) goto L_0x056f
            java.lang.String r0 = "The response handler must not be null"
        L_0x001d:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0020:
            return
        L_0x0021:
            java.lang.Object r0 = r3.A01
            X.4a5 r0 = (X.C90394a5) r0
            int r4 = r3.A00
            java.lang.Object r3 = r3.A02
            X.3T1 r3 = (X.AnonymousClass3T1) r3
            java.lang.Object r2 = r0.A00
            X.2f9 r2 = (X.C47572f9) r2
            X.3T1 r1 = r2.A05
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            boolean r0 = r1 instanceof X.AnonymousClass2bU
            if (r0 == 0) goto L_0x0042
            X.2bU r1 = (X.AnonymousClass2bU) r1
            boolean r0 = X.C54732tQ.A00(r1)
            r1 = 1
            if (r0 != 0) goto L_0x0043
        L_0x0042:
            r1 = 0
        L_0x0043:
            boolean r0 = r2.A00
            if (r0 != 0) goto L_0x0059
            if (r1 != 0) goto L_0x0059
            r2.A0R()
        L_0x004c:
            int r1 = r3.A0D
            r0 = 4
            int r0 = X.AnonymousClass3TJ.A00(r1, r0)
            if (r0 <= 0) goto L_0x0020
            X.C47572f9.A00(r2)
            return
        L_0x0059:
            r2.A0J()
            r0 = 3
            if (r0 != r4) goto L_0x004c
            X.C47592fB.A02(r2)
            r2.A0I()
            goto L_0x004c
        L_0x0066:
            java.lang.Object r5 = r3.A01
            X.3hS r5 = (X.C71863hS) r5
            int r4 = r3.A00
            java.lang.Object r2 = r3.A02
            X.3T1 r2 = (X.AnonymousClass3T1) r2
            X.2f8 r1 = r5.A01
            r1.A0J()
            r0 = 3
            if (r0 != r4) goto L_0x0083
            X.C47592fB.A02(r1)
            boolean r0 = r5.A00
            if (r0 != 0) goto L_0x0020
            r1.A0I()
            return
        L_0x0083:
            r0 = 12
            if (r4 != r0) goto L_0x0020
            X.C47592fB.A02(r1)
            boolean r0 = r2 instanceof X.C46882bp
            if (r0 == 0) goto L_0x0020
            X.2bU r2 = (X.AnonymousClass2bU) r2
            boolean r0 = X.C66013Ui.A0x(r2)
            if (r0 == 0) goto L_0x0020
            boolean r0 = r5.A00
            if (r0 != 0) goto L_0x009d
            r1.A0I()
        L_0x009d:
            r0 = 1
            r5.A00 = r0
            return
        L_0x00a1:
            java.lang.Object r5 = r3.A01
            X.9gL r5 = (X.C199969gL) r5
            java.lang.Object r3 = r3.A02
            X.B1o r3 = (X.C23043B1o) r3
            r2 = 4
            X.629 r1 = r5.A03
            r0 = r3
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            X.58T r4 = r1.A00(r0, r2)
            X.9uk r0 = r3.BA8()     // Catch:{ JSONException -> 0x00e6 }
            X.C18740tg.A06(r0)     // Catch:{ JSONException -> 0x00e6 }
            java.lang.String r3 = X.C199969gL.A00(r0, r5)     // Catch:{ JSONException -> 0x00e6 }
            org.json.JSONObject r2 = X.C36441kJ.A1B()     // Catch:{ JSONException -> 0x00e6 }
            java.lang.String r1 = "cta"
            java.lang.String r0 = "order_status"
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x00e6 }
            X.1EZ r0 = r5.A02     // Catch:{ JSONException -> 0x00e6 }
            boolean r1 = r0.A0E()     // Catch:{ JSONException -> 0x00e6 }
            java.lang.String r0 = "wa_pay_registered"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x00e6 }
            java.lang.String r0 = "p2m_type"
            r2.put(r0, r3)     // Catch:{ JSONException -> 0x00e6 }
            java.lang.String r0 = r2.toString()     // Catch:{ JSONException -> 0x00e6 }
            r4.A07 = r0     // Catch:{ JSONException -> 0x00e6 }
            X.0yW r0 = r5.A01     // Catch:{ JSONException -> 0x00e6 }
            r0.Blv(r4)     // Catch:{ JSONException -> 0x00e6 }
            goto L_0x08fd
        L_0x00e6:
            java.lang.String r0 = "OrderDetailsMessageLogging/logReceiveOrderDetailsUpdate failed to construct message class attributes"
            goto L_0x001d
        L_0x00ea:
            java.lang.Object r6 = r3.A01
            X.9gL r6 = (X.C199969gL) r6
            java.lang.Object r3 = r3.A02
            X.B1o r3 = (X.C23043B1o) r3
            r2 = 4
            X.629 r1 = r6.A03
            r0 = r3
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            X.58T r5 = r1.A00(r0, r2)
            X.9uk r0 = r3.BA8()     // Catch:{ JSONException -> 0x0135 }
            X.C18740tg.A06(r0)     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r4 = X.C199969gL.A00(r0, r6)     // Catch:{ JSONException -> 0x0135 }
            r3 = 0
            org.json.JSONObject r2 = X.C36441kJ.A1B()     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r1 = "cta"
            java.lang.String r0 = "order_details"
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x0135 }
            X.1EZ r0 = r6.A02     // Catch:{ JSONException -> 0x0135 }
            boolean r1 = r0.A0E()     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r0 = "wa_pay_registered"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r0 = "p2m_type"
            r2.put(r0, r4)     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r0 = "is_cta_available"
            r2.put(r0, r3)     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r0 = r2.toString()     // Catch:{ JSONException -> 0x0135 }
            r5.A07 = r0     // Catch:{ JSONException -> 0x0135 }
            X.0yW r0 = r6.A01     // Catch:{ JSONException -> 0x0135 }
            r0.Blv(r5)     // Catch:{ JSONException -> 0x0135 }
            goto L_0x08fe
        L_0x0135:
            java.lang.String r0 = "OrderDetailsMessageLogging/logReceiveOrderDetails failed to construct message class attributes"
            goto L_0x001d
        L_0x0139:
            int r5 = r3.A00
            java.lang.Object r4 = r3.A01
            com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel r4 = (com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel) r4
            java.lang.Object r2 = r3.A02
            X.0fC r2 = (X.C10770fC) r2
            r0 = 2
            X.AnonymousClass00C.A0D(r2, r0)
            if (r5 == 0) goto L_0x0170
            r0 = 6
            if (r5 == r0) goto L_0x0163
            java.lang.String r0 = "invalid payment account type"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0151:
            boolean r0 = r2.element
            if (r0 == 0) goto L_0x0020
            X.00T r0 = r4.A05
            java.lang.Object r1 = r0.getValue()
            X.00r r1 = (X.C001600r) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            goto L_0x0a89
        L_0x0163:
            X.1eV r1 = r4.A03
            java.lang.String r0 = "pix_key"
            java.util.ArrayList r0 = r1.A01(r0)
            boolean r0 = r0.isEmpty()
            goto L_0x017a
        L_0x0170:
            X.1eV r0 = r4.A03
            X.54i r0 = r0.A00()
            boolean r0 = X.AnonymousClass000.A1W(r0)
        L_0x017a:
            r2.element = r0
            goto L_0x0151
        L_0x017d:
            java.lang.Object r8 = r3.A01
            com.whatsapp.mediacomposer.bottomsheet.ImageQualitySettingsBottomSheetFragment r8 = (com.whatsapp.mediacomposer.bottomsheet.ImageQualitySettingsBottomSheetFragment) r8
            java.lang.Object r9 = r3.A02
            java.util.Map r9 = (java.util.Map) r9
            r7 = 2131890941(0x7f1212fd, float:1.9416588E38)
            r6 = 0
            r5 = 1
            X.AnonymousClass00C.A0D(r9, r5)
            java.util.SortedMap r0 = r8.A03
            java.util.Iterator r10 = X.AnonymousClass000.A0y(r0)
        L_0x0193:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0020
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r10)
            java.lang.Object r3 = r0.getKey()
            java.lang.Number r3 = (java.lang.Number) r3
            java.lang.Object r0 = r0.getValue()
            X.6AO r0 = (X.AnonymousClass6AO) r0
            int r0 = r0.A00
            java.lang.Object r2 = X.C36371kC.A0r(r9, r0)
            X.3JE r2 = (X.AnonymousClass3JE) r2
            if (r2 == 0) goto L_0x0193
            android.view.View r1 = r8.A0F
            if (r1 == 0) goto L_0x0193
            int r0 = X.C36411kG.A07(r3)
            android.view.View r4 = r1.findViewById(r0)
            com.whatsapp.radio.RadioButtonWithSubtitle r4 = (com.whatsapp.radio.RadioButtonWithSubtitle) r4
            if (r4 == 0) goto L_0x0193
            java.lang.Object[] r1 = X.AnonymousClass001.A0M()
            int r0 = r2.A01
            X.AnonymousClass000.A1L(r1, r0, r6)
            int r0 = r2.A00
            X.AnonymousClass000.A1L(r1, r0, r5)
            java.lang.String r3 = r8.A0o(r7, r1)
            java.lang.CharSequence r2 = r4.A00
            if (r3 == 0) goto L_0x01ea
            if (r2 == 0) goto L_0x01e9
            r1 = 2131890935(0x7f1212f7, float:1.9416576E38)
            java.lang.Object[] r0 = X.C36411kG.A1b(r3)
            java.lang.String r0 = X.C36401kF.A0q(r8, r2, r0, r5, r1)
            if (r0 == 0) goto L_0x01e9
            r3 = r0
        L_0x01e9:
            r2 = r3
        L_0x01ea:
            r4.setSubTitle(r2)
            goto L_0x0193
        L_0x01ee:
            java.lang.Object r2 = r3.A01
            X.3T1 r2 = (X.AnonymousClass3T1) r2
            java.lang.Object r5 = r3.A02
            X.2KB r5 = (X.AnonymousClass2KB) r5
            int r4 = r3.A00
            r0 = r2
            X.B1o r0 = (X.C23043B1o) r0
            X.9uk r0 = r0.BA8()
            if (r0 == 0) goto L_0x0224
            X.9uX r0 = r0.A04
            if (r0 == 0) goto L_0x0224
            java.util.List r3 = r0.A03
        L_0x0207:
            X.1A1 r1 = r5.A09
            X.3Qa r0 = r2.A1J
            X.3T1 r2 = r1.A03(r0)
            if (r2 == 0) goto L_0x0020
            if (r3 == 0) goto L_0x0020
            java.lang.Object r1 = X.C007103b.A0P(r3, r4)
            X.9tc r1 = (X.C206569tc) r1
            if (r1 == 0) goto L_0x0020
            r0 = 1
            r1.A00 = r0
            X.0xM r0 = r5.A02
            r0.A0k(r2)
            return
        L_0x0224:
            r3 = 0
            goto L_0x0207
        L_0x0226:
            java.lang.Object r1 = r3.A01
            X.9lS r1 = (X.C202279lS) r1
            java.lang.Object r4 = r3.A02
            X.9NZ r4 = (X.AnonymousClass9NZ) r4
            int r3 = r3.A00
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            java.util.List r0 = r1.A0N
            java.util.ArrayList r0 = X.C36441kJ.A15(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x023e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0020
            java.lang.Object r1 = r2.next()
            X.7j1 r1 = (X.C159227j1) r1
            java.lang.String r0 = r4.A04
            r1.BXn(r0, r3)
            goto L_0x023e
        L_0x0250:
            java.lang.Object r0 = r3.A01
            X.29P r0 = (X.AnonymousClass29P) r0
            int r4 = r3.A00
            java.lang.Object r6 = r3.A02
            android.os.BaseBundle r6 = (android.os.BaseBundle) r6
            com.whatsapp.backup.google.RestoreFromBackupActivity r7 = r0.A01
            X.C18740tg.A01()
            r0 = 10
            if (r4 == r0) goto L_0x0273
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "restore>RestoreFromBackupActivity/observer/display-msgstore-download-error/"
            r1.append(r0)
            java.lang.String r0 = X.C34191gb.A02(r4)
            X.C36321k7.A1a(r1, r0)
        L_0x0273:
            r8 = 2131893722(0x7f121dda, float:1.9422229E38)
            X.0v0 r0 = r7.A09
            java.lang.String r5 = r0.A0c()
            X.C18740tg.A06(r5)
            r11 = 2
            r2 = 0
            r9 = 1
            r3 = 0
            switch(r4) {
                case 10: goto L_0x0020;
                case 11: goto L_0x0286;
                case 12: goto L_0x031f;
                case 13: goto L_0x0331;
                case 14: goto L_0x033f;
                case 15: goto L_0x0350;
                case 16: goto L_0x0ad2;
                case 17: goto L_0x033f;
                case 18: goto L_0x033f;
                case 19: goto L_0x033f;
                case 20: goto L_0x0ad2;
                case 21: goto L_0x0286;
                case 22: goto L_0x033f;
                case 23: goto L_0x03cb;
                case 24: goto L_0x039d;
                case 25: goto L_0x033f;
                case 26: goto L_0x03b4;
                case 27: goto L_0x03b4;
                default: goto L_0x0286;
            }
        L_0x0286:
            r1 = 2131889891(0x7f120ee3, float:1.9414458E38)
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.String r2 = X.C36341k9.A0e(r7, r0, r8, r3, r1)
            X.9v1 r1 = new X.9v1
            r1.<init>(r9, r5, r7)
        L_0x0294:
            boolean r0 = com.whatsapp.backup.google.RestoreFromBackupActivity.A0n(r7)
            if (r0 != 0) goto L_0x03ce
            android.widget.ProgressBar r0 = r7.A02
            r0.setIndeterminate(r3)
            android.widget.TextView r4 = r7.A04
            r0 = 2131886356(0x7f120114, float:1.9407289E38)
            r4.setText(r0)
            com.whatsapp.backup.google.GoogleDriveRestoreAnimationView r4 = r7.A0F
            if (r4 != 0) goto L_0x02b6
            r0 = 2131430561(0x7f0b0ca1, float:1.8482826E38)
            android.view.View r4 = X.C03570Gk.A0B(r7, r0)
            com.whatsapp.backup.google.GoogleDriveRestoreAnimationView r4 = (com.whatsapp.backup.google.GoogleDriveRestoreAnimationView) r4
            r7.A0F = r4
        L_0x02b6:
            r0 = 4
            r4.A01 = r0
            X.1mu r0 = r4.A02
            if (r0 == 0) goto L_0x02c0
            r0.cancel()
        L_0x02c0:
            r0 = 2131430548(0x7f0b0c94, float:1.84828E38)
            android.view.View r0 = X.C03570Gk.A0B(r7, r0)
            r4 = 8
            if (r2 == 0) goto L_0x031b
            r0.setVisibility(r3)
            r0 = 2131430547(0x7f0b0c93, float:1.8482798E38)
            android.widget.TextView r0 = X.C36401kF.A0H(r7, r0)
            r0.setText(r2)
        L_0x02d8:
            r0 = 2131430491(0x7f0b0c5b, float:1.8482684E38)
            X.C36391kE.A16(r7, r0, r3)
            android.content.SharedPreferences r2 = X.C36331k8.A06(r7)
            java.lang.String r0 = "gdrive_last_restore_file_is_encrypted"
            boolean r0 = r2.getBoolean(r0, r3)
            com.whatsapp.backup.google.RestoreFromBackupActivity.A0j(r7, r0)
            r0 = 2131433400(0x7f0b17b8, float:1.8488585E38)
            X.C36391kE.A16(r7, r0, r3)
            r0 = 2131430557(0x7f0b0c9d, float:1.8482818E38)
            X.C36391kE.A16(r7, r0, r4)
            com.whatsapp.backup.google.GoogleDriveRestoreAnimationView r0 = r7.A0F
            r0.setVisibility(r4)
            android.widget.ProgressBar r0 = r7.A02
            r0.setVisibility(r4)
            android.widget.TextView r0 = r7.A04
            r0.setVisibility(r4)
            r0 = 2131429664(0x7f0b0920, float:1.8481007E38)
            android.view.View r0 = X.C03570Gk.A0B(r7, r0)
            X.C36421kH.A10(r0, r7, r4)
            android.widget.Button r0 = r7.A01
            r0.setText(r8)
            android.widget.Button r0 = r7.A01
            r0.setOnClickListener(r1)
            return
        L_0x031b:
            r0.setVisibility(r4)
            goto L_0x02d8
        L_0x031f:
            r1 = 2131889890(0x7f120ee2, float:1.9414456E38)
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r3] = r5
            java.lang.String r2 = X.C36341k9.A0e(r7, r0, r8, r9, r1)
            X.9v1 r1 = new X.9v1
            r1.<init>(r11, r5, r7)
            goto L_0x0294
        L_0x0331:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "restore>RestoreFromBackupActivity/display-msgstore-download-error/unexpected/"
            r1.append(r0)
            r1.append(r4)
            goto L_0x03c4
        L_0x033f:
            r1 = 2131889894(0x7f120ee6, float:1.9414464E38)
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.String r2 = X.C36341k9.A0e(r7, r0, r8, r3, r1)
            r0 = 6
            X.6cg r1 = new X.6cg
            r1.<init>(r7, r0)
            goto L_0x0294
        L_0x0350:
            r0 = -1
            java.lang.String r2 = "msgstore_bytes_to_be_downloaded"
            long r5 = r6.getLong(r2, r0)
            java.lang.String r10 = r7.getString(r8)
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x038d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "restore>RestoreFromBackupActivity/display-msgstore-download-error/"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " message store download size: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " is invalid"
            X.C36321k7.A1Z(r1, r0)
            r2 = 2131889893(0x7f120ee5, float:1.9414462E38)
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r3] = r10
        L_0x0382:
            java.lang.String r2 = r7.getString(r2, r1)
            X.3Yr r1 = new X.3Yr
            r1.<init>(r7)
            goto L_0x0294
        L_0x038d:
            r2 = 2131889892(0x7f120ee4, float:1.941446E38)
            java.lang.Object[] r1 = new java.lang.Object[r11]
            X.0ts r0 = r7.A00
            java.lang.String r0 = X.AnonymousClass3TF.A03(r0, r5)
            r1[r3] = r0
            r1[r9] = r10
            goto L_0x0382
        L_0x039d:
            r2 = 2131889896(0x7f120ee8, float:1.9414469E38)
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r0 = 2131889895(0x7f120ee7, float:1.9414466E38)
            java.lang.String r2 = X.C36341k9.A0e(r7, r1, r0, r3, r2)
            r0 = 7
            X.6cg r1 = new X.6cg
            r1.<init>(r7, r0)
            r8 = 2131895273(0x7f1223e9, float:1.9425374E38)
            goto L_0x0294
        L_0x03b4:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "restore>RestoreFromBackupActivity/display-msgstore-download-error/unhandled-error/"
            r1.append(r0)
            java.lang.String r0 = X.C34191gb.A02(r4)
            r1.append(r0)
        L_0x03c4:
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x03cb:
            r1 = r2
            goto L_0x0294
        L_0x03ce:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "restore>RestoreFromBackupActivity/display-msgstore-download-error failed to display error "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " since Activity is about to finish."
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            goto L_0x001d
        L_0x03e2:
            java.lang.Object r0 = r3.A01
            androidx.biometric.BiometricFragment r0 = (androidx.biometric.BiometricFragment) r0
            X.7yg r1 = r0.A01
            X.3HL r7 = r1.A04
            if (r7 != 0) goto L_0x03f4
            r0 = 0
            X.4Va r7 = new X.4Va
            r7.<init>(r1, r0)
            r1.A04 = r7
        L_0x03f4:
            int r1 = r3.A00
            java.lang.Object r4 = r3.A02
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r0 = r7 instanceof X.C39091rA
            if (r0 == 0) goto L_0x0459
            X.1rA r7 = (X.C39091rA) r7
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "DeviceAuthenticationPlugin/AuthenticationCallback/errorCode: "
            X.C36321k7.A1T(r0, r2, r1)
            java.util.Set r0 = X.C39091rA.A03
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.contains(r2)
            r4 = 0
            if (r0 == 0) goto L_0x0435
            X.0wN r3 = r7.A00
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "DeviceAuthenticationPlugin/FatalError/"
            r2.append(r0)
            java.lang.String r0 = r7.A02
            java.lang.String r2 = X.AnonymousClass000.A0q(r0, r2)
            java.lang.String r0 = java.lang.String.valueOf(r1)
            r3.A0E(r2, r0, r4)
            X.4QP r1 = r7.A01
            r0 = 2
        L_0x0431:
            r1.BRa(r0)
            return
        L_0x0435:
            java.util.Set r0 = X.C39091rA.A04
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x0ad9
            X.0wN r3 = r7.A00
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "DeviceAuthenticationPlugin/TemporaryError/"
            r2.append(r0)
            java.lang.String r0 = r7.A02
            java.lang.String r2 = X.AnonymousClass000.A0q(r0, r2)
            java.lang.String r0 = java.lang.String.valueOf(r1)
            r3.A0E(r2, r0, r4)
            X.4QP r1 = r7.A01
            r0 = 3
            goto L_0x0431
        L_0x0459:
            boolean r0 = r7 instanceof X.C39081r9
            if (r0 == 0) goto L_0x0534
            X.1r9 r7 = (X.C39081r9) r7
            r6 = 1
            X.AnonymousClass00C.A0D(r4, r6)
            java.lang.String r0 = "ChatLockAuthActivity/error"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 13
            if (r1 != r0) goto L_0x0498
            X.3eK r2 = r7.A04
            X.3Kr r0 = r2.A02
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x0498
            X.2rQ r0 = r7.A01
            boolean r0 = r0 instanceof X.AnonymousClass2EP
            if (r0 != 0) goto L_0x0498
            X.38z r1 = r7.A03
            X.18z r0 = r1.A04
            X.005 r0 = r0.A0G
            java.lang.Object r3 = r0.get()
            X.3eJ r3 = (X.C69923eJ) r3
            X.155 r4 = r1.A01
            X.2rQ r5 = r1.A02
            int r8 = r1.A00
            X.3eE r6 = r1.A03
            r7 = 0
            r3.B1b(r4, r5, r6, r7, r8)
        L_0x0494:
            r0 = 0
            r2.A00 = r0
            return
        L_0x0498:
            X.4PZ r5 = r7.A02
            int r10 = r7.A00
            X.3eE r5 = (X.C69873eE) r5
            java.lang.String r0 = "ChatLockAuthCallbackBase/autherr"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 4
            java.lang.Integer[] r2 = new java.lang.Integer[r0]
            r0 = 12
            X.AnonymousClass000.A1J(r2, r0)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            r2[r6] = r9
            r0 = 11
            X.C36331k8.A1V(r2, r0)
            java.lang.Integer r0 = X.C36401kF.A0k()
            r8 = 3
            r2[r8] = r0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            boolean r0 = X.AnonymousClass02R.A0F(r3, r2)
            if (r0 == 0) goto L_0x04e1
            X.1ct r4 = r5.A01
            X.2oS r1 = X.C51832oS.ERROR_AUTH_NOT_SETUP
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            X.3Is r2 = new X.3Is
            r2.<init>(r1, r0, r9)
        L_0x04d4:
            r4.Bf7(r2)
            X.3eK r2 = r7.A04
            X.3L5 r1 = r2.A01
            X.2rQ r0 = r7.A01
            r1.A02(r0, r3)
            goto L_0x0494
        L_0x04e1:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            r0 = 32
            r2.append(r0)
            r2.append(r4)
            java.lang.String r0 = " code "
            java.lang.String r4 = X.AnonymousClass000.A0r(r0, r2, r1)
            r0 = 7
            if (r1 != r0) goto L_0x0507
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            X.155 r1 = r5.A00
            r0 = 2131887744(0x7f120680, float:1.9410104E38)
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r4 = X.AnonymousClass000.A0l(r4, r0, r2)
        L_0x0507:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Chatlock auth err "
            X.C36321k7.A1J(r4, r0, r1)
            java.lang.Integer[] r1 = new java.lang.Integer[r8]
            r0 = 5
            X.AnonymousClass000.A1J(r1, r0)
            r0 = 10
            X.AnonymousClass000.A1L(r1, r0, r6)
            r0 = 13
            X.C36331k8.A1V(r1, r0)
            boolean r0 = X.AnonymousClass02R.A0F(r3, r1)
            X.1ct r4 = r5.A01
            if (r0 == 0) goto L_0x0531
            X.2oS r1 = X.C51832oS.CANCELED
        L_0x052a:
            r0 = 0
            X.3Is r2 = new X.3Is
            r2.<init>(r1, r0, r0)
            goto L_0x04d4
        L_0x0531:
            X.2oS r1 = X.C51832oS.ERROR
            goto L_0x052a
        L_0x0534:
            X.4Va r7 = (X.C89044Va) r7
            int r0 = r7.A01
            switch(r0) {
                case 1: goto L_0x0adf;
                case 2: goto L_0x053c;
                default: goto L_0x053b;
            }
        L_0x053b:
            return
        L_0x053c:
            java.lang.String r0 = "AppAuthenticationActivity/error"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r6 = r7.A00
            com.whatsapp.authentication.AppAuthenticationActivity r6 = (com.whatsapp.authentication.AppAuthenticationActivity) r6
            r6.A00 = 3
            X.18U r0 = X.C36401kF.A0R(r6)
            r5 = 1
            r0.A02(r5)
            r0 = 7
            if (r1 != r0) goto L_0x0020
            java.lang.String r0 = "AppAuthenticationActivity/error-too-many-attempts"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.17Y r4 = r6.A05
            r3 = 2131886491(0x7f12019b, float:1.9407562E38)
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r1 = 0
            r0 = 30
            X.AnonymousClass000.A1L(r2, r0, r1)
            java.lang.String r0 = r6.getString(r3, r2)
            r4.A0E(r0, r5)
            return
        L_0x056f:
            r0.BXl(r2, r1)
            return
        L_0x0573:
            java.lang.Object r1 = r3.A01
            com.whatsapp.xfamily.accountlinking.ui.AccountLinkingWebAuthActivity r1 = (com.whatsapp.xfamily.accountlinking.ui.AccountLinkingWebAuthActivity) r1
            int r0 = r3.A00
            java.lang.Object r4 = r3.A02
            java.lang.Integer r4 = (java.lang.Integer) r4
            r3 = 0
            X.AnonymousClass00C.A0D(r1, r3)
            X.5Fd r2 = r1.A3i()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 0
            r2.A00(r0, r1, r4, r3)
            return
        L_0x058e:
            int r0 = r3.A00
            java.lang.Object r1 = r3.A01
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            java.lang.Object r4 = r3.A02
            com.whatsapp.util.DocumentWarningDialogFragment r4 = (com.whatsapp.util.DocumentWarningDialogFragment) r4
            r3 = 1
            X.AnonymousClass00C.A0D(r1, r3)
            X.2OK r2 = new X.2OK
            r2.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A00 = r0
            X.3Qa r0 = r1.A1J
            X.11F r1 = r0.A00
            if (r1 == 0) goto L_0x05d1
            X.16D r0 = r4.A04
            if (r0 == 0) goto L_0x05da
            X.141 r1 = r0.A08(r1)
        L_0x05b5:
            java.lang.Integer r0 = X.C36381kD.A0m()
            r2.A01 = r0
            if (r1 == 0) goto L_0x05c9
            boolean r0 = r1.A0B()
            if (r0 == 0) goto L_0x05c9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r2.A01 = r0
        L_0x05c9:
            X.0yW r0 = r4.A07
            if (r0 == 0) goto L_0x05d3
            r0.Bly(r2)
            return
        L_0x05d1:
            r1 = 0
            goto L_0x05b5
        L_0x05d3:
            java.lang.String r0 = "wamRuntime"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x05da:
            java.lang.RuntimeException r0 = X.C36331k8.A0Z()
            throw r0
        L_0x05df:
            java.lang.Object r4 = r3.A01
            android.view.View r4 = (android.view.View) r4
            java.lang.Object r2 = r3.A02
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r1 = -1
            r0 = 2
            X.AnonymousClass00C.A0D(r2, r0)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r1, r1)
            r4.setLayoutParams(r0)
            r2.run()
            return
        L_0x05f8:
            java.lang.Object r7 = r3.A01
            com.whatsapp.ptv.PushToVideoRecordingCountdown r7 = (com.whatsapp.ptv.PushToVideoRecordingCountdown) r7
            int r6 = r7.A00
            r0 = 1
            int r6 = r6 - r0
            if (r6 <= 0) goto L_0x061b
            android.content.Context r5 = r7.getContext()
            X.0yb r4 = r7.A03
            android.content.Context r2 = r7.getContext()
            r1 = 2131886108(0x7f12001c, float:1.9406786E38)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            X.C36331k8.A1W(r0, r6)
            java.lang.String r0 = r2.getString(r1, r0)
            X.C33521fV.A00(r5, r4, r0)
        L_0x061b:
            com.whatsapp.ptv.PushToVideoRecordingCountdown.A01(r7, r6)
            android.os.Handler r2 = r7.A08
            if (r6 != 0) goto L_0x062c
            java.lang.Object r3 = r3.A02
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            long r0 = r7.A01
        L_0x0628:
            r2.postDelayed(r3, r0)
            return
        L_0x062c:
            int r0 = r3.A00
            long r0 = (long) r0
            goto L_0x0628
        L_0x0630:
            java.lang.Object r6 = r3.A01
            com.whatsapp.pnh.RequestPhoneNumberViewModel r6 = (com.whatsapp.pnh.RequestPhoneNumberViewModel) r6
            java.lang.Object r5 = r3.A02
            X.13w r5 = (X.C223313w) r5
            int r7 = r3.A00
            X.1X4 r8 = r6.A02
            X.19w r0 = r8.A11
            X.3Qa r4 = X.C36411kG.A0o(r5, r0)
            X.0wo r0 = r8.A0K
            long r2 = X.C19970wo.A00(r0)
            X.2bN r1 = new X.2bN
            r1.<init>(r4, r2)
            X.0xM r0 = r8.A0X
            r0.A0h(r1)
            X.1FV r8 = r6.A04
            monitor-enter(r8)
            X.12j r0 = r8.A03     // Catch:{ all -> 0x0685 }
            long r3 = r0.A07(r5)     // Catch:{ all -> 0x0685 }
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0679
            boolean r0 = r8.A0B(r5)     // Catch:{ all -> 0x0685 }
            if (r0 != 0) goto L_0x0679
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0685 }
            X.1FW r0 = r8.A04     // Catch:{ all -> 0x0685 }
            boolean r0 = r0.A03(r3, r1)     // Catch:{ all -> 0x0685 }
            if (r0 == 0) goto L_0x0679
            X.AnonymousClass1FV.A02(r8, r3, r1)     // Catch:{ all -> 0x0685 }
            X.AnonymousClass1FV.A03(r8, r5, r3)     // Catch:{ all -> 0x0685 }
        L_0x0679:
            monitor-exit(r8)
            X.1FX r2 = r6.A05
            r1 = 3
            r0 = 1
            r2.A00(r5, r1, r7, r0)
            com.whatsapp.pnh.RequestPhoneNumberViewModel.A01(r5, r6)
            return
        L_0x0685:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x0688:
            java.lang.Object r2 = r3.A01
            X.3Kp r2 = (X.C63583Kp) r2
            java.lang.Object r1 = r3.A02
            X.13w r1 = (X.C223313w) r1
            int r0 = r3.A00
            r2.A02(r1, r0)
            return
        L_0x0696:
            java.lang.Object r5 = r3.A01
            X.3Ai r5 = (X.C61043Ai) r5
            java.lang.Object r4 = r3.A02
            X.6vi r4 = (X.C146506vi) r4
            int r2 = r3.A00
            X.1D0 r1 = r5.A06
            r0 = 0
            r1.A0E(r4, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.util.HashMap r0 = r5.A00
            r0.put(r1, r4)
            return
        L_0x06b0:
            java.lang.Object r1 = r3.A01
            X.3lT r1 = (X.C74353lT) r1
            java.lang.Object r8 = r3.A02
            X.0yK r8 = (X.C20890yK) r8
            int r7 = r3.A00
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x06cd
            X.0yJ r0 = r1.A06
            X.0wk r0 = r0.A01
            r0.A01()
            X.0yR r0 = r1.A05
            r0.A01()
            r0 = 1
            r1.A00 = r0
        L_0x06cd:
            X.005 r0 = r1.A07
            java.lang.Object r6 = r0.get()
            X.10w r6 = (X.C219110w) r6
            int r5 = r8.code
            int r4 = r8.psId
            int r3 = r8.bufferChannel
            r2 = 3
            r1 = 2
            r0 = 1
            if (r3 == 0) goto L_0x06f3
            if (r3 == r0) goto L_0x06f1
            if (r3 == r1) goto L_0x06f5
            if (r3 == r2) goto L_0x06f6
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unsupported channel type: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0d(r0, r1, r3)
            throw r0
        L_0x06f1:
            r2 = 1
            goto L_0x06f6
        L_0x06f3:
            r2 = 0
            goto L_0x06f6
        L_0x06f5:
            r2 = 2
        L_0x06f6:
            java.util.Map r17 = r8.getFieldsMap()
            com.whatsapp.wamsys.JniBridge r6 = (com.whatsapp.wamsys.JniBridge) r6
            long r8 = (long) r5
            long r10 = (long) r7
            long r12 = (long) r4
            long r14 = (long) r2
            java.util.concurrent.atomic.AtomicReference r0 = r6.wajContext
            java.lang.Object r16 = r0.get()
            com.whatsapp.wamsys.JniBridge.jvidispatchIIIIIOO(r8, r10, r12, r14, r16, r17)
            return
        L_0x070a:
            java.lang.Object r4 = r3.A01
            X.1X4 r4 = (X.AnonymousClass1X4) r4
            java.lang.Object r2 = r3.A02
            X.3T1 r2 = (X.AnonymousClass3T1) r2
            int r1 = r3.A00
            r0 = 0
            r4.A0V(r2, r1, r0, r0)
            return
        L_0x0719:
            java.lang.Object r0 = r3.A01
            X.3QW r0 = (X.AnonymousClass3QW) r0
            java.lang.Object r4 = r3.A02
            X.3T1 r4 = (X.AnonymousClass3T1) r4
            int r2 = r3.A00
            r1 = 0
            X.1Rf r0 = r0.A06
            r0.A01(r4, r2, r1)
            return
        L_0x072a:
            int r0 = r3.A00
            if (r0 <= 0) goto L_0x0734
            java.lang.Object r0 = r3.A01
        L_0x0730:
            X.C36411kG.A1O(r0)
            return
        L_0x0734:
            java.lang.Object r0 = r3.A02
            goto L_0x0730
        L_0x0737:
            java.lang.Object r1 = r3.A01
            X.2KN r1 = (X.AnonymousClass2KN) r1
            java.lang.Object r4 = r3.A02
            X.3T1 r4 = (X.AnonymousClass3T1) r4
            int r0 = r3.A00
            r2 = 1
            X.9Qz r1 = r1.A05
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00(r4, r0, r2)
            return
        L_0x074c:
            java.lang.Object r1 = r3.A01
            X.2KL r1 = (X.AnonymousClass2KL) r1
            java.lang.Object r4 = r3.A02
            X.3T1 r4 = (X.AnonymousClass3T1) r4
            int r0 = r3.A00
            X.9Qz r2 = r1.A04
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2
            r2.A00(r4, r1, r0)
            return
        L_0x0761:
            java.lang.Object r0 = r3.A01
            X.2KK r0 = (X.AnonymousClass2KK) r0
            java.lang.Object r4 = r3.A02
            X.3T1 r4 = (X.AnonymousClass3T1) r4
            int r2 = r3.A00
            X.1JN r1 = r0.A01
            r0 = 2
            X.AnonymousClass1JN.A00(r1, r4, r0, r2)
            return
        L_0x0772:
            java.lang.Object r0 = r3.A01
            X.2i9 r0 = (X.C48842i9) r0
            java.lang.Object r4 = r3.A02
            X.3JY r4 = (X.AnonymousClass3JY) r4
            int r2 = r3.A00
            X.1zD r1 = r0.A04
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.1LV r1 = r1.A06
            com.whatsapp.jid.GroupJid r0 = r4.A01
            r1.A0A(r0, r2)
            return
        L_0x0788:
            java.lang.Object r2 = r3.A01
            X.6YM r2 = (X.AnonymousClass6YM) r2
            int r1 = r3.A00
            java.lang.Object r0 = r3.A02
            java.util.List r0 = (java.util.List) r0
            r2.A0S(r1, r0)
            return
        L_0x0796:
            java.lang.Object r0 = r3.A01
            X.6zT r0 = (X.C148816zT) r0
            int r2 = r3.A00
            java.lang.Object r1 = r3.A02
            com.whatsapp.voipcalling.CallInfo r1 = (com.whatsapp.voipcalling.CallInfo) r1
            X.6YM r0 = r0.A0C
            r0.A0b(r1, r2)
            return
        L_0x07a6:
            java.lang.Object r4 = r3.A01
            X.7j2 r4 = (X.C159237j2) r4
            java.lang.Object r2 = r3.A02
            X.9HF r2 = (X.AnonymousClass9HF) r2
            int r1 = r3.A00
            r0 = 1
            X.AnonymousClass00C.A0D(r2, r0)
            r4.BXp(r2, r1)
            return
        L_0x07b8:
            java.lang.Object r4 = r3.A01
            X.14u r4 = (X.C225314u) r4
            java.lang.Object r0 = r3.A02
            com.google.android.gms.auth.UserRecoverableAuthException r0 = (com.google.android.gms.auth.UserRecoverableAuthException) r0
            int r2 = r3.A00
            android.content.Intent r1 = r0.zza
            if (r1 != 0) goto L_0x07cb
            r0 = 0
        L_0x07c7:
            r4.BuO(r0, r2)
            return
        L_0x07cb:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1)
            goto L_0x07c7
        L_0x07d1:
            java.lang.Object r5 = r3.A01
            int r4 = r3.A00
            java.lang.Object r3 = r3.A02
            java.util.concurrent.ExecutorService r2 = java.util.concurrent.Executors.newSingleThreadExecutor()
            r1 = 7
            X.3wq r0 = new X.3wq
            r0.<init>(r5, r4, r1, r3)
            r2.execute(r0)
            return
        L_0x07e5:
            java.lang.Object r4 = r3.A01
            com.whatsapp.accountswitching.secondaryprocess.AccountSwitchingActivity r4 = (com.whatsapp.accountswitching.secondaryprocess.AccountSwitchingActivity) r4
            int r6 = r3.A00
            java.lang.Object r3 = r3.A02
            android.content.ContentResolver r1 = r4.getContentResolver()
            java.lang.String r0 = "com.whatsapp.accountswitching.AccountSwitchingContentProvider"
            android.content.ContentProviderClient r5 = r1.acquireUnstableContentProviderClient(r0)
            if (r5 == 0) goto L_0x089d
            r2 = 0
            r0 = 1
            if (r6 == r0) goto L_0x085a
            r0 = 2
            if (r6 == r0) goto L_0x0838
            r0 = 3
            if (r6 == r0) goto L_0x081a
            r0 = 4
            if (r6 != r0) goto L_0x0853
            android.content.Intent r0 = r4.getIntent()     // Catch:{ RemoteException -> 0x085f, IllegalStateException -> 0x0879, all -> 0x087f }
            java.lang.String r1 = "remove_account_lid"
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch:{ RemoteException -> 0x085f, IllegalStateException -> 0x0879, all -> 0x087f }
            android.os.Bundle r1 = X.C36431kI.A0I(r1, r0)     // Catch:{ RemoteException -> 0x085f, IllegalStateException -> 0x0879, all -> 0x087f }
            java.lang.String r0 = "remove_account"
            r5.call(r0, r2, r1)     // Catch:{ RemoteException -> 0x085f, IllegalStateException -> 0x0879, all -> 0x087f }
            goto L_0x085f
        L_0x081a:
            android.content.Intent r0 = r4.getIntent()     // Catch:{ RemoteException -> 0x085f, IllegalStateException -> 0x0879, all -> 0x087f }
            java.lang.String r6 = "switch_to_account_lid"
            java.lang.String r1 = r0.getStringExtra(r6)     // Catch:{ RemoteException -> 0x085f, IllegalStateException -> 0x0879, all -> 0x087f }
            if (r1 == 0) goto L_0x0836
            int r0 = r1.length()     // Catch:{ RemoteException -> 0x085f, IllegalStateException -> 0x0879, all -> 0x087f }
            if (r0 == 0) goto L_0x0836
            android.os.Bundle r1 = X.C36431kI.A0I(r6, r1)     // Catch:{ RemoteException -> 0x085f, IllegalStateException -> 0x0879, all -> 0x087f }
        L_0x0830:
            java.lang.String r0 = "abandon_add_account"
            r5.call(r0, r2, r1)     // Catch:{ RemoteException -> 0x085f, IllegalStateException -> 0x0879, all -> 0x087f }
            goto L_0x085f
        L_0x0836:
            r1 = r2
            goto L_0x0830
        L_0x0838:
            android.content.Intent r0 = r4.getIntent()     // Catch:{ RemoteException -> 0x085f, IllegalStateException -> 0x0879, all -> 0x087f }
            java.lang.String r1 = "switch_to_account_lid"
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch:{ RemoteException -> 0x085f, IllegalStateException -> 0x0879, all -> 0x087f }
            if (r0 == 0) goto L_0x084e
            android.os.Bundle r1 = X.C36431kI.A0I(r1, r0)     // Catch:{ RemoteException -> 0x085f, IllegalStateException -> 0x0879, all -> 0x087f }
            java.lang.String r0 = "switch_account"
            r5.call(r0, r2, r1)     // Catch:{ RemoteException -> 0x085f, IllegalStateException -> 0x0879, all -> 0x087f }
            goto L_0x085f
        L_0x084e:
            java.lang.IllegalStateException r0 = X.C36381kD.A0l()     // Catch:{ RemoteException -> 0x085f, IllegalStateException -> 0x0879, all -> 0x087f }
            goto L_0x0859
        L_0x0853:
            java.lang.String r0 = "AccountSwitchingActivity/one of the flags should be set"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)     // Catch:{ RemoteException -> 0x085f, IllegalStateException -> 0x0879, all -> 0x087f }
        L_0x0859:
            throw r0     // Catch:{ RemoteException -> 0x085f, IllegalStateException -> 0x0879, all -> 0x087f }
        L_0x085a:
            java.lang.String r0 = "add_account"
            r5.call(r0, r2, r2)     // Catch:{ RemoteException -> 0x085f, IllegalStateException -> 0x0879, all -> 0x087f }
        L_0x085f:
            com.whatsapp.accountswitching.secondaryprocess.AccountSwitchingActivity.A01(r5)
            java.lang.String r1 = "account_switching"
            r0 = 0
            java.io.File r1 = r4.getDir(r1, r0)
            java.lang.String r0 = "checkpoint"
            java.io.File r0 = X.C36441kJ.A0w(r1, r0)
            boolean r0 = r0.exists()
            r0 = r0 ^ 1
            com.whatsapp.accountswitching.secondaryprocess.AccountSwitchingActivity.A0F(r4, r0)
            return
        L_0x0879:
            java.lang.String r0 = "kill_process"
            r5.call(r0, r2, r2)     // Catch:{ RemoteException -> 0x0884, all -> 0x087f }
            goto L_0x0884
        L_0x087f:
            r0 = move-exception
            com.whatsapp.accountswitching.secondaryprocess.AccountSwitchingActivity.A01(r5)
            throw r0
        L_0x0884:
            com.whatsapp.accountswitching.secondaryprocess.AccountSwitchingActivity.A01(r5)
            android.os.Handler r2 = r4.A00
            if (r2 != 0) goto L_0x0892
            java.lang.String r0 = "mainThreadHandler"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0892:
            r1 = 42
            X.74N r0 = new X.74N
            r0.<init>(r4, r3, r1)
            r2.post(r0)
            return
        L_0x089d:
            java.lang.IllegalStateException r0 = X.C36381kD.A0l()
            throw r0
        L_0x08a2:
            java.lang.Object r1 = r3.A02
            com.google.android.gms.vision.clearcut.DynamiteClearcutLogger r1 = (com.google.android.gms.vision.clearcut.DynamiteClearcutLogger) r1
            java.util.concurrent.ExecutorService r0 = com.google.android.gms.vision.clearcut.DynamiteClearcutLogger.zza
            com.google.android.gms.vision.clearcut.VisionClearcutLogger r2 = r1.zzc
            int r1 = r3.A00
            java.lang.Object r0 = r3.A01
            X.8ER r0 = (X.AnonymousClass8ER) r0
            r2.zza(r1, r0)
            return
        L_0x08b4:
            java.lang.Object r0 = r3.A01
            androidx.work.impl.foreground.SystemForegroundService r0 = (androidx.work.impl.foreground.SystemForegroundService) r0
            android.app.NotificationManager r2 = r0.A01
            int r1 = r3.A00
            java.lang.Object r0 = r3.A02
            android.app.Notification r0 = (android.app.Notification) r0
            r2.notify(r1, r0)
            return
        L_0x08c4:
            java.lang.Object r2 = r3.A01
            X.6ik r2 = (X.C138816ik) r2
            java.lang.Object r1 = r3.A02
            android.content.Intent r1 = (android.content.Intent) r1
            int r0 = r3.A00
            r2.A02(r1, r0)
            return
        L_0x08d2:
            java.lang.Object r2 = r3.A01
            X.B0P r2 = (X.B0P) r2
            int r1 = r3.A00
            java.lang.Object r0 = r3.A02
            r2.BfO(r1, r0)
            return
        L_0x08de:
            java.lang.Object r0 = r3.A01
            X.9mx r0 = (X.C202929mx) r0
            int r2 = r3.A00
            java.lang.Object r1 = r3.A02
            X.B0P r0 = r0.A04
            r0.BfO(r2, r1)
            return
        L_0x08ec:
            java.lang.Object r2 = r3.A01
            androidx.biometric.BiometricFragment r2 = (androidx.biometric.BiometricFragment) r2
            int r1 = r3.A00
            java.lang.Object r0 = r3.A02
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            androidx.biometric.BiometricFragment.A07(r2, r0, r1)
            r2.A1Y()
            return
        L_0x08fd:
            return
        L_0x08fe:
            return
        L_0x08ff:
            java.lang.Object r5 = r3.A01
            X.1uY r5 = (X.C40011uY) r5
            java.lang.Object r4 = r3.A02
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            int r10 = r3.A00
            X.16D r0 = r5.A0A
            X.141 r8 = r0.A08(r4)
            if (r8 != 0) goto L_0x0aa4
            r8 = 0
        L_0x0912:
            X.396 r2 = r5.A0C
            X.0yC r3 = r2.A03
            X.0yV r1 = X.C21000yV.A01
            r0 = 3261(0xcbd, float:4.57E-42)
            boolean r0 = X.C20800yB.A01(r1, r3, r0)
            if (r0 == 0) goto L_0x0ad0
            r3 = 0
            X.16D r0 = r2.A00
            X.141 r7 = r0.A08(r4)
            if (r7 == 0) goto L_0x0a82
            java.lang.String r6 = r7.A0J()
            r10 = 0
            if (r6 == 0) goto L_0x0a9c
            java.lang.String r0 = r7.A0R
            if (r0 == 0) goto L_0x0a9c
            boolean r0 = X.AnonymousClass099.A0O(r6, r0, r10)
            if (r0 == 0) goto L_0x0a9c
            java.lang.String r1 = r7.A0R
        L_0x093c:
            java.lang.String r0 = r7.A0Q
            if (r0 == 0) goto L_0x0aa1
            boolean r0 = X.AnonymousClass099.A0O(r6, r0, r10)
            if (r0 == 0) goto L_0x0aa1
            java.lang.String r12 = r7.A0Q
        L_0x0948:
            X.171 r0 = r2.A01
            java.lang.String r9 = r0.A0O(r7)
            X.3J1 r7 = new X.3J1
            r7.<init>(r1, r12, r9)
            java.util.HashMap r6 = r2.A04
            boolean r0 = r6.containsKey(r7)
            if (r0 != 0) goto L_0x0a7c
            X.3TP r2 = r2.A02
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0a99
            java.lang.String r1 = r1.trim()
            X.0ts r0 = r2.A00
            java.util.Locale r0 = X.C36401kF.A0x(r0)
            java.lang.String r11 = r1.toUpperCase(r0)
        L_0x0971:
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x0a96
            java.lang.String r1 = r12.trim()
            X.0ts r0 = r2.A00
            java.util.Locale r0 = X.C36401kF.A0x(r0)
            java.lang.String r14 = r1.toUpperCase(r0)
        L_0x0985:
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x0a93
            java.lang.String r1 = r9.trim()
            X.0ts r0 = r2.A00
            java.util.Locale r0 = X.C36401kF.A0x(r0)
            java.lang.String r2 = r1.toUpperCase(r0)
        L_0x0999:
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r16 = 1
            if (r0 != 0) goto L_0x09aa
            java.util.regex.Pattern r0 = X.AnonymousClass3TP.A09
            boolean r0 = X.C36361kB.A1Z(r11, r0)
            r12 = 1
            if (r0 == 0) goto L_0x09ab
        L_0x09aa:
            r12 = 0
        L_0x09ab:
            if (r11 == 0) goto L_0x09b6
            java.util.List r0 = X.AnonymousClass3TP.A02
            boolean r0 = X.AnonymousClass3TP.A01(r11, r0)
            r1 = 1
            if (r0 != 0) goto L_0x09b7
        L_0x09b6:
            r1 = 0
        L_0x09b7:
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L_0x09c0
            r9 = 1
            if (r1 == 0) goto L_0x09c1
        L_0x09c0:
            r9 = 0
        L_0x09c1:
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 != 0) goto L_0x09d2
            java.util.regex.Pattern r0 = X.AnonymousClass3TP.A09
            boolean r0 = X.C36361kB.A1Z(r11, r0)
            if (r0 == 0) goto L_0x09d2
            if (r9 != 0) goto L_0x09d2
            r12 = 1
        L_0x09d2:
            if (r11 == 0) goto L_0x09e3
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x09e3
            if (r14 == 0) goto L_0x09e3
            boolean r0 = r14.isEmpty()
            r1 = 1
            if (r0 != 0) goto L_0x09e4
        L_0x09e3:
            r1 = 0
        L_0x09e4:
            if (r12 != 0) goto L_0x09f1
            if (r9 != 0) goto L_0x09f1
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x09f1
            r15 = 1
            if (r1 == 0) goto L_0x09f2
        L_0x09f1:
            r15 = 0
        L_0x09f2:
            r0 = 3
            boolean[] r1 = new boolean[r0]
            r1[r10] = r12
            r1[r16] = r9
            r0 = 2
            r1[r0] = r15
            boolean r0 = r1[r10]
            boolean r9 = r1[r16]
            r12 = 2
            if (r0 == 0) goto L_0x0a06
            r1 = 1
            if (r9 == 0) goto L_0x0a07
        L_0x0a06:
            r1 = 0
        L_0x0a07:
            r13 = 0
            if (r0 == 0) goto L_0x0a91
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 != 0) goto L_0x0a91
            java.lang.String r11 = X.AnonymousClass3TP.A00(r11, r1)
        L_0x0a14:
            if (r9 == 0) goto L_0x0a8f
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L_0x0a8f
            java.lang.String r9 = X.AnonymousClass3TP.A00(r14, r10)
        L_0x0a20:
            if (r15 == 0) goto L_0x0a2d
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0a2d
            java.lang.String r11 = X.AnonymousClass3TP.A00(r2, r1)
            r9 = r3
        L_0x0a2d:
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 != 0) goto L_0x0a8d
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x0a8d
            java.util.List r0 = X.AnonymousClass3TP.A01
            java.util.Iterator r2 = r0.iterator()
        L_0x0a3f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0a57
            java.lang.Object r1 = r2.next()
            java.util.regex.Pattern r1 = (java.util.regex.Pattern) r1
            boolean r0 = X.C36361kB.A1Z(r11, r1)
            if (r0 == 0) goto L_0x0a3f
            boolean r0 = X.C36361kB.A1Z(r9, r1)
            if (r0 != 0) goto L_0x0a8d
        L_0x0a57:
            java.lang.String[] r2 = new java.lang.String[r12]
            r2[r10] = r11
            r2[r16] = r13
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            r0 = r2[r10]
            if (r0 == 0) goto L_0x0a68
            r1.append(r0)
        L_0x0a68:
            r0 = r2[r16]
            if (r0 == 0) goto L_0x0a6f
            r1.append(r0)
        L_0x0a6f:
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0a79
            java.lang.String r3 = r1.toString()
        L_0x0a79:
            r6.put(r7, r3)
        L_0x0a7c:
            java.lang.Object r3 = r6.get(r7)
            java.lang.String r3 = (java.lang.String) r3
        L_0x0a82:
            X.08S r1 = r5.A01
            X.36S r0 = new X.36S
            r0.<init>(r8, r4, r3)
        L_0x0a89:
            r1.A0C(r0)
            return
        L_0x0a8d:
            r13 = r9
            goto L_0x0a57
        L_0x0a8f:
            r9 = r3
            goto L_0x0a20
        L_0x0a91:
            r11 = r3
            goto L_0x0a14
        L_0x0a93:
            r2 = 0
            goto L_0x0999
        L_0x0a96:
            r14 = 0
            goto L_0x0985
        L_0x0a99:
            r11 = 0
            goto L_0x0971
        L_0x0a9c:
            r1 = r3
            if (r6 == 0) goto L_0x0aa1
            goto L_0x093c
        L_0x0aa1:
            r12 = r3
            goto L_0x0948
        L_0x0aa4:
            X.0yC r1 = r5.A0E
            r0 = 3573(0xdf5, float:5.007E-42)
            boolean r0 = r1.A0E(r0)
            r14 = r0 ^ 1
            r0 = 3798(0xed6, float:5.322E-42)
            int r0 = r1.A07(r0)
            r2 = 604800000(0x240c8400, double:2.988109026E-315)
            long r0 = (long) r0
            r6 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 * r6
            long r11 = java.lang.Math.max(r2, r0)
            X.1Ps r6 = r5.A0B
            X.0wG r0 = r5.A0D
            android.content.Context r7 = r0.A00
            r9 = 0
            r13 = 1
            android.graphics.Bitmap r8 = r6.A06(r7, r8, r9, r10, r11, r13, r14)
            if (r8 != 0) goto L_0x0ad0
            goto L_0x0912
        L_0x0ad0:
            r3 = 0
            goto L_0x0a82
        L_0x0ad2:
            java.lang.String r0 = "Unexpected error"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0ad9:
            X.4QP r0 = r7.A01
            r0.BRa(r4)
            return
        L_0x0adf:
            r0 = 7
            if (r1 != r0) goto L_0x0afd
            java.lang.Object r6 = r7.A00
            com.whatsapp.authentication.AppAuthSettingsActivity r6 = (com.whatsapp.authentication.AppAuthSettingsActivity) r6
            X.17Y r5 = r6.A05
            r4 = 2131886492(0x7f12019c, float:1.9407564E38)
            r3 = 1
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r1 = 0
            r0 = 30
            X.AnonymousClass000.A1L(r2, r0, r1)
            java.lang.String r0 = r6.getString(r4, r2)
            r5.A0E(r0, r3)
        L_0x0afd:
            java.lang.String r0 = "AppAuthSettingsActivity/error"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r0 = r7.A00
            com.whatsapp.authentication.AppAuthSettingsActivity r0 = (com.whatsapp.authentication.AppAuthSettingsActivity) r0
            com.whatsapp.authentication.AppAuthSettingsActivity.A0I(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81333wq.run():void");
    }

    public C81333wq(AnonymousClass3QW r2, AnonymousClass3T1 r3, int i) {
        this.A03 = 24;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = i;
    }

    public C81333wq(C23043B1o b1o, C199969gL r3, int i) {
        this.A03 = i;
        this.A01 = r3;
        this.A02 = b1o;
        this.A00 = 4;
    }

    public C81333wq(Object obj, int i, int i2, Object obj2) {
        this.A03 = i2;
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public C81333wq(ImageQualitySettingsBottomSheetFragment imageQualitySettingsBottomSheetFragment, Map map) {
        this.A03 = 28;
        this.A01 = imageQualitySettingsBottomSheetFragment;
        this.A02 = map;
        this.A00 = R.string.f12nameremoved;
    }

    public C81333wq(LinearLayout linearLayout, Runnable runnable) {
        this.A03 = 35;
        this.A01 = linearLayout;
        this.A00 = -1;
        this.A02 = runnable;
    }
}
