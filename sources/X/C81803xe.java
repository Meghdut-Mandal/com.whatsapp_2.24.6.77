package X;

import android.database.Cursor;
import java.io.Closeable;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.3xe  reason: invalid class name and case insensitive filesystem */
public class C81803xe implements Iterator, Closeable {
    public final Cursor A00;
    public final AnonymousClass4QM A01;

    public void close() {
        this.A00.close();
    }

    public boolean hasNext() {
        Cursor cursor = this.A00;
        if (cursor.isLast() || cursor.isAfterLast()) {
            return false;
        }
        return true;
    }

    public Object next() {
        Cursor cursor = this.A00;
        if (cursor.moveToNext()) {
            return this.A01.BlC(cursor);
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public C81803xe(Cursor cursor, AnonymousClass4QM r3) {
        this.A00 = new C36711lB(cursor);
        this.A01 = r3;
    }
}
