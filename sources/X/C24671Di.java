package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.R;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import java.util.List;

/* renamed from: X.1Di  reason: invalid class name and case insensitive filesystem */
public final class C24671Di {
    public final AnonymousClass005 A00;
    public final AnonymousClass005 A01;
    public final AnonymousClass005 A02;

    public C24671Di(AnonymousClass005 r2, AnonymousClass005 r3, AnonymousClass005 r4) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        AnonymousClass00C.A0D(r4, 3);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }

    public static final boolean A03(Uri uri, C24671Di r4, String str) {
        if (uri == null) {
            return false;
        }
        if (A02(uri)) {
            List<String> pathSegments = uri.getPathSegments();
            AnonymousClass00C.A08(pathSegments);
            if (!AnonymousClass00C.A0J(C007103b.A0M(pathSegments), "channel") || uri.getPathSegments().size() != 2) {
                return false;
            }
        } else if (!r4.A04(uri, "channel") || uri.getPathSegments().size() != 1) {
            return false;
        }
        return AnonymousClass00C.A0J(uri.getLastPathSegment(), str);
    }

    public final Long A05(Uri uri) {
        List<String> subList;
        if (uri == null) {
            return null;
        }
        Object obj = this.A00.get();
        AnonymousClass00C.A08(obj);
        if (!C20800yB.A01(C21000yV.A02, ((AnonymousClass1GQ) obj).A00, 5188)) {
            return null;
        }
        if (A04(uri, "channel")) {
            subList = uri.getPathSegments();
            AnonymousClass00C.A08(subList);
        } else if (!A00(uri) && !A01(uri)) {
            return null;
        } else {
            subList = uri.getPathSegments().subList(1, uri.getPathSegments().size());
        }
        AnonymousClass00C.A0D(subList, 0);
        if (subList.size() != 1) {
            return AnonymousClass097.A04(subList.get(1));
        }
        return null;
    }

    public final String A06(Uri uri) {
        List<String> subList;
        if (A04(uri, "channel")) {
            subList = uri.getPathSegments();
            AnonymousClass00C.A08(subList);
        } else if (!A00(uri) && !A01(uri)) {
            return null;
        } else {
            subList = uri.getPathSegments().subList(1, uri.getPathSegments().size());
        }
        AnonymousClass00C.A0D(subList, 0);
        int size = subList.size();
        if (size == 1 || size == 2) {
            return (String) C007103b.A0L(subList);
        }
        return null;
    }

    public final void A08(Context context, Uri uri, C51592o4 r10, boolean z) {
        C225314u r1;
        C225314u r12;
        C225314u r3;
        AnonymousClass005 r6 = this.A00;
        Object obj = r6.get();
        AnonymousClass00C.A08(obj);
        C20810yC r5 = ((AnonymousClass1GQ) obj).A00;
        C21000yV r4 = C21000yV.A02;
        if (C20800yB.A00(r4, r5, 3877) != AnonymousClass1MF.DISABLED.value || !C20800yB.A01(r4, r5, 4357)) {
            Object obj2 = r6.get();
            AnonymousClass00C.A08(obj2);
            if (C20800yB.A01(r4, ((AnonymousClass1GQ) obj2).A00, 3880)) {
                if (uri != null) {
                    Activity A002 = C24801Dv.A00(context);
                    if (!(A002 instanceof C225314u) || (r12 = (C225314u) A002) == null || r12.A00 == null) {
                        AnonymousClass00C.A08(this.A02.get());
                        Intent A06 = AnonymousClass190.A06(context);
                        A06.setAction("android.intent.action.VIEW");
                        A06.setData(uri);
                        context.startActivity(A06);
                        return;
                    }
                }
                int ordinal = r10.ordinal();
                int i = R.string.f12nameremoved;
                if (ordinal == 0) {
                    i = R.string.f12nameremoved;
                }
                Activity A003 = C24801Dv.A00(context);
                if ((A003 instanceof C225314u) && (r1 = (C225314u) A003) != null) {
                    r1.BO5(i);
                    return;
                }
                return;
            }
            Intent intent = C24801Dv.A00(context).getIntent();
            if ((intent == null || !intent.getBooleanExtra("is_wa", false)) && uri != null) {
                Intent intent2 = new Intent("android.intent.action.VIEW", uri);
                intent2.putExtra("is_wa", true);
                Intent createChooser = Intent.createChooser(intent2, context.getString(R.string.f12nameremoved));
                createChooser.putExtra("is_wa", true);
                context.startActivity(createChooser);
                return;
            }
            return;
        }
        Activity A004 = C24801Dv.A00(context);
        if ((A004 instanceof C225314u) && (r3 = (C225314u) A004) != null) {
            AnonymousClass00C.A08(this.A02.get());
            Intent intent3 = new Intent();
            intent3.setClassName(context.getPackageName(), "com.whatsapp.newsletter.ui.waitlist.NewsletterWaitListActivity");
            intent3.putExtra("is_external_link", z);
            r3.BuO(intent3, 555);
        }
    }

    public final boolean A09(Uri uri) {
        if (uri == null) {
            return false;
        }
        if (A02(uri)) {
            return A00(uri) || A01(uri);
        }
        return A04(uri, "channel");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        if (X.AnonymousClass00C.A0J(X.C007103b.A0M(r0), "updates") != false) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0A(android.net.Uri r4) {
        /*
            r3 = this;
            r2 = 0
            boolean r0 = A02(r4)
            if (r0 == 0) goto L_0x0066
            java.lang.String r1 = r4.getHost()
            java.lang.String r0 = "whatsapp.com"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x001f
            java.lang.String r1 = r4.getHost()
            java.lang.String r0 = "www.whatsapp.com"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003a
        L_0x001f:
            boolean r0 = A02(r4)
            if (r0 == 0) goto L_0x003a
            java.util.List r0 = r4.getPathSegments()
            X.AnonymousClass00C.A08(r0)
            java.lang.Object r1 = X.C007103b.A0M(r0)
            java.lang.String r0 = "updates"
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x003a
        L_0x0038:
            r2 = 1
        L_0x0039:
            return r2
        L_0x003a:
            boolean r0 = A02(r4)
            if (r0 == 0) goto L_0x0039
            java.lang.String r1 = r4.getHost()
            java.lang.String r0 = "wa.me"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0039
            boolean r0 = A02(r4)
            if (r0 == 0) goto L_0x0039
            java.util.List r0 = r4.getPathSegments()
            X.AnonymousClass00C.A08(r0)
            java.lang.Object r1 = X.C007103b.A0M(r0)
            java.lang.String r0 = "updates"
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0039
            goto L_0x0038
        L_0x0066:
            java.lang.String r0 = "updates"
            boolean r2 = r3.A04(r4, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24671Di.A0A(android.net.Uri):boolean");
    }

    private final boolean A00(Uri uri) {
        if (("whatsapp.com".equals(uri.getHost()) || "www.whatsapp.com".equals(uri.getHost())) && A02(uri)) {
            List<String> pathSegments = uri.getPathSegments();
            AnonymousClass00C.A08(pathSegments);
            if (!AnonymousClass00C.A0J(C007103b.A0M(pathSegments), "channel")) {
                return false;
            }
            return true;
        }
        return false;
    }

    private final boolean A01(Uri uri) {
        if (A02(uri) && "wa.me".equals(uri.getHost()) && A02(uri)) {
            List<String> pathSegments = uri.getPathSegments();
            AnonymousClass00C.A08(pathSegments);
            if (!AnonymousClass00C.A0J(C007103b.A0M(pathSegments), "channel")) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean A02(Uri uri) {
        if (AnonymousClass00C.A0J(uri.getScheme(), "http") || AnonymousClass00C.A0J(uri.getScheme(), "https")) {
            return true;
        }
        return false;
    }

    private final boolean A04(Uri uri, String str) {
        if (!SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME.equals(uri.getScheme()) || !AnonymousClass00C.A0J(uri.getHost(), str)) {
            return false;
        }
        return true;
    }

    public final void A07(Context context) {
        C225314u r1;
        Activity A002 = C24801Dv.A00(context);
        if ((A002 instanceof C225314u) && (r1 = (C225314u) A002) != null) {
            r1.A37(new C68643cE(r1, this), R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved);
        }
    }
}
