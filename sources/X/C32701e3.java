package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.ConditionVariable;
import android.text.TextUtils;
import com.whatsapp.community.JoinGroupBottomSheetFragment;
import com.whatsapp.newsletter.NewsletterLinkLauncher;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.1e3  reason: invalid class name and case insensitive filesystem */
public class C32701e3 implements C32691e2 {
    public final C24801Dv A00;
    public final C20810yC A01;
    public final AnonymousClass1EM A02;
    public final AnonymousClass1DW A03;
    public final NewsletterLinkLauncher A04;
    public final AnonymousClass005 A05;

    public void Bp7(Context context, Uri uri, AnonymousClass3T1 r4) {
        Bp8(context, uri, r4, 0);
    }

    public void Bp8(Context context, Uri uri, AnonymousClass3T1 r9, int i) {
        Bp9(context, uri, r9, i, 4);
    }

    public void Bp9(Context context, Uri uri, AnonymousClass3T1 r10, int i, int i2) {
        BpA(context, uri, r10, i, i2, 5);
    }

    public void BpA(Context context, Uri uri, AnonymousClass3T1 r21, int i, int i2, int i3) {
        Intent intent;
        Integer valueOf;
        long j;
        int i4;
        Uri uri2 = uri;
        if (uri == null) {
            Log.e("linklauncher/start-activity/uri-is-null");
            return;
        }
        NewsletterLinkLauncher newsletterLinkLauncher = this.A04;
        AnonymousClass00T r4 = newsletterLinkLauncher.A0H;
        Context context2 = context;
        AnonymousClass3T1 r6 = r21;
        int i5 = i2;
        if (((C24671Di) r4.getValue()).A09(uri2)) {
            String A06 = ((C24671Di) r4.getValue()).A06(uri2);
            if (C24671Di.A03(uri2, (C24671Di) r4.getValue(), "create")) {
                newsletterLinkLauncher.A00(context2, uri2);
                return;
            } else if (C24671Di.A03(uri2, (C24671Di) r4.getValue(), "directory")) {
                newsletterLinkLauncher.A02(context2, uri2, false);
                return;
            } else if (!TextUtils.isEmpty(A06)) {
                if (r21 != null) {
                    valueOf = AnonymousClass1DT.A06(r6.A1J.A00);
                } else {
                    int i6 = 3;
                    if (i5 != 1) {
                        if (i5 == 2) {
                            i6 = 1;
                        } else if (i5 != 3) {
                            i6 = 5;
                            if (i5 != 6) {
                                i6 = 0;
                            }
                        } else {
                            i6 = 2;
                        }
                    }
                    valueOf = Integer.valueOf(i6);
                }
                Long A052 = ((C24671Di) r4.getValue()).A05(uri2);
                if (A052 != null) {
                    j = A052.longValue();
                } else {
                    j = -1;
                }
                C28711Ts r12 = C28711Ts.IN_APP_LINK;
                if (valueOf != null) {
                    i4 = valueOf.intValue();
                } else {
                    i4 = 0;
                }
                newsletterLinkLauncher.A01(context2, uri2, (C28981Uw) null, r12, (Long) null, A06, i4, j);
                return;
            }
        }
        String A002 = C54542t7.A00(uri2);
        if (!TextUtils.isEmpty(A002)) {
            StringBuilder sb = new StringBuilder();
            sb.append("linklauncher/start-activity/invite-group-activity: ");
            sb.append(A002);
            Log.i(sb.toString());
            Activity A003 = C24801Dv.A00(context2);
            boolean A012 = C20800yB.A01(C21000yV.A02, this.A01, 2749);
            if ((this.A02.A01() || A012) && (A003 instanceof AnonymousClass01L)) {
                C65443Sb.A02(JoinGroupBottomSheetFragment.A06(A002, i, false), ((AnonymousClass01I) A003).getSupportFragmentManager());
                return;
            }
            intent = new Intent().setClassName(context2.getPackageName(), "com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity");
            intent.putExtra("code", A002);
        } else if (this.A03.A0C(uri2) != 1) {
            intent = AnonymousClass190.A0P(context2, uri2);
            intent.putExtra("extra_entry_point", i5);
            intent.putExtra("qr_code_camera_source", i3);
        } else {
            AnonymousClass6LA r5 = (AnonymousClass6LA) this.A05.get();
            if (context != null) {
                List list = r5.A03;
                if (!list.isEmpty()) {
                    for (int i7 = 0; i7 < list.size(); i7++) {
                        Intent BlG = ((AnonymousClass7i1) list.get(i7)).BlG(context2, uri2);
                        if (BlG != null) {
                            ((C131376Ou) r5.A02.get()).A01(context2).A01(new C148986zk(BlG, r5, new WeakReference(context2)), C79363tb.class, r5);
                            AnonymousClass6LA.A00(context2, BlG, r5);
                            return;
                        }
                    }
                }
            }
            this.A00.Bp7(context2, uri2, r6);
            return;
        }
        this.A00.A06(context2, intent);
    }

    public C32701e3(C24801Dv r2, AnonymousClass1DW r3, C20810yC r4, NewsletterLinkLauncher newsletterLinkLauncher, AnonymousClass1EM r6, AnonymousClass005 r7) {
        this.A01 = r4;
        this.A00 = r2;
        this.A03 = r3;
        this.A02 = r6;
        this.A05 = r7;
        this.A04 = newsletterLinkLauncher;
        ConditionVariable conditionVariable = C18740tg.A00;
    }
}
