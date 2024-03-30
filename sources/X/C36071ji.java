package X;

import com.whatsapp.HomeActivity;
import com.whatsapp.conversationslist.ConversationsFragment;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1ji  reason: invalid class name and case insensitive filesystem */
public class C36071ji implements C24521Ct {
    public Object A00;
    public final int A01;

    public C36071ji(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BUg(AnonymousClass11F r4) {
        switch (this.A01) {
            case 0:
                ((AnonymousClass15J) this.A00).A3q();
                return;
            case 1:
                ((C34471h6) this.A00).A00.A0L(r4);
                return;
            case 2:
                ((ConversationsFragment) this.A00).A0d.A0H(new C35681j5(this, r4, 17));
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void BUh(AnonymousClass11F r4, boolean z) {
        if (2 - this.A01 == 0) {
            ((ConversationsFragment) this.A00).A0d.A0H(new C35291iS(this, r4, 4, z));
        }
    }

    public /* synthetic */ void BUm(int i) {
        if (2 - this.A01 == 0) {
            ((ConversationsFragment) this.A00).A0d.Bp3(new C35201iJ(this, i, 3));
        }
    }

    public void BUn() {
        AnonymousClass17Y r4;
        Runnable runnable;
        int i;
        switch (this.A01) {
            case 0:
                HomeActivity homeActivity = (HomeActivity) this.A00;
                homeActivity.A3q();
                if (C20800yB.A01(C21000yV.A02, homeActivity.A0D, 1266) && ((AnonymousClass1A6) homeActivity.A1S.get()).A02() == 0) {
                    r4 = homeActivity.A05;
                    runnable = new C35641j1(homeActivity, 36);
                    break;
                } else {
                    return;
                }
                break;
            case 1:
                C34421h1 r1 = ((C34471h6) this.A00).A00;
                r4 = r1.A01;
                runnable = new C35671j4(r1, 21);
                break;
            case 2:
                ConversationsFragment conversationsFragment = (ConversationsFragment) this.A00;
                if (conversationsFragment.A0f.A0L()) {
                    long j = C19980wp.A00(conversationsFragment.A1c).getLong("critical_bootstrap_completed_timestamp", -1);
                    if (j != -1) {
                        long currentTimeMillis = System.currentTimeMillis() - j;
                        if (currentTimeMillis >= 0 && currentTimeMillis <= 120000 && conversationsFragment.A3i.getAndSet(true)) {
                            AtomicBoolean atomicBoolean = conversationsFragment.A3j;
                            if (!atomicBoolean.get()) {
                                atomicBoolean.set(conversationsFragment.A3S.postDelayed(new C35691j6(this, 19), 1500));
                                return;
                            }
                            return;
                        }
                    }
                    r4 = conversationsFragment.A0d;
                    i = 20;
                } else {
                    conversationsFragment.A0d.A0H(new C35691j6(conversationsFragment, 20));
                    if (ConversationsFragment.A0Y(conversationsFragment)) {
                        r4 = conversationsFragment.A0d;
                        i = 21;
                    } else {
                        return;
                    }
                }
                runnable = new C35691j6(conversationsFragment, i);
                break;
            default:
                ((C24481Cp) this.A00).A0A();
                return;
        }
        r4.A0H(runnable);
    }

    public /* synthetic */ void BUf(AnonymousClass11F r1) {
    }

    public /* synthetic */ void BUi(AnonymousClass11F r1) {
    }

    public /* synthetic */ void BUj(AnonymousClass11F r1) {
    }
}
