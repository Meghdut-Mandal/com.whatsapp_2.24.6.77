package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import java.util.Collections;
import java.util.List;

/* renamed from: X.6VR  reason: invalid class name */
public class AnonymousClass6VR {
    public static AnonymousClass6VR A0A;
    public static AnonymousClass6VR A0B;
    public static final Object A0C = C36441kJ.A11();
    public BroadcastReceiver.PendingResult A00;
    public Context A01;
    public C18850tv A02;
    public C138836im A03;
    public WorkDatabase A04;
    public C114485hK A05;
    public AnonymousClass7eB A06;
    public List A07;
    public boolean A08;
    public final AnonymousClass9L0 A09;

    public static AnonymousClass61V[] A01(AnonymousClass65I r1, Object obj, AnonymousClass61V[] r3, int i) {
        r3[0] = obj;
        r1.A00(r3);
        return new AnonymousClass61V[i];
    }

    public void A0B(String str) {
        this.A06.B74(new C97474pk(this, str, true));
    }

    static {
        AnonymousClass6VD.A01("WorkManagerImpl");
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [boolean, int] */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x020a, code lost:
        r3.set(r5);
        r4.A02.put(r6, r7.get(r5));
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass6VR(android.content.Context r36, X.C18850tv r37, X.AnonymousClass7eB r38) {
        /*
            r35 = this;
            r30 = r36
            android.content.res.Resources r1 = r30.getResources()
            r0 = 2131034128(0x7f050010, float:1.7678765E38)
            boolean r1 = r1.getBoolean(r0)
            android.content.Context r5 = r30.getApplicationContext()
            r14 = r38
            r0 = r14
            X.6iy r0 = (X.C138956iy) r0
            X.772 r2 = r0.A01
            r13 = 0
            boolean r12 = X.C36341k9.A1a(r5, r2)
            java.lang.Class<androidx.work.impl.WorkDatabase> r11 = androidx.work.impl.WorkDatabase.class
            if (r1 == 0) goto L_0x00d8
            r1 = 0
            X.65I r0 = new X.65I
            r0.<init>(r5, r1)
            r0.A07 = r12
        L_0x0029:
            r0.A04 = r2
            X.6Hz r1 = X.C129666Hz.A00
            X.AnonymousClass00C.A0D(r1, r13)
            java.util.List r10 = r0.A0C
            r10.add(r1)
            X.61V[] r2 = new X.AnonymousClass61V[r12]
            X.4od r1 = X.C97204od.A00
            X.61V[] r4 = A01(r0, r1, r2, r12)
            r3 = 2
            r2 = 3
            X.4oY r1 = new X.4oY
            r1.<init>(r5, r3, r2)
            X.61V[] r2 = A01(r0, r1, r4, r12)
            X.4oe r1 = X.C97214oe.A00
            X.61V[] r2 = A01(r0, r1, r2, r12)
            X.4of r1 = X.C97224of.A00
            X.61V[] r4 = A01(r0, r1, r2, r12)
            r3 = 5
            r2 = 6
            X.4oY r1 = new X.4oY
            r1.<init>(r5, r3, r2)
            X.61V[] r2 = A01(r0, r1, r4, r12)
            X.4og r1 = X.C97234og.A00
            X.61V[] r2 = A01(r0, r1, r2, r12)
            X.4oh r1 = X.C97244oh.A00
            X.61V[] r2 = A01(r0, r1, r2, r12)
            X.4oi r1 = X.C97254oi.A00
            X.61V[] r2 = A01(r0, r1, r2, r12)
            X.4oZ r1 = new X.4oZ
            r1.<init>(r5)
            X.61V[] r4 = A01(r0, r1, r2, r12)
            r3 = 10
            r2 = 11
            X.4oY r1 = new X.4oY
            r1.<init>(r5, r3, r2)
            X.61V[] r2 = A01(r0, r1, r4, r12)
            X.4oa r1 = X.C97174oa.A00
            X.61V[] r2 = A01(r0, r1, r2, r12)
            X.4ob r1 = X.C97184ob.A00
            X.61V[] r2 = A01(r0, r1, r2, r12)
            X.4oc r1 = X.C97194oc.A00
            r2[r13] = r1
            r0.A00(r2)
            r0.A08 = r13
            r0.A06 = r12
            java.util.concurrent.Executor r2 = r0.A04
            java.util.concurrent.Executor r1 = r0.A05
            if (r2 != 0) goto L_0x00d3
            if (r1 != 0) goto L_0x00aa
            java.util.concurrent.Executor r1 = X.C002601b.A02
            r0.A05 = r1
        L_0x00aa:
            r0.A04 = r1
        L_0x00ac:
            java.util.Set r1 = r0.A02
            if (r1 == 0) goto L_0x00f5
            java.util.Iterator r3 = r1.iterator()
        L_0x00b4:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x00f5
            int r2 = X.C36341k9.A0A(r3)
            java.util.Set r1 = r0.A03
            boolean r1 = X.AnonymousClass000.A1Z(r1, r2)
            r1 = r1 ^ 1
            if (r1 != 0) goto L_0x00b4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: "
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0d(r0, r1, r2)
            throw r1
        L_0x00d3:
            if (r1 != 0) goto L_0x00ac
            r0.A05 = r2
            goto L_0x00ac
        L_0x00d8:
            java.lang.String r1 = "androidx.work.workdb"
            boolean r0 = X.AnonymousClass098.A06(r1)
            if (r0 == 0) goto L_0x00e7
            java.lang.String r0 = "Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder"
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A08(r0)
            throw r1
        L_0x00e7:
            X.65I r0 = new X.65I
            r0.<init>(r5, r1)
            X.6iR r1 = new X.6iR
            r1.<init>(r5)
            r0.A00 = r1
            goto L_0x0029
        L_0x00f5:
            X.7e7 r9 = r0.A00
            if (r9 != 0) goto L_0x00fe
            X.6iQ r9 = new X.6iQ
            r9.<init>()
        L_0x00fe:
            java.lang.String r3 = "Required value was null."
            android.content.Context r8 = r0.A09
            java.lang.String r1 = r0.A0B
            r17 = r1
            X.609 r1 = r0.A0A
            r16 = r1
            boolean r15 = r0.A07
            java.lang.String r1 = "activity"
            java.lang.Object r2 = r8.getSystemService(r1)
            java.lang.String r1 = "null cannot be cast to non-null type android.app.ActivityManager"
            X.AnonymousClass00C.A0E(r2, r1)
            android.app.ActivityManager r2 = (android.app.ActivityManager) r2
            X.AnonymousClass00C.A0D(r2, r13)
            boolean r1 = r2.isLowRamDevice()
            if (r1 != 0) goto L_0x0195
            java.lang.Integer r19 = X.C023109s.A0C
        L_0x0124:
            java.util.concurrent.Executor r7 = r0.A04
            if (r7 == 0) goto L_0x0492
            java.util.concurrent.Executor r6 = r0.A05
            if (r6 == 0) goto L_0x048d
            boolean r5 = r0.A08
            boolean r4 = r0.A06
            java.util.Set r3 = r0.A03
            java.util.List r2 = r0.A0D
            java.util.List r1 = r0.A01
            X.5yy r0 = new X.5yy
            r20 = r17
            r21 = r10
            r22 = r2
            r23 = r1
            r24 = r3
            r25 = r7
            r26 = r6
            r27 = r15
            r28 = r5
            r29 = r4
            r17 = r16
            r18 = r9
            r15 = r0
            r16 = r8
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.String r8 = "_Impl"
            java.lang.String r3 = ".canonicalName"
            java.lang.Package r1 = r11.getPackage()
            X.AnonymousClass00C.A0B(r1)
            java.lang.String r7 = r1.getName()
            java.lang.String r6 = r11.getCanonicalName()
            X.AnonymousClass00C.A0B(r6)
            X.AnonymousClass00C.A08(r7)
            int r5 = r7.length()
            if (r5 == 0) goto L_0x017b
            int r1 = r5 + 1
            java.lang.String r6 = X.C90494aF.A0d(r6, r1)
        L_0x017b:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()
            r2 = 46
            r1 = 95
            X.AnonymousClass00C.A0D(r6, r13)
            java.lang.String r1 = r6.replace(r2, r1)
            X.AnonymousClass00C.A08(r1)
            java.lang.String r4 = X.AnonymousClass000.A0p(r1, r8, r4)
            if (r5 != 0) goto L_0x0198
            r2 = r4
            goto L_0x01a0
        L_0x0195:
            java.lang.Integer r19 = X.C023109s.A01
            goto L_0x0124
        L_0x0198:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r7)     // Catch:{ ClassNotFoundException -> 0x046e, IllegalAccessException -> 0x045d, InstantiationException -> 0x044c }
            java.lang.String r2 = X.C90464aC.A0f(r4, r1, r2)     // Catch:{ ClassNotFoundException -> 0x046e, IllegalAccessException -> 0x045d, InstantiationException -> 0x044c }
        L_0x01a0:
            java.lang.ClassLoader r1 = r11.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x046e, IllegalAccessException -> 0x045d, InstantiationException -> 0x044c }
            java.lang.Class r2 = java.lang.Class.forName(r2, r12, r1)     // Catch:{ ClassNotFoundException -> 0x046e, IllegalAccessException -> 0x045d, InstantiationException -> 0x044c }
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>"
            X.AnonymousClass00C.A0E(r2, r1)     // Catch:{ ClassNotFoundException -> 0x046e, IllegalAccessException -> 0x045d, InstantiationException -> 0x044c }
            java.lang.Object r4 = r2.newInstance()     // Catch:{ ClassNotFoundException -> 0x046e, IllegalAccessException -> 0x045d, InstantiationException -> 0x044c }
            X.6Q8 r4 = (X.AnonymousClass6Q8) r4
            r2 = r4
            androidx.work.impl.WorkDatabase_Impl r2 = (androidx.work.impl.WorkDatabase_Impl) r2
            X.6Nf r1 = new X.6Nf
            r1.<init>(r2)
            X.4oj r3 = new X.4oj
            r3.<init>(r0, r1)
            android.content.Context r1 = r0.A00
            X.63l r2 = new X.63l
            r2.<init>(r1)
            java.lang.String r1 = r0.A04
            r2.A01 = r1
            r2.A00 = r3
            X.5vj r2 = r2.A00()
            X.7e7 r1 = r0.A02
            X.7o6 r1 = r1.B3p(r2)
            r4.A00 = r1
            java.util.HashSet r1 = X.C36441kJ.A16()
            java.util.BitSet r3 = new java.util.BitSet
            r3.<init>()
            java.util.Iterator r8 = r1.iterator()
        L_0x01e6:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0232
            java.lang.Object r6 = r8.next()
            java.lang.Class r6 = (java.lang.Class) r6
            java.util.List r7 = r0.A05
            int r5 = X.C36431kI.A07(r7)
            if (r5 < 0) goto L_0x021b
        L_0x01fa:
            int r2 = r5 + -1
            java.lang.Object r1 = r7.get(r5)
            java.lang.Class r1 = r1.getClass()
            boolean r1 = r6.isAssignableFrom(r1)
            if (r1 == 0) goto L_0x0217
            r3.set(r5)
            java.util.Map r2 = r4.A02
            java.lang.Object r1 = r7.get(r5)
            r2.put(r6, r1)
            goto L_0x01e6
        L_0x0217:
            if (r2 < 0) goto L_0x021b
            r5 = r2
            goto L_0x01fa
        L_0x021b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "A required auto migration spec ("
            r1.append(r0)
            java.lang.String r0 = r6.getCanonicalName()
            r1.append(r0)
            java.lang.String r0 = ") is missing in the database configuration."
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0c(r0, r1)
            throw r1
        L_0x0232:
            java.util.List r1 = r0.A05
            int r1 = X.C36431kI.A07(r1)
            if (r1 < 0) goto L_0x0245
        L_0x023a:
            int r2 = r1 + -1
            boolean r1 = r3.get(r1)
            if (r1 == 0) goto L_0x0445
            r1 = r2
            if (r2 >= 0) goto L_0x023a
        L_0x0245:
            r1 = 2
            X.61V[] r2 = new X.AnonymousClass61V[r1]
            X.4oW r1 = new X.4oW
            r1.<init>()
            r2[r13] = r1
            X.4oX r1 = new X.4oX
            r1.<init>()
            java.util.List r1 = X.C90524aI.A0p(r1, r2, r12)
            java.util.Iterator r8 = r1.iterator()
        L_0x025c:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0292
            java.lang.Object r7 = r8.next()
            X.61V r7 = (X.AnonymousClass61V) r7
            X.609 r6 = r0.A01
            int r1 = r7.A01
            int r5 = r7.A00
            java.util.Map r3 = r6.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            boolean r1 = r3.containsKey(r2)
            if (r1 == 0) goto L_0x028a
            java.util.Map r1 = X.C90514aH.A15(r2, r3)
            if (r1 != 0) goto L_0x0284
            X.00f r1 = X.C000400e.A0D()
        L_0x0284:
            boolean r1 = X.C90484aE.A1Y(r1, r5)
            if (r1 != 0) goto L_0x025c
        L_0x028a:
            X.61V[] r1 = new X.AnonymousClass61V[r12]
            r1[r13] = r7
            r6.A00(r1)
            goto L_0x025c
        L_0x0292:
            java.lang.Class<X.6iT> r2 = X.C138656iT.class
            X.7o6 r1 = r4.A02()
            r2.isInstance(r1)
            java.lang.Class<X.6iS> r2 = X.C138646iS.class
            X.7o6 r1 = r4.A02()
            r2.isInstance(r1)
            java.lang.Integer r2 = r0.A03
            java.lang.Integer r1 = X.C023109s.A0C
            boolean r5 = X.C36361kB.A1a(r2, r1)
            X.7o6 r3 = r4.A02()
            X.6iU r3 = (X.C138666iU) r3
            X.00T r2 = r3.A04
            boolean r1 = r2.BM2()
            if (r1 == 0) goto L_0x02c6
            java.lang.Object r1 = r2.getValue()
            android.database.sqlite.SQLiteOpenHelper r1 = (android.database.sqlite.SQLiteOpenHelper) r1
            X.AnonymousClass00C.A0D(r1, r13)
            r1.setWriteAheadLoggingEnabled(r5)
        L_0x02c6:
            r3.A00 = r5
            java.util.List r1 = r0.A06
            r4.A01 = r1
            java.util.concurrent.Executor r1 = r0.A09
            r4.A03 = r1
            java.util.concurrent.Executor r2 = r0.A0A
            X.771 r1 = new X.771
            r1.<init>(r2)
            r4.A04 = r1
            boolean r1 = r0.A0C
            r4.A05 = r1
            java.util.HashMap r3 = X.AnonymousClass001.A0J()
            java.lang.Class<X.7lt> r2 = X.C160977lt.class
            java.util.List r1 = java.util.Collections.emptyList()
            r3.put(r2, r1)
            java.lang.Class<X.7e9> r2 = X.AnonymousClass7e9.class
            java.util.List r1 = java.util.Collections.emptyList()
            r3.put(r2, r1)
            java.lang.Class<X.7iY> r2 = X.C158977iY.class
            java.util.List r1 = java.util.Collections.emptyList()
            r3.put(r2, r1)
            java.lang.Class<X.7iX> r2 = X.C158967iX.class
            java.util.List r1 = java.util.Collections.emptyList()
            r3.put(r2, r1)
            java.lang.Class<X.7bv> r2 = X.C157157bv.class
            java.util.List r1 = java.util.Collections.emptyList()
            r3.put(r2, r1)
            java.lang.Class<X.7eA> r2 = X.AnonymousClass7eA.class
            java.util.List r1 = java.util.Collections.emptyList()
            r3.put(r2, r1)
            java.lang.Class<X.7iW> r2 = X.C158957iW.class
            java.util.List r1 = java.util.Collections.emptyList()
            r3.put(r2, r1)
            java.lang.Class<X.7bu> r2 = X.C157147bu.class
            java.util.List r1 = java.util.Collections.emptyList()
            r3.put(r2, r1)
            java.util.BitSet r5 = new java.util.BitSet
            r5.<init>()
            java.util.Iterator r10 = X.C36371kC.A10(r3)
        L_0x0332:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x039e
            java.util.Map$Entry r1 = X.AnonymousClass000.A11(r10)
            java.lang.Object r3 = r1.getKey()
            java.lang.Class r3 = (java.lang.Class) r3
            java.lang.Object r1 = r1.getValue()
            java.util.Iterator r9 = X.C90514aH.A13(r1)
        L_0x034a:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0332
            java.lang.Object r6 = r9.next()
            java.lang.Class r6 = (java.lang.Class) r6
            java.util.List r8 = r0.A07
            int r7 = X.C36431kI.A07(r8)
            if (r7 < 0) goto L_0x037f
        L_0x035e:
            int r2 = r7 + -1
            java.lang.Object r1 = r8.get(r7)
            java.lang.Class r1 = r1.getClass()
            boolean r1 = r6.isAssignableFrom(r1)
            if (r1 == 0) goto L_0x037b
            r5.set(r7)
            java.util.Map r2 = r4.A07
            java.lang.Object r1 = r8.get(r7)
            r2.put(r6, r1)
            goto L_0x034a
        L_0x037b:
            if (r2 < 0) goto L_0x037f
            r7 = r2
            goto L_0x035e
        L_0x037f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "A required type converter ("
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ") for "
            r1.append(r0)
            java.lang.String r0 = r3.getCanonicalName()
            r1.append(r0)
            java.lang.String r0 = " is missing in the database configuration."
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0c(r0, r1)
            throw r1
        L_0x039e:
            java.util.List r3 = r0.A07
            int r2 = X.C36431kI.A07(r3)
            if (r2 < 0) goto L_0x03c9
        L_0x03a6:
            int r1 = r2 + -1
            boolean r0 = r5.get(r2)
            if (r0 == 0) goto L_0x03b2
            if (r1 < 0) goto L_0x03c9
            r2 = r1
            goto L_0x03a6
        L_0x03b2:
            java.lang.Object r2 = r3.get(r2)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unexpected type converter "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder."
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0c(r0, r1)
            throw r1
        L_0x03c9:
            androidx.work.impl.WorkDatabase r4 = (androidx.work.impl.WorkDatabase) r4
            r3 = r35
            r3.<init>()
            android.content.Context r6 = r30.getApplicationContext()
            r5 = r37
            int r0 = r5.A00
            X.6VD r1 = new X.6VD
            r1.<init>(r0)
            java.lang.Object r0 = X.AnonymousClass6VD.A01
            monitor-enter(r0)
            X.AnonymousClass6VD.A02 = r1     // Catch:{ all -> 0x0442 }
            monitor-exit(r0)     // Catch:{ all -> 0x0442 }
            X.9L0 r2 = new X.9L0
            r2.<init>(r6, r14)
            r3.A09 = r2
            r0 = 2
            X.7k7[] r1 = new X.C159907k7[r0]
            X.7k7 r0 = X.AnonymousClass6RH.A00(r6, r3)
            r1[r13] = r0
            X.6ip r0 = new X.6ip
            r0.<init>(r6, r5, r3, r2)
            java.util.List r1 = X.C90524aI.A0p(r0, r1, r12)
            X.6im r0 = new X.6im
            r31 = r5
            r32 = r4
            r33 = r14
            r34 = r1
            r29 = r0
            r29.<init>(r30, r31, r32, r33, r34)
            android.content.Context r2 = r30.getApplicationContext()
            r3.A01 = r2
            r3.A02 = r5
            r3.A06 = r14
            r3.A04 = r4
            r3.A07 = r1
            r3.A03 = r0
            X.5hK r0 = new X.5hK
            r0.<init>(r4)
            r3.A05 = r0
            r3.A08 = r13
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x0437
            boolean r0 = X.C109425Xn.A00(r2)
            if (r0 == 0) goto L_0x0437
            java.lang.String r0 = "Cannot initialize WorkManager in direct boot mode"
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A09(r0)
            throw r1
        L_0x0437:
            X.7eB r1 = r3.A06
            X.756 r0 = new X.756
            r0.<init>(r2, r3)
            r1.B74(r0)
            return
        L_0x0442:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0442 }
            throw r1
        L_0x0445:
            java.lang.String r0 = "Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder."
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A08(r0)
            throw r1
        L_0x044c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Failed to create an instance of "
            r1.append(r0)
            r1.append(r11)
            java.lang.RuntimeException r0 = X.C90464aC.A0U(r3, r1)
            throw r0
        L_0x045d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Cannot access the constructor "
            r1.append(r0)
            r1.append(r11)
            java.lang.RuntimeException r0 = X.C90464aC.A0U(r3, r1)
            throw r0
        L_0x046e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Cannot find implementation for "
            r1.append(r0)
            java.lang.String r0 = r11.getCanonicalName()
            r1.append(r0)
            java.lang.String r0 = ". "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " does not exist"
            java.lang.RuntimeException r0 = X.C90464aC.A0U(r0, r1)
            throw r0
        L_0x048d:
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A08(r3)
            throw r1
        L_0x0492:
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A08(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6VR.<init>(android.content.Context, X.0tv, X.7eB):void");
    }

    public static AnonymousClass6VR A00(Context context) {
        AnonymousClass6VR r0;
        synchronized (A0C) {
            try {
                r0 = A0B;
                if (r0 == null && (r0 = A0A) == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext instanceof C18680tY) {
                        C18850tv workManagerConfiguration = ((C18680tY) applicationContext).getWorkManagerConfiguration();
                        if (A0B == null) {
                            Context applicationContext2 = applicationContext.getApplicationContext();
                            AnonymousClass6VR r1 = A0A;
                            if (r1 == null) {
                                r1 = new AnonymousClass6VR(applicationContext2, workManagerConfiguration, new C138956iy(workManagerConfiguration.A06));
                                A0A = r1;
                            }
                            A0B = r1;
                        } else if (A0A != null) {
                            throw AnonymousClass001.A09("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                        }
                        r0 = A00(applicationContext);
                    } else {
                        th = AnonymousClass001.A09("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                        throw th;
                    }
                }
            } catch (Throwable th) {
                th = th;
            }
        }
        return r0;
    }

    public C161147mG A02(C97414pH r14, Integer num, String str) {
        C97414pH r5 = r14;
        String str2 = str;
        if (num == C023109s.A0C) {
            AnonymousClass00C.A0D(r14, 2);
            C138776ig r3 = new C138776ig();
            ((C138956iy) this.A06).A01.execute(new C1502774q(this, r3, new C153407Of(r14, r3, this, str2), r5, str2, 0));
            return r3;
        }
        Integer num2 = C023109s.A01;
        if (num != num2) {
            num2 = C023109s.A00;
        }
        return new AnonymousClass6WE(this, num2, str2, Collections.singletonList(r14), (List) null).A02();
    }

    public C97484pl A04(String str) {
        C1501774g r1 = new C1501774g(this, str);
        ((C138956iy) this.A06).A01.execute(r1);
        return r1.A00;
    }

    public void A05() {
        synchronized (A0C) {
            this.A08 = true;
            BroadcastReceiver.PendingResult pendingResult = this.A00;
            if (pendingResult != null) {
                pendingResult.finish();
                this.A00 = null;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public void A06() {
        if (Build.VERSION.SDK_INT >= 23) {
            C138856io.A03(this.A01);
        }
        WorkDatabase workDatabase = this.A04;
        C138936iw r0 = (C138936iw) workDatabase.A0D();
        AnonymousClass6Q8 r3 = r0.A02;
        r3.A05();
        AnonymousClass6P9 r2 = r0.A05;
        C161957nk A022 = r2.A02();
        r3.A06();
        try {
            C97274ok.A00(r3, A022);
            AnonymousClass6Q8.A01(r3);
            r2.A03(A022);
            AnonymousClass6RH.A01(this.A02, workDatabase, this.A07);
        } catch (Throwable th) {
            AnonymousClass6Q8.A01(r3);
            r2.A03(A022);
            throw th;
        }
    }

    public void A09(C114465hI r5) {
        this.A06.B74(new AnonymousClass752(r5, this, 1, false));
    }

    public void A0A(String str) {
        this.A06.B74(new C97464pj(this, str));
    }

    public final AnonymousClass6WE A03(C97404pG r7, Integer num, String str) {
        List singletonList = Collections.singletonList(r7);
        if (!singletonList.isEmpty()) {
            return new AnonymousClass6WE(this, num, str, singletonList, (List) null);
        }
        throw AnonymousClass001.A08("beginUniqueWork needs at least one OneTimeWorkRequest.");
    }

    public void A07(C97404pG r7, Integer num, String str) {
        new AnonymousClass6WE(this, num, str, Collections.singletonList(r7), (List) null).A02();
    }

    public final void A08(C120745s0 r7) {
        List singletonList = Collections.singletonList(r7);
        if (!singletonList.isEmpty()) {
            new AnonymousClass6WE(this, C023109s.A01, (String) null, singletonList, (List) null).A02();
            return;
        }
        throw AnonymousClass001.A08("enqueue needs at least one WorkRequest.");
    }

    public AnonymousClass6VR() {
    }
}
