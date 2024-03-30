package X;

import android.app.Activity;
import android.content.Intent;
import com.whatsapp.R;

/* renamed from: X.3Tx  reason: invalid class name and case insensitive filesystem */
public abstract class C65903Tx {
    public static final C52512pY A00(Intent intent) {
        if (intent != null) {
            switch (intent.getIntExtra("mat_entry_point", 0)) {
                case 2:
                    return C52512pY.NOTIFICATION;
                case 3:
                    return C52512pY.UPDATES_TAB_LIST;
                case 4:
                    return C52512pY.NEWSLETTER_CHAT_LINK;
                case 5:
                    return C52512pY.EXTERNAL_DEEPLINK;
                case 6:
                    return C52512pY.NEWSLETTER_DIRECTORY;
                case 7:
                    return C52512pY.NEWSLETTER_FORWARDED_MESSAGE;
                case 8:
                    return C52512pY.RECOMMENDED_NEWSLETTERS;
                case 9:
                    return C52512pY.NEWSLETTER_DIRECTORY_SEARCH;
                case 11:
                    return C52512pY.UPDATES_TAB_SEARCH;
                case 12:
                    return C52512pY.NEWSLETTER_ADMIN_INVITE;
                case 13:
                    return C52512pY.STATUS_HEADER;
                case 14:
                    return C52512pY.STATUS_LINK_TOOLTIP;
                case 15:
                    return C52512pY.STATUS_LINK_BUTTON;
                case 16:
                    return C52512pY.STATUS_POST_TOOLTIP;
                case 17:
                    return C52512pY.MEDIA_BROWSER_LINK_TOOLTIP;
                case 18:
                    return C52512pY.MEDIA_BROWSER_LINK_BUTTON;
                case 19:
                    return C52512pY.MEDIA_BROWSER_POST_TOOLTIP;
                case 23:
                    return C52512pY.SIMILAR_NEWSLETTERS_NEWSLETTER_THREAD;
                case 24:
                    return C52512pY.SIMILAR_NEWSLETTERS_NEWSLETTER_PROFILE;
            }
        }
        return C52512pY.UNKNOWN;
    }

    public static final String A02(Intent intent) {
        int intExtra = intent.getIntExtra("extra_forwarded_message_thread_type", -1);
        int intExtra2 = intent.getIntExtra("mat_entry_point", 0);
        if (intExtra == -1) {
            return null;
        }
        if (intExtra2 == 7 || intExtra2 == 4) {
            return C36331k8.A0h(Integer.valueOf(intExtra));
        }
        return null;
    }

    public static final String A03(C18820ts r7, C64633Ov r8, AnonymousClass3T1 r9) {
        C36321k7.A0v(r7, 1, r8);
        AnonymousClass3A4 A0Z = r9.A0Z();
        if (A0Z == null) {
            return null;
        }
        long j = A0Z.A03;
        if (j <= 0) {
            j = 1;
        }
        int A00 = C64633Ov.A00(r8, (int) j);
        String A01 = r8.A01(A00);
        AnonymousClass00C.A0D(A01, 1);
        boolean z = r9 instanceof C46812bi;
        int i = R.plurals.f10nameremoved;
        if (z) {
            i = R.plurals.f10nameremoved;
        }
        String A0L = r7.A0L(new Object[]{A01}, i, (long) A00);
        AnonymousClass00C.A08(A0L);
        return new C10880fN("\\s{2,}|^[\\s]|\\s+$").A00(AnonymousClass098.A05(A0L, "•", "", false), "");
    }

    public static final boolean A06(C220412q r2, C28981Uw r3, AnonymousClass1GQ r4) {
        AnonymousClass00C.A0D(r2, 0);
        C36321k7.A0v(r4, 1, r3);
        C44072La r22 = (C44072La) r2.A09(r3, false);
        if (r22 == null) {
            return true;
        }
        if (r22.A0N || r22.A0R(r4)) {
            return false;
        }
        return true;
    }

    public static String A01(Activity activity) {
        Intent intent = activity.getIntent();
        AnonymousClass00C.A08(intent);
        return A02(intent);
    }

    public static final void A04(C220412q r5, AnonymousClass11F r6) {
        Long l;
        C65073Qp A0W = C36371kC.A0W(r5, r6);
        if (A0W == null || (l = A0W.A07()) == null) {
            l = 0L;
        }
        if (l.longValue() <= 0) {
            r5.A0J(r6);
        }
    }

    public static final boolean A05(C19970wo r4, AnonymousClass3T1 r5) {
        C36321k7.A0w(r4, r5);
        if (C66013Ui.A0b(r5) || AnonymousClass3T1.A05(r4, r5) >= 2592000000L) {
            return false;
        }
        return true;
    }

    public static final boolean A07(C44072La r2, AnonymousClass1GQ r3) {
        C52422pP r0;
        C36321k7.A0w(r2, r3);
        if (r2.A0L()) {
            r0 = C52422pP.ENABLED_ADMIN;
        } else if (r2.A0M()) {
            r0 = C52422pP.ENABLED_FOLLOWERS;
        } else {
            r0 = C52422pP.ENABLED_ALL;
        }
        return C36371kC.A1T(r3.A00.A07(4721), r0.value);
    }
}
