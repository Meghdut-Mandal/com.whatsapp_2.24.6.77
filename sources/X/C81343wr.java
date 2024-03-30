package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.notification.AndroidWear;
import com.whatsapp.notification.DirectReplyService;

/* renamed from: X.3wr  reason: invalid class name and case insensitive filesystem */
public class C81343wr implements Runnable {
    public boolean A00;
    public final Context A01;
    public final C21390zA A02;
    public final C19730wQ A03;
    public final C29411Wn A04;
    public final AnonymousClass1MK A05;
    public final AnonymousClass1LV A06;
    public final AnonymousClass16D A07;
    public final AnonymousClass171 A08;
    public final AnonymousClass1V6 A09;
    public final AnonymousClass1G5 A0A;
    public final C21060yb A0B;
    public final C25271Fq A0C;
    public final C20830yE A0D;
    public final C19420v0 A0E;
    public final C220412q A0F;
    public final AnonymousClass17X A0G;
    public final C20810yC A0H;
    public final C28361Si A0I;
    public final C20600xp A0J;
    public final AnonymousClass1TE A0K;
    public final C26031Ip A0L;
    public final AnonymousClass1TF A0M;
    public final AnonymousClass3T1 A0N;
    public final C24551Cw A0O;
    public final AnonymousClass12U A0P;
    public final AnonymousClass1G4 A0Q;
    public final AnonymousClass1CR A0R;
    public final AnonymousClass1A1 A0S;
    public final AnonymousClass1Q0 A0T;
    public final C34071gP A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final int A0Z;
    public final AnonymousClass17Y A0a;
    public final C26021Io A0b;
    public final C25791Hr A0c;
    public final AnonymousClass1NG A0d;
    public final C27671Pf A0e;
    public final AnonymousClass185 A0f;
    public final C235618y A0g;
    public final AnonymousClass1A6 A0h;
    public final AnonymousClass1NM A0i;
    public final C19970wo A0j;
    public final C18820ts A0k;
    public final C20500xf A0l;
    public final C25261Fp A0m;
    public final AnonymousClass17V A0n;
    public final AnonymousClass11F A0o;
    public final AnonymousClass39J A0p;
    public final AnonymousClass32Y A0q;
    public final AnonymousClass1AW A0r;
    public final AnonymousClass1C6 A0s;
    public final AnonymousClass1E9 A0t;
    public final AnonymousClass1EM A0u;
    public final AnonymousClass13J A0v;
    public final boolean A0w;
    public final boolean A0x;

