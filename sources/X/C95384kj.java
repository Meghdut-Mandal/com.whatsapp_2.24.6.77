package X;

import android.app.Application;
import android.os.Handler;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.4kj  reason: invalid class name and case insensitive filesystem */
public class C95384kj extends AnonymousClass08X implements C158137fr {
    public int A00;
    public C116765lA A01 = new C116765lA(this);
    public C144416s9 A02;
    public Runnable A03;
    public final Handler A04;
    public final AnonymousClass08S A05;
    public final C001700s A06 = C36431kI.A0S();
    public final AnonymousClass08M A07;
    public final C1254960a A08;
    public final AnonymousClass17Y A09;
    public final C1255760k A0A;
    public final C1265264j A0B;
    public final C124145xf A0C;
    public final AnonymousClass6NC A0D;
    public final C20810yC A0E;
    public final AnonymousClass6OF A0F;
    public final C132406Tm A0G;
    public final C132406Tm A0H;
    public final C28201Rs A0I;
    public final String A0J;
    public final LinkedList A0K;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95384kj(Application application, AnonymousClass08M r13, C115845jX r14, C1254960a r15, AnonymousClass17Y r16, C1255760k r17, C1265264j r18, AnonymousClass6NC r19, C20810yC r20, AnonymousClass6OF r21, String str, int i) {
        super(application);
        int i2 = i;
        AnonymousClass08S r2 = new AnonymousClass08S();
        this.A05 = r2;
        this.A0E = r20;
        this.A09 = r16;
        String str2 = str;
        this.A0J = str2;
        this.A07 = r13;
        C1265264j r4 = r18;
        this.A0B = r4;
        this.A0D = r19;
        this.A04 = new Handler();
        this.A0K = C90524aI.A0l();
        this.A0I = C36441kJ.A0t();
        this.A0F = r21;
        C18800tq r0 = r14.A00.A02;
        C20810yC A0V = C36341k9.A0V(r0);
        C18830tt r1 = r0.A00;
        C124145xf r5 = new C124145xf((C1255760k) r1.A0W.get(), (AnonymousClass5l9) r1.A0U.get(), A0V, (AnonymousClass6OF) r1.A0V.get(), str2);
        this.A0C = r5;
        this.A0A = r17;
        C165157sy.A01(r5.A00, r2, this, 7);
        r4.A02 = this;
        r4.A01 = r5;
        if (!this.A0E.A0E(2806)) {
            i2 = 2;
        } else {
            AnonymousClass08M r22 = this.A07;
            if (r22.A03.containsKey("arg_home_view_state")) {
                i2 = C90474aD.A06("arg_home_view_state", r22.A03);
            }
        }
        this.A00 = i2;
        this.A08 = r15;
        C132406Tm A002 = r15.A00(741488182);
        this.A0G = A002;
        this.A0H = r15.A00(741481818);
        A002.A05();
        A01();
    }

    public static void A02(C95384kj r3, List list) {
        if (r3.A00 == 1 && r3.A0E.A0E(2806)) {
            list.add(0, new AnonymousClass5E8(r3.A01));
        }
        r3.A05.A0C(list);
    }

