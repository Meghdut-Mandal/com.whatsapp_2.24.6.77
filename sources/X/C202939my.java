package X;

import android.content.Context;
import android.content.DialogInterface;
import com.whatsapp.R;

/* renamed from: X.9my  reason: invalid class name and case insensitive filesystem */
public class C202939my {
    public final C194929Ru A00;
    public final C23075B3f A01;
    public final C24611Dc A02 = C165607th.A0c("PaymentsCommonErrorHelper", "payment");

    public static Integer A01(int i) {
        int i2;
        if (!(i == 6 || i == 7)) {
            switch (i) {
                case -2:
                    break;
                case 400:
                case 500:
                case 503:
                case 4002:
                    i2 = R.string.f12nameremoved;
                    break;
                case 403:
                case 2826001:
                    i2 = R.string.f12nameremoved;
                    break;
                case 443:
                    i2 = R.string.f12nameremoved;
                    break;
                case 10702:
                    i2 = R.string.f12nameremoved;
                    break;
                case 2826004:
                    i2 = R.string.f12nameremoved;
                    break;
                case 2826007:
                    i2 = R.string.f12nameremoved;
                    break;
                case 2826009:
                    i2 = R.string.f12nameremoved;
                    break;
                case 2826012:
                    i2 = R.string.f12nameremoved;
                    break;
                default:
                    return null;
            }
        }
        i2 = R.string.f12nameremoved;
        return Integer.valueOf(i2);
    }

    private String A02(Context context, int i, int i2) {
        String A002 = this.A00.A00(i);
        if (A002 == null) {
            return context.getString(i2);
        }
        return A002;
    }

