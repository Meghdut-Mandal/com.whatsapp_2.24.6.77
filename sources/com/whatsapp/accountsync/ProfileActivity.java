package com.whatsapp.accountsync;

import X.AnonymousClass000;
import X.AnonymousClass12P;
import X.AnonymousClass141;
import X.AnonymousClass16D;
import X.AnonymousClass1NE;
import X.AnonymousClass3SJ;
import X.C100804vn;
import X.C100854w8;
import X.C107005Me;
import X.C19460v5;
import X.C19730wQ;
import X.C20350xQ;
import X.C229216m;
import X.C29301Wc;
import X.C29501Ww;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36431kI;
import X.C90504aG;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.util.Log;

public class ProfileActivity extends C100854w8 {
    public C19460v5 A00;
    public C107005Me A01 = null;
    public C29301Wc A02;
    public C229216m A03;
    public AnonymousClass16D A04;
    public AnonymousClass12P A05;
    public C20350xQ A06;
    public WhatsAppLibLoader A07;
    public C29501Ww A08;

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 150) {
            if (i2 == -1) {
                A01(this);
            } else {
                Log.w("profileactivity/contact access denied");
                finish();
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public static void A01(ProfileActivity profileActivity) {
        Cursor A032;
        if (profileActivity.BLh()) {
            Log.w("sync profile activity already finishing, ignoring gotoActivity call");
        } else if (!profileActivity.A03.A00()) {
            RequestPermissionActivity.A0G(profileActivity, true);
        } else {
            if (!(profileActivity.getIntent().getData() == null || profileActivity.A02.A0L() || (A032 = profileActivity.A08.A0O().A03(profileActivity.getIntent().getData(), (String[]) null, (String) null, (String[]) null, (String) null)) == null)) {
                try {
                    if (A032.moveToFirst()) {
                        String A0f = C36341k9.A0f(A032, "mimetype");
                        UserJid A0l = C36431kI.A0l(C36341k9.A0f(A032, "data1"));
                        if (A0l != null) {
                            if (profileActivity instanceof CallContactLandingActivity) {
                                CallContactLandingActivity callContactLandingActivity = (CallContactLandingActivity) profileActivity;
                                AnonymousClass141 A0D = callContactLandingActivity.A04.A0D(A0l);
                                if ("vnd.android.cursor.item/vnd.com.whatsapp.voip.call".equals(A0f)) {
                                    ((AnonymousClass1NE) callContactLandingActivity.A00).Bua(callContactLandingActivity, A0D, 14, false);
                                } else if ("vnd.android.cursor.item/vnd.com.whatsapp.video.call".equals(A0f)) {
                                    callContactLandingActivity.A00.Bua(callContactLandingActivity, A0D, 14, true);
                                }
                            } else {
                                AnonymousClass141 A0D2 = profileActivity.A04.A0D(A0l);
                                if ("vnd.android.cursor.item/vnd.com.whatsapp.profile".equals(A0f)) {
                                    profileActivity.A01.A07(profileActivity, C90504aG.A0G(profileActivity, A0D2));
                                }
                            }
                            profileActivity.finish();
                            A032.close();
                            return;
                        }
                    }
                    A032.close();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                    throw th;
                }
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("failed to go anywhere from sync profile activity; intent=");
            C36331k8.A1P(profileActivity.getIntent(), A0u);
            profileActivity.finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!this.A07.A04()) {
            Log.i("aborting due to native libraries missing");
        } else {
            C19730wQ r0 = this.A02;
            r0.A0G();
            if (r0.A00 == null || !this.A0A.A03()) {
                this.A05.A06(R.string.f12nameremoved, 1);
            } else {
                AnonymousClass12P r02 = this.A05;
                r02.A06();
                if (r02.A08) {
                    A3j();
                    return;
                } else if (C100804vn.A0O(this).B2j()) {
                    int A012 = this.A02.A01();
                    C36321k7.A1T("profileactivity/create/backupfilesfound ", AnonymousClass000.A0u(), A012);
                    if (A012 > 0) {
                        AnonymousClass3SJ.A01(this, 105);
                        return;
                    } else {
                        A3l(false);
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        finish();
    }
}
