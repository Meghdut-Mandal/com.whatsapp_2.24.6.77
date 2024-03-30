package X;

import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: X.1aE  reason: invalid class name and case insensitive filesystem */
public final class C30451aE extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C30441aD this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30451aE(C30441aD r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String str;
        Object obj = this.this$0.A00.get();
        AnonymousClass00C.A08(obj);
        Iterable iterable = (Iterable) obj;
        int A02 = C000300d.A02(AnonymousClass03U.A06(iterable, 10));
        if (A02 < 16) {
            A02 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A02);
        for (Object next : iterable) {
            C195569Uy r3 = (C195569Uy) next;
            if (r3 instanceof C177478dr) {
                str = "TextStatusUpdateNotification";
            } else if (r3 instanceof C177418dl) {
                str = "TextStatusUpdateNotificationSideSub";
            } else if (r3 instanceof C177468dq) {
                str = "NotificationNewsletterStateChange";
            } else if (r3 instanceof C177498dt) {
                str = "NotificationNewsletterOwnerUpdate";
            } else if (r3 instanceof C177388di) {
                str = "NotificationNewsletterMuteChange";
            } else if (r3 instanceof C177458dp) {
                str = "NotificationNewsletterUpdate";
            } else if (r3 instanceof C177378dh) {
                str = "NotificationNewsletterLeave";
            } else if (r3 instanceof C177368dg) {
                str = "NotificationNewsletterJoin";
            } else if (r3 instanceof C177448do) {
                str = "NotificationNewsletterAdminPromote";
            } else if (r3 instanceof C177438dn) {
                str = "NotificationNewsletterAdminInviteRevoke";
            } else if (r3 instanceof C177428dm) {
                str = "NotificationNewsletterAdminDemote";
            } else if (r3 instanceof C177408dk) {
                str = "NewsletterMetadataNotification";
            } else if (r3 instanceof C177488ds) {
                str = "NotificationNewsletterAdminMetadataUpdate";
            } else {
                str = "NotificationGroupPropertyUpdate";
            }
            Locale locale = Locale.US;
            AnonymousClass00C.A09(locale);
            String lowerCase = str.toLowerCase(locale);
            AnonymousClass00C.A08(lowerCase);
            linkedHashMap.put(lowerCase, next);
        }
        return linkedHashMap;
    }
}
