package X;

/* renamed from: X.3Gv  reason: invalid class name and case insensitive filesystem */
public final class C62613Gv {
    public final int A00;
    public final int A01;
    public final int A02;
    public final AnonymousClass4V2 A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public C62613Gv(AnonymousClass4V2 r2, String str, String str2, int i, int i2, int i3, boolean z) {
        AnonymousClass00C.A0D(str2, 4);
        this.A02 = i;
        this.A01 = i2;
        this.A04 = str;
        this.A05 = str2;
        this.A03 = r2;
        this.A00 = i3;
        this.A06 = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.app.Activity r29, android.os.Bundle r30, int r31) {
        /*
            r28 = this;
            r24 = r31
            r10 = 0
            r9 = 1
            r13 = r28
            int r3 = r13.A02
            java.lang.String r2 = "bucketId"
            r0 = 9
            if (r3 != r0) goto L_0x0179
            android.net.Uri r15 = X.AnonymousClass2UH.A00
        L_0x0010:
            android.net.Uri$Builder r1 = r15.buildUpon()
            java.lang.String r0 = r13.A04
            android.net.Uri$Builder r0 = r1.appendQueryParameter(r2, r0)
            android.net.Uri r15 = r0.build()
            X.AnonymousClass00C.A08(r15)
        L_0x0021:
            r27 = r29
            android.content.Intent r23 = r27.getIntent()
            java.lang.String r0 = r13.A05
            r26 = r0
            r12 = 7
            switch(r3) {
                case 0: goto L_0x0176;
                case 1: goto L_0x0173;
                case 2: goto L_0x0170;
                case 3: goto L_0x002f;
                case 4: goto L_0x0176;
                case 5: goto L_0x0173;
                case 6: goto L_0x0170;
                default: goto L_0x002f;
            }
        L_0x002f:
            int r0 = r13.A01
            r12 = r12 & r0
            r11 = r30
            if (r30 == 0) goto L_0x0158
            java.lang.String r0 = "preview"
            boolean r22 = r11.getBoolean(r0, r9)
            r0 = 0
            java.lang.String r2 = "quoted_message_row_id"
            long r6 = r11.getLong(r2, r0)
            java.lang.String r0 = "quoted_group_jid"
            java.lang.String r21 = r11.getString(r0)
            java.lang.String r0 = "jid"
            java.lang.String r20 = r11.getString(r0)
            java.lang.String r0 = "android.intent.extra.TEXT"
            java.lang.String r19 = r11.getString(r0)
            java.lang.String r1 = "max_items"
            r0 = r24
            int r24 = r11.getInt(r1, r0)
            java.lang.String r0 = "skip_max_items_new_limit"
            boolean r18 = r11.getBoolean(r0)
            java.lang.String r0 = "is_in_multi_select_mode_only"
            boolean r17 = r11.getBoolean(r0)
            java.lang.String r0 = "mentions"
            java.lang.String r16 = r11.getString(r0)
            java.lang.String r2 = "picker_open_time"
            r0 = 0
            long r3 = r11.getLong(r2, r0)
            java.lang.String r0 = "should_send_media"
            boolean r14 = r11.getBoolean(r0, r9)
            java.lang.String r0 = "should_hide_caption_view"
            boolean r8 = r11.getBoolean(r0, r10)
            java.lang.String r0 = "disable_shared_activity_transition_animation"
            boolean r5 = r11.getBoolean(r0, r10)
            java.lang.String r0 = "should_set_gallery_result"
            boolean r2 = r11.getBoolean(r0, r10)
        L_0x0090:
            boolean r0 = r13.A06
            r25 = r0
            if (r30 == 0) goto L_0x0155
            java.lang.String r0 = "is_send_as_document"
            boolean r13 = r11.getBoolean(r0, r10)
        L_0x009c:
            android.content.Intent r1 = X.C36391kE.A0G(r15)
            java.lang.String r15 = r27.getPackageName()
            java.lang.String r0 = "com.whatsapp.gallery.NewMediaPicker"
            r1.setClassName(r15, r0)
            java.lang.String r0 = "window_title"
            r15 = r26
            r1.putExtra(r0, r15)
            java.lang.String r0 = "include_media"
            r1.putExtra(r0, r12)
            java.lang.String r12 = "preview"
            r0 = r22
            r1.putExtra(r12, r0)
            java.lang.String r0 = "quoted_message_row_id"
            r1.putExtra(r0, r6)
            java.lang.String r6 = "quoted_group_jid"
            r0 = r21
            r1.putExtra(r6, r0)
            java.lang.String r6 = "jid"
            r0 = r20
            r1.putExtra(r6, r0)
            java.lang.String r6 = "android.intent.extra.TEXT"
            r0 = r19
            r1.putExtra(r6, r0)
            java.lang.String r6 = "max_items"
            r0 = r24
            r1.putExtra(r6, r0)
            java.lang.String r6 = "skip_max_items_new_limit"
            r0 = r18
            r1.putExtra(r6, r0)
            java.lang.String r6 = "is_in_multi_select_mode_only"
            r0 = r17
            r1.putExtra(r6, r0)
            java.lang.String r6 = "mentions"
            r0 = r16
            r1.putExtra(r6, r0)
            java.lang.String r0 = "picker_open_time"
            r1.putExtra(r0, r3)
            java.lang.String r0 = "should_send_media"
            r1.putExtra(r0, r14)
            java.lang.String r0 = "should_hide_caption_view"
            r1.putExtra(r0, r8)
            java.lang.String r0 = "disable_shared_activity_transition_animation"
            r1.putExtra(r0, r5)
            java.lang.String r0 = "should_set_gallery_result"
            r1.putExtra(r0, r2)
            java.lang.String r2 = "is_favorite_filter_enabled"
            r0 = r25
            r1.putExtra(r2, r0)
            java.lang.String r0 = "is_send_as_document"
            r1.putExtra(r0, r13)
            X.AnonymousClass00C.A0B(r23)
            java.lang.String r4 = "camera_origin"
            r0 = r23
            boolean r2 = r0.hasExtra(r4)
            java.lang.String r3 = "origin"
            r0 = 1
            if (r2 == 0) goto L_0x014e
            r0 = r23
            int r2 = r0.getIntExtra(r4, r9)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            int r0 = X.AnonymousClass3LY.A00(r0, r2, r10)
        L_0x0135:
            r1.putExtra(r3, r0)
            X.00I[] r2 = new X.AnonymousClass00I[r10]
            r0 = r27
            X.0Gb r0 = X.AnonymousClass0YW.A01(r0, r2)
            android.app.ActivityOptions r0 = r0.A00
            android.os.Bundle r3 = r0.toBundle()
            r2 = 90
            r0 = r27
            X.AnonymousClass0XN.A02(r0, r1, r3, r2)
            return
        L_0x014e:
            if (r30 == 0) goto L_0x0135
            int r0 = r11.getInt(r3, r9)
            goto L_0x0135
        L_0x0155:
            r13 = 0
            goto L_0x009c
        L_0x0158:
            r22 = 1
            r21 = 0
            r20 = 0
            r19 = 0
            r18 = 0
            r17 = 0
            r16 = 0
            r6 = 0
            r3 = 0
            r14 = 1
            r8 = 0
            r5 = 0
            r2 = 0
            goto L_0x0090
        L_0x0170:
            r12 = 2
            goto L_0x002f
        L_0x0173:
            r12 = 4
            goto L_0x002f
        L_0x0176:
            r12 = 1
            goto L_0x002f
        L_0x0179:
            r0 = 4
            boolean r0 = X.C36371kC.A1T(r3, r0)
            android.net.Uri r15 = android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI
            if (r0 != 0) goto L_0x0010
            X.AnonymousClass00C.A09(r15)
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62613Gv.A00(android.app.Activity, android.os.Bundle, int):void");
    }
}
