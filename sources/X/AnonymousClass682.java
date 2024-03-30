package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.682  reason: invalid class name */
public class AnonymousClass682 {
    public double A00;
    public int A01;
    public AnonymousClass5VK A02;
    public boolean A03;
    public final int A04;
    public final C125235zX A05;
    public final C159007ic A06;
    public final AnonymousClass6SG A07;
    public final Map A08 = AnonymousClass001.A0J();
    public final Map A09 = AnonymousClass001.A0J();
    public final AnonymousClass5YD A0A;

    public synchronized boolean A00() {
        return this.A07.A02;
    }

    public synchronized String toString() {
        StringBuilder A0u;
        A0u = AnonymousClass000.A0u();
        A0u.append("ExternalLoadRequest{, operationId='");
        A0u.append(this.A07.A01);
        A0u.append('\'');
        A0u.append(", mAssetIdToResultMap=");
        A0u.append(this.A09);
        A0u.append(", mOverallProgress=");
        A0u.append(this.A00);
        A0u.append(", isPrefetch=");
        A0u.append(A00());
        A0u.append(", mFirstException=");
        A0u.append(this.A02);
        A0u.append(", mFinished=");
        A0u.append(this.A03);
        A0u.append(", mAssetLoadsCompleted=");
        A0u.append(this.A01);
        return AnonymousClass000.A0s(A0u);
    }

    public AnonymousClass682(C125235zX r5, C159007ic r6, AnonymousClass5YD r7, AnonymousClass6SG r8, List list) {
        this.A06 = r6;
        this.A05 = r5;
        this.A0A = r7;
        this.A07 = r8;
        this.A04 = list.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((C135056c3) it.next()).A01.A0A;
            if (!this.A09.containsKey(str)) {
                this.A09.put(str, (Object) null);
            } else {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Id already present: ");
                throw AnonymousClass000.A0c(str, A0u);
            }
        }
    }
}
