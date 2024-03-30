package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass02E;
import X.AnonymousClass03Y;
import X.AnonymousClass1JD;
import X.AnonymousClass27h;
import X.AnonymousClass3E0;
import X.AnonymousClass3FM;
import X.AnonymousClass3TA;
import X.AnonymousClass3TX;
import X.AnonymousClass3US;
import X.C18740tg;
import X.C19420v0;
import X.C19550w8;
import X.C20430xY;
import X.C20830yE;
import X.C21060yb;
import X.C25271Fq;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36371kC;
import X.C36431kI;
import X.C36441kJ;
import X.C37421mL;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.view.KeyEvent;
import android.widget.TextView;
import com.whatsapp.permissions.RequestNotificationPermissionActivity;
import com.whatsapp.registration.directmigration.RequestPermissionFromSisterAppActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RequestPermissionActivity extends AnonymousClass27h {
    public static final AnonymousClass3US A0B = new AnonymousClass3US();
    public static final Map A0C;
    public AnonymousClass3E0 A00;
    public C20430xY A01;
    public C21060yb A02;
    public C20830yE A03;
    public C19420v0 A04;
    public AnonymousClass1JD A05;
    public AnonymousClass3TX A06;
    public String A07;
    public boolean A08;
    public Set A09;
    public boolean A0A;

    public static final void A01(Activity activity, int i, int i2) {
        AnonymousClass00C.A0D(activity, 0);
        if (!activity.isFinishing()) {
            activity.startActivityForResult(AnonymousClass3US.A02(activity, i, i2, false), 150);
        }
    }

    public static final void A07(Activity activity, int i, int i2) {
        AnonymousClass00C.A0D(activity, 0);
        if (!activity.isFinishing()) {
            activity.startActivityForResult(AnonymousClass3US.A03(activity, i, i2, false), 151);
        }
    }

    public static final void A0F(Activity activity, int i, int i2, int i3) {
        AnonymousClass00C.A0D(activity, 0);
        if (!activity.isFinishing()) {
            activity.startActivityForResult(AnonymousClass3US.A03(activity, i, i2, false), i3);
        }
    }

    public static final void A0H(AnonymousClass02E r2, int i, int i2) {
        if (r2.A1D() != null) {
            r2.startActivityForResult(AnonymousClass3US.A02(r2.A0a(), i, i2, false), 150);
        }
    }

    public static final boolean A0J(Activity activity, String str, int[] iArr, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        String[] strArr;
        if (z) {
            if (z2) {
                ArrayList A0I = AnonymousClass001.A0I();
                A0I.add("android.permission.GET_ACCOUNTS");
                A0I.add("android.permission.READ_CONTACTS");
                A0I.add("android.permission.WRITE_CONTACTS");
                AnonymousClass03Y.A0D(A0I, AnonymousClass3TA.A04());
                strArr = C36371kC.A1b(A0I, 0);
            } else {
                strArr = AnonymousClass3TA.A04();
            }
        } else if (!z2) {
            return true;
        } else {
            strArr = new String[]{"android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS", "android.permission.GET_ACCOUNTS"};
        }
        if (strArr == null) {
            return true;
        }
        int length = iArr.length;
        AnonymousClass3FM r1 = new AnonymousClass3FM(activity);
        if (length == 1) {
            r1.A01 = iArr[0];
        } else {
            r1.A09 = iArr;
        }
        r1.A0C = strArr;
        r1.A02 = i3;
        r1.A04 = i2;
        r1.A00 = i4;
        r1.A06 = true;
        Intent A022 = r1.A02();
        AnonymousClass00C.A0B(A022);
        A022.putExtra("permission_requester_screen", str);
        activity.startActivityForResult(A022, i);
        return false;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        AnonymousClass00C.A0D(keyEvent, 1);
        return super.onKeyDown(i, keyEvent);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        String str;
        String str2;
        C36321k7.A0v(strArr, 1, iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 0) {
            setResult(-1);
            int length = strArr.length;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                boolean z = true;
                if (i2 < length) {
                    String str3 = strArr[i2];
                    int i4 = i3 + 1;
                    int i5 = iArr[i3];
                    if (i5 == 0) {
                        C19420v0 r0 = this.A04;
                        if (r0 != null) {
                            C36341k9.A0u(C19420v0.A00(r0), str3);
                            if ("android.permission.WRITE_CONTACTS".equals(str3)) {
                                AnonymousClass3E0 r1 = this.A00;
                                if (r1 != null) {
                                    C21060yb r02 = this.A02;
                                    if (r02 != null) {
                                        r1.A00(r02);
                                        C20430xY r03 = this.A01;
                                        if (r03 != null) {
                                            r03.A05();
                                        } else {
                                            throw C36331k8.A0d("contactSyncer");
                                        }
                                    } else {
                                        throw C36331k8.A0W();
                                    }
                                } else {
                                    throw C36331k8.A0d("androidContactsContentObserver");
                                }
                            }
                            Set set = this.A09;
                            if (set != null) {
                                set.remove(str3);
                            }
                        } else {
                            throw C36331k8.A0d("waSharedPreferences");
                        }
                    } else {
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("request/permission/activity/");
                        A0u.append(str3);
                        C36321k7.A1a(A0u, " denied");
                        if (this.A09 == null) {
                            setResult(0);
                        }
                    }
                    if (this.A07 != null) {
                        if (i5 != 0) {
                            z = false;
                        }
                        if (AnonymousClass00C.A0J(str3, "android.permission.WRITE_CONTACTS")) {
                            str = "access_to_contacts";
                        } else if (AnonymousClass00C.A0J(str3, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                            str = "access_to_files";
                        } else {
                            continue;
                        }
                        if (z) {
                            str2 = "allow";
                        } else {
                            str2 = "not_now";
                        }
                        AnonymousClass3TX r04 = this.A06;
                        if (r04 != null) {
                            r04.A07(str, str2);
                        } else {
                            throw C36331k8.A0d("funnelLogger");
                        }
                    }
                    i2++;
                    i3 = i4;
                } else {
                    Set set2 = this.A09;
                    if (set2 != null && (!set2.isEmpty())) {
                        setResult(0);
                    }
                    finish();
                    return;
                }
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        AnonymousClass00C.A0D(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("permissions_requested", this.A08);
    }

    static {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        HashMap hashMap = new HashMap(4);
        int[] iArr = new int[6];
        iArr[0] = R.string.f12nameremoved;
        boolean A092 = C19550w8.A09();
        if (A092) {
            i = R.string.f12nameremoved;
        } else {
            int i9 = Build.VERSION.SDK_INT;
            i = R.string.f12nameremoved;
            if (i9 < 30) {
                i = R.string.f12nameremoved;
            }
        }
        iArr[1] = i;
        iArr[2] = R.string.f12nameremoved;
        if (A092) {
            i2 = R.string.f12nameremoved;
        } else {
            int i10 = Build.VERSION.SDK_INT;
            i2 = R.string.f12nameremoved;
            if (i10 < 30) {
                i2 = R.string.f12nameremoved;
            }
        }
        iArr[3] = i2;
        iArr[4] = R.string.f12nameremoved;
        iArr[5] = R.string.f12nameremoved;
        C36331k8.A1Q(iArr, hashMap, 30);
        C36331k8.A1Q(iArr, hashMap, 29);
        int[] iArr2 = new int[6];
        iArr2[0] = R.string.f12nameremoved;
        boolean A093 = C19550w8.A09();
        if (A093) {
            i3 = R.string.f12nameremoved;
        } else {
            int i11 = Build.VERSION.SDK_INT;
            i3 = R.string.f12nameremoved;
            if (i11 < 30) {
                i3 = R.string.f12nameremoved;
            }
        }
        iArr2[1] = i3;
        iArr2[2] = R.string.f12nameremoved;
        if (A093) {
            i4 = R.string.f12nameremoved;
        } else {
            int i12 = Build.VERSION.SDK_INT;
            i4 = R.string.f12nameremoved;
            if (i12 < 30) {
                i4 = R.string.f12nameremoved;
            }
        }
        iArr2[3] = i4;
        iArr2[4] = R.string.f12nameremoved;
        iArr2[5] = R.string.f12nameremoved;
        hashMap.put(31, iArr2);
        int[] iArr3 = new int[6];
        iArr3[0] = R.string.f12nameremoved;
        boolean A094 = C19550w8.A09();
        if (A094) {
            i5 = R.string.f12nameremoved;
        } else {
            int i13 = Build.VERSION.SDK_INT;
            i5 = R.string.f12nameremoved;
            if (i13 < 30) {
                i5 = R.string.f12nameremoved;
            }
        }
        iArr3[1] = i5;
        iArr3[2] = R.string.f12nameremoved;
        if (A094) {
            i6 = R.string.f12nameremoved;
        } else {
            int i14 = Build.VERSION.SDK_INT;
            i6 = R.string.f12nameremoved;
            if (i14 < 30) {
                i6 = R.string.f12nameremoved;
            }
        }
        iArr3[3] = i6;
        iArr3[4] = R.string.f12nameremoved;
        iArr3[5] = R.string.f12nameremoved;
        hashMap.put(32, iArr3);
        int[] iArr4 = new int[6];
        iArr4[0] = R.string.f12nameremoved;
        boolean A095 = C19550w8.A09();
        if (A095) {
            i7 = R.string.f12nameremoved;
        } else {
            int i15 = Build.VERSION.SDK_INT;
            i7 = R.string.f12nameremoved;
            if (i15 < 30) {
                i7 = R.string.f12nameremoved;
            }
        }
        iArr4[1] = i7;
        iArr4[2] = R.string.f12nameremoved;
        if (A095) {
            i8 = R.string.f12nameremoved;
        } else {
            int i16 = Build.VERSION.SDK_INT;
            i8 = R.string.f12nameremoved;
            if (i16 < 30) {
                i8 = R.string.f12nameremoved;
            }
        }
        iArr4[3] = i8;
        iArr4[4] = R.string.f12nameremoved;
        iArr4[5] = R.string.f12nameremoved;
        hashMap.put(33, iArr4);
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        AnonymousClass00C.A08(unmodifiableMap);
        A0C = unmodifiableMap;
    }

    public static final boolean A0I(Activity activity, C20830yE r2, int i) {
        AnonymousClass3US r0 = A0B;
        C36321k7.A0w(activity, r2);
        Intent A0B2 = r0.A0B(activity, r2, i);
        if (A0B2 == null) {
            return true;
        }
        activity.startActivityForResult(A0B2, i);
        return false;
    }

    public final String A2j(Bundle bundle, boolean z) {
        String str;
        String str2;
        String string = bundle.getString("formatted_message_html");
        if (string != null) {
            return string;
        }
        if (z) {
            str = "perm_denial_message_id";
        } else {
            str = "message_id";
        }
        int i = bundle.getInt(str);
        if (i == 0) {
            return null;
        }
        if (z) {
            str2 = "perm_denial_message_params_id";
        } else {
            str2 = "message_params_id";
        }
        int[] intArray = bundle.getIntArray(str2);
        if (intArray == null) {
            return getString(i);
        }
        ArrayList A14 = C36441kJ.A14(r3);
        for (int string2 : intArray) {
            A14.add(getString(string2));
        }
        String[] A1b = C36431kI.A1b(A14);
        return getString(i, Arrays.copyOf(A1b, A1b.length));
    }

    public void A2k(String str, Bundle bundle) {
        if (str != null) {
            TextView textView = (TextView) C36361kB.A0H(this, R.id.permission_message);
            if (bundle.getString("formatted_message_html") != null) {
                Context A0B2 = C36371kC.A0B(textView);
                Spanned fromHtml = Html.fromHtml(str);
                AnonymousClass00C.A0E(fromHtml, "null cannot be cast to non-null type android.text.Spannable");
                Spannable spannable = (Spannable) fromHtml;
                Object[] spans = spannable.getSpans(0, spannable.length(), URLSpan.class);
                AnonymousClass00C.A08(spans);
                for (URLSpan uRLSpan : (URLSpan[]) spans) {
                    AnonymousClass00C.A0B(uRLSpan);
                    spannable.setSpan(new C37421mL(A0B2, uRLSpan.getURL()), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), spannable.getSpanFlags(uRLSpan));
                    spannable.removeSpan(uRLSpan);
                }
                textView.setText(spannable);
                C36331k8.A10(textView, this.A01);
                textView.setFocusable(true);
                textView.setClickable(true);
                return;
            }
            textView.setText(str);
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("request/permission/activity/there is no message id for ");
        String A0q = AnonymousClass000.A0q(Arrays.toString(bundle.getStringArray("permissions")), A0u);
        AnonymousClass00C.A08(A0q);
        Log.e(A0q);
        finish();
    }

    public static final void A0G(Activity activity, boolean z) {
        if (!activity.isFinishing()) {
            activity.startActivityForResult(AnonymousClass3US.A02(activity, R.string.f12nameremoved, R.string.f12nameremoved, z), 150);
        }
    }

    public static final boolean A0K(Context context, C20830yE r4) {
        int i;
        boolean A1a = C36331k8.A1a(context, r4);
        if (C19550w8.A07() || r4.A0D()) {
            return A1a;
        }
        if (!C19550w8.A07()) {
            i = R.string.f12nameremoved;
        } else {
            boolean A092 = C19550w8.A09();
            i = R.string.f12nameremoved;
            if (!A092) {
                i = R.string.f12nameremoved;
            }
        }
        context.startActivity(AnonymousClass3US.A01(context, R.string.f12nameremoved, i));
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b4, code lost:
        if (r1 != false) goto L_0x00b6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            super.onCreate(r13)
            android.os.Bundle r2 = X.C36371kC.A0H(r12)
            if (r2 != 0) goto L_0x0012
            java.lang.String r0 = "request/permission/activity/extra is null"
        L_0x000b:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r12.finish()
        L_0x0011:
            return
        L_0x0012:
            java.lang.String r0 = "permission_requester_screen"
            java.lang.String r0 = r2.getString(r0)
            r12.A07 = r0
            java.lang.String r0 = "permissions"
            java.lang.String[] r4 = r2.getStringArray(r0)
            if (r4 != 0) goto L_0x0025
            java.lang.String r0 = "request/permission/activity/no-permissions-passed"
            goto L_0x000b
        L_0x0025:
            java.lang.String r0 = "title_id"
            int r5 = r2.getInt(r0)
            r0 = 2131102000(0x7f060930, float:1.7816426E38)
            int r1 = X.AnonymousClass00F.A00(r12, r0)
            android.view.Window r0 = r12.getWindow()
            X.C36371kC.A1G(r0, r1)
            X.C36331k8.A0l(r12)
            X.C36431kI.A1J(r12, r1)
            r0 = 2131625836(0x7f0e076c, float:1.8878891E38)
            r12.setContentView((int) r0)
            r0 = 2131428555(0x7f0b04cb, float:1.8478758E38)
            r7 = 2131428555(0x7f0b04cb, float:1.8478758E38)
            android.view.View r0 = r12.findViewById(r0)
            r8 = 2
            X.C48732hx.A00(r0, r12, r8)
            r3 = 0
            if (r5 == 0) goto L_0x0066
            r0 = 2131432661(0x7f0b14d5, float:1.8487086E38)
            r1 = 2131432661(0x7f0b14d5, float:1.8487086E38)
            android.widget.TextView r0 = X.C36391kE.A0Q(r12, r0)
            r0.setText(r5)
            X.C36341k9.A13(r12, r1, r3)
        L_0x0066:
            java.lang.String r0 = "drawable_id"
            int r1 = r2.getInt(r0)
            r5 = 1
            if (r1 == 0) goto L_0x00ec
            r0 = 2131432657(0x7f0b14d1, float:1.8487078E38)
            android.widget.ImageView r0 = X.C36411kG.A0Q(r12, r0)
            r0.setImageResource(r1)
            r0 = 2131432656(0x7f0b14d0, float:1.8487076E38)
            int r1 = X.C36391kE.A09(r12, r0)
            r0 = 2131432658(0x7f0b14d2, float:1.848708E38)
            X.C36341k9.A13(r12, r0, r1)
        L_0x0086:
            java.lang.String r0 = "cancel_button_message_id"
            int r1 = r2.getInt(r0)
            if (r1 == 0) goto L_0x0095
            android.widget.TextView r0 = X.C36391kE.A0Q(r12, r7)
            r0.setText(r1)
        L_0x0095:
            if (r13 == 0) goto L_0x009f
            java.lang.String r0 = "permissions_requested"
            boolean r0 = r13.getBoolean(r0, r3)
            r12.A08 = r0
        L_0x009f:
            boolean r1 = X.AnonymousClass3US.A09(r12, r4)
            java.lang.String r0 = "force_ui"
            boolean r0 = r2.getBoolean(r0, r3)
            if (r0 != 0) goto L_0x00b6
            java.lang.String r0 = "perm_denial_message_id"
            int r0 = r2.getInt(r0)
            if (r0 == 0) goto L_0x00b6
            r11 = 0
            if (r1 == 0) goto L_0x00b7
        L_0x00b6:
            r11 = 1
        L_0x00b7:
            X.0v0 r0 = r12.A04
            if (r0 == 0) goto L_0x01c7
            boolean r10 = X.AnonymousClass3US.A0A(r0, r4)
            if (r1 != 0) goto L_0x00ea
            if (r10 != 0) goto L_0x00ea
        L_0x00c3:
            java.lang.String r0 = "hide_permissions_rationale"
            boolean r9 = r2.getBoolean(r0, r3)
            android.content.Intent r1 = r12.getIntent()
            java.lang.String r0 = "minimal_partial_permissions"
            java.lang.String[] r8 = r1.getStringArrayExtra(r0)
            if (r8 == 0) goto L_0x0120
            int r7 = r8.length
            int r0 = X.C000300d.A02(r7)
            java.util.LinkedHashSet r6 = new java.util.LinkedHashSet
            r6.<init>(r0)
            r1 = 0
        L_0x00e0:
            if (r1 >= r7) goto L_0x011e
            r0 = r8[r1]
            r6.add(r0)
            int r1 = r1 + 1
            goto L_0x00e0
        L_0x00ea:
            r5 = 0
            goto L_0x00c3
        L_0x00ec:
            java.lang.String r0 = "drawable_ids"
            int[] r6 = r2.getIntArray(r0)
            if (r6 == 0) goto L_0x0086
            int r1 = r6.length
            r0 = 3
            if (r1 != r0) goto L_0x0086
            r0 = 2131432656(0x7f0b14d0, float:1.8487076E38)
            android.widget.ImageView r1 = X.C36411kG.A0Q(r12, r0)
            r0 = r6[r3]
            r1.setImageResource(r0)
            r0 = 2131432657(0x7f0b14d1, float:1.8487078E38)
            android.widget.ImageView r1 = X.C36411kG.A0Q(r12, r0)
            r0 = r6[r5]
            r1.setImageResource(r0)
            r0 = 2131432658(0x7f0b14d2, float:1.848708E38)
            android.widget.ImageView r1 = X.C36411kG.A0Q(r12, r0)
            r0 = r6[r8]
            r1.setImageResource(r0)
            goto L_0x0086
        L_0x011e:
            r12.A09 = r6
        L_0x0120:
            java.lang.String r0 = "extra_for_automation"
            boolean r0 = r2.getBoolean(r0, r3)
            r12.A0A = r0
            X.1JD r0 = r12.A05
            if (r0 == 0) goto L_0x01c0
            r0.A00()
            boolean r0 = r12.A08
            if (r0 != 0) goto L_0x01a5
            if (r11 != 0) goto L_0x0137
            if (r10 != 0) goto L_0x01a5
        L_0x0137:
            if (r9 != 0) goto L_0x01a5
            java.lang.String r0 = r12.A2j(r2, r5)
            r12.A2k(r0, r2)
            boolean r0 = r12 instanceof com.whatsapp.registration.directmigration.RequestPermissionFromSisterAppActivity
            if (r0 == 0) goto L_0x0168
            r0 = 2131434448(0x7f0b1bd0, float:1.849071E38)
            android.widget.TextView r1 = X.C36401kF.A0H(r12, r0)
            r0 = 2131892884(0x7f121a94, float:1.9420529E38)
            r1.setText(r0)
            r0 = 17
            X.C48762i0.A00(r1, r12, r0)
        L_0x0156:
            r0 = 2131432660(0x7f0b14d4, float:1.8487084E38)
            X.C36341k9.A13(r12, r0, r3)
            java.lang.String r1 = r12.A07
            if (r1 == 0) goto L_0x0011
            X.3TX r0 = r12.A06
            if (r0 == 0) goto L_0x019e
            r0.A04(r1)
            return
        L_0x0168:
            boolean r1 = r12 instanceof com.whatsapp.permissions.RequestNotificationPermissionActivity
            r0 = 2131434448(0x7f0b1bd0, float:1.849071E38)
            if (r1 == 0) goto L_0x0180
            android.view.View r1 = X.C36361kB.A0D(r12, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131892884(0x7f121a94, float:1.9420529E38)
            r1.setText(r0)
            r0 = 7
            X.C48762i0.A00(r1, r12, r0)
            goto L_0x0156
        L_0x0180:
            android.view.View r2 = X.C36361kB.A0H(r12, r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r5 == 0) goto L_0x0198
            r0 = 2131892884(0x7f121a94, float:1.9420529E38)
            r2.setText(r0)
            r1 = 3
            X.2hx r0 = new X.2hx
            r0.<init>(r12, r1)
        L_0x0194:
            r2.setOnClickListener(r0)
            goto L_0x0156
        L_0x0198:
            X.2i6 r0 = new X.2i6
            r0.<init>(r12, r4, r3)
            goto L_0x0194
        L_0x019e:
            java.lang.String r0 = "funnelLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01a5:
            r0 = 1
            r12.A08 = r0
            X.0v0 r0 = r12.A04
            if (r0 == 0) goto L_0x01b9
            X.AnonymousClass3US.A08(r0, r4)
            X.C03570Gk.A0C(r12, r4, r3)
            r0 = 2131432660(0x7f0b14d4, float:1.8487084E38)
            X.C36331k8.A11(r12, r0)
            return
        L_0x01b9:
            java.lang.String r0 = "waSharedPreferences"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01c0:
            java.lang.String r0 = "cameraOpenTracker"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01c7:
            java.lang.String r0 = "waSharedPreferences"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.RequestPermissionActivity.onCreate(android.os.Bundle):void");
    }

    public void onResume() {
        super.onResume();
        Bundle A0H = C36371kC.A0H(this);
        C18740tg.A06(A0H);
        String[] stringArray = A0H.getStringArray("permissions");
        if (stringArray != null) {
            if (this instanceof RequestPermissionFromSisterAppActivity) {
                int length = stringArray.length;
                int i = 0;
                while (i < length) {
                    if (C20830yE.A01(this, stringArray[i])) {
                        i++;
                    } else {
                        return;
                    }
                }
            } else if (this instanceof RequestNotificationPermissionActivity) {
                C25271Fq r0 = ((RequestNotificationPermissionActivity) this).A00;
                if (r0 == null) {
                    throw C36331k8.A0d("waNotificationManager");
                } else if (!r0.A00.A01()) {
                    return;
                }
            } else {
                int length2 = stringArray.length;
                int i2 = 0;
                while (i2 < length2) {
                    String str = stringArray[i2];
                    C20830yE r02 = this.A03;
                    if (r02 == null) {
                        throw C36331k8.A0d("waPermissionsHelper");
                    } else if (r02.A02(str) == 0) {
                        C19420v0 r03 = this.A04;
                        if (r03 != null) {
                            C36341k9.A0u(C19420v0.A00(r03), str);
                            i2++;
                        } else {
                            throw C36331k8.A0d("waSharedPreferences");
                        }
                    } else {
                        return;
                    }
                }
            }
        }
        if (!this.A0A) {
            Log.i("request/permission/activity/permissions has been granted while we were paused");
            C36331k8.A0m(this);
        }
    }
}
