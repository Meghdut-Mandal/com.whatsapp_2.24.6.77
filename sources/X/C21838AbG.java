package X;

/* renamed from: X.AbG  reason: case insensitive filesystem */
public class C21838AbG extends Thread {
    public final /* synthetic */ AnonymousClass9JD A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21838AbG(AnonymousClass9JD r2) {
        super("PhantomDestructor");
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
        if (r3.A02.isEmpty() == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003b, code lost:
        r3.A00 = false;
        r3.notifyAll();
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x001b A[EDGE_INSN: B:31:0x001b->B:9:0x001b ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r5 = this;
            X.9JD r3 = r5.A00
        L_0x0002:
            r4 = 0
        L_0x0003:
            java.lang.ref.ReferenceQueue r0 = r3.A01     // Catch:{ InterruptedException -> 0x000c }
            java.lang.ref.Reference r1 = r0.remove()     // Catch:{ InterruptedException -> 0x000c }
            X.Abg r1 = (X.C21856Abg) r1     // Catch:{ InterruptedException -> 0x000c }
            goto L_0x0019
        L_0x000c:
            if (r4 == 0) goto L_0x0003
            java.lang.ref.ReferenceQueue r2 = r3.A01     // Catch:{ InterruptedException -> 0x000c }
            r0 = 15000(0x3a98, float:2.102E-41)
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x000c }
            java.lang.ref.Reference r1 = r2.remove(r0)     // Catch:{ InterruptedException -> 0x000c }
            X.Abg r1 = (X.C21856Abg) r1     // Catch:{ InterruptedException -> 0x000c }
        L_0x0019:
            if (r1 != 0) goto L_0x001d
            monitor-enter(r3)
            goto L_0x0032
        L_0x001d:
            com.facebook.wamediajni.WamediaStreamsMP4Muxer$NativeWrapper r0 = r1.A00
            r0.targetDestructed()
            monitor-enter(r3)
            java.util.HashSet r2 = r3.A02     // Catch:{ all -> 0x004a }
            boolean r1 = r2.remove(r1)     // Catch:{ all -> 0x004a }
            r0 = 0
            if (r1 == 0) goto L_0x0045
            boolean r4 = r2.isEmpty()     // Catch:{ all -> 0x004a }
            monitor-exit(r3)
            goto L_0x000c
        L_0x0032:
            java.util.HashSet r0 = r3.A02     // Catch:{ all -> 0x004a }
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x004a }
            r0 = 0
            if (r1 == 0) goto L_0x0041
            r3.A00 = r0     // Catch:{ all -> 0x004a }
            r3.notifyAll()     // Catch:{ all -> 0x004a }
            r0 = 1
        L_0x0041:
            monitor-exit(r3)
            if (r0 == 0) goto L_0x0002
            return
        L_0x0045:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ all -> 0x004a }
            throw r0     // Catch:{ all -> 0x004a }
        L_0x004a:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21838AbG.run():void");
    }
}
