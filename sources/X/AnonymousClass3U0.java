package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.calling.service.VoiceFGService;
import com.whatsapp.voipcalling.CallState;

/* renamed from: X.3U0  reason: invalid class name */
public class AnonymousClass3U0 {
    public final C19730wQ A00;
    public final AnonymousClass1Pp A01;
    public final AnonymousClass16D A02;
    public final AnonymousClass16K A03;
    public final C27761Ps A04;
    public final C21060yb A05;
    public final C20810yC A06;
    public final C20350xQ A07;
    public final AnonymousClass1C6 A08;
    public final C19770wU A09;
    public final C21390zA A0A;
    public final C19700wN A0B;
    public final C62783Hn A0C;
    public final AnonymousClass171 A0D;
    public final C27731Pn A0E;
    public final C19630wG A0F;
    public final C25271Fq A0G;
    public final AnonymousClass1CR A0H;
    public final AnonymousClass13J A0I;

    private PendingIntent A00(Context context, AnonymousClass3OE r11, int i, boolean z) {
        Intent A072;
        String str;
        Context context2 = context;
        if (!r11.A09) {
            int i2 = 3;
            if (r11.A0E) {
                i2 = 10;
            }
            A072 = C36441kJ.A0j().A1d(context2, C114145gi.A00, r11.A05, i2, !this.A0A.A00);
            A072.putExtra("fgservice_start_failed", z);
        } else {
            A072 = A07(context, r11, i, z);
            A072.putExtra("lobbyEntryPoint", 2);
            if (r11.A0E) {
                str = C114145gi.A07;
            } else {
                str = "join_call";
            }
            A072.setAction(str);
        }
        return C65743Th.A03(context, A072, 2);
    }