    private void A03(int i, String str, String str2) {
        C23075B3f b3f = this.A01;
        if (b3f != null) {
            C176658cT B4W = b3f.B4W();
            B4W.A08 = C36371kC.A0o();
            B4W.A0b = "error";
            B4W.A0S = String.valueOf(i);
            B4W.A0T = str2;
            if (str != null) {
                B4W.A0U = str;
            }
            C165567td.A16(this.A02, b3f, "PaymentUserActionEvent errorMapLoggingEvent: ", AnonymousClass000.A0u());
            b3f.BOl(B4W);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0084, code lost:
        if (r1 != null) goto L_0x0086;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0031 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0FM A04(android.content.Context r5, android.content.DialogInterface.OnDismissListener r6, android.content.DialogInterface.OnDismissListener r7, int r8) {
        /*
            r4 = this;
            r0 = 440(0x1b8, float:6.17E-43)
            r2 = 0
            if (r8 == r0) goto L_0x004e
            r0 = 446(0x1be, float:6.25E-43)
            if (r8 == r0) goto L_0x0043
            r0 = 2826026(0x2b1f2a, float:3.960106E-39)
            if (r8 == r0) goto L_0x0038
            r0 = 2826046(0x2b1f3e, float:3.960134E-39)
            if (r8 != r0) goto L_0x0028
            r0 = 2131888604(0x7f1209dc, float:1.9411848E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131888603(0x7f1209db, float:1.9411846E38)
        L_0x001d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x0028
            X.9I0 r2 = new X.9I0
            r2.<init>(r1, r0)
        L_0x0028:
            r3 = 0
            if (r2 == 0) goto L_0x0032
            java.lang.Integer r1 = r2.A01
            java.lang.Integer r0 = r2.A00
        L_0x002f:
            if (r0 != 0) goto L_0x0059
            return r3
        L_0x0032:
            java.lang.Integer r0 = A01(r8)
            r1 = r3
            goto L_0x002f
        L_0x0038:
            r0 = 2131895080(0x7f122328, float:1.9424983E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131895079(0x7f122327, float:1.942498E38)
            goto L_0x001d
        L_0x0043:
            r0 = 2131892470(0x7f1218f6, float:1.941969E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131892469(0x7f1218f5, float:1.9419687E38)
            goto L_0x001d
        L_0x004e:
            r0 = 2131894310(0x7f122026, float:1.9423421E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131894957(0x7f1222ad, float:1.9424733E38)
            goto L_0x001d
        L_0x0059:
            int r0 = r0.intValue()
            java.lang.String r2 = r4.A02(r5, r8, r0)
            r0 = 400(0x190, float:5.6E-43)
            if (r8 == r0) goto L_0x00a3
            r0 = 403(0x193, float:5.65E-43)
            if (r8 == r0) goto L_0x00a3
            r0 = 2826001(0x2b1f11, float:3.960071E-39)
            if (r8 == r0) goto L_0x00a3
        L_0x006e:
            if (r1 != 0) goto L_0x0086
            r1 = 2826007(0x2b1f17, float:3.960079E-39)
            r0 = 2131888766(0x7f120a7e, float:1.9412177E38)
            if (r8 == r1) goto L_0x0080
            r0 = 2826009(0x2b1f19, float:3.960082E-39)
            if (r8 != r0) goto L_0x00a5
            r0 = 2131892707(0x7f1219e3, float:1.942017E38)
        L_0x0080:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            if (r1 == 0) goto L_0x00a5
        L_0x0086:
            int r0 = r1.intValue()
            java.lang.String r1 = r5.getString(r0)
            r4.A03(r8, r1, r2)
            X.1qm r0 = X.AnonymousClass3LW.A00(r5)
            r0.A0q(r1)
            X.C39001qm.A0A(r0, r2)
            X.0FM r0 = r0.create()
            r0.setOnDismissListener(r7)
            return r0
        L_0x00a3:
            r7 = r6
            goto L_0x006e
        L_0x00a5:
            r4.A03(r8, r3, r2)
            X.0FM r0 = A00(r5, r7, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202939my.A04(android.content.Context, android.content.DialogInterface$OnDismissListener, android.content.DialogInterface$OnDismissListener, int):X.0FM");
    }

    public AnonymousClass0FM A05(Context context, DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnDismissListener onDismissListener2, int i) {
        int i2;
        if (i == 8 || i == 9 || i == 444 || i == 478) {
            i2 = R.string.f12nameremoved;
            onDismissListener2 = onDismissListener;
        } else if (i != 1448) {
            return null;
        } else {
            i2 = R.string.f12nameremoved;
        }
        String A022 = A02(context, i, i2);
        A03(i, (String) null, A022);
        return A00(context, onDismissListener2, A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (r9 != 2826008) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0045, code lost:
        if (r9 != 12750) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0047, code lost:
        A03(r9, r2, r4.getString(com.whatsapp.R.string.f12nameremoved));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
        if (r2 == null) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        r0 = X.AnonymousClass3LW.A00(r4);
        r0.A0q(r2);
        X.C39001qm.A0A(r0, r1);
        r0 = r0.create();
        r0.setOnDismissListener(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0065, code lost:
        A03(r9, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007b, code lost:
        r1 = A02(r4, r9, r0);
        r0 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a3, code lost:
        r2 = r4.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b2, code lost:
        r2 = r4.getString(r0);
        r5 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00bf, code lost:
        r1 = A02(r4, r9, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c3, code lost:
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cf, code lost:
        r2 = r4.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d3, code lost:
        if (r1 == null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d5, code lost:
        r7 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f5, code lost:
        return A00(r4, r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0FM A06(android.content.Context r4, android.content.DialogInterface.OnDismissListener r5, android.content.DialogInterface.OnDismissListener r6, android.content.DialogInterface.OnDismissListener r7, java.lang.String r8, int r9) {
        /*
            r3 = this;
            r0 = 405(0x195, float:5.68E-43)
            r1 = 2131892500(0x7f121914, float:1.941975E38)
            if (r9 == r0) goto L_0x00db
            r0 = 406(0x196, float:5.69E-43)
            r1 = 2131892497(0x7f121911, float:1.9419744E38)
            if (r9 == r0) goto L_0x00db
            r0 = 409(0x199, float:5.73E-43)
            if (r9 == r0) goto L_0x00d8
            r0 = 410(0x19a, float:5.75E-43)
            r1 = 2131892499(0x7f121913, float:1.9419748E38)
            if (r9 == r0) goto L_0x00db
            r0 = 426(0x1aa, float:5.97E-43)
            r1 = 2131892496(0x7f121910, float:1.9419742E38)
            if (r9 == r0) goto L_0x00db
            r0 = 460(0x1cc, float:6.45E-43)
            r1 = 2131892501(0x7f121915, float:1.9419752E38)
            if (r9 == r0) goto L_0x00db
            r0 = 2826008(0x2b1f18, float:3.96008E-39)
            if (r9 == r0) goto L_0x00d8
        L_0x002c:
            X.0FM r0 = r3.A05(r4, r6, r7, r9)
            if (r0 != 0) goto L_0x0064
            X.0FM r0 = r3.A04(r4, r6, r7, r9)
            if (r0 != 0) goto L_0x0064
            r2 = 0
            switch(r9) {
                case 2001: goto L_0x00c5;
                case 2304: goto L_0x00bc;
                case 2321: goto L_0x00bc;
                case 10010: goto L_0x00b8;
                case 10775: goto L_0x00a8;
                case 12750: goto L_0x0099;
                case 2826003: goto L_0x008e;
                case 2826006: goto L_0x0083;
                case 2826015: goto L_0x0078;
                case 2826018: goto L_0x0074;
                case 2896003: goto L_0x0069;
                case 2896004: goto L_0x0069;
                default: goto L_0x003c;
            }
        L_0x003c:
            r0 = 2131892408(0x7f1218b8, float:1.9419563E38)
            java.lang.String r1 = r3.A02(r4, r9, r0)
        L_0x0043:
            r0 = 12750(0x31ce, float:1.7867E-41)
            if (r9 != r0) goto L_0x0065
            r0 = 2131892513(0x7f121921, float:1.9419776E38)
            java.lang.String r0 = r4.getString(r0)
            r3.A03(r9, r2, r0)
        L_0x0051:
            if (r2 == 0) goto L_0x00f1
            X.1qm r0 = X.AnonymousClass3LW.A00(r4)
            r0.A0q(r2)
            X.C39001qm.A0A(r0, r1)
            X.0FM r0 = r0.create()
            r0.setOnDismissListener(r7)
        L_0x0064:
            return r0
        L_0x0065:
            r3.A03(r9, r2, r1)
            goto L_0x0051
        L_0x0069:
            r0 = 2131890431(0x7f1210ff, float:1.9415554E38)
            java.lang.String r1 = r3.A02(r4, r9, r0)
            r0 = 2131890432(0x7f121100, float:1.9415556E38)
            goto L_0x00a3
        L_0x0074:
            r0 = 2131892271(0x7f12182f, float:1.9419286E38)
            goto L_0x007b
        L_0x0078:
            r0 = 2131892270(0x7f12182e, float:1.9419284E38)
        L_0x007b:
            java.lang.String r1 = r3.A02(r4, r9, r0)
            r0 = 2131892707(0x7f1219e3, float:1.942017E38)
            goto L_0x00b2
        L_0x0083:
            r0 = 2131892568(0x7f121958, float:1.9419888E38)
            java.lang.String r1 = r3.A02(r4, r9, r0)
            r0 = 2131892471(0x7f1218f7, float:1.9419691E38)
            goto L_0x00a3
        L_0x008e:
            r0 = 2131892375(0x7f121897, float:1.9419497E38)
            java.lang.String r1 = r3.A02(r4, r9, r0)
            r0 = 2131892707(0x7f1219e3, float:1.942017E38)
            goto L_0x00cf
        L_0x0099:
            r0 = 2131892513(0x7f121921, float:1.9419776E38)
            java.lang.String r1 = X.C36321k7.A0A(r4, r8, r0)
            r0 = 2131892514(0x7f121922, float:1.9419778E38)
        L_0x00a3:
            java.lang.String r2 = r4.getString(r0)
            goto L_0x00c3
        L_0x00a8:
            r0 = 2131892262(0x7f121826, float:1.9419267E38)
            java.lang.String r1 = r4.getString(r0)
            r0 = 2131892263(0x7f121827, float:1.941927E38)
        L_0x00b2:
            java.lang.String r2 = r4.getString(r0)
            r5 = r7
            goto L_0x00d3
        L_0x00b8:
            r0 = 2131892367(0x7f12188f, float:1.941948E38)
            goto L_0x00bf
        L_0x00bc:
            r0 = 2131892161(0x7f1217c1, float:1.9419062E38)
        L_0x00bf:
            java.lang.String r1 = r3.A02(r4, r9, r0)
        L_0x00c3:
            r5 = r6
            goto L_0x00d3
        L_0x00c5:
            r0 = 2131892437(0x7f1218d5, float:1.9419622E38)
            java.lang.String r1 = r3.A02(r4, r9, r0)
            r0 = 2131892438(0x7f1218d6, float:1.9419624E38)
        L_0x00cf:
            java.lang.String r2 = r4.getString(r0)
        L_0x00d3:
            if (r1 == 0) goto L_0x003c
            r7 = r5
            goto L_0x0043
        L_0x00d8:
            r1 = 2131892498(0x7f121912, float:1.9419746E38)
        L_0x00db:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x002c
            int r0 = r0.intValue()
            X.C18740tg.A06(r8)
            java.lang.String r0 = X.C36321k7.A0A(r4, r8, r0)
            X.0FM r0 = A00(r4, r6, r0)
            return r0
        L_0x00f1:
            X.0FM r0 = A00(r4, r7, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202939my.A06(android.content.Context, android.content.DialogInterface$OnDismissListener, android.content.DialogInterface$OnDismissListener, android.content.DialogInterface$OnDismissListener, java.lang.String, int):X.0FM");
    }

    public C202939my(C194929Ru r3, C23075B3f b3f) {
        this.A00 = r3;
        this.A01 = b3f;
    }

    public static AnonymousClass0FM A00(Context context, DialogInterface.OnDismissListener onDismissListener, String str) {
        C39001qm A002 = AnonymousClass3LW.A00(context);
        C39001qm.A0A(A002, str);
        AnonymousClass0FM create = A002.create();
        create.setOnDismissListener(onDismissListener);
        return create;
    }
}
