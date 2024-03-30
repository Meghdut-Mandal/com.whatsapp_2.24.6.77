package X;

import android.os.AsyncTask;

/* renamed from: X.4c6  reason: invalid class name and case insensitive filesystem */
public final class C91494c6 extends AsyncTask {
    public final C132446Tt A00;

    private void A00() {
        C132446Tt r2 = this.A00;
        AnonymousClass012 r0 = r2.A01;
        if (r0 != null) {
            AnonymousClass01Y r1 = r2.A00;
            if (r1 != null) {
                r0.getLifecycle().A05(r1);
            }
            r2.A01 = null;
        }
    }

    public final Object doInBackground(Object... objArr) {
        return this.A00.A08(objArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000c, code lost:
        A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCancelled(java.lang.Object r2) {
        /*
            r1 = this;
            X.6Tt r0 = r1.A00     // Catch:{ all -> 0x0009 }
            r0.A0B(r2)     // Catch:{ all -> 0x0009 }
            r1.A00()
            return
        L_0x0009:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x000b }
        L_0x000b:
            r0 = move-exception
            r1.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91494c6.onCancelled(java.lang.Object):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000c, code lost:
        A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPostExecute(java.lang.Object r2) {
        /*
            r1 = this;
            X.6Tt r0 = r1.A00     // Catch:{ all -> 0x0009 }
            r0.A0C(r2)     // Catch:{ all -> 0x0009 }
            r1.A00()
            return
        L_0x0009:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x000b }
        L_0x000b:
            r0 = move-exception
            r1.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91494c6.onPostExecute(java.lang.Object):void");
    }

    public void onPreExecute() {
        this.A00.A0A();
    }

    public final void onProgressUpdate(Object... objArr) {
        this.A00.A0E(objArr);
    }

    public C91494c6(C132446Tt r1) {
        this.A00 = r1;
    }

    public void A01(Object... objArr) {
        publishProgress(objArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000c, code lost:
        A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCancelled() {
        /*
            r1 = this;
            X.6Tt r0 = r1.A00     // Catch:{ all -> 0x0009 }
            r0.A09()     // Catch:{ all -> 0x0009 }
            r1.A00()
            return
        L_0x0009:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x000b }
        L_0x000b:
            r0 = move-exception
            r1.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91494c6.onCancelled():void");
    }
}