    private String A01(Context context, AnonymousClass3OE r7, AnonymousClass1PW r8, String str, boolean z) {
        C61243Bc A042;
        if (str != null) {
            return str;
        }
        if (!r7.A09) {
            return AnonymousClass3TB.A02(this.A0D.A0H(this.A02.A0D(r7.A03)));
        } else if ((r7.A01 <= 0 || A05(r7, r8, z)) && (A042 = AnonymousClass3UD.A04(this.A02, this.A0D, r7.A06, 2, false)) != null) {
            return A042.A00(context).toString();
        } else {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x007d, code lost:
        if (r0 != false) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String A02(android.content.Context r9, X.AnonymousClass3OE r10, boolean r11) {
        /*
            r8 = this;
            long r0 = r10.A01
            boolean r3 = r10.A08
            boolean r2 = r10.A0C
            if (r2 == 0) goto L_0x0010
            r1 = 2131896025(0x7f1226d9, float:1.94269E38)
        L_0x000b:
            java.lang.String r0 = r9.getString(r1)
            return r0
        L_0x0010:
            r6 = 0
            r4 = 0
            r5 = 1
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x0070
            boolean r0 = r10.A09
            if (r0 != 0) goto L_0x0027
            boolean r0 = r10.A0F
            r1 = 2131895861(0x7f122635, float:1.9426567E38)
            if (r0 == 0) goto L_0x000b
            r1 = 2131891813(0x7f121665, float:1.9418357E38)
            goto L_0x000b
        L_0x0027:
            int r2 = r10.A00
            if (r2 < 0) goto L_0x0046
            boolean r0 = r10.A07
            if (r0 == 0) goto L_0x003b
            r1 = 2131755415(0x7f100197, float:1.9141709E38)
        L_0x0032:
            android.content.res.Resources r0 = r9.getResources()
            java.lang.String r0 = X.C36321k7.A0B(r0, r2, r4, r1)
            return r0
        L_0x003b:
            boolean r0 = r10.A0F
            r1 = 2131755416(0x7f100198, float:1.914171E38)
            if (r0 == 0) goto L_0x0032
            r1 = 2131755406(0x7f10018e, float:1.914169E38)
            goto L_0x0032
        L_0x0046:
            boolean r0 = r10.A0A
            if (r0 == 0) goto L_0x005d
            boolean r0 = r10.A07
            if (r0 == 0) goto L_0x0052
            r1 = 2131891752(0x7f121628, float:1.9418233E38)
            goto L_0x000b
        L_0x0052:
            boolean r0 = r10.A0F
            r1 = 2131891751(0x7f121627, float:1.941823E38)
            if (r0 == 0) goto L_0x000b
            r1 = 2131891750(0x7f121626, float:1.9418229E38)
            goto L_0x000b
        L_0x005d:
            boolean r0 = r10.A0F
            if (r0 == 0) goto L_0x0065
            r1 = 2131891811(0x7f121663, float:1.9418353E38)
            goto L_0x000b
        L_0x0065:
            boolean r0 = r10.A07
            r1 = 2131891812(0x7f121664, float:1.9418355E38)
            if (r0 == 0) goto L_0x000b
            r1 = 2131891815(0x7f121667, float:1.941836E38)
            goto L_0x000b
        L_0x0070:
            if (r3 == 0) goto L_0x0083
            com.whatsapp.voipcalling.CallState r1 = r10.A04
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRE_ACCEPT_RECEIVED
            if (r1 != r0) goto L_0x007f
            boolean r0 = r10.A0D
            r1 = 2131893755(0x7f121dfb, float:1.9422295E38)
            if (r0 == 0) goto L_0x000b
        L_0x007f:
            r1 = 2131887488(0x7f120580, float:1.9409585E38)
            goto L_0x000b
        L_0x0083:
            boolean r0 = r10.A07
            if (r0 == 0) goto L_0x00a8
            X.0yC r1 = r8.A06
            X.0wQ r0 = r8.A00
            boolean r0 = X.C34681hT.A0A(r0, r1)
            if (r0 == 0) goto L_0x00a8
            X.16D r1 = r8.A02
            com.whatsapp.jid.UserJid r0 = r10.A03
            X.141 r3 = r1.A0D(r0)
            r2 = 2131890861(0x7f1212ad, float:1.9416426E38)
        L_0x009c:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            X.171 r0 = r8.A0D
            X.C36371kC.A1K(r0, r3, r1, r4)
            java.lang.String r0 = r9.getString(r2, r1)
            return r0
        L_0x00a8:
            boolean r0 = r10.A09
            if (r0 == 0) goto L_0x00ef
            java.util.List r0 = r10.A06
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x00ef
            if (r11 == 0) goto L_0x00c9
            X.16D r1 = r8.A02
            com.whatsapp.jid.UserJid r0 = r10.A03
            X.141 r3 = r1.A0D(r0)
            boolean r0 = r10.A0F
            r2 = 2131889571(0x7f120da3, float:1.941381E38)
            if (r0 == 0) goto L_0x009c
            r2 = 2131889569(0x7f120da1, float:1.9413805E38)
            goto L_0x009c
        L_0x00c9:
            boolean r0 = r10.A0B
            if (r0 == 0) goto L_0x00d7
            com.whatsapp.voipcalling.CallState r1 = r10.A04
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x00e3
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE_ELSEWHERE
            if (r1 == r0) goto L_0x00e3
        L_0x00d7:
            boolean r0 = r10.A0F
            r1 = 2131890454(0x7f121116, float:1.94156E38)
            if (r0 == 0) goto L_0x000b
            r1 = 2131890452(0x7f121114, float:1.9415596E38)
            goto L_0x000b
        L_0x00e3:
            boolean r0 = r10.A0F
            r1 = 2131895998(0x7f1226be, float:1.9426845E38)
            if (r0 == 0) goto L_0x000b
            r1 = 2131895995(0x7f1226bb, float:1.9426839E38)
            goto L_0x000b
        L_0x00ef:
            boolean r0 = r10.A0F
            r1 = 2131890456(0x7f121118, float:1.9415604E38)
            if (r0 == 0) goto L_0x000b
            r1 = 2131895647(0x7f12255f, float:1.9426133E38)
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3U0.A02(android.content.Context, X.3OE, boolean):java.lang.String");
    }

    private void A03(Notification.Builder builder, Context context, AnonymousClass3OE r8, String str, int i) {
        Notification.CallStyle forOngoingCall;
        if (r8.A01 > 0 || r8.A08) {
            Person build = new Person.Builder().setName(str).build();
            Intent A0H2 = C36441kJ.A0H(context, VoiceFGService.class);
            A0H2.setAction("hangup_call");
            A0H2.putExtra("end_call_reason", 1);
            forOngoingCall = Notification.CallStyle.forOngoingCall(build, C65743Th.A04(context, A0H2, 134217728));
        } else {
            Person build2 = new Person.Builder().setName(str).build();
            Intent A0H3 = C36441kJ.A0H(context, VoiceFGService.class);
            A0H3.setAction("reject_call");
            A0H3.putExtra("call_id", r8.A05);
            int i2 = 4;
            if (r8.A0E) {
                i2 = 11;
            }
            A0H3.putExtra("call_ui_action", i2);
            forOngoingCall = Notification.CallStyle.forIncomingCall(build2, C65743Th.A04(context, A0H3, 134217728), A00(context, r8, i, false));
        }
        forOngoingCall.setIsVideo(r8.A0F);
        builder.setStyle(forOngoingCall);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A04(X.C07700Yy r7, X.AnonymousClass3OE r8, X.AnonymousClass141 r9, int r10) {
        /*
            r6 = this;
            r3 = 26
            r2 = 1
            if (r10 == r2) goto L_0x0013
            boolean r0 = r8.A0B
            if (r0 == 0) goto L_0x0092
            com.whatsapp.voipcalling.CallState r1 = r8.A04
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x0013
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE_ELSEWHERE
            if (r1 != r0) goto L_0x0092
        L_0x0013:
            r7.A09 = r2
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r3) goto L_0x0033
            boolean r0 = r8.A07
            if (r0 == 0) goto L_0x0089
            com.whatsapp.voipcalling.CallState r1 = r8.A04
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 != r0) goto L_0x0089
            X.3Hn r1 = r6.A0C
            X.1CR r0 = r6.A0H
            java.lang.String r1 = r1.A00(r9, r0)
        L_0x002b:
            boolean r0 = X.AnonymousClass6RR.A00(r1)
        L_0x002f:
            if (r0 != 0) goto L_0x0033
            r7.A0M = r1
        L_0x0033:
            X.0yC r1 = r6.A06
            r0 = 5892(0x1704, float:8.256E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0071
            X.0wQ r0 = r6.A00
            boolean r0 = r0.A0L()
            if (r0 != 0) goto L_0x0070
            X.3IL r0 = r9.A0F
            if (r0 == 0) goto L_0x0070
            java.lang.String r5 = r0.A01
            if (r5 == 0) goto L_0x0070
            long r3 = r0.A00
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0070
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "tel:"
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r5, r1)
            X.0TO r0 = new X.0TO
            r0.<init>()
            r0.A03 = r1
            X.0UW r1 = new X.0UW
            r1.<init>(r0)
            java.util.ArrayList r0 = r7.A0S
            r0.add(r1)
        L_0x0070:
            return
        L_0x0071:
            X.0yb r0 = r6.A05
            X.0ya r1 = r0.A0O()
            if (r1 == 0) goto L_0x00b6
            X.16D r0 = r6.A02
            android.net.Uri r0 = r0.A04(r9, r1)
            if (r0 == 0) goto L_0x0070
            java.lang.String r0 = r0.toString()
            r7.A0H(r0)
            return
        L_0x0089:
            X.3Hn r1 = r6.A0C
            X.1CR r0 = r6.A0H
            java.lang.String r1 = r1.A02(r9, r0)
            goto L_0x002b
        L_0x0092:
            r0 = 2
            if (r10 != r0) goto L_0x00a6
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r3) goto L_0x0033
            X.3Hn r1 = r6.A0C
            X.1CR r0 = r6.A0H
            java.lang.String r1 = r1.A01(r9, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            goto L_0x002f
        L_0x00a6:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "UNKNOWN NOTIFICATION TYPE "
            java.lang.String r1 = X.AnonymousClass000.A0r(r0, r1, r10)
            r0 = 0
            X.C18740tg.A0D(r0, r1)
            goto L_0x0033
        L_0x00b6:
            java.lang.String r0 = "voip/CallNotificationBuilder/addContactToNotification cr == null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3U0.A04(X.0Yy, X.3OE, X.141, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        if (r9.A06.A0E(4809) == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        if (r12 != false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r9.A06.A0E(4810) == false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A05(X.AnonymousClass3OE r10, X.AnonymousClass1PW r11, boolean r12) {
        /*
            r9 = this;
            boolean r3 = r10.A08
            r7 = 0
            r6 = 1
            if (r3 != 0) goto L_0x001c
            long r1 = r10.A01
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x001c
            boolean r0 = r10.A07
            if (r0 != 0) goto L_0x001c
            X.0yC r1 = r9.A06
            r0 = 4810(0x12ca, float:6.74E-42)
            boolean r0 = r1.A0E(r0)
            r5 = 1
            if (r0 != 0) goto L_0x001d
        L_0x001c:
            r5 = 0
        L_0x001d:
            long r1 = r10.A01
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x0025
            if (r3 == 0) goto L_0x0030
        L_0x0025:
            X.0yC r1 = r9.A06
            r0 = 4809(0x12c9, float:6.739E-42)
            boolean r0 = r1.A0E(r0)
            r4 = 1
            if (r0 != 0) goto L_0x0031
        L_0x0030:
            r4 = 0
        L_0x0031:
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.A03
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x003c
            r3 = 0
            if (r12 == 0) goto L_0x003d
        L_0x003c:
            r3 = 1
        L_0x003d:
            X.3Hn r2 = r9.A0C
            X.0yC r1 = r2.A01
            r0 = 6307(0x18a3, float:8.838E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0064
            X.1Fq r0 = r2.A00
            X.03c r0 = r0.A00
            boolean r1 = r0.A01()
        L_0x0051:
            if (r3 == 0) goto L_0x0066
            boolean r0 = X.C19550w8.A08()
            if (r0 == 0) goto L_0x0066
            int r0 = r10.A00
            if (r0 >= 0) goto L_0x0066
            if (r5 != 0) goto L_0x0061
            if (r4 == 0) goto L_0x0066
        L_0x0061:
            if (r1 == 0) goto L_0x0066
            return r6
        L_0x0064:
            r1 = 1
            goto L_0x0051
        L_0x0066:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3U0.A05(X.3OE, X.1PW, boolean):boolean");
    }

    public Intent A07(Context context, AnonymousClass3OE r6, int i, boolean z) {
        Intent A1b = C36441kJ.A0j().A1b(context, r6.A03, C36441kJ.A0x(this.A0A.A00));
        String str = r6.A05;
        C36421kH.A0n(A1b, str);
        A1b.putExtra("notification_type", i);
        A1b.putExtra("call_id", str);
        if (r6.A0E) {
            A1b.setAction(C114145gi.A07);
        }
        if (r6.A0B && r6.A04 == CallState.NONE) {
            A1b.putExtra("joinable", true);
        }
        A1b.putExtra("fgservice_start_failed", z);
        return A1b;
    }

    public AnonymousClass3U0(C21390zA r2, C19700wN r3, C19730wQ r4, C62783Hn r5, AnonymousClass1Pp r6, AnonymousClass16D r7, AnonymousClass171 r8, AnonymousClass16K r9, C27731Pn r10, C27761Ps r11, C21060yb r12, C19630wG r13, C25271Fq r14, C20810yC r15, C20350xQ r16, AnonymousClass1CR r17, AnonymousClass1C6 r18, AnonymousClass13J r19, C19770wU r20) {
        this.A06 = r15;
        this.A0B = r3;
        this.A00 = r4;
        this.A0F = r13;
        this.A09 = r20;
        this.A08 = r18;
        this.A0E = r10;
        this.A01 = r6;
        this.A02 = r7;
        this.A0I = r19;
        this.A05 = r12;
        this.A0D = r8;
        this.A07 = r16;
        this.A0H = r17;
        this.A03 = r9;
        this.A0G = r14;
        this.A0A = r2;
        this.A04 = r11;
        this.A0C = r5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v39, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v40, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v41, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r13v6, types: [com.whatsapp.jid.UserJid] */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0399, code lost:
        if (X.AnonymousClass6YG.A0A() == false) goto L_0x049e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03ab, code lost:
        if (r2 == com.whatsapp.voipcalling.CallState.ACTIVE_ELSEWHERE) goto L_0x03ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x040c, code lost:
        if (r8.A06.size() != 0) goto L_0x040e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0176, code lost:
        if (r0 != null) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01fa, code lost:
        if (r8.A00 >= 0) goto L_0x01fc;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Notification A06(android.content.Context r40, X.AnonymousClass3OE r41, X.AnonymousClass1PW r42, int r43, boolean r44) {
        /*
            r39 = this;
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/CallNotificationBuilder type = "
            r2.append(r0)
            r0 = 1
            r7 = r43
            if (r7 == r0) goto L_0x0161
            r0 = 2
            if (r7 == r0) goto L_0x015d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "UNKNOWN notification type "
            java.lang.String r1 = X.AnonymousClass000.A0r(r0, r1, r7)
            r0 = 0
            X.C18740tg.A0D(r0, r1)
            java.lang.String r0 = "NOTIFICATION_INVALID"
        L_0x0021:
            X.C36321k7.A1a(r2, r0)
            r8 = r41
            long r0 = r8.A01
            r16 = r0
            boolean r0 = r8.A08
            r21 = r0
            boolean r3 = r8.A07
            com.whatsapp.jid.GroupJid r13 = r8.A02
            r15 = r13
            r6 = r39
            X.16D r14 = r6.A02
            X.171 r4 = r6.A0D
            X.1C6 r1 = r6.A08
            X.0xQ r0 = r6.A07
            X.141 r2 = X.AnonymousClass3UL.A01(r14, r0, r13, r1, r3)
            if (r2 == 0) goto L_0x0159
            java.lang.String r37 = X.C36381kD.A0v(r4, r2)
        L_0x0047:
            X.0wG r2 = r6.A0F
            android.content.Context r4 = r2.A00
            r2 = 0
            r12 = 1
            boolean r5 = X.AnonymousClass000.A1V(r37)
            java.lang.String r27 = r6.A02(r4, r8, r5)
            java.lang.String r26 = r6.A02(r4, r8, r2)
            if (r3 == 0) goto L_0x0131
            r5 = 2131233966(0x7f080cae, float:1.8084084E38)
        L_0x005e:
            r9 = r40
            r28 = r44
            if (r3 == 0) goto L_0x0129
            X.C18740tg.A06(r13)
            X.190 r4 = X.C36441kJ.A0j()
            X.141 r2 = r14.A0D(r13)
            android.content.Intent r11 = r4.A1W(r9, r2)
            java.lang.String r2 = "fromCallNotification"
            r11.putExtra(r2, r12)
            X.0yC r2 = r6.A06
            boolean r2 = X.C34681hT.A0N(r2)
            if (r2 == 0) goto L_0x0087
            java.lang.String r4 = r8.A05
            java.lang.String r2 = "vcLobbyCallId"
            r11.putExtra(r2, r4)
        L_0x0087:
            java.lang.String r2 = "CallNotificationBuilder.getAudioChatContentIntent"
            X.AnonymousClass3M9.A02(r11, r2)
        L_0x008c:
            java.lang.String r10 = "lobbyEntryPoint"
            r11.putExtra(r10, r12)
            if (r3 != 0) goto L_0x011a
            r2 = r28
            android.content.Intent r4 = r6.A07(r9, r8, r7, r2)
            r2 = 6
            r4.putExtra(r10, r2)
        L_0x009d:
            if (r13 != 0) goto L_0x00a1
            com.whatsapp.jid.UserJid r13 = r8.A03
        L_0x00a1:
            if (r13 == 0) goto L_0x00ac
            java.lang.String r10 = r13.getRawString()
            java.lang.String r2 = "attributed_call_jid"
            r11.putExtra(r2, r10)
        L_0x00ac:
            android.app.PendingIntent r25 = X.C65743Th.A03(r9, r11, r12)
            android.content.res.Resources r13 = r9.getResources()
            r2 = 17104901(0x1050005, float:2.4428256E-38)
            int r10 = r13.getDimensionPixelSize(r2)
            r2 = 17104902(0x1050006, float:2.442826E-38)
            int r2 = r13.getDimensionPixelSize(r2)
            int r12 = java.lang.Math.min(r10, r2)
            r2 = 0
            r31 = r42
            if (r12 <= 0) goto L_0x01b1
            boolean r10 = r8.A09
            if (r10 == 0) goto L_0x00e6
            if (r15 != 0) goto L_0x00e6
            java.util.List r10 = r8.A06
            r18 = r10
            int r11 = r18.size()
            r10 = 1
            if (r11 == r10) goto L_0x00e6
            boolean r10 = r8.A0A
            if (r10 == 0) goto L_0x0117
            int r10 = r18.size()
            if (r10 != 0) goto L_0x0117
        L_0x00e6:
            r20 = -1
        L_0x00e8:
            java.util.ArrayList r19 = X.AnonymousClass001.A0I()
            java.util.ArrayList r11 = X.AnonymousClass001.A0I()
            java.util.ArrayList r10 = X.AnonymousClass001.A0I()
            X.141 r0 = X.AnonymousClass3UL.A01(r14, r0, r15, r1, r3)
            if (r0 != 0) goto L_0x0178
            java.util.List r0 = r8.A06
            r22 = r0
            java.util.Iterator r18 = r22.iterator()
        L_0x0102:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x0165
            X.11F r15 = X.C36401kF.A0a(r18)
            int r1 = r10.size()
            r0 = 3
            if (r1 >= r0) goto L_0x0165
            X.C36381kD.A1H(r14, r15, r10)
            goto L_0x0102
        L_0x0117:
            r20 = 0
            goto L_0x00e8
        L_0x011a:
            com.whatsapp.voipcalling.CallState r4 = r8.A04
            com.whatsapp.voipcalling.CallState r2 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r4 != r2) goto L_0x0126
            android.content.Intent r4 = X.C36431kI.A0D()
            goto L_0x009d
        L_0x0126:
            r4 = 0
            goto L_0x009d
        L_0x0129:
            r2 = r28
            android.content.Intent r11 = r6.A07(r9, r8, r7, r2)
            goto L_0x008c
        L_0x0131:
            r9 = 0
            int r4 = (r16 > r9 ? 1 : (r16 == r9 ? 0 : -1))
            boolean r2 = r8.A0F
            if (r4 <= 0) goto L_0x0143
            r5 = 2131231573(0x7f080355, float:1.807923E38)
            if (r2 == 0) goto L_0x005e
            r5 = 2131233394(0x7f080a72, float:1.8082924E38)
            goto L_0x005e
        L_0x0143:
            if (r21 == 0) goto L_0x014f
            r5 = 2131231574(0x7f080356, float:1.8079233E38)
            if (r2 == 0) goto L_0x005e
            r5 = 2131233397(0x7f080a75, float:1.808293E38)
            goto L_0x005e
        L_0x014f:
            r5 = 2131231571(0x7f080353, float:1.8079227E38)
            if (r2 == 0) goto L_0x005e
            r5 = 2131233390(0x7f080a6e, float:1.8082916E38)
            goto L_0x005e
        L_0x0159:
            r37 = 0
            goto L_0x0047
        L_0x015d:
            java.lang.String r0 = "NOTIFICATION_MUTE"
            goto L_0x0021
        L_0x0161:
            java.lang.String r0 = "NOTIFICATION_HEADS_UP"
            goto L_0x0021
        L_0x0165:
            boolean r0 = r8.A0A
            if (r0 == 0) goto L_0x017b
            int r0 = r22.size()
            if (r0 != 0) goto L_0x017b
            X.0wQ r0 = r6.A00
            r0.A0G()
            X.142 r0 = r0.A0E
            if (r0 == 0) goto L_0x017b
        L_0x0178:
            r10.add(r0)
        L_0x017b:
            java.util.Iterator r18 = r10.iterator()
        L_0x017f:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x01b7
            X.141 r10 = X.C36391kE.A0f(r18)
            X.16K r0 = r6.A03
            r1 = r20
            float r1 = (float) r1
            java.lang.String r15 = r10.A08(r1, r12)
            X.16L r0 = r0.A02
            X.1SZ r0 = r0.A01()
            java.lang.Object r0 = r0.A09(r15)
            if (r0 != 0) goto L_0x01ad
            X.1Pp r0 = r6.A01
            android.graphics.Bitmap r0 = r0.A04(r10, r1, r12)
            boolean r1 = r10.A0f
            if (r1 == 0) goto L_0x01ad
            r1 = r19
            r1.add(r10)
        L_0x01ad:
            r11.add(r0)
            goto L_0x017f
        L_0x01b1:
            java.lang.String r0 = "voip/CallNotificationBuilder/thumb-size-is-0"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x01ea
        L_0x01b7:
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x01ca
            int r1 = r11.size()
            r0 = 1
            if (r1 != r0) goto L_0x0380
            java.lang.Object r2 = X.C36441kJ.A12(r11)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
        L_0x01ca:
            boolean r0 = r19.isEmpty()
            if (r0 != 0) goto L_0x01ea
            X.0wU r10 = r6.A09
            X.1Ps r1 = r6.A04
            X.2jU r0 = new X.2jU
            r29 = r0
            r30 = r9
            r32 = r1
            r33 = r19
            r34 = r12
            r35 = r20
            r36 = r7
            r29.<init>(r30, r31, r32, r33, r34, r35, r36)
            X.C36331k8.A1F(r0, r10)
        L_0x01ea:
            com.whatsapp.jid.UserJid r0 = r8.A03
            X.141 r24 = r14.A0D(r0)
            r10 = 0
            int r0 = (r16 > r10 ? 1 : (r16 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x01fc
            int r0 = r8.A00
            r23 = 1
            if (r0 < 0) goto L_0x01fe
        L_0x01fc:
            r23 = 0
        L_0x01fe:
            X.0Yy r10 = X.C20600xp.A02(r9)
            java.lang.String r22 = "call"
            r0 = r22
            r10.A0L = r0
            r0 = 1
            r10.A09 = r0
            if (r23 == 0) goto L_0x0216
            r10.A0Y = r0
            long r0 = X.C36441kJ.A0A(r16)
            r10.A09(r0)
        L_0x0216:
            r0 = r27
            r10.A0E(r0)
            X.C36341k9.A14(r10, r0)
            r0 = r25
            r10.A0D = r0
            int r0 = r8.A00
            boolean r0 = X.C36401kF.A1U(r0)
            r14 = 1
            if (r0 == 0) goto L_0x022e
            r10.A0I(r14)
        L_0x022e:
            r10.A0A(r2)
            android.app.Notification r12 = r10.A0B
            r12.icon = r5
            if (r7 != r14) goto L_0x037d
            if (r0 != 0) goto L_0x037d
            if (r4 == 0) goto L_0x037d
            r1 = 134217728(0x8000000, float:3.85186E-34)
            r0 = 4
            android.app.PendingIntent r0 = X.C65743Th.A00(r9, r0, r4, r1)
            r10.A0E = r0
            r1 = 128(0x80, float:1.794E-43)
            int r0 = r12.flags
            r1 = r1 | r0
            r12.flags = r1
            r11 = 1
        L_0x024c:
            r13 = 0
            r33 = r6
            r34 = r9
            r35 = r8
            r36 = r31
            r38 = r11
            java.lang.String r4 = r33.A01(r34, r35, r36, r37, r38)
            if (r4 == 0) goto L_0x0260
            r10.A0F(r4)
        L_0x0260:
            r18 = 0
            if (r21 != 0) goto L_0x0359
            int r0 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r0 > 0) goto L_0x0359
            boolean r0 = r8.A0B
            if (r0 == 0) goto L_0x0278
            if (r3 != 0) goto L_0x031f
            com.whatsapp.voipcalling.CallState r1 = r8.A04
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x031f
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE_ELSEWHERE
            if (r1 == r0) goto L_0x031f
        L_0x0278:
            java.lang.String r0 = "reject_call"
            java.lang.Class<com.whatsapp.calling.service.VoiceFGService> r1 = com.whatsapp.calling.service.VoiceFGService.class
            android.content.Intent r2 = X.C36441kJ.A0H(r9, r1)
            r2.setAction(r0)
            java.lang.String r1 = r8.A05
            java.lang.String r0 = "call_id"
            r2.putExtra(r0, r1)
            boolean r0 = r8.A0E
            r21 = r0
            r1 = 4
            if (r0 == 0) goto L_0x0293
            r1 = 11
        L_0x0293:
            java.lang.String r0 = "call_ui_action"
            r2.putExtra(r0, r1)
            r0 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r20 = X.C65743Th.A04(r9, r2, r0)
            boolean r1 = r8.A09
            r0 = 2131893501(0x7f121cfd, float:1.942178E38)
            r2 = 2131099974(0x7f060146, float:1.7812316E38)
            if (r1 == 0) goto L_0x02ae
            r0 = 2131895959(0x7f122697, float:1.9426766E38)
            r2 = 2131099975(0x7f060147, float:1.7812318E38)
        L_0x02ae:
            java.lang.String r3 = r9.getString(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r15 = 25
            if (r0 < r15) goto L_0x02ce
            if (r7 != r14) goto L_0x02ce
            android.text.SpannableString r3 = X.C36441kJ.A0O(r3)
            int r0 = r9.getColor(r2)
            android.text.style.ForegroundColorSpan r2 = new android.text.style.ForegroundColorSpan
            r2.<init>(r0)
            int r0 = r3.length()
            r3.setSpan(r2, r13, r0, r13)
        L_0x02ce:
            r15 = 2131231799(0x7f080437, float:1.807969E38)
            X.0Wx r2 = new X.0Wx
            r0 = r20
            r2.<init>(r15, r3, r0)
            java.util.ArrayList r3 = r10.A0Q
            r3.add(r2)
            r0 = r28
            android.app.PendingIntent r20 = r6.A00(r9, r8, r7, r0)
            boolean r0 = r8.A0F
            r2 = 2131231779(0x7f080423, float:1.8079649E38)
            if (r0 == 0) goto L_0x02ed
            r2 = 2131231867(0x7f08047b, float:1.8079827E38)
        L_0x02ed:
            if (r1 == 0) goto L_0x0350
            r0 = 2131895978(0x7f1226aa, float:1.9426804E38)
        L_0x02f2:
            java.lang.String r1 = r9.getString(r0)
            int r15 = android.os.Build.VERSION.SDK_INT
            r0 = 25
            if (r15 < r0) goto L_0x0315
            if (r7 != r14) goto L_0x0315
            android.text.SpannableString r1 = X.C36441kJ.A0O(r1)
            r0 = 2131099973(0x7f060145, float:1.7812314E38)
            int r15 = r9.getColor(r0)
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r15)
            int r15 = r1.length()
            r1.setSpan(r0, r13, r15, r13)
        L_0x0315:
            X.0Wx r13 = new X.0Wx
            r0 = r20
            r13.<init>(r2, r1, r0)
            r3.add(r13)
        L_0x031f:
            java.lang.String r0 = "call_notification_group"
            r10.A0N = r0
            r10.A0U = r14
        L_0x0325:
            X.0Yy r2 = X.C20600xp.A02(r9)
            r0 = r22
            r2.A0L = r0
            r2.A09 = r14
            if (r23 == 0) goto L_0x033a
            r2.A0Y = r14
            long r0 = X.C36441kJ.A0A(r16)
            r2.A09(r0)
        L_0x033a:
            r0 = r26
            r2.A0E(r0)
            r0 = 2131896300(0x7f1227ec, float:1.9427457E38)
            java.lang.String r0 = r9.getString(r0)
            if (r0 == 0) goto L_0x034b
            r2.A0F(r0)
        L_0x034b:
            android.app.Notification r0 = r2.A0B
            r0.icon = r5
            goto L_0x038d
        L_0x0350:
            r0 = 2131886487(0x7f120197, float:1.9407554E38)
            if (r21 == 0) goto L_0x02f2
            r0 = 2131895890(0x7f122652, float:1.9426626E38)
            goto L_0x02f2
        L_0x0359:
            r3 = 2131231799(0x7f080437, float:1.807969E38)
            r0 = 2131890343(0x7f1210a7, float:1.9415375E38)
            java.lang.String r2 = r9.getString(r0)
            java.lang.Class<com.whatsapp.calling.service.VoiceFGService> r0 = com.whatsapp.calling.service.VoiceFGService.class
            android.content.Intent r1 = X.C36441kJ.A0H(r9, r0)
            java.lang.String r0 = "hangup_call"
            r1.setAction(r0)
            java.lang.String r0 = "end_call_reason"
            r1.putExtra(r0, r14)
            r0 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r0 = X.C65743Th.A04(r9, r1, r0)
            r10.A08(r3, r2, r0)
            goto L_0x0325
        L_0x037d:
            r11 = 0
            goto L_0x024c
        L_0x0380:
            r0 = 2131168343(0x7f070c57, float:1.7950985E38)
            float r0 = r13.getDimension(r0)
            android.graphics.Bitmap r2 = X.C27731Pn.A01(r11, r0)
            goto L_0x01ca
        L_0x038d:
            android.app.Notification r0 = r2.A05()     // Catch:{ SecurityException -> 0x0394 }
            r10.A0C = r0     // Catch:{ SecurityException -> 0x0394 }
            goto L_0x039b
        L_0x0394:
            r1 = move-exception
            boolean r0 = X.AnonymousClass6YG.A0A()
            if (r0 == 0) goto L_0x049e
        L_0x039b:
            r0 = r24
            r6.A04(r10, r8, r0, r7)
            if (r44 != 0) goto L_0x03ad
            com.whatsapp.voipcalling.CallState r2 = r8.A04
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r2 == r0) goto L_0x03ad
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.CallState.ACTIVE_ELSEWHERE
            r0 = 1
            if (r2 != r1) goto L_0x03ae
        L_0x03ad:
            r0 = 0
        L_0x03ae:
            r10.A0J(r0)
            boolean r0 = X.C19550w8.A0A()
            if (r0 == 0) goto L_0x03dc
            r0 = r31
            boolean r0 = r6.A05(r8, r0, r11)
            if (r0 != 0) goto L_0x03dc
            X.0yC r1 = r6.A06
            r0 = 4793(0x12b9, float:6.716E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x03dc
            java.lang.Class<com.whatsapp.calling.service.VoiceFGService> r0 = com.whatsapp.calling.service.VoiceFGService.class
            android.content.Intent r1 = X.C36441kJ.A0H(r9, r0)
            java.lang.String r0 = "recreate_notification"
            r1.setAction(r0)
            r0 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r0 = X.C65743Th.A04(r9, r1, r0)
            r12.deleteIntent = r0
        L_0x03dc:
            r0 = r31
            boolean r0 = r6.A05(r8, r0, r11)     // Catch:{ SecurityException -> 0x0473 }
            java.lang.String r2 = "voip/CallNotificationBuilder "
            if (r0 == 0) goto L_0x0440
            if (r11 != 0) goto L_0x03ea
            if (r44 != 0) goto L_0x0440
        L_0x03ea:
            java.util.ArrayList r0 = r10.A0Q     // Catch:{ SecurityException -> 0x0473 }
            r0.clear()     // Catch:{ SecurityException -> 0x0473 }
            java.lang.String r1 = "CallNotificationBuilder/build/ callstyle title cannot be empty"
            android.os.ConditionVariable r0 = X.C18740tg.A00     // Catch:{ SecurityException -> 0x0473 }
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ SecurityException -> 0x0473 }
            if (r0 != 0) goto L_0x043b
            android.app.Notification r0 = r10.A05()     // Catch:{ SecurityException -> 0x0473 }
            android.app.Notification$Builder r13 = android.app.Notification.Builder.recoverBuilder(r9, r0)     // Catch:{ SecurityException -> 0x0473 }
            boolean r0 = r8.A0A     // Catch:{ SecurityException -> 0x0473 }
            if (r0 == 0) goto L_0x040e
            java.util.List r0 = r8.A06     // Catch:{ SecurityException -> 0x0473 }
            int r1 = r0.size()     // Catch:{ SecurityException -> 0x0473 }
            r0 = 1
            if (r1 == 0) goto L_0x040f
        L_0x040e:
            r0 = 0
        L_0x040f:
            if (r0 == 0) goto L_0x0418
            r0 = 2131891810(0x7f121662, float:1.941835E38)
            java.lang.String r4 = r9.getString(r0)     // Catch:{ SecurityException -> 0x0473 }
        L_0x0418:
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ SecurityException -> 0x0473 }
            if (r0 == 0) goto L_0x0425
            r0 = 2131891810(0x7f121662, float:1.941835E38)
            java.lang.String r4 = r9.getString(r0)     // Catch:{ SecurityException -> 0x0473 }
        L_0x0425:
            r12 = r6
            r14 = r9
            r15 = r8
            r16 = r4
            r17 = r7
            r12.A03(r13, r14, r15, r16, r17)     // Catch:{ SecurityException -> 0x0473 }
            android.app.Notification r1 = r13.build()     // Catch:{ SecurityException -> 0x0473 }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()     // Catch:{ SecurityException -> 0x0473 }
            X.C36321k7.A1K(r1, r2, r0)     // Catch:{ SecurityException -> 0x0473 }
            return r1
        L_0x043b:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r1)     // Catch:{ SecurityException -> 0x0473 }
            throw r0     // Catch:{ SecurityException -> 0x0473 }
        L_0x0440:
            android.app.Notification r4 = r10.A05()     // Catch:{ SecurityException -> 0x0473 }
            int r0 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x046b
            android.widget.RemoteViews r0 = r4.bigContentView
            if (r0 == 0) goto L_0x046b
            java.lang.String r0 = "com.android.internal.R$id"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x0465 }
            java.lang.String r0 = "time"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r0)     // Catch:{ Exception -> 0x0465 }
            r0 = 0
            int r3 = r1.getInt(r0)     // Catch:{ Exception -> 0x0465 }
            android.widget.RemoteViews r1 = r4.bigContentView     // Catch:{ Exception -> 0x0465 }
            r0 = 8
            r1.setViewVisibility(r3, r0)     // Catch:{ Exception -> 0x0465 }
            goto L_0x046b
        L_0x0465:
            r1 = move-exception
            java.lang.String r0 = "voip/service/notification/time-ui-gone"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x046b:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()
            X.C36321k7.A1K(r4, r2, r0)
            return r4
        L_0x0473:
            r1 = move-exception
            boolean r0 = X.AnonymousClass6YG.A0A()
            if (r0 == 0) goto L_0x049e
            X.0Yy r1 = X.C20600xp.A02(r9)
            r0 = r27
            r1.A0E(r0)
            r0 = r25
            r1.A0D = r0
            android.app.Notification r0 = r1.A0B
            r0.icon = r5
            java.lang.String r0 = r33.A01(r34, r35, r36, r37, r38)
            if (r0 == 0) goto L_0x0494
            r1.A0F(r0)
        L_0x0494:
            r0 = r24
            r6.A04(r1, r8, r0, r7)
            android.app.Notification r1 = r1.A05()
            return r1
        L_0x049e:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3U0.A06(android.content.Context, X.3OE, X.1PW, int, boolean):android.app.Notification");
    }
}
