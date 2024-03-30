package X;

import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.13O  reason: invalid class name */
public abstract class AnonymousClass13O {
    public final C001700s A00 = new C001700s(0);
    public final AnonymousClass12P A01;
    public final AnonymousClass13R A02;
    public final C19700wN A03;
    public final C220412q A04;
    public final AnonymousClass13S A05;

    public void A00() {
        AnonymousClass13Q r2 = (AnonymousClass13Q) this;
        AnonymousClass005 r1 = r2.A00;
        if (r1.get() != null) {
            ((C20280xJ) r1.get()).A04(false);
        }
        AnonymousClass12P r0 = r2.A01;
        r0.A06();
        r0.A04.lock();
    }

    public void A01() {
        AnonymousClass13Q r1 = (AnonymousClass13Q) this;
        AnonymousClass12P r0 = r1.A01;
        r0.A06();
        r0.A04.unlock();
        AnonymousClass005 r12 = r1.A00;
        if (r12.get() != null) {
            ((C20280xJ) r12.get()).A04(true);
        }
    }

    public void A03(boolean z) {
        AnonymousClass12P r0 = this.A01;
        r0.A06();
        if (r0.A08) {
            HashSet hashSet = new HashSet();
            C225614x it = this.A02.A00().values().iterator();
            while (it.hasNext()) {
                C227415p r1 = (C227415p) it.next();
                if (A04(r1)) {
                    hashSet.add(r1.A05);
                }
            }
            if (!hashSet.isEmpty()) {
                AnonymousClass13S r4 = this.A05;
                if (!r4.A08.get()) {
                    synchronized (this) {
                        C001700s r2 = this.A00;
                        Integer num = (Integer) r2.A04();
                        if (num == null || num.intValue() == 0) {
                            r2.A0C(1);
                            A00();
                            try {
                                C220412q.A00(this.A04);
                                StringBuilder sb = new StringBuilder();
                                sb.append("BaseForceMigrationManager/processMigrations, running forced migrations. blocking = ");
                                sb.append(z);
                                Log.i(sb.toString());
                                r4.A03(new C1256360r(new C33281f2[0]), hashSet, 7);
                            } finally {
                                A02(hashSet, z);
                                A01();
                            }
                        }
                    }
                }
            }
        }
    }

    public AnonymousClass13O(C19700wN r3, C220412q r4, AnonymousClass12P r5, AnonymousClass13S r6, AnonymousClass13R r7) {
        this.A03 = r3;
        this.A04 = r4;
        this.A02 = r7;
        this.A01 = r5;
        this.A05 = r6;
    }

    public void A02(Set set, boolean z) {
        StringBuilder sb;
        C001700s r1;
        int i;
        Iterator it = set.iterator();
        boolean z2 = true;
        boolean z3 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            C227415p r2 = (C227415p) this.A02.A00().get(str);
            if (r2 != null && !r2.A0A()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("BaseForceMigrationManager/afterForcedMigration, failed to migrate ");
                sb2.append(str);
                sb2.append(", blocking = ");
                sb2.append(z);
                Log.e(sb2.toString());
                if (z3 || r2.A08()) {
                    z2 = false;
                } else {
                    z2 = false;
                    z3 = true;
                }
            }
        }
        if (z2) {
            sb.append("BaseForceMigrationManager/afterForcedMigration, successfully migrated all forced migration, blocking = ");
            sb.append(z);
            Log.i(sb.toString());
            r1 = this.A00;
            i = 5;
        } else {
            sb = new StringBuilder();
            sb.append("BaseForceMigrationManager/afterForcedMigration, failed to migrate all forced migration. blocking = ");
            sb.append(z);
            Log.i(sb.toString());
            this.A03.A0E("ForcedDatabaseMigrationManager/failedToMigrate", "failedToMigrate", true);
            r1 = this.A00;
            if (!z) {
                i = 2;
            } else {
                i = 4;
                if (z3) {
                    i = 3;
                }
            }
        }
        r1.A0C(Integer.valueOf(i));
    }

    public boolean A04(C227415p r3) {
        if (r3.A0B()) {
            r3.A06();
            if (r3.A0A()) {
                return false;
            }
            return true;
        }
        return false;
    }
}
