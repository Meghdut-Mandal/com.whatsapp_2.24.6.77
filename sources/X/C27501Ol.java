package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1Ol  reason: invalid class name and case insensitive filesystem */
public class C27501Ol {
    public final C19730wQ A00;
    public final C229216m A01;
    public final C21060yb A02;
    public final C19420v0 A03;
    public final C18820ts A04;
    public final C19890wg A05;
    public final C19770wU A06;

    public static synchronized void A01(Account account, Context context, C27501Ol r15) {
        synchronized (r15) {
            Uri build = ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("account_name", account.name).appendQueryParameter("account_type", account.type).appendQueryParameter("caller_is_syncadapter", "true").build();
            Uri build2 = ContactsContract.Data.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").build();
            ArrayList arrayList = new ArrayList();
            C21060yb r3 = r15.A02;
            Cursor A032 = r3.A0O().A03(build, new String[]{"_id", "sync1", "sync2", "display_name"}, (String) null, (String[]) null, (String) null);
            if (A032 != null) {
                try {
                    int columnIndexOrThrow = A032.getColumnIndexOrThrow("_id");
                    int columnIndexOrThrow2 = A032.getColumnIndexOrThrow("sync1");
                    int columnIndexOrThrow3 = A032.getColumnIndexOrThrow("display_name");
                    while (A032.moveToNext()) {
                        UserJid A022 = UserJid.Companion.A02(A032.getString(columnIndexOrThrow2));
                        if (A022 != null) {
                            arrayList.add(new C1259762b(A022, A032.getString(columnIndexOrThrow3), A032.getLong(columnIndexOrThrow)));
                        }
                    }
                    A032.close();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C1259762b r5 = (C1259762b) it.next();
                if (arrayList2.size() >= 100) {
                    A02(r3.A0O(), "error updating contact data action strings", arrayList2);
                }
                String A0H = r15.A04.A0H(AnonymousClass3U8.A01(C203559oI.A00(), r5.A00.user));
                String valueOf = String.valueOf(r5.A02);
                arrayList2.add(ContentProviderOperation.newUpdate(build2).withSelection("raw_contact_id=? and mimetype=?", new String[]{valueOf, "vnd.android.cursor.item/vnd.com.whatsapp.profile"}).withValue("data3", context.getString(R.string.f12nameremoved, new Object[]{A0H})).withYieldAllowed(true).build());
                arrayList2.add(ContentProviderOperation.newUpdate(build2).withSelection("raw_contact_id=? and mimetype=?", new String[]{valueOf, "vnd.android.cursor.item/vnd.com.whatsapp.voip.call"}).withValue("data3", context.getString(R.string.f12nameremoved, new Object[]{A0H})).build());
                arrayList2.add(ContentProviderOperation.newUpdate(build2).withSelection("raw_contact_id=? and mimetype=?", new String[]{valueOf, "vnd.android.cursor.item/vnd.com.whatsapp.video.call"}).withValue("data3", context.getString(R.string.f12nameremoved, new Object[]{A0H})).build());
            }
            if (!arrayList2.isEmpty()) {
                A02(r3.A0O(), "error updating contact data action strings", arrayList2);
            }
        }
        return;
        throw th;
    }

    private Account A00(AccountManager accountManager, Context context) {
        C19730wQ r0 = this.A00;
        r0.A0G();
        if (r0.A03 == null) {
            Log.e("androidcontactssync/get-or-create-account null jid");
            return null;
        }
        Account account = new Account(context.getString(R.string.f12nameremoved), "com.whatsapp");
        if (accountManager.addAccountExplicitly(account, (String) null, (Bundle) null)) {
            ContentResolver.setIsSyncable(account, "com.android.contacts", 1);
            return account;
        }
        Log.e("androidcontactssync/get-or-create-account failed to add account");
        return null;
    }

    public static boolean A02(C21050ya r2, String str, ArrayList arrayList) {
        boolean z;
        try {
            AnonymousClass00C.A08(C21050ya.A00(r2).applyBatch("com.android.contacts", arrayList));
            z = true;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("androidcontactssync/");
            sb.append(str);
            Log.e(sb.toString(), e);
            z = false;
        } catch (Throwable th) {
            arrayList.clear();
            throw th;
        }
        arrayList.clear();
        return z;
    }

    public Account A03(Context context) {
        Account account;
        AccountManager accountManager = AccountManager.get(context);
        Account[] accountsByType = accountManager.getAccountsByType("com.whatsapp");
        if (accountsByType.length == 0) {
            account = A00(accountManager, context);
            if (account == null) {
                return null;
            }
        } else {
            account = accountsByType[0];
            if (!TextUtils.equals(context.getString(R.string.f12nameremoved), account.name)) {
                accountManager.removeAccount(account, (AccountManagerCallback) null, (Handler) null);
                account = A00(accountManager, context);
                if (account == null) {
                    return null;
                }
            }
        }
        try {
            if (!ContentResolver.getSyncAutomatically(account, "com.android.contacts")) {
                ContentResolver.setSyncAutomatically(account, "com.android.contacts", true);
            }
            ContentResolver.addPeriodicSync(account, "com.android.contacts", new Bundle(), 3600);
            return account;
        } catch (NullPointerException e) {
            if (e.getMessage() != null && e.getMessage().startsWith("Attempt to invoke virtual method 'com.prism.gaia")) {
                return account;
            }
            throw e;
        }
    }

    public C27501Ol(C19730wQ r1, C229216m r2, C21060yb r3, C19420v0 r4, C18820ts r5, C19890wg r6, C19770wU r7) {
        this.A00 = r1;
        this.A06 = r7;
        this.A02 = r3;
        this.A04 = r5;
        this.A01 = r2;
        this.A03 = r4;
        this.A05 = r6;
    }
}
