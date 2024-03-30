package X;

import android.database.Cursor;
import android.database.CursorWrapper;
import android.os.OperationCanceledException;

/* renamed from: X.1lC  reason: invalid class name and case insensitive filesystem */
public class C36721lC extends CursorWrapper {
    public static RuntimeException A00(RuntimeException runtimeException) {
        if (runtimeException instanceof OperationCanceledException) {
            return new AnonymousClass02S(runtimeException.getMessage());
        }
        return runtimeException;
    }

    public int getCount() {
        try {
            return super.getCount();
        } catch (RuntimeException e) {
            throw A00(e);
        }
    }

    public boolean isAfterLast() {
        try {
            return super.isAfterLast();
        } catch (RuntimeException e) {
            throw A00(e);
        }
    }

    public boolean isBeforeFirst() {
        try {
            return super.isBeforeFirst();
        } catch (RuntimeException e) {
            throw A00(e);
        }
    }

    public boolean isFirst() {
        try {
            return super.isFirst();
        } catch (RuntimeException e) {
            throw A00(e);
        }
    }

    public boolean isLast() {
        try {
            return super.isLast();
        } catch (RuntimeException e) {
            throw A00(e);
        }
    }

    public boolean move(int i) {
        try {
            return super.move(i);
        } catch (RuntimeException e) {
            throw A00(e);
        }
    }

    public boolean moveToFirst() {
        try {
            return super.moveToFirst();
        } catch (RuntimeException e) {
            throw A00(e);
        }
    }

    public boolean moveToLast() {
        try {
            return super.moveToLast();
        } catch (RuntimeException e) {
            throw A00(e);
        }
    }

    public boolean moveToNext() {
        try {
            return super.moveToNext();
        } catch (RuntimeException e) {
            throw A00(e);
        }
    }

    public boolean moveToPosition(int i) {
        try {
            return super.moveToPosition(i);
        } catch (RuntimeException e) {
            throw A00(e);
        }
    }

    public boolean moveToPrevious() {
        try {
            return super.moveToPrevious();
        } catch (RuntimeException e) {
            throw A00(e);
        }
    }

    public C36721lC(Cursor cursor) {
        super(cursor);
    }
}
