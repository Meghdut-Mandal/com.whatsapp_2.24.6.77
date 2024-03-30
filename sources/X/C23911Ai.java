package X;

import android.database.sqlite.SQLiteBlobTooBigException;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1Ai  reason: invalid class name and case insensitive filesystem */
public class C23911Ai extends C227415p {
    public final C20650xu A00;
    public final Map A01 = new HashMap();

    public boolean A0E(Throwable th, int i) {
        if (i != 1 || !(th instanceof SQLiteBlobTooBigException)) {
            return super.A0E(th, i);
        }
        Log.e("FtsDatabaseMigration/skipping BlobTooBigException single row");
        return true;
    }

    public C23911Ai(C20650xu r3, C227615r r4) {
        super(r4, "message_fts", Integer.MIN_VALUE);
        this.A00 = r3;
    }

    public void A07() {
        super.A07();
        this.A03.A03("fts_ready", 5);
    }
}