    public void A0R() {
        C1265264j r1 = this.A0B;
        r1.A02 = null;
        r1.A01 = null;
        r1.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        r3 = r7.A0F;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0S(java.lang.String r8) {
        /*
            r7 = this;
            X.6Tm r0 = r7.A0H
            r0.A05()
            java.util.LinkedList r4 = r7.A0K
            monitor-enter(r4)
            java.lang.String r5 = r8.trim()     // Catch:{ all -> 0x0089 }
            boolean r6 = r5.isEmpty()     // Catch:{ all -> 0x0089 }
            if (r6 != 0) goto L_0x0029
            X.60k r1 = r7.A0A     // Catch:{ all -> 0x0089 }
            java.lang.String r0 = r7.A0J     // Catch:{ all -> 0x0089 }
            boolean r0 = r1.A00(r0)     // Catch:{ all -> 0x0089 }
            if (r0 == 0) goto L_0x0029
            X.6OF r3 = r7.A0F     // Catch:{ all -> 0x0089 }
            java.lang.Integer r0 = r3.A00     // Catch:{ all -> 0x0089 }
            r2 = 3
            if (r0 == 0) goto L_0x002d
            int r0 = r0.intValue()     // Catch:{ all -> 0x0089 }
            if (r0 != r2) goto L_0x002d
        L_0x0029:
            r4.add(r5)     // Catch:{ all -> 0x0089 }
            goto L_0x003c
        L_0x002d:
            X.58e r1 = new X.58e     // Catch:{ all -> 0x0089 }
            r1.<init>()     // Catch:{ all -> 0x0089 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0089 }
            r1.A01 = r0     // Catch:{ all -> 0x0089 }
            X.AnonymousClass6OF.A00(r1, r3)     // Catch:{ all -> 0x0089 }
            goto L_0x0029
        L_0x003c:
            if (r6 == 0) goto L_0x004e
            r4.clear()     // Catch:{ all -> 0x004c }
            android.os.Handler r1 = r7.A04     // Catch:{ all -> 0x004c }
            java.lang.Runnable r0 = r7.A03     // Catch:{ all -> 0x004c }
            r1.removeCallbacks(r0)     // Catch:{ all -> 0x004c }
            r7.A01()     // Catch:{ all -> 0x004c }
            goto L_0x0087
        L_0x004c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0089 }
        L_0x004e:
            int r1 = r5.length()     // Catch:{ all -> 0x0089 }
            r0 = 2
            if (r1 < r0) goto L_0x0087
            android.os.Handler r3 = r7.A04     // Catch:{ all -> 0x0089 }
            java.lang.Runnable r2 = r7.A03     // Catch:{ all -> 0x0089 }
            r0 = 500(0x1f4, double:2.47E-321)
            r3.postDelayed(r2, r0)     // Catch:{ all -> 0x0089 }
            java.lang.Runnable r0 = r7.A03     // Catch:{ all -> 0x0089 }
            if (r0 == 0) goto L_0x0065
            r3.removeCallbacks(r0)     // Catch:{ all -> 0x0089 }
        L_0x0065:
            r0 = 26
            X.751 r2 = new X.751     // Catch:{ all -> 0x0089 }
            r2.<init>(r0, r5, r7)     // Catch:{ all -> 0x0089 }
            r7.A03 = r2     // Catch:{ all -> 0x0089 }
            r0 = 500(0x1f4, double:2.47E-321)
            r3.postDelayed(r2, r0)     // Catch:{ all -> 0x0089 }
            X.08S r3 = r7.A05     // Catch:{ all -> 0x0089 }
            r0 = 1
            X.5EQ[] r2 = new X.AnonymousClass5EQ[r0]     // Catch:{ all -> 0x0089 }
            X.5Dn r1 = new X.5Dn     // Catch:{ all -> 0x0089 }
            r1.<init>()     // Catch:{ all -> 0x0089 }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x0089 }
            java.util.ArrayList r0 = X.AnonymousClass6XV.newArrayList(r2)     // Catch:{ all -> 0x0089 }
            r3.A0C(r0)     // Catch:{ all -> 0x0089 }
        L_0x0087:
            monitor-exit(r4)     // Catch:{ all -> 0x0089 }
            return
        L_0x0089:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0089 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95384kj.A0S(java.lang.String):void");
    }

    public void BfU(C105205Dt r2) {
        if (r2 instanceof C1025450p) {
            A0S(((C1025450p) r2).A00);
        } else if (r2 instanceof C1025350o) {
            A01();
        }
    }

    private void A01() {
        int length;
        JSONArray optJSONArray;
        LinkedList A0l = C90524aI.A0l();
        C20810yC r5 = this.A0C.A04;
        if (r5.A0E(2948) || r5.A0E(2270) || !((optJSONArray = r5.A0A(4313).optJSONArray("featured_categories_modules")) == null || optJSONArray.length() == 0)) {
            ArrayList A0I2 = AnonymousClass001.A0I();
            if (r5.A0E(2948)) {
                A0I2.add(new AnonymousClass5EQ(55));
                A0I2.add(new C105045Dd());
            }
            JSONArray optJSONArray2 = r5.A0A(4313).optJSONArray("featured_categories_modules");
            if (optJSONArray2 != null && optJSONArray2.length() != 0) {
                int i = 0;
                while (true) {
                    JSONArray optJSONArray3 = r5.A0A(4313).optJSONArray("featured_categories_modules");
                    if (optJSONArray3 == null) {
                        length = 0;
                    } else {
                        length = optJSONArray3.length();
                    }
                    if (i >= length) {
                        break;
                    }
                    A0I2.add(new AnonymousClass5EQ(55));
                    A0I2.add(new C105045Dd());
                    i++;
                }
            }
            if (r5.A0E(2270)) {
                A0I2.add(new AnonymousClass5EQ(55));
                A0I2.add(new C105145Dn());
            }
            A02(this, A0I2);
            C1265264j r1 = this.A0B;
            C132406Tm A002 = this.A08.A00(741488182);
            r1.A00();
            C116245kH r2 = r1.A04;
            C1265464l r10 = r1.A06.A00;
            C165507tX r9 = new C165507tX(r1, 0);
            C18800tq r22 = r2.A00.A00;
            C19700wN A0V = C36391kE.A0V(r22);
            C19770wU A0Z = C36341k9.A0Z(r22);
            C18820ts A0T = C36341k9.A0T(r22);
            C19630wG A0W = C36351kA.A0W(r22);
            C18830tt r0 = r22.A00;
            AnonymousClass5DO r23 = new AnonymousClass5DO(A0V, C18830tt.A13(r0), A0W, C36411kG.A0c(r22), A0T, C36341k9.A0V(r22), r9, r10, A002, (AnonymousClass32W) r0.A1C.get(), A0Z);
            r23.A0B();
            r1.A03 = r23;
            return;
        }
        if (this.A0A.A00(this.A0J)) {
            AnonymousClass6OF r24 = this.A0F;
            C1040758e r12 = new C1040758e();
            r12.A01 = C36361kB.A0i();
            AnonymousClass6OF.A00(r12, r24);
        }
        A0l.add(new C105055De());
        A0l.add(new C105065Df());
        this.A05.A0C(A0l);
    }
}
