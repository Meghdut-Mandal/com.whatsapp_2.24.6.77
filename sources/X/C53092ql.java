package X;

import android.content.ComponentName;
import android.content.Intent;

/* renamed from: X.2ql  reason: invalid class name and case insensitive filesystem */
public abstract class C53092ql {
    public static Intent A00(Intent intent) {
        return new Intent(intent).setComponent((ComponentName) null).setFlags(intent.getFlags() & -4);
    }
}
