package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.4yn  reason: invalid class name and case insensitive filesystem */
public class C102104yn extends AnonymousClass65Z {
    public final /* synthetic */ C116545kl A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public C102104yn(C116545kl r1, String str, String str2, String str3) {
        this.A00 = r1;
        this.A03 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    public void A01(List list) {
        Cursor A09;
        Object obj;
        boolean equals;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            C65653Sy r1 = this.A00.A00;
            String str = this.A03;
            String str2 = this.A01;
            String str3 = this.A02;
            Object obj2 = map.get(str2);
            if (obj2 != null) {
                String obj3 = obj2.toString();
                AnonymousClass12P r6 = r1.A00;
                AnonymousClass1M0 A04 = r6.get();
                try {
                    C224114e r8 = A04.A02;
                    String[] A1S = C36441kJ.A1S();
                    boolean z = false;
                    C90494aF.A1H(str, obj3, A1S);
                    A09 = r8.A09("SELECT table_row_id FROM backup_changes WHERE (operation = 'DELETE') AND (table_name = ?) AND (table_row_id = ?) LIMIT 1", "BackupChangesStore/SELECT_SINGLE_DELETED_ID", A1S);
                    if (A09.getCount() > 0) {
                        z = true;
                    }
                    A09.close();
                    A04.close();
                    if (!z) {
                        if (str3 == null) {
                            str3 = str2;
                        }
                        obj = map.get(str3);
                        StringBuilder A0u = AnonymousClass000.A0u();
                        if (obj != null) {
                            A0u.append("SELECT *  FROM ");
                            A0u.append(str);
                            A0u.append(" WHERE ");
                            A0u.append(str3);
                            String A0q = AnonymousClass000.A0q(" = ?", A0u);
                            A04 = r6.get();
                            C224114e r3 = A04.A02;
                            String[] A1R = C36441kJ.A1R();
                            C90514aH.A1Q(obj, A1R, 0);
                            A09 = r3.A09(A0q, "BackupChangesStore/INCREMENTAL_BACKUP_QUERY_ROW_BEFORE_UPDATE", A1R);
                            String[] columnNames = A09.getColumnNames();
                            if (A09.moveToNext()) {
                                HashMap A012 = C65653Sy.A01(A09, columnNames);
                                A09.close();
                                A04.close();
                                ContentValues contentValues = new ContentValues(map.size());
                                Iterator A0y = AnonymousClass000.A0y(map);
                                while (A0y.hasNext()) {
                                    Map.Entry A11 = AnonymousClass000.A11(A0y);
                                    String A0f = C90494aF.A0f(A11);
                                    Object value = A11.getValue();
                                    if (!A0f.equalsIgnoreCase(str2) && !A0f.equalsIgnoreCase(str3)) {
                                        Object obj4 = A012.get(A0f);
                                        if (obj4 == null) {
                                            if (value == null) {
                                                continue;
                                            }
                                        } else if (value != null) {
                                            if (!(obj4 instanceof byte[]) || !(value instanceof byte[])) {
                                                equals = obj4.toString().equals(value.toString());
                                            } else {
                                                equals = Arrays.equals((byte[]) obj4, (byte[]) value);
                                            }
                                            if (equals) {
                                                continue;
                                            }
                                        }
                                        if (!C65653Sy.A02(contentValues, value, A0f)) {
                                            StringBuilder A0u2 = AnonymousClass000.A0u();
                                            A0u2.append("BackupChangesStore/Error while inserting values into table '");
                                            A0u2.append(str);
                                            A0u2.append("'. Unsupported type '");
                                            A0u2.append(value.getClass());
                                            A0u2.append("' for field '");
                                            A0u2.append(A0f);
                                            String A0q2 = AnonymousClass000.A0q("'", A0u2);
                                            Log.e(A0q2);
                                            throw AnonymousClass001.A08(A0q2);
                                        }
                                    }
                                }
                                if (contentValues.size() != 0) {
                                    A04 = r6.A05();
                                    C224114e r13 = A04.A02;
                                    String A0D = C36321k7.A0D(str3, " = ?");
                                    String[] strArr = new String[1];
                                    C90514aH.A1Q(obj, strArr, 0);
                                    if (r13.A02(contentValues, str, A0D, "BackupChangesStore/INCREMENTAL_BACKUP_UPDATE_ROW", strArr, 5) > 0) {
                                        A04.close();
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                A09.close();
                            }
                            A04.close();
                            A04 = r6.A05();
                            ContentValues contentValues2 = new ContentValues(map.size());
                            Iterator A0y2 = AnonymousClass000.A0y(map);
                            while (A0y2.hasNext()) {
                                Map.Entry A112 = AnonymousClass000.A11(A0y2);
                                String A0f2 = C90494aF.A0f(A112);
                                Object value2 = A112.getValue();
                                if (!C65653Sy.A02(contentValues2, value2, A0f2)) {
                                    StringBuilder A0u3 = AnonymousClass000.A0u();
                                    A0u3.append("BackupChangesStore/Error while inserting values into table '");
                                    A0u3.append(str);
                                    A0u3.append("'. Unsupported type '");
                                    A0u3.append(value2.getClass());
                                    A0u3.append("' for field '");
                                    A0u3.append(A0f2);
                                    String A0q3 = AnonymousClass000.A0q("'", A0u3);
                                    Log.e(A0q3);
                                    throw AnonymousClass001.A08(A0q3);
                                }
                            }
                            A04.A02.A04(str, "BackupChangesStore/INCREMENTAL_BACKUP_INSERT_ROW", contentValues2);
                            A04.close();
                        } else {
                            A0u.append("BackupChangesStore/Unspecified value for PK field '");
                            A0u.append(str3);
                            throw AnonymousClass000.A0c("'", A0u);
                        }
                    }
                } catch (SQLiteConstraintException e) {
                    StringBuilder A0u4 = AnonymousClass000.A0u();
                    A0u4.append("BackupChangesStore/Partial update error, table = ");
                    A0u4.append(str);
                    A0u4.append(", pkField = ");
                    A0u4.append(str3);
                    C36321k7.A1M(obj, ", pkValue = ", A0u4, e);
                } catch (Throwable th) {
                    try {
                        A04.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } else {
                StringBuilder A0u5 = AnonymousClass000.A0u();
                A0u5.append("BackupChangesStore/Unspecified value for Id field '");
                A0u5.append(str2);
                throw AnonymousClass000.A0c("'", A0u5);
            }
        }
        return;
        throw th;
    }
}
