package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import java.util.ArrayList;

/* renamed from: X.3US  reason: invalid class name */
public final class AnonymousClass3US {
    public static final Intent A02(Context context, int i, int i2, boolean z) {
        AnonymousClass3FM r3 = new AnonymousClass3FM(context);
        r3.A01 = R.drawable.permission_contacts_small;
        r3.A0C = new String[]{"android.permission.GET_ACCOUNTS", "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"};
        r3.A02 = i;
        r3.A0A = null;
        r3.A03 = i2;
        r3.A08 = null;
        r3.A06 = z;
        return r3.A02();
    }

    public static final Intent A03(Context context, int i, int i2, boolean z) {
        AnonymousClass00C.A0D(context, 0);
        AnonymousClass3FM r1 = new AnonymousClass3FM(context);
        r1.A01 = R.drawable.permission_storage;
        r1.A0C = AnonymousClass3TA.A04();
        r1.A02 = i;
        r1.A03 = i2;
        r1.A06 = z;
        return r1.A02();
    }

    public static final void A07(Activity activity, C20830yE r7, int i, boolean z) {
        int i2;
        AnonymousClass00C.A0D(r7, 1);
        if (!activity.isFinishing() && (!r7.A0A())) {
            ArrayList A00 = C20830yE.A00();
            AnonymousClass00C.A0D(A00, 0);
            ArrayList A15 = C36441kJ.A15(A00);
            AnonymousClass3FM r3 = new AnonymousClass3FM(activity);
            if (Build.VERSION.SDK_INT >= 28) {
                A15.add("android.permission.READ_CALL_LOG");
                A15.add("android.permission.ANSWER_PHONE_CALLS");
                r3.A0C = C36371kC.A1b(A15, 0);
                r3.A02 = R.string.f12nameremoved;
                i2 = R.string.f12nameremoved;
            } else {
                A15.add("android.permission.CALL_PHONE");
                r3.A0C = C36371kC.A1b(A15, 0);
                r3.A02 = R.string.f12nameremoved;
                i2 = R.string.f12nameremoved;
            }
            r3.A03 = i2;
            r3.A04 = R.string.f12nameremoved;
            r3.A06 = true;
            r3.A06 = true;
            r3.A07 = z;
            activity.startActivityForResult(r3.A02(), i);
        }
    }

    public static final void A08(C19420v0 r8, String[] strArr) {
        for (String str : strArr) {
            C36331k8.A0w(C19420v0.A00(r8), str, true);
            String[] strArr2 = AnonymousClass1P6.A09;
            int i = 0;
            while (true) {
                String str2 = strArr2[i];
                if (str2 != str && (str == null || str2 == null || !str.equals(str2))) {
                    i++;
                    if (i >= 2) {
                        break;
                    }
                } else {
                    r8.A1x(true);
                    C36331k8.A0w(C19420v0.A00(r8), "nearby_location_new_user", true);
                }
            }
            r8.A1x(true);
            C36331k8.A0w(C19420v0.A00(r8), "nearby_location_new_user", true);
        }
    }

