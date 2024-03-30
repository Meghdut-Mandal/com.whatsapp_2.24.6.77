package com.whatsapp.waquickpromotionclient.ui;

import X.AnonymousClass155;
import X.C18800tq;
import X.C18830tt;
import X.C31531by;
import X.C31541bz;
import X.C36321k7;
import X.C36331k8;
import X.C89374Wh;

public final class PushPsaNotificationActivity extends AnonymousClass155 {
    public C31541bz A00;
    public C31531by A01;
    public boolean A02;

    public void A2F() {
        if (!this.A02) {
            this.A02 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A00 = (C31541bz) A0B.AXx.get();
            this.A01 = (C31531by) A0B.AXy.get();
        }
    }

    public PushPsaNotificationActivity(int i) {
        this.A02 = false;
        C89374Wh.A00(this, 22);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0083, code lost:
        if (r3 != null) goto L_0x0085;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0096 A[Catch:{ Exception -> 0x00ad }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r15) {
        /*
            r14 = this;
            super.onCreate(r15)
            android.content.Intent r0 = r14.getIntent()
            if (r0 != 0) goto L_0x000f
            java.lang.String r0 = "PushPsaNotificationActivity/null intent"
        L_0x000b:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x000f:
            android.content.Intent r2 = r14.getIntent()
            r1 = 0
            java.lang.String r0 = "is_dismiss_intent"
            boolean r3 = r2.getBooleanExtra(r0, r1)
            android.content.Intent r1 = r14.getIntent()
            java.lang.String r0 = "campaign_id"
            java.lang.String r4 = r1.getStringExtra(r0)
            if (r4 != 0) goto L_0x0029
            java.lang.String r0 = "PushPsaNotificationActiity/null campaign ID"
            goto L_0x000b
        L_0x0029:
            android.content.Intent r1 = r14.getIntent()
            java.lang.String r0 = "eligibility_duration_after_impression_ms"
            r2 = -1
            int r7 = r1.getIntExtra(r0, r2)
            android.content.Intent r1 = r14.getIntent()
            java.lang.String r0 = "surface_id"
            int r5 = r1.getIntExtra(r0, r2)
            if (r3 == 0) goto L_0x004e
            X.1by r2 = r14.A01
            if (r2 == 0) goto L_0x00bf
            X.8zX r3 = X.C188408zX.DISMISS_ACTION
            r6 = 2
            X.C31531by.A00(r2, r3, r4, r5, r6, r7)
        L_0x004a:
            r14.finish()
            return
        L_0x004e:
            android.content.Intent r1 = r14.getIntent()
            java.lang.String r0 = "deep_link"
            java.lang.String r3 = r1.getStringExtra(r0)
            android.content.Intent r1 = r14.getIntent()
            java.lang.String r0 = "universal_link"
            java.lang.String r1 = r1.getStringExtra(r0)
            X.1by r8 = r14.A01
            if (r8 == 0) goto L_0x00cd
            r12 = 1
            X.8zX r9 = X.C188408zX.PRIMARY_ACTION
            r10 = r4
            r11 = r5
            r13 = r7
            X.C31531by.A00(r8, r9, r10, r11, r12, r13)
            X.1bz r2 = r14.A00
            if (r2 == 0) goto L_0x00c6
            if (r3 == 0) goto L_0x007b
            int r0 = r3.length()
            if (r0 != 0) goto L_0x0085
        L_0x007b:
            if (r1 == 0) goto L_0x004a
            int r0 = r1.length()
            if (r0 == 0) goto L_0x004a
            if (r3 == 0) goto L_0x0090
        L_0x0085:
            int r0 = r3.length()     // Catch:{ Exception -> 0x00ad }
            if (r0 == 0) goto L_0x0090
            android.net.Uri r1 = android.net.Uri.parse(r3)     // Catch:{ Exception -> 0x00ad }
            goto L_0x0094
        L_0x0090:
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ Exception -> 0x00ad }
        L_0x0094:
            if (r1 == 0) goto L_0x004a
            if (r3 != 0) goto L_0x00a0
            android.content.Intent r0 = X.C36391kE.A0G(r1)
        L_0x009c:
            X.AnonymousClass00C.A0B(r0)
            goto L_0x00a9
        L_0x00a0:
            X.0wG r0 = r2.A00
            android.content.Context r0 = r0.A00
            android.content.Intent r0 = X.AnonymousClass190.A0P(r0, r1)
            goto L_0x009c
        L_0x00a9:
            r14.startActivity(r0)     // Catch:{ Exception -> 0x00b0 }
            goto L_0x004a
        L_0x00ad:
            java.lang.String r0 = "PushPsaNotificationComposer/Couldn't parse URI"
            goto L_0x00bb
        L_0x00b0:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PushPsaNotificationComposer/couldn't start activity: "
            java.lang.String r0 = X.AnonymousClass000.A0l(r2, r0, r1)
        L_0x00bb:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x004a
        L_0x00bf:
            java.lang.String r0 = "pushPsaNotificationLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00c6:
            java.lang.String r0 = "pushPsaNotificationComposer"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00cd:
            java.lang.String r0 = "pushPsaNotificationLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.waquickpromotionclient.ui.PushPsaNotificationActivity.onCreate(android.os.Bundle):void");
    }

    public PushPsaNotificationActivity() {
        this(0);
    }
}
