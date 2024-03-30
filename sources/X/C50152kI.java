package X;

import java.lang.ref.WeakReference;

/* renamed from: X.2kI  reason: invalid class name and case insensitive filesystem */
public class C50152kI extends C132446Tt {
    public final C19600wD A00;
    public final AnonymousClass16D A01;
    public final C21159AAt A02;
    public final AnonymousClass19A A03;
    public final String A04;
    public final WeakReference A05;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        if (!this.A00.A09()) {
            return C36441kJ.A0Q(C131626Pu.A04, (Object) null);
        }
        try {
            this.A03.A0B(32000);
            return this.A02.A02(C108515Tu.A0C, this.A04);
        } catch (C33111ej unused) {
            return C36441kJ.A0Q(C131626Pu.A04, (Object) null);
        }
    }

    public void A09() {
        AnonymousClass4UY r0 = (AnonymousClass4UY) this.A05.get();
        if (r0 != null) {
            r0.BXf();
        }
    }

    public void A0A() {
        AnonymousClass4UY r0 = (AnonymousClass4UY) this.A05.get();
        if (r0 != null) {
            r0.BXh();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0C(java.lang.Object r7) {
        /*
            r6 = this;
            android.util.Pair r7 = (android.util.Pair) r7
            java.lang.ref.WeakReference r5 = r6.A05
            java.lang.Object r2 = r5.get()
            X.4UY r2 = (X.AnonymousClass4UY) r2
            if (r2 == 0) goto L_0x0016
            r2.BYu()
            if (r7 != 0) goto L_0x0017
            java.lang.String r0 = "handlecontactlesssync/fetchContactUsingNumber/disconnected/"
        L_0x0013:
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0016:
            return
        L_0x0017:
            java.lang.Object r1 = r7.first
            X.6Pu r1 = (X.C131626Pu) r1
            boolean r0 = r1.A01()
            if (r0 == 0) goto L_0x005e
            java.lang.Object r4 = r7.second
            X.9Oj r4 = (X.C194169Oj) r4
            r3 = 1
            boolean r1 = X.AnonymousClass000.A1V(r4)
            java.lang.String r0 = "deeplink: user is null"
            X.C18740tg.A0D(r1, r0)
            int r1 = r4.A04
            if (r1 != r3) goto L_0x0043
            com.whatsapp.jid.UserJid r1 = r4.A0D
            if (r1 == 0) goto L_0x0041
            X.16D r0 = r6.A01
            X.141 r0 = r0.A0D(r1)
        L_0x003d:
            r2.BXg(r0)
            return
        L_0x0041:
            r0 = 0
            goto L_0x003d
        L_0x0043:
            r0 = 2
            if (r1 != r0) goto L_0x0058
            java.lang.String r0 = "handlecontactlesssync/fetchContactUsingNumber/user/not-wa/"
        L_0x0048:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x004b:
            java.lang.Object r1 = r5.get()
            X.4UY r1 = (X.AnonymousClass4UY) r1
            if (r1 == 0) goto L_0x0016
            r0 = 0
            r1.BXg(r0)
            return
        L_0x0058:
            r0 = 3
            if (r1 != r0) goto L_0x004b
            java.lang.String r0 = "handlecontactlesssync/fetchContactUsingNumber/invalid/"
            goto L_0x0048
        L_0x005e:
            int r1 = r1.A00
            if (r1 != 0) goto L_0x006c
            java.lang.String r0 = "handlecontactlesssync/fetchContactUsingNumber/network-unavailable/"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 0
        L_0x0068:
            r2.Bgc(r0)
            return
        L_0x006c:
            r0 = 5
            if (r1 != r0) goto L_0x0076
            java.lang.String r0 = "handlecontactlesssync/fetchContactUsingNumber/rateLimited/try-again-later/"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 2
            goto L_0x0068
        L_0x0076:
            r0 = 4
            if (r1 != r0) goto L_0x0080
            java.lang.String r0 = "handlecontactlesssync/fetchContactUsingNumber/try-again/"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 1
            goto L_0x0068
        L_0x0080:
            r0 = 1
            if (r1 != r0) goto L_0x0086
            java.lang.String r0 = "handlecontactlesssync/fetchContactUsingNumber/existing request ongoing/"
            goto L_0x0013
        L_0x0086:
            r0 = 6
            if (r1 != r0) goto L_0x0016
            java.lang.String r0 = "handlecontactlesssync/fetchContactUsingNumber/exception-occurred/"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 3
            goto L_0x0068
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50152kI.A0C(java.lang.Object):void");
    }

    public C50152kI(C19600wD r2, AnonymousClass16D r3, AnonymousClass4UY r4, C21159AAt aAt, AnonymousClass19A r6, String str) {
        this.A05 = AnonymousClass001.A0F(r4);
        this.A04 = str;
        this.A03 = r6;
        this.A02 = aAt;
        this.A01 = r3;
        this.A00 = r2;
    }
}
