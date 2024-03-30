package X;

import android.content.Intent;
import java.io.File;

/* renamed from: X.1P2  reason: invalid class name */
public abstract class AnonymousClass1P2 {
    public final C19460v5 A00;
    public final C20690y0 A01;
    public final AnonymousClass16K A02;
    public final AnonymousClass1BF A03;
    public final AnonymousClass13J A04;
    public final C21060yb A05;
    public final C18820ts A06;
    public final C20810yC A07;
    public final C19770wU A08;
    public final AnonymousClass17Y A09;
    public final C19730wQ A0A;

    public void A05(Intent intent, C225314u r8, int i) {
        A06(intent, r8, r8, (AnonymousClass141) null, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r3 == null) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(android.content.Intent r14, X.C225314u r15, X.C225214t r16, X.AnonymousClass141 r17, int r18) {
        /*
            r13 = this;
            r10 = 0
            r4 = r15
            r9 = r17
            if (r14 == 0) goto L_0x0012
            android.net.Uri r3 = r14.getData()
            java.lang.String r0 = "webImageSource"
            java.lang.String r10 = r14.getStringExtra(r0)
            if (r3 != 0) goto L_0x0032
        L_0x0012:
            java.io.File r0 = r13.A03(r9)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0026
            java.io.File r0 = r13.A03(r9)
            android.net.Uri r3 = android.net.Uri.fromFile(r0)
            if (r3 != 0) goto L_0x0032
        L_0x0026:
            java.lang.String r0 = "profileinfo/cropphoto/no-data"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 2131889286(0x7f120c86, float:1.9413231E38)
            r15.BO5(r0)
            return
        L_0x0032:
            X.0yb r7 = r13.A05
            X.0ts r8 = r13.A06
            X.16K r6 = r13.A02
            int r12 = r13.A01()
            X.2k4 r2 = new X.2k4
            r5 = r16
            r11 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            X.0wU r1 = r13.A08
            r0 = 0
            java.lang.Void[] r0 = new java.lang.Void[r0]
            r1.Bp0(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1P2.A06(android.content.Intent, X.14u, X.14t, X.141, int):void");
    }

    public void A07(AnonymousClass01L r10, AnonymousClass141 r11, int i) {
        A08(r10, r11, i, 1, -1, true, false, false);
    }

    public boolean A09(int i, boolean z) {
        if (z || this.A0A.A0L() || A01() == 1) {
            return false;
        }
        return C20800yB.A01(C21000yV.A02, this.A07, 1396);
    }

    public boolean A0A(AnonymousClass141 r3) {
        File A012 = ((AnonymousClass1P3) this).A04.A01(r3);
        if (A012 == null || !A012.exists()) {
            return false;
        }
        return true;
    }

    public File A02() {
        return C20690y0.A02(this.A01.A0E(), "tmpi");
    }

    public File A03(AnonymousClass141 r5) {
        String rawString;
        C20690y0 r2;
        StringBuilder sb;
        if (r5 instanceof C44112Le) {
            r2 = this.A01;
            sb = new StringBuilder();
            sb.append("tmpi");
            rawString = ((C44112Le) r5).A00;
        } else {
            if (r5 != null) {
                AnonymousClass11F r1 = r5.A0H;
                if (C28981Uw.A00(r1)) {
                    C18740tg.A06(r1);
                    rawString = r1.getRawString();
                    r2 = this.A01;
                    sb = new StringBuilder();
                    sb.append("tmpi");
                }
            }
            return A02();
        }
        sb.append(rawString);
        return C20690y0.A02(r2.A0E(), sb.toString());
    }

    public void A04(Intent intent, C225314u r4) {
        int intExtra = intent.getIntExtra("error_message_id", -1);
        if (intExtra > 0) {
            this.A09.A0C(r4, intExtra);
        }
    }

    public AnonymousClass1P2(C19460v5 r1, C20690y0 r2, AnonymousClass17Y r3, C19730wQ r4, AnonymousClass16K r5, C21060yb r6, C18820ts r7, C20810yC r8, AnonymousClass1BF r9, AnonymousClass13J r10, C19770wU r11) {
        this.A07 = r8;
        this.A09 = r3;
        this.A0A = r4;
        this.A08 = r11;
        this.A01 = r2;
        this.A00 = r1;
        this.A06 = r7;
        this.A04 = r10;
        this.A05 = r6;
        this.A03 = r9;
        this.A02 = r5;
    }

    public int A01() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x03ad, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x03ae, code lost:
        if (r6 != 0) goto L_0x03b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x03b0, code lost:
        r1 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x03b5, code lost:
        if (r6 != 2) goto L_0x03e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x03b7, code lost:
        r1 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x03bb, code lost:
        r3.setClassName(r1, "com.whatsapp.profile.ResetGroupPhoto");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x03c0, code lost:
        r2 = A01();
        r3 = new android.content.Intent();
        r3.setClassName(r13.getPackageName(), "com.whatsapp.profile.ResetPhoto");
        r3.putExtra("photo_type", r2);
        r2 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x03df, code lost:
        if (r19 != null) goto L_0x0272;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x03e3, code lost:
        r9.A00.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x03ef, code lost:
        throw new java.lang.NullPointerException("getCoverPhotoStringId");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0043, code lost:
        if (A0A(r12) == false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        if (r23 == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0048, code lost:
        if (r0 == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        if (r4 == false) goto L_0x0237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        r5 = new android.content.Intent();
        r1 = r13.getPackageName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0057, code lost:
        if (r14 == false) goto L_0x0232;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0059, code lost:
        r5.setClassName(r1, "com.whatsapp.profile.ResetGroupPhoto");
        r5.putExtra("IS_COMMUNITY_KEY", true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0062, code lost:
        r2 = new X.C1273467x(com.whatsapp.R.string.f12nameremoved, com.whatsapp.R.drawable.ic_action_delete, r5);
        r2.A04 = true;
        r2.A00 = com.whatsapp.R.id.menuitem_delete;
        r2.A01 = 2;
        r2.A01(r13.getResources(), com.whatsapp.R.color.f6nameremoved);
        r3.add(r2.A00());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0091, code lost:
        if (r9.A04.BJo() == false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0093, code lost:
        r6 = X.AnonymousClass6YY.A01(r13, A03(r12));
        r5 = new android.content.Intent();
        r5.setClassName(r13.getPackageName(), "com.whatsapp.profile.CapturePhoto");
        r5.putExtra("target_file_uri", r6);
        r6 = new X.C1273467x(com.whatsapp.R.string.f12nameremoved, com.whatsapp.R.drawable.ic_camera, r5.putExtra("should_return_photo_source", r10));
        r6.A01(r13.getResources(), X.C224514j.A00(r13, com.whatsapp.R.attr.f4nameremoved, com.whatsapp.R.color.f6nameremoved));
        r3.add(r6.A00());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d5, code lost:
        r0 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d7, code lost:
        if (r4 == false) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d9, code lost:
        r0 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00db, code lost:
        r1 = X.AnonymousClass190.A0H(r13, r0).putExtra("should_return_photo_source", r10);
        r5 = A01();
        r2 = new X.C1273467x(com.whatsapp.R.string.f12nameremoved, com.whatsapp.R.drawable.ic_attachment_gallery, r1.putExtra("photo_type", r5).putExtra("photo_update_surface_type", r11));
        r2.A01(r13.getResources(), X.C224514j.A00(r13, com.whatsapp.R.attr.f4nameremoved, com.whatsapp.R.color.f6nameremoved));
        r3.add(r2.A00());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x011a, code lost:
        if (A09(r11, r4) == false) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x011c, code lost:
        r8 = new android.content.Intent();
        r8.setClassName(r13.getPackageName(), "com.whatsapp.avatar.profilephoto.AvatarProfilePhotoActivity");
        r2 = new X.C1273467x(com.whatsapp.R.string.f12nameremoved, com.whatsapp.R.drawable.ic_avatar, r8);
        r2.A01(r13.getResources(), X.C224514j.A00(r13, com.whatsapp.R.attr.f4nameremoved, com.whatsapp.R.color.f6nameremoved));
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0147, code lost:
        if (r9.A03.A01() == false) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0149, code lost:
        r0 = 17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x014b, code lost:
        r2.A03 = java.lang.Integer.valueOf(r0);
        r3.add(r2.A00());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0158, code lost:
        if (r25 != false) goto L_0x015c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x015a, code lost:
        if (r4 == false) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x015c, code lost:
        r1 = android.net.Uri.fromFile(r9.A02.A02(r12));
        r8 = new android.content.Intent();
        r8.setClassName(r13, "com.whatsapp.group.GroupProfileEmojiEditor");
        r8.putExtra("emojiEditorImageResult", r1);
        r8.putExtra("emojiEditorProfileTarget", r21);
        r2 = new X.C1273467x(com.whatsapp.R.string.f12nameremoved, com.whatsapp.R.drawable.ic_emoji_solid, r8);
        r2.A01(r13.getResources(), X.C224514j.A00(r13, com.whatsapp.R.attr.f4nameremoved, com.whatsapp.R.color.f6nameremoved));
        r3.add(r2.A00());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0199, code lost:
        if (r19 == null) goto L_0x022e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x019b, code lost:
        r10 = r12.A0J();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x019f, code lost:
        r2 = android.net.Uri.fromFile(A03(r12));
        r8 = new android.content.Intent();
        r8.setClassName(r13.getPackageName(), "com.whatsapp.profile.WebImagePicker");
        r8.putExtra("output", r2);
        r8.putExtra("query", r10);
        r2 = new X.C1273467x(com.whatsapp.R.string.f12nameremoved, com.whatsapp.R.drawable.ic_action_search, r8);
        r2.A01(r13.getResources(), X.C224514j.A00(r13, com.whatsapp.R.attr.f4nameremoved, com.whatsapp.R.color.f6nameremoved));
        r3.add(r2.A00());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01dc, code lost:
        com.whatsapp.util.Log.i("profile/photo/updater/run chooser");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01e1, code lost:
        if (r4 == false) goto L_0x0214;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01e3, code lost:
        r1 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01e6, code lost:
        if (r14 == false) goto L_0x01eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01e8, code lost:
        r1 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01eb, code lost:
        r4 = r13.getSupportFragmentManager();
        r2 = new android.os.Bundle();
        r2.putInt("title_resource", r1);
        r2.putParcelableArrayList("choosable_intents", new java.util.ArrayList(r3));
        r2.putInt("request_code", r15);
        r0 = new com.whatsapp.IntentChooserBottomSheetDialogFragment();
        r0.A17(r2);
        X.C65443Sb.A01(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0213, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0214, code lost:
        if (r5 == 0) goto L_0x022a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0217, code lost:
        if (r5 == 2) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0219, code lost:
        r9.A00.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0225, code lost:
        throw new java.lang.NullPointerException("getCoverPhotoStringId");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0226, code lost:
        r1 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x022a, code lost:
        r1 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x022e, code lost:
        r10 = androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_ICON;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0232, code lost:
        r5.setClassName(r1, "com.whatsapp.profile.ResetGroupPhoto");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0237, code lost:
        r2 = A01();
        r5 = new android.content.Intent();
        r5.setClassName(r13.getPackageName(), "com.whatsapp.profile.ResetPhoto");
        r5.putExtra("photo_type", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0251, code lost:
        if (r19 != null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0270, code lost:
        if (r12.A0J != null) goto L_0x0272;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0277, code lost:
        if (A0A(r12) == false) goto L_0x0279;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0279, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x027a, code lost:
        if (r23 == false) goto L_0x02a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x027c, code lost:
        if (r0 == false) goto L_0x02a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x027e, code lost:
        if (r7 == false) goto L_0x03c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0280, code lost:
        r3 = new android.content.Intent();
        r1 = r13.getPackageName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x028b, code lost:
        if (r16 == false) goto L_0x03bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x028d, code lost:
        r3.setClassName(r1, "com.whatsapp.profile.ResetGroupPhoto");
        r3.putExtra("IS_COMMUNITY_KEY", true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0296, code lost:
        r2 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0299, code lost:
        r8.add(new X.C134926bp(r2, com.whatsapp.R.drawable.clear, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x02a4, code lost:
        r0 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x02a6, code lost:
        if (r7 == false) goto L_0x02aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x02a8, code lost:
        r0 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x02aa, code lost:
        r0 = X.AnonymousClass190.A0H(r13, r0).putExtra("should_return_photo_source", r10);
        r6 = A01();
        r8.add(new X.C134926bp(com.whatsapp.R.string.f12nameremoved, com.whatsapp.R.drawable.ic_gallery, r0.putExtra("photo_type", r6).putExtra("photo_update_surface_type", r11)));
        r3 = X.AnonymousClass6YY.A01(r13, A03(r12));
        r2 = new android.content.Intent();
        r2.setClassName(r13.getPackageName(), "com.whatsapp.profile.CapturePhoto");
        r2.putExtra("target_file_uri", r3);
        r8.add(new X.C134926bp(com.whatsapp.R.string.f12nameremoved, com.whatsapp.R.drawable.ic_capture, r2.putExtra("should_return_photo_source", r10).putExtra("photo_type", r6).putExtra("photo_update_surface_type", r11)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x030b, code lost:
        if (A09(r11, r7) == false) goto L_0x033e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x030d, code lost:
        r3 = new android.content.Intent();
        r3.setClassName(r13.getPackageName(), "com.whatsapp.avatar.profilephoto.AvatarProfilePhotoActivity");
        r2 = new X.C1273467x(com.whatsapp.R.string.f12nameremoved, com.whatsapp.R.drawable.ic_avatar, r3);
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x032d, code lost:
        if (r9.A03.A01() == false) goto L_0x0331;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x032f, code lost:
        r0 = 17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0331, code lost:
        r2.A03 = java.lang.Integer.valueOf(r0);
        r8.add(r2.A00());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x033e, code lost:
        if (r25 != false) goto L_0x0342;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0340, code lost:
        if (r7 == false) goto L_0x0376;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0342, code lost:
        if (r19 == null) goto L_0x0376;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0344, code lost:
        r4 = android.net.Uri.fromFile(A03(r12));
        r2 = r12.A0J();
        r3 = new android.content.Intent();
        r3.setClassName(r13.getPackageName(), "com.whatsapp.profile.WebImagePicker");
        r3.putExtra("output", r4);
        r3.putExtra("query", r2);
        r8.add(new X.C134926bp(com.whatsapp.R.string.f12nameremoved, com.whatsapp.R.drawable.ic_search_web, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0376, code lost:
        com.whatsapp.util.Log.i("profile/photo/updater/run chooser");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x037b, code lost:
        if (r7 == false) goto L_0x03ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x037d, code lost:
        r1 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0380, code lost:
        if (r16 == false) goto L_0x0385;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0382, code lost:
        r1 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0385, code lost:
        r3 = r13.getSupportFragmentManager();
        r2 = new android.os.Bundle();
        r2.putInt("title_resource", r1);
        r2.putParcelableArrayList("choosable_intents", new java.util.ArrayList(r8));
        r2.putInt("request_code", r15);
        r0 = new com.whatsapp.IntentChooserBottomSheetDialogFragment();
        r0.A17(r2);
        X.C65443Sb.A01(r0, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(X.AnonymousClass01L r18, X.AnonymousClass141 r19, int r20, int r21, int r22, boolean r23, boolean r24, boolean r25) {
        /*
            r17 = this;
            r12 = r19
            if (r19 == 0) goto L_0x025b
            X.11F r0 = r12.A0H
        L_0x0006:
            boolean r0 = X.C28981Uw.A00(r0)
            r9 = r17
            if (r0 == 0) goto L_0x0255
            java.io.File r0 = r9.A03(r12)
        L_0x0012:
            r0.delete()
            X.0yC r2 = r9.A07
            r1 = 689(0x2b1, float:9.65E-43)
            X.0yV r0 = X.C21000yV.A02
            boolean r1 = X.C20800yB.A01(r0, r2, r1)
            r0 = 4
            r11 = r22
            r10 = r24
            r15 = r20
            r13 = r18
            if (r1 == 0) goto L_0x025e
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            r14 = 0
            if (r19 == 0) goto L_0x0250
            boolean r0 = r12.A0G()
            if (r0 == 0) goto L_0x0250
            r4 = 1
            X.35K r0 = r12.A0J
            if (r0 == 0) goto L_0x003e
            r14 = 1
        L_0x003e:
            boolean r1 = r9.A0A(r12)
            r0 = 1
            if (r1 != 0) goto L_0x0046
        L_0x0045:
            r0 = 0
        L_0x0046:
            if (r23 == 0) goto L_0x0089
            if (r0 == 0) goto L_0x0089
            if (r4 == 0) goto L_0x0237
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            java.lang.String r1 = r13.getPackageName()
            java.lang.String r0 = "com.whatsapp.profile.ResetGroupPhoto"
            if (r14 == 0) goto L_0x0232
            r5.setClassName(r1, r0)
            java.lang.String r1 = "IS_COMMUNITY_KEY"
            r0 = 1
            r5.putExtra(r1, r0)
        L_0x0062:
            r1 = 2131893540(0x7f121d24, float:1.942186E38)
            r0 = 2131231791(0x7f08042f, float:1.8079673E38)
            X.67x r2 = new X.67x
            r2.<init>(r1, r0, r5)
            r0 = 1
            r2.A04 = r0
            r0 = 2131431648(0x7f0b10e0, float:1.8485031E38)
            r2.A00 = r0
            r0 = 2
            r2.A01 = r0
            android.content.res.Resources r1 = r13.getResources()
            r0 = 2131101065(0x7f060589, float:1.781453E38)
            r2.A01(r1, r0)
            X.6bp r0 = r2.A00()
            r3.add(r0)
        L_0x0089:
            X.13J r0 = r9.A04
            boolean r0 = r0.BJo()
            java.lang.String r2 = "should_return_photo_source"
            if (r0 == 0) goto L_0x00d5
            java.io.File r0 = r9.A03(r12)
            android.net.Uri r6 = X.AnonymousClass6YY.A01(r13, r0)
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            java.lang.String r1 = r13.getPackageName()
            java.lang.String r0 = "com.whatsapp.profile.CapturePhoto"
            r5.setClassName(r1, r0)
            java.lang.String r0 = "target_file_uri"
            r5.putExtra(r0, r6)
            android.content.Intent r5 = r5.putExtra(r2, r10)
            r1 = 2131887559(0x7f1205c7, float:1.9409729E38)
            r0 = 2131232122(0x7f08057a, float:1.8080344E38)
            X.67x r6 = new X.67x
            r6.<init>(r1, r0, r5)
            android.content.res.Resources r5 = r13.getResources()
            r1 = 2130970396(0x7f04071c, float:1.75495E38)
            r0 = 2131102021(0x7f060945, float:1.7816468E38)
            int r0 = X.C224514j.A00(r13, r1, r0)
            r6.A01(r5, r0)
            X.6bp r0 = r6.A00()
            r3.add(r0)
        L_0x00d5:
            r0 = 9
            if (r4 == 0) goto L_0x00db
            r0 = 8
        L_0x00db:
            android.content.Intent r0 = X.AnonymousClass190.A0H(r13, r0)
            android.content.Intent r1 = r0.putExtra(r2, r10)
            int r5 = r9.A01()
            java.lang.String r0 = "photo_type"
            android.content.Intent r1 = r1.putExtra(r0, r5)
            java.lang.String r0 = "photo_update_surface_type"
            android.content.Intent r6 = r1.putExtra(r0, r11)
            r1 = 2131889800(0x7f120e88, float:1.9414274E38)
            r0 = 2131231923(0x7f0804b3, float:1.807994E38)
            X.67x r2 = new X.67x
            r2.<init>(r1, r0, r6)
            android.content.res.Resources r1 = r13.getResources()
            r7 = 2130970396(0x7f04071c, float:1.75495E38)
            r6 = 2131102021(0x7f060945, float:1.7816468E38)
            int r0 = X.C224514j.A00(r13, r7, r6)
            r2.A01(r1, r0)
            X.6bp r0 = r2.A00()
            r3.add(r0)
            boolean r0 = r9.A09(r11, r4)
            if (r0 == 0) goto L_0x0158
            android.content.Intent r8 = new android.content.Intent
            r8.<init>()
            java.lang.String r1 = r13.getPackageName()
            java.lang.String r0 = "com.whatsapp.avatar.profilephoto.AvatarProfilePhotoActivity"
            r8.setClassName(r1, r0)
            r1 = 2131886580(0x7f1201f4, float:1.9407743E38)
            r0 = 2131231943(0x7f0804c7, float:1.8079981E38)
            X.67x r2 = new X.67x
            r2.<init>(r1, r0, r8)
            android.content.res.Resources r1 = r13.getResources()
            int r0 = X.C224514j.A00(r13, r7, r6)
            r2.A01(r1, r0)
            X.1BF r0 = r9.A03
            boolean r1 = r0.A01()
            r0 = 2
            if (r1 == 0) goto L_0x014b
            r0 = 17
        L_0x014b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A03 = r0
            X.6bp r0 = r2.A00()
            r3.add(r0)
        L_0x0158:
            if (r25 != 0) goto L_0x015c
            if (r4 == 0) goto L_0x01dc
        L_0x015c:
            X.16K r0 = r9.A02
            java.io.File r0 = r0.A02(r12)
            android.net.Uri r1 = android.net.Uri.fromFile(r0)
            android.content.Intent r8 = new android.content.Intent
            r8.<init>()
            java.lang.String r0 = "com.whatsapp.group.GroupProfileEmojiEditor"
            r8.setClassName(r13, r0)
            java.lang.String r0 = "emojiEditorImageResult"
            r8.putExtra(r0, r1)
            java.lang.String r0 = "emojiEditorProfileTarget"
            r1 = r21
            r8.putExtra(r0, r1)
            r1 = 2131890291(0x7f121073, float:1.941527E38)
            r0 = 2131232247(0x7f0805f7, float:1.8080598E38)
            X.67x r2 = new X.67x
            r2.<init>(r1, r0, r8)
            android.content.res.Resources r1 = r13.getResources()
            int r0 = X.C224514j.A00(r13, r7, r6)
            r2.A01(r1, r0)
            X.6bp r0 = r2.A00()
            r3.add(r0)
            if (r19 == 0) goto L_0x022e
            java.lang.String r10 = r12.A0J()
        L_0x019f:
            java.io.File r0 = r9.A03(r12)
            android.net.Uri r2 = android.net.Uri.fromFile(r0)
            android.content.Intent r8 = new android.content.Intent
            r8.<init>()
            java.lang.String r1 = r13.getPackageName()
            java.lang.String r0 = "com.whatsapp.profile.WebImagePicker"
            r8.setClassName(r1, r0)
            java.lang.String r0 = "output"
            r8.putExtra(r0, r2)
            java.lang.String r0 = "query"
            r8.putExtra(r0, r10)
            r1 = 2131893882(0x7f121e7a, float:1.9422553E38)
            r0 = 2131231838(0x7f08045e, float:1.8079768E38)
            X.67x r2 = new X.67x
            r2.<init>(r1, r0, r8)
            android.content.res.Resources r1 = r13.getResources()
            int r0 = X.C224514j.A00(r13, r7, r6)
            r2.A01(r1, r0)
            X.6bp r0 = r2.A00()
            r3.add(r0)
        L_0x01dc:
            java.lang.String r0 = "profile/photo/updater/run chooser"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r4 == 0) goto L_0x0214
            r1 = 2131890290(0x7f121072, float:1.9415268E38)
            if (r14 == 0) goto L_0x01eb
            r1 = 2131888091(0x7f1207db, float:1.9410808E38)
        L_0x01eb:
            X.01z r4 = r13.getSupportFragmentManager()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r0 = "title_resource"
            r2.putInt(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r3)
            java.lang.String r0 = "choosable_intents"
            r2.putParcelableArrayList(r0, r1)
            java.lang.String r0 = "request_code"
            r2.putInt(r0, r15)
            com.whatsapp.IntentChooserBottomSheetDialogFragment r0 = new com.whatsapp.IntentChooserBottomSheetDialogFragment
            r0.<init>()
            r0.A17(r2)
            X.C65443Sb.A01(r0, r4)
            return
        L_0x0214:
            if (r5 == 0) goto L_0x022a
            r0 = 2
            if (r5 == r0) goto L_0x0226
            X.0v5 r0 = r9.A00
            r0.A02()
            java.lang.String r1 = "getCoverPhotoStringId"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0226:
            r1 = 2131896864(0x7f122a20, float:1.9428601E38)
            goto L_0x01eb
        L_0x022a:
            r1 = 2131896926(0x7f122a5e, float:1.9428727E38)
            goto L_0x01eb
        L_0x022e:
            java.lang.String r10 = "icon"
            goto L_0x019f
        L_0x0232:
            r5.setClassName(r1, r0)
            goto L_0x0062
        L_0x0237:
            int r2 = r9.A01()
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            java.lang.String r1 = r13.getPackageName()
            java.lang.String r0 = "com.whatsapp.profile.ResetPhoto"
            r5.setClassName(r1, r0)
            java.lang.String r0 = "photo_type"
            r5.putExtra(r0, r2)
            goto L_0x0062
        L_0x0250:
            r4 = 0
            if (r19 == 0) goto L_0x0045
            goto L_0x003e
        L_0x0255:
            java.io.File r0 = r9.A02()
            goto L_0x0012
        L_0x025b:
            r0 = 0
            goto L_0x0006
        L_0x025e:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r0)
            r16 = 1
            if (r19 == 0) goto L_0x03dc
            boolean r0 = r12.A0G()
            if (r0 == 0) goto L_0x03dc
            r7 = 1
            X.35K r0 = r12.A0J
            if (r0 == 0) goto L_0x03dd
        L_0x0272:
            boolean r1 = r9.A0A(r12)
            r0 = 1
            if (r1 != 0) goto L_0x027a
        L_0x0279:
            r0 = 0
        L_0x027a:
            if (r23 == 0) goto L_0x02a4
            if (r0 == 0) goto L_0x02a4
            if (r7 == 0) goto L_0x03c0
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r1 = r13.getPackageName()
            java.lang.String r0 = "com.whatsapp.profile.ResetGroupPhoto"
            if (r16 == 0) goto L_0x03bb
            r3.setClassName(r1, r0)
            java.lang.String r1 = "IS_COMMUNITY_KEY"
            r0 = 1
            r3.putExtra(r1, r0)
        L_0x0296:
            r2 = 2131893539(0x7f121d23, float:1.9421857E38)
        L_0x0299:
            r1 = 2131231324(0x7f08025c, float:1.8078726E38)
            X.6bp r0 = new X.6bp
            r0.<init>(r2, r1, r3)
            r8.add(r0)
        L_0x02a4:
            r0 = 9
            if (r7 == 0) goto L_0x02aa
            r0 = 8
        L_0x02aa:
            android.content.Intent r0 = X.AnonymousClass190.A0H(r13, r0)
            java.lang.String r14 = "should_return_photo_source"
            android.content.Intent r0 = r0.putExtra(r14, r10)
            int r6 = r9.A01()
            java.lang.String r5 = "photo_type"
            android.content.Intent r0 = r0.putExtra(r5, r6)
            java.lang.String r4 = "photo_update_surface_type"
            android.content.Intent r3 = r0.putExtra(r4, r11)
            r2 = 2131889800(0x7f120e88, float:1.9414274E38)
            r1 = 2131232321(0x7f080641, float:1.8080748E38)
            X.6bp r0 = new X.6bp
            r0.<init>(r2, r1, r3)
            r8.add(r0)
            java.io.File r0 = r9.A03(r12)
            android.net.Uri r3 = X.AnonymousClass6YY.A01(r13, r0)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r13.getPackageName()
            java.lang.String r0 = "com.whatsapp.profile.CapturePhoto"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "target_file_uri"
            r2.putExtra(r0, r3)
            android.content.Intent r0 = r2.putExtra(r14, r10)
            android.content.Intent r0 = r0.putExtra(r5, r6)
            android.content.Intent r3 = r0.putExtra(r4, r11)
            r2 = 2131887559(0x7f1205c7, float:1.9409729E38)
            r1 = 2131232133(0x7f080585, float:1.8080367E38)
            X.6bp r0 = new X.6bp
            r0.<init>(r2, r1, r3)
            r8.add(r0)
            boolean r0 = r9.A09(r11, r7)
            if (r0 == 0) goto L_0x033e
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r1 = r13.getPackageName()
            java.lang.String r0 = "com.whatsapp.avatar.profilephoto.AvatarProfilePhotoActivity"
            r3.setClassName(r1, r0)
            r1 = 2131886580(0x7f1201f4, float:1.9407743E38)
            r0 = 2131231943(0x7f0804c7, float:1.8079981E38)
            X.67x r2 = new X.67x
            r2.<init>(r1, r0, r3)
            X.1BF r0 = r9.A03
            boolean r1 = r0.A01()
            r0 = 2
            if (r1 == 0) goto L_0x0331
            r0 = 17
        L_0x0331:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A03 = r0
            X.6bp r0 = r2.A00()
            r8.add(r0)
        L_0x033e:
            if (r25 != 0) goto L_0x0342
            if (r7 == 0) goto L_0x0376
        L_0x0342:
            if (r19 == 0) goto L_0x0376
            java.io.File r0 = r9.A03(r12)
            android.net.Uri r4 = android.net.Uri.fromFile(r0)
            java.lang.String r2 = r12.A0J()
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r1 = r13.getPackageName()
            java.lang.String r0 = "com.whatsapp.profile.WebImagePicker"
            r3.setClassName(r1, r0)
            java.lang.String r0 = "output"
            r3.putExtra(r0, r4)
            java.lang.String r0 = "query"
            r3.putExtra(r0, r2)
            r2 = 2131893882(0x7f121e7a, float:1.9422553E38)
            r1 = 2131232650(0x7f08078a, float:1.8081415E38)
            X.6bp r0 = new X.6bp
            r0.<init>(r2, r1, r3)
            r8.add(r0)
        L_0x0376:
            java.lang.String r0 = "profile/photo/updater/run chooser"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r7 == 0) goto L_0x03ae
            r1 = 2131890290(0x7f121072, float:1.9415268E38)
            if (r16 == 0) goto L_0x0385
            r1 = 2131888091(0x7f1207db, float:1.9410808E38)
        L_0x0385:
            X.01z r3 = r13.getSupportFragmentManager()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r0 = "title_resource"
            r2.putInt(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r8)
            java.lang.String r0 = "choosable_intents"
            r2.putParcelableArrayList(r0, r1)
            java.lang.String r0 = "request_code"
            r2.putInt(r0, r15)
            com.whatsapp.IntentChooserBottomSheetDialogFragment r0 = new com.whatsapp.IntentChooserBottomSheetDialogFragment
            r0.<init>()
            r0.A17(r2)
            X.C65443Sb.A01(r0, r3)
            return
        L_0x03ae:
            if (r6 != 0) goto L_0x03b4
            r1 = 2131896926(0x7f122a5e, float:1.9428727E38)
            goto L_0x0385
        L_0x03b4:
            r0 = 2
            if (r6 != r0) goto L_0x03e3
            r1 = 2131896864(0x7f122a20, float:1.9428601E38)
            goto L_0x0385
        L_0x03bb:
            r3.setClassName(r1, r0)
            goto L_0x0296
        L_0x03c0:
            int r2 = r9.A01()
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r1 = r13.getPackageName()
            java.lang.String r0 = "com.whatsapp.profile.ResetPhoto"
            r3.setClassName(r1, r0)
            java.lang.String r0 = "photo_type"
            r3.putExtra(r0, r2)
            r2 = 2131893540(0x7f121d24, float:1.942186E38)
            goto L_0x0299
        L_0x03dc:
            r7 = 0
        L_0x03dd:
            r16 = 0
            if (r19 == 0) goto L_0x0279
            goto L_0x0272
        L_0x03e3:
            X.0v5 r0 = r9.A00
            r0.A02()
            java.lang.String r1 = "getCoverPhotoStringId"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1P2.A08(X.01L, X.141, int, int, int, boolean, boolean, boolean):void");
    }
}
