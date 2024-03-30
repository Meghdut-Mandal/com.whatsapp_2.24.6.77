package X;

import android.os.AsyncTask;

/* renamed from: X.0Dv  reason: invalid class name and case insensitive filesystem */
public final class C03260Dv extends AsyncTask {
    public final /* synthetic */ AnonymousClass0DY A00;

    public C03260Dv(AnonymousClass0DY r1) {
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        while (true) {
            AnonymousClass0DY r2 = this.A00;
            C17050qd A06 = r2.A06();
            if (A06 == null) {
                return null;
            }
            r2.A0A(A06.getIntent());
            A06.B3D();
        }
    }

    public /* bridge */ /* synthetic */ void onCancelled(Object obj) {
        this.A00.A07();
    }

    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        this.A00.A07();
    }
}
