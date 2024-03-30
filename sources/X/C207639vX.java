package X;

import android.os.SystemClock;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.9vX  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C207639vX implements AnonymousClass08V {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass1O1 A01;
    public final /* synthetic */ C108515Tu A02;
    public final /* synthetic */ C1041758o A03;
    public final /* synthetic */ Collection A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;
    public final /* synthetic */ boolean A0E;
    public final /* synthetic */ boolean A0F;

    public /* synthetic */ C207639vX(AnonymousClass1O1 r2, C108515Tu r3, C1041758o r4, Collection collection, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = i;
        this.A04 = collection;
        this.A03 = r4;
        this.A0B = z;
        this.A0C = z2;
        this.A0D = z3;
        this.A0E = z4;
        this.A0F = z5;
        this.A05 = z6;
        this.A06 = z7;
        this.A07 = z8;
        this.A08 = z9;
        this.A09 = z10;
        this.A0A = z11;
    }

    public final Object apply(Object obj) {
        C131626Pu r3;
        int i;
        AnonymousClass6E1 A002;
        long j;
        AnonymousClass1O1 r13 = this.A01;
        C108515Tu r30 = this.A02;
        int i2 = this.A00;
        Collection collection = this.A04;
        C1041758o r12 = this.A03;
        boolean z = this.A0B;
        boolean z2 = this.A0C;
        boolean z3 = this.A0D;
        boolean z4 = this.A0E;
        boolean z5 = this.A0F;
        boolean z6 = this.A05;
        boolean z7 = this.A06;
        boolean z8 = this.A07;
        boolean z9 = this.A08;
        boolean z10 = this.A09;
        boolean z11 = this.A0A;
        String str = (String) obj;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            ArrayList A0I = AnonymousClass001.A0I();
            HashSet A16 = C36441kJ.A16();
            if (collection != null) {
                HashSet A0C2 = r13.A0C.A0C();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    AnonymousClass141 A0f = C36391kE.A0f(it);
                    AnonymousClass11F r2 = A0f.A0H;
                    if (!C202329lb.A04(r2)) {
                        if (r2 instanceof C223313w) {
                            A0C2.contains(r2);
                        }
                        AnonymousClass9jB r32 = new AnonymousClass9jB(A0f);
                        UserJid userJid = r32.A0P;
                        if (userJid != null) {
                            r32.A0C = z;
                            r32.A0L = z2;
                            r32.A0J = z3;
                            r32.A01 = C165607th.A06(A0f, r30);
                            r32.A0B = z4;
                            r32.A0E = z5;
                            r32.A0I = z6;
                            r32.A0F = z7;
                            r32.A0H = z8;
                            r32.A0N = z10;
                            r32.A0A = z9;
                            r32.A0M = z11;
                            if (z4) {
                                AnonymousClass9jB.A02(r13, r32, userJid, r13.A0K);
                            }
                            if (z5) {
                                C231417i r0 = r13.A0E;
                                r32.A08 = r0.A07(userJid);
                                r32.A03 = r0.A01(userJid);
                                AnonymousClass3QO A052 = r0.A05(userJid);
                                if (A052 != null) {
                                    j = A052.A02;
                                } else {
                                    j = 0;
                                }
                                r32.A02 = j;
                            }
                            if (z6) {
                                AnonymousClass9jB.A01(r13, r32, userJid);
                            }
                            if (z9) {
                                C19460v5 r1 = (C19460v5) r13.A0I.get();
                                if (!r1.A05() || (A002 = ((AnonymousClass6BB) r1.A02()).A00(userJid)) == null) {
                                    i = 0;
                                } else {
                                    i = A002.A00;
                                }
                                r32.A00 = i;
                                r32.A06 = C36431kI.A1A(userJid, r13.A0J);
                            }
                            AnonymousClass9jB.A04(r32, A0I);
                            A16.add(userJid);
                        } else {
                            StringBuilder A0u = AnonymousClass000.A0u();
                            A0u.append("sync/syncMultiProtocolsInternal/request invalid jid, contact=");
                            A0u.append(r32.A0Q);
                            C36321k7.A1P(" scope=", "multi_protocols", A0u);
                        }
                    }
                }
            }
            A0I.size();
            if (C165577te.A1Y(r12, A0I)) {
                r3 = C131626Pu.A08;
            } else {
                if (!AnonymousClass1O1.A04(r13, r12, str, C198869eK.A01(r30, AnonymousClass1O1.A01(r13), "sync_sid_multi_protocols", A0I, i2))) {
                    r3 = C131626Pu.A03;
                } else {
                    C192519Hh r02 = r13.A00;
                    C18740tg.A06(r02);
                    C27491Ok.A01(r02, r12);
                    AnonymousClass1OT r33 = r13.A07;
                    C18740tg.A06(r02);
                    r33.A01(r02.A00, r12, A0I, r13.A0L, r13.A0M, elapsedRealtime);
                    r3 = new C131626Pu(A16, 3);
                }
            }
            return r3;
        } finally {
            StringBuilder A0v = AnonymousClass000.A0v("sync/syncMultiProtocolsInternal/time/");
            A0v.append(SystemClock.elapsedRealtime() - elapsedRealtime);
            C36321k7.A1Q(" scope=", "multi_protocols", A0v);
        }
    }
}
