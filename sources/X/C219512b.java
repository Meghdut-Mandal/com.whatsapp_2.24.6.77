package X;

import android.database.sqlite.SQLiteTransactionListener;
import java.util.AbstractMap;

/* renamed from: X.12b  reason: invalid class name and case insensitive filesystem */
public class C219512b implements SQLiteTransactionListener {
    public final String A00;
    public final ThreadLocal A01 = new AnonymousClass12d(this);
    public final ThreadLocal A02 = new AnonymousClass12c(this);

    public void onBegin() {
    }

    public void onCommit() {
        Object obj = this.A02.get();
        C18740tg.A06(obj);
        AbstractMap abstractMap = (AbstractMap) obj;
        try {
            for (SQLiteTransactionListener onCommit : abstractMap.values()) {
                onCommit.onCommit();
            }
        } finally {
            abstractMap.clear();
            this.A01.set(false);
        }
    }

    public void onRollback() {
        Object obj = this.A02.get();
        C18740tg.A06(obj);
        AbstractMap abstractMap = (AbstractMap) obj;
        try {
            for (SQLiteTransactionListener onRollback : abstractMap.values()) {
                onRollback.onRollback();
            }
        } finally {
            abstractMap.clear();
            this.A01.set(false);
        }
    }

    public C219512b(String str) {
        this.A00 = str;
    }
}
