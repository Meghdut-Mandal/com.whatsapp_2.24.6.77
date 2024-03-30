package com.whatsapp.polls;

import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass04H;
import X.AnonymousClass07B;
import X.AnonymousClass11F;
import X.AnonymousClass155;
import X.AnonymousClass190;
import X.AnonymousClass1A1;
import X.AnonymousClass1RY;
import X.AnonymousClass2bS;
import X.AnonymousClass3T1;
import X.AnonymousClass3UJ;
import X.AnonymousClass7TJ;
import X.AnonymousClass7TK;
import X.AnonymousClass7d0;
import X.AnonymousClass7d1;
import X.C115305if;
import X.C115315ig;
import X.C115325ih;
import X.C115335ii;
import X.C115345ij;
import X.C131546Pm;
import X.C138516iE;
import X.C163037pY;
import X.C165187t1;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C18840tu;
import X.C20310xM;
import X.C27111My;
import X.C27731Pn;
import X.C28981Uw;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36431kI;
import X.C45462Rl;
import X.C64933Qa;
import X.C65493Sh;
import X.C90464aC;
import X.C95674m0;
import X.C95874mQ;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;

public final class PollResultsActivity extends AnonymousClass155 implements AnonymousClass7d0, AnonymousClass7d1 {
    public C115305if A00;
    public C115315ig A01;
    public C115325ih A02;
    public C115335ii A03;
    public C115345ij A04;
    public AnonymousClass1RY A05;
    public C27731Pn A06;
    public C20310xM A07;
    public AnonymousClass190 A08;
    public C65493Sh A09;
    public C95874mQ A0A;
    public PollResultsViewModel A0B;
    public AnonymousClass2bS A0C;
    public AnonymousClass1A1 A0D;
    public AnonymousClass005 A0E;
    public AnonymousClass005 A0F;
    public boolean A0G;

