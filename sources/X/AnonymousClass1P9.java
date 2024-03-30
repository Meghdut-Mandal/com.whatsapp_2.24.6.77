package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1P9  reason: invalid class name */
public class AnonymousClass1P9 {
    public final AnonymousClass1P8 A00;

    public void A05(C63593Kq r7) {
        AnonymousClass1M0 A04 = this.A00.A04();
        try {
            ContentValues contentValues = new ContentValues();
            UserJid userJid = r7.A06;
            contentValues.put("jid", userJid.getRawString());
            contentValues.put("latitude", Double.valueOf(r7.A00));
            contentValues.put("longitude", Double.valueOf(r7.A01));
            contentValues.put("accuracy", Integer.valueOf(r7.A03));
            contentValues.put("speed", Float.valueOf(r7.A02));
            contentValues.put("bearing", Integer.valueOf(r7.A04));
            contentValues.put("location_ts", Long.valueOf(r7.A05));
            A04.A02.A07("location_cache", "saveUserLocation/REPLACE_LOCATION_CACHE", contentValues);
            StringBuilder sb = new StringBuilder();
            sb.append("LocationSharingStore/saveUserLocation/saved user location; jid=");
            sb.append(userJid);
            sb.append("; timestamp=");
            sb.append(r7.A05);
            Log.i(sb.toString());
            A04.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public AnonymousClass1P9(AnonymousClass1P8 r1) {
        this.A00 = r1;
    }

    public static ArrayList A00(AnonymousClass1P9 r9, long j, boolean z) {
        String str;
        Cursor A09;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        try {
            AnonymousClass1M0 A03 = r9.A00.get();
            try {
                C224114e r6 = A03.A02;
                String str2 = C56262w0.A00;
                String[] strArr = new String[2];
                if (z) {
                    str = "1";
                } else {
                    str = "0";
                }
                strArr[0] = str;
                strArr[1] = Long.toString(j);
                A09 = r6.A09(str2, "getAllLocationSharers/QUERY_LOCATION_SHARER", strArr);
                while (A09.moveToNext()) {
                    AnonymousClass11F A02 = AnonymousClass11F.A00.A02(A09.getString(0));
                    C64303Nl r1 = null;
                    if (A02 != null) {
                        r1 = new C64303Nl(A09, A02, UserJid.Companion.A02(A09.getString(2)));
                    }
                    if (r1 != null) {
                        arrayList.add(r1);
                    }
                }
                A09.close();
                A03.close();
                int i = Log.level;
                StringBuilder sb = new StringBuilder();
                sb.append("LocationSharingStore/getAllLocationSharers/returned ");
                sb.append(arrayList.size());
                sb.append(" location sharer; fromMe=");
                sb.append(z);
                sb.append(" | time: ");
                sb.append(System.currentTimeMillis() - currentTimeMillis);
                Log.i(sb.toString());
                return arrayList;
            } catch (Throwable th) {
                A03.close();
                throw th;
            }
            throw th;
        } catch (Exception e) {
            Log.e("LocationSharingStore/getAllLocationSharers/error getting sharers", e);
            throw new RuntimeException(e);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    @Deprecated
    public static void A01(AnonymousClass11F r14, AnonymousClass1P9 r15, Collection collection, boolean z) {
        C1495671s A002;
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            AnonymousClass1M0 A04 = r15.A00.A04();
            try {
                A002 = A04.A00();
                Iterator it = collection.iterator();
                int i = 0;
                while (it.hasNext()) {
                    C224114e r7 = A04.A02;
                    String[] strArr = new String[3];
                    strArr[0] = r14.getRawString();
                    strArr[1] = ((UserJid) it.next()).getRawString();
                    if (z) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    strArr[2] = str;
                    i += r7.A03("location_sharer", "remote_jid = ? AND remote_resource = ? AND from_me = ?", "deleteLocationSharers/DELETE_LOCATION_SHARERS", strArr);
                }
                A002.A00();
                A002.close();
                A04.close();
                StringBuilder sb = new StringBuilder();
                sb.append("LocationSharingStore/deleteLocationSharers/deleted ");
                sb.append(i);
                sb.append(" location sharers | time: ");
                sb.append(System.currentTimeMillis() - currentTimeMillis);
                Log.i(sb.toString());
                return;
            } catch (Throwable th) {
                A04.close();
                throw th;
            }
            throw th;
        } catch (Exception e) {
            Log.e("LocationSharingStore/deleteLocationSharers/delete failed", e);
            throw new RuntimeException(e);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    @Deprecated
    public static void A02(AnonymousClass1P9 r10, long j, boolean z) {
        AnonymousClass1M0 A04;
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            A04 = r10.A00.A04();
            C224114e r7 = A04.A02;
            String[] strArr = new String[3];
            strArr[0] = Long.toString(j);
            strArr[1] = Long.toString(0);
            if (z) {
                str = "1";
            } else {
                str = "0";
            }
            strArr[2] = str;
            int A03 = r7.A03("location_sharer", "expires < ? AND expires > ? AND from_me = ?", "deleteOldLocationSharers/DELETE_LOCATION_SHARER", strArr);
            A04.close();
            StringBuilder sb = new StringBuilder();
            sb.append("LocationSharingStore/deleteOldLocationSharers/deleted ");
            sb.append(A03);
            sb.append(" location sharers | time: ");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            Log.i(sb.toString());
            return;
        } catch (Exception e) {
            Log.e("LocationSharingStore/deleteOldLocationSharers/delete failed", e);
            throw new RuntimeException(e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    @Deprecated
    public static void A03(AnonymousClass1P9 r13, Iterable iterable, boolean z) {
        C1495671s B1k;
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            AnonymousClass1M0 A04 = r13.A00.A04();
            try {
                B1k = A04.B1k();
                Iterator it = iterable.iterator();
                int i = 0;
                while (it.hasNext()) {
                    C224114e r5 = A04.A02;
                    String[] strArr = new String[2];
                    strArr[0] = ((AnonymousClass11F) it.next()).getRawString();
                    if (z) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    strArr[1] = str;
                    i += r5.A03("location_sharer", "remote_jid = ? AND from_me = ?", "deleteLocationSharers/DELETE_LOCATION_SHARER", strArr);
                }
                B1k.A00();
                B1k.close();
                A04.close();
                StringBuilder sb = new StringBuilder();
                sb.append("LocationSharingStore/deleteLocationSharers/deleted ");
                sb.append(i);
                sb.append(" location sharers | time: ");
                sb.append(System.currentTimeMillis() - currentTimeMillis);
                Log.i(sb.toString());
                return;
            } catch (Throwable th) {
                A04.close();
                throw th;
            }
            throw th;
        } catch (Exception e) {
            Log.e("LocationSharingStore/deleteLocationSharers/delete failed", e);
            throw new RuntimeException(e);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    @Deprecated
    public HashSet A04() {
        Cursor A09;
        long currentTimeMillis = System.currentTimeMillis();
        HashSet hashSet = new HashSet();
        try {
            AnonymousClass1M0 A03 = this.A00.get();
            try {
                A09 = A03.A02.A09("SELECT jid FROM location_key_distribution WHERE sent_to_server = ?", "getAllLocationReceiverHasKey/QUERY_LOCATION_KEY_DISTRIBUTION", new String[]{"1"});
                int columnIndexOrThrow = A09.getColumnIndexOrThrow("jid");
                while (A09.moveToNext()) {
                    UserJid A02 = UserJid.Companion.A02(A09.getString(columnIndexOrThrow));
                    if (A02 != null) {
                        hashSet.add(A02);
                    }
                }
                A09.close();
                A03.close();
                int i = Log.level;
                StringBuilder sb = new StringBuilder();
                sb.append("LocationSharingStore/getAllLocationReceiverHasKey/returned ");
                sb.append(hashSet.size());
                sb.append(" location receivers has key | time: ");
                sb.append(System.currentTimeMillis() - currentTimeMillis);
                Log.i(sb.toString());
                return hashSet;
            } catch (Throwable th) {
                A03.close();
                throw th;
            }
            throw th;
        } catch (Exception e) {
            Log.e("LocationSharingStore/getAllLocationReceiverHasKey/error reading database", e);
            throw new RuntimeException(e);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    @Deprecated
    public void A06(Collection collection) {
        C1495671s A002;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            AnonymousClass1M0 A04 = this.A00.A04();
            try {
                A002 = A04.A00();
                Iterator it = collection.iterator();
                int i = 0;
                while (it.hasNext()) {
                    i += A04.A02.A03("location_cache", "jid = ?", "deleteUserLocations/DELETE_LOCATION_CACHE", new String[]{((UserJid) it.next()).getRawString()});
                }
                A002.A00();
                A002.close();
                A04.close();
                StringBuilder sb = new StringBuilder();
                sb.append("LocationSharingStore/deleteUserLocations/deleted ");
                sb.append(i);
                sb.append(" location sharers | time: ");
                sb.append(System.currentTimeMillis() - currentTimeMillis);
                Log.i(sb.toString());
                return;
            } catch (Throwable th) {
                A04.close();
                throw th;
            }
            throw th;
        } catch (Exception e) {
            Log.e("LocationSharingStore/deleteUserLocations/delete failed", e);
            throw new RuntimeException(e);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    @Deprecated
    public void A07(Collection collection, long j) {
        C1495671s A002;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            AnonymousClass1M0 A04 = this.A00.A04();
            try {
                A002 = A04.A00();
                Iterator it = collection.iterator();
                int i = 0;
                while (it.hasNext()) {
                    AnonymousClass38X r8 = (AnonymousClass38X) it.next();
                    for (UserJid rawString : r8.A03) {
                        ContentValues contentValues = new ContentValues();
                        C64933Qa r9 = r8.A02;
                        AnonymousClass11F r0 = r9.A00;
                        C18740tg.A06(r0);
                        contentValues.put("remote_jid", r0.getRawString());
                        contentValues.put("from_me", true);
                        contentValues.put("remote_resource", rawString.getRawString());
                        contentValues.put("expires", Long.valueOf(Math.min(r8.A01, j)));
                        contentValues.put("message_id", r9.A01);
                        int i2 = 0;
                        if (A04.A02.A07("location_sharer", "updateSharingExpire/REPLACE_LOCATION_SHARER", contentValues) >= 0) {
                            i2 = 1;
                        }
                        i += i2;
                    }
                }
                A002.A00();
                A002.close();
                A04.close();
                StringBuilder sb = new StringBuilder();
                sb.append("LocationSharingStore/updateSharingExpire/update ");
                sb.append(i);
                sb.append(" location sharers | time: ");
                sb.append(System.currentTimeMillis() - currentTimeMillis);
                Log.i(sb.toString());
                return;
            } catch (Throwable th) {
                A04.close();
                throw th;
            }
            throw th;
        } catch (Exception e) {
            Log.e("LocationSharingStore/updateSharingExpire/save failed", e);
            throw new RuntimeException(e);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public void A08(List list) {
        C1495671s A002;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            AnonymousClass1M0 A04 = this.A00.A04();
            try {
                A002 = A04.A00();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C64303Nl r6 = (C64303Nl) it.next();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("remote_jid", r6.A01.getRawString());
                    UserJid userJid = r6.A02;
                    String str = null;
                    if (userJid != null) {
                        str = userJid.getRawString();
                    }
                    contentValues.put("remote_resource", str);
                    C64933Qa r4 = r6.A03;
                    contentValues.put("from_me", Boolean.valueOf(r4.A02));
                    contentValues.put("expires", Long.valueOf(r6.A00));
                    contentValues.put("message_id", r4.A01);
                    A04.A02.A07("location_sharer", "saveLocationSharer/REPLACE_LOCATION_SHARER", contentValues);
                }
                A002.A00();
                A002.close();
                A04.close();
                StringBuilder sb = new StringBuilder();
                sb.append("LocationSharingStore/saveLocationSharer/saved ");
                sb.append(list.size());
                sb.append(" location sharers | time: ");
                sb.append(System.currentTimeMillis() - currentTimeMillis);
                Log.i(sb.toString());
                return;
            } catch (Throwable th) {
                A04.close();
                throw th;
            }
            throw th;
        } catch (Exception e) {
            Log.e("LocationSharingStore/saveLocationSharer/save failed", e);
            throw new RuntimeException(e);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public void A09(List list, boolean z) {
        C1495671s B1k;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            AnonymousClass1M0 A04 = this.A00.A04();
            try {
                B1k = A04.B1k();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("jid", ((UserJid) it.next()).getRawString());
                    contentValues.put("sent_to_server", Boolean.valueOf(z));
                    A04.A02.A07("location_key_distribution", "storeLocationReceiverHasKey/REPLACE_LOCATION_KEY_DISTRIBUTION", contentValues);
                }
                B1k.A00();
                B1k.close();
                A04.close();
                StringBuilder sb = new StringBuilder();
                sb.append("LocationSharingStore/storeLocationReceiverHasKey/saved ");
                sb.append(list.size());
                sb.append(" location receiver has key: ");
                sb.append(z);
                sb.append(" | time: ");
                sb.append(System.currentTimeMillis() - currentTimeMillis);
                Log.i(sb.toString());
                return;
            } catch (Throwable th) {
                A04.close();
                throw th;
            }
            throw th;
        } catch (Exception e) {
            Log.e("LocationSharingStore/storeLocationReceiverHasKey/save failed", e);
            throw new RuntimeException(e);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }
}
