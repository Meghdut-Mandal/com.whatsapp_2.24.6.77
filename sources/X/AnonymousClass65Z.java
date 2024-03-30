package X;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.65Z  reason: invalid class name */
public abstract class AnonymousClass65Z {
    public void A01(List list) {
        Cursor A09;
        C102094ym r9 = (C102094ym) this;
        C102084yl r1 = r9.A00;
        C65653Sy r6 = r1.A02.A00;
        String str = r1.A05;
        String str2 = r1.A04;
        ArrayList A0r = C36361kB.A0r(list);
        if (!list.isEmpty()) {
            int size = list.size();
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("SELECT rowid, * FROM ");
            A0u.append(str);
            A0u.append(" WHERE ");
            C36351kA.A1O("(rowid IN ", A0u, size);
            String A0f = C90474aD.A0f(A0u);
            String[] strArr = new String[list.size()];
            int i = 0;
            for (Object valueOf : list) {
                strArr[i] = String.valueOf(valueOf);
                i++;
            }
            AnonymousClass1M0 A04 = r6.A00.get();
            try {
                A09 = A04.A02.A09(A0f, "BackupChangesStore/INCREMENTAL_BACKUP_QUERY_ROWS", strArr);
                String[] columnNames = A09.getColumnNames();
                int columnIndex = A09.getColumnIndex(str2);
                while (A09.moveToNext()) {
                    HashMap A01 = C65653Sy.A01(A09, columnNames);
                    if (!A01.isEmpty()) {
                        if (columnIndex >= 0) {
                            C36421kH.A1K(str2, A01, A09.getLong(columnIndex));
                        }
                        A0r.add(A01);
                    }
                }
                A09.close();
                A04.close();
            } catch (Throwable th) {
                try {
                    A04.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        r9.A01.addAll(A0r);
        return;
        throw th;
    }

    public void A00(CancellationSignal cancellationSignal, List list) {
        if (list.size() > 0 && !cancellationSignal.isCanceled()) {
            int i = 0;
            while (i < list.size()) {
                List subList = list.subList(i, Math.min(list.size(), i + 100));
                A01(subList);
                i = C90524aI.A04(subList, i);
            }
        }
    }
}