    public void onCreate(Bundle bundle) {
        Object obj;
        C131546Pm r1;
        AnonymousClass2bS r0;
        super.onCreate(bundle);
        setTitle(R.string.f12nameremoved);
        AnonymousClass07B A0Q = C36431kI.A0Q(this, C36361kB.A0O(this, R.layout.f9nameremoved));
        if (A0Q != null) {
            A0Q.A0U(true);
            A0Q.A0I(R.string.f12nameremoved);
            C64933Qa A022 = AnonymousClass3UJ.A02(getIntent());
            AnonymousClass1A1 r02 = this.A0D;
            if (r02 != null) {
                AnonymousClass3T1 A032 = r02.A03(A022);
                C18740tg.A06(A032);
                AnonymousClass00C.A08(A032);
                this.A0C = (AnonymousClass2bS) A032;
                C27731Pn r2 = this.A06;
                if (r2 != null) {
                    this.A05 = r2.A05(getBaseContext(), "poll-results-activity");
                    AnonymousClass2bS r03 = this.A0C;
                    if (r03 == null) {
                        throw C36331k8.A0d("fMessagePoll");
                    }
                    if (r03.A1J.A00 instanceof C28981Uw) {
                        AnonymousClass005 r04 = this.A0F;
                        if (r04 != null) {
                            obj = r04.get();
                            r1 = (C131546Pm) obj;
                            r0 = this.A0C;
                            if (r0 == null) {
                                throw C36331k8.A0d("fMessagePoll");
                            }
                        } else {
                            throw C36331k8.A0d("newsletterPollUseCase");
                        }
                    } else {
                        AnonymousClass005 r05 = this.A0E;
                        if (r05 != null) {
                            obj = r05.get();
                            r1 = (C131546Pm) obj;
                            r0 = this.A0C;
                            if (r0 == null) {
                                throw C36331k8.A0d("fMessagePoll");
                            }
                        } else {
                            throw C36331k8.A0d("localPollUseCase");
                        }
                    }
                    r1.A02 = r0;
                    AnonymousClass00C.A0B(obj);
                    C131546Pm r22 = (C131546Pm) obj;
                    C115305if r12 = this.A00;
                    if (r12 != null) {
                        AnonymousClass00C.A0D(r22, 2);
                        PollResultsViewModel pollResultsViewModel = (PollResultsViewModel) new AnonymousClass04H(new C138516iE(r12, r22), this).A00(PollResultsViewModel.class);
                        this.A06.A04(pollResultsViewModel);
                        this.A0B = pollResultsViewModel;
                        if (pollResultsViewModel != null) {
                            C165187t1.A01(this, pollResultsViewModel.A03.A06, new AnonymousClass7TJ(this), 35);
                        }
                        PollResultsViewModel pollResultsViewModel2 = this.A0B;
                        if (pollResultsViewModel2 != null) {
                            C165187t1.A01(this, pollResultsViewModel2.A05, new AnonymousClass7TK(this), 36);
                        }
                        PollResultsViewModel pollResultsViewModel3 = this.A0B;
                        if (pollResultsViewModel3 != null) {
                            pollResultsViewModel3.A02.registerObserver(pollResultsViewModel3.A01);
                        }
                        RecyclerView recyclerView = (RecyclerView) C36361kB.A0G(this.A00, R.id.poll_results_users_recycler_view);
                        C36321k7.A0Q(recyclerView);
                        PollResultsViewModel pollResultsViewModel4 = this.A0B;
                        if (pollResultsViewModel4 != null) {
                            C95674m0 r6 = new C95674m0();
                            AnonymousClass1RY r11 = this.A05;
                            if (r11 == null) {
                                throw C36331k8.A0d("contactPhotoLoader");
                            }
                            C115315ig r7 = this.A01;
                            if (r7 != null) {
                                C115325ih r8 = this.A02;
                                if (r8 != null) {
                                    C115335ii r9 = this.A03;
                                    if (r9 != null) {
                                        C115345ij r10 = this.A04;
                                        if (r10 != null) {
                                            C95874mQ r5 = new C95874mQ(r6, r7, r8, r9, r10, r11, this, this, pollResultsViewModel4);
                                            this.A0A = r5;
                                            recyclerView.setAdapter(r5);
                                        } else {
                                            throw C36331k8.A0d("pollResultsNonContactUserViewHolderFactory");
                                        }
                                    } else {
                                        throw C36331k8.A0d("pollResultsUserViewHolderFactory");
                                    }
                                } else {
                                    throw C36331k8.A0d("pollResultsQuestionViewHolderFactory");
                                }
                            } else {
                                throw C36331k8.A0d("pollResultsOptionViewHolderFactory");
                            }
                        }
                        C65493Sh r3 = this.A09;
                        if (r3 != null) {
                            AnonymousClass2bS r23 = this.A0C;
                            if (r23 == null) {
                                throw C36331k8.A0d("fMessagePoll");
                            }
                            C45462Rl r13 = new C45462Rl();
                            AnonymousClass11F r06 = r23.A1J.A00;
                            if (r06 != null) {
                                C65493Sh.A00(r13, r06, r3);
                            }
                            C65493Sh.A02(r13, r23);
                            r13.A04 = C36371kC.A0o();
                            C65493Sh.A01(r13, (AnonymousClass11F) null, r23);
                            r3.A00.Bly(r13);
                            PollResultsViewModel pollResultsViewModel5 = this.A0B;
                            if (pollResultsViewModel5 != null) {
                                AnonymousClass2bS r07 = this.A0C;
                                if (r07 == null) {
                                    throw C36331k8.A0d("fMessagePoll");
                                }
                                pollResultsViewModel5.A0S(r07);
                                return;
                            }
                            return;
                        }
                        throw C36331k8.A0d("pollEventStatLogger");
                    }
                    throw C36331k8.A0d("pollResultsViewModelFactory");
                }
                throw C36331k8.A0d("contactPhotos");
            }
            throw C36331k8.A0d("fMessageDatabase");
        }
        throw C36381kD.A0k();
    }

    public void A2F() {
        if (!this.A0G) {
            this.A0G = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r1 = A0L.A5g;
            C90464aC.A11(r1, this);
            C18830tt r2 = r1.A00;
            C90464aC.A0y(r1, r2, this, C36321k7.A05(r1, r2, this));
            this.A00 = (C115305if) A0L.A1i.get();
            this.A01 = (C115315ig) A0L.A1j.get();
            this.A02 = (C115325ih) A0L.A1l.get();
            this.A03 = (C115335ii) A0L.A1m.get();
            this.A04 = (C115345ij) A0L.A1n.get();
            this.A0E = C18840tu.A00(A0L.A2w);
            this.A0F = C18840tu.A00(A0L.A3A);
            this.A06 = C36351kA.A0T(r1);
            this.A07 = C36371kC.A0Z(r1);
            this.A0D = C36351kA.A0n(r1);
            this.A09 = (C65493Sh) r2.A3I.get();
            this.A08 = C36351kA.A0h(r1);
        }
    }

    public void onBackPressed() {
        PollResultsViewModel pollResultsViewModel = this.A0B;
        if (pollResultsViewModel != null) {
            C131546Pm r5 = pollResultsViewModel.A03;
            long j = r5.A01;
            if (j != -1) {
                if (j != -1) {
                    r5.A01 = -1;
                    r5.A02();
                    return;
                }
                return;
            }
        }
        super.onBackPressed();
    }

    public PollResultsActivity(int i) {
        this.A0G = false;
        C163037pY.A00(this, 0);
    }

    public PollResultsActivity() {
        this(0);
    }
}