    public static final boolean A09(Activity activity, String[] strArr) {
        AnonymousClass00C.A0D(strArr, 1);
        for (String A0D : strArr) {
            if (!C03570Gk.A0D(activity, A0D)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean A0A(C19420v0 r5, String[] strArr) {
        boolean A1a = C36341k9.A1a(r5, strArr);
        for (String A2U : strArr) {
            if (r5.A2U(A2U)) {
                return false;
            }
        }
        return A1a;
    }

    public final Intent A0B(Context context, C20830yE r10, int i) {
        AnonymousClass3FM A00;
        char A1a = C36341k9.A1a(context, r10);
        int[] iArr = (int[]) C36371kC.A0r(RequestPermissionActivity.A0C, i);
        boolean z = false;
        boolean A1a2 = C36361kB.A1a(r10.A04(), C51512nw.DENIED);
        if (r10.A02("android.permission.CAMERA") != 0) {
            z = true;
        }
        if (iArr == null) {
            C36321k7.A1S("conversation/check/camera/storage/permissions/unexpected request code ", AnonymousClass000.A0u(), i);
        } else if (z) {
            if (A1a2) {
                A00 = new AnonymousClass3FM(context);
                int[] iArr2 = new int[3];
                C36421kH.A1O(iArr2, R.drawable.permission_storage, 0, A1a);
                iArr2[2] = R.drawable.permission_cam;
                A00.A09 = iArr2;
                A00.A0C = AnonymousClass3TA.A00();
                A00.A02 = iArr[0];
                A00.A03 = iArr[A1a];
            } else {
                A00 = AnonymousClass3FM.A00(context);
                A00.A02 = iArr[4];
                A00.A03 = iArr[5];
                AnonymousClass3FM.A01(A00, "android.permission.CAMERA");
            }
            A00.A06 = false;
            return A00.A02();
        } else if (A1a2) {
            return A00(context, C53112qn.A00());
        }
        return null;
    }

    public final void A0D(Activity activity, int i) {
        AnonymousClass00C.A0D(activity, 0);
        if (!activity.isFinishing()) {
            activity.startActivityForResult(A00(activity, C53112qn.A00()), i);
        }
    }

    public final void A0E(Activity activity, C20830yE r10) {
        Intent A02;
        AnonymousClass00C.A0D(r10, 1);
        if (!activity.isFinishing()) {
            boolean z = true;
            if (r10.A02("android.permission.SEND_SMS") == 0) {
                z = false;
            }
            boolean z2 = !r10.A0F();
            if (!z) {
                AnonymousClass3FM r2 = new AnonymousClass3FM(activity);
                r2.A01 = R.drawable.permission_call;
                r2.A0C = C36371kC.A1b(C20830yE.A00(), 0);
                r2.A02 = R.string.f12nameremoved;
                r2.A03 = R.string.f12nameremoved;
                r2.A06 = false;
                A02 = r2.A02();
            } else if (z2) {
                ArrayList A0I = AnonymousClass001.A0I();
                A0I.add("android.permission.SEND_SMS");
                A0I.addAll(C20830yE.A00());
                AnonymousClass3FM r5 = new AnonymousClass3FM(activity);
                int[] iArr = new int[3];
                C36421kH.A1O(iArr, R.drawable.permission_sms, 0, 1);
                iArr[2] = R.drawable.permission_call;
                r5.A09 = iArr;
                r5.A0C = C36371kC.A1b(A0I, 0);
                r5.A02 = R.string.f12nameremoved;
                r5.A03 = R.string.f12nameremoved;
                r5.A06 = false;
                A02 = r5.A02();
            } else {
                AnonymousClass3FM r1 = new AnonymousClass3FM(activity);
                r1.A01 = R.drawable.permission_sms;
                AnonymousClass3FM.A01(r1, "android.permission.SEND_SMS");
                r1.A02 = R.string.f12nameremoved;
                r1.A03 = R.string.f12nameremoved;
                r1.A06 = false;
                A02 = r1.A02();
            }
            activity.startActivityForResult(A02, 153);
        }
    }

    public final boolean A0J(Context context, C20830yE r5) {
        boolean A1a = C36341k9.A1a(context, r5);
        if (!(!r5.A0B())) {
            return A1a;
        }
        context.startActivity(A00(context, C53112qn.A00()));
        return false;
    }

    public static final AnonymousClass3FM A04(Activity activity, String str) {
        AnonymousClass3FM r1 = new AnonymousClass3FM(activity);
        r1.A01 = R.drawable.permission_wifi;
        AnonymousClass3FM.A01(r1, "android.permission.NEARBY_WIFI_DEVICES");
        r1.A04 = R.string.f12nameremoved;
        r1.A05 = str;
        return r1;
    }

    public static final void A05(Activity activity, AnonymousClass17Y r12, C20830yE r13, AnonymousClass13J r14, boolean z) {
        boolean z2;
        int i;
        AnonymousClass3FM r4;
        String[] strArr;
        int A04 = C36361kB.A04(r12, r14, 1);
        AnonymousClass00C.A0D(r13, 3);
        boolean A1Q = C36431kI.A1Q(r13.A0C() ? 1 : 0);
        if (!z || (Build.VERSION.SDK_INT >= 23 ? r13.A02("android.permission.CAMERA") == 0 : r13.A00.A00.checkCallingOrSelfPermission("android.permission.CAMERA") == 0)) {
            z2 = false;
        } else {
            z2 = true;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("request/permission/checkCameraAndMicPermissionsForVoipCall needMicPerm = ");
        A0u.append(A1Q);
        C36321k7.A1X(", needCameraPerm = ", A0u, z2);
        if (Build.VERSION.SDK_INT >= 23) {
            C023409w r42 = C023409w.A00;
            if (z2) {
                if (A1Q) {
                    ArrayList A03 = AnonymousClass03T.A03("android.permission.CAMERA", "android.permission.RECORD_AUDIO");
                    A03.addAll(r42);
                    r4 = new AnonymousClass3FM(activity);
                    int[] iArr = new int[3];
                    C36421kH.A1O(iArr, R.drawable.permission_mic, 0, 1);
                    iArr[A04] = R.drawable.permission_cam;
                    r4.A09 = iArr;
                    r4.A0C = C36371kC.A1b(A03, 0);
                    r4.A02 = R.string.f12nameremoved;
                    r4.A03 = R.string.f12nameremoved;
                } else {
                    r4 = AnonymousClass3FM.A00(activity);
                    r4.A02 = R.string.f12nameremoved;
                    r4.A03 = R.string.f12nameremoved;
                    strArr = new String[]{"android.permission.CAMERA"};
                    r4.A0C = strArr;
                }
            } else if (A1Q) {
                ArrayList A032 = AnonymousClass03T.A03("android.permission.RECORD_AUDIO");
                A032.addAll(r42);
                r4 = new AnonymousClass3FM(activity);
                r4.A01 = R.drawable.permission_mic;
                r4.A02 = R.string.f12nameremoved;
                r4.A03 = R.string.f12nameremoved;
                strArr = C36371kC.A1b(A032, 0);
                r4.A0C = strArr;
            } else {
                return;
            }
            r4.A06 = true;
            activity.startActivityForResult(r4.A02(), 152);
            return;
        }
        if (z2) {
            i = R.string.f12nameremoved;
            if (A1Q) {
                i = R.string.f12nameremoved;
            }
        } else if (A1Q) {
            i = R.string.f12nameremoved;
        } else {
            return;
        }
        r12.A04(i, 1);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [boolean, int] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0118  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(android.app.Activity r9, X.AnonymousClass17Y r10, boolean r11, boolean r12, boolean r13) {
        /*
            r4 = 813(0x32d, float:1.139E-42)
            r7 = 0
            boolean r3 = X.C36341k9.A1a(r9, r10)
            if (r11 != 0) goto L_0x000e
            if (r12 != 0) goto L_0x000e
            if (r13 != 0) goto L_0x000e
            return
        L_0x000e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "request/permission/requestPermissionsForRecordingPushToVideo needMicPerm = "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = ", needCameraPermission = "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = ", needStoragePermission = "
            X.C36321k7.A1X(r0, r1, r13)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 >= r0) goto L_0x0055
            if (r11 == 0) goto L_0x0046
            if (r12 == 0) goto L_0x003d
            r0 = 2131887504(0x7f120590, float:1.9409617E38)
            if (r13 == 0) goto L_0x0039
            r0 = 2131887505(0x7f120591, float:1.9409619E38)
        L_0x0039:
            r10.A04(r0, r3)
            return
        L_0x003d:
            r0 = 2131887506(0x7f120592, float:1.940962E38)
            if (r13 == 0) goto L_0x0039
            r0 = 2131887507(0x7f120593, float:1.9409623E38)
            goto L_0x0039
        L_0x0046:
            if (r12 == 0) goto L_0x0051
            r0 = 2131887508(0x7f120594, float:1.9409625E38)
            if (r13 == 0) goto L_0x0039
            r0 = 2131887509(0x7f120595, float:1.9409627E38)
            goto L_0x0039
        L_0x0051:
            r0 = 2131887510(0x7f120596, float:1.940963E38)
            goto L_0x0039
        L_0x0055:
            java.util.ArrayList r1 = X.AnonymousClass001.A0I()
            if (r11 == 0) goto L_0x0060
            java.lang.String r0 = "android.permission.CAMERA"
            r1.add(r0)
        L_0x0060:
            if (r12 == 0) goto L_0x0067
            java.lang.String r0 = "android.permission.RECORD_AUDIO"
            r1.add(r0)
        L_0x0067:
            if (r13 == 0) goto L_0x0070
            java.lang.String[] r0 = X.AnonymousClass3TA.A04()
            X.AnonymousClass03Y.A0D(r1, r0)
        L_0x0070:
            java.lang.String[] r5 = X.C36371kC.A1b(r1, r7)
            r6 = 33
            r2 = 30
            r8 = 2
            if (r11 == 0) goto L_0x00e8
            if (r12 == 0) goto L_0x00ca
            if (r13 == 0) goto L_0x00b7
            r0 = 3
            int[] r1 = new int[r0]
            r0 = 2131233468(0x7f080abc, float:1.8083074E38)
            r1[r7] = r0
            r0 = 2131233478(0x7f080ac6, float:1.8083095E38)
            X.C36421kH.A1O(r1, r0, r3, r8)
            r7 = 2131892796(0x7f121a3c, float:1.942035E38)
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 >= r2) goto L_0x00ae
            r2 = 2131892795(0x7f121a3b, float:1.9420348E38)
        L_0x0097:
            X.3FM r0 = new X.3FM
            r0.<init>(r9)
            r0.A09 = r1
            r0.A02 = r7
            r0.A03 = r2
            r0.A0C = r5
            r0.A06 = r3
            android.content.Intent r0 = r0.A02()
            r9.startActivityForResult(r0, r4)
            return
        L_0x00ae:
            r2 = 2131892798(0x7f121a3e, float:1.9420354E38)
            if (r0 >= r6) goto L_0x0097
            r2 = 2131892797(0x7f121a3d, float:1.9420352E38)
            goto L_0x0097
        L_0x00b7:
            int[] r1 = new int[r8]
            r0 = 2131233468(0x7f080abc, float:1.8083074E38)
            r1[r7] = r0
            r0 = 2131233478(0x7f080ac6, float:1.8083095E38)
            r1[r3] = r0
            r7 = 2131892794(0x7f121a3a, float:1.9420346E38)
            r2 = 2131892793(0x7f121a39, float:1.9420344E38)
            goto L_0x0097
        L_0x00ca:
            if (r13 == 0) goto L_0x0108
            int[] r1 = new int[r8]
            r0 = 2131233468(0x7f080abc, float:1.8083074E38)
            X.C36421kH.A1O(r1, r0, r7, r3)
            r7 = 2131892804(0x7f121a44, float:1.9420367E38)
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 >= r2) goto L_0x00df
            r2 = 2131892803(0x7f121a43, float:1.9420365E38)
            goto L_0x0097
        L_0x00df:
            r2 = 2131892806(0x7f121a46, float:1.942037E38)
            if (r0 >= r6) goto L_0x0097
            r2 = 2131892805(0x7f121a45, float:1.9420369E38)
            goto L_0x0097
        L_0x00e8:
            if (r12 == 0) goto L_0x0108
            if (r13 == 0) goto L_0x0108
            int[] r1 = new int[r8]
            r0 = 2131233478(0x7f080ac6, float:1.8083095E38)
            X.C36421kH.A1O(r1, r0, r7, r3)
            r7 = 2131892869(0x7f121a85, float:1.9420498E38)
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 >= r2) goto L_0x00ff
            r2 = 2131892868(0x7f121a84, float:1.9420496E38)
            goto L_0x0097
        L_0x00ff:
            r2 = 2131892871(0x7f121a87, float:1.9420503E38)
            if (r0 >= r6) goto L_0x0097
            r2 = 2131892870(0x7f121a86, float:1.94205E38)
            goto L_0x0097
        L_0x0108:
            int[] r1 = new int[r3]
            if (r11 == 0) goto L_0x0118
            r0 = 2131233468(0x7f080abc, float:1.8083074E38)
            r1[r7] = r0
            r7 = 2131892802(0x7f121a42, float:1.9420363E38)
            r2 = 2131892801(0x7f121a41, float:1.942036E38)
            goto L_0x0097
        L_0x0118:
            if (r12 == 0) goto L_0x0127
            r0 = 2131233478(0x7f080ac6, float:1.8083095E38)
            r1[r7] = r0
            r7 = 2131892867(0x7f121a83, float:1.9420494E38)
            r2 = 2131892866(0x7f121a82, float:1.9420492E38)
            goto L_0x0097
        L_0x0127:
            r0 = 2131233481(0x7f080ac9, float:1.80831E38)
            r1[r7] = r0
            r7 = 2131892989(0x7f121afd, float:1.9420742E38)
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 >= r2) goto L_0x0138
            r2 = 2131892988(0x7f121afc, float:1.942074E38)
            goto L_0x0097
        L_0x0138:
            r2 = 2131892991(0x7f121aff, float:1.9420746E38)
            if (r0 >= r6) goto L_0x0097
            r2 = 2131892990(0x7f121afe, float:1.9420744E38)
            goto L_0x0097
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3US.A06(android.app.Activity, X.17Y, boolean, boolean, boolean):void");
    }

    public final void A0C(Activity activity) {
        if (!activity.isFinishing()) {
            AnonymousClass3FM r2 = new AnonymousClass3FM(activity);
            r2.A01 = R.drawable.permission_call;
            r2.A0C = C36371kC.A1b(C20830yE.A00(), 0);
            r2.A02 = R.string.f12nameremoved;
            r2.A03 = R.string.f12nameremoved;
            r2.A06 = true;
            activity.startActivityForResult(r2.A02(), 155);
        }
    }

    public final boolean A0G(Activity activity, C20830yE r8) {
        if (r8.A0D()) {
            return true;
        }
        int i = Build.VERSION.SDK_INT;
        int i2 = R.string.f12nameremoved;
        if (i < 30) {
            i2 = R.string.f12nameremoved;
        }
        activity.startActivityForResult(A03(activity, R.string.f12nameremoved, i2, false), 151);
        return false;
    }

    public final boolean A0K(AnonymousClass02E r8, C20830yE r9) {
        if (r9.A0D()) {
            return true;
        }
        Context A0a = r8.A0a();
        int i = Build.VERSION.SDK_INT;
        int i2 = R.string.f12nameremoved;
        if (i < 30) {
            i2 = R.string.f12nameremoved;
        }
        r8.startActivityForResult(A03(A0a, R.string.f12nameremoved, i2, false), 151);
        return false;
    }

    public static final Intent A00(Context context, int i) {
        String[] A02 = AnonymousClass3TA.A02();
        AnonymousClass3FM r1 = new AnonymousClass3FM(context);
        r1.A01 = R.drawable.permission_storage;
        r1.A0C = A02;
        r1.A02 = R.string.f12nameremoved;
        r1.A03 = i;
        r1.A06 = false;
        return r1.A02();
    }

    public static final Intent A01(Context context, int i, int i2) {
        String[] A03 = AnonymousClass3TA.A03();
        AnonymousClass3FM r1 = new AnonymousClass3FM(context);
        r1.A01 = R.drawable.permission_storage;
        r1.A0C = A03;
        r1.A02 = i;
        r1.A03 = i2;
        r1.A06 = false;
        return r1.A02();
    }

    public final void A0F(AnonymousClass02E r5, C19420v0 r6, String[] strArr) {
        C36321k7.A0x(r6, strArr);
        A08(r6, strArr);
        if (r5.A0K != null) {
            AnonymousClass01z A0l = r5.A0l();
            if (A0l.A02 != null) {
                A0l.A0B.addLast(new C08750bG(r5.A0W, 100));
                A0l.A02.A02(strArr);
                return;
            }
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Fragment ");
        A0u.append(r5);
        throw AnonymousClass000.A0g(" not attached to Activity", A0u);
    }

    public final boolean A0H(Activity activity, C20830yE r5, int i, int i2, int i3) {
        C36321k7.A0w(activity, r5);
        String[] strArr = AnonymousClass1P6.A09;
        AnonymousClass00C.A09(strArr);
        if (r5.A05()) {
            return true;
        }
        AnonymousClass3FM r1 = new AnonymousClass3FM(activity);
        r1.A01 = R.drawable.permission_location;
        r1.A0C = strArr;
        r1.A03 = i2;
        r1.A02 = i;
        activity.startActivityForResult(r1.A02(), i3);
        return false;
    }

    public final boolean A0I(Activity activity, C20830yE r9, C19420v0 r10, int i) {
        Activity activity2 = activity;
        AnonymousClass00C.A0D(activity, 0);
        C20830yE r3 = r9;
        C36321k7.A0x(r9, r10);
        String[] strArr = AnonymousClass1P6.A09;
        AnonymousClass00C.A09(strArr);
        if (A0A(r10, strArr) || A09(activity, strArr)) {
            return A0H(activity2, r3, R.string.f12nameremoved, 0, i);
        }
        return true;
    }
}
