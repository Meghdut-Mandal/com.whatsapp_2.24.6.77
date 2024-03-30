package X;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* renamed from: X.3WI  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3WI implements DatabaseErrorHandler {
    public final /* synthetic */ File A00;

    public /* synthetic */ AnonymousClass3WI(File file) {
        this.A00 = file;
    }

    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        C36321k7.A1K(this.A00, "MessageStoreBackup/integritycheck/error-handler/corrupt-db ", AnonymousClass000.A0u());
    }
}
