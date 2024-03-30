package X;

import android.content.Context;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.whispersystems.jobqueue.Job;

/* renamed from: X.Aun  reason: case insensitive filesystem */
public final class C22729Aun extends Job implements AnonymousClass7i8 {
    public static final long serialVersionUID = 1;
    public transient C19700wN A00;
    public transient AnonymousClass164 A01;
    public transient C20360xR A02;
    public transient C20350xQ A03;
    public transient C201159iy A04;
    public transient C191779Eh A05;
    public transient C194579Qh A06;
    public final List groupsToFetch;
    public final Integer maxNumberOfRounds;
    public final int params;
    public final int round;
    public final Set successfullyProcessedGroups;

    public void A09() {
    }

    public boolean A0D(Exception exc) {
        AnonymousClass00C.A0D(exc, 0);
        if ((exc instanceof C1890791z) || (exc.getCause() instanceof C1890791z)) {
            return true;
        }
        return false;
    }

    public void Bqf(Context context) {
        AnonymousClass00C.A0D(context, 0);
        Context applicationContext = context.getApplicationContext();
        AnonymousClass00C.A08(applicationContext);
        C18800tq A0P = C36371kC.A0P(applicationContext);
        C19700wN B3m = A0P.B3m();
        AnonymousClass00C.A0D(B3m, 0);
        this.A00 = B3m;
        Object obj = C18840tu.A00(A0P.A99).get();
        AnonymousClass00C.A08(obj);
        AnonymousClass164 r0 = (AnonymousClass164) obj;
        AnonymousClass00C.A0D(r0, 0);
        this.A01 = r0;
        C20350xQ r02 = (C20350xQ) A0P.A6s.get();
        AnonymousClass00C.A0D(r02, 0);
        this.A03 = r02;
        C201159iy r03 = (C201159iy) A0P.A3o.get();
        AnonymousClass00C.A0D(r03, 0);
        this.A04 = r03;
        C20360xR AzW = A0P.AzW();
        AnonymousClass00C.A0D(AzW, 0);
        this.A02 = AzW;
        C194579Qh r04 = (C194579Qh) A0P.AfI.A00.A0K.get();
        AnonymousClass00C.A0D(r04, 0);
        this.A06 = r04;
        C191779Eh r05 = (C191779Eh) A0P.A3p.get();
        AnonymousClass00C.A0D(r05, 0);
        this.A05 = r05;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C22729Aun(java.lang.Integer r3, java.util.List r4, java.util.Set r5, int r6, int r7) {
        /*
            r2 = this;
            X.673 r1 = new X.673
            r1.<init>()
            java.lang.String r0 = "fetch_truncated_groups_job"
            r1.A00 = r0
            X.AnonymousClass673.A00(r1)
            org.whispersystems.jobqueue.JobParameters r0 = r1.A01()
            r2.<init>(r0)
            r2.round = r6
            r2.maxNumberOfRounds = r3
            r2.params = r7
            r2.groupsToFetch = r4
            r2.successfullyProcessedGroups = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22729Aun.<init>(java.lang.Integer, java.util.List, java.util.Set, int, int):void");
    }

    public void A0A() {
        Log.w("GroupInfoBatchProcessor/FetchTruncatedGroupJob canceled");
    }

    public void A0B() {
        int i;
        C191779Eh r6 = this.A05;
        if (r6 != null) {
            int freeMemory = (int) ((((double) Runtime.getRuntime().freeMemory()) * 0.15d) / ((double) 60));
            if (freeMemory < 10000) {
                freeMemory = SearchActionVerificationClientService.NOTIFICATION_ID;
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("GroupInfoBatchProcessor/processGroupInfo/getMaxParticipantsInGroupQueries - \n              | Client can handle ");
            A0u.append(freeMemory);
            AnonymousClass098.A05(AnonymousClass091.A02(AnonymousClass000.A0q(" per round as per memory \n              | constraints", A0u)), "\n", "", false);
            int A07 = r6.A00.A07(6267);
            if (A07 > freeMemory) {
                A07 = freeMemory;
            }
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("GroupInfoBatchProcessor/processGroupInfo/getMaxParticipantsInGroupQueriesCode - \n              | Processing ");
            A0u2.append(A07);
            AnonymousClass098.A05(AnonymousClass091.A02(AnonymousClass000.A0q(" participants\n              | as per device constraints and server limits", A0u2)), "\n", "", false);
            List<AnonymousClass011> list = this.groupsToFetch;
            ArrayList A0I = AnonymousClass001.A0I();
            ArrayList A0I2 = AnonymousClass001.A0I();
            loop0:
            while (true) {
                int i2 = 0;
                for (AnonymousClass011 r2 : list) {
                    int A08 = C90474aD.A08(r2);
                    if (i2 == 0 || i2 + A08 <= A07) {
                        A0I2.add(r2);
                        i2 += A08;
                    } else {
                        A0I.add(A0I2);
                        A0I2 = AnonymousClass03T.A03(r2);
                    }
                }
                break loop0;
            }
            if (C36411kG.A1a(A0I2)) {
                A0I.add(A0I2);
            }
            List<AnonymousClass011> list2 = (List) C007103b.A0L(C007103b.A0Y(A0I));
            StringBuilder A0u3 = AnonymousClass000.A0u();
            A0u3.append("GroupInfoBatchProcessor/FetchTruncatedGroupsJob/fetching additional\n          | group info; round=");
            A00(C36381kD.A10(A0u3, this.round));
            AnonymousClass777 r5 = new AnonymousClass777();
            C194579Qh r4 = this.A06;
            if (r4 != null) {
                ArrayList A0z = C36351kA.A0z(list2);
                for (AnonymousClass011 r1 : list2) {
                    C65533Sl r0 = AnonymousClass147.A01;
                    A0z.add(C65533Sl.A04((String) r1.first));
                }
                r4.A00("get_participating_groups_paginated", A0z, new C22475AnE(this, r5));
                AnonymousClass9W8 r3 = (AnonymousClass9W8) r5.get();
                Set set = r3.A01;
                ArrayList A0z2 = C36351kA.A0z(set);
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    C90464aC.A1U(A0z2, it);
                }
                HashSet A0U = C007103b.A0U(A0z2);
                Set<AnonymousClass011> set2 = r3.A00;
                ArrayList A0z3 = C36351kA.A0z(set2);
                for (AnonymousClass011 r02 : set2) {
                    A0z3.add(((Jid) r02.first).getRawString());
                }
                LinkedHashSet A042 = C13640kC.A04(C007103b.A0U(A0z3), A0U);
                List list3 = this.groupsToFetch;
                ArrayList A0I3 = AnonymousClass001.A0I();
                for (Object next : list3) {
                    if (!A042.contains(((AnonymousClass011) next).first)) {
                        A0I3.add(next);
                    }
                }
                Integer num = this.maxNumberOfRounds;
                if (num != null) {
                    i = num.intValue();
                } else {
                    List<AnonymousClass011> list4 = this.groupsToFetch;
                    if (this.A05 != null) {
                        int i3 = 0;
                        for (AnonymousClass011 A082 : list4) {
                            i3 += C90474aD.A08(A082);
                        }
                        i = ((int) (((double) ((i3 / SearchActionVerificationClientService.NOTIFICATION_ID) + 1)) * 1.15d)) + 1;
                    } else {
                        throw C36331k8.A0d("groupInfoPipelineStrategyController");
                    }
                }
                LinkedHashSet A043 = C13640kC.A04(A0U, this.successfullyProcessedGroups);
                if (!(!A0I3.isEmpty()) || this.round >= i) {
                    C20360xR r12 = this.A02;
                    if (r12 != null) {
                        r12.A01 = false;
                        if (C36411kG.A1a(A0I3)) {
                            C19700wN r32 = this.A00;
                            if (r32 != null) {
                                StringBuilder A0u4 = AnonymousClass000.A0u();
                                A0u4.append("GroupInfoBatchProcessor/FetchTruncatedGroupsJob/Aborted after ");
                                A0u4.append(this.round);
                                String A0q = AnonymousClass000.A0q(" rounds", A0u4);
                                StringBuilder A0u5 = AnonymousClass000.A0u();
                                A0u5.append(A0I3.size());
                                r32.A0E(A0q, AnonymousClass000.A0q(" unprocessed groups.", A0u5), true);
                            } else {
                                throw C36331k8.A0d("crashLogs");
                            }
                        }
                        C20350xQ r52 = this.A03;
                        if (r52 != null) {
                            int i4 = this.params;
                            ArrayList A0z4 = C36351kA.A0z(A043);
                            Iterator it2 = A043.iterator();
                            while (it2.hasNext()) {
                                String A0C = AnonymousClass001.A0C(it2);
                                C65533Sl r03 = AnonymousClass147.A01;
                                A0z4.add(C65533Sl.A04(A0C));
                            }
                            r52.A0m(C007103b.A0f(A0z4), i4);
                            StringBuilder A0u6 = AnonymousClass000.A0u();
                            C36341k9.A1N("GroupInfoBatchProcessor/FetchTruncatedGroupsJob/Sync batch group processing done.\n              | Processed ", A0u6, A043);
                            A00(AnonymousClass000.A0q("\n              | groups in total.", A0u6));
                            return;
                        }
                        throw C36331k8.A0d("groupChatManager");
                    }
                    throw C36331k8.A0d("groupSyncStateBridge");
                }
                StringBuilder A0u7 = AnonymousClass000.A0u();
                C36341k9.A1N("GroupInfoBatchProcessor/FetchTruncatedGroupsJob/Scheduling new batch for processing.\n              | Processed ", A0u7, A042);
                C36341k9.A1N(" groups. ", A0u7, A0I3);
                A00(AnonymousClass000.A0q(" to go.", A0u7));
                C22729Aun aun = new C22729Aun(Integer.valueOf(i), A0I3, A043, this.round + 1, this.params);
                AnonymousClass164 r04 = this.A01;
                if (r04 != null) {
                    r04.A01(aun);
                    return;
                }
                throw C36331k8.A0d("waJobManager");
            }
            throw C36331k8.A0d("batchGetGroupInfoProtocolHelper");
        }
        throw C36331k8.A0d("groupInfoPipelineStrategyController");
    }

    public static final String A00(String str) {
        return AnonymousClass098.A05(AnonymousClass091.A02(str), "\n", "", false);
    }
}
