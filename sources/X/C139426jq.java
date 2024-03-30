package X;

import android.util.Pair;
import com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6jq  reason: invalid class name and case insensitive filesystem */
public class C139426jq implements AnonymousClass7eX {
    public final /* synthetic */ AnonymousClass753 A00;
    public final /* synthetic */ List A01;

    public C139426jq(AnonymousClass753 r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public void BTz(X.AnonymousClass60A r10, java.lang.Exception r11) {
        /*
            r9 = this;
            X.753 r1 = r9.A00
            java.lang.Object r0 = r1.A02
            X.64V r0 = (X.AnonymousClass64V) r0
            r0.A00(r10, r11)
            if (r10 == 0) goto L_0x00bc
            java.lang.Object r3 = r1.A00
            X.5vn r3 = (X.C123015vn) r3
            java.util.List r0 = r9.A01
            java.util.LinkedList r8 = X.C90524aI.A0l()
            java.util.Iterator r2 = r0.iterator()
        L_0x0019:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x003d
            java.lang.Object r0 = r2.next()
            com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest r0 = (com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest) r0
            com.facebook.cameracore.ardelivery.model.VersionedCapability r1 = r0.mCapability
            java.util.Map r0 = r10.A00
            java.lang.Object r0 = r0.get(r1)
            com.facebook.cameracore.ardelivery.model.ModelPathsHolder r0 = (com.facebook.cameracore.ardelivery.model.ModelPathsHolder) r0
            if (r0 == 0) goto L_0x003b
            int r0 = r0.mVersion
        L_0x0033:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.C36361kB.A1O(r1, r0, r8)
            goto L_0x0019
        L_0x003b:
            r0 = 0
            goto L_0x0033
        L_0x003d:
            X.60d r7 = r3.A01
            X.0sD r5 = r7.A00
            X.AnonymousClass00C.A07(r5)
            r4 = 0
            r1 = 20
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x008e, all -> 0x005e }
            r5.get(r1, r0)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x008e, all -> 0x005e }
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.util.Iterator r1 = r8.iterator()
        L_0x0054:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00a0
            A00(r7, r5, r1)
            goto L_0x0054
        L_0x005e:
            r6 = move-exception
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.util.Iterator r1 = r8.iterator()
        L_0x0067:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0071
            A00(r7, r5, r1)
            goto L_0x0067
        L_0x0071:
            X.63r r1 = new X.63r
            r1.<init>()
            r0 = 1
            r1.A04 = r0
            X.6SG r2 = r1.A00()
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x008d
            X.6Sr r1 = r3.A00
            X.6jp r0 = new X.6jp
            r0.<init>(r3)
            r1.A02(r4, r0, r2, r5)
        L_0x008d:
            throw r6
        L_0x008e:
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.util.Iterator r1 = r8.iterator()
        L_0x0096:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00a0
            A00(r7, r5, r1)
            goto L_0x0096
        L_0x00a0:
            X.63r r1 = new X.63r
            r1.<init>()
            r0 = 1
            r1.A04 = r0
            X.6SG r2 = r1.A00()
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x00bc
            X.6Sr r1 = r3.A00
            X.6jp r0 = new X.6jp
            r0.<init>(r3)
            r1.A02(r4, r0, r2, r5)
        L_0x00bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139426jq.BTz(X.60A, java.lang.Exception):void");
    }

    public static void A00(C1255060d r5, AbstractCollection abstractCollection, Iterator it) {
        Pair pair = (Pair) it.next();
        VersionedCapability versionedCapability = (VersionedCapability) pair.first;
        Object obj = pair.second;
        Integer valueOf = Integer.valueOf(r5.A00(versionedCapability));
        if (!valueOf.equals(obj)) {
            int intValue = valueOf.intValue();
            abstractCollection.add(new ARModelMetadataRequest(versionedCapability, intValue, intValue, false));
        }
    }
}