    public static AnonymousClass00I A01(Context context, AnonymousClass141 r5, boolean z) {
        Uri A002 = AnonymousClass1U4.A00(r5);
        String str = C56682wi.A00;
        Intent A0F2 = AnonymousClass190.A0F(context, 2);
        A0F2.setData(A002);
        A0F2.setAction(str);
        A0F2.addFlags(335544320);
        Intent putExtra = A0F2.putExtra("fromNotification", true).putExtra("last_notification_keep_in_chat", z);
        AnonymousClass3M9.A02(putExtra, "ChatNotification");
        return C36441kJ.A0W(2, putExtra);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        if ((r2 + 86400000) >= r7) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A08(X.AnonymousClass11F r11, int r12, long r13) {
        /*
            r10 = this;
            r9 = 0
            r0 = 50
            if (r12 <= r0) goto L_0x003a
            X.0v0 r0 = r10.A0E
            android.content.SharedPreferences r1 = X.C36341k9.A0E(r0)
            java.lang.String r0 = "last_read_conversation_time"
            long r7 = X.C36341k9.A0B(r1, r0)
            X.12q r0 = r10.A0F
            X.3Qp r0 = X.C36351kA.A0Z(r0, r11)
            if (r0 != 0) goto L_0x003b
            r2 = 0
        L_0x001b:
            long r13 = r13 - r2
            r4 = 300000(0x493e0, double:1.482197E-318)
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            boolean r6 = X.C36431kI.A1P(r0)
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0034
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r2 + r0
            int r1 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            r0 = 1
            if (r1 < 0) goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            if (r6 != 0) goto L_0x0039
            if (r0 == 0) goto L_0x003a
        L_0x0039:
            r9 = 1
        L_0x003a:
            return r9
        L_0x003b:
            long r2 = r0.A0Y
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81343wr.A08(X.11F, int, long):boolean");
    }

    public boolean A09(AnonymousClass141 r10) {
        if (!(r10.A0H instanceof C28981Uw)) {
            AnonymousClass11F A0G2 = C36331k8.A0G(r10);
            if ((!this.A0F.A0O(A0G2) || !C36401kF.A1Z(this.A0H)) && !this.A0u.A04(r10, A0G2)) {
                C20810yC r5 = this.A0H;
                C20500xf r6 = this.A0l;
                C235618y r4 = this.A0g;
                AnonymousClass1E9 r8 = this.A0t;
                AnonymousClass185 r3 = this.A0f;
                UserJid A0b2 = C36401kF.A0b(A0G2);
                return !AnonymousClass3RK.A00(r3, r4, r5, r6, A0b2, r8) && !C63823Lo.A01(r3, r5, r6, A0b2);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C81343wr r5 = (C81343wr) obj;
            AnonymousClass3T1 r1 = this.A0N;
            AnonymousClass3T1 r0 = r5.A0N;
            return (r1 == r0 || !(r1 == null || r0 == null || !AnonymousClass3T1.A0B(r0, r1))) && this.A0W == r5.A0W && this.A0x == r5.A0x && this.A0Y == r5.A0Y && C1901797e.A00(this.A0o, r5.A0o) && this.A0Z == r5.A0Z && this.A0V == r5.A0V;
        }
    }

    private int A00() {
        if (this.A0X) {
            return 59;
        }
        if (this.A00) {
            return 57;
        }
        return 1;
    }

    private String A02(C47192dt r2, boolean z) {
        if (this.A0X) {
            return r2.A0D();
        }
        if (this.A0Y || z) {
            return r2.A0F();
        }
        return r2.A0E();
    }

    private void A03(Context context, C07700Yy r7, AnonymousClass141 r8) {
        C07250Wx r3;
        if (this.A0X) {
            AnonymousClass0UA r1 = new AnonymousClass0UA(R.drawable.ic_notif_mute, context.getString(R.string.f12nameremoved), C65743Th.A04(context, new Intent(AndroidWear.A0D, AnonymousClass1U4.A00(r8), context, AndroidWear.class), 134217728));
            r1.A00 = 2;
            r1.A03 = false;
            r3 = r1.A00();
        } else {
            Context context2 = this.A0J.A08.A00;
            Intent A052 = AnonymousClass190.A05(context2);
            A052.putExtra("show_mute", true);
            A052.putExtra("mute_jid", AnonymousClass143.A03(r8.A0H));
            AnonymousClass3M2.A00(context2, A052);
            r3 = new C07250Wx(R.drawable.ic_notif_mute, context2.getString(R.string.f12nameremoved), C65743Th.A03(context2, A052, 4));
        }
        r7.A0Q.add(r3);
    }

    private boolean A06() {
        if (!this.A0w || this.A00) {
            return false;
        }
        return true;
    }

    private boolean A07(AnonymousClass141 r4) {
        if (this.A0H.A0E(2374)) {
            UserJid A0l2 = C36351kA.A0l(r4);
            AnonymousClass3L0 r0 = r4.A0E;
            if ((r0 == null || !r0.A01()) && A0l2 != null && !this.A0s.A0A(A0l2) && !this.A0d.A0O(A0l2)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((AnonymousClass000.A0H(this.A0N) * 31) + (this.A0Y ? 1 : 0)) * 31) + (this.A0x ? 1 : 0)) * 31) + (this.A0W ? 1 : 0)) * 31) + C36411kG.A09(this.A0o)) * 31) + this.A0Z) * 31) + (this.A0V ? 1 : 0);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:274|275|276|277|278|279|(18:281|287|(2:436|(34:438|(1:440)|441|293|(2:295|(1:301)(1:431))(3:432|(1:434)|435)|302|(1:430)(1:305)|306|(9:309|(1:311)|313|(1:315)|317|318|(1:(1:428))(1:321)|322|(5:324|(2:326|(0))|418|(1:420)(1:(1:426))|(0)))|330|(7:333|(1:335)|337|(7:414|415|(1:417)|(1:351)(1:(2:399|400))|(5:354|(2:395|(1:397))(2:360|(1:362))|(1:366)|367|(2:369|(1:372)))|373|(3:375|(1:377)(1:393)|378)(1:394))|343|(0)|351)|379|(1:385)|386|(1:388)|389|(2:392|390)|656|443|(4:447|(6:450|(1:452)|453|(2:455|658)(1:659)|456|448)|657|457)|458|(1:468)(2:462|(1:464))|465|(1:467)|469|470|(1:475)(1:474)|(1:477)|478|488|(1:490)(1:584)|491|(1:494)|(4:496|(1:498)(1:583)|(1:500)|(14:502|(3:504|(1:506)(1:582)|507)|508|(2:510|(2:512|(2:517|(1:519))))|520|(8:522|(1:524)(2:574|(1:576)(1:577))|525|526|(2:528|(1:530))(2:534|(1:536)(2:537|(1:539)(2:540|(1:542)(2:543|(1:545)(2:546|(1:548)(1:(1:550)(2:551|(1:553)(2:554|(1:556)(2:557|(1:573)(2:561|(1:563)(2:564|(1:566)(2:567|(2:569|(1:571))(3:572|532|533)))))))))))))|531|532|533)|579|(6:581|526|(0)(0)|531|532|533)|525|526|(0)(0)|531|532|533)(1:664))(1:663))(1:442))(1:291)|292|293|(0)(0)|302|(0)|430|306|309|(0)|313|(0)|317|318|(0)|(0))) */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0269, code lost:
        if (r12 == 0) goto L_0x026b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x076f, code lost:
        if (r23 == false) goto L_0x0771;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0776, code lost:
        if (r8 == false) goto L_0x0778;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x07cb, code lost:
        if (r12 == false) goto L_0x07cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x07cd, code lost:
        A03(r6, r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0801, code lost:
        if (r23 != false) goto L_0x0803;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0842, code lost:
        if (r1 != false) goto L_0x08c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x09af, code lost:
        if (r7.equals("2") == false) goto L_0x0844;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x09bc, code lost:
        r7 = new long[]{0, 300, 200, 300, 200};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x09c1, code lost:
        if ((1 - r9) == 0) goto L_0x09cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x09c3, code lost:
        r7 = {0, 750, 250, 750, 250} // fill-array;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x09c6, code lost:
        r0.A0B.vibrate = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x09cc, code lost:
        r7 = {0, 300, 200, 300, 200} // fill-array;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x09e6, code lost:
        if (r13 == false) goto L_0x07cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x09ff, code lost:
        if (r7 == 1) goto L_0x0794;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0102, code lost:
        if (r2.A0F.A0Q(r4.A1J.A00) == false) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:578:0x0d57, code lost:
        if ((r6 instanceof com.whatsapp.jid.UserJid) == false) goto L_0x0d59;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:586:0x0d7b, code lost:
        if (r7.contains("android.permission.UPDATE_APP_OPS_STATS") != false) goto L_0x0bb3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003c, code lost:
        if (X.C36361kB.A0d(X.C64933Qa.A01(r4), r2.A0R).A0L == false) goto L_0x003e;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:277:0x066c */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0618 A[Catch:{ SecurityException -> 0x05f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x062d A[Catch:{ Exception -> 0x068e }] */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x06ac  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x06e1  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x06f9 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x076d  */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x0775  */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x0785 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x09fc  */
    /* JADX WARNING: Removed duplicated region for block: B:432:0x0a1f  */
    /* JADX WARNING: Removed duplicated region for block: B:436:0x0a5d  */
    /* JADX WARNING: Removed duplicated region for block: B:528:0x0cd7  */
    /* JADX WARNING: Removed duplicated region for block: B:534:0x0cef  */
    /* JADX WARNING: Removed duplicated region for block: B:662:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r65 = this;
            r2 = r65
            X.3T1 r4 = r2.A0N
            java.lang.String r33 = "null"
            if (r4 == 0) goto L_0x000b
            X.C66013Ui.A0F(r4)
        L_0x000b:
            java.lang.String r25 = " quiet="
            boolean r0 = r2.A0Y
            r19 = r0
            boolean r0 = r2.A0x
            r29 = r0
            boolean r0 = r2.A0W
            r17 = r0
            X.11F r7 = r2.A0o
            boolean r0 = r2.A0V
            r22 = r0
            X.12U r0 = r2.A0P
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x002d
            java.lang.String r0 = "messagenotification/notification suppressed: not in verified registration state"
        L_0x0029:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x002c:
            return
        L_0x002d:
            if (r4 == 0) goto L_0x003e
            X.1CR r1 = r2.A0R
            X.11F r0 = X.C64933Qa.A01(r4)
            X.3LI r0 = X.C36361kB.A0d(r0, r1)
            boolean r0 = r0.A0L
            r12 = 0
            if (r0 != 0) goto L_0x003f
        L_0x003e:
            r12 = 1
        L_0x003f:
            X.1CR r0 = r2.A0R
            r64 = r0
            X.3LI r11 = r64.A0R()
            X.3LI r3 = r64.A0Q()
            java.lang.String r0 = r3.A06()
            int r10 = java.lang.Integer.parseInt(r0)
            java.lang.String r0 = r11.A06()
            int r9 = java.lang.Integer.parseInt(r0)
            java.lang.String r0 = r3.A07()
            java.lang.String r1 = r11.A07()
            java.lang.String r8 = r3.A05()
            java.lang.String r6 = r11.A05()
            java.lang.String r5 = r3.A08()
            java.lang.String r3 = r11.A08()
            if (r10 != 0) goto L_0x00a4
            if (r9 != 0) goto L_0x00a4
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00a4
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x00a4
            java.lang.String r1 = "000000"
            boolean r0 = android.text.TextUtils.equals(r1, r8)
            if (r0 == 0) goto L_0x00a4
            boolean r0 = android.text.TextUtils.equals(r1, r6)
            if (r0 == 0) goto L_0x00a4
            java.lang.String r1 = "0"
            boolean r0 = android.text.TextUtils.equals(r1, r5)
            if (r0 == 0) goto L_0x00a4
            boolean r0 = android.text.TextUtils.equals(r1, r3)
            if (r0 == 0) goto L_0x00a4
            if (r12 == 0) goto L_0x00a4
            java.lang.String r0 = "messagenotification/notifications disabled"
            goto L_0x0029
        L_0x00a4:
            if (r4 != 0) goto L_0x00d5
            if (r22 != 0) goto L_0x00d5
            X.0v0 r0 = r2.A0E
            X.005 r6 = r0.A00
            android.content.SharedPreferences r0 = X.C36391kE.A0H(r6)
            java.lang.String r1 = "notification_hash"
            r5 = 0
            java.lang.String r0 = r0.getString(r1, r5)
            if (r0 == 0) goto L_0x00d5
            android.content.SharedPreferences r0 = X.C36391kE.A0H(r6)
            java.lang.String r3 = r0.getString(r1, r5)
            android.content.SharedPreferences r1 = X.C36391kE.A0H(r6)
            java.lang.String r0 = "last_notification_hash"
            java.lang.String r0 = r1.getString(r0, r5)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00d5
            java.lang.String r0 = "messagenotification/updateOnly skip"
            goto L_0x0029
        L_0x00d5:
            android.content.Context r6 = r2.A01
            X.03c r0 = new X.03c
            r0.<init>(r6)
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x00ef
            java.lang.String r0 = "messagenotification/notif disabled"
        L_0x00e4:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x00e7:
            if (r4 == 0) goto L_0x002c
        L_0x00e9:
            X.1Io r0 = r2.A0b
            r0.A01()
            return
        L_0x00ef:
            if (r4 == 0) goto L_0x0117
            X.1Si r0 = r2.A0I
            X.3LF r9 = r0.A06(r4)
            X.12q r1 = r2.A0F
            X.3Qa r0 = r4.A1J
            X.11F r0 = r0.A00
            boolean r0 = r1.A0Q(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0105
        L_0x0104:
            r1 = 0
        L_0x0105:
            r2.A00 = r1
            if (r4 == 0) goto L_0x0119
            X.0xp r0 = r2.A0J
            boolean r0 = r0.A0N(r9, r1)
            if (r0 != 0) goto L_0x0119
            java.lang.String r0 = "messagenotification/muted chat"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x00e9
        L_0x0117:
            r9 = 0
            goto L_0x0104
        L_0x0119:
            boolean r0 = r4 instanceof X.C180868mY
            r16 = r0
            if (r0 == 0) goto L_0x0135
            X.3Qa r0 = r4.A1J
            X.11F r1 = r0.A00
            r0 = r64
            X.3LI r0 = X.C36361kB.A0d(r1, r0)
            X.3LI r0 = r0.A02()
            boolean r0 = r0.A0H
            if (r0 == 0) goto L_0x0135
            java.lang.String r0 = "messagenotification/skip notification for muted reaction"
            goto L_0x0029
        L_0x0135:
            boolean r0 = r4 instanceof X.AnonymousClass5JA
            if (r0 == 0) goto L_0x013d
            java.lang.String r0 = "messagenotification/skip notification for scheduled call edit"
            goto L_0x0029
        L_0x013d:
            if (r4 == 0) goto L_0x018a
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            int r0 = r4.A0A
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1S(r0, r1)
            if (r0 == 0) goto L_0x017a
            X.0yC r0 = r2.A0H
            boolean r0 = X.C36401kF.A1Z(r0)
            if (r0 == 0) goto L_0x017a
            X.3Kx r1 = r4.A0P()
            if (r1 == 0) goto L_0x017a
            boolean r0 = r1 instanceof X.AnonymousClass2bB
            if (r0 == 0) goto L_0x017a
            java.lang.Long r0 = r1.A04()
            if (r0 == 0) goto L_0x017a
            X.1A1 r3 = r2.A0S
            long r0 = r0.longValue()
            X.3T1 r0 = X.C36421kH.A0R(r3, r0)
            if (r0 == 0) goto L_0x017a
            X.3Qa r0 = r0.A1J
            boolean r0 = r0.A02
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x017a
            java.lang.String r0 = "messagenotification/skip notification for comment message"
            goto L_0x0029
        L_0x017a:
            X.3JM r0 = r4.A0a()
            if (r0 == 0) goto L_0x018a
            X.2ow r1 = r0.A01
            X.2ow r0 = X.C52132ow.A02
            if (r1 != r0) goto L_0x018a
            java.lang.String r0 = "messagenotification/skip notification for message with parent association"
            goto L_0x0029
        L_0x018a:
            java.util.ArrayList r24 = X.AnonymousClass001.A0I()
            java.lang.StringBuilder r32 = X.AnonymousClass000.A0u()
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            if (r7 == 0) goto L_0x01ca
            X.1Si r12 = r2.A0I
            int r0 = r2.A0Z
            java.util.ArrayList r11 = X.AnonymousClass001.A0I()
            X.1Cv r14 = r12.A0A
            int r8 = r0 + 1
            r0 = 7
            int r13 = java.lang.Math.min(r8, r0)
            long r15 = android.os.SystemClock.uptimeMillis()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "last-message-store/getlastmessagesfornotificationafterreply/jid:"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " count:"
            X.C36321k7.A1T(r0, r1, r13)
            java.util.ArrayList r10 = X.AnonymousClass001.A0I()
            X.12P r0 = r14.A04
            X.1M0 r9 = r0.get()
            goto L_0x0d7f
        L_0x01ca:
            boolean r0 = r2.A0X
            r23 = r0
            if (r0 != 0) goto L_0x03f6
            boolean r0 = r2.A00
            X.1A6 r7 = r2.A0h
            if (r0 == 0) goto L_0x03f0
            java.util.ArrayList r1 = r7.A08()
        L_0x01da:
            X.0yC r5 = r2.A0H
            r0 = 3953(0xf71, float:5.54E-42)
            boolean r0 = r5.A0E(r0)
            if (r0 == 0) goto L_0x01eb
            java.util.ArrayList r0 = r7.A07()
            r1.addAll(r0)
        L_0x01eb:
            java.util.Iterator r31 = r1.iterator()
            r30 = 0
            r5 = 0
            r18 = 0
            r10 = 0
            r45 = 0
        L_0x01f7:
            boolean r0 = r31.hasNext()
            if (r0 == 0) goto L_0x0427
            X.11F r8 = X.C36401kF.A0a(r31)
            X.1Si r11 = r2.A0I
            boolean r7 = r2.A00
            java.util.Map r1 = r11.A0H
            java.lang.Object r0 = r1.get(r8)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x0220
            r0 = 0
            java.util.ArrayList r0 = r11.A07(r8, r0)
            r1.put(r8, r0)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0220
            X.C28361Si.A02(r0)
        L_0x0220:
            java.util.ArrayList r28 = X.AnonymousClass001.A0I()
            java.util.Iterator r12 = r0.iterator()
        L_0x0228:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0242
            java.lang.Object r1 = r12.next()
            X.3LF r1 = (X.AnonymousClass3LF) r1
            X.0xp r0 = r11.A0C
            boolean r0 = r0.A0N(r1, r7)
            if (r0 == 0) goto L_0x0228
            r0 = r28
            r0.add(r1)
            goto L_0x0228
        L_0x0242:
            X.12q r7 = r2.A0F
            int r27 = r7.A02(r8)
            X.3Qp r0 = X.C36351kA.A0Z(r7, r8)
            if (r0 != 0) goto L_0x0392
            r1 = 0
        L_0x024f:
            X.3Qp r0 = X.C36351kA.A0Z(r7, r8)
            if (r0 != 0) goto L_0x038c
            r26 = 0
        L_0x0257:
            r0 = 0
            X.3Qp r7 = r7.A09(r8, r0)
            if (r7 == 0) goto L_0x026b
            long r20 = r7.A01()
            long r13 = r7.A02()
            int r12 = (r20 > r13 ? 1 : (r20 == r13 ? 0 : -1))
            r7 = 1
            if (r12 != 0) goto L_0x026c
        L_0x026b:
            r7 = 0
        L_0x026c:
            if (r27 > 0) goto L_0x0276
            if (r7 != 0) goto L_0x0276
            if (r1 > 0) goto L_0x0276
            boolean r1 = r4 instanceof X.C46752bc
            if (r1 == 0) goto L_0x01f7
        L_0x0276:
            int r1 = r28.size()
            if (r1 <= 0) goto L_0x01f7
            r1 = r28
            java.lang.Object r7 = r1.get(r0)
            X.3LF r7 = (X.AnonymousClass3LF) r7
            if (r7 == 0) goto L_0x03db
            X.1TE r1 = r2.A0K
            X.3T1 r0 = r7.A00
            boolean r0 = r1.A01(r0)
            if (r0 != 0) goto L_0x01f7
            X.3T1 r0 = r7.A00
            long r0 = r0.A0G
            r13 = 0
            int r12 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r12 == 0) goto L_0x02c2
            r20 = 604800000(0x240c8400, double:2.988109026E-315)
            long r20 = r20 + r0
            X.0wo r12 = r11.A07
            long r13 = X.C19970wo.A00(r12)
            int r12 = (r20 > r13 ? 1 : (r20 == r13 ? 0 : -1))
            if (r12 >= 0) goto L_0x02c2
            X.0v0 r11 = r11.A09
            android.content.SharedPreferences r12 = X.C36341k9.A0E(r11)
            java.lang.String r11 = "last_read_conversation_time"
            long r12 = X.C36341k9.A0B(r12, r11)
            int r11 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r11 <= 0) goto L_0x02c2
        L_0x02b9:
            X.1Fq r1 = r2.A0C
            java.lang.String r0 = "UpdateMessageNotificationRunnable4"
            r1.A06(r8, r0)
            goto L_0x01f7
        L_0x02c2:
            X.39J r11 = r2.A0p
            X.3T1 r0 = r7.A00
            r35 = r0
            java.util.concurrent.atomic.AtomicBoolean r12 = r11.A04
            r1 = 1
            r0 = 0
            boolean r0 = r12.compareAndSet(r0, r1)
            if (r0 == 0) goto L_0x036c
            X.34V r13 = r11.A01
            java.lang.String[] r12 = X.C36441kJ.A1R()
            X.0wo r0 = r13.A00
            r34 = r0
            long r0 = X.C19970wo.A00(r34)
            r14 = 604800000(0x240c8400, double:2.988109026E-315)
            long r0 = r0 - r14
            r14 = 0
            X.C36401kF.A1T(r12, r14, r0)
            X.16r r0 = r13.A01
            r20 = r0
            X.1M0 r14 = r20.A04()
            X.14e r15 = r14.A02     // Catch:{ all -> 0x0dfb }
            java.lang.String r13 = "dismissed_chat"
            java.lang.String r1 = "timestamp < ?"
            java.lang.String r0 = "CLEAR_OLD_CHATS"
            r15.A03(r13, r1, r0, r12)     // Catch:{ all -> 0x0dfb }
            r14.close()
            java.util.ArrayList r21 = X.AnonymousClass001.A0I()
            java.lang.String[] r12 = X.C36441kJ.A1R()
            long r0 = X.C19970wo.A00(r34)
            r13 = 604800000(0x240c8400, double:2.988109026E-315)
            long r0 = r0 - r13
            r13 = 0
            X.C36401kF.A1T(r12, r13, r0)
            X.1M0 r14 = r20.get()
            X.14e r13 = r14.A02     // Catch:{ all -> 0x0dfb }
            java.lang.String r1 = "SELECT chat_jid, timestamp FROM dismissed_chat WHERE timestamp > ?"
            java.lang.String r0 = "GET_DISMISSED_CHATS"
            android.database.Cursor r13 = r13.A09(r1, r0, r12)     // Catch:{ all -> 0x0dfb }
            java.lang.String r0 = "chat_jid"
            int r20 = r13.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0def }
            java.lang.String r0 = "timestamp"
            int r15 = r13.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0def }
        L_0x032c:
            boolean r0 = r13.moveToNext()     // Catch:{ all -> 0x0def }
            if (r0 == 0) goto L_0x034c
            r0 = r20
            java.lang.String r0 = r13.getString(r0)     // Catch:{ all -> 0x0def }
            X.11F r12 = X.C36421kH.A0N(r0)     // Catch:{ all -> 0x0def }
            long r0 = r13.getLong(r15)     // Catch:{ all -> 0x0def }
            if (r12 == 0) goto L_0x032c
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0def }
            r0 = r21
            X.C36341k9.A1H(r12, r1, r0)     // Catch:{ all -> 0x0def }
            goto L_0x032c
        L_0x034c:
            r13.close()     // Catch:{ all -> 0x0dfb }
            r14.close()
            java.util.Iterator r13 = r21.iterator()
        L_0x0356:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x036c
            java.lang.Object r0 = r13.next()
            X.00I r0 = (X.AnonymousClass00I) r0
            java.util.Map r12 = r11.A03
            java.lang.Object r1 = r0.A00
            java.lang.Object r0 = r0.A01
            r12.put(r1, r0)
            goto L_0x0356
        L_0x036c:
            r0 = r35
            X.3Qa r0 = r0.A1J
            X.11F r0 = r0.A00
            java.util.Map r1 = r11.A03
            boolean r11 = r1.containsKey(r0)
            if (r11 == 0) goto L_0x0396
            java.lang.Object r0 = r1.get(r0)
            long r12 = X.C36431kI.A09(r0)
            r0 = r35
            long r0 = r0.A0I
            int r11 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r11 < 0) goto L_0x0396
            goto L_0x02b9
        L_0x038c:
            int r0 = r0.A07
            r26 = r0
            goto L_0x0257
        L_0x0392:
            int r1 = r0.A05
            goto L_0x024f
        L_0x0396:
            int r18 = r18 + r27
            int r45 = r45 + r26
            int r10 = r10 + 1
            java.util.Collections.reverse(r28)
            r1 = r24
            r0 = r28
            r1.add(r0)
            if (r30 == 0) goto L_0x03b6
            r0 = r30
            X.3T1 r0 = r0.A00
            long r11 = r0.A0I
            X.3T1 r0 = r7.A00
            long r0 = r0.A0I
            int r13 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r13 >= 0) goto L_0x03be
        L_0x03b6:
            X.16D r0 = r2.A07
            X.141 r5 = r0.A0D(r8)
            r30 = r7
        L_0x03be:
            X.3T1 r0 = r7.A00
            X.3Qa r1 = r0.A1J
            java.lang.String r7 = r1.A01
            r0 = r32
            r0.append(r7)
            boolean r7 = r1.A02
            r0.append(r7)
            X.11F r0 = r1.A00
            java.lang.String r1 = X.AnonymousClass143.A03(r0)
            r0 = r32
            r0.append(r1)
            goto L_0x01f7
        L_0x03db:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "messagenotification/curmsg/null "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r7 = " "
            r0 = r27
            X.C36321k7.A1U(r7, r1, r0)
            goto L_0x01f7
        L_0x03f0:
            java.util.ArrayList r1 = r7.A04()
            goto L_0x01da
        L_0x03f6:
            X.1A6 r0 = r2.A0h
            X.12q r0 = r0.A02
            X.C220412q.A00(r0)
            java.util.ArrayList r1 = X.AnonymousClass001.A0I()
            java.util.Collection r0 = r0.A0F()
            java.util.Iterator r7 = r0.iterator()
        L_0x0409:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x01eb
            java.lang.Object r5 = r7.next()
            X.3Qp r5 = (X.C65073Qp) r5
            boolean r0 = r5 instanceof X.C44072La
            if (r0 == 0) goto L_0x0409
            X.2La r5 = (X.C44072La) r5
            boolean r0 = r5.A0O
            if (r0 != 0) goto L_0x0409
            X.11F r0 = r5.A06()
            r1.add(r0)
            goto L_0x0409
        L_0x0427:
            if (r4 == 0) goto L_0x0477
            if (r16 != 0) goto L_0x0477
            X.16D r1 = r2.A07
            X.11F r0 = X.C64933Qa.A01(r4)
            X.141 r5 = r1.A0D(r0)
        L_0x0435:
            java.lang.String r0 = r32.toString()
            java.lang.String r21 = X.C18750th.A04(r0)
            X.C18740tg.A06(r21)
            boolean r1 = r2.A00
            X.0v0 r0 = r2.A0E
            r63 = r0
            android.content.SharedPreferences r0 = X.C36341k9.A0E(r63)
            if (r1 == 0) goto L_0x0474
            java.lang.String r1 = "locked_chat_notification_hash"
        L_0x044e:
            java.lang.String r7 = X.C36371kC.A0t(r0, r1)
            X.0xp r0 = r2.A0J
            r53 = r0
            boolean r1 = r2.A00
            boolean r0 = r0.A0N(r9, r1)
            r1 = r0 ^ 1
            r0 = r21
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x047a
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "messagenotification/same "
            r0 = r21
            java.lang.String r0 = X.AnonymousClass000.A0p(r1, r0, r2)
            goto L_0x0029
        L_0x0474:
            java.lang.String r1 = "notification_hash"
            goto L_0x044e
        L_0x0477:
            r9 = r30
            goto L_0x0435
        L_0x047a:
            if (r10 == 0) goto L_0x0491
            if (r5 == 0) goto L_0x0491
            if (r1 == 0) goto L_0x049e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "messagenotification/muted "
            r1.append(r0)
            X.11F r0 = r5.A0H
            java.lang.String r0 = X.AnonymousClass000.A0o(r0, r1)
            goto L_0x00e4
        L_0x0491:
            X.1Fq r3 = r2.A0C
            int r1 = r2.A00()
            java.lang.String r0 = "UpdateMessageNotificationRunnable1"
            r3.A03(r1, r0)
            goto L_0x00e7
        L_0x049e:
            java.lang.String r0 = " hash="
            r3.append(r0)
            r0 = r21
            r3.append(r0)
            java.lang.String r0 = " msg="
            r3.append(r0)
            r0 = r18
            r3.append(r0)
            java.lang.String r0 = " contacts="
            r3.append(r0)
            r3.append(r10)
            java.lang.String r0 = " isWearRefresh="
            r3.append(r0)
            r0 = r17
            r3.append(r0)
            r0 = r25
            r3.append(r0)
            r0 = r19
            r3.append(r0)
            java.lang.String r0 = " newMessage="
            r3.append(r0)
            if (r4 == 0) goto L_0x04d7
            java.lang.String r33 = "nonNull"
        L_0x04d7:
            r0 = r33
            r3.append(r0)
            java.lang.Class<X.11F> r32 = X.AnonymousClass11F.class
            r0 = r32
            com.whatsapp.jid.Jid r11 = X.C36381kD.A0e(r5, r0)
            X.11F r11 = (X.AnonymousClass11F) r11
            r0 = r53
            boolean r28 = r0.A0K(r11)
            boolean r27 = X.AnonymousClass143.A0G(r11)
            X.3T1 r8 = r9.A00
            r26 = 1
            r20 = 0
            if (r28 != 0) goto L_0x0560
            if (r27 == 0) goto L_0x0560
            X.12q r0 = r2.A0F
            long r14 = r0.A07(r11)
            r12 = 0
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x0560
            X.1Cw r0 = r2.A0O
            boolean r0 = r0.A00(r8)
            if (r0 != 0) goto L_0x0560
            X.17X r1 = r2.A0G
            r0 = r11
            X.144 r0 = (X.AnonymousClass144) r0
            X.0y7 r13 = X.C36381kD.A0R(r1, r0)
            int r1 = r13.size()
            r0 = 10
            if (r1 <= r0) goto L_0x0560
            X.14x r12 = r13.iterator()
            r7 = 0
        L_0x0524:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0549
            java.lang.Object r0 = r12.next()
            X.6PM r0 = (X.AnonymousClass6PM) r0
            X.16D r1 = r2.A07
            com.whatsapp.jid.UserJid r0 = r0.A03
            X.141 r0 = r1.A08(r0)
            if (r0 == 0) goto L_0x0524
            X.3IL r0 = r0.A0F
            if (r0 == 0) goto L_0x0524
            java.lang.String r0 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0524
            int r7 = r7 + 1
            goto L_0x0524
        L_0x0549:
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = (float) r7
            float r1 = r1 * r0
            int r0 = r13.size()
            float r0 = (float) r0
            float r1 = r1 / r0
            r0 = 1103626240(0x41c80000, float:25.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0560
            java.lang.String r0 = " initial-mute-large-group"
            r3.append(r0)
            r28 = 1
        L_0x0560:
            r7 = 0
            java.util.List r1 = r8.A0w
            X.0wQ r0 = r2.A03
            boolean r1 = X.C65713Te.A05(r0, r1)
            X.3T1 r0 = r8.A0S()
            if (r0 == 0) goto L_0x0623
            X.11F r0 = r0.A0J()
            if (r0 != 0) goto L_0x0623
        L_0x0575:
            if (r28 == 0) goto L_0x061f
            if (r27 == 0) goto L_0x061f
            if (r1 != 0) goto L_0x057d
            if (r26 == 0) goto L_0x061f
        L_0x057d:
            X.11F r1 = r8.A0J()
            if (r1 == 0) goto L_0x061f
            r0 = r64
            boolean r0 = r0.A0j(r1)
            if (r0 != 0) goto L_0x061f
            r0 = r64
            X.3LI r7 = X.C36361kB.A0d(r1, r0)
        L_0x0591:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r20)
            X.00I r1 = X.C36441kJ.A0W(r7, r0)
            java.lang.Object r0 = r1.A00
            r28 = r0
            r0 = r28
            X.3LI r0 = (X.AnonymousClass3LI) r0
            r28 = r0
            java.lang.Object r0 = r1.A01
            X.C18740tg.A06(r0)
            boolean r46 = X.AnonymousClass000.A1X(r0)
            X.32Y r0 = r2.A0q
            r62 = r0
            X.32X r0 = r0.A00
            if (r0 == 0) goto L_0x061c
            com.whatsapp.notification.PopupNotification r1 = r0.A00
            boolean r0 = r1.A1L
            if (r0 == 0) goto L_0x061c
            X.11F r0 = r1.A0v
            r20 = r0
        L_0x05be:
            r0 = r20
            boolean r8 = r11.equals(r0)
            r0 = r32
            com.whatsapp.jid.Jid r1 = X.C36381kD.A0e(r5, r0)
            r0 = r64
            X.3LI r39 = X.C36361kB.A0d(r1, r0)
            java.lang.String r0 = r39.A06()
            int r60 = java.lang.Integer.parseInt(r0)
            X.0yb r0 = r2.A0B
            r61 = r0
            android.telephony.TelephonyManager r7 = r61.A0K()
            if (r4 == 0) goto L_0x0619
            if (r7 == 0) goto L_0x0619
            boolean r0 = X.C19550w8.A08()
            if (r0 == 0) goto L_0x0612
            X.0yE r1 = r2.A0D
            java.lang.String r0 = "android.permission.READ_PHONE_STATE"
            int r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x0612
        L_0x05f4:
            X.1MK r0 = r2.A05
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x0619
            if (r29 != 0) goto L_0x0619
            boolean r0 = r39.A0A()
            if (r0 == 0) goto L_0x0606
            if (r46 != 0) goto L_0x0619
        L_0x0606:
            if (r60 != 0) goto L_0x060a
            if (r8 == 0) goto L_0x0619
        L_0x060a:
            r47 = 1
        L_0x060c:
            X.C18740tg.A00()
            r31 = 1
            goto L_0x0627
        L_0x0612:
            int r0 = r7.getCallState()     // Catch:{ SecurityException -> 0x05f4 }
            if (r0 != 0) goto L_0x0619
            goto L_0x05f4
        L_0x0619:
            r47 = 0
            goto L_0x060c
        L_0x061c:
            r20 = 0
            goto L_0x05be
        L_0x061f:
            r20 = r28
            goto L_0x0591
        L_0x0623:
            r26 = 0
            goto L_0x0575
        L_0x0627:
            int r0 = X.C34201gc.A00(r6)     // Catch:{ Exception -> 0x068e }
            if (r0 != 0) goto L_0x0695
            X.0XK r0 = com.whatsapp.notification.AndroidWear.A0B     // Catch:{ Exception -> 0x068e }
            if (r0 != 0) goto L_0x0644
            X.0UY r1 = new X.0UY     // Catch:{ Exception -> 0x068e }
            r1.<init>(r6)     // Catch:{ Exception -> 0x068e }
            X.0Sq r0 = X.AnonymousClass9B3.A00     // Catch:{ Exception -> 0x068e }
            r1.A01(r0)     // Catch:{ Exception -> 0x068e }
            X.0JO r0 = r1.A00()     // Catch:{ Exception -> 0x068e }
            com.whatsapp.notification.AndroidWear.A0B = r0     // Catch:{ Exception -> 0x068e }
            r0.A08()     // Catch:{ Exception -> 0x068e }
        L_0x0644:
            X.0XK r0 = com.whatsapp.notification.AndroidWear.A0B     // Catch:{ Exception -> 0x068e }
            if (r0 == 0) goto L_0x0695
            boolean r0 = r0.A0A()     // Catch:{ Exception -> 0x068e }
            if (r0 == 0) goto L_0x0695
            X.0XK r0 = com.whatsapp.notification.AndroidWear.A0B     // Catch:{ Exception -> 0x068e }
            X.8Es r7 = new X.8Es     // Catch:{ Exception -> 0x068e }
            r7.<init>(r0)     // Catch:{ Exception -> 0x068e }
            r0.A05(r7)     // Catch:{ Exception -> 0x068e }
            java.lang.String r0 = "await must not be called on the UI thread"
            X.AnonymousClass006.A04(r0)     // Catch:{ Exception -> 0x068e }
            boolean r0 = r7.A0B     // Catch:{ Exception -> 0x068e }
            r1 = r0 ^ 1
            java.lang.String r0 = "Result has already been consumed"
            X.AnonymousClass006.A08(r1, r0)     // Catch:{ Exception -> 0x068e }
            java.util.concurrent.CountDownLatch r0 = r7.A07     // Catch:{ InterruptedException -> 0x066c }
            r0.await()     // Catch:{ InterruptedException -> 0x066c }
            goto L_0x0671
        L_0x066c:
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.A08     // Catch:{ Exception -> 0x068e }
            r7.A07(r0)     // Catch:{ Exception -> 0x068e }
        L_0x0671:
            boolean r1 = r7.A08()     // Catch:{ Exception -> 0x068e }
            java.lang.String r0 = "Result is not ready."
            X.AnonymousClass006.A08(r1, r0)     // Catch:{ Exception -> 0x068e }
            X.0q5 r0 = com.google.android.gms.common.api.internal.BasePendingResult.A00(r7)     // Catch:{ Exception -> 0x068e }
            X.4V5 r0 = (X.AnonymousClass4V5) r0     // Catch:{ Exception -> 0x068e }
            X.3bl r0 = (X.C68353bl) r0     // Catch:{ Exception -> 0x068e }
            java.util.List r0 = r0.A00     // Catch:{ Exception -> 0x068e }
            r0.size()     // Catch:{ Exception -> 0x068e }
            int r0 = r0.size()     // Catch:{ Exception -> 0x068e }
            if (r0 <= 0) goto L_0x0695
            goto L_0x0697
        L_0x068e:
            r1 = move-exception
            java.lang.String r0 = "androidwear/pairedcheck/failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0e05 }
            goto L_0x0697
        L_0x0695:
            r31 = 0
        L_0x0697:
            java.lang.String r0 = " isAndroidWearPaired="
            r3.append(r0)
            r0 = r31
            r3.append(r0)
            boolean r0 = r2.A06()
            r1 = 134217728(0x8000000, float:3.85186E-34)
            if (r0 == 0) goto L_0x0a5d
            r0 = 1
            if (r10 != r0) goto L_0x0a5d
            r0 = 0
            X.00I r0 = A01(r6, r5, r0)
            java.lang.Object r7 = r0.A00
            X.C18740tg.A06(r7)
            int r7 = X.AnonymousClass000.A0I(r7)
            java.lang.Object r0 = r0.A01
            android.content.Intent r0 = (android.content.Intent) r0
        L_0x06be:
            android.app.PendingIntent r34 = X.C65743Th.A00(r6, r7, r0, r1)
        L_0x06c2:
            java.lang.Class<com.whatsapp.notification.MessageNotificationDismissedReceiver> r0 = com.whatsapp.notification.MessageNotificationDismissedReceiver.class
            android.content.Intent r7 = X.C36441kJ.A0H(r6, r0)
            java.lang.String r8 = "notification_hash"
            r0 = r21
            r7.putExtra(r8, r0)
            int r0 = r2.A00()
            android.app.PendingIntent r35 = X.C65743Th.A01(r6, r0, r7, r1)
            boolean r1 = r2.A06()
            int r27 = r18 + r45
            r12 = 0
            r13 = 1
            if (r10 != r13) goto L_0x0a1f
            r0 = r18
            if (r0 == r13) goto L_0x06ed
            if (r45 == 0) goto L_0x0a12
            X.3T1 r0 = r9.A00
            boolean r0 = r0 instanceof X.C180868mY
            if (r0 == 0) goto L_0x0a12
        L_0x06ed:
            if (r1 == 0) goto L_0x0a12
            java.lang.CharSequence r41 = r9.A05(r5, r12)
        L_0x06f3:
            boolean r0 = r2.A06()
            if (r0 == 0) goto L_0x0a03
            if (r10 != r13) goto L_0x0a03
            X.171 r0 = r2.A08
            java.lang.String r0 = r0.A0H(r5)
            java.lang.String r42 = X.AnonymousClass3TB.A02(r0)
        L_0x0705:
            X.1MK r0 = r2.A05
            r50 = r0
            X.0ts r1 = r2.A0k
            X.1gP r0 = r2.A0U
            r55 = r0
            X.1V6 r15 = r2.A09
            X.1Pf r0 = r2.A0e
            boolean r56 = r2.A06()
            X.3PB r30 = new X.3PB
            r48 = r30
            r49 = r0
            r51 = r15
            r52 = r1
            r54 = r4
            r57 = r17
            r58 = r19
            r59 = r23
            r48.<init>(r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59)
            r33 = r30
            r36 = r6
            r37 = r5
            r38 = r9
            r40 = r28
            r43 = r3
            r44 = r18
            X.0Yy r0 = r33.A01(r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)
            boolean r23 = r2.A09(r5)
            r1 = r32
            X.11F r14 = X.C36441kJ.A0k(r5, r1)
            X.12q r1 = r2.A0F
            int r12 = r1.A02(r11)
            X.C18740tg.A06(r9)
            X.3T1 r1 = r9.A00
            long r7 = r1.A0G
            boolean r8 = r2.A08(r14, r12, r7)
            int r7 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r7 >= r1) goto L_0x07d0
            if (r17 != 0) goto L_0x07d0
            java.lang.String r1 = r39.A06()
            int r7 = java.lang.Integer.parseInt(r1)
            r12 = 0
            r1 = 1
            if (r10 != r13) goto L_0x0771
            r40 = 1
            if (r23 != 0) goto L_0x0773
        L_0x0771:
            r40 = 0
        L_0x0773:
            if (r7 != 0) goto L_0x0778
            r14 = 1
            if (r8 != 0) goto L_0x0779
        L_0x0778:
            r14 = 0
        L_0x0779:
            X.1TF r8 = r2.A0M
            X.3T1 r7 = r9.A00
            boolean r13 = r8.A06(r7)
            r7 = r18
            if (r7 != r1) goto L_0x09fa
            if (r13 == 0) goto L_0x09fa
            X.1TE r12 = r2.A0K
            X.3T1 r8 = r9.A00
            X.141 r7 = r9.A03()
            r12.A00(r6, r0, r7, r8)
            r40 = 0
        L_0x0794:
            X.0xp r7 = r9.A07
            r37 = 1
            r38 = 1
            r33 = r7
            r34 = r0
            r35 = r5
            r36 = r9
            r39 = r31
            r33.A0J(r34, r35, r36, r37, r38, r39, r40)
            boolean r7 = r2.A06()
            r9.A07(r0, r5, r3, r7)
            boolean r12 = r9.A08(r6, r0, r5)
        L_0x07b2:
            if (r10 != r1) goto L_0x07d0
            r1 = r53
            android.graphics.Bitmap r1 = r1.A0C(r5)
            r0.A0A(r1)
            X.0yC r7 = r2.A0H
            r1 = 3156(0xc54, float:4.422E-42)
            boolean r1 = r7.A0E(r1)
            r8 = 1
            if (r1 != 0) goto L_0x09d9
            r8 = 0
            if (r14 == 0) goto L_0x09d9
            if (r12 != 0) goto L_0x09d9
        L_0x07cd:
            r2.A03(r6, r0, r5)
        L_0x07d0:
            long r7 = java.lang.System.currentTimeMillis()
            X.1Si r1 = r2.A0I
            long r12 = r1.A00
            long r28 = r7 - r12
            r1.A00 = r7
            r7 = 200(0xc8, double:9.9E-322)
            int r1 = (r28 > r7 ? 1 : (r28 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x08f7
            if (r19 != 0) goto L_0x08f7
            android.telephony.TelephonyManager r13 = r61.A0K()
            r1 = r32
            com.whatsapp.jid.Jid r7 = X.C36381kD.A0e(r5, r1)
            r1 = r64
            X.3LI r26 = X.C36361kB.A0d(r7, r1)
            boolean r12 = r50.A00()
            boolean r23 = r50.A03()
            r9 = 1
            r14 = 0
            if (r12 == 0) goto L_0x0803
            r8 = 1
            if (r23 == 0) goto L_0x0804
        L_0x0803:
            r8 = 0
        L_0x0804:
            if (r13 == 0) goto L_0x0816
            boolean r1 = X.C19550w8.A08()
            if (r1 == 0) goto L_0x09d0
            X.0yE r7 = r2.A0D
            java.lang.String r1 = "android.permission.READ_PHONE_STATE"
            int r1 = r7.A02(r1)
            if (r1 == 0) goto L_0x09d0
        L_0x0816:
            r1 = 0
        L_0x0817:
            if (r12 != 0) goto L_0x0823
            if (r1 != 0) goto L_0x0823
            X.6zU r7 = r15.A00
            if (r7 == 0) goto L_0x0984
            boolean r7 = r7.A0N
            if (r7 == 0) goto L_0x0984
        L_0x0823:
            java.lang.String r7 = " vibrate=force off ("
            r3.append(r7)
            r3.append(r8)
            r7 = 32
            r3.append(r7)
            r3.append(r1)
            r7 = 41
            r3.append(r7)
            long[] r9 = new long[r9]
            r12 = 0
            r9[r14] = r12
            android.app.Notification r7 = r0.A0B
            r7.vibrate = r9
            if (r1 != 0) goto L_0x08c1
        L_0x0844:
            if (r23 != 0) goto L_0x08c1
            r9 = 0
            X.1G5 r1 = r2.A0A
            X.1G6 r7 = r1.A00()
            X.1G4 r1 = r2.A0Q
            boolean r1 = r1.A01()
            if (r1 != 0) goto L_0x0971
            X.0zA r1 = r2.A02
            boolean r1 = r1.A00
            if (r1 == 0) goto L_0x0971
            r1 = r32
            X.11F r1 = X.C36441kJ.A0k(r5, r1)
            boolean r1 = r7.A01(r1)
            if (r1 == 0) goto L_0x0971
            boolean r1 = r63.A2A()
            if (r1 == 0) goto L_0x0882
            java.lang.String r1 = " tone=conversation"
            r3.append(r1)
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0u()
            java.lang.String r1 = X.C19430v1.A04
            r7.append(r1)
            r1 = 2132017168(0x7f140010, float:1.9672607E38)
            java.lang.String r9 = X.C36381kD.A10(r7, r1)
        L_0x0882:
            if (r8 == 0) goto L_0x089a
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            if (r1 != 0) goto L_0x089a
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0u()
            java.lang.String r1 = X.C19430v1.A04
            r7.append(r1)
            r1 = 2132017170(0x7f140012, float:1.967261E38)
            java.lang.String r9 = X.C36381kD.A10(r7, r1)
        L_0x089a:
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            if (r1 != 0) goto L_0x08c1
            android.net.Uri r7 = android.net.Uri.parse(r9)
            java.lang.String r1 = " sound="
            r3.append(r1)
            r3.append(r7)
            if (r7 == 0) goto L_0x08c1
            if (r46 != 0) goto L_0x08c1
            X.1Q0 r1 = r2.A0T
            r32 = r6
            r33 = r7
            r34 = r0
            r35 = r61
            r36 = r1
            r37 = r55
            X.C20600xp.A07(r32, r33, r34, r35, r36, r37)
        L_0x08c1:
            X.1G4 r7 = r2.A0Q
            boolean r1 = r7.A01()
            if (r1 == 0) goto L_0x0964
            java.lang.String r1 = r26.A05()
            java.lang.Integer r1 = X.C20600xp.A03(r1)
            if (r1 == 0) goto L_0x0961
            int r9 = r1.intValue()
            r7 = 1000(0x3e8, float:1.401E-42)
            r1 = 4000(0xfa0, float:5.605E-42)
            android.app.Notification r8 = r0.A0B
            r8.ledARGB = r9
            r8.ledOnMS = r7
            r8.ledOffMS = r1
            r7 = 1
            int r1 = r8.flags
            r1 = r1 & -2
            r7 = r7 | r1
            r8.flags = r7
            java.lang.String r1 = " color="
            r3.append(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r9)
        L_0x08f4:
            r3.append(r1)
        L_0x08f7:
            X.3xO r7 = X.C81673xO.A00
            r1 = r24
            java.util.Collections.sort(r1, r7)
            int r7 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r7 < r1) goto L_0x091a
            r1 = 27
            if (r7 > r1) goto L_0x091a
            int r7 = r24.size()
            r1 = 2
            if (r7 != r1) goto L_0x091a
            X.1Fq r8 = r2.A0C
            int r7 = r2.A00()
            java.lang.String r1 = "UpdateMessageNotificationRunnable3"
            r8.A03(r7, r1)
        L_0x091a:
            boolean r1 = r2.A06()
            if (r1 == 0) goto L_0x0935
            r37 = 0
            r32 = r2
            r33 = r3
            r34 = r24
            r35 = r18
            r36 = r10
            r38 = r31
            r39 = r47
            r40 = r22
            r32.A05(r33, r34, r35, r36, r37, r38, r39, r40)
        L_0x0935:
            androidx.core.app.NotificationCompat$InboxStyle r12 = new androidx.core.app.NotificationCompat$InboxStyle
            r12.<init>()
            java.lang.CharSequence r1 = X.C07700Yy.A04(r41)
            r12.A01 = r1
            r1 = 1
            r12.A02 = r1
            r1 = r30
            java.lang.String r1 = r1.A00
            r22 = r1
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()
            java.util.Iterator r7 = r24.iterator()
        L_0x0951:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0a8d
            java.lang.Object r1 = r7.next()
            java.util.Collection r1 = (java.util.Collection) r1
            r8.addAll(r1)
            goto L_0x0951
        L_0x0961:
            java.lang.String r1 = " color=null"
            goto L_0x08f4
        L_0x0964:
            java.lang.String r1 = " screen_lock="
            r3.append(r1)
            boolean r1 = r7.A01()
            r3.append(r1)
            goto L_0x08f7
        L_0x0971:
            java.lang.String r1 = " tone=notification"
            r3.append(r1)
            java.lang.String r9 = r26.A07()
            if (r9 != 0) goto L_0x0882
            android.net.Uri r1 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI
            java.lang.String r9 = r1.toString()
            goto L_0x0882
        L_0x0984:
            if (r46 != 0) goto L_0x0844
            java.lang.String r7 = r26.A08()
            java.lang.String r1 = " vibrate="
            r3.append(r1)
            r3.append(r7)
            int r12 = r7.hashCode()
            r1 = 2
            switch(r12) {
                case 49: goto L_0x099c;
                case 50: goto L_0x09a9;
                case 51: goto L_0x09b3;
                default: goto L_0x099a;
            }
        L_0x099a:
            goto L_0x0844
        L_0x099c:
            java.lang.String r9 = "1"
            boolean r7 = r7.equals(r9)
            if (r7 == 0) goto L_0x0844
            r0.A06(r1)
            goto L_0x0844
        L_0x09a9:
            java.lang.String r1 = "2"
            boolean r1 = r7.equals(r1)
            if (r1 != 0) goto L_0x09bc
            goto L_0x0844
        L_0x09b3:
            java.lang.String r1 = "3"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x0844
            r9 = 2
        L_0x09bc:
            r1 = 5
            long[] r7 = new long[r1]
            int r9 = 1 - r9
            if (r9 == 0) goto L_0x09cc
            r7 = {0, 750, 250, 750, 250} // fill-array
        L_0x09c6:
            android.app.Notification r1 = r0.A0B
            r1.vibrate = r7
            goto L_0x0844
        L_0x09cc:
            r7 = {0, 300, 200, 300, 200} // fill-array
            goto L_0x09c6
        L_0x09d0:
            int r7 = r13.getCallState()     // Catch:{ SecurityException -> 0x0816 }
            r1 = 1
            if (r7 != 0) goto L_0x0817
            goto L_0x0816
        L_0x09d9:
            boolean r1 = r2.A07(r5)
            if (r1 == 0) goto L_0x09ea
            r1 = 21
            X.C20600xp.A08(r6, r0, r5, r1)
        L_0x09e4:
            if (r8 == 0) goto L_0x07d0
            if (r13 != 0) goto L_0x07d0
            goto L_0x07cd
        L_0x09ea:
            if (r47 != 0) goto L_0x09e4
            if (r12 != 0) goto L_0x09e4
            if (r13 != 0) goto L_0x09e4
            X.0Wx r7 = com.whatsapp.notification.AndroidWear.A00(r6, r5)
            java.util.ArrayList r1 = r0.A0Q
            r1.add(r7)
            goto L_0x09e4
        L_0x09fa:
            if (r40 == 0) goto L_0x09ff
            r2.A04(r0, r5, r7, r1)
        L_0x09ff:
            if (r7 != r1) goto L_0x07b2
            goto L_0x0794
        L_0x0a03:
            r0 = r53
            X.0wG r0 = r0.A08
            android.content.Context r1 = r0.A00
            r0 = 2131896680(0x7f122968, float:1.9428228E38)
            java.lang.String r42 = r1.getString(r0)
            goto L_0x0705
        L_0x0a12:
            X.0ts r7 = r9.A06
            r1 = 2131755239(0x7f1000e7, float:1.9141352E38)
            r0 = r27
            java.lang.String r41 = X.C36331k8.A0g(r7, r0, r12, r1)
            goto L_0x06f3
        L_0x0a1f:
            X.11F r0 = r5.A0H
            boolean r1 = r0 instanceof X.C28981Uw
            r7 = 2
            X.0ts r0 = r9.A06
            r33 = r0
            r26 = 2131755241(0x7f1000e9, float:1.9141356E38)
            if (r1 == 0) goto L_0x0a30
            r26 = 2131755242(0x7f1000ea, float:1.9141358E38)
        L_0x0a30:
            long r0 = (long) r10
            r36 = r0
            java.lang.Object[] r14 = new java.lang.Object[r7]
            r0 = r27
            long r0 = (long) r0
            r29 = r0
            java.lang.Object[] r15 = new java.lang.Object[r13]
            r0 = r27
            X.AnonymousClass000.A1L(r15, r0, r12)
            r0 = 2131755240(0x7f1000e8, float:1.9141354E38)
            r8 = r0
            r0 = r29
            r7 = r33
            java.lang.String r0 = r7.A0L(r15, r8, r0)
            r14[r12] = r0
            X.AnonymousClass000.A1L(r14, r10, r13)
            r0 = r36
            r8 = r7
            r7 = r26
            java.lang.String r41 = r8.A0L(r14, r7, r0)
            goto L_0x06f3
        L_0x0a5d:
            boolean r0 = r2.A00
            if (r0 == 0) goto L_0x0a86
            X.C18740tg.A0C(r0)
            android.content.Intent r7 = X.C36431kI.A0D()
            java.lang.String r8 = r6.getPackageName()
            java.lang.String r0 = "com.whatsapp.conversationslist.LockedConversationsActivity"
            r7.setClassName(r8, r0)
            java.lang.String r8 = "fromNotification"
            r0 = 1
            android.content.Intent r7 = r7.putExtra(r8, r0)
            if (r10 != r0) goto L_0x0a7f
            X.11F r0 = r5.A0H
            X.C36421kH.A0m(r7, r0)
        L_0x0a7f:
            r0 = 0
            android.app.PendingIntent r34 = X.C65743Th.A00(r6, r0, r7, r1)
            goto L_0x06c2
        L_0x0a86:
            r7 = 2
            android.content.Intent r0 = X.AnonymousClass190.A05(r6)
            goto L_0x06be
        L_0x0a8d:
            r7 = 0
            X.3wy r1 = new X.3wy
            r1.<init>(r7)
            java.util.Collections.sort(r8, r1)
            int r1 = r8.size()
            int r1 = r1 + -7
            r13 = 0
            int r7 = java.lang.Math.max(r7, r1)
            int r1 = r8.size()
            java.util.List r15 = r8.subList(r7, r1)
            int r1 = r15.size()
            r9 = 1
            if (r1 <= r9) goto L_0x0b2a
            boolean r1 = r2.A06()
            if (r1 == 0) goto L_0x0b2a
            r8 = 0
        L_0x0ab7:
            int r1 = r15.size()
            if (r8 >= r1) goto L_0x0b15
            java.lang.Object r7 = r15.get(r8)
            X.3LF r7 = (X.AnonymousClass3LF) r7
            X.16D r14 = r7.A03
            X.3T1 r1 = r7.A00
            X.11F r1 = X.C64933Qa.A01(r1)
            X.141 r14 = r14.A0D(r1)
            r1 = 1
            if (r10 > r9) goto L_0x0ad3
            r1 = 0
        L_0x0ad3:
            java.lang.CharSequence r18 = r7.A05(r14, r1)
            if (r18 == 0) goto L_0x0ae2
            java.util.ArrayList r14 = r12.A00
            java.lang.CharSequence r1 = X.C07700Yy.A04(r18)
            r14.add(r1)
        L_0x0ae2:
            java.lang.String r1 = " line:"
            r3.append(r1)
            java.lang.String r1 = "("
            r3.append(r1)
            int r1 = r18.length()
            r3.append(r1)
            r1 = 47
            r3.append(r1)
            X.3T1 r14 = r7.A00
            X.11F r14 = X.C64933Qa.A01(r14)
            X.C36351kA.A1K(r14, r3)
            r3.append(r1)
            X.3T1 r1 = r7.A00
            X.3Qa r1 = r1.A1J
            java.lang.String r1 = r1.A01
            r3.append(r1)
            java.lang.String r1 = ")"
            r3.append(r1)
            int r8 = r8 + 1
            goto L_0x0ab7
        L_0x0b15:
            r0.A0C(r12)
            java.lang.String r1 = " inbox:"
            r3.append(r1)
            r1 = 8
            int r7 = r15.size()
            int r1 = java.lang.Math.min(r1, r7)
            r3.append(r1)
        L_0x0b2a:
            int r7 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            r8 = 0
            if (r7 < r1) goto L_0x0b47
            X.11F r1 = r5.A0H
            boolean r1 = r1 instanceof X.C28981Uw
            if (r1 != 0) goto L_0x0b47
            java.lang.String r7 = X.C36351kA.A0y(r5)
            if (r7 == 0) goto L_0x0b3f
            r0.A0O = r7
        L_0x0b3f:
            boolean r1 = r2.A00
            if (r1 == 0) goto L_0x0b49
            r0.A0I(r9)
            goto L_0x0b49
        L_0x0b47:
            r7 = r8
            goto L_0x0b3f
        L_0x0b49:
            android.app.Notification r10 = r0.A05()     // Catch:{ SecurityException -> 0x0b7f }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ SecurityException -> 0x0b7f }
            r0 = 24
            if (r1 < r0) goto L_0x0b63
            boolean r0 = r2.A06()     // Catch:{ SecurityException -> 0x0b7f }
            if (r0 == 0) goto L_0x0b63
            X.1Ip r0 = r2.A0L     // Catch:{ SecurityException -> 0x0b7f }
            X.1Iq r0 = r0.A00(r6)     // Catch:{ SecurityException -> 0x0b7f }
            r0.A02(r13, r10)     // Catch:{ SecurityException -> 0x0b7f }
            goto L_0x0b6e
        L_0x0b63:
            X.1Ip r0 = r2.A0L     // Catch:{ SecurityException -> 0x0b7f }
            X.1Iq r1 = r0.A00(r6)     // Catch:{ SecurityException -> 0x0b7f }
            r0 = r27
            r1.A02(r0, r10)     // Catch:{ SecurityException -> 0x0b7f }
        L_0x0b6e:
            if (r7 == 0) goto L_0x0b75
            X.1Wn r0 = r2.A04     // Catch:{ SecurityException -> 0x0b7f }
            r0.A04(r6, r5, r8)     // Catch:{ SecurityException -> 0x0b7f }
        L_0x0b75:
            X.1Fq r1 = r2.A0C     // Catch:{ SecurityException -> 0x0b7f }
            int r0 = r2.A00()     // Catch:{ SecurityException -> 0x0b7f }
            r1.A02(r0, r10)     // Catch:{ SecurityException -> 0x0b7f }
            goto L_0x0bb3
        L_0x0b7f:
            r1 = move-exception
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "messagenotification/postSummaryNotification uid="
            r7.append(r0)
            int r0 = android.os.Process.myUid()
            java.lang.String r0 = X.C36381kD.A10(r7, r0)
            com.whatsapp.util.Log.i(r0, r1)
            boolean r0 = X.AnonymousClass6YG.A04()
            if (r0 == 0) goto L_0x0d6c
            if (r22 == 0) goto L_0x0e04
            android.util.Pair r0 = X.C34111gT.A00(r22)
            if (r0 == 0) goto L_0x0e04
            java.lang.Object r0 = r0.first
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0e04
            r1 = r64
            X.3LI r1 = X.AnonymousClass1CR.A02(r1, r0)
            r0 = r64
            r0.A0e(r1)
        L_0x0bb3:
            boolean r0 = r2.A00
            android.content.SharedPreferences$Editor r7 = X.C19420v0.A00(r63)
            if (r0 == 0) goto L_0x0d68
            java.lang.String r1 = "locked_chat_last_notification_hash"
        L_0x0bbd:
            r0 = r21
            X.C36341k9.A0x(r7, r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "messagenotification/notify"
            X.C36321k7.A1K(r3, r0, r1)
            if (r4 == 0) goto L_0x0be4
            if (r19 != 0) goto L_0x0be4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "messagenotification/ new="
            r1.append(r0)
            java.lang.String r0 = X.C66013Ui.A0F(r4)
            r1.append(r0)
            r0 = r25
            X.C36321k7.A1X(r0, r1, r13)
        L_0x0be4:
            if (r17 != 0) goto L_0x002c
            X.1G5 r0 = r2.A0A
            X.1G6 r1 = r0.A00()
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x0d64
            X.4Uf r0 = r1.A00()
            r0.Bv3(r11)
        L_0x0bf7:
            if (r47 == 0) goto L_0x0c15
            X.17Y r7 = r2.A0a
            X.1G4 r3 = r2.A0Q
            X.0zA r1 = r2.A02
            r61 = 2
            X.3wk r0 = new X.3wk
            r54 = r0
            r55 = r6
            r56 = r3
            r57 = r62
            r58 = r1
            r59 = r20
            r54.<init>(r55, r56, r57, r58, r59, r60, r61)
            r7.A0H(r0)
        L_0x0c15:
            if (r4 == 0) goto L_0x002c
            boolean r0 = r5.A0G()
            if (r0 == 0) goto L_0x0c47
            X.144 r11 = (X.AnonymousClass144) r11
            r0 = r53
            X.17X r0 = r0.A0A
            int r3 = X.C36401kF.A01(r0, r11)
            int r1 = r3 + -1
            r0 = 35
            if (r3 >= r0) goto L_0x0d5f
            r7 = 120000(0x1d4c0, double:5.9288E-319)
        L_0x0c30:
            long r5 = java.lang.System.currentTimeMillis()
            r12 = 30000(0x7530, double:1.4822E-319)
            r9 = 5000(0x1388, double:2.4703E-320)
            long r0 = (long) r1
            long r0 = r0 * r9
            long r0 = r0 + r12
            long r0 = java.lang.Math.min(r0, r7)
            long r5 = r5 + r0
            r0 = r53
            java.util.HashMap r0 = r0.A0M
            X.C36421kH.A1K(r11, r0, r5)
        L_0x0c47:
            X.1Io r0 = r2.A0b
            r0.A01()
            X.3Qa r7 = r4.A1J
            X.11F r6 = r7.A00
            if (r6 == 0) goto L_0x0cc0
            X.1NM r1 = r2.A0i
            r0 = 0
            r1.A0B(r6, r0)
            X.1Hr r3 = r2.A0c
            X.16D r0 = r3.A04
            X.141 r12 = r0.A08(r6)
            X.0yC r1 = r3.A09
            r0 = 2456(0x998, float:3.442E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0cc0
            X.1Hs r5 = r3.A01
            boolean r0 = r5.A0A(r4)
            if (r0 == 0) goto L_0x0cc0
            if (r12 == 0) goto L_0x0cc0
            X.0wQ r0 = r5.A00
            boolean r0 = X.C36441kJ.A1J(r0)
            if (r0 == 0) goto L_0x0cc0
            X.1IQ r3 = r3.A02
            java.lang.Long r10 = X.C65143Qx.A02(r12)
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r4.A0G
            long r0 = r8.toSeconds(r0)
            java.lang.Long r11 = java.lang.Long.valueOf(r0)
            long r0 = r4.A0I
            long r0 = r8.toSeconds(r0)
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
            java.lang.String r8 = r5.A08(r4)
            int r5 = X.C25801Hs.A00(r12)
            X.1Hs r3 = r3.A00
            boolean r0 = r3.A0B(r4, r5)
            if (r0 == 0) goto L_0x0cc0
            X.2Qj r1 = new X.2Qj
            r1.<init>()
            r1.A02 = r10
            r1.A03 = r11
            r1.A01 = r9
            r1.A04 = r8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r1.A00 = r0
            X.0yW r0 = r3.A04
            r0.Bly(r1)
        L_0x0cc0:
            X.1Fp r3 = r2.A0m
            java.lang.String r5 = r7.toString()
            if (r6 == 0) goto L_0x0d59
            boolean r0 = X.AnonymousClass143.A0G(r6)
            if (r0 == 0) goto L_0x0d4b
            r7 = 2
        L_0x0ccf:
            java.lang.String r6 = r6.getRawString()
        L_0x0cd3:
            boolean r0 = r4 instanceof X.AnonymousClass2bV
            if (r0 == 0) goto L_0x0cef
            X.2bV r4 = (X.AnonymousClass2bV) r4
            java.lang.String r0 = r4.A05
            r1 = 1
            if (r0 == 0) goto L_0x0ce0
            r1 = 18
        L_0x0ce0:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
        L_0x0ce4:
            X.0wk r0 = r3.A03
            X.3vb r2 = new X.3vb
            r2.<init>(r3, r4, r5, r6, r7)
            r0.execute(r2)
            return
        L_0x0cef:
            boolean r0 = r4 instanceof X.C46812bi
            if (r0 == 0) goto L_0x0cf5
            r1 = 2
            goto L_0x0ce0
        L_0x0cf5:
            boolean r0 = r4 instanceof X.C46972by
            if (r0 == 0) goto L_0x0cfb
            r1 = 3
            goto L_0x0ce0
        L_0x0cfb:
            boolean r0 = r4 instanceof X.C46882bp
            if (r0 == 0) goto L_0x0d01
            r1 = 4
            goto L_0x0ce0
        L_0x0d01:
            boolean r0 = r4 instanceof X.C181798o3
            if (r0 == 0) goto L_0x0d07
            r1 = 5
            goto L_0x0ce0
        L_0x0d07:
            boolean r0 = r4 instanceof X.C46962bx
            if (r0 == 0) goto L_0x0d0e
            r1 = 8
            goto L_0x0ce0
        L_0x0d0e:
            if (r16 == 0) goto L_0x0d13
            r1 = 9
            goto L_0x0ce0
        L_0x0d13:
            boolean r0 = r4 instanceof X.AnonymousClass2bQ
            if (r0 == 0) goto L_0x0d1a
            r1 = 10
            goto L_0x0ce0
        L_0x0d1a:
            boolean r0 = r4 instanceof X.C46752bc
            if (r0 == 0) goto L_0x0d21
            r1 = 14
            goto L_0x0ce0
        L_0x0d21:
            boolean r0 = r4 instanceof X.AnonymousClass2cP
            if (r0 != 0) goto L_0x0d48
            boolean r0 = r4 instanceof X.AnonymousClass2bR
            if (r0 != 0) goto L_0x0d48
            boolean r0 = r4 instanceof X.AnonymousClass2bS
            if (r0 == 0) goto L_0x0d30
            r1 = 16
            goto L_0x0ce0
        L_0x0d30:
            boolean r0 = r4 instanceof X.AnonymousClass2bL
            if (r0 == 0) goto L_0x0d37
            r1 = 17
            goto L_0x0ce0
        L_0x0d37:
            boolean r0 = r4 instanceof X.AnonymousClass5J5
            if (r0 == 0) goto L_0x0d46
            X.5J5 r4 = (X.AnonymousClass5J5) r4
            boolean r0 = r4.A1Y()
            r1 = 6
            if (r0 == 0) goto L_0x0ce0
            r1 = 7
            goto L_0x0ce0
        L_0x0d46:
            r4 = 0
            goto L_0x0ce4
        L_0x0d48:
            r1 = 15
            goto L_0x0ce0
        L_0x0d4b:
            boolean r0 = X.AnonymousClass143.A0H(r6)
            if (r0 == 0) goto L_0x0d54
            r7 = 5
            goto L_0x0ccf
        L_0x0d54:
            boolean r0 = r6 instanceof com.whatsapp.jid.UserJid
            r7 = 1
            if (r0 != 0) goto L_0x0ccf
        L_0x0d59:
            r7 = 3
            if (r6 != 0) goto L_0x0ccf
            r6 = 0
            goto L_0x0cd3
        L_0x0d5f:
            r7 = 300000(0x493e0, double:1.482197E-318)
            goto L_0x0c30
        L_0x0d64:
            X.C56772wr.A00 = r9
            goto L_0x0bf7
        L_0x0d68:
            java.lang.String r1 = "last_notification_hash"
            goto L_0x0bbd
        L_0x0d6c:
            java.lang.String r7 = r1.toString()
            java.lang.String r0 = "permission issue with UPDATE_APP_OPS_STATS should only occur in Android 4.3 or earlier"
            X.C18740tg.A0D(r13, r0)
            java.lang.String r0 = "android.permission.UPDATE_APP_OPS_STATS"
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L_0x0e04
            goto L_0x0bb3
        L_0x0d7f:
            X.14e r6 = r9.A02     // Catch:{ all -> 0x0dea }
            java.lang.String r5 = X.AnonymousClass2xD.A0F     // Catch:{ all -> 0x0dea }
            java.lang.String[] r4 = X.C36441kJ.A1S()     // Catch:{ all -> 0x0dea }
            X.163 r0 = r14.A00     // Catch:{ all -> 0x0dea }
            long r0 = r0.A08(r7)     // Catch:{ all -> 0x0dea }
            X.C36341k9.A1W(r4, r0)     // Catch:{ all -> 0x0dea }
            r0 = 1
            X.C36431kI.A1O(r4, r13, r0)     // Catch:{ all -> 0x0dea }
            java.lang.String r0 = "GET_NOTIFICATION_MESSAGES_FOR_REPLY_SQL"
            android.database.Cursor r0 = r6.A09(r5, r0, r4)     // Catch:{ all -> 0x0dea }
            X.C24541Cv.A02(r0, r14, r7, r10)     // Catch:{ all -> 0x0dde }
            if (r0 == 0) goto L_0x0da2
            r0.close()     // Catch:{ all -> 0x0dea }
        L_0x0da2:
            r9.close()
            X.12g r5 = r14.A02
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r15
            java.lang.String r4 = "LastMessageStore/getLastMessagesForNotificationAfterReply"
            r5.A01(r4, r0)
            java.util.Iterator r1 = r10.iterator()
        L_0x0db5:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0dc7
            X.3T1 r0 = X.C36391kE.A0l(r1)
            X.3LF r0 = r12.A06(r0)
            r11.add(r0)
            goto L_0x0db5
        L_0x0dc7:
            java.util.Collections.reverse(r11)
            r0 = r24
            r0.add(r11)
            r12 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r9 = r2
            r10 = r3
            r11 = r0
            r14 = r8
            r17 = r22
            r9.A05(r10, r11, r12, r13, r14, r15, r16, r17)
            return
        L_0x0dde:
            r1 = move-exception
            if (r0 == 0) goto L_0x0de9
            r0.close()     // Catch:{ all -> 0x0de5 }
            goto L_0x0de9
        L_0x0de5:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0dea }
        L_0x0de9:
            throw r1     // Catch:{ all -> 0x0dea }
        L_0x0dea:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0e00 }
            throw r1
        L_0x0def:
            r1 = move-exception
            if (r13 == 0) goto L_0x0dfa
            r13.close()     // Catch:{ all -> 0x0df6 }
            goto L_0x0dfa
        L_0x0df6:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0dfb }
        L_0x0dfa:
            throw r1     // Catch:{ all -> 0x0dfb }
        L_0x0dfb:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x0e00 }
            throw r1
        L_0x0e00:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x0e04:
            throw r1
        L_0x0e05:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81343wr.run():void");
    }

    private void A04(C07700Yy r7, AnonymousClass141 r8, int i, boolean z) {
        if (DirectReplyService.A01()) {
            r7.A0Q.add(DirectReplyService.A00(this.A01, r8, "com.whatsapp.intent.action.DIRECT_REPLY_FROM_MESSAGE", i, z));
            return;
        }
        Context context = this.A01;
        AnonymousClass11F r4 = r8.A0H;
        Intent A0D2 = C36431kI.A0D();
        A0D2.setClassName(context.getPackageName(), "com.whatsapp.notification.PopupNotification");
        A0D2.putExtra("popup_notification_extra_quick_reply_jid", AnonymousClass143.A03(r4));
        A0D2.putExtra("popup_notification_extra_dismiss_notification", true);
        r7.A08(R.drawable.ic_action_reply, context.getString(R.string.f12nameremoved), C65743Th.A03(context, A0D2, 0));
    }

    public C81343wr(Context context, C21390zA r6, AnonymousClass17Y r7, C19730wQ r8, C29411Wn r9, C26021Io r10, AnonymousClass18U r11, C25791Hr r12, AnonymousClass1NG r13, C27671Pf r14, AnonymousClass1MK r15, AnonymousClass1LV r16, AnonymousClass16D r17, AnonymousClass185 r18, AnonymousClass171 r19, C235618y r20, AnonymousClass1A6 r21, AnonymousClass1NM r22, AnonymousClass1V6 r23, AnonymousClass1G5 r24, C21060yb r25, C19970wo r26, C25271Fq r27, C20830yE r28, C19420v0 r29, C18820ts r30, C220412q r31, AnonymousClass17X r32, C20810yC r33, C20500xf r34, C25261Fp r35, AnonymousClass17V r36, AnonymousClass11F r37, C28361Si r38, AnonymousClass39J r39, C20600xp r40, AnonymousClass1TE r41, AnonymousClass32Y r42, C26031Ip r43, AnonymousClass1TF r44, AnonymousClass3T1 r45, C24551Cw r46, AnonymousClass1AW r47, AnonymousClass12U r48, AnonymousClass1G4 r49, AnonymousClass1CR r50, AnonymousClass1A1 r51, AnonymousClass1C6 r52, AnonymousClass1E9 r53, AnonymousClass1Q0 r54, AnonymousClass1EM r55, AnonymousClass13J r56, C34071gP r57, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = z4;
        this.A01 = context;
        this.A0j = r26;
        this.A0H = r33;
        this.A0a = r7;
        this.A03 = r8;
        this.A0F = r31;
        this.A0s = r52;
        this.A0l = r34;
        this.A05 = r15;
        this.A0b = r10;
        this.A07 = r17;
        this.A0B = r25;
        this.A08 = r19;
        this.A0k = r30;
        this.A0v = r56;
        this.A0u = r55;
        this.A0L = r43;
        this.A0T = r54;
        this.A0d = r13;
        this.A0g = r20;
        this.A0i = r22;
        this.A0R = r50;
        this.A0J = r40;
        this.A0M = r44;
        this.A04 = r9;
        this.A0U = r57;
        this.A0n = r36;
        this.A0O = r46;
        this.A0I = r38;
        this.A0t = r53;
        this.A0f = r18;
        this.A0D = r28;
        this.A0E = r29;
        this.A06 = r16;
        this.A0h = r21;
        this.A0S = r51;
        this.A0C = r27;
        this.A0K = r41;
        this.A0Q = r49;
        this.A0G = r32;
        this.A0q = r42;
        this.A0P = r48;
        this.A02 = r6;
        this.A09 = r23;
        this.A0m = r35;
        this.A0e = r14;
        this.A0p = r39;
        this.A0A = r24;
        this.A0Y = z;
        this.A0x = z2;
        this.A0W = z3;
        this.A0o = r37;
        this.A0Z = i;
        this.A0r = r47;
        this.A0w = r11.A07();
        this.A0X = z5;
        this.A0c = r12;
        AnonymousClass3T1 r3 = r45;
        if (r45 == null || !AnonymousClass000.A1S(r3.A0A & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING, EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING)) {
            this.A0N = r3;
        } else {
            z6 = true;
        }
        this.A0V = z6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0389, code lost:
        if (r16 == false) goto L_0x02b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x03b7, code lost:
        if (r9.A1R(8) != false) goto L_0x03b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0190, code lost:
        if (A08(X.C36351kA.A0j(r6), r24, r7.A00.A0G) == false) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x02b7, code lost:
        if (r12 == false) goto L_0x02b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x02b9, code lost:
        A03(r4, r0, r6);
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0362  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0379  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0382  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0389  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x038d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x039f  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x03a2  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x03dd  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0461 A[SYNTHETIC, Splitter:B:146:0x0461] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x033f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A05(java.lang.StringBuilder r40, java.util.ArrayList r41, int r42, int r43, int r44, boolean r45, boolean r46, boolean r47) {
        /*
            r39 = this;
            r5 = r39
            android.content.Context r4 = r5.A01
            android.content.res.Resources r1 = r4.getResources()
            r0 = 17104901(0x1050005, float:2.4428256E-38)
            r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 17104902(0x1050006, float:2.442826E-38)
            r1.getDimensionPixelSize(r0)
            r9 = 0
            r3 = 0
        L_0x001a:
            r38 = r41
            int r0 = r38.size()
            int r0 = r0 + -7
            int r0 = java.lang.Math.max(r9, r0)
            if (r3 >= r0) goto L_0x0046
            r0 = r38
            java.lang.Object r0 = r0.get(r3)
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r9)
            X.3LF r0 = (X.AnonymousClass3LF) r0
            X.3T1 r0 = r0.A00
            X.3Qa r0 = r0.A1J
            X.11F r2 = r0.A00
            X.1Fq r1 = r5.A0C
            java.lang.String r0 = "UpdateMessageNotificationRunnable2"
            r1.A06(r2, r0)
            int r3 = r3 + 1
            goto L_0x001a
        L_0x0046:
            java.util.HashMap r21 = X.AnonymousClass001.A0J()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x0085
            if (r47 != 0) goto L_0x0085
            X.0xp r0 = r5.A0J
            android.service.notification.StatusBarNotification[] r8 = r0.A0O()
            int r7 = r8.length
        L_0x0059:
            if (r9 >= r7) goto L_0x0085
            r2 = r8[r9]
            java.lang.String r0 = r2.getTag()
            if (r0 == 0) goto L_0x0082
            int r1 = r2.getId()
            int r0 = r5.A00()
            if (r1 != r0) goto L_0x0082
            android.app.Notification r0 = r2.getNotification()
            android.os.Bundle r1 = r0.extras
            java.lang.String r0 = "last_row_id"
            long r0 = r1.getLong(r0)
            java.lang.String r6 = r2.getTag()
            r2 = r21
            X.C36421kH.A1K(r6, r2, r0)
        L_0x0082:
            int r9 = r9 + 1
            goto L_0x0059
        L_0x0085:
            int r0 = r38.size()
            if (r3 >= r0) goto L_0x04d2
            r0 = r38
            java.lang.Object r26 = r0.get(r3)
            r0 = r26
            java.util.List r0 = (java.util.List) r0
            r26 = r0
            int r1 = r26.size()
            r0 = 1
            int r1 = r1 - r0
            r0 = r26
            java.lang.Object r7 = r0.get(r1)
            X.3LF r7 = (X.AnonymousClass3LF) r7
            X.3T1 r0 = r7.A00
            X.11F r1 = X.C64933Qa.A01(r0)
            X.16D r0 = r5.A07
            r37 = r0
            X.141 r6 = r0.A0D(r1)
            r25 = 0
            X.12q r15 = r5.A0F
            int r24 = r15.A02(r1)
            X.3Qp r0 = X.C36351kA.A0Z(r15, r1)
            if (r0 != 0) goto L_0x04a5
            r2 = 0
        L_0x00c2:
            X.3Qp r0 = X.C36351kA.A0Z(r15, r1)
            if (r0 != 0) goto L_0x049f
            r23 = 0
        L_0x00ca:
            int r2 = r2 + r24
            int r2 = r2 + r23
            X.1CR r0 = r5.A0R
            r36 = r0
            X.3LI r22 = X.C36361kB.A0d(r1, r0)
            java.lang.String r0 = r22.A06()
            int r16 = java.lang.Integer.parseInt(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x0105
            if (r47 != 0) goto L_0x0105
            X.11F r0 = X.C36351kA.A0j(r6)
            java.lang.String r1 = X.C25271Fq.A00(r0)
            r0 = r21
            java.lang.Number r0 = X.C36441kJ.A10(r1, r0)
            if (r0 == 0) goto L_0x0105
            long r9 = r0.longValue()
            X.3T1 r0 = r7.A00
            long r0 = r0.A1N
            int r8 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r8 != 0) goto L_0x0105
        L_0x0102:
            int r3 = r3 + 1
            goto L_0x0085
        L_0x0105:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            X.0Yy r0 = X.C20600xp.A02(r4)
            boolean r8 = r5.A0X
            r20 = r8
            if (r8 == 0) goto L_0x03c8
            java.lang.String r8 = "newsletter_key_messages"
        L_0x0115:
            r0.A0N = r8
            r9 = 8
            android.app.Notification r11 = r0.A0B
            int r8 = r11.flags
            r9 = r9 | r8
            r11.flags = r9
            X.39J r8 = r5.A0p
            X.3T1 r10 = r7.A00
            android.content.Context r9 = r8.A00
            java.lang.Class<com.whatsapp.notification.MessageNotificationDismissedReceiver> r8 = com.whatsapp.notification.MessageNotificationDismissedReceiver.class
            android.content.Intent r8 = X.C36441kJ.A0H(r9, r8)
            android.net.Uri r12 = X.AnonymousClass1U4.A00(r6)
            r8.setData(r12)
            long r12 = r10.A0I
            java.lang.String r14 = "last_message_time"
            r8.putExtra(r14, r12)
            X.3Qa r10 = r10.A1J
            X.11F r10 = r10.A00
            X.C36341k9.A0t(r8, r10)
            r12 = 1
            r10 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r8 = X.C65743Th.A01(r9, r12, r8, r10)
            r11.deleteIntent = r8
            r19 = 2131231578(0x7f08035a, float:1.807924E38)
            r8 = r19
            r11.icon = r8
            android.os.Bundle r10 = X.AnonymousClass001.A07()
            X.3T1 r8 = r7.A00
            long r8 = r8.A1N
            java.lang.String r11 = "last_row_id"
            r10.putLong(r11, r8)
            android.os.Bundle r8 = r0.A0G
            if (r8 != 0) goto L_0x03c3
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>(r10)
            r0.A0G = r8
        L_0x0169:
            boolean r34 = r5.A09(r6)
            X.3T1 r8 = r7.A00
            boolean r8 = r8 instanceof X.AnonymousClass2bZ
            if (r8 == 0) goto L_0x017e
            X.1AW r9 = r5.A0r
            X.3T1 r8 = r7.A00
            X.2bZ r8 = (X.AnonymousClass2bZ) r8
            r9.A01(r8)
            r34 = 0
        L_0x017e:
            if (r16 != 0) goto L_0x0192
            X.11F r11 = X.C36351kA.A0j(r6)
            X.3T1 r8 = r7.A00
            long r8 = r8.A0G
            r10 = r24
            boolean r8 = r5.A08(r11, r10, r8)
            r18 = 1
            if (r8 != 0) goto L_0x03bf
        L_0x0192:
            r18 = 0
            if (r16 == 0) goto L_0x03bf
            boolean r8 = r22.A0A()
            if (r8 != 0) goto L_0x03bf
            if (r46 != 0) goto L_0x01aa
            X.32Y r8 = r5.A0q
            X.32X r8 = r8.A00
            if (r8 == 0) goto L_0x03bf
            com.whatsapp.notification.PopupNotification r8 = r8.A00
            boolean r8 = r8.A1L
            if (r8 == 0) goto L_0x03bf
        L_0x01aa:
            r17 = 0
        L_0x01ac:
            X.1TF r9 = r5.A0M
            X.3T1 r8 = r7.A00
            boolean r16 = r9.A06(r8)
            if (r16 == 0) goto L_0x03a2
            X.1TE r9 = r5.A0K
            X.3T1 r8 = r7.A00
            r9.A00(r4, r0, r6, r8)
            r34 = 0
        L_0x01bf:
            X.0xp r8 = r5.A0J
            r35 = r8
            android.graphics.Bitmap r8 = r8.A0C(r6)
            X.356 r9 = r7.A04(r6)
            r0.A0A(r8)
            int r8 = r38.size()
            int r8 = r8 - r3
            java.lang.String r10 = java.lang.String.valueOf(r8)
            java.lang.String r8 = r9.A01
            r0.A0F(r8)
            java.lang.CharSequence r8 = r9.A00
            r0.A0E(r8)
            X.3T1 r8 = r7.A00
            long r8 = r8.A0I
            r0.A09(r8)
            r0.A0P = r10
            java.lang.String r8 = "sortKey="
            r1.append(r8)
            r1.append(r10)
            r8 = r42
            boolean r31 = X.AnonymousClass000.A1S(r8, r12)
            r8 = r43
            boolean r32 = X.AnonymousClass000.A1S(r8, r12)
            r33 = r45
            r27 = r35
            r28 = r0
            r29 = r6
            r30 = r7
            r27.A0J(r28, r29, r30, r31, r32, r33, r34)
            X.11F r8 = r5.A0o
            if (r8 != 0) goto L_0x0247
            X.0Yy r10 = X.C20600xp.A02(r4)
            java.lang.String r9 = "msg"
            r10.A0L = r9
            r9 = r35
            X.0wG r9 = r9.A08
            android.content.Context r11 = r9.A00
            r9 = 2131896680(0x7f122968, float:1.9428228E38)
            java.lang.String r9 = r11.getString(r9)
            r10.A0F(r9)
            X.0ts r14 = r5.A0k
            r13 = 2131755239(0x7f1000e7, float:1.9141352E38)
            long r11 = (long) r2
            java.lang.Object[] r9 = X.AnonymousClass001.A0L()
            X.AnonymousClass000.A1J(r9, r2)
            java.lang.String r9 = r14.A0L(r9, r13, r11)
            r10.A0E(r9)
            android.app.Notification r11 = r10.A0B
            r9 = r19
            r11.icon = r9
            android.app.Notification r9 = r10.A05()
            r0.A0C = r9
        L_0x0247:
            int r10 = android.os.Build.VERSION.SDK_INT
            r9 = 26
            if (r10 < r9) goto L_0x0282
            r11 = r22
            X.2dt r11 = (X.C47192dt) r11
            java.lang.String r10 = r11.A07()
            java.lang.String r9 = "Silent"
            boolean r9 = r9.equalsIgnoreCase(r10)
            java.lang.String r10 = r5.A02(r11, r9)
            r0.A0M = r10
            r9 = 1
            r0.A07 = r9
            r0.A08 = r2
            java.lang.String r9 = " channel="
            r1.append(r9)
            r1.append(r10)
            java.lang.String r9 = " number="
            r1.append(r9)
            r9 = r24
            r1.append(r9)
            java.lang.String r9 = " numberReactions="
            r1.append(r9)
            r9 = r23
            r1.append(r9)
        L_0x0282:
            int r10 = android.os.Build.VERSION.SDK_INT
            r9 = 24
            if (r10 < r9) goto L_0x039f
            r9 = 28
            if (r10 >= r9) goto L_0x039f
            r10 = 1
            r9 = r42
            if (r9 != r10) goto L_0x039f
            boolean r9 = r5.A06()
            X.0xp r10 = r7.A07
            r31 = 1
            r32 = 1
            r27 = r10
            r27.A0J(r28, r29, r30, r31, r32, r33, r34)
            r10 = r40
            r7.A07(r0, r6, r10, r9)
            boolean r12 = r7.A08(r4, r0, r6)
        L_0x02a9:
            X.0yC r9 = r5.A0H
            r10 = 3156(0xc54, float:4.422E-42)
            boolean r10 = r9.A0E(r10)
            r11 = 1
            if (r10 != 0) goto L_0x037c
            r11 = 0
            if (r18 == 0) goto L_0x037c
            if (r12 != 0) goto L_0x037c
        L_0x02b9:
            r5.A03(r4, r0, r6)
        L_0x02bc:
            if (r20 != 0) goto L_0x02cd
            java.lang.String r8 = X.C36351kA.A0y(r6)
            r0.A0O = r8
            java.lang.String r8 = r7.A06()
            if (r8 == 0) goto L_0x02cd
            r0.A0H(r8)
        L_0x02cd:
            java.lang.Object r10 = X.C36391kE.A0t(r26)
            X.3LF r10 = (X.AnonymousClass3LF) r10
            int r11 = android.os.Build.VERSION.SDK_INT
            r8 = 24
            if (r11 < r8) goto L_0x03cf
            if (r12 != 0) goto L_0x03cf
            X.0UW r8 = r35.A0D()
            androidx.core.app.NotificationCompat$MessagingStyle r12 = new androidx.core.app.NotificationCompat$MessagingStyle
            r12.<init>(r8)
            X.3T1 r8 = r7.A00
            X.3Qa r8 = r8.A1J
            X.11F r8 = r8.A00
            X.171 r11 = r5.A08
            int r14 = r11.A08(r6, r8)
            boolean r17 = X.AnonymousClass143.A0G(r8)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r17)
            r12.A00 = r13
            r13 = 0
            java.lang.String r16 = r11.A0R(r6, r14, r13)
            r13 = 5665(0x1621, float:7.938E-42)
            boolean r13 = r9.A0E(r13)
            r9 = 1
            if (r13 == 0) goto L_0x0379
            boolean r13 = r15.A0S(r8)
            if (r13 != 0) goto L_0x0319
            com.whatsapp.jid.GroupJid r13 = X.C36441kJ.A0l(r8)
            int r14 = r15.A05(r13)
            r13 = 2
            if (r14 != r13) goto L_0x0379
        L_0x0319:
            X.147 r13 = X.C65533Sl.A01(r8)
            if (r13 == 0) goto L_0x0379
            X.1LV r13 = r5.A06
            X.147 r8 = (X.AnonymousClass147) r8
            X.147 r13 = r13.A02(r8)
            if (r13 == 0) goto L_0x0379
            r8 = r37
            X.141 r13 = r8.A0D(r13)
            java.lang.Object[] r8 = X.C36411kG.A1b(r16)
            X.C36361kB.A1F(r11, r13, r8, r9)
            r11 = 2131894714(0x7f1221ba, float:1.942424E38)
            java.lang.String r25 = r4.getString(r11, r8)
        L_0x033d:
            if (r17 == 0) goto L_0x0358
            r8 = r24
            if (r8 <= r9) goto L_0x0354
            X.0ts r15 = r5.A0k
            long r13 = (long) r2
            java.lang.Object[] r11 = X.C36411kG.A1b(r16)
            X.AnonymousClass000.A1L(r11, r2, r9)
            r8 = 2131755058(0x7f100032, float:1.9140985E38)
            java.lang.String r16 = r15.A0L(r11, r8, r13)
        L_0x0354:
            r8 = r16
            r12.A01 = r8
        L_0x0358:
            java.util.Iterator r11 = r26.iterator()
        L_0x035c:
            boolean r8 = r11.hasNext()
            if (r8 == 0) goto L_0x03cc
            java.lang.Object r9 = r11.next()
            X.3LF r9 = (X.AnonymousClass3LF) r9
            long r15 = r9.A02()
            long r13 = r10.A02()
            int r8 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r8 >= 0) goto L_0x0375
            r10 = r9
        L_0x0375:
            r9.A0A(r0, r12, r6)
            goto L_0x035c
        L_0x0379:
            r25 = r16
            goto L_0x033d
        L_0x037c:
            boolean r10 = r5.A07(r6)
            if (r10 == 0) goto L_0x038d
            r8 = 21
            X.C20600xp.A08(r4, r0, r6, r8)
        L_0x0387:
            if (r11 == 0) goto L_0x02bc
            if (r16 != 0) goto L_0x02bc
            goto L_0x02b9
        L_0x038d:
            if (r17 == 0) goto L_0x0387
            if (r12 != 0) goto L_0x0387
            if (r8 != 0) goto L_0x0387
            if (r16 != 0) goto L_0x0387
            X.0Wx r10 = com.whatsapp.notification.AndroidWear.A00(r4, r6)
            java.util.ArrayList r8 = r0.A0Q
            r8.add(r10)
            goto L_0x0387
        L_0x039f:
            r12 = 0
            goto L_0x02a9
        L_0x03a2:
            if (r34 == 0) goto L_0x01bf
            int r10 = r24 + r44
            X.3T1 r9 = r7.A00
            boolean r8 = r9 instanceof X.AnonymousClass2bZ
            if (r8 != 0) goto L_0x03b9
            boolean r8 = r9 instanceof X.C46852bm
            if (r8 != 0) goto L_0x03b9
            r8 = 8
            boolean r9 = r9.A1R(r8)
            r8 = 1
            if (r9 == 0) goto L_0x03ba
        L_0x03b9:
            r8 = 0
        L_0x03ba:
            r5.A04(r0, r6, r10, r8)
            goto L_0x01bf
        L_0x03bf:
            r17 = 1
            goto L_0x01ac
        L_0x03c3:
            r8.putAll(r10)
            goto L_0x0169
        L_0x03c8:
            java.lang.String r8 = "group_key_messages"
            goto L_0x0115
        L_0x03cc:
            r0.A0C(r12)
        L_0x03cf:
            boolean r7 = r7 instanceof X.AnonymousClass2Z6
            X.00I r11 = A01(r4, r6, r7)
            java.lang.Object r9 = r11.A01
            android.content.Intent r9 = (android.content.Intent) r9
            boolean r7 = r10 instanceof X.AnonymousClass4RM
            if (r7 == 0) goto L_0x0409
            r13 = r10
            X.4RM r13 = (X.AnonymousClass4RM) r13
            long r7 = r10.A02()
            java.lang.String r12 = "row_id"
            r9.putExtra(r12, r7)
            boolean r7 = r10 instanceof X.AnonymousClass2Z6
            if (r7 == 0) goto L_0x0446
            r7 = r10
            X.2Z6 r7 = (X.AnonymousClass2Z6) r7
            X.37G r7 = r7.A00
            X.3T1 r7 = r7.A00
        L_0x03f4:
            long r7 = r7.A1O
        L_0x03f6:
            java.lang.String r12 = "sort_id"
            r9.putExtra(r12, r7)
            boolean r8 = r10 instanceof X.AnonymousClass2Z8
            java.lang.String r7 = "open_comment_thread"
            r9.putExtra(r7, r8)
            X.3Qa r7 = r13.BF8()
            X.AnonymousClass3UJ.A00(r9, r7)
        L_0x0409:
            java.lang.Object r7 = r11.A00
            X.C18740tg.A06(r7)
            int r7 = X.AnonymousClass000.A0I(r7)
            android.app.PendingIntent r7 = X.C65743Th.A03(r4, r9, r7)
            r0.A0D = r7
            android.app.Notification r7 = r0.A05()
            X.1Ip r0 = r5.A0L
            X.1Iq r0 = r0.A00(r4)
            r0.A02(r2, r7)
            java.lang.String r0 = " jid="
            r1.append(r0)
            X.11F r0 = r6.A0H
            r1.append(r0)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "messagenotification/postChildNotification "
            r2.append(r0)
            java.lang.String r0 = r1.toString()
            X.C36321k7.A1a(r2, r0)
            X.11F r2 = X.C36331k8.A0G(r6)
            if (r20 != 0) goto L_0x0468
            goto L_0x0461
        L_0x0446:
            boolean r7 = r10 instanceof X.AnonymousClass2Z8
            if (r7 == 0) goto L_0x0452
            r7 = r10
            X.2Z8 r7 = (X.AnonymousClass2Z8) r7
            X.3K6 r7 = r7.A00
            long r7 = r7.A00
            goto L_0x03f6
        L_0x0452:
            boolean r7 = r10 instanceof X.AnonymousClass2Z7
            if (r7 == 0) goto L_0x045e
            r7 = r10
            X.2Z7 r7 = (X.AnonymousClass2Z7) r7
            X.38i r7 = r7.A00
            X.3T1 r7 = r7.A01
            goto L_0x03f4
        L_0x045e:
            X.3T1 r7 = r10.A00
            goto L_0x03f4
        L_0x0461:
            X.1Wn r1 = r5.A04     // Catch:{ SecurityException -> 0x046f, RuntimeException -> 0x04a9 }
            r0 = r25
            r1.A04(r4, r6, r0)     // Catch:{ SecurityException -> 0x046f, RuntimeException -> 0x04a9 }
        L_0x0468:
            X.1Fq r0 = r5.A0C     // Catch:{ SecurityException -> 0x046f, RuntimeException -> 0x04a9 }
            r0.A05(r7, r2)     // Catch:{ SecurityException -> 0x046f, RuntimeException -> 0x04a9 }
            goto L_0x0102
        L_0x046f:
            r2 = move-exception
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "messagenotification/postChildNotification uid="
            r6.append(r0)
            int r0 = android.os.Process.myUid()
            r6.append(r0)
            java.lang.String r0 = " quiet="
            r6.append(r0)
            boolean r1 = r5.A0Y
            java.lang.String r0 = X.C36421kH.A0d(r6, r1)
            com.whatsapp.util.Log.i(r0, r2)
            if (r1 != 0) goto L_0x04d1
            boolean r0 = X.AnonymousClass6YG.A04()
            if (r0 == 0) goto L_0x04d1
            r1 = r36
            r0 = r22
            r1.A0e(r0)
            goto L_0x0102
        L_0x049f:
            int r0 = r0.A07
            r23 = r0
            goto L_0x00ca
        L_0x04a5:
            int r2 = r0.A05
            goto L_0x00c2
        L_0x04a9:
            r2 = move-exception
            java.lang.Throwable r0 = r2.getCause()
            boolean r0 = r0 instanceof android.os.TransactionTooLargeException
            if (r0 == 0) goto L_0x04d1
            java.lang.String r0 = "Error posting notification"
            com.whatsapp.util.Log.e(r0, r2)
            java.util.Iterator r1 = r26.iterator()
        L_0x04bb:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x04d1
            java.lang.Object r0 = r1.next()
            X.3LF r0 = (X.AnonymousClass3LF) r0
            X.356 r0 = r0.A04(r6)
            java.lang.CharSequence r0 = r0.A00
            r0.length()
            goto L_0x04bb
        L_0x04d1:
            throw r2
        L_0x04d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81343wr.A05(java.lang.StringBuilder, java.util.ArrayList, int, int, int, boolean, boolean, boolean):void");
    }
}
