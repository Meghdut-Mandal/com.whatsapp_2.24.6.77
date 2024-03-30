package X;

import android.database.Cursor;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2iL  reason: invalid class name and case insensitive filesystem */
public class C48962iL extends C132446Tt {
    public final /* synthetic */ AnonymousClass1XX A00;

    public C48962iL(AnonymousClass1XX r1) {
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Cursor A09;
        AnonymousClass1XX r4 = this.A00;
        ArrayList A02 = r4.A08.A02();
        C26171Jd r12 = r4.A09;
        ArrayList A0I = AnonymousClass001.A0I();
        long A002 = C19970wo.A00(r12.A04) - 86400000;
        Iterator it = new C82293yT().keySet().iterator();
        while (it.hasNext()) {
            int A0A = C36341k9.A0A(it);
            AnonymousClass1M0 A04 = r12.A0C.get();
            try {
                C20170x8 r10 = r12.A0I;
                C224114e r7 = A04.A02;
                String str = AnonymousClass3TN.A01;
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append(AnonymousClass3TN.A00(A0A));
                String A0q = AnonymousClass000.A0q(" WHERE message_add_on.from_me = 1  AND message_add_on.status < 4 AND message_add_on.timestamp > ? AND message_add_on.message_add_on_type = ?", A0u);
                String[] A1S = C36441kJ.A1S();
                C36341k9.A1W(A1S, A002);
                A1S[1] = String.valueOf(A0A);
                A09 = r7.A09(A0q, "MessageAddOnStore/getUnsentMessageAddOnCursor", A1S);
                HashMap A01 = C65733Tg.A01(A09, A0A);
                while (A09.moveToNext()) {
                    AnonymousClass2bM A05 = r10.A05(A09, A01);
                    if (A05 == null) {
                        Log.e("MessageAddOnManager/getMessageAddOnForParentMessage unexpected fmessage");
                    } else {
                        A05.A1c(A09, r12.A09, A01);
                        AnonymousClass3T1 A0R = C36421kH.A0R(r12.A0J, A05.A01);
                        if (A0R == null) {
                            Log.w("MessageAddOnManager/fillInMessageAddOnReactionForNotification parent message missing");
                        } else {
                            if (A05 instanceof C180858mX) {
                                if (!(A0R instanceof AnonymousClass2bS)) {
                                    Log.w("MessageAddOnManager/fillInMessageAddOn parent message not a poll for a poll vote");
                                } else {
                                    C180858mX r14 = (C180858mX) A05;
                                    ArrayList A003 = r12.A0G.A07.A00(r14.A1N);
                                    List list = r14.A06;
                                    list.clear();
                                    list.addAll(A003);
                                    C26261Jm.A01((AnonymousClass2bS) A0R, r14);
                                }
                            }
                            A05.A04 = new C195759Vv(A0R.A0J(), A0R.A1J);
                            A05.A03 = C183338qd.A01(A0R);
                            A0I.add(A05);
                        }
                    }
                }
                A09.close();
                A04.close();
            } catch (Throwable th) {
                try {
                    A04.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        A02.addAll(A0I);
        if (A02.isEmpty()) {
            return null;
        }
        int A03 = r4.A03.A03(true);
        HashMap A0J = AnonymousClass001.A0J();
        Iterator it2 = A02.iterator();
        while (it2.hasNext()) {
            AnonymousClass3T1 A0l = C36391kE.A0l(it2);
            if (r4.A01(A0l)) {
                if (A0l.A1S == 0) {
                    A0l.A1S = SystemClock.uptimeMillis();
                }
                if (!(A0l instanceof AnonymousClass2bM)) {
                    A0l.A1f = r4.A06.A0k.A01(A0l);
                }
                if (A0l.A1I == 16) {
                    AnonymousClass2bL r9 = (AnonymousClass2bL) A0l;
                    if (r9.A02 == 2) {
                        ((C20280xJ) r4.A0C.get()).A03(A0l, true);
                    } else {
                        AnonymousClass1X4 r5 = r4.A02;
                        r5.A02.A0H(new C35621iz(r5, r9, 26));
                    }
                } else if (A0l instanceof AnonymousClass2bU) {
                    AnonymousClass2bU r2 = (AnonymousClass2bU) A0l;
                    C65013Qj r92 = r2.A01;
                    boolean A1h = r2.A1h();
                    int i = r2.A0D;
                    if (A1h && (r92 == null || r92.A0I == null)) {
                        AnonymousClass1XX.A00(r4, r2, (Runnable) null);
                    } else if (AnonymousClass3TJ.A00(i, 2) >= 0) {
                        AnonymousClass1XX.A00(r4, A0l, new C35391ic(r4, r2, A0l, r92, A03, 0));
                    } else if (A03 == 1 || A03 == 2 || (r2 instanceof C46882bp) || ((r2 instanceof C46812bi) && r2.A09 == 1)) {
                        String str2 = r2.A08;
                        if (str2 == null) {
                            r4.A01.A06(r2, false, false);
                        } else {
                            AbstractCollection abstractCollection = (AbstractCollection) A0J.get(str2);
                            if (abstractCollection == null) {
                                abstractCollection = AnonymousClass001.A0I();
                                A0J.put(r2.A08, abstractCollection);
                            }
                            abstractCollection.add(r2);
                        }
                    }
                } else {
                    AnonymousClass1XX.A00(r4, A0l, (Runnable) null);
                }
            }
        }
        Iterator A10 = C36391kE.A10(A0J);
        while (A10.hasNext()) {
            r4.A01.A07(new AnonymousClass3SC((ArrayList) A10.next()), false, false);
        }
        return null;
        throw th;
    }
}
